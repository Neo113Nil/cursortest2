package N;

import B.w;
import B.x;
import B.y;
import N.b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.h;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.C1280a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a extends C1280a {
    private static final Rect INVALID_PARENT_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final b.a NODE_ADAPTER = new C0019a();
    private static final b.InterfaceC0020b SPARSE_VALUES_ADAPTER = new b();
    private final View mHost;
    private final AccessibilityManager mManager;
    private c mNodeProvider;
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();
    private final int[] mTempGlobalRect = new int[2];
    int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    private int mHoveredVirtualViewId = Integer.MIN_VALUE;

    /* renamed from: N.a$a, reason: collision with other inner class name */
    class C0019a implements b.a {
        C0019a() {
        }

        @Override // N.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(w wVar, Rect rect) {
            wVar.l(rect);
        }
    }

    class b implements b.InterfaceC0020b {
        b() {
        }

        @Override // N.b.InterfaceC0020b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public w a(h hVar, int i4) {
            return (w) hVar.p(i4);
        }

        @Override // N.b.InterfaceC0020b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(h hVar) {
            return hVar.o();
        }
    }

    private class c extends x {
        c() {
        }

        @Override // B.x
        public w b(int i4) {
            return w.Y(a.this.obtainAccessibilityNodeInfo(i4));
        }

        @Override // B.x
        public w d(int i4) {
            int i5 = i4 == 2 ? a.this.mAccessibilityFocusedVirtualViewId : a.this.mKeyboardFocusedVirtualViewId;
            if (i5 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i5);
        }

        @Override // B.x
        public boolean f(int i4, int i5, Bundle bundle) {
            return a.this.performAction(i4, i5, bundle);
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.mHost = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (AbstractC1281a0.A(view) == 0) {
            AbstractC1281a0.z0(view, 1);
        }
    }

    private boolean c(int i4) {
        if (this.mAccessibilityFocusedVirtualViewId != i4) {
            return false;
        }
        this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.mHost.invalidate();
        sendEventForVirtualView(i4, 65536);
        return true;
    }

    private boolean d() {
        int i4 = this.mKeyboardFocusedVirtualViewId;
        return i4 != Integer.MIN_VALUE && onPerformActionForVirtualView(i4, 16, null);
    }

    private AccessibilityEvent e(int i4, int i5) {
        return i4 != -1 ? f(i4, i5) : g(i5);
    }

    private AccessibilityEvent f(int i4, int i5) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i5);
        w obtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i4);
        obtain.getText().add(obtainAccessibilityNodeInfo.A());
        obtain.setContentDescription(obtainAccessibilityNodeInfo.s());
        obtain.setScrollable(obtainAccessibilityNodeInfo.S());
        obtain.setPassword(obtainAccessibilityNodeInfo.R());
        obtain.setEnabled(obtainAccessibilityNodeInfo.L());
        obtain.setChecked(obtainAccessibilityNodeInfo.I());
        onPopulateEventForVirtualView(i4, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(obtainAccessibilityNodeInfo.p());
        y.c(obtain, this.mHost, i4);
        obtain.setPackageName(this.mHost.getContext().getPackageName());
        return obtain;
    }

    private AccessibilityEvent g(int i4) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i4);
        this.mHost.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private w h(int i4) {
        w X3 = w.X();
        X3.q0(true);
        X3.s0(true);
        X3.k0("android.view.View");
        Rect rect = INVALID_PARENT_BOUNDS;
        X3.g0(rect);
        X3.h0(rect);
        X3.A0(this.mHost);
        onPopulateNodeForVirtualView(i4, X3);
        if (X3.A() == null && X3.s() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        X3.l(this.mTempParentRect);
        if (this.mTempParentRect.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int j4 = X3.j();
        if ((j4 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((j4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        X3.y0(this.mHost.getContext().getPackageName());
        X3.H0(this.mHost, i4);
        if (this.mAccessibilityFocusedVirtualViewId == i4) {
            X3.e0(true);
            X3.a(UserVerificationMethods.USER_VERIFY_PATTERN);
        } else {
            X3.e0(false);
            X3.a(64);
        }
        boolean z4 = this.mKeyboardFocusedVirtualViewId == i4;
        if (z4) {
            X3.a(2);
        } else if (X3.M()) {
            X3.a(1);
        }
        X3.t0(z4);
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        X3.m(this.mTempScreenRect);
        if (this.mTempScreenRect.equals(rect)) {
            X3.l(this.mTempScreenRect);
            if (X3.f116b != -1) {
                w X4 = w.X();
                for (int i5 = X3.f116b; i5 != -1; i5 = X4.f116b) {
                    X4.B0(this.mHost, -1);
                    X4.g0(INVALID_PARENT_BOUNDS);
                    onPopulateNodeForVirtualView(i5, X4);
                    X4.l(this.mTempParentRect);
                    Rect rect2 = this.mTempScreenRect;
                    Rect rect3 = this.mTempParentRect;
                    rect2.offset(rect3.left, rect3.top);
                }
                X4.b0();
            }
            this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
        }
        if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
            this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
            if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                X3.h0(this.mTempScreenRect);
                if (m(this.mTempScreenRect)) {
                    X3.L0(true);
                }
            }
        }
        return X3;
    }

    private w i() {
        w Z3 = w.Z(this.mHost);
        AbstractC1281a0.b0(this.mHost, Z3);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (Z3.o() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Z3.c(this.mHost, ((Integer) arrayList.get(i4)).intValue());
        }
        return Z3;
    }

    private h j() {
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        h hVar = new h();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            hVar.n(((Integer) arrayList.get(i4)).intValue(), h(((Integer) arrayList.get(i4)).intValue()));
        }
        return hVar;
    }

    private void k(int i4, Rect rect) {
        obtainAccessibilityNodeInfo(i4).l(rect);
    }

    private static Rect l(View view, int i4, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i4 == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i4 == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i4 == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i4 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        rect.set(0, -1, width, -1);
        return rect;
    }

    private boolean m(Rect rect) {
        if (rect == null || rect.isEmpty() || this.mHost.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.mHost.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int n(int i4) {
        if (i4 == 19) {
            return 33;
        }
        if (i4 != 21) {
            return i4 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean o(int i4, Rect rect) {
        w wVar;
        h j4 = j();
        int i5 = this.mKeyboardFocusedVirtualViewId;
        w wVar2 = i5 == Integer.MIN_VALUE ? null : (w) j4.j(i5);
        if (i4 == 1 || i4 == 2) {
            wVar = (w) N.b.d(j4, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, wVar2, i4, AbstractC1281a0.C(this.mHost) == 1, false);
        } else {
            if (i4 != 17 && i4 != 33 && i4 != 66 && i4 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i6 = this.mKeyboardFocusedVirtualViewId;
            if (i6 != Integer.MIN_VALUE) {
                k(i6, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                l(this.mHost, i4, rect2);
            }
            wVar = (w) N.b.c(j4, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, wVar2, rect2, i4);
        }
        return requestKeyboardFocusForVirtualView(wVar != null ? j4.m(j4.l(wVar)) : Integer.MIN_VALUE);
    }

    private boolean p(int i4, int i5, Bundle bundle) {
        return i5 != 1 ? i5 != 2 ? i5 != 64 ? i5 != 128 ? onPerformActionForVirtualView(i4, i5, bundle) : c(i4) : r(i4) : clearKeyboardFocusForVirtualView(i4) : requestKeyboardFocusForVirtualView(i4);
    }

    private boolean q(int i4, Bundle bundle) {
        return AbstractC1281a0.d0(this.mHost, i4, bundle);
    }

    private boolean r(int i4) {
        int i5;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i5 = this.mAccessibilityFocusedVirtualViewId) == i4) {
            return false;
        }
        if (i5 != Integer.MIN_VALUE) {
            c(i5);
        }
        this.mAccessibilityFocusedVirtualViewId = i4;
        this.mHost.invalidate();
        sendEventForVirtualView(i4, 32768);
        return true;
    }

    private void s(int i4) {
        int i5 = this.mHoveredVirtualViewId;
        if (i5 == i4) {
            return;
        }
        this.mHoveredVirtualViewId = i4;
        sendEventForVirtualView(i4, UserVerificationMethods.USER_VERIFY_PATTERN);
        sendEventForVirtualView(i5, UserVerificationMethods.USER_VERIFY_HANDPRINT);
    }

    public final boolean clearKeyboardFocusForVirtualView(int i4) {
        if (this.mKeyboardFocusedVirtualViewId != i4) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i4, false);
        sendEventForVirtualView(i4, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.mManager.isEnabled() && this.mManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
                    return false;
                }
                s(Integer.MIN_VALUE);
                return true;
            }
            int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
            s(virtualViewAt);
            if (virtualViewAt != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i4 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int n4 = n(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z4 = false;
                                while (i4 < repeatCount && o(n4, null)) {
                                    i4++;
                                    z4 = true;
                                }
                                return z4;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    d();
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return o(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return o(1, null);
                }
            }
        }
        return false;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    @Override // androidx.core.view.C1280a
    public x getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new c();
        }
        return this.mNodeProvider;
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    protected abstract int getVirtualViewAt(float f4, float f5);

    protected abstract void getVisibleVirtualViews(List list);

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i4) {
        invalidateVirtualView(i4, 0);
    }

    w obtainAccessibilityNodeInfo(int i4) {
        return i4 == -1 ? i() : h(i4);
    }

    public final void onFocusChanged(boolean z4, int i4, Rect rect) {
        int i5 = this.mKeyboardFocusedVirtualViewId;
        if (i5 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i5);
        }
        if (z4) {
            o(i4, rect);
        }
    }

    @Override // androidx.core.view.C1280a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    @Override // androidx.core.view.C1280a
    public void onInitializeAccessibilityNodeInfo(View view, w wVar) {
        super.onInitializeAccessibilityNodeInfo(view, wVar);
        onPopulateNodeForHost(wVar);
    }

    protected abstract boolean onPerformActionForVirtualView(int i4, int i5, Bundle bundle);

    protected abstract void onPopulateNodeForVirtualView(int i4, w wVar);

    boolean performAction(int i4, int i5, Bundle bundle) {
        return i4 != -1 ? p(i4, i5, bundle) : q(i5, bundle);
    }

    public final boolean requestKeyboardFocusForVirtualView(int i4) {
        int i5;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i5 = this.mKeyboardFocusedVirtualViewId) == i4) {
            return false;
        }
        if (i5 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i5);
        }
        if (i4 == Integer.MIN_VALUE) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = i4;
        onVirtualViewKeyboardFocusChanged(i4, true);
        sendEventForVirtualView(i4, 8);
        return true;
    }

    public final boolean sendEventForVirtualView(int i4, int i5) {
        ViewParent parent;
        if (i4 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, e(i4, i5));
    }

    public final void invalidateVirtualView(int i4, int i5) {
        ViewParent parent;
        if (i4 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return;
        }
        AccessibilityEvent e4 = e(i4, com.ironsource.mediationsdk.metadata.a.f17688n);
        B.b.b(e4, i5);
        parent.requestSendAccessibilityEvent(this.mHost, e4);
    }

    protected void onPopulateEventForHost(AccessibilityEvent accessibilityEvent) {
    }

    protected void onPopulateNodeForHost(w wVar) {
    }

    protected void onPopulateEventForVirtualView(int i4, AccessibilityEvent accessibilityEvent) {
    }

    protected void onVirtualViewKeyboardFocusChanged(int i4, boolean z4) {
    }
}
