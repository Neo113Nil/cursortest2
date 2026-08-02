package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abp extends wv {
    private static final Rect f = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final AccessibilityManager a;
    public final View b;
    private abo k;
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private final Rect i = new Rect();
    private final int[] j = new int[2];
    public int d = Integer.MIN_VALUE;
    public int e = Integer.MIN_VALUE;

    public abp(View view) {
        this.b = view;
        this.a = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.wv
    public final aak a(View view) {
        abo aboVar = this.k;
        if (aboVar != null) {
            return aboVar;
        }
        abo aboVar2 = new abo(this);
        this.k = aboVar2;
        return aboVar2;
    }

    @Override // defpackage.wv
    public final void c(View view, aah aahVar) {
        super.c(view, aahVar);
        m(aahVar);
    }

    final aah j(int i) {
        if (i == -1) {
            View view = this.b;
            aah aahVar = new aah(AccessibilityNodeInfo.obtain(view));
            int i2 = yq.a;
            AccessibilityNodeInfo accessibilityNodeInfo = aahVar.a;
            view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            ArrayList arrayList = new ArrayList();
            k(arrayList);
            if (accessibilityNodeInfo.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                accessibilityNodeInfo.addChild(view, ((Integer) arrayList.get(i3)).intValue());
            }
            return aahVar;
        }
        aah b = aah.b();
        b.t(true);
        b.u(true);
        b.o("android.view.View");
        Rect rect = f;
        b.l(rect);
        b.m(rect);
        View view2 = this.b;
        b.y(view2);
        n(i, b);
        if (b.e() == null && b.d() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.h;
        b.i(rect2);
        Rect rect3 = this.g;
        b.j(rect3);
        if (rect2.equals(rect) && rect3.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
        }
        AccessibilityNodeInfo accessibilityNodeInfo2 = b.a;
        int actions = accessibilityNodeInfo2.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfo2.setPackageName(view2.getContext().getPackageName());
        b.c = i;
        accessibilityNodeInfo2.setSource(view2, i);
        if (this.d == i) {
            b.k(true);
            b.g(128);
        } else {
            b.k(false);
            b.g(64);
        }
        boolean z = this.e == i;
        if (z) {
            b.g(2);
        } else if (b.E()) {
            b.g(1);
        }
        b.v(z);
        int[] iArr = this.j;
        view2.getLocationOnScreen(iArr);
        if (rect3.equals(rect)) {
            b.l(rect2);
            Rect rect4 = new Rect();
            rect4.set(rect2);
            if (b.b != -1) {
                aah b2 = aah.b();
                Rect rect5 = new Rect();
                for (int i4 = b.b; i4 != -1; i4 = b2.b) {
                    b2.b = -1;
                    b2.a.setParent(view2, -1);
                    b2.l(rect);
                    n(0, b2);
                    b2.i(rect5);
                    rect4.offset(rect5.left, rect5.top);
                }
            }
            view2.getLocationOnScreen(iArr);
            rect4.offset(iArr[0] - view2.getScrollX(), iArr[1] - view2.getScrollY());
            b.m(rect4);
            b.j(rect3);
        }
        Rect rect6 = this.i;
        if (view2.getLocalVisibleRect(rect6)) {
            rect6.offset(iArr[0] - view2.getScrollX(), iArr[1] - view2.getScrollY());
            if (rect3.intersect(rect6)) {
                b.m(rect3);
                if (rect3 != null && !rect3.isEmpty() && view2.getWindowVisibility() == 0) {
                    Object parent = view2.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view3 = (View) parent;
                            if (view3.getAlpha() <= 0.0f || view3.getVisibility() != 0) {
                                break;
                            }
                            parent = view3.getParent();
                        } else if (parent != null) {
                            b.C(true);
                        }
                    }
                }
            }
        }
        return b;
    }

    protected abstract void k(List list);

    protected void m(aah aahVar) {
        throw null;
    }

    protected abstract void n(int i, aah aahVar);

    protected void o(int i, boolean z) {
        throw null;
    }

    public final boolean p(int i) {
        if (this.d != i) {
            return false;
        }
        this.d = Integer.MIN_VALUE;
        this.b.invalidate();
        s(i, 65536);
        return true;
    }

    public final boolean q(int i) {
        if (this.e != i) {
            return false;
        }
        this.e = Integer.MIN_VALUE;
        o(i, false);
        s(i, 8);
        return true;
    }

    public abstract boolean r(int i, int i2);

    public final void s(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.a.isEnabled() || (parent = (view = this.b).getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i2);
            aah j = j(i);
            obtain.getText().add(j.e());
            obtain.setContentDescription(j.d());
            obtain.setScrollable(j.G());
            obtain.setPassword(j.F());
            obtain.setEnabled(j.D());
            obtain.setChecked(j.a.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(j.c());
            obtain.setSource(view, i);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
