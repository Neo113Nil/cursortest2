package t0;

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
import l2.f;
import n0.l0;
import q.k;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class b extends n0.b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f3273n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final f f3274o = new f(25);

    /* renamed from: p, reason: collision with root package name */
    public static final f f3275p = new f(26);

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f3279h;
    public final Chip i;

    /* renamed from: j, reason: collision with root package name */
    public a f3280j;
    public final Rect d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f3276e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f3277f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f3278g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f3281k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f3282l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f3283m = Integer.MIN_VALUE;

    public b(Chip chip) {
        this.i = chip;
        this.f3279h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = l0.f2757a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // n0.b
    public final a0.a b(View view) {
        if (this.f3280j == null) {
            this.f3280j = new a(this);
        }
        return this.f3280j;
    }

    @Override // n0.b
    public final void d(View view, o0.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f2861a;
        this.f2714a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((z1.c) this).f3854q;
        z1.e eVar2 = chip.f882j;
        accessibilityNodeInfo.setCheckable(eVar2 != null && eVar2.f3858e0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        eVar.i(chip.getAccessibilityClassName());
        eVar.j(chip.getText());
    }

    public final boolean j(int i) {
        if (this.f3282l != i) {
            return false;
        }
        this.f3282l = Integer.MIN_VALUE;
        p(i, false);
        r(i, 8);
        return true;
    }

    public final o0.e k(int i) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        o0.e eVar = new o0.e(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        eVar.i("android.view.View");
        Rect rect = f3273n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.i;
        obtain.setParent(chip);
        o(i, eVar);
        if (eVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f3276e;
        eVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(chip.getContext().getPackageName());
        eVar.f2862b = i;
        obtain.setSource(chip, i);
        if (this.f3281k == i) {
            obtain.setAccessibilityFocused(true);
            eVar.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            eVar.a(64);
        }
        boolean z3 = this.f3282l == i;
        if (z3) {
            eVar.a(2);
        } else if (obtain.isFocusable()) {
            eVar.a(1);
        }
        obtain.setFocused(z3);
        int[] iArr = this.f3278g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.d;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            eVar.f(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f3277f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
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
                            eVar.f2861a.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return eVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(int i, Rect rect) {
        int i4;
        int i5;
        Object obj;
        o0.e eVar;
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
        int i12 = this.f3282l;
        o0.e eVar2 = i12 == Integer.MIN_VALUE ? null : (o0.e) kVar.b(i12);
        f fVar = f3274o;
        f fVar2 = f3275p;
        Chip chip = this.i;
        if (i == 1 || i == 2) {
            i4 = -1;
            i5 = 0;
            WeakHashMap weakHashMap = l0.f2757a;
            boolean z3 = chip.getLayoutDirection() == 1;
            fVar2.getClass();
            int i13 = kVar.f3039h;
            ArrayList arrayList2 = new ArrayList(i13);
            for (int i14 = 0; i14 < i13; i14++) {
                arrayList2.add((o0.e) kVar.f3038g[i14]);
            }
            Collections.sort(arrayList2, new c(z3, fVar));
            if (i == 1) {
                int size = arrayList2.size();
                if (eVar2 != null) {
                    size = arrayList2.indexOf(eVar2);
                }
                int i15 = size - 1;
                if (i15 >= 0) {
                    obj = arrayList2.get(i15);
                    eVar = (o0.e) obj;
                }
                obj = null;
                eVar = (o0.e) obj;
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int lastIndexOf = (eVar2 == null ? -1 : arrayList2.lastIndexOf(eVar2)) + 1;
                if (lastIndexOf < size2) {
                    obj = arrayList2.get(lastIndexOf);
                    eVar = (o0.e) obj;
                }
                obj = null;
                eVar = (o0.e) obj;
            }
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i16 = this.f3282l;
            if (i16 != Integer.MIN_VALUE) {
                n(i16).f(rect2);
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
                i9 = kVar.f3039h;
                Rect rect4 = new Rect();
                eVar = null;
                for (i10 = i5; i10 < i9; i10++) {
                    o0.e eVar3 = (o0.e) kVar.f3038g[i10];
                    if (eVar3 != eVar2) {
                        fVar.getClass();
                        eVar3.f(rect4);
                        if (d.k(i, rect2, rect4)) {
                            if (d.k(i, rect2, rect3) && !d.a(i, rect2, rect4, rect3)) {
                                if (!d.a(i, rect2, rect3, rect4)) {
                                    int l4 = d.l(i, rect2, rect4);
                                    int m4 = d.m(i, rect2, rect4);
                                    int i17 = (m4 * m4) + (l4 * 13 * l4);
                                    int l5 = d.l(i, rect2, rect3);
                                    int m5 = d.m(i, rect2, rect3);
                                    if (i17 >= (m5 * m5) + (l5 * 13 * l5)) {
                                    }
                                }
                            }
                            rect3.set(rect4);
                            eVar = eVar3;
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
            i9 = kVar.f3039h;
            Rect rect42 = new Rect();
            eVar = null;
            while (i10 < i9) {
            }
            i4 = i8;
        }
        o0.e eVar4 = eVar;
        if (eVar4 == null) {
            i7 = Integer.MIN_VALUE;
        } else {
            int i18 = kVar.f3039h;
            int i19 = i5;
            while (true) {
                if (i19 >= i18) {
                    i6 = i4;
                    break;
                }
                if (kVar.f3038g[i19] == eVar4) {
                    i6 = i19;
                    break;
                }
                i19++;
            }
            i7 = kVar.f3037f[i6];
        }
        return q(i7);
    }

    public final o0.e n(int i) {
        if (i != -1) {
            return k(i);
        }
        Chip chip = this.i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        o0.e eVar = new o0.e(obtain);
        WeakHashMap weakHashMap = l0.f2757a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            eVar.f2861a.addChild(chip, ((Integer) arrayList.get(i4)).intValue());
        }
        return eVar;
    }

    public abstract void o(int i, o0.e eVar);

    public abstract void p(int i, boolean z3);

    public final boolean q(int i) {
        int i4;
        Chip chip = this.i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i4 = this.f3282l) == i) {
            return false;
        }
        if (i4 != Integer.MIN_VALUE) {
            j(i4);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f3282l = i;
        p(i, true);
        r(i, 8);
        return true;
    }

    public final void r(int i, int i4) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.f3279h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i4);
            o0.e n4 = n(i);
            obtain.getText().add(n4.g());
            AccessibilityNodeInfo accessibilityNodeInfo = n4.f2861a;
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
