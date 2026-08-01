package T;

import K.C0006b;
import K.Q;
import L.j;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import o.l;

/* loaded from: classes.dex */
public abstract class b extends C0006b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f993n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final R0.e f994o = new R0.e(5);

    /* renamed from: p, reason: collision with root package name */
    public static final R0.e f995p = new R0.e(6);
    public final AccessibilityManager h;
    public final Chip i;

    /* renamed from: j, reason: collision with root package name */
    public a f999j;
    public final Rect d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f996e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f997f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f998g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f1000k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f1001l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f1002m = Integer.MIN_VALUE;

    public b(Chip chip) {
        if (chip == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.i = chip;
        this.h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = Q.f578a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // K.C0006b
    public final A0.c b(View view) {
        if (this.f999j == null) {
            this.f999j = new a(this);
        }
        return this.f999j;
    }

    @Override // K.C0006b
    public final void d(View view, j jVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f594a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f696a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((G0.d) this).f296q;
        accessibilityNodeInfo.setCheckable(chip.d());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        jVar.h(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    public final boolean j(int i) {
        if (this.f1001l != i) {
            return false;
        }
        this.f1001l = Integer.MIN_VALUE;
        G0.d dVar = (G0.d) this;
        if (i == 1) {
            Chip chip = dVar.f296q;
            chip.f2230m = false;
            chip.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final j k(int i) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        j jVar = new j(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        jVar.h("android.view.View");
        Rect rect = f993n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.i;
        obtain.setParent(chip);
        o(i, jVar);
        if (jVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f996e;
        jVar.f(rect2);
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
        jVar.f697b = i;
        obtain.setSource(chip, i);
        if (this.f1000k == i) {
            obtain.setAccessibilityFocused(true);
            jVar.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            jVar.a(64);
        }
        boolean z2 = this.f1001l == i;
        if (z2) {
            jVar.a(2);
        } else if (obtain.isFocusable()) {
            jVar.a(1);
        }
        obtain.setFocused(z2);
        int[] iArr = this.f998g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.d;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            jVar.f(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f997f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                obtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= RecyclerView.f1937A0 || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            obtain.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return jVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(int i, Rect rect) {
        int i2;
        int i3;
        Object obj;
        j jVar;
        int i4;
        int i5;
        int i6;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        l lVar = new l();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            lVar.c(((Integer) arrayList.get(i7)).intValue(), k(((Integer) arrayList.get(i7)).intValue()));
        }
        int i8 = this.f1001l;
        int i9 = Integer.MIN_VALUE;
        j jVar2 = i8 == Integer.MIN_VALUE ? null : (j) lVar.b(i8, null);
        R0.e eVar = f994o;
        R0.e eVar2 = f995p;
        Chip chip = this.i;
        if (i == 1 || i == 2) {
            i2 = 0;
            i3 = -1;
            WeakHashMap weakHashMap = Q.f578a;
            boolean z2 = chip.getLayoutDirection() == 1;
            eVar2.getClass();
            int i10 = lVar.f3594c;
            ArrayList arrayList2 = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList2.add((j) lVar.f3593b[i11]);
            }
            Collections.sort(arrayList2, new c(z2, eVar));
            if (i == 1) {
                int size = arrayList2.size();
                if (jVar2 != null) {
                    size = arrayList2.indexOf(jVar2);
                }
                int i12 = size - 1;
                if (i12 >= 0) {
                    obj = arrayList2.get(i12);
                    jVar = (j) obj;
                }
                obj = null;
                jVar = (j) obj;
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int lastIndexOf = (jVar2 == null ? -1 : arrayList2.lastIndexOf(jVar2)) + 1;
                if (lastIndexOf < size2) {
                    obj = arrayList2.get(lastIndexOf);
                    jVar = (j) obj;
                }
                obj = null;
                jVar = (j) obj;
            }
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i13 = this.f1001l;
            if (i13 != Integer.MIN_VALUE) {
                n(i13).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i == 17) {
                    i3 = -1;
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    i3 = -1;
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                    i3 = -1;
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect2.set(0, -1, width, -1);
                    i3 = -1;
                }
                Rect rect3 = new Rect(rect2);
                if (i != 17) {
                    i2 = 0;
                    rect3.offset(rect2.width() + 1, 0);
                } else if (i == 33) {
                    i2 = 0;
                    rect3.offset(0, rect2.height() + 1);
                } else if (i == 66) {
                    i2 = 0;
                    rect3.offset(-(rect2.width() + 1), 0);
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i2 = 0;
                    rect3.offset(0, -(rect2.height() + 1));
                }
                eVar2.getClass();
                i5 = lVar.f3594c;
                Rect rect4 = new Rect();
                jVar = null;
                for (i6 = i2; i6 < i5; i6++) {
                    j jVar3 = (j) lVar.f3593b[i6];
                    if (jVar3 != jVar2) {
                        eVar.getClass();
                        jVar3.f(rect4);
                        if (H1.l.L(i, rect2, rect4)) {
                            if (H1.l.L(i, rect2, rect3) && !H1.l.k(i, rect2, rect4, rect3)) {
                                if (!H1.l.k(i, rect2, rect3, rect4)) {
                                    int R2 = H1.l.R(i, rect2, rect4);
                                    int T2 = H1.l.T(i, rect2, rect4);
                                    int i14 = (T2 * T2) + (R2 * 13 * R2);
                                    int R3 = H1.l.R(i, rect2, rect3);
                                    int T3 = H1.l.T(i, rect2, rect3);
                                    if (i14 >= (T3 * T3) + (R3 * 13 * R3)) {
                                    }
                                }
                            }
                            rect3.set(rect4);
                            jVar = jVar3;
                        }
                    }
                }
            }
            i3 = -1;
            Rect rect32 = new Rect(rect2);
            if (i != 17) {
            }
            eVar2.getClass();
            i5 = lVar.f3594c;
            Rect rect42 = new Rect();
            jVar = null;
            while (i6 < i5) {
            }
        }
        j jVar4 = jVar;
        if (jVar4 != null) {
            int i15 = i2;
            while (true) {
                if (i15 >= lVar.f3594c) {
                    i4 = i3;
                    break;
                }
                if (lVar.f3593b[i15] == jVar4) {
                    i4 = i15;
                    break;
                }
                i15++;
            }
            i9 = lVar.f3592a[i4];
        }
        return p(i9);
    }

    public final j n(int i) {
        if (i != -1) {
            return k(i);
        }
        Chip chip = this.i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        j jVar = new j(obtain);
        WeakHashMap weakHashMap = Q.f578a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            jVar.f696a.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return jVar;
    }

    public abstract void o(int i, j jVar);

    public final boolean p(int i) {
        int i2;
        Chip chip = this.i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.f1001l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f1001l = i;
        G0.d dVar = (G0.d) this;
        if (i == 1) {
            Chip chip2 = dVar.f296q;
            chip2.f2230m = true;
            chip2.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final void q(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i2);
            j n2 = n(i);
            obtain.getText().add(n2.g());
            AccessibilityNodeInfo accessibilityNodeInfo = n2.f696a;
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
            obtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
