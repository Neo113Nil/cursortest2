package com.just.agentweb.filechooser;

import android.app.Activity;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import cn.hutool.core.util.g1;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;
import com.just.agentweb.AbsAgentWebUIController;
import com.just.agentweb.Action;
import com.just.agentweb.AgentActionFragment;
import com.just.agentweb.AgentWebConfig;
import com.just.agentweb.AgentWebPermissions;
import com.just.agentweb.AgentWebUtils;
import com.just.agentweb.PermissionInterceptor;
import com.yanzhenjie.kalle.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class FileChooser {
    public static int MAX_WAIT_PHOTO_MS = 8000;
    public static final int REQUEST_CODE = 596;
    private static final String TAG = "FileChooser";
    private String mAcceptType;
    private final Activity mActivity;
    private WeakReference<AbsAgentWebUIController> mAgentWebUIController;
    private final WebChromeClient.FileChooserParams mFileChooserParams;
    private boolean mJsChannel;
    private JsChannelCallback mJsChannelCallback;
    private final PermissionInterceptor mPermissionInterceptor;
    private ValueCallback<Uri> mUriValueCallback;
    private ValueCallback<Uri[]> mUriValueCallbacks;
    private final WebView mWebView;
    private boolean mCameraState = false;
    private boolean mVideoState = false;
    private final int FROM_INTENTION_CODE = 21;
    private AgentActionFragment.PermissionListener mPermissionListener = new AgentActionFragment.PermissionListener() { // from class: com.just.agentweb.filechooser.FileChooser.4
        @Override // com.just.agentweb.AgentActionFragment.PermissionListener
        public void onRequestPermissionsResult(@NonNull String[] strArr, @NonNull int[] iArr, Bundle bundle) {
            FileChooser.this.permissionResult(AgentWebUtils.hasPermission(FileChooser.this.mActivity, (List<String>) Arrays.asList(strArr)), bundle.getInt(AgentActionFragment.KEY_FROM_INTENTION));
        }
    };

    private static final class AboveLCallback implements Handler.Callback {
        private WeakReference<AbsAgentWebUIController> controller;
        private Uri[] mUris;
        private ValueCallback<Uri[]> mValueCallback;

        /* JADX INFO: Access modifiers changed from: private */
        public void safeHandleMessage(Message message) {
            ValueCallback<Uri[]> valueCallback = this.mValueCallback;
            if (valueCallback != null) {
                FileChooser.fileCompressAndValuesCallback(this.mUris, valueCallback);
            }
            WeakReference<AbsAgentWebUIController> weakReference = this.controller;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.controller.get().onCancelLoading();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(final Message message) {
            AgentWebUtils.runInUiThread(new Runnable() { // from class: com.just.agentweb.filechooser.FileChooser.AboveLCallback.1
                @Override // java.lang.Runnable
                public void run() {
                    AboveLCallback.this.safeHandleMessage(message);
                }
            });
            return false;
        }

        private AboveLCallback(ValueCallback<Uri[]> valueCallback, Uri[] uriArr, WeakReference<AbsAgentWebUIController> weakReference) {
            this.mValueCallback = valueCallback;
            this.mUris = uriArr;
            this.controller = weakReference;
        }
    }

    public static final class Builder {
        private Activity mActivity;
        private WebChromeClient.FileChooserParams mFileChooserParams;
        private Handler.Callback mJsChannelCallback;
        private PermissionInterceptor mPermissionInterceptor;
        private ValueCallback<Uri> mUriValueCallback;
        private ValueCallback<Uri[]> mUriValueCallbacks;
        private WebView mWebView;
        private boolean mJsChannel = false;
        private String mAcceptType = i.VALUE_ACCEPT_ALL;

        public FileChooser build() {
            return new FileChooser(this);
        }

        public Builder setAcceptType(String str) {
            this.mAcceptType = str;
            return this;
        }

        public Builder setActivity(Activity activity) {
            this.mActivity = activity;
            return this;
        }

        public Builder setFileChooserParams(WebChromeClient.FileChooserParams fileChooserParams) {
            this.mFileChooserParams = fileChooserParams;
            return this;
        }

        public Builder setJsChannelCallback(Handler.Callback callback) {
            this.mJsChannelCallback = callback;
            this.mJsChannel = true;
            this.mUriValueCallback = null;
            this.mUriValueCallbacks = null;
            return this;
        }

        public Builder setPermissionInterceptor(PermissionInterceptor permissionInterceptor) {
            this.mPermissionInterceptor = permissionInterceptor;
            return this;
        }

        public Builder setUriValueCallback(ValueCallback<Uri> valueCallback) {
            this.mUriValueCallback = valueCallback;
            this.mJsChannel = false;
            this.mUriValueCallbacks = null;
            return this;
        }

        public Builder setUriValueCallbacks(ValueCallback<Uri[]> valueCallback) {
            this.mUriValueCallbacks = valueCallback;
            this.mUriValueCallback = null;
            this.mJsChannel = false;
            return this;
        }

        public Builder setWebView(WebView webView) {
            this.mWebView = webView;
            return this;
        }
    }

    static class CovertFileThread implements Runnable {
        private WeakReference<JsChannelCallback> mJsChannelCallback;
        private String[] paths;

        @Override // java.lang.Runnable
        public void run() {
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("agentweb-thread");
            try {
                try {
                    String convertFileParcelObjectsToJson = FileChooser.convertFileParcelObjectsToJson(FileChooser.convertFile(this.paths));
                    WeakReference<JsChannelCallback> weakReference = this.mJsChannelCallback;
                    if (weakReference != null && weakReference.get() != null) {
                        this.mJsChannelCallback.get().call(convertFileParcelObjectsToJson);
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            } finally {
                Thread.currentThread().setName(name);
            }
        }

        private CovertFileThread(JsChannelCallback jsChannelCallback, String[] strArr) {
            this.mJsChannelCallback = new WeakReference<>(jsChannelCallback);
            this.paths = strArr;
        }
    }

    static class EncodeFileRunnable implements Runnable {
        private String filePath;
        private int id;
        private CountDownLatch mCountDownLatch;
        private Queue<FileParcel> mQueue;

        public EncodeFileRunnable(String str, Queue<FileParcel> queue, CountDownLatch countDownLatch, int i8) {
            this.filePath = str;
            this.mQueue = queue;
            this.mCountDownLatch = countDownLatch;
            this.id = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            FileInputStream fileInputStream;
            ByteArrayOutputStream byteArrayOutputStream;
            Throwable th;
            FileInputStream fileInputStream2 = null;
            try {
                File file = new File(this.filePath);
                Log.e(FileChooser.TAG, "encode file:" + file.length());
                if (file.exists()) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayOutputStream = null;
                        th = th;
                        try {
                            th.printStackTrace();
                            AgentWebUtils.closeIO(fileInputStream);
                            AgentWebUtils.closeIO(byteArrayOutputStream);
                            this.mCountDownLatch.countDown();
                        } catch (Throwable th3) {
                            AgentWebUtils.closeIO(fileInputStream);
                            AgentWebUtils.closeIO(byteArrayOutputStream);
                            this.mCountDownLatch.countDown();
                            throw th3;
                        }
                    }
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = fileInputStream.read(bArr, 0, 1024);
                            if (read == -1) {
                                break;
                            } else {
                                byteArrayOutputStream.write(bArr, 0, read);
                            }
                        }
                        this.mQueue.offer(new FileParcel(this.id, file.getAbsolutePath(), Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0)));
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th4) {
                        th = th4;
                        th.printStackTrace();
                        AgentWebUtils.closeIO(fileInputStream);
                        AgentWebUtils.closeIO(byteArrayOutputStream);
                        this.mCountDownLatch.countDown();
                    }
                } else {
                    byteArrayOutputStream = null;
                }
                AgentWebUtils.closeIO(fileInputStream2);
            } catch (Throwable th5) {
                th = th5;
                fileInputStream = null;
                byteArrayOutputStream = null;
            }
            AgentWebUtils.closeIO(byteArrayOutputStream);
            this.mCountDownLatch.countDown();
        }
    }

    static class JsChannelCallback {
        WeakReference<Handler.Callback> callback;

        JsChannelCallback(Handler.Callback callback) {
            this.callback = null;
            this.callback = new WeakReference<>(callback);
        }

        public static JsChannelCallback create(Handler.Callback callback) {
            return new JsChannelCallback(callback);
        }

        void call(String str) {
            WeakReference<Handler.Callback> weakReference = this.callback;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.callback.get().handleMessage(Message.obtain(null, 2077613503, str));
        }
    }

    private static final class WaitPhotoRunnable implements Runnable {
        private Handler.Callback mCallback;
        private String path;

        @Override // java.lang.Runnable
        public void run() {
            Handler.Callback callback;
            if (TextUtils.isEmpty(this.path) || !new File(this.path).exists()) {
                Handler.Callback callback2 = this.mCallback;
                if (callback2 != null) {
                    callback2.handleMessage(Message.obtain((Handler) null, -1));
                    return;
                }
                return;
            }
            int i8 = 0;
            while (true) {
                if (i8 > FileChooser.MAX_WAIT_PHOTO_MS) {
                    break;
                }
                i8 += 300;
                SystemClock.sleep(300L);
                if (new File(this.path).length() > 0) {
                    Handler.Callback callback3 = this.mCallback;
                    if (callback3 != null) {
                        callback3.handleMessage(Message.obtain((Handler) null, 1));
                        this.mCallback = null;
                    }
                }
            }
            if (i8 > FileChooser.MAX_WAIT_PHOTO_MS && (callback = this.mCallback) != null) {
                callback.handleMessage(Message.obtain((Handler) null, -1));
            }
            this.mCallback = null;
            this.path = null;
        }

        private WaitPhotoRunnable(String str, Handler.Callback callback) {
            this.path = str;
            this.mCallback = callback;
        }
    }

    public FileChooser(Builder builder) {
        this.mJsChannel = false;
        this.mAgentWebUIController = null;
        this.mAcceptType = i.VALUE_ACCEPT_ALL;
        this.mActivity = builder.mActivity;
        this.mUriValueCallback = builder.mUriValueCallback;
        this.mUriValueCallbacks = builder.mUriValueCallbacks;
        this.mJsChannel = builder.mJsChannel;
        this.mFileChooserParams = builder.mFileChooserParams;
        if (this.mJsChannel) {
            this.mJsChannelCallback = JsChannelCallback.create(builder.mJsChannelCallback);
        }
        WebView webView = builder.mWebView;
        this.mWebView = webView;
        this.mPermissionInterceptor = builder.mPermissionInterceptor;
        this.mAcceptType = builder.mAcceptType;
        this.mAgentWebUIController = new WeakReference<>(AgentWebUtils.getAgentWebUIControllerByWebView(webView));
    }

    private void aboveLollipopCheckFilesAndCallback(Uri[] uriArr, boolean z7) {
        if (this.mUriValueCallbacks == null) {
            return;
        }
        if (uriArr != null && uriArr.length > 0) {
            ContentResolver contentResolver = this.mActivity.getContentResolver();
            for (Uri uri : uriArr) {
                try {
                    contentResolver.takePersistableUriPermission(uri, 3);
                } catch (Throwable th) {
                    if (AgentWebConfig.DEBUG) {
                        th.printStackTrace();
                    }
                }
            }
        }
        if (!z7) {
            if (uriArr == null) {
                uriArr = new Uri[0];
            }
            fileCompressAndValuesCallback(uriArr, this.mUriValueCallbacks);
            this.mUriValueCallbacks = null;
            return;
        }
        if (this.mAgentWebUIController.get() == null) {
            this.mUriValueCallbacks.onReceiveValue(null);
            this.mUriValueCallbacks = null;
            return;
        }
        String[] uriToPath = AgentWebUtils.uriToPath(this.mActivity, uriArr);
        if (uriToPath == null || uriToPath.length == 0) {
            this.mUriValueCallbacks.onReceiveValue(null);
            this.mUriValueCallbacks = null;
        } else {
            String str = uriToPath[0];
            this.mAgentWebUIController.get().onLoading(this.mActivity.getString(com.just.agentweb.R.string.agentweb_loading));
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new WaitPhotoRunnable(str, new AboveLCallback(this.mUriValueCallbacks, uriArr, this.mAgentWebUIController)));
            this.mUriValueCallbacks = null;
        }
    }

    private void belowLollipopUriCallback(Intent intent) {
        if (intent == null) {
            ValueCallback<Uri> valueCallback = this.mUriValueCallback;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(Uri.EMPTY);
                this.mUriValueCallback = null;
                return;
            }
            return;
        }
        Uri data = intent.getData();
        ValueCallback<Uri> valueCallback2 = this.mUriValueCallback;
        if (valueCallback2 != null) {
            fileCompressAndValuesCallback(data, valueCallback2);
            this.mUriValueCallback = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancel() {
        if (this.mJsChannel) {
            this.mJsChannelCallback.call(null);
            return;
        }
        ValueCallback<Uri> valueCallback = this.mUriValueCallback;
        if (valueCallback != null) {
            try {
                valueCallback.onReceiveValue(null);
                this.mUriValueCallback = null;
            } catch (Throwable th) {
                if (AgentWebConfig.DEBUG) {
                    th.printStackTrace();
                }
            }
        }
        ValueCallback<Uri[]> valueCallback2 = this.mUriValueCallbacks;
        if (valueCallback2 != null) {
            try {
                valueCallback2.onReceiveValue(null);
                this.mUriValueCallbacks = null;
            } catch (Throwable th2) {
                if (AgentWebConfig.DEBUG) {
                    th2.printStackTrace();
                }
            }
        }
    }

    private List<String> checkNeedPermission() {
        ArrayList arrayList = new ArrayList();
        if (!AgentWebUtils.hasPermission(this.mActivity, AgentWebPermissions.CAMERA)) {
            arrayList.add(AgentWebPermissions.CAMERA[0]);
        }
        if (!AgentWebUtils.hasPermission(this.mActivity, AgentWebPermissions.MEDIA)) {
            arrayList.addAll(Arrays.asList(AgentWebPermissions.MEDIA));
        }
        return arrayList;
    }

    private void chooserAction() {
        Action action = new Action();
        action.setAction(2);
        action.setChooserListener(getChooserListener());
        try {
            action.setIntent(getFileChooserIntent());
            AgentActionFragment.start(this.mActivity, action);
        } catch (Throwable th) {
            if (AgentWebConfig.DEBUG) {
                th.printStackTrace();
            }
        }
    }

    public static Queue<FileParcel> convertFile(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        int i8 = 1;
        int availableProcessors = Runtime.getRuntime().availableProcessors() + 1;
        if (strArr.length <= availableProcessors) {
            availableProcessors = strArr.length;
        }
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(availableProcessors);
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        CountDownLatch countDownLatch = new CountDownLatch(strArr.length);
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                countDownLatch.countDown();
            } else {
                newFixedThreadPool.execute(new EncodeFileRunnable(str, linkedBlockingQueue, countDownLatch, i8));
                i8++;
            }
        }
        countDownLatch.await();
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) newFixedThreadPool;
        if (!threadPoolExecutor.isShutdown()) {
            threadPoolExecutor.shutdownNow();
        }
        return linkedBlockingQueue;
    }

    private void convertFileAndCallback(Uri[] uriArr) {
        String[] uriToPath;
        if (uriArr == null || uriArr.length == 0 || (uriToPath = AgentWebUtils.uriToPath(this.mActivity, uriArr)) == null || uriToPath.length == 0) {
            this.mJsChannelCallback.call(null);
        } else {
            FileCompressor.getInstance().fileCompress("customize", uriArr, new ValueCallback<Uri[]>() { // from class: com.just.agentweb.filechooser.FileChooser.5
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Uri[] uriArr2) {
                    String[] uriToPath2 = AgentWebUtils.uriToPath(FileChooser.this.mActivity, uriArr2);
                    if (uriToPath2 == null || uriToPath2.length == 0) {
                        FileChooser.this.mJsChannelCallback.call(null);
                        return;
                    }
                    int i8 = 0;
                    for (String str : uriToPath2) {
                        if (!TextUtils.isEmpty(str)) {
                            File file = new File(str);
                            if (file.exists()) {
                                i8 = (int) (i8 + file.length());
                            }
                        }
                    }
                    if (i8 <= AgentWebConfig.MAX_FILE_LENGTH) {
                        AsyncTask.THREAD_POOL_EXECUTOR.execute(new CovertFileThread(FileChooser.this.mJsChannelCallback, uriToPath2));
                        return;
                    }
                    if (FileChooser.this.mAgentWebUIController.get() != null) {
                        ((AbsAgentWebUIController) FileChooser.this.mAgentWebUIController.get()).onShowMessage(FileChooser.this.mActivity.getString(com.just.agentweb.R.string.agentweb_max_file_length_limit, ((AgentWebConfig.MAX_FILE_LENGTH / 1024) / 1024) + ""), "convertFileAndCallback");
                    }
                    FileChooser.this.mJsChannelCallback.call(null);
                }
            });
        }
    }

    static String convertFileParcelObjectsToJson(Collection<FileParcel> collection) {
        if (collection == null || collection.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (FileParcel fileParcel : collection) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("contentPath", fileParcel.getContentPath());
                jSONObject.put("fileBase64", fileParcel.getFileBase64());
                jSONObject.put("mId", fileParcel.getId());
                jSONArray.put(jSONObject);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return jSONArray + "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fileChooser() {
        if (AgentWebUtils.getDeniedPermissions(this.mActivity, AgentWebPermissions.MEDIA).isEmpty()) {
            chooserAction();
            return;
        }
        Action createPermissionsAction = Action.createPermissionsAction(AgentWebPermissions.MEDIA);
        createPermissionsAction.setFromIntention(5);
        createPermissionsAction.setPermissionListener(this.mPermissionListener);
        AgentActionFragment.start(this.mActivity, createPermissionsAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fileCompressAndValuesCallback(Uri[] uriArr, final ValueCallback<Uri[]> valueCallback) {
        FileCompressor.getInstance().fileCompress("system", uriArr, new ValueCallback<Uri[]>() { // from class: com.just.agentweb.filechooser.FileChooser.6
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Uri[] uriArr2) {
                ValueCallback valueCallback2 = valueCallback;
                if (valueCallback2 != null) {
                    valueCallback2.onReceiveValue(uriArr2);
                }
            }
        });
    }

    private Handler.Callback getCallBack() {
        return new Handler.Callback() { // from class: com.just.agentweb.filechooser.FileChooser.3
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i8 = message.what;
                if (i8 == 0) {
                    FileChooser.this.mCameraState = true;
                    FileChooser.this.onCameraAction();
                } else if (i8 != 1) {
                    FileChooser.this.cancel();
                } else {
                    FileChooser.this.mCameraState = false;
                    FileChooser.this.fileChooser();
                }
                return true;
            }
        };
    }

    private AgentActionFragment.ChooserListener getChooserListener() {
        return new AgentActionFragment.ChooserListener() { // from class: com.just.agentweb.filechooser.FileChooser.2
            @Override // com.just.agentweb.AgentActionFragment.ChooserListener
            public void onChoiceResult(int i8, int i9, Intent intent) {
                FileChooser.this.onIntentResult(i8, i9, intent);
            }
        };
    }

    private Intent getFileChooserIntent() {
        Intent createIntent;
        WebChromeClient.FileChooserParams fileChooserParams = this.mFileChooserParams;
        if (fileChooserParams == null || (createIntent = fileChooserParams.createIntent()) == null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.OPEN_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            if (TextUtils.isEmpty(this.mAcceptType)) {
                intent.setType(i.VALUE_ACCEPT_ALL);
            } else {
                intent.setType(this.mAcceptType);
            }
            intent.addFlags(1);
            return Intent.createChooser(intent, "");
        }
        if (this.mFileChooserParams.getMode() == 1) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        if (this.mFileChooserParams.getAcceptTypes() != null && this.mFileChooserParams.getAcceptTypes().length > 1) {
            createIntent.putExtra("android.intent.extra.MIME_TYPES", this.mFileChooserParams.getAcceptTypes());
        }
        if (Objects.equals(createIntent.getAction(), "android.intent.action.GET_CONTENT")) {
            createIntent.setAction("android.intent.action.OPEN_DOCUMENT");
        }
        return createIntent;
    }

    public static Builder newBuilder(Activity activity, WebView webView) {
        return new Builder().setActivity(activity).setWebView(webView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCameraAction() {
        if (this.mActivity == null) {
            return;
        }
        PermissionInterceptor permissionInterceptor = this.mPermissionInterceptor;
        if (permissionInterceptor != null && permissionInterceptor.intercept(this.mWebView.getUrl(), AgentWebPermissions.CAMERA, PixelReadParams.DEFAULT_FILTER_ID)) {
            cancel();
            return;
        }
        Action action = new Action();
        if (Build.VERSION.SDK_INT >= 23) {
            List<String> checkNeedPermission = checkNeedPermission();
            if (!checkNeedPermission.isEmpty()) {
                action.setAction(1);
                action.setPermissions((String[]) checkNeedPermission.toArray(new String[0]));
                action.setFromIntention(2);
                action.setPermissionListener(this.mPermissionListener);
                AgentActionFragment.start(this.mActivity, action);
                return;
            }
        }
        openCameraAction();
    }

    private void openCameraAction() {
        Action action = new Action();
        if (this.mVideoState) {
            action.setAction(4);
        } else {
            action.setAction(3);
        }
        action.setChooserListener(getChooserListener());
        AgentActionFragment.start(this.mActivity, action);
    }

    private void openFileChooserInternal() {
        WebChromeClient.FileChooserParams fileChooserParams = this.mFileChooserParams;
        if (fileChooserParams != null && fileChooserParams.getAcceptTypes() != null) {
            String[] acceptTypes = this.mFileChooserParams.getAcceptTypes();
            int length = acceptTypes.length;
            int i8 = 0;
            boolean z7 = false;
            while (true) {
                if (i8 < length) {
                    String str = acceptTypes[i8];
                    if (!TextUtils.isEmpty(str)) {
                        if (str.contains(g1.WAR_URL_SEPARATOR) || str.contains("image/")) {
                            break;
                        } else if (str.contains("video/")) {
                            z7 = true;
                            this.mVideoState = true;
                        }
                    }
                    i8++;
                } else if (!z7) {
                    chooserAction();
                    return;
                }
            }
        }
        if (!TextUtils.isEmpty(this.mAcceptType) && !this.mAcceptType.contains(g1.WAR_URL_SEPARATOR) && !this.mAcceptType.contains("image/")) {
            chooserAction();
        } else if (this.mAgentWebUIController.get() != null) {
            AbsAgentWebUIController absAgentWebUIController = this.mAgentWebUIController.get();
            WebView webView = this.mWebView;
            absAgentWebUIController.onSelectItemsPrompt(webView, webView.getUrl(), new String[]{this.mActivity.getString(com.just.agentweb.R.string.agentweb_camera), this.mActivity.getString(com.just.agentweb.R.string.agentweb_file_chooser)}, getCallBack());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void permissionResult(boolean z7, int i8) {
        if (i8 == 5) {
            if (z7) {
                chooserAction();
                return;
            }
            cancel();
            if (this.mAgentWebUIController.get() != null) {
                this.mAgentWebUIController.get().onPermissionsDeny(AgentWebPermissions.MEDIA, AgentWebPermissions.ACTION_MEDIA, "Open file chooser");
                return;
            }
            return;
        }
        if (i8 == 2) {
            if (z7) {
                openCameraAction();
                return;
            }
            cancel();
            if (this.mAgentWebUIController.get() != null) {
                this.mAgentWebUIController.get().onPermissionsDeny(AgentWebPermissions.CAMERA, AgentWebPermissions.ACTION_CAMERA, "Take photo");
            }
        }
    }

    private Uri[] processData(Intent intent) {
        Uri[] uriArr = null;
        if (intent == null) {
            return null;
        }
        String dataString = intent.getDataString();
        if (!TextUtils.isEmpty(dataString)) {
            return new Uri[]{Uri.parse(dataString)};
        }
        ClipData clipData = intent.getClipData();
        if (clipData != null && clipData.getItemCount() > 0) {
            uriArr = new Uri[clipData.getItemCount()];
            for (int i8 = 0; i8 < clipData.getItemCount(); i8++) {
                uriArr[i8] = clipData.getItemAt(i8).getUri();
            }
        }
        return uriArr;
    }

    public void onIntentResult(int i8, int i9, Intent intent) {
        if (596 != i8) {
            return;
        }
        if (i9 == 0 || intent == null) {
            cancel();
            return;
        }
        if (i9 != -1) {
            cancel();
        } else if (this.mJsChannel) {
            convertFileAndCallback(this.mCameraState ? new Uri[]{(Uri) intent.getParcelableExtra(AgentActionFragment.KEY_URI)} : processData(intent));
        } else {
            aboveLollipopCheckFilesAndCallback(this.mCameraState ? new Uri[]{(Uri) intent.getParcelableExtra(AgentActionFragment.KEY_URI)} : processData(intent), this.mCameraState);
        }
    }

    public void openFileChooser() {
        if (AgentWebUtils.isUIThread()) {
            openFileChooserInternal();
        } else {
            AgentWebUtils.runInUiThread(new Runnable() { // from class: com.just.agentweb.filechooser.FileChooser.1
                @Override // java.lang.Runnable
                public void run() {
                    FileChooser.this.openFileChooser();
                }
            });
        }
    }

    private static void fileCompressAndValuesCallback(Uri uri, final ValueCallback<Uri> valueCallback) {
        FileCompressor.getInstance().fileCompress("system", new Uri[]{uri}, new ValueCallback<Uri[]>() { // from class: com.just.agentweb.filechooser.FileChooser.7
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Uri[] uriArr) {
                ValueCallback valueCallback2 = valueCallback;
                if (valueCallback2 != null) {
                    if (uriArr == null || uriArr.length <= 0) {
                        valueCallback2.onReceiveValue(Uri.EMPTY);
                    } else {
                        valueCallback2.onReceiveValue(uriArr[0]);
                    }
                }
            }
        });
    }
}
