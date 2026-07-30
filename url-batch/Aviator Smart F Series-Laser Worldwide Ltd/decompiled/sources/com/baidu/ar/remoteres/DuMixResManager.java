package com.baidu.ar.remoteres;

import android.content.Context;
import com.baidu.ar.ARType;
import com.baidu.ar.DuMixController;
import com.baidu.ar.bean.DuMixARConfig;
import com.baidu.ar.callback.ICallback;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.gd;
import com.baidu.ar.h0;
import com.baidu.ar.hb;
import com.baidu.ar.j4;
import com.baidu.ar.jb;
import com.baidu.ar.l8;
import com.baidu.ar.o;
import com.baidu.ar.u5;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class DuMixResManager extends h0 implements u5 {
    private static final String TAG = "DuMixResManager";
    private static final boolean USE_LOCAL_LIB = false;
    private static boolean sAREngienDownload;
    private static final Map<ARType, String> sProcessorMap;
    private File mLibDir;
    private l8 mMainResProc;
    private File mModelDir;
    private final Map<ARType, IDuMixResProcessor> mProcessorInstances = new HashMap();
    private boolean mIsCheckError = false;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IDuMixResProcessor f3123a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ICallback f3124b;

        /* renamed from: com.baidu.ar.remoteres.DuMixResManager$a$a, reason: collision with other inner class name */
        public class C0038a implements ICallback {
            public C0038a() {
            }

            @Override // com.baidu.ar.callback.ICallback
            public void run() {
                a aVar = a.this;
                DuMixResManager.this.updateModResVersion(aVar.f3123a);
                ICallback iCallback = a.this.f3124b;
                if (iCallback != null) {
                    iCallback.run();
                }
            }
        }

        public a(IDuMixResProcessor iDuMixResProcessor, ICallback iCallback) {
            this.f3123a = iDuMixResProcessor;
            this.f3124b = iCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (DuMixResManager.this.isModHasNewVersion(this.f3123a.getBusinessTag()) || !this.f3123a.isReady(DuMixResManager.this.mLibDir, DuMixResManager.this.mModelDir)) {
                DuMixResManager.this.doDownloadRes(this.f3123a.getBusinessTag(), new C0038a(), null);
                return;
            }
            ICallback iCallback = this.f3124b;
            if (iCallback != null) {
                iCallback.run();
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IDuMixResProcessor f3127a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DuMixController f3128b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ICallback f3129c;

        public b(IDuMixResProcessor iDuMixResProcessor, DuMixController duMixController, ICallback iCallback) {
            this.f3127a = iDuMixResProcessor;
            this.f3128b = duMixController;
            this.f3129c = iCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            DuMixResManager.this.loadRes(this.f3127a, this.f3128b, this.f3129c);
        }
    }

    public class c implements ICallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IDuMixResProcessor f3131a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DuMixController f3132b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ICallback f3133c;

        public c(IDuMixResProcessor iDuMixResProcessor, DuMixController duMixController, ICallback iCallback) {
            this.f3131a = iDuMixResProcessor;
            this.f3132b = duMixController;
            this.f3133c = iCallback;
        }

        @Override // com.baidu.ar.callback.ICallback
        public void run() {
            DuMixResManager.this.updateModResVersion(this.f3131a);
            if (this.f3131a.load(this.f3132b, DuMixResManager.this.mLibDir, DuMixResManager.this.mModelDir)) {
                DuMixResManager.this.notifySuccess(this.f3133c);
                return;
            }
            DuMixResManager duMixResManager = DuMixResManager.this;
            ICallbackWith<IDuMixResLoadTask> iCallbackWith = duMixResManager.mErrorCallback;
            if (iCallbackWith != null) {
                iCallbackWith.run(duMixResManager.makeErrorObj("load case res fail"));
            }
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ICallback f3135a;

        public d(ICallback iCallback) {
            this.f3135a = iCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            ICallback iCallback = this.f3135a;
            if (iCallback == null || DuMixResManager.this.mContext == null) {
                return;
            }
            iCallback.run();
        }
    }

    public class e implements ICallbackWith<String> {
        public e() {
        }

        @Override // com.baidu.ar.callback.ICallbackWith
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void run(String str) {
            DuMixResManager.this.mIsCheckError = true;
            DuMixResManager duMixResManager = DuMixResManager.this;
            ICallbackWith<IDuMixResLoadTask> iCallbackWith = duMixResManager.mErrorCallback;
            if (iCallbackWith != null) {
                iCallbackWith.run(duMixResManager.makeErrorObj(str));
            }
        }
    }

    public class f implements ICallbackWith<Map<String, String>> {
        public f() {
        }

        @Override // com.baidu.ar.callback.ICallbackWith
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void run(Map<String, String> map) {
            DuMixResManager.this.mIsCheckError = false;
            if (map != null) {
                DuMixResManager.this.mBusinessResUrls.putAll(map);
            }
            DuMixResManager duMixResManager = DuMixResManager.this;
            duMixResManager.mIsChecked = true;
            duMixResManager.executeReadyTask();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        sProcessorMap = hashMap;
        sAREngienDownload = false;
        hashMap.put(ARType.ON_DEVICE_IR, OnDeviceIRResProcessor.class.getName());
        hashMap.put(ARType.CLOUD_IR, CloudIRResProcessor.class.getName());
        hashMap.put(ARType.FACE, FaceResProcessor.class.getName());
    }

    public DuMixResManager(Context context) {
        this.mContext = context.getApplicationContext();
        this.mLibDir = new File(DuMixController.getSoDownLoadDir(context));
        this.mModelDir = new File(this.mLibDir, "res");
        if (!com.baidu.ar.libloader.a.b()) {
            com.baidu.ar.libloader.a.a(new com.baidu.ar.libloader.c(this.mLibDir.getAbsolutePath()));
        }
        checkResSdkVersion(context);
        j4.e(this.mLibDir);
        j4.e(this.mModelDir);
        this.mDownloader = new hb(context.getApplicationContext(), this.mLibDir);
        checkNewVersion();
    }

    private void checkNewVersion() {
        Map<ARType, String> map = sProcessorMap;
        int i8 = 1;
        String[] strArr = new String[map.size() + 1];
        strArr[0] = getMainResProcessor().getBusinessTag();
        Iterator<Map.Entry<ARType, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            strArr[i8] = getResProcessor(it.next().getKey()).getBusinessTag();
            i8++;
        }
        this.mIsCheckError = false;
        this.mDownloader.a(new e());
        this.mDownloader.a(strArr, new f());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r3 == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void checkResSdkVersion(Context context) {
        jb a8 = jb.a(context);
        if (a8 != null && a8.b() != o.a()) {
            j4.a(this.mLibDir, true);
            j4.a(this.mModelDir, true);
        }
        a8 = jb.a();
        this.mResVersion = a8;
    }

    private l8 getMainResProcessor() {
        if (this.mMainResProc == null) {
            this.mMainResProc = new l8();
        }
        return this.mMainResProc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadRes(IDuMixResProcessor iDuMixResProcessor, DuMixController duMixController, ICallback iCallback) {
        if (this.mContext == null) {
            return;
        }
        if (iDuMixResProcessor != null && !this.mIsChecked) {
            onReady(new b(iDuMixResProcessor, duMixController, iCallback));
            if (this.mIsCheckError) {
                checkNewVersion();
                return;
            }
            return;
        }
        if (iDuMixResProcessor == null || iDuMixResProcessor.isLoaded() || (!isModHasNewVersion(iDuMixResProcessor.getBusinessTag()) && iDuMixResProcessor.isReady(this.mLibDir, this.mModelDir) && iDuMixResProcessor.load(duMixController, this.mLibDir, this.mModelDir))) {
            notifySuccess(iCallback);
        } else {
            doDownloadRes(iDuMixResProcessor.getBusinessTag(), new c(iDuMixResProcessor, duMixController, iCallback), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifySuccess(ICallback iCallback) {
        if (iCallback == null || this.mContext == null) {
            return;
        }
        gd.a(new d(iCallback));
    }

    public static void setAREngienDownload(boolean z7) {
        sAREngienDownload = z7;
    }

    @Override // com.baidu.ar.u5
    public void downloadARRes(ARType aRType, ICallback iCallback) {
        IDuMixResProcessor resProcessor = getResProcessor(aRType);
        if (resProcessor != null) {
            onReady(new a(resProcessor, iCallback));
        } else if (iCallback != null) {
            iCallback.run();
        }
    }

    public String getLibRoot() {
        return this.mLibDir.getAbsolutePath();
    }

    public String getModelRoot() {
        return this.mModelDir.getAbsolutePath();
    }

    public IDuMixResProcessor getResProcessor(ARType aRType) {
        if (aRType == null) {
            aRType = DuMixARConfig.getAipAppId().equals("6") ? ARType.IMU : ARType.FACE;
        }
        if (this.mProcessorInstances.containsKey(aRType)) {
            return this.mProcessorInstances.get(aRType);
        }
        Map<ARType, String> map = sProcessorMap;
        if (map.containsKey(aRType)) {
            try {
                IDuMixResProcessor iDuMixResProcessor = (IDuMixResProcessor) Class.forName(map.get(aRType)).newInstance();
                this.mProcessorInstances.put(aRType, iDuMixResProcessor);
                return iDuMixResProcessor;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public boolean isARResReady(ARType aRType) {
        IDuMixResProcessor resProcessor = getResProcessor(aRType);
        if (resProcessor != null) {
            return !isModHasNewVersion(resProcessor.getBusinessTag()) && resProcessor.isReady(this.mLibDir, this.mModelDir);
        }
        return true;
    }

    public boolean load(ARType aRType) {
        if (!isARResReady(aRType)) {
            return false;
        }
        String modelRoot = getModelRoot();
        String libRoot = getLibRoot();
        return getResProcessor(aRType).load(null, new File(libRoot), new File(modelRoot));
    }

    public void loadARRes(ARType aRType, DuMixController duMixController, ICallback iCallback) {
        loadRes(getResProcessor(aRType), duMixController, iCallback);
    }

    public void loadMainLib(ICallback iCallback) {
        l8 mainResProcessor = getMainResProcessor();
        mainResProcessor.a(sAREngienDownload);
        loadRes(mainResProcessor, null, iCallback);
    }

    public void prepareMainRes(DuMixController duMixController) {
        getMainResProcessor().a(duMixController, this.mModelDir);
    }

    public void release() {
        onRelease();
    }

    @Override // com.baidu.ar.u5
    public void setErrorCallback(ICallbackWith<IDuMixResLoadTask> iCallbackWith) {
        this.mErrorCallback = iCallbackWith;
    }
}
