package com.unity3d.player;

import android.content.res.Configuration;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Objects;
import java.util.concurrent.Semaphore;

/* loaded from: classes2.dex */
class UnityAccessibilityDelegate extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    private final UnityPlayer f22083a;

    /* renamed from: b, reason: collision with root package name */
    private final SurfaceView f22084b;

    /* renamed from: c, reason: collision with root package name */
    private AccessibilityManager f22085c;

    /* renamed from: d, reason: collision with root package name */
    private P f22086d;

    /* renamed from: e, reason: collision with root package name */
    private CaptioningManager f22087e;

    /* renamed from: f, reason: collision with root package name */
    private S f22088f;

    /* renamed from: g, reason: collision with root package name */
    private int f22089g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f22090h = -1;

    /* renamed from: i, reason: collision with root package name */
    private boolean f22091i = false;

    /* renamed from: j, reason: collision with root package name */
    private float f22092j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    private final N f22093k = new N(this);

    public class a implements View.OnHoverListener {
        public a() {
        }

        @Override // android.view.View.OnHoverListener
        public final boolean onHover(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int hitTest = UnityAccessibilityDelegate.hitTest(motionEvent.getX(), motionEvent.getY());
                UnityAccessibilityDelegate unityAccessibilityDelegate = UnityAccessibilityDelegate.this;
                int i4 = unityAccessibilityDelegate.f22090h;
                if (i4 == hitTest) {
                    return true;
                }
                unityAccessibilityDelegate.f22090h = hitTest;
                if (hitTest != -1) {
                    unityAccessibilityDelegate.sendEventForVirtualViewId(hitTest, UserVerificationMethods.USER_VERIFY_PATTERN);
                }
                if (i4 == -1) {
                    return true;
                }
                unityAccessibilityDelegate.sendEventForVirtualViewId(i4, UserVerificationMethods.USER_VERIFY_HANDPRINT);
                return true;
            }
            if (action != 10) {
                Log.i("a11y", "hover unknown" + motionEvent.toString());
                return true;
            }
            UnityAccessibilityDelegate unityAccessibilityDelegate2 = UnityAccessibilityDelegate.this;
            int i5 = unityAccessibilityDelegate2.f22090h;
            if (i5 == -1) {
                return true;
            }
            unityAccessibilityDelegate2.f22090h = -1;
            if (i5 == -1) {
                return true;
            }
            unityAccessibilityDelegate2.sendEventForVirtualViewId(i5, UserVerificationMethods.USER_VERIFY_HANDPRINT);
            return true;
        }
    }

    UnityAccessibilityDelegate(UnityPlayer unityPlayer) {
        this.f22083a = unityPlayer;
        this.f22084b = unityPlayer.getSurfaceView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native int[] getRootNodeIds();

    /* JADX INFO: Access modifiers changed from: private */
    public static native int hitTest(float f4, float f5);

    protected static UnityAccessibilityDelegate init(UnityPlayer unityPlayer) {
        UnityAccessibilityDelegate unityAccessibilityDelegate = new UnityAccessibilityDelegate(unityPlayer);
        unityAccessibilityDelegate.f22085c = (AccessibilityManager) unityAccessibilityDelegate.f22083a.getContext().getSystemService("accessibility");
        CaptioningManager captioningManager = (CaptioningManager) unityAccessibilityDelegate.f22083a.getContext().getSystemService("captioning");
        unityAccessibilityDelegate.f22087e = captioningManager;
        if (unityAccessibilityDelegate.f22085c != null || captioningManager != null) {
            Semaphore semaphore = new Semaphore(0);
            unityAccessibilityDelegate.f22083a.runOnUiThread(new E(unityAccessibilityDelegate, semaphore));
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
            }
        }
        unityAccessibilityDelegate.f22092j = unityAccessibilityDelegate.f22083a.getContext().getResources().getConfiguration().fontScale;
        unityAccessibilityDelegate.f22083a.setAccessibilityDelegate(unityAccessibilityDelegate);
        return unityAccessibilityDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean isNodeDismissable(int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean isNodeInvokable(int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean isNodeScrollable(int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean isNodeSlider(int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void onClosedCaptioningStatusChanged(boolean z4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void onFontScaleChanged(float f4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean onNodeDecremented(int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean onNodeDismissed(int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void onNodeFocusChanged(int i4, boolean z4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean onNodeIncremented(int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean onNodeInvoked(int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean onNodeScrolled(int i4, int i5);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void onScreenReaderStatusChanged(boolean z4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean populateNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo, int i4, View view);

    protected void cleanup() {
        P p4 = this.f22086d;
        if (p4 != null) {
            p4.cleanup();
        }
        S s4 = this.f22088f;
        if (s4 != null) {
            s4.cleanup();
        }
        this.f22083a.setAccessibilityDelegate(null);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        return this.f22093k;
    }

    protected int getFocusedNodeId() {
        return this.f22089g;
    }

    protected boolean sendAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ViewGroup viewGroup;
        if (accessibilityEvent == null || (viewGroup = (ViewGroup) this.f22084b.getParent()) == null) {
            return false;
        }
        return viewGroup.requestSendAccessibilityEvent(this.f22084b, accessibilityEvent);
    }

    protected boolean sendAnnouncementForVirtualViewId(int i4, String str) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
        obtain.setEnabled(true);
        obtain.setSource(this.f22084b, i4);
        obtain.getText().add(str);
        return sendAccessibilityEvent(obtain);
    }

    protected boolean sendEventForVirtualViewId(int i4, int i5) {
        if (!this.f22085c.isEnabled()) {
            return false;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i5);
        obtain.setEnabled(true);
        obtain.setSource(this.f22084b, i4);
        if (i5 == 2048) {
            obtain.setContentChangeTypes(1);
        }
        if (i5 == 32768) {
            if (this.f22089g == i4) {
                return false;
            }
            this.f22089g = i4;
            this.f22084b.invalidate();
            UnityPlayer unityPlayer = this.f22083a;
            Objects.requireNonNull(unityPlayer);
            this.f22083a.invokeOnMainThread((Runnable) new H(unityPlayer, i4));
        }
        if (i5 == 65536) {
            if (this.f22089g == i4) {
                this.f22089g = -1;
            }
            this.f22084b.invalidate();
            UnityPlayer unityPlayer2 = this.f22083a;
            Objects.requireNonNull(unityPlayer2);
            this.f22083a.invokeOnMainThread((Runnable) new I(unityPlayer2, i4));
        }
        return sendAccessibilityEvent(obtain);
    }

    protected boolean sendEventForVirtualViewIdFromNative(int i4, int i5) {
        this.f22083a.runOnUiThread(new G(this, i4, i5));
        return true;
    }

    public final void a(Configuration configuration) {
        float f4 = configuration.fontScale;
        if (f4 != this.f22092j) {
            this.f22092j = f4;
            UnityPlayer unityPlayer = this.f22083a;
            Objects.requireNonNull(unityPlayer);
            this.f22083a.invokeOnMainThread((Runnable) new F(unityPlayer, configuration));
        }
    }
}
