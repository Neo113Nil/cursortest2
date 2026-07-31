package x3;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import n5.d;
import o.r;
import o.u0;
import q3.k;
import q3.k0;
import r2.o;
import r3.f;
import x1.w;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a extends q3.b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f8615n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final p.b f8616o = new p.b(17);

    /* renamed from: p, reason: collision with root package name */
    public static final p.b f8617p = new p.b(18);

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f8622h;
    public final Chip i;

    /* renamed from: j, reason: collision with root package name */
    public w f8623j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f8618d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f8619e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f8620f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f8621g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f8624k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f8625l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f8626m = Integer.MIN_VALUE;

    public a(Chip chip) {
        this.i = chip;
        this.f8622h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        Field field = k0.f6120a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // q3.b
    public final k b(View view) {
        if (this.f8623j == null) {
            this.f8623j = new w(this, 1);
        }
        return this.f8623j;
    }

    @Override // q3.b
    public final void d(View view, f fVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f6557a;
        this.f6076a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((d) this).f5379q;
        n5.f fVar2 = chip.f1901h;
        accessibilityNodeInfo.setCheckable(fVar2 != null && fVar2.f5382c0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        fVar.i(chip.getAccessibilityClassName());
        fVar.k(chip.getText());
    }

    public final boolean j(int i) {
        if (this.f8625l != i) {
            return false;
        }
        this.f8625l = Integer.MIN_VALUE;
        p(i, false);
        r(i, 8);
        return true;
    }

    public final f k(int i) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        f fVar = new f(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        fVar.i("android.view.View");
        Rect rect = f8615n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        fVar.f6558b = -1;
        Chip chip = this.i;
        obtain.setParent(chip);
        o(i, fVar);
        if (fVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f8619e;
        fVar.f(rect2);
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
        fVar.f6559c = i;
        obtain.setSource(chip, i);
        if (this.f8624k == i) {
            obtain.setAccessibilityFocused(true);
            fVar.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            fVar.a(64);
        }
        boolean z3 = this.f8625l == i;
        if (z3) {
            fVar.a(2);
        } else if (obtain.isFocusable()) {
            fVar.a(1);
        }
        obtain.setFocused(z3);
        int[] iArr = this.f8621g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f8618d;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            fVar.f(rect3);
            if (fVar.f6558b != -1) {
                f fVar2 = new f(AccessibilityNodeInfo.obtain());
                for (int i8 = fVar.f6558b; i8 != -1; i8 = fVar2.f6558b) {
                    fVar2.f6558b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = fVar2.f6557a;
                    accessibilityNodeInfo.setParent(chip, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    o(i8, fVar2);
                    fVar2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f8620f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = fVar.f6557a;
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
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
                            accessibilityNodeInfo2.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return fVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(int i, Rect rect) {
        int i8;
        int i9;
        Object obj;
        f fVar;
        int i10;
        int d8;
        int i11;
        int f6;
        int i12;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        u0 u0Var = new u0(0);
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            u0Var.e(((Integer) arrayList.get(i13)).intValue(), k(((Integer) arrayList.get(i13)).intValue()));
        }
        int i14 = this.f8625l;
        f fVar2 = i14 == Integer.MIN_VALUE ? null : (f) u0Var.c(i14);
        p.b bVar = f8616o;
        p.b bVar2 = f8617p;
        Chip chip = this.i;
        if (i == 1 || i == 2) {
            i8 = 0;
            i9 = -1;
            Field field = k0.f6120a;
            boolean z3 = chip.getLayoutDirection() == 1;
            bVar2.getClass();
            int f8 = u0Var.f();
            ArrayList arrayList2 = new ArrayList(f8);
            for (int i15 = 0; i15 < f8; i15++) {
                arrayList2.add((f) u0Var.g(i15));
            }
            Collections.sort(arrayList2, new b(z3, bVar));
            if (i == 1) {
                int size = arrayList2.size();
                if (fVar2 != null) {
                    size = arrayList2.indexOf(fVar2);
                }
                int i16 = size - 1;
                if (i16 >= 0) {
                    obj = arrayList2.get(i16);
                    fVar = (f) obj;
                }
                obj = null;
                fVar = (f) obj;
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int lastIndexOf = (fVar2 == null ? -1 : arrayList2.lastIndexOf(fVar2)) + 1;
                if (lastIndexOf < size2) {
                    obj = arrayList2.get(lastIndexOf);
                    fVar = (f) obj;
                }
                obj = null;
                fVar = (f) obj;
            }
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i17 = this.f8625l;
            if (i17 != Integer.MIN_VALUE) {
                n(i17).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i == 17) {
                    i11 = -1;
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    i11 = -1;
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    i11 = -1;
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i11 = -1;
                    rect2.set(0, -1, width, -1);
                }
                Rect rect3 = new Rect(rect2);
                if (i != 17) {
                    i8 = 0;
                    rect3.offset(rect2.width() + 1, 0);
                } else if (i == 33) {
                    i8 = 0;
                    rect3.offset(0, rect2.height() + 1);
                } else if (i == 66) {
                    i8 = 0;
                    rect3.offset(-(rect2.width() + 1), 0);
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i8 = 0;
                    rect3.offset(0, -(rect2.height() + 1));
                }
                bVar2.getClass();
                f6 = u0Var.f();
                Rect rect4 = new Rect();
                fVar = null;
                for (i12 = i8; i12 < f6; i12++) {
                    f fVar3 = (f) u0Var.g(i12);
                    if (fVar3 != fVar2) {
                        bVar.getClass();
                        fVar3.f(rect4);
                        if (o.S(i, rect2, rect4)) {
                            if (o.S(i, rect2, rect3) && !o.i(i, rect2, rect4, rect3)) {
                                if (!o.i(i, rect2, rect3, rect4)) {
                                    int Y = o.Y(i, rect2, rect4);
                                    int c02 = o.c0(i, rect2, rect4);
                                    int i18 = (c02 * c02) + (Y * 13 * Y);
                                    int Y2 = o.Y(i, rect2, rect3);
                                    int c03 = o.c0(i, rect2, rect3);
                                    if (i18 >= (c03 * c03) + (Y2 * 13 * Y2)) {
                                    }
                                }
                            }
                            rect3.set(rect4);
                            fVar = fVar3;
                        }
                    }
                }
                i9 = i11;
            }
            i11 = -1;
            Rect rect32 = new Rect(rect2);
            if (i != 17) {
            }
            bVar2.getClass();
            f6 = u0Var.f();
            Rect rect42 = new Rect();
            fVar = null;
            while (i12 < f6) {
            }
            i9 = i11;
        }
        f fVar4 = fVar;
        if (fVar4 == null) {
            d8 = Integer.MIN_VALUE;
        } else {
            if (u0Var.f5547d) {
                r.a(u0Var);
            }
            int i19 = u0Var.f5550g;
            int i20 = i8;
            while (true) {
                if (i20 >= i19) {
                    i10 = i9;
                    break;
                }
                if (u0Var.f5549f[i20] == fVar4) {
                    i10 = i20;
                    break;
                }
                i20++;
            }
            d8 = u0Var.d(i10);
        }
        return q(d8);
    }

    public final f n(int i) {
        if (i != -1) {
            return k(i);
        }
        Chip chip = this.i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        f fVar = new f(obtain);
        Field field = k0.f6120a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            fVar.f6557a.addChild(chip, ((Integer) arrayList.get(i8)).intValue());
        }
        return fVar;
    }

    public abstract void o(int i, f fVar);

    public abstract void p(int i, boolean z3);

    public final boolean q(int i) {
        int i8;
        Chip chip = this.i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i8 = this.f8625l) == i) {
            return false;
        }
        if (i8 != Integer.MIN_VALUE) {
            j(i8);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f8625l = i;
        p(i, true);
        r(i, 8);
        return true;
    }

    public final void r(int i, int i8) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.f8622h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i8);
            f n6 = n(i);
            obtain.getText().add(n6.g());
            AccessibilityNodeInfo accessibilityNodeInfo = n6.f6557a;
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
            obtain = AccessibilityEvent.obtain(i8);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
