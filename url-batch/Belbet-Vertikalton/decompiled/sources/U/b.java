package U;

import M.C0006b;
import M.P;
import N.i;
import a.AbstractC0058a;
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
import q.l;

/* loaded from: classes.dex */
public abstract class b extends C0006b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f1195n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final N0.e f1196o = new N0.e(6);

    /* renamed from: p, reason: collision with root package name */
    public static final N0.e f1197p = new N0.e(7);

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f1201h;
    public final Chip i;
    public a j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f1198d = new Rect();
    public final Rect e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f1199f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f1200g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f1202k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f1203l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f1204m = Integer.MIN_VALUE;

    public b(Chip chip) {
        if (chip == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.i = chip;
        this.f1201h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = P.f711a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // M.C0006b
    public final C1.d b(View view) {
        if (this.j == null) {
            this.j = new a(this);
        }
        return this.j;
    }

    @Override // M.C0006b
    public final void d(View view, i iVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f728a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f878a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((C0.d) this).f74q;
        accessibilityNodeInfo.setCheckable(chip.d());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    public final boolean j(int i) {
        if (this.f1203l != i) {
            return false;
        }
        this.f1203l = Integer.MIN_VALUE;
        C0.d dVar = (C0.d) this;
        if (i == 1) {
            Chip chip = dVar.f74q;
            chip.f2342m = false;
            chip.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final i k(int i) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        i iVar = new i(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = f1195n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.i;
        obtain.setParent(chip);
        o(i, iVar);
        if (iVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.e;
        iVar.f(rect2);
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
        iVar.f879b = i;
        obtain.setSource(chip, i);
        if (this.f1202k == i) {
            obtain.setAccessibilityFocused(true);
            iVar.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            iVar.a(64);
        }
        boolean z2 = this.f1203l == i;
        if (z2) {
            iVar.a(2);
        } else if (obtain.isFocusable()) {
            iVar.a(1);
        }
        obtain.setFocused(z2);
        int[] iArr = this.f1200g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f1198d;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            iVar.f(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f1199f;
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
                            obtain.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return iVar;
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
        i iVar;
        int i4;
        int i5;
        int i6;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        l lVar = new l();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            lVar.c(((Integer) arrayList.get(i7)).intValue(), k(((Integer) arrayList.get(i7)).intValue()));
        }
        int i8 = this.f1203l;
        int i9 = Integer.MIN_VALUE;
        i iVar2 = i8 == Integer.MIN_VALUE ? null : (i) lVar.b(i8, null);
        N0.e eVar = f1196o;
        N0.e eVar2 = f1197p;
        Chip chip = this.i;
        if (i == 1 || i == 2) {
            i2 = 0;
            i3 = -1;
            WeakHashMap weakHashMap = P.f711a;
            boolean z2 = chip.getLayoutDirection() == 1;
            eVar2.getClass();
            int i10 = lVar.f3929c;
            ArrayList arrayList2 = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList2.add((i) lVar.f3928b[i11]);
            }
            Collections.sort(arrayList2, new c(z2, eVar));
            if (i == 1) {
                int size = arrayList2.size();
                if (iVar2 != null) {
                    size = arrayList2.indexOf(iVar2);
                }
                int i12 = size - 1;
                if (i12 >= 0) {
                    obj = arrayList2.get(i12);
                    iVar = (i) obj;
                }
                obj = null;
                iVar = (i) obj;
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int lastIndexOf = (iVar2 == null ? -1 : arrayList2.lastIndexOf(iVar2)) + 1;
                if (lastIndexOf < size2) {
                    obj = arrayList2.get(lastIndexOf);
                    iVar = (i) obj;
                }
                obj = null;
                iVar = (i) obj;
            }
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i13 = this.f1203l;
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
                i5 = lVar.f3929c;
                Rect rect4 = new Rect();
                iVar = null;
                for (i6 = i2; i6 < i5; i6++) {
                    i iVar3 = (i) lVar.f3928b[i6];
                    if (iVar3 != iVar2) {
                        eVar.getClass();
                        iVar3.f(rect4);
                        if (AbstractC0058a.G(i, rect2, rect4)) {
                            if (AbstractC0058a.G(i, rect2, rect3) && !AbstractC0058a.c(i, rect2, rect4, rect3)) {
                                if (!AbstractC0058a.c(i, rect2, rect3, rect4)) {
                                    int K2 = AbstractC0058a.K(i, rect2, rect4);
                                    int M2 = AbstractC0058a.M(i, rect2, rect4);
                                    int i14 = (M2 * M2) + (K2 * 13 * K2);
                                    int K3 = AbstractC0058a.K(i, rect2, rect3);
                                    int M3 = AbstractC0058a.M(i, rect2, rect3);
                                    if (i14 >= (M3 * M3) + (K3 * 13 * K3)) {
                                    }
                                }
                            }
                            rect3.set(rect4);
                            iVar = iVar3;
                        }
                    }
                }
            }
            i3 = -1;
            Rect rect32 = new Rect(rect2);
            if (i != 17) {
            }
            eVar2.getClass();
            i5 = lVar.f3929c;
            Rect rect42 = new Rect();
            iVar = null;
            while (i6 < i5) {
            }
        }
        i iVar4 = iVar;
        if (iVar4 != null) {
            int i15 = i2;
            while (true) {
                if (i15 >= lVar.f3929c) {
                    i4 = i3;
                    break;
                }
                if (lVar.f3928b[i15] == iVar4) {
                    i4 = i15;
                    break;
                }
                i15++;
            }
            i9 = lVar.f3927a[i4];
        }
        return p(i9);
    }

    public final i n(int i) {
        if (i != -1) {
            return k(i);
        }
        Chip chip = this.i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        i iVar = new i(obtain);
        WeakHashMap weakHashMap = P.f711a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            iVar.f878a.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return iVar;
    }

    public abstract void o(int i, i iVar);

    public final boolean p(int i) {
        int i2;
        Chip chip = this.i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.f1203l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f1203l = i;
        C0.d dVar = (C0.d) this;
        if (i == 1) {
            Chip chip2 = dVar.f74q;
            chip2.f2342m = true;
            chip2.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final void q(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.f1201h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i2);
            i n2 = n(i);
            obtain.getText().add(n2.g());
            AccessibilityNodeInfo accessibilityNodeInfo = n2.f878a;
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
