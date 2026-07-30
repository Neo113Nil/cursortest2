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
import com.unity3d.player.a.C0140d;
import com.unity3d.player.a.C0143g;
import com.unity3d.player.a.C0152p;
import com.unity3d.player.a.EnumC0151o;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class UnityPlayerForActivityOrService extends UnityPlayer {
    private boolean mMainDisplayOverride;
    private com.unity3d.player.a.y mOnHandleFocusListener;
    private boolean mProcessKillRequested;
    private com.unity3d.player.a.r mSoftInput;
    private long mSoftInputTimeoutMilliSeconds;
    private int m_IsNoWindowMode;
    private Y m_MainThread;

    private final native boolean nativeDone();

    private final native boolean nativeGetNoWindowMode();

    private final native void nativeMemoryUsageChanged(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeOnApplyWindowInsets(WindowInsets windowInsets);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean nativePause();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeRecreateGfxState(int i, Surface surface);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeReportKeyboardConfigChanged();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeResume();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSendSurfaceChangedEvent();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputArea(int i, int i2, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputSelection(int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputString(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetKeyboardIsVisible(boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputCanceled();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputClosed();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputLostFocus();

    final native void nativeConfigurationChanged(Configuration configuration);

    final native void nativeFocusChanged(boolean z);

    final native void nativeOrientationChanged(int i, int i2);

    final native boolean nativeRender();

    public void onTrimMemory(MemoryUsage memoryUsage) {
        if (com.unity3d.player.a.S.e) {
            nativeMemoryUsageChanged(memoryUsage.value);
        }
    }

    public enum SynchronizationTimeout {
        Pause(0),
        SurfaceDetach(1),
        Destroy(2);

        private int m_TimeoutMilliseconds = 2000;
        final int value;

        SynchronizationTimeout(int i) {
            this.value = i;
        }

        public void setTimeout(int i) {
            this.m_TimeoutMilliseconds = i;
        }

        public static void setTimeoutForAll(int i) {
            for (SynchronizationTimeout synchronizationTimeout : (SynchronizationTimeout[]) SynchronizationTimeout.class.getEnumConstants()) {
                synchronizationTimeout.setTimeout(i);
            }
        }

        public int getTimeout() {
            return this.m_TimeoutMilliseconds;
        }
    }

    public enum MemoryUsage {
        Low(1),
        Medium(2),
        High(3),
        Critical(4);

        public final int value;

        MemoryUsage(int i) {
            this.value = i;
        }
    }

    public UnityPlayerForActivityOrService(Context context) {
        this(context, null, "", new C0140d());
    }

    public UnityPlayerForActivityOrService(Context context, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents) {
        this(context, iUnityPlayerLifecycleEvents, "", new C0140d());
    }

    public UnityPlayerForActivityOrService(Context context, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents, String str) {
        this(context, iUnityPlayerLifecycleEvents, str, new C0140d());
    }

    UnityPlayerForActivityOrService(Context context, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents, String str, C0140d c0140d) {
        super(context, EnumC0151o.b, iUnityPlayerLifecycleEvents);
        Y y = new Y(this);
        this.m_MainThread = y;
        this.mMainDisplayOverride = false;
        C0152p c0152p = null;
        this.mSoftInput = null;
        this.m_IsNoWindowMode = -1;
        this.mProcessKillRequested = true;
        this.mSoftInputTimeoutMilliSeconds = 1000L;
        y.start();
        if (c0140d.a) {
            c0152p = new C0152p(context, this);
            c0152p.setOnApplyWindowInsetsListener(new D0(this));
        }
        initialize(c0152p, str);
        Y y2 = this.m_MainThread;
        y2.getClass();
        try {
            y2.b.await();
        } catch (InterruptedException e) {
            com.unity3d.player.a.t.Log(6, "UnityMainThread was interrupted:" + e.toString());
        }
    }

    public void setOnHandleFocusListener(com.unity3d.player.a.y yVar) {
        this.mOnHandleFocusListener = yVar;
    }

    @Override // com.unity3d.player.UnityPlayer
    public void configurationChanged(Configuration configuration) {
        super.configurationChanged(configuration);
        if (isNativeInitialized()) {
            invokeOnMainThread(new G0(this, new Configuration(configuration)));
        }
    }

    void sendSurfaceChangedEvent() {
        if (isNativeInitialized()) {
            Message.obtain(this.m_MainThread.c, new H0(this)).sendToTarget();
        }
    }

    void updateGLDisplay(int i, Surface surface) {
        if (this.mMainDisplayOverride) {
            return;
        }
        updateDisplayInternal(i, surface);
    }

    private boolean updateDisplayInternal(int i, Surface surface) {
        if (!isNativeInitialized()) {
            return false;
        }
        Semaphore semaphore = new Semaphore(0);
        I0 i0 = new I0(this, i, surface, semaphore);
        boolean isMainWindow = isMainWindow(i);
        if (!isMainWindow) {
            i0.run();
        } else if (surface == null) {
            Y y = this.m_MainThread;
            Message.obtain(y.c, 2269, X.d).sendToTarget();
            Message.obtain(y.c, i0).sendToTarget();
        } else {
            Y y2 = this.m_MainThread;
            Message.obtain(y2.c, i0).sendToTarget();
            Message.obtain(y2.c, 2269, X.e).sendToTarget();
        }
        if (!isMainWindow || surface != null) {
            return true;
        }
        try {
            SynchronizationTimeout synchronizationTimeout = SynchronizationTimeout.SurfaceDetach;
            if (semaphore.tryAcquire(synchronizationTimeout.getTimeout(), TimeUnit.MILLISECONDS)) {
                return true;
            }
            com.unity3d.player.a.t.Log(5, "Timeout (" + synchronizationTimeout.getTimeout() + " ms) while trying detaching primary window.");
            return true;
        } catch (InterruptedException unused) {
            com.unity3d.player.a.t.Log(5, "UI thread got interrupted while trying to detach the primary window from the Unity Engine.");
            return true;
        }
    }

    private boolean isMainWindow(int i) {
        return i == nativeGetMainWindowIndex();
    }

    public boolean displayChanged(int i, Surface surface) {
        if (isMainWindow(i) && getFrameLayout() != null) {
            this.mMainDisplayOverride = surface != null;
            runOnUiThread(new J0(this));
        }
        return updateDisplayInternal(i, surface);
    }

    private void raiseFocusListener(boolean z) {
        com.unity3d.player.a.y yVar = this.mOnHandleFocusListener;
        if (yVar != null) {
            RunnableC0193t0 runnableC0193t0 = ((C0189r0) yVar).a;
            runnableC0193t0.b = true;
            if (runnableC0193t0.a) {
                runnableC0193t0.c.release();
            }
        }
    }

    @Override // com.unity3d.player.UnityPlayer
    boolean handleFocus(boolean z) {
        com.unity3d.player.a.r rVar;
        Y y;
        X x;
        if (this.mState.d && ((rVar = this.mSoftInput) == null || rVar.isConsumeOutsideTouchesEnabled())) {
            if (z) {
                y = this.m_MainThread;
                x = X.g;
            } else {
                y = this.m_MainThread;
                x = X.f;
            }
            Message.obtain(y.c, 2269, x).sendToTarget();
            raiseFocusListener(z);
            return true;
        }
        raiseFocusListener(z);
        return false;
    }

    @Override // com.unity3d.player.UnityPlayer
    void resumeUnity() {
        super.resumeUnity();
        invokeOnMainThread(new K0(this));
        Y y = this.m_MainThread;
        Message.obtain(y.c, 2269, X.b).sendToTarget();
    }

    @Override // com.unity3d.player.UnityPlayer
    void hidePreservedContent() {
        if (getFrameLayout() == null) {
            return;
        }
        runOnUiThread(new L0(this));
    }

    @Override // com.unity3d.player.UnityPlayer
    public void setMainSurfaceViewAspectRatio(float f) {
        if (getFrameLayout() == null) {
            return;
        }
        runOnUiThread(new M0(this, f));
    }

    @Override // com.unity3d.player.UnityPlayer
    public boolean runningOnMainThread() {
        return Thread.currentThread() == this.m_MainThread;
    }

    protected void showSoftInput(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, boolean z5, boolean z6) {
        Semaphore semaphore = new Semaphore(0);
        postOnUiThread(new O0(this, this, str, i, z, z2, z3, z4, str2, i2, z5, z6, semaphore));
        try {
            if (semaphore.tryAcquire(getSoftInputTimeout(), TimeUnit.MILLISECONDS)) {
                return;
            }
            com.unity3d.player.a.t.Log(6, "Timeout (" + getSoftInputTimeout() + " ms) while waiting softinput showing operation.");
        } catch (InterruptedException unused) {
            com.unity3d.player.a.t.Log(6, "UI thread got interrupted while waiting softinput showing operation.");
        }
    }

    private long getSoftInputTimeout() {
        return Math.round(this.mSoftInputTimeoutMilliSeconds * Math.max(1.0f, Settings.System.getFloat(this.mContext.getContentResolver(), "animator_duration_scale", 0.0f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissSoftInput() {
        com.unity3d.player.a.r rVar = this.mSoftInput;
        if (rVar != null) {
            rVar.hide();
            nativeReportKeyboardConfigChanged();
        }
    }

    protected void resetSoftInput() {
        this.mSoftInput = null;
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
        postOnUiThread(new RunnableC0193t0(this, semaphore, this));
        try {
            if (!semaphore.tryAcquire(getSoftInputTimeout(), TimeUnit.MILLISECONDS)) {
                com.unity3d.player.a.t.Log(6, "Timeout (" + getSoftInputTimeout() + " ms) while waiting softinput hiding operation.");
            }
        } catch (InterruptedException unused) {
            com.unity3d.player.a.t.Log(6, "UI thread got interrupted while waiting softinput hiding operation.");
        } finally {
            this.mSoftInput = null;
        }
    }

    protected void setSoftInputStr(String str) {
        runOnUiThread(new RunnableC0195u0(this, str));
    }

    protected void setCharacterLimit(int i) {
        runOnUiThread(new RunnableC0197v0(this, i));
    }

    protected void setHideInputField(boolean z) {
        runOnUiThread(new RunnableC0199w0(this, z));
    }

    protected void setSelection(int i, int i2) {
        runOnUiThread(new RunnableC0201x0(this, i, i2));
    }

    protected void reportSoftInputStr(String str, int i, boolean z) {
        if (i == 1) {
            hideSoftInput();
        }
        invokeOnMainThread((Runnable) new C0203y0(this, z, str, i));
    }

    protected void reportSoftInputSelection(int i, int i2) {
        invokeOnMainThread((Runnable) new C0205z0(this, i, i2));
    }

    protected void reportSoftInputArea(Rect rect) {
        invokeOnMainThread((Runnable) new A0(this, rect));
    }

    protected void reportSoftInputIsVisible(boolean z) {
        invokeOnMainThread((Runnable) new B0(this, z));
    }

    boolean getHaveAndroidWindowSupport() {
        if (this.m_IsNoWindowMode == -1) {
            this.m_IsNoWindowMode = nativeGetNoWindowMode() ? 1 : 0;
        }
        return this.m_IsNoWindowMode == 1;
    }

    @Override // com.unity3d.player.UnityPlayer
    void cleanupResourcesForDestroy() {
        Message.obtain(this.m_MainThread.c, 2269, X.c).sendToTarget();
        try {
            this.m_MainThread.join(SynchronizationTimeout.Destroy.getTimeout());
        } catch (InterruptedException unused) {
            this.m_MainThread.interrupt();
        }
        if (com.unity3d.player.a.S.e && getFrameLayout() != null) {
            getFrameLayout().removeAllViews();
        }
        if (this.mProcessKillRequested) {
            this.m_UnityPlayerLifecycleEvents.onUnityPlayerQuitted();
            kill();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void queueDestroy() {
        com.unity3d.player.a.t.Log(4, "Queue Destroy");
        runOnUiThread(new C0(this));
    }

    @Override // com.unity3d.player.UnityPlayer
    void pauseUnity() {
        Runnable f0;
        super.pauseUnity();
        reportSoftInputStr(null, 1, true);
        com.unity3d.player.a.S s = this.mState;
        s.b = false;
        s.c = true;
        if (com.unity3d.player.a.S.e) {
            Semaphore semaphore = new Semaphore(0);
            if (isFinishing()) {
                f0 = new E0(this, semaphore);
            } else {
                f0 = new F0(this, semaphore);
            }
            Y y = this.m_MainThread;
            Message.obtain(y.c, 2269, X.a).sendToTarget();
            Message.obtain(y.c, f0).sendToTarget();
            try {
                SynchronizationTimeout synchronizationTimeout = SynchronizationTimeout.Pause;
                if (!semaphore.tryAcquire(synchronizationTimeout.getTimeout(), TimeUnit.MILLISECONDS)) {
                    com.unity3d.player.a.t.Log(5, "Timeout (" + synchronizationTimeout.getTimeout() + " ms) while trying to pause the Unity Engine.");
                }
            } catch (InterruptedException unused) {
                com.unity3d.player.a.t.Log(5, "UI thread got interrupted while trying to pause the Unity Engine.");
            }
        }
        if (this.m_AddPhoneCallListener) {
            this.m_TelephonyManager.listen(this.m_PhoneCallListener, 0);
        }
    }

    @Override // com.unity3d.player.UnityPlayer
    void shutdown() {
        this.mProcessKillRequested = nativeDone();
        super.shutdown();
    }

    @Override // com.unity3d.player.UnityPlayer
    void onOrientationChanged(int i, int i2) {
        Y y = this.m_MainThread;
        y.h = this.mNaturalOrientation;
        y.i = i2;
        Message.obtain(y.c, 2269, X.i).sendToTarget();
    }

    @Override // com.unity3d.player.UnityPlayer
    public V getView() {
        FrameLayout frameLayout = getFrameLayout();
        if (frameLayout == null) {
            return null;
        }
        return ((C0152p) frameLayout).b;
    }

    @Override // com.unity3d.player.UnityPlayer
    public C0143g getSurfaceView() {
        V view = getView();
        if (view == null) {
            return null;
        }
        return view.a;
    }

    @Override // com.unity3d.player.UnityPlayer
    View getViewForPadding() {
        V view = getView();
        C0143g c0143g = view.a;
        return (c0143g == null || c0143g.a <= 0.0f) ? super.getViewForPadding() : view;
    }
}
