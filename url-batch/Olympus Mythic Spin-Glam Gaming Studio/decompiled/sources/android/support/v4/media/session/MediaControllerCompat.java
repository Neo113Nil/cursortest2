package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import androidx.core.app.BundleCompat;
import androidx.versionedparcelable.ParcelUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes11.dex */
public final class MediaControllerCompat {
    private final MediaControllerImpl mImpl;
    private final Set mRegisteredCallbacks;
    private final MediaSessionCompat.Token mToken;

    interface MediaControllerImpl {
        boolean dispatchMediaButtonEvent(KeyEvent keyEvent);
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.mRegisteredCallbacks = Collections.synchronizedSet(new HashSet());
        this.mToken = token;
        if (Build.VERSION.SDK_INT >= 29) {
            this.mImpl = new MediaControllerImplApi29(context, token);
        } else {
            this.mImpl = new MediaControllerImplApi21(context, token);
        }
    }

    public boolean dispatchMediaButtonEvent(KeyEvent keyEvent) {
        if (keyEvent == null) {
            throw new IllegalArgumentException("KeyEvent may not be null");
        }
        return this.mImpl.dispatchMediaButtonEvent(keyEvent);
    }

    public static abstract class Callback implements IBinder.DeathRecipient {

        private static class StubCompat extends IMediaControllerCallback.Stub {
            private final WeakReference mCallback;

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onShuffleModeChangedRemoved(boolean z) {
            }

            StubCompat(Callback callback) {
                this.mCallback = new WeakReference(callback);
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onEvent(String str, Bundle bundle) {
                MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(this.mCallback.get());
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
                MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(this.mCallback.get());
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onCaptioningEnabledChanged(boolean z) {
                MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(this.mCallback.get());
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onRepeatModeChanged(int i) {
                MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(this.mCallback.get());
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onShuffleModeChanged(int i) {
                MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(this.mCallback.get());
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onSessionReady() {
                MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(this.mCallback.get());
            }
        }
    }

    static class MediaControllerImplApi21 implements MediaControllerImpl {
        protected final MediaController mControllerFwk;
        final MediaSessionCompat.Token mSessionToken;
        final Object mLock = new Object();
        private final List mPendingCallbacks = new ArrayList();
        private HashMap mCallbackMap = new HashMap();

        MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.mSessionToken = token;
            this.mControllerFwk = new MediaController(context, (MediaSession.Token) token.getToken());
            if (token.getExtraBinder() == null) {
                requestExtraBinder();
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public boolean dispatchMediaButtonEvent(KeyEvent keyEvent) {
            return this.mControllerFwk.dispatchMediaButtonEvent(keyEvent);
        }

        public void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.mControllerFwk.sendCommand(str, bundle, resultReceiver);
        }

        private void requestExtraBinder() {
            sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        void processPendingCallbacksLocked() {
            if (this.mSessionToken.getExtraBinder() == null) {
                return;
            }
            Iterator it = this.mPendingCallbacks.iterator();
            if (it.hasNext()) {
                MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                this.mCallbackMap.put(null, new ExtraCallback(null));
                throw null;
            }
            this.mPendingCallbacks.clear();
        }

        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            private WeakReference mMediaControllerImpl;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.mMediaControllerImpl = new WeakReference(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.mMediaControllerImpl.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.mLock) {
                    mediaControllerImplApi21.mSessionToken.setExtraBinder(IMediaSession.Stub.asInterface(BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerImplApi21.mSessionToken.setSession2Token(ParcelUtils.getVersionedParcelable(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    mediaControllerImplApi21.processPendingCallbacksLocked();
                }
            }
        }

        private static class ExtraCallback extends Callback.StubCompat {
            ExtraCallback(Callback callback) {
                super(callback);
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onSessionDestroyed() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onQueueChanged(List list) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onQueueTitleChanged(CharSequence charSequence) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onExtrasChanged(Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }
        }
    }

    static class MediaControllerImplApi29 extends MediaControllerImplApi21 {
        MediaControllerImplApi29(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }
}
