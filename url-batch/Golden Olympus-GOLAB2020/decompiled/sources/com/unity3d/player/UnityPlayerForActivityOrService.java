package com.unity3d.player;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.view.Surface;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import h1.C2439A;
import h1.C2457s;
import h1.C2461w;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class UnityPlayerForActivityOrService extends UnityPlayer {
    private boolean mMainDisplayOverride;
    private h1.Y mOnHandleFocusListener;
    private boolean mProcessKillRequested;
    private h1.Q mSoftInput;
    private long mSoftInputTimeoutMilliSeconds;
    private int m_IsNoWindowMode;
    private X m_MainThread;

    public enum MemoryUsage {
        Low(1),
        Medium(2),
        High(3),
        Critical(4);

        public final int value;

        MemoryUsage(int i4) {
            this.value = i4;
        }
    }

    public enum SynchronizationTimeout {
        Pause(0),
        SurfaceDetach(1),
        Destroy(2);

        private int m_TimeoutMilliseconds = 2000;
        final int value;

        SynchronizationTimeout(int i4) {
            this.value = i4;
        }

        public static void setTimeoutForAll(int i4) {
            for (SynchronizationTimeout synchronizationTimeout : (SynchronizationTimeout[]) SynchronizationTimeout.class.getEnumConstants()) {
                synchronizationTimeout.setTimeout(i4);
            }
        }

        public int getTimeout() {
            return this.m_TimeoutMilliseconds;
        }

        public void setTimeout(int i4) {
            this.m_TimeoutMilliseconds = i4;
        }
    }

    public UnityPlayerForActivityOrService(Context context) {
        this(context, null, "", new C2461w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissSoftInput() {
        h1.Q q4 = this.mSoftInput;
        if (q4 != null) {
            q4.hide();
            nativeReportKeyboardConfigChanged();
        }
    }

    private long getSoftInputTimeout() {
        return Math.round(this.mSoftInputTimeoutMilliSeconds * Math.max(1.0f, Settings.System.getFloat(this.mContext.getContentResolver(), "animator_duration_scale", 0.0f)));
    }

    private boolean isMainWindow(int i4) {
        return i4 == nativeGetMainWindowIndex();
    }

    private final native boolean nativeDone();

    private final native boolean nativeGetNoWindowMode();

    private final native void nativeMemoryUsageChanged(int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeOnApplyWindowInsets(WindowInsets windowInsets);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean nativePause();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeRecreateGfxState(int i4, Surface surface);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeReportKeyboardConfigChanged();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeResume();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSendSurfaceChangedEvent();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputArea(int i4, int i5, int i6, int i7);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputSelection(int i4, int i5);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputString(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetKeyboardIsVisible(boolean z4);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputCanceled();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputClosed();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputLostFocus();

    /* JADX INFO: Access modifiers changed from: private */
    public void queueDestroy() {
        h1.T.a(4, "Queue Destroy");
        runOnUiThread(new B0(this));
    }

    private void raiseFocusListener(boolean z4) {
        h1.Y y4 = this.mOnHandleFocusListener;
        if (y4 != null) {
            RunnableC1775s0 runnableC1775s0 = ((C1771q0) y4).f22236a;
            runnableC1775s0.f22248b = true;
            if (runnableC1775s0.f22247a) {
                runnableC1775s0.f22249c.release();
            }
        }
    }

    private boolean updateDisplayInternal(int i4, Surface surface) {
        if (!isNativeInitialized()) {
            return false;
        }
        Semaphore semaphore = new Semaphore(0);
        H0 h02 = new H0(this, i4, surface, semaphore);
        boolean isMainWindow = isMainWindow(i4);
        if (!isMainWindow) {
            h02.run();
        } else if (surface == null) {
            X x4 = this.m_MainThread;
            Message.obtain(x4.f22114c, 2269, W.f22105d).sendToTarget();
            Message.obtain(x4.f22114c, h02).sendToTarget();
        } else {
            X x5 = this.m_MainThread;
            Message.obtain(x5.f22114c, h02).sendToTarget();
            Message.obtain(x5.f22114c, 2269, W.f22106e).sendToTarget();
        }
        if (!isMainWindow || surface != null) {
            return true;
        }
        try {
            SynchronizationTimeout synchronizationTimeout = SynchronizationTimeout.SurfaceDetach;
            if (semaphore.tryAcquire(synchronizationTimeout.getTimeout(), TimeUnit.MILLISECONDS)) {
                return true;
            }
            h1.T.a(5, "Timeout (" + synchronizationTimeout.getTimeout() + " ms) while trying detaching primary window.");
            return true;
        } catch (InterruptedException unused) {
            h1.T.a(5, "UI thread got interrupted while trying to detach the primary window from the Unity Engine.");
            return true;
        }
    }

    @Override // com.unity3d.player.UnityPlayer
    void cleanupResourcesForDestroy() {
        Message.obtain(this.m_MainThread.f22114c, 2269, W.f22104c).sendToTarget();
        try {
            this.m_MainThread.join(SynchronizationTimeout.Destroy.getTimeout());
        } catch (InterruptedException unused) {
            this.m_MainThread.interrupt();
        }
        if (C2457s.f36757e && getFrameLayout() != null) {
            getFrameLayout().removeAllViews();
        }
        if (this.mProcessKillRequested) {
            this.m_UnityPlayerLifecycleEvents.onUnityPlayerQuitted();
            kill();
        }
    }

    @Override // com.unity3d.player.UnityPlayer
    public void configurationChanged(Configuration configuration) {
        super.configurationChanged(configuration);
        if (isNativeInitialized()) {
            invokeOnMainThread(new F0(this, new Configuration(configuration)));
        }
    }

    public boolean displayChanged(int i4, Surface surface) {
        if (isMainWindow(i4) && getFrameLayout() != null) {
            this.mMainDisplayOverride = surface != null;
            runOnUiThread(new I0(this));
        }
        return updateDisplayInternal(i4, surface);
    }

    boolean getHaveAndroidWindowSupport() {
        if (this.m_IsNoWindowMode == -1) {
            this.m_IsNoWindowMode = nativeGetNoWindowMode() ? 1 : 0;
        }
        return this.m_IsNoWindowMode == 1;
    }

    @Override // com.unity3d.player.UnityPlayer
    View getViewForPadding() {
        U view = getView();
        C2439A c2439a = view.f22080a;
        return (c2439a == null || c2439a.f36700a <= 0.0f) ? getFrameLayout() : view;
    }

    @Override // com.unity3d.player.UnityPlayer
    boolean handleFocus(boolean z4) {
        h1.Q q4;
        X x4;
        W w4;
        if (!this.mState.f36761d || ((q4 = this.mSoftInput) != null && !q4.isConsumeOutsideTouchesEnabled())) {
            raiseFocusListener(z4);
            return false;
        }
        if (z4) {
            x4 = this.m_MainThread;
            w4 = W.f22108g;
        } else {
            x4 = this.m_MainThread;
            w4 = W.f22107f;
        }
        Message.obtain(x4.f22114c, 2269, w4).sendToTarget();
        raiseFocusListener(z4);
        return true;
    }

    @Override // com.unity3d.player.UnityPlayer
    void hidePreservedContent() {
        if (getFrameLayout() == null) {
            return;
        }
        runOnUiThread(new K0(this));
    }

    protected void hideSoftInput() {
        if (this.mSoftInput == null) {
            return;
        }
        reportSoftInputArea(new Rect());
        reportSoftInputIsVisible(false);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            dismissSoftInput();
            resetSoftInput();
            return;
        }
        Semaphore semaphore = new Semaphore(0);
        postOnUiThread(new RunnableC1775s0(this, semaphore, this));
        try {
            if (!semaphore.tryAcquire(getSoftInputTimeout(), TimeUnit.MILLISECONDS)) {
                h1.T.a(6, "Timeout (" + getSoftInputTimeout() + " ms) while waiting softinput hiding operation.");
            }
        } catch (InterruptedException unused) {
            h1.T.a(6, "UI thread got interrupted while waiting softinput hiding operation.");
        } finally {
            this.mSoftInput = null;
        }
    }

    final native void nativeConfigurationChanged(Configuration configuration);

    final native void nativeFocusChanged(boolean z4);

    final native void nativeOrientationChanged(int i4, int i5);

    final native boolean nativeRender();

    @Override // com.unity3d.player.UnityPlayer
    void onOrientationChanged(int i4, int i5) {
        X x4 = this.m_MainThread;
        x4.f22119h = this.mNaturalOrientation;
        x4.f22120i = i5;
        Message.obtain(x4.f22114c, 2269, W.f22110i).sendToTarget();
    }

    public void onTrimMemory(MemoryUsage memoryUsage) {
        if (C2457s.f36757e) {
            nativeMemoryUsageChanged(memoryUsage.value);
        }
    }

    @Override // com.unity3d.player.UnityPlayer
    void pauseUnity() {
        super.pauseUnity();
        reportSoftInputStr(null, 1, true);
        C2457s c2457s = this.mState;
        c2457s.f36759b = false;
        c2457s.f36760c = true;
        if (C2457s.f36757e) {
            Semaphore semaphore = new Semaphore(0);
            Runnable d02 = isFinishing() ? new D0(this, semaphore) : new E0(this, semaphore);
            X x4 = this.m_MainThread;
            Message.obtain(x4.f22114c, 2269, W.f22102a).sendToTarget();
            Message.obtain(x4.f22114c, d02).sendToTarget();
            try {
                SynchronizationTimeout synchronizationTimeout = SynchronizationTimeout.Pause;
                if (!semaphore.tryAcquire(synchronizationTimeout.getTimeout(), TimeUnit.MILLISECONDS)) {
                    h1.T.a(5, "Timeout (" + synchronizationTimeout.getTimeout() + " ms) while trying to pause the Unity Engine.");
                }
            } catch (InterruptedException unused) {
                h1.T.a(5, "UI thread got interrupted while trying to pause the Unity Engine.");
            }
        }
        if (this.m_AddPhoneCallListener) {
            this.m_TelephonyManager.listen(this.m_PhoneCallListener, 0);
        }
    }

    protected void reportSoftInputArea(Rect rect) {
        invokeOnMainThread((Runnable) new C1789z0(this, rect));
    }

    protected void reportSoftInputIsVisible(boolean z4) {
        invokeOnMainThread((Runnable) new A0(this, z4));
    }

    protected void reportSoftInputSelection(int i4, int i5) {
        invokeOnMainThread((Runnable) new C1787y0(this, i4, i5));
    }

    protected void reportSoftInputStr(String str, int i4, boolean z4) {
        if (i4 == 1) {
            hideSoftInput();
        }
        invokeOnMainThread((Runnable) new C1785x0(this, z4, str, i4));
    }

    protected void resetSoftInput() {
        this.mSoftInput = null;
    }

    @Override // com.unity3d.player.UnityPlayer
    void resumeUnity() {
        super.resumeUnity();
        invokeOnMainThread(new J0(this));
        X x4 = this.m_MainThread;
        Message.obtain(x4.f22114c, 2269, W.f22103b).sendToTarget();
    }

    @Override // com.unity3d.player.UnityPlayer
    public boolean runningOnMainThread() {
        return Thread.currentThread() == this.m_MainThread;
    }

    void sendSurfaceChangedEvent() {
        if (isNativeInitialized()) {
            Message.obtain(this.m_MainThread.f22114c, new G0(this)).sendToTarget();
        }
    }

    protected void setCharacterLimit(int i4) {
        runOnUiThread(new RunnableC1779u0(this, i4));
    }

    protected void setHideInputField(boolean z4) {
        runOnUiThread(new RunnableC1781v0(this, z4));
    }

    @Override // com.unity3d.player.UnityPlayer
    public void setMainSurfaceViewAspectRatio(float f4) {
        if (getFrameLayout() == null) {
            return;
        }
        runOnUiThread(new L0(this, f4));
    }

    public void setOnHandleFocusListener(h1.Y y4) {
        this.mOnHandleFocusListener = y4;
    }

    protected void setSelection(int i4, int i5) {
        runOnUiThread(new RunnableC1783w0(this, i4, i5));
    }

    protected void setSoftInputStr(String str) {
        runOnUiThread(new RunnableC1777t0(this, str));
    }

    protected void showSoftInput(String str, int i4, boolean z4, boolean z5, boolean z6, boolean z7, String str2, int i5, boolean z8, boolean z9) {
        Semaphore semaphore = new Semaphore(0);
        postOnUiThread(new N0(this, this, str, i4, z4, z5, z6, z7, str2, i5, z8, z9, semaphore));
        try {
            if (semaphore.tryAcquire(getSoftInputTimeout(), TimeUnit.MILLISECONDS)) {
                return;
            }
            h1.T.a(6, "Timeout (" + getSoftInputTimeout() + " ms) while waiting softinput showing operation.");
        } catch (InterruptedException unused) {
            h1.T.a(6, "UI thread got interrupted while waiting softinput showing operation.");
        }
    }

    @Override // com.unity3d.player.UnityPlayer
    void shutdown() {
        this.mProcessKillRequested = nativeDone();
        super.shutdown();
    }

    void updateGLDisplay(int i4, Surface surface) {
        if (this.mMainDisplayOverride) {
            return;
        }
        updateDisplayInternal(i4, surface);
    }

    public UnityPlayerForActivityOrService(Context context, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents) {
        this(context, iUnityPlayerLifecycleEvents, "", new C2461w());
    }

    @Override // com.unity3d.player.UnityPlayer
    public C2439A getSurfaceView() {
        U view = getView();
        if (view == null) {
            return null;
        }
        return view.f22080a;
    }

    @Override // com.unity3d.player.UnityPlayer
    public U getView() {
        FrameLayout frameLayout = getFrameLayout();
        if (frameLayout == null) {
            return null;
        }
        return ((h1.O) frameLayout).f36717b;
    }

    public UnityPlayerForActivityOrService(Context context, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents, String str) {
        this(context, iUnityPlayerLifecycleEvents, str, new C2461w());
    }

    UnityPlayerForActivityOrService(Context context, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents, String str, C2461w c2461w) {
        super(context, h1.N.f36713c, iUnityPlayerLifecycleEvents);
        X x4 = new X(this);
        this.m_MainThread = x4;
        this.mMainDisplayOverride = false;
        h1.O o4 = null;
        this.mSoftInput = null;
        this.m_IsNoWindowMode = -1;
        this.mProcessKillRequested = true;
        this.mSoftInputTimeoutMilliSeconds = 1000L;
        x4.start();
        if (c2461w.f36766a) {
            o4 = new h1.O(context, this);
            o4.setOnApplyWindowInsetsListener(new C0(this));
        }
        initialize(o4, str);
        X x5 = this.m_MainThread;
        x5.getClass();
        try {
            x5.f22113b.await();
        } catch (InterruptedException e4) {
            h1.T.a(6, "UnityMainThread was interrupted:" + e4.toString());
        }
    }
}
