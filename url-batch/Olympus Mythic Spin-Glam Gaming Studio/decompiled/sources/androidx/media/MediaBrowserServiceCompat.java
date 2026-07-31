package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.app.BundleCompat;
import androidx.core.util.Pair;
import androidx.media.MediaSessionManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {
    static final boolean DEBUG = Log.isLoggable("MBServiceCompat", 3);
    final ConnectionRecord mConnectionFromFwk;
    final ArrayMap mConnections;
    ConnectionRecord mCurConnection;
    final ServiceHandler mHandler;
    private MediaBrowserServiceImpl mImpl;
    final ArrayList mPendingConnections;
    private final ServiceBinderImpl mServiceBinderImpl;
    MediaSessionCompat.Token mSession;

    interface MediaBrowserServiceImpl {
        IBinder onBind(Intent intent);

        void onCreate();
    }

    private interface ServiceCallbacks {
        IBinder asBinder();

        void onConnect(String str, MediaSessionCompat.Token token, Bundle bundle);

        void onConnectFailed();

        void onLoadChildren(String str, List list, Bundle bundle, Bundle bundle2);
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract BrowserRoot onGetRoot(String str, int i, Bundle bundle);

    public abstract void onLoadChildren(String str, Result result);

    public void onSubscribe(String str, Bundle bundle) {
    }

    public void onUnsubscribe(String str) {
    }

    class MediaBrowserServiceImplBase implements MediaBrowserServiceImpl {
        private Messenger mMessenger;
        final /* synthetic */ MediaBrowserServiceCompat this$0;

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            this.mMessenger = new Messenger(this.this$0.mHandler);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public IBinder onBind(Intent intent) {
            if ("android.media.browse.MediaBrowserService".equals(intent.getAction())) {
                return this.mMessenger.getBinder();
            }
            return null;
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$1, reason: invalid class name */
        /* loaded from: classes15.dex */
        class AnonymousClass1 implements Runnable {
            final /* synthetic */ MediaBrowserServiceImplBase this$1;
            final /* synthetic */ MediaSessionCompat.Token val$token;

            @Override // java.lang.Runnable
            public void run() {
                Iterator it = this.this$1.this$0.mConnections.values().iterator();
                while (it.hasNext()) {
                    ConnectionRecord connectionRecord = (ConnectionRecord) it.next();
                    try {
                        connectionRecord.callbacks.onConnect(connectionRecord.root.getRootId(), this.val$token, connectionRecord.root.getExtras());
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "Connection for " + connectionRecord.pkg + " is no longer valid.");
                        it.remove();
                    }
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$2, reason: invalid class name */
        /* loaded from: classes15.dex */
        class AnonymousClass2 implements Runnable {
            final /* synthetic */ MediaBrowserServiceImplBase this$1;
            final /* synthetic */ Bundle val$options;
            final /* synthetic */ String val$parentId;

            @Override // java.lang.Runnable
            public void run() {
                Iterator it = this.this$1.this$0.mConnections.keySet().iterator();
                while (it.hasNext()) {
                    this.this$1.notifyChildrenChangedOnHandler((ConnectionRecord) this.this$1.this$0.mConnections.get((IBinder) it.next()), this.val$parentId, this.val$options);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$3, reason: invalid class name */
        /* loaded from: classes15.dex */
        class AnonymousClass3 implements Runnable {
            final /* synthetic */ MediaBrowserServiceImplBase this$1;
            final /* synthetic */ Bundle val$options;
            final /* synthetic */ String val$parentId;
            final /* synthetic */ MediaSessionManager.RemoteUserInfo val$remoteUserInfo;

            @Override // java.lang.Runnable
            public void run() {
                for (int i = 0; i < this.this$1.this$0.mConnections.getSize(); i++) {
                    ConnectionRecord connectionRecord = (ConnectionRecord) this.this$1.this$0.mConnections.valueAt(i);
                    if (connectionRecord.browserInfo.equals(this.val$remoteUserInfo)) {
                        this.this$1.notifyChildrenChangedOnHandler(connectionRecord, this.val$parentId, this.val$options);
                        return;
                    }
                }
            }
        }

        void notifyChildrenChangedOnHandler(ConnectionRecord connectionRecord, String str, Bundle bundle) {
            List<Pair> list = (List) connectionRecord.subscriptions.get(str);
            if (list != null) {
                for (Pair pair : list) {
                    if (MediaBrowserCompatUtils.hasDuplicatedItems(bundle, (Bundle) pair.second)) {
                        this.this$0.performLoadChildren(str, connectionRecord, (Bundle) pair.second, bundle);
                    }
                }
            }
        }
    }

    @RequiresApi
    class MediaBrowserServiceImplApi21 implements MediaBrowserServiceImpl {
        Messenger mMessenger;
        final List mRootExtrasList = new ArrayList();
        MediaBrowserService mServiceFwk;

        MediaBrowserServiceImplApi21() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            MediaBrowserServiceApi21 mediaBrowserServiceApi21 = new MediaBrowserServiceApi21(MediaBrowserServiceCompat.this);
            this.mServiceFwk = mediaBrowserServiceApi21;
            mediaBrowserServiceApi21.onCreate();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public IBinder onBind(Intent intent) {
            return this.mServiceFwk.onBind(intent);
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        class AnonymousClass1 implements Runnable {
            final /* synthetic */ MediaBrowserServiceImplApi21 this$1;
            final /* synthetic */ MediaSessionCompat.Token val$token;

            @Override // java.lang.Runnable
            public void run() {
                this.this$1.setSessionTokenOnHandler(this.val$token);
            }
        }

        void setSessionTokenOnHandler(MediaSessionCompat.Token token) {
            if (!this.mRootExtrasList.isEmpty()) {
                IMediaSession extraBinder = token.getExtraBinder();
                if (extraBinder != null) {
                    Iterator it = this.mRootExtrasList.iterator();
                    while (it.hasNext()) {
                        BundleCompat.putBinder((Bundle) it.next(), "extra_session_binder", extraBinder.asBinder());
                    }
                }
                this.mRootExtrasList.clear();
            }
            this.mServiceFwk.setSessionToken((MediaSession.Token) token.getToken());
        }

        public BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
            Bundle bundle2;
            int i2 = -1;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                bundle2 = null;
            } else {
                bundle.remove("extra_client_version");
                this.mMessenger = new Messenger(MediaBrowserServiceCompat.this.mHandler);
                bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                BundleCompat.putBinder(bundle2, "extra_messenger", this.mMessenger.getBinder());
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.mSession;
                if (token != null) {
                    IMediaSession extraBinder = token.getExtraBinder();
                    BundleCompat.putBinder(bundle2, "extra_session_binder", extraBinder == null ? null : extraBinder.asBinder());
                } else {
                    this.mRootExtrasList.add(bundle2);
                }
                i2 = bundle.getInt("extra_calling_pid", -1);
                bundle.remove("extra_calling_pid");
            }
            ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.new ConnectionRecord(str, i2, i, bundle, null);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.mCurConnection = connectionRecord;
            BrowserRoot onGetRoot = mediaBrowserServiceCompat.onGetRoot(str, i, bundle);
            MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat2.mCurConnection = null;
            if (onGetRoot == null) {
                return null;
            }
            if (this.mMessenger != null) {
                mediaBrowserServiceCompat2.mPendingConnections.add(connectionRecord);
            }
            if (bundle2 == null) {
                bundle2 = onGetRoot.getExtras();
            } else if (onGetRoot.getExtras() != null) {
                bundle2.putAll(onGetRoot.getExtras());
            }
            return new BrowserRoot(onGetRoot.getRootId(), bundle2);
        }

        public void onLoadChildren(String str, final ResultWrapper resultWrapper) {
            Result<List<MediaBrowserCompat.MediaItem>> result = new Result<List<MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.2
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // androidx.media.MediaBrowserServiceCompat.Result
                public void onResultSent(List list) {
                    ArrayList arrayList;
                    if (list == null) {
                        arrayList = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) it.next();
                            Parcel obtain = Parcel.obtain();
                            mediaItem.writeToParcel(obtain, 0);
                            arrayList2.add(obtain);
                        }
                        arrayList = arrayList2;
                    }
                    resultWrapper.sendResult(arrayList);
                }
            };
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.mCurConnection = mediaBrowserServiceCompat.mConnectionFromFwk;
            mediaBrowserServiceCompat.onLoadChildren(str, result);
            MediaBrowserServiceCompat.this.mCurConnection = null;
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$3, reason: invalid class name */
        /* loaded from: classes4.dex */
        class AnonymousClass3 implements Runnable {
            final /* synthetic */ MediaBrowserServiceImplApi21 this$1;
            final /* synthetic */ Bundle val$options;
            final /* synthetic */ String val$parentId;

            @Override // java.lang.Runnable
            public void run() {
                Iterator it = MediaBrowserServiceCompat.this.mConnections.keySet().iterator();
                while (it.hasNext()) {
                    this.this$1.notifyChildrenChangedForCompatOnHandler((ConnectionRecord) MediaBrowserServiceCompat.this.mConnections.get((IBinder) it.next()), this.val$parentId, this.val$options);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$4, reason: invalid class name */
        /* loaded from: classes4.dex */
        class AnonymousClass4 implements Runnable {
            final /* synthetic */ MediaBrowserServiceImplApi21 this$1;
            final /* synthetic */ Bundle val$options;
            final /* synthetic */ String val$parentId;
            final /* synthetic */ MediaSessionManager.RemoteUserInfo val$remoteUserInfo;

            @Override // java.lang.Runnable
            public void run() {
                for (int i = 0; i < MediaBrowserServiceCompat.this.mConnections.getSize(); i++) {
                    ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.mConnections.valueAt(i);
                    if (connectionRecord.browserInfo.equals(this.val$remoteUserInfo)) {
                        this.this$1.notifyChildrenChangedForCompatOnHandler(connectionRecord, this.val$parentId, this.val$options);
                    }
                }
            }
        }

        void notifyChildrenChangedForCompatOnHandler(ConnectionRecord connectionRecord, String str, Bundle bundle) {
            List<Pair> list = (List) connectionRecord.subscriptions.get(str);
            if (list != null) {
                for (Pair pair : list) {
                    if (MediaBrowserCompatUtils.hasDuplicatedItems(bundle, (Bundle) pair.second)) {
                        MediaBrowserServiceCompat.this.performLoadChildren(str, connectionRecord, (Bundle) pair.second, bundle);
                    }
                }
            }
        }

        @RequiresApi
        class MediaBrowserServiceApi21 extends MediaBrowserService {
            MediaBrowserServiceApi21(Context context) {
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
                MediaSessionCompat.ensureClassLoader(bundle);
                BrowserRoot onGetRoot = MediaBrowserServiceImplApi21.this.onGetRoot(str, i, bundle == null ? null : new Bundle(bundle));
                if (onGetRoot == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(onGetRoot.mRootId, onGetRoot.mExtras);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result result) {
                MediaBrowserServiceImplApi21.this.onLoadChildren(str, new ResultWrapper(result));
            }
        }
    }

    @RequiresApi
    class MediaBrowserServiceImplApi23 extends MediaBrowserServiceImplApi21 {
        MediaBrowserServiceImplApi23() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            MediaBrowserServiceApi23 mediaBrowserServiceApi23 = new MediaBrowserServiceApi23(MediaBrowserServiceCompat.this);
            this.mServiceFwk = mediaBrowserServiceApi23;
            mediaBrowserServiceApi23.onCreate();
        }

        public void onLoadItem(String str, final ResultWrapper resultWrapper) {
            Result<MediaBrowserCompat.MediaItem> result = new Result<MediaBrowserCompat.MediaItem>(str) { // from class: androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.1
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // androidx.media.MediaBrowserServiceCompat.Result
                public void onResultSent(MediaBrowserCompat.MediaItem mediaItem) {
                    if (mediaItem == null) {
                        resultWrapper.sendResult(null);
                        return;
                    }
                    Parcel obtain = Parcel.obtain();
                    mediaItem.writeToParcel(obtain, 0);
                    resultWrapper.sendResult(obtain);
                }
            };
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.mCurConnection = mediaBrowserServiceCompat.mConnectionFromFwk;
            mediaBrowserServiceCompat.onLoadItem(str, result);
            MediaBrowserServiceCompat.this.mCurConnection = null;
        }

        class MediaBrowserServiceApi23 extends MediaBrowserServiceImplApi21.MediaBrowserServiceApi21 {
            MediaBrowserServiceApi23(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(String str, MediaBrowserService.Result result) {
                MediaBrowserServiceImplApi23.this.onLoadItem(str, new ResultWrapper(result));
            }
        }
    }

    @RequiresApi
    class MediaBrowserServiceImplApi26 extends MediaBrowserServiceImplApi23 {
        MediaBrowserServiceImplApi26() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            MediaBrowserServiceApi26 mediaBrowserServiceApi26 = new MediaBrowserServiceApi26(MediaBrowserServiceCompat.this);
            this.mServiceFwk = mediaBrowserServiceApi26;
            mediaBrowserServiceApi26.onCreate();
        }

        public void onLoadChildren(String str, final ResultWrapper resultWrapper, final Bundle bundle) {
            Result<List<MediaBrowserCompat.MediaItem>> result = new Result<List<MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26.1
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // androidx.media.MediaBrowserServiceCompat.Result
                public void onResultSent(List list) {
                    if (list == null) {
                        resultWrapper.sendResult(null);
                        return;
                    }
                    if ((getFlags() & 1) != 0) {
                        list = MediaBrowserServiceCompat.this.applyOptions(list, bundle);
                    }
                    ArrayList arrayList = new ArrayList(list.size());
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                    resultWrapper.sendResult(arrayList);
                }
            };
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.mCurConnection = mediaBrowserServiceCompat.mConnectionFromFwk;
            mediaBrowserServiceCompat.onLoadChildren(str, result, bundle);
            MediaBrowserServiceCompat.this.mCurConnection = null;
        }

        class MediaBrowserServiceApi26 extends MediaBrowserServiceImplApi23.MediaBrowserServiceApi23 {
            MediaBrowserServiceApi26(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
                MediaSessionCompat.ensureClassLoader(bundle);
                MediaBrowserServiceImplApi26 mediaBrowserServiceImplApi26 = MediaBrowserServiceImplApi26.this;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.mCurConnection = mediaBrowserServiceCompat.mConnectionFromFwk;
                mediaBrowserServiceImplApi26.onLoadChildren(str, new ResultWrapper(result), bundle);
                MediaBrowserServiceCompat.this.mCurConnection = null;
            }
        }
    }

    @RequiresApi
    class MediaBrowserServiceImplApi28 extends MediaBrowserServiceImplApi26 {
        MediaBrowserServiceImplApi28() {
            super();
        }
    }

    private static final class ServiceHandler extends Handler {
        private MediaBrowserServiceCompat mService;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = this.mService;
            if (mediaBrowserServiceCompat != null) {
                mediaBrowserServiceCompat.handleMessageInternal(message);
            } else {
                removeCallbacksAndMessages(null);
            }
        }

        public void release() {
            this.mService = null;
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j);
        }

        public void postOrRun(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }
    }

    private class ConnectionRecord implements IBinder.DeathRecipient {
        public final MediaSessionManager.RemoteUserInfo browserInfo;
        public final ServiceCallbacks callbacks;
        public final int pid;
        public final String pkg;
        public BrowserRoot root;
        public final Bundle rootHints;
        public final HashMap subscriptions = new HashMap();
        public final int uid;

        ConnectionRecord(String str, int i, int i2, Bundle bundle, ServiceCallbacks serviceCallbacks) {
            this.pkg = str;
            this.pid = i;
            this.uid = i2;
            this.browserInfo = new MediaSessionManager.RemoteUserInfo(str, i, i2);
            this.rootHints = bundle;
            this.callbacks = serviceCallbacks;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ConnectionRecord.1
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = ConnectionRecord.this;
                    MediaBrowserServiceCompat.this.mConnections.remove(connectionRecord.callbacks.asBinder());
                }
            });
        }
    }

    public static class Result<T> {
        private final Object mDebug;
        private boolean mDetachCalled;
        private int mFlags;
        private boolean mSendErrorCalled;
        private boolean mSendResultCalled;

        void onResultSent(Object obj) {
        }

        Result(Object obj) {
            this.mDebug = obj;
        }

        public void sendResult(Object obj) {
            if (this.mSendResultCalled || this.mSendErrorCalled) {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.mDebug);
            }
            this.mSendResultCalled = true;
            onResultSent(obj);
        }

        public void sendError(Bundle bundle) {
            if (this.mSendResultCalled || this.mSendErrorCalled) {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.mDebug);
            }
            this.mSendErrorCalled = true;
            onErrorSent(bundle);
        }

        boolean isDone() {
            return this.mDetachCalled || this.mSendResultCalled || this.mSendErrorCalled;
        }

        void setFlags(int i) {
            this.mFlags = i;
        }

        int getFlags() {
            return this.mFlags;
        }

        void onErrorSent(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.mDebug);
        }
    }

    private class ServiceBinderImpl {
        final /* synthetic */ MediaBrowserServiceCompat this$0;

        public void connect(final String str, final int i, final int i2, final Bundle bundle, final ServiceCallbacks serviceCallbacks) {
            if (!this.this$0.isValidPackage(str, i2)) {
                throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + str);
            }
            this.this$0.mHandler.postOrRun(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    IBinder asBinder = serviceCallbacks.asBinder();
                    ServiceBinderImpl.this.this$0.mConnections.remove(asBinder);
                    ConnectionRecord connectionRecord = ServiceBinderImpl.this.this$0.new ConnectionRecord(str, i, i2, bundle, serviceCallbacks);
                    MediaBrowserServiceCompat mediaBrowserServiceCompat = ServiceBinderImpl.this.this$0;
                    mediaBrowserServiceCompat.mCurConnection = connectionRecord;
                    BrowserRoot onGetRoot = mediaBrowserServiceCompat.onGetRoot(str, i2, bundle);
                    connectionRecord.root = onGetRoot;
                    MediaBrowserServiceCompat mediaBrowserServiceCompat2 = ServiceBinderImpl.this.this$0;
                    mediaBrowserServiceCompat2.mCurConnection = null;
                    if (onGetRoot == null) {
                        Log.i("MBServiceCompat", "No root for client " + str + " from service " + getClass().getName());
                        try {
                            serviceCallbacks.onConnectFailed();
                            return;
                        } catch (RemoteException unused) {
                            Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + str);
                            return;
                        }
                    }
                    try {
                        mediaBrowserServiceCompat2.mConnections.put(asBinder, connectionRecord);
                        asBinder.linkToDeath(connectionRecord, 0);
                        if (ServiceBinderImpl.this.this$0.mSession != null) {
                            serviceCallbacks.onConnect(connectionRecord.root.getRootId(), ServiceBinderImpl.this.this$0.mSession, connectionRecord.root.getExtras());
                        }
                    } catch (RemoteException unused2) {
                        Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + str);
                        ServiceBinderImpl.this.this$0.mConnections.remove(asBinder);
                    }
                }
            });
        }

        public void disconnect(final ServiceCallbacks serviceCallbacks) {
            this.this$0.mHandler.postOrRun(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = (ConnectionRecord) ServiceBinderImpl.this.this$0.mConnections.remove(serviceCallbacks.asBinder());
                    if (connectionRecord != null) {
                        connectionRecord.callbacks.asBinder().unlinkToDeath(connectionRecord, 0);
                    }
                }
            });
        }

        public void addSubscription(final String str, final IBinder iBinder, final Bundle bundle, final ServiceCallbacks serviceCallbacks) {
            this.this$0.mHandler.postOrRun(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = (ConnectionRecord) ServiceBinderImpl.this.this$0.mConnections.get(serviceCallbacks.asBinder());
                    if (connectionRecord == null) {
                        Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + str);
                        return;
                    }
                    ServiceBinderImpl.this.this$0.addSubscription(str, connectionRecord, iBinder, bundle);
                }
            });
        }

        public void removeSubscription(final String str, final IBinder iBinder, final ServiceCallbacks serviceCallbacks) {
            this.this$0.mHandler.postOrRun(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.4
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = (ConnectionRecord) ServiceBinderImpl.this.this$0.mConnections.get(serviceCallbacks.asBinder());
                    if (connectionRecord == null) {
                        Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + str);
                        return;
                    }
                    if (ServiceBinderImpl.this.this$0.removeSubscription(str, connectionRecord, iBinder)) {
                        return;
                    }
                    Log.w("MBServiceCompat", "removeSubscription called for " + str + " which is not subscribed");
                }
            });
        }

        public void getMediaItem(final String str, final ResultReceiver resultReceiver, final ServiceCallbacks serviceCallbacks) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            this.this$0.mHandler.postOrRun(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.5
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = (ConnectionRecord) ServiceBinderImpl.this.this$0.mConnections.get(serviceCallbacks.asBinder());
                    if (connectionRecord == null) {
                        Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + str);
                        return;
                    }
                    ServiceBinderImpl.this.this$0.performLoadItem(str, connectionRecord, resultReceiver);
                }
            });
        }

        public void registerCallbacks(final ServiceCallbacks serviceCallbacks, final String str, final int i, final int i2, final Bundle bundle) {
            this.this$0.mHandler.postOrRun(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.6
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord;
                    IBinder asBinder = serviceCallbacks.asBinder();
                    ServiceBinderImpl.this.this$0.mConnections.remove(asBinder);
                    Iterator it = ServiceBinderImpl.this.this$0.mPendingConnections.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ConnectionRecord connectionRecord2 = (ConnectionRecord) it.next();
                        if (connectionRecord2.uid == i2) {
                            connectionRecord = (TextUtils.isEmpty(str) || i <= 0) ? ServiceBinderImpl.this.this$0.new ConnectionRecord(connectionRecord2.pkg, connectionRecord2.pid, connectionRecord2.uid, bundle, serviceCallbacks) : null;
                            it.remove();
                        }
                    }
                    if (connectionRecord == null) {
                        connectionRecord = ServiceBinderImpl.this.this$0.new ConnectionRecord(str, i, i2, bundle, serviceCallbacks);
                    }
                    ServiceBinderImpl.this.this$0.mConnections.put(asBinder, connectionRecord);
                    try {
                        asBinder.linkToDeath(connectionRecord, 0);
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "IBinder is already dead.");
                    }
                }
            });
        }

        public void unregisterCallbacks(final ServiceCallbacks serviceCallbacks) {
            this.this$0.mHandler.postOrRun(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.7
                @Override // java.lang.Runnable
                public void run() {
                    IBinder asBinder = serviceCallbacks.asBinder();
                    ConnectionRecord connectionRecord = (ConnectionRecord) ServiceBinderImpl.this.this$0.mConnections.remove(asBinder);
                    if (connectionRecord != null) {
                        asBinder.unlinkToDeath(connectionRecord, 0);
                    }
                }
            });
        }

        public void search(final String str, final Bundle bundle, final ResultReceiver resultReceiver, final ServiceCallbacks serviceCallbacks) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            this.this$0.mHandler.postOrRun(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.8
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = (ConnectionRecord) ServiceBinderImpl.this.this$0.mConnections.get(serviceCallbacks.asBinder());
                    if (connectionRecord == null) {
                        Log.w("MBServiceCompat", "search for callback that isn't registered query=" + str);
                        return;
                    }
                    ServiceBinderImpl.this.this$0.performSearch(str, bundle, connectionRecord, resultReceiver);
                }
            });
        }

        public void sendCustomAction(final String str, final Bundle bundle, final ResultReceiver resultReceiver, final ServiceCallbacks serviceCallbacks) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            this.this$0.mHandler.postOrRun(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.9
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = (ConnectionRecord) ServiceBinderImpl.this.this$0.mConnections.get(serviceCallbacks.asBinder());
                    if (connectionRecord == null) {
                        Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + str + ", extras=" + bundle);
                        return;
                    }
                    ServiceBinderImpl.this.this$0.performCustomAction(str, bundle, connectionRecord, resultReceiver);
                }
            });
        }
    }

    private static class ServiceCallbacksCompat implements ServiceCallbacks {
        final Messenger mCallbacks;

        ServiceCallbacksCompat(Messenger messenger) {
            this.mCallbacks = messenger;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public IBinder asBinder() {
            return this.mCallbacks.getBinder();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void onConnect(String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            sendRequest(1, bundle2);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void onConnectFailed() {
            sendRequest(2, null);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void onLoadChildren(String str, List list, Bundle bundle, Bundle bundle2) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            sendRequest(3, bundle3);
        }

        private void sendRequest(int i, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.mCallbacks.send(obtain);
        }
    }

    @RequiresApi
    static class ResultWrapper<T> {
        MediaBrowserService.Result mResultFwk;

        ResultWrapper(MediaBrowserService.Result result) {
            this.mResultFwk = result;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void sendResult(Object obj) {
            if (obj instanceof List) {
                this.mResultFwk.sendResult(parcelListToItemList((List) obj));
                return;
            }
            if (obj instanceof Parcel) {
                Parcel parcel = (Parcel) obj;
                parcel.setDataPosition(0);
                this.mResultFwk.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
                return;
            }
            this.mResultFwk.sendResult(null);
        }

        List parcelListToItemList(List list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Parcel parcel = (Parcel) it.next();
                parcel.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.mImpl = new MediaBrowserServiceImplApi28();
        } else if (i >= 26) {
            this.mImpl = new MediaBrowserServiceImplApi26();
        } else {
            this.mImpl = new MediaBrowserServiceImplApi23();
        }
        this.mImpl.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.mHandler.release();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mImpl.onBind(intent);
    }

    public void onLoadChildren(String str, Result result, Bundle bundle) {
        result.setFlags(1);
        onLoadChildren(str, result);
    }

    public void onLoadItem(String str, Result result) {
        result.setFlags(2);
        result.sendResult(null);
    }

    public void onSearch(String str, Bundle bundle, Result result) {
        result.setFlags(4);
        result.sendResult(null);
    }

    public void onCustomAction(String str, Bundle bundle, Result result) {
        result.sendError(null);
    }

    void handleMessageInternal(Message message) {
        Bundle data = message.getData();
        switch (message.what) {
            case 1:
                Bundle bundle = data.getBundle("data_root_hints");
                MediaSessionCompat.ensureClassLoader(bundle);
                this.mServiceBinderImpl.connect(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new ServiceCallbacksCompat(message.replyTo));
                break;
            case 2:
                this.mServiceBinderImpl.disconnect(new ServiceCallbacksCompat(message.replyTo));
                break;
            case 3:
                Bundle bundle2 = data.getBundle("data_options");
                MediaSessionCompat.ensureClassLoader(bundle2);
                this.mServiceBinderImpl.addSubscription(data.getString("data_media_item_id"), BundleCompat.getBinder(data, "data_callback_token"), bundle2, new ServiceCallbacksCompat(message.replyTo));
                break;
            case 4:
                this.mServiceBinderImpl.removeSubscription(data.getString("data_media_item_id"), BundleCompat.getBinder(data, "data_callback_token"), new ServiceCallbacksCompat(message.replyTo));
                break;
            case 5:
                this.mServiceBinderImpl.getMediaItem(data.getString("data_media_item_id"), (ResultReceiver) data.getParcelable("data_result_receiver"), new ServiceCallbacksCompat(message.replyTo));
                break;
            case 6:
                Bundle bundle3 = data.getBundle("data_root_hints");
                MediaSessionCompat.ensureClassLoader(bundle3);
                this.mServiceBinderImpl.registerCallbacks(new ServiceCallbacksCompat(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                break;
            case 7:
                this.mServiceBinderImpl.unregisterCallbacks(new ServiceCallbacksCompat(message.replyTo));
                break;
            case 8:
                Bundle bundle4 = data.getBundle("data_search_extras");
                MediaSessionCompat.ensureClassLoader(bundle4);
                this.mServiceBinderImpl.search(data.getString("data_search_query"), bundle4, (ResultReceiver) data.getParcelable("data_result_receiver"), new ServiceCallbacksCompat(message.replyTo));
                break;
            case 9:
                Bundle bundle5 = data.getBundle("data_custom_action_extras");
                MediaSessionCompat.ensureClassLoader(bundle5);
                this.mServiceBinderImpl.sendCustomAction(data.getString("data_custom_action"), bundle5, (ResultReceiver) data.getParcelable("data_result_receiver"), new ServiceCallbacksCompat(message.replyTo));
                break;
            default:
                Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                break;
        }
    }

    boolean isValidPackage(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    void addSubscription(String str, ConnectionRecord connectionRecord, IBinder iBinder, Bundle bundle) {
        List<Pair> list = (List) connectionRecord.subscriptions.get(str);
        if (list == null) {
            list = new ArrayList();
        }
        for (Pair pair : list) {
            if (iBinder == pair.first && MediaBrowserCompatUtils.areSameOptions(bundle, (Bundle) pair.second)) {
                return;
            }
        }
        list.add(new Pair(iBinder, bundle));
        connectionRecord.subscriptions.put(str, list);
        performLoadChildren(str, connectionRecord, bundle, null);
        this.mCurConnection = connectionRecord;
        onSubscribe(str, bundle);
        this.mCurConnection = null;
    }

    boolean removeSubscription(String str, ConnectionRecord connectionRecord, IBinder iBinder) {
        boolean z = false;
        try {
            if (iBinder == null) {
                if (connectionRecord.subscriptions.remove(str) != null) {
                    z = true;
                }
            } else {
                List list = (List) connectionRecord.subscriptions.get(str);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (iBinder == ((Pair) it.next()).first) {
                            it.remove();
                            z = true;
                        }
                    }
                    if (list.size() == 0) {
                        connectionRecord.subscriptions.remove(str);
                    }
                }
            }
            return z;
        } finally {
            this.mCurConnection = connectionRecord;
            onUnsubscribe(str);
            this.mCurConnection = null;
        }
    }

    void performLoadChildren(final String str, final ConnectionRecord connectionRecord, final Bundle bundle, final Bundle bundle2) {
        Result<List<MediaBrowserCompat.MediaItem>> result = new Result<List<MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media.MediaBrowserServiceCompat.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public void onResultSent(List list) {
                if (MediaBrowserServiceCompat.this.mConnections.get(connectionRecord.callbacks.asBinder()) != connectionRecord) {
                    if (MediaBrowserServiceCompat.DEBUG) {
                        Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + connectionRecord.pkg + " id=" + str);
                        return;
                    }
                    return;
                }
                if ((getFlags() & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.applyOptions(list, bundle);
                }
                try {
                    connectionRecord.callbacks.onLoadChildren(str, list, bundle, bundle2);
                } catch (RemoteException unused) {
                    Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + str + " package=" + connectionRecord.pkg);
                }
            }
        };
        this.mCurConnection = connectionRecord;
        if (bundle == null) {
            onLoadChildren(str, result);
        } else {
            onLoadChildren(str, result, bundle);
        }
        this.mCurConnection = null;
        if (result.isDone()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + connectionRecord.pkg + " id=" + str);
    }

    List applyOptions(List list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i == -1 && i2 == -1) {
            return list;
        }
        int i3 = i2 * i;
        int i4 = i3 + i2;
        if (i < 0 || i2 < 1 || i3 >= list.size()) {
            return Collections.emptyList();
        }
        if (i4 > list.size()) {
            i4 = list.size();
        }
        return list.subList(i3, i4);
    }

    void performLoadItem(String str, ConnectionRecord connectionRecord, final ResultReceiver resultReceiver) {
        Result<MediaBrowserCompat.MediaItem> result = new Result<MediaBrowserCompat.MediaItem>(str) { // from class: androidx.media.MediaBrowserServiceCompat.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public void onResultSent(MediaBrowserCompat.MediaItem mediaItem) {
                if ((getFlags() & 2) != 0) {
                    resultReceiver.send(-1, null);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", mediaItem);
                resultReceiver.send(0, bundle);
            }
        };
        this.mCurConnection = connectionRecord;
        onLoadItem(str, result);
        this.mCurConnection = null;
        if (result.isDone()) {
            return;
        }
        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
    }

    void performSearch(String str, Bundle bundle, ConnectionRecord connectionRecord, final ResultReceiver resultReceiver) {
        Result<List<MediaBrowserCompat.MediaItem>> result = new Result<List<MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media.MediaBrowserServiceCompat.3
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public void onResultSent(List list) {
                if ((getFlags() & 4) != 0 || list == null) {
                    resultReceiver.send(-1, null);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
                resultReceiver.send(0, bundle2);
            }
        };
        this.mCurConnection = connectionRecord;
        onSearch(str, bundle, result);
        this.mCurConnection = null;
        if (result.isDone()) {
            return;
        }
        throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
    }

    void performCustomAction(String str, Bundle bundle, ConnectionRecord connectionRecord, final ResultReceiver resultReceiver) {
        Result<Bundle> result = new Result<Bundle>(str) { // from class: androidx.media.MediaBrowserServiceCompat.4
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public void onResultSent(Bundle bundle2) {
                resultReceiver.send(0, bundle2);
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            void onErrorSent(Bundle bundle2) {
                resultReceiver.send(-1, bundle2);
            }
        };
        this.mCurConnection = connectionRecord;
        onCustomAction(str, bundle, result);
        this.mCurConnection = null;
        if (result.isDone()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }

    public static final class BrowserRoot {
        private final Bundle mExtras;
        private final String mRootId;

        public BrowserRoot(String str, Bundle bundle) {
            if (str == null) {
                throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
            }
            this.mRootId = str;
            this.mExtras = bundle;
        }

        public String getRootId() {
            return this.mRootId;
        }

        public Bundle getExtras() {
            return this.mExtras;
        }
    }
}
