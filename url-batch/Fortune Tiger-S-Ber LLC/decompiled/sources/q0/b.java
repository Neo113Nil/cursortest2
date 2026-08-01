package q0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import g2.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import k0.j0;
import n.k;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class b extends k0.b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f3093n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final f f3094o = new f(20);

    /* renamed from: p, reason: collision with root package name */
    public static final f f3095p = new f(21);
    public final AccessibilityManager h;

    /* renamed from: i, reason: collision with root package name */
    public final Chip f3099i;

    /* renamed from: j, reason: collision with root package name */
    public a f3100j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f3096d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f3097e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f3098f = new Rect();
    public final int[] g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f3101k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f3102l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f3103m = Integer.MIN_VALUE;

    public b(Chip chip) {
        this.f3099i = chip;
        this.h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // k0.b
    public final a2.e b(View view) {
        if (this.f3100j == null) {
            this.f3100j = new a(this);
        }
        return this.f3100j;
    }

    @Override // k0.b
    public final void d(View view, l0.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f2855a;
        this.f2714a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((u1.c) this).f3402q;
        u1.e eVar2 = chip.f1255j;
        accessibilityNodeInfo.setCheckable(eVar2 != null && eVar2.f3406e0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        eVar.g(chip.getAccessibilityClassName());
        eVar.h(chip.getText());
    }

    public final boolean j(int i4) {
        if (this.f3102l != i4) {
            return false;
        }
        this.f3102l = Integer.MIN_VALUE;
        p(i4, false);
        r(i4, 8);
        return true;
    }

    public final l0.e k(int i4) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        l0.e eVar = new l0.e(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        eVar.g("android.view.View");
        Rect rect = f3093n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.f3099i;
        obtain.setParent(chip);
        o(i4, eVar);
        if (eVar.f() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f3097e;
        obtain.getBoundsInParent(rect2);
        Rect rect3 = this.f3096d;
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
        eVar.f2856b = i4;
        obtain.setSource(chip, i4);
        if (this.f3101k == i4) {
            obtain.setAccessibilityFocused(true);
            eVar.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            eVar.a(64);
        }
        boolean z3 = this.f3102l == i4;
        if (z3) {
            eVar.a(2);
        } else if (obtain.isFocusable()) {
            eVar.a(1);
        }
        obtain.setFocused(z3);
        int[] iArr = this.g;
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
        Rect rect5 = this.f3098f;
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
                            eVar.f2855a.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return eVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(int i4, Rect rect) {
        int i5;
        int i6;
        Object obj;
        l0.e eVar;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        k kVar = new k();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            kVar.c(((Integer) arrayList.get(i12)).intValue(), k(((Integer) arrayList.get(i12)).intValue()));
        }
        int i13 = this.f3102l;
        l0.e eVar2 = i13 == Integer.MIN_VALUE ? null : (l0.e) kVar.b(i13);
        f fVar = f3094o;
        f fVar2 = f3095p;
        Chip chip = this.f3099i;
        if (i4 == 1 || i4 == 2) {
            i5 = -1;
            i6 = 0;
            boolean z3 = chip.getLayoutDirection() == 1;
            fVar2.getClass();
            int i14 = kVar.h;
            ArrayList arrayList2 = new ArrayList(i14);
            for (int i15 = 0; i15 < i14; i15++) {
                arrayList2.add((l0.e) kVar.g[i15]);
            }
            Collections.sort(arrayList2, new c(z3, fVar));
            if (i4 == 1) {
                int size = arrayList2.size();
                if (eVar2 != null) {
                    size = arrayList2.indexOf(eVar2);
                }
                int i16 = size - 1;
                if (i16 >= 0) {
                    obj = arrayList2.get(i16);
                    eVar = (l0.e) obj;
                }
                obj = null;
                eVar = (l0.e) obj;
            } else {
                if (i4 != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int lastIndexOf = (eVar2 == null ? -1 : arrayList2.lastIndexOf(eVar2)) + 1;
                if (lastIndexOf < size2) {
                    obj = arrayList2.get(lastIndexOf);
                    eVar = (l0.e) obj;
                }
                obj = null;
                eVar = (l0.e) obj;
            }
        } else {
            if (i4 != 17 && i4 != 33 && i4 != 66 && i4 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i17 = this.f3102l;
            if (i17 != Integer.MIN_VALUE) {
                n(i17).f2855a.getBoundsInScreen(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i4 == 17) {
                    i9 = -1;
                    rect2.set(width, 0, width, height);
                } else if (i4 == 33) {
                    i9 = -1;
                    rect2.set(0, height, width, height);
                } else if (i4 == 66) {
                    i9 = -1;
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i4 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i9 = -1;
                    rect2.set(0, -1, width, -1);
                }
                Rect rect3 = new Rect(rect2);
                if (i4 != 17) {
                    i6 = 0;
                    rect3.offset(rect2.width() + 1, 0);
                } else if (i4 == 33) {
                    i6 = 0;
                    rect3.offset(0, rect2.height() + 1);
                } else if (i4 == 66) {
                    i6 = 0;
                    rect3.offset(-(rect2.width() + 1), 0);
                } else {
                    if (i4 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i6 = 0;
                    rect3.offset(0, -(rect2.height() + 1));
                }
                fVar2.getClass();
                i10 = kVar.h;
                Rect rect4 = new Rect();
                eVar = null;
                for (i11 = i6; i11 < i10; i11++) {
                    l0.e eVar3 = (l0.e) kVar.g[i11];
                    if (eVar3 != eVar2) {
                        fVar.getClass();
                        eVar3.f2855a.getBoundsInScreen(rect4);
                        if (m0.a.q(i4, rect2, rect4)) {
                            if (m0.a.q(i4, rect2, rect3) && !m0.a.b(i4, rect2, rect4, rect3)) {
                                if (!m0.a.b(i4, rect2, rect3, rect4)) {
                                    int s2 = m0.a.s(i4, rect2, rect4);
                                    int t3 = m0.a.t(i4, rect2, rect4);
                                    int i18 = (t3 * t3) + (s2 * 13 * s2);
                                    int s3 = m0.a.s(i4, rect2, rect3);
                                    int t4 = m0.a.t(i4, rect2, rect3);
                                    if (i18 >= (t4 * t4) + (s3 * 13 * s3)) {
                                    }
                                }
                            }
                            rect3.set(rect4);
                            eVar = eVar3;
                        }
                    }
                }
                i5 = i9;
            }
            i9 = -1;
            Rect rect32 = new Rect(rect2);
            if (i4 != 17) {
            }
            fVar2.getClass();
            i10 = kVar.h;
            Rect rect42 = new Rect();
            eVar = null;
            while (i11 < i10) {
            }
            i5 = i9;
        }
        l0.e eVar4 = eVar;
        if (eVar4 == null) {
            i8 = Integer.MIN_VALUE;
        } else {
            int i19 = kVar.h;
            int i20 = i6;
            while (true) {
                if (i20 >= i19) {
                    i7 = i5;
                    break;
                }
                if (kVar.g[i20] == eVar4) {
                    i7 = i20;
                    break;
                }
                i20++;
            }
            i8 = kVar.f2936f[i7];
        }
        return q(i8);
    }

    public final l0.e n(int i4) {
        if (i4 != -1) {
            return k(i4);
        }
        Chip chip = this.f3099i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        l0.e eVar = new l0.e(obtain);
        WeakHashMap weakHashMap = j0.f2752a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            eVar.f2855a.addChild(chip, ((Integer) arrayList.get(i5)).intValue());
        }
        return eVar;
    }

    public abstract void o(int i4, l0.e eVar);

    public abstract void p(int i4, boolean z3);

    public final boolean q(int i4) {
        int i5;
        Chip chip = this.f3099i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i5 = this.f3102l) == i4) {
            return false;
        }
        if (i5 != Integer.MIN_VALUE) {
            j(i5);
        }
        if (i4 == Integer.MIN_VALUE) {
            return false;
        }
        this.f3102l = i4;
        p(i4, true);
        r(i4, 8);
        return true;
    }

    public final void r(int i4, int i5) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i4 == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.f3099i).getParent()) == null) {
            return;
        }
        if (i4 != -1) {
            obtain = AccessibilityEvent.obtain(i5);
            l0.e n3 = n(i4);
            obtain.getText().add(n3.f());
            AccessibilityNodeInfo accessibilityNodeInfo = n3.f2855a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, i4);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i5);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
