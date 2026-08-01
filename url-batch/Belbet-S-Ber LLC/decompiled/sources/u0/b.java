package u0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import n0.p0;
import o0.g;
import o2.f;
import q.k;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class b extends n0.b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f3542n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final f f3543o = new f(27);

    /* renamed from: p, reason: collision with root package name */
    public static final f f3544p = new f(28);
    public final AccessibilityManager h;
    public final Chip i;

    /* renamed from: j, reason: collision with root package name */
    public a f3548j;
    public final Rect d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f3545e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f3546f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f3547g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f3549k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f3550l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f3551m = Integer.MIN_VALUE;

    public b(Chip chip) {
        this.i = chip;
        this.h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // n0.b
    public final a0.a b(View view) {
        if (this.f3548j == null) {
            this.f3548j = new a(this);
        }
        return this.f3548j;
    }

    @Override // n0.b
    public final void d(View view, g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f2882a;
        this.f2757a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((a2.d) this).f109q;
        a2.f fVar = chip.f1000j;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.f113e0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        gVar.h(chip.getAccessibilityClassName());
        gVar.j(chip.getText());
    }

    public final boolean j(int i) {
        if (this.f3550l != i) {
            return false;
        }
        this.f3550l = Integer.MIN_VALUE;
        p(i, false);
        r(i, 8);
        return true;
    }

    public final g k(int i) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        g gVar = new g(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        gVar.h("android.view.View");
        Rect rect = f3542n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.i;
        obtain.setParent(chip);
        o(i, gVar);
        if (gVar.f() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f3545e;
        obtain.getBoundsInParent(rect2);
        Rect rect3 = this.d;
        obtain.getBoundsInScreen(rect3);
        if (rect2.equals(rect) && rect3.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(chip.getContext().getPackageName());
        gVar.f2883b = i;
        obtain.setSource(chip, i);
        if (this.f3549k == i) {
            obtain.setAccessibilityFocused(true);
            gVar.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            gVar.a(64);
        }
        boolean z4 = this.f3550l == i;
        if (z4) {
            gVar.a(2);
        } else if (obtain.isFocusable()) {
            gVar.a(1);
        }
        obtain.setFocused(z4);
        int[] iArr = this.f3547g;
        chip.getLocationOnScreen(iArr);
        if (rect3.equals(rect)) {
            obtain.setBoundsInParent(rect2);
            Rect rect4 = new Rect();
            rect4.set(rect2);
            chip.getLocationOnScreen(iArr);
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            obtain.setBoundsInScreen(rect4);
            obtain.getBoundsInScreen(rect3);
        }
        Rect rect5 = this.f3546f;
        if (chip.getLocalVisibleRect(rect5)) {
            rect5.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect5)) {
                obtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            gVar.f2882a.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return gVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(int i, Rect rect) {
        int i4;
        int i5;
        Object obj;
        g gVar;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        k kVar = new k();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            kVar.c(((Integer) arrayList.get(i11)).intValue(), k(((Integer) arrayList.get(i11)).intValue()));
        }
        int i12 = this.f3550l;
        g gVar2 = i12 == Integer.MIN_VALUE ? null : (g) kVar.b(i12);
        f fVar = f3543o;
        f fVar2 = f3544p;
        Chip chip = this.i;
        if (i == 1 || i == 2) {
            i4 = -1;
            i5 = 0;
            boolean z4 = chip.getLayoutDirection() == 1;
            fVar2.getClass();
            int i13 = kVar.h;
            ArrayList arrayList2 = new ArrayList(i13);
            for (int i14 = 0; i14 < i13; i14++) {
                arrayList2.add((g) kVar.f3117g[i14]);
            }
            Collections.sort(arrayList2, new c(z4, fVar));
            if (i == 1) {
                int size = arrayList2.size();
                if (gVar2 != null) {
                    size = arrayList2.indexOf(gVar2);
                }
                int i15 = size - 1;
                if (i15 >= 0) {
                    obj = arrayList2.get(i15);
                    gVar = (g) obj;
                }
                obj = null;
                gVar = (g) obj;
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int lastIndexOf = (gVar2 == null ? -1 : arrayList2.lastIndexOf(gVar2)) + 1;
                if (lastIndexOf < size2) {
                    obj = arrayList2.get(lastIndexOf);
                    gVar = (g) obj;
                }
                obj = null;
                gVar = (g) obj;
            }
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i16 = this.f3550l;
            if (i16 != Integer.MIN_VALUE) {
                n(i16).f2882a.getBoundsInScreen(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i == 17) {
                    i8 = -1;
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    i8 = -1;
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    i8 = -1;
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i8 = -1;
                    rect2.set(0, -1, width, -1);
                }
                Rect rect3 = new Rect(rect2);
                if (i != 17) {
                    i5 = 0;
                    rect3.offset(rect2.width() + 1, 0);
                } else if (i == 33) {
                    i5 = 0;
                    rect3.offset(0, rect2.height() + 1);
                } else if (i == 66) {
                    i5 = 0;
                    rect3.offset(-(rect2.width() + 1), 0);
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i5 = 0;
                    rect3.offset(0, -(rect2.height() + 1));
                }
                fVar2.getClass();
                i9 = kVar.h;
                Rect rect4 = new Rect();
                gVar = null;
                for (i10 = i5; i10 < i9; i10++) {
                    g gVar3 = (g) kVar.f3117g[i10];
                    if (gVar3 != gVar2) {
                        fVar.getClass();
                        gVar3.f2882a.getBoundsInScreen(rect4);
                        if (s.a.q(i, rect2, rect4)) {
                            if (s.a.q(i, rect2, rect3) && !s.a.d(i, rect2, rect4, rect3)) {
                                if (!s.a.d(i, rect2, rect3, rect4)) {
                                    int t4 = s.a.t(i, rect2, rect4);
                                    int u4 = s.a.u(i, rect2, rect4);
                                    int i17 = (u4 * u4) + (t4 * 13 * t4);
                                    int t5 = s.a.t(i, rect2, rect3);
                                    int u5 = s.a.u(i, rect2, rect3);
                                    if (i17 >= (u5 * u5) + (t5 * 13 * t5)) {
                                    }
                                }
                            }
                            rect3.set(rect4);
                            gVar = gVar3;
                        }
                    }
                }
                i4 = i8;
            }
            i8 = -1;
            Rect rect32 = new Rect(rect2);
            if (i != 17) {
            }
            fVar2.getClass();
            i9 = kVar.h;
            Rect rect42 = new Rect();
            gVar = null;
            while (i10 < i9) {
            }
            i4 = i8;
        }
        g gVar4 = gVar;
        if (gVar4 == null) {
            i7 = Integer.MIN_VALUE;
        } else {
            int i18 = kVar.h;
            int i19 = i5;
            while (true) {
                if (i19 >= i18) {
                    i6 = i4;
                    break;
                }
                if (kVar.f3117g[i19] == gVar4) {
                    i6 = i19;
                    break;
                }
                i19++;
            }
            i7 = kVar.f3116f[i6];
        }
        return q(i7);
    }

    public final g n(int i) {
        if (i != -1) {
            return k(i);
        }
        Chip chip = this.i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        g gVar = new g(obtain);
        WeakHashMap weakHashMap = p0.f2816a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            gVar.f2882a.addChild(chip, ((Integer) arrayList.get(i4)).intValue());
        }
        return gVar;
    }

    public abstract void o(int i, g gVar);

    public abstract void p(int i, boolean z4);

    public final boolean q(int i) {
        int i4;
        Chip chip = this.i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i4 = this.f3550l) == i) {
            return false;
        }
        if (i4 != Integer.MIN_VALUE) {
            j(i4);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f3550l = i;
        p(i, true);
        r(i, 8);
        return true;
    }

    public final void r(int i, int i4) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i4);
            g n4 = n(i);
            obtain.getText().add(n4.f());
            AccessibilityNodeInfo accessibilityNodeInfo = n4.f2882a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, i);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i4);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
