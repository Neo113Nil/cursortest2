package android.support.v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.app.BundleCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class MediaBrowserCompat {
    static final boolean DEBUG = Log.isLoggable("MediaBrowserCompat", 3);
    private final MediaBrowserImpl mImpl;

    private static class CustomActionResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        protected void onReceiveResult(int i, Bundle bundle) {
        }
    }

    interface MediaBrowserImpl {
        void connect();

        void disconnect();

        MediaSessionCompat.Token getSessionToken();
    }

    interface MediaBrowserServiceCallbackImpl {
        void onConnectionFailed(Messenger messenger);

        void onLoadChildren(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);

        void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mImpl = new MediaBrowserImplApi26(context, componentName, connectionCallback, bundle);
        } else {
            this.mImpl = new MediaBrowserImplApi23(context, componentName, connectionCallback, bundle);
        }
    }

    public void connect() {
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        this.mImpl.connect();
    }

    public void disconnect() {
        this.mImpl.disconnect();
    }

    public MediaSessionCompat.Token getSessionToken() {
        return this.mImpl.getSessionToken();
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator() { // from class: android.support.v4.media.MediaBrowserCompat.MediaItem.1
            @Override // android.os.Parcelable.Creator
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        };
        private final MediaDescriptionCompat mDescription;
        private final int mFlags;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        MediaItem(Parcel parcel) {
            this.mFlags = parcel.readInt();
            this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mFlags);
            this.mDescription.writeToParcel(parcel, i);
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.mFlags + ", mDescription=" + this.mDescription + '}';
        }
    }

    public static class ConnectionCallback {
        final MediaBrowser.ConnectionCallback mConnectionCallbackFwk = new ConnectionCallbackApi21();
        ConnectionCallbackInternal mConnectionCallbackInternal;

        interface ConnectionCallbackInternal {
            void onConnected();

            void onConnectionFailed();

            void onConnectionSuspended();
        }

        public abstract void onConnected();

        public abstract void onConnectionFailed();

        public abstract void onConnectionSuspended();

        void setInternalConnectionCallback(ConnectionCallbackInternal connectionCallbackInternal) {
            this.mConnectionCallbackInternal = connectionCallbackInternal;
        }

        private class ConnectionCallbackApi21 extends MediaBrowser.ConnectionCallback {
            ConnectionCallbackApi21() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
                ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.mConnectionCallbackInternal;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.onConnected();
                }
                ConnectionCallback.this.onConnected();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
                ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.mConnectionCallbackInternal;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.onConnectionSuspended();
                }
                ConnectionCallback.this.onConnectionSuspended();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
                ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.mConnectionCallbackInternal;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.onConnectionFailed();
                }
                ConnectionCallback.this.onConnectionFailed();
            }
        }
    }

    static class MediaBrowserImplApi21 implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl, ConnectionCallback.ConnectionCallbackInternal {
        protected final MediaBrowser mBrowserFwk;
        protected Messenger mCallbacksMessenger;
        final Context mContext;
        private MediaSessionCompat.Token mMediaSessionToken;
        protected final Bundle mRootHints;
        protected ServiceBinderWrapper mServiceBinderWrapper;
        protected int mServiceVersion;
        protected final CallbackHandler mHandler = new CallbackHandler(this);
        private final ArrayMap mSubscriptions = new ArrayMap();

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnectionFailed() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onConnectionFailed(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        MediaBrowserImplApi21(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            this.mContext = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.mRootHints = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            connectionCallback.setInternalConnectionCallback(this);
            this.mBrowserFwk = new MediaBrowser(context, componentName, connectionCallback.mConnectionCallbackFwk, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void connect() {
            this.mBrowserFwk.connect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void disconnect() {
            Messenger messenger;
            ServiceBinderWrapper serviceBinderWrapper = this.mServiceBinderWrapper;
            if (serviceBinderWrapper != null && (messenger = this.mCallbacksMessenger) != null) {
                try {
                    serviceBinderWrapper.unregisterCallbackMessenger(messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            this.mBrowserFwk.disconnect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public MediaSessionCompat.Token getSessionToken() {
            if (this.mMediaSessionToken == null) {
                this.mMediaSessionToken = MediaSessionCompat.Token.fromToken(this.mBrowserFwk.getSessionToken());
            }
            return this.mMediaSessionToken;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnected() {
            try {
                Bundle extras = this.mBrowserFwk.getExtras();
                if (extras == null) {
                    return;
                }
                this.mServiceVersion = extras.getInt("extra_service_version", 0);
                IBinder binder = BundleCompat.getBinder(extras, "extra_messenger");
                if (binder != null) {
                    this.mServiceBinderWrapper = new ServiceBinderWrapper(binder, this.mRootHints);
                    Messenger messenger = new Messenger(this.mHandler);
                    this.mCallbacksMessenger = messenger;
                    this.mHandler.setCallbacksMessenger(messenger);
                    try {
                        this.mServiceBinderWrapper.registerCallbackMessenger(this.mContext, this.mCallbacksMessenger);
                    } catch (RemoteException unused) {
                        Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                    }
                }
                IMediaSession asInterface = IMediaSession.Stub.asInterface(BundleCompat.getBinder(extras, "extra_session_binder"));
                if (asInterface != null) {
                    this.mMediaSessionToken = MediaSessionCompat.Token.fromToken(this.mBrowserFwk.getSessionToken(), asInterface);
                }
            } catch (IllegalStateException e) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnectionSuspended() {
            this.mServiceBinderWrapper = null;
            this.mCallbacksMessenger = null;
            this.mMediaSessionToken = null;
            this.mHandler.setCallbacksMessenger(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onLoadChildren(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.mCallbacksMessenger != messenger) {
                return;
            }
            MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(this.mSubscriptions.get(str));
            if (MediaBrowserCompat.DEBUG) {
                Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
            }
        }
    }

    static class MediaBrowserImplApi23 extends MediaBrowserImplApi21 {
        MediaBrowserImplApi23(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }
    }

    static class MediaBrowserImplApi26 extends MediaBrowserImplApi23 {
        MediaBrowserImplApi26(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }
    }

    private static class CallbackHandler extends Handler {
        private final WeakReference mCallbackImplRef;
        private WeakReference mCallbacksMessengerRef;

        CallbackHandler(MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl) {
            this.mCallbackImplRef = new WeakReference(mediaBrowserServiceCallbackImpl);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference weakReference = this.mCallbacksMessengerRef;
            if (weakReference == null || weakReference.get() == null || this.mCallbackImplRef.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.ensureClassLoader(data);
            MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl = (MediaBrowserServiceCallbackImpl) this.mCallbackImplRef.get();
            Messenger messenger = (Messenger) this.mCallbacksMessengerRef.get();
            try {
                int i = message.what;
                if (i == 1) {
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.ensureClassLoader(bundle);
                    mediaBrowserServiceCallbackImpl.onServiceConnected(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                } else if (i == 2) {
                    mediaBrowserServiceCallbackImpl.onConnectionFailed(messenger);
                } else if (i == 3) {
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.ensureClassLoader(bundle2);
                    Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                    MediaSessionCompat.ensureClassLoader(bundle3);
                    mediaBrowserServiceCallbackImpl.onLoadChildren(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                } else {
                    Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                if (message.what == 1) {
                    mediaBrowserServiceCallbackImpl.onConnectionFailed(messenger);
                }
            }
        }

        void setCallbacksMessenger(Messenger messenger) {
            this.mCallbacksMessengerRef = new WeakReference(messenger);
        }
    }

    private static class ServiceBinderWrapper {
        private Messenger mMessenger;
        private Bundle mRootHints;

        public ServiceBinderWrapper(IBinder iBinder, Bundle bundle) {
            this.mMessenger = new Messenger(iBinder);
            this.mRootHints = bundle;
        }

        void registerCallbackMessenger(Context context, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.mRootHints);
            sendRequest(6, bundle, messenger);
        }

        void unregisterCallbackMessenger(Messenger messenger) {
            sendRequest(7, null, messenger);
        }

        private void sendRequest(int i, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.mMessenger.send(obtain);
        }
    }

    private static class ItemReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        protected void onReceiveResult(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.unparcelWithClassLoader(bundle);
            }
            if (i != 0) {
                throw null;
            }
            if (bundle != null) {
                if (!bundle.containsKey("media_item")) {
                    throw null;
                }
                Parcelable parcelable = bundle.getParcelable("media_item");
                if (parcelable == null || (parcelable instanceof MediaItem)) {
                    throw null;
                }
                throw null;
            }
            throw null;
        }
    }

    private static class SearchResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        protected void onReceiveResult(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.unparcelWithClassLoader(bundle);
            }
            if (i != 0) {
                throw null;
            }
            if (bundle != null) {
                if (!bundle.containsKey("search_results")) {
                    throw null;
                }
                Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
                parcelableArray.getClass();
                ArrayList arrayList = new ArrayList(parcelableArray.length);
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
                throw null;
            }
            throw null;
        }
    }
}
