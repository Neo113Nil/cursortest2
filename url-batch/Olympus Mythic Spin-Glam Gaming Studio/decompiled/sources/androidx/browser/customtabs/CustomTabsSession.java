package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.support.customtabs.IEngagementSignalsCallback;
import androidx.annotation.RestrictTo;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes13.dex */
public final class CustomTabsSession {
    private final ICustomTabsCallback mCallback;
    private final ComponentName mComponentName;
    private final PendingIntent mId;
    private final Object mLock = new Object();
    private final ICustomTabsService mService;

    static class MockSession extends ICustomTabsService.Stub {
        @Override // android.support.customtabs.ICustomTabsService
        public Bundle extraCommand(String str, Bundle bundle) {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean isEngagementSignalsApiAvailable(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List list) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSession(ICustomTabsCallback iCustomTabsCallback) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
            return 0;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean setEngagementSignalsCallback(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i, Uri uri, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean warmup(long j) {
            return false;
        }
    }

    @RestrictTo
    public static class PendingSession {
    }

    CustomTabsSession(ICustomTabsService iCustomTabsService, ICustomTabsCallback iCustomTabsCallback, ComponentName componentName, PendingIntent pendingIntent) {
        this.mService = iCustomTabsService;
        this.mCallback = iCustomTabsCallback;
        this.mComponentName = componentName;
        this.mId = pendingIntent;
    }

    public boolean mayLaunchUrl(Uri uri, Bundle bundle, List list) {
        try {
            return this.mService.mayLaunchUrl(this.mCallback, uri, createBundleWithId(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean requestPostMessageChannel(Uri uri) {
        return requestPostMessageChannel(uri, null, new Bundle());
    }

    public boolean requestPostMessageChannel(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle createPostMessageExtraBundle = createPostMessageExtraBundle(uri2);
            if (createPostMessageExtraBundle != null) {
                bundle.putAll(createPostMessageExtraBundle);
                return this.mService.requestPostMessageChannelWithExtras(this.mCallback, uri, bundle);
            }
            return this.mService.requestPostMessageChannel(this.mCallback, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int postMessage(String str, Bundle bundle) {
        int postMessage;
        Bundle createBundleWithId = createBundleWithId(bundle);
        synchronized (this.mLock) {
            try {
                try {
                    postMessage = this.mService.postMessage(this.mCallback, str, createBundleWithId);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return postMessage;
    }

    public boolean validateRelationship(int i, Uri uri, Bundle bundle) {
        if (i >= 1 && i <= 2) {
            try {
                return this.mService.validateRelationship(this.mCallback, i, uri, createBundleWithId(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public boolean isEngagementSignalsApiAvailable(Bundle bundle) {
        try {
            return this.mService.isEngagementSignalsApiAvailable(this.mCallback, createBundleWithId(bundle));
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }

    public boolean setEngagementSignalsCallback(EngagementSignalsCallback engagementSignalsCallback, Bundle bundle) {
        try {
            return this.mService.setEngagementSignalsCallback(this.mCallback, createEngagementSignalsCallbackWrapper(engagementSignalsCallback).asBinder(), createBundleWithId(bundle));
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }

    /* renamed from: androidx.browser.customtabs.CustomTabsSession$1, reason: invalid class name */
    class AnonymousClass1 extends IEngagementSignalsCallback.Stub {
        private final Handler mHandler = new Handler(Looper.getMainLooper());
        final /* synthetic */ EngagementSignalsCallback val$callback;

        AnonymousClass1(EngagementSignalsCallback engagementSignalsCallback) {
            this.val$callback = engagementSignalsCallback;
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onVerticalScrollEvent(final boolean z, final Bundle bundle) {
            Handler handler = this.mHandler;
            final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    EngagementSignalsCallback.this.onVerticalScrollEvent(z, bundle);
                }
            });
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onGreatestScrollPercentageIncreased(final int i, final Bundle bundle) {
            Handler handler = this.mHandler;
            final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    EngagementSignalsCallback.this.onGreatestScrollPercentageIncreased(i, bundle);
                }
            });
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onSessionEnded(final boolean z, final Bundle bundle) {
            Handler handler = this.mHandler;
            final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    EngagementSignalsCallback.this.onSessionEnded(z, bundle);
                }
            });
        }
    }

    private IEngagementSignalsCallback.Stub createEngagementSignalsCallbackWrapper(EngagementSignalsCallback engagementSignalsCallback) {
        return new AnonymousClass1(engagementSignalsCallback);
    }

    /* renamed from: androidx.browser.customtabs.CustomTabsSession$2, reason: invalid class name */
    class AnonymousClass2 extends IEngagementSignalsCallback.Stub {
        private final Executor mExecutor;
        final /* synthetic */ EngagementSignalsCallback val$callback;

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onVerticalScrollEvent(final boolean z, final Bundle bundle) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.mExecutor;
                final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
                executor.execute(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        EngagementSignalsCallback.this.onVerticalScrollEvent(z, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onGreatestScrollPercentageIncreased(final int i, final Bundle bundle) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.mExecutor;
                final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
                executor.execute(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$2$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        EngagementSignalsCallback.this.onGreatestScrollPercentageIncreased(i, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onSessionEnded(final boolean z, final Bundle bundle) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.mExecutor;
                final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
                executor.execute(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$2$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        EngagementSignalsCallback.this.onSessionEnded(z, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    private Bundle createPostMessageExtraBundle(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable("target_origin", uri);
        }
        if (this.mId != null) {
            addIdToBundle(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    private Bundle createBundleWithId(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        addIdToBundle(bundle2);
        return bundle2;
    }

    private void addIdToBundle(Bundle bundle) {
        PendingIntent pendingIntent = this.mId;
        if (pendingIntent != null) {
            bundle.putParcelable(CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
        }
    }

    IBinder getBinder() {
        return this.mCallback.asBinder();
    }

    ComponentName getComponentName() {
        return this.mComponentName;
    }

    PendingIntent getId() {
        return this.mId;
    }
}
