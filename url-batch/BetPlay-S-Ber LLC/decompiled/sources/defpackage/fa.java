package defpackage;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.awerser.monnit.betplay.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class fa extends w {
    public static final Rect l = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final vg m = new vg(20);
    public static final vg n = new vg(21);
    public final AccessibilityManager e;
    public final Chip f;
    public li g;
    public final /* synthetic */ Chip k;
    public final Rect a = new Rect();
    public final Rect b = new Rect();
    public final Rect c = new Rect();
    public final int[] d = new int[2];
    public int h = Integer.MIN_VALUE;
    public int i = Integer.MIN_VALUE;
    public int j = Integer.MIN_VALUE;

    public fa(Chip chip, Chip chip2) {
        this.k = chip;
        this.f = chip2;
        this.e = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
        chip2.setFocusable(true);
        if (chip2.getImportantForAccessibility() == 0) {
            chip2.setImportantForAccessibility(1);
        }
    }

    public final boolean a(int i) {
        if (this.i != i) {
            return false;
        }
        this.i = Integer.MIN_VALUE;
        f(i, false);
        h(i, 8);
        return true;
    }

    public final i0 b(int i) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        i0 i0Var = new i0(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        i0Var.g("android.view.View");
        Rect rect = l;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.f;
        obtain.setParent(chip);
        AccessibilityNodeInfo accessibilityNodeInfo = i0Var.a;
        if (i == 1) {
            Chip chip2 = this.k;
            CharSequence closeIconContentDescription = chip2.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip2.getText();
                accessibilityNodeInfo.setContentDescription(chip2.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            closeIconTouchBoundsInt = chip2.getCloseIconTouchBoundsInt();
            accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
            i0Var.b(c0.e);
            accessibilityNodeInfo.setEnabled(chip2.isEnabled());
            i0Var.g(Button.class.getName());
        } else {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.C);
        }
        if (i0Var.f() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.b;
        obtain.getBoundsInParent(rect2);
        Rect rect3 = this.a;
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
        i0Var.b = i;
        obtain.setSource(chip, i);
        if (this.h == i) {
            obtain.setAccessibilityFocused(true);
            i0Var.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            i0Var.a(64);
        }
        boolean z = this.i == i;
        if (z) {
            i0Var.a(2);
        } else if (obtain.isFocusable()) {
            i0Var.a(1);
        }
        obtain.setFocused(z);
        int[] iArr = this.d;
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
        Rect rect5 = this.c;
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
                            accessibilityNodeInfo.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return i0Var;
    }

    public final void c(ArrayList arrayList) {
        ga gaVar;
        arrayList.add(0);
        Rect rect = Chip.C;
        Chip chip = this.k;
        if (!chip.c() || (gaVar = chip.j) == null || !gaVar.Y || chip.m == null) {
            return;
        }
        arrayList.add(1);
    }

    public final boolean d(int i, Rect rect) {
        Object obj;
        i0 i0Var;
        int i2;
        Object obj2;
        i0 i0Var2;
        ArrayList arrayList = new ArrayList();
        c(arrayList);
        t30 t30Var = new t30();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            t30Var.b(((Integer) arrayList.get(i3)).intValue(), b(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.i;
        int i5 = Integer.MIN_VALUE;
        if (i4 == Integer.MIN_VALUE) {
            i0Var = null;
        } else {
            int e = op.e(t30Var.h, i4, t30Var.f);
            if (e < 0 || (obj = t30Var.g[e]) == op.m) {
                obj = null;
            }
            i0Var = (i0) obj;
        }
        vg vgVar = m;
        vg vgVar2 = n;
        Chip chip = this.f;
        int i6 = -1;
        if (i == 1 || i == 2) {
            boolean z = chip.getLayoutDirection() == 1;
            vgVar2.getClass();
            int i7 = t30Var.h;
            ArrayList arrayList2 = new ArrayList(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                arrayList2.add((i0) t30Var.g[i8]);
            }
            Collections.sort(arrayList2, new jj(vgVar, z));
            if (i == 1) {
                i2 = 0;
                int size = arrayList2.size();
                if (i0Var != null) {
                    size = arrayList2.indexOf(i0Var);
                }
                int i9 = size - 1;
                obj2 = i9 >= 0 ? arrayList2.get(i9) : null;
            } else {
                if (i != 2) {
                    o8.j("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
                int size2 = arrayList2.size();
                int lastIndexOf = (i0Var == null ? -1 : arrayList2.lastIndexOf(i0Var)) + 1;
                i2 = 0;
                obj2 = lastIndexOf < size2 ? arrayList2.get(lastIndexOf) : null;
            }
            i0Var2 = (i0) obj2;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                o8.j("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i10 = this.i;
            if (i10 != Integer.MIN_VALUE) {
                e(i10).a.getBoundsInScreen(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        o8.j("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i != 130) {
                    o8.j("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            vgVar2.getClass();
            int i11 = t30Var.h;
            Rect rect4 = new Rect();
            i0Var2 = null;
            for (int i12 = 0; i12 < i11; i12++) {
                i0 i0Var3 = (i0) t30Var.g[i12];
                if (i0Var3 != i0Var) {
                    vgVar.getClass();
                    i0Var3.a.getBoundsInScreen(rect4);
                    if (vw.O(i, rect2, rect4)) {
                        if (vw.O(i, rect2, rect3) && !vw.f(i, rect2, rect4, rect3)) {
                            if (!vw.f(i, rect2, rect3, rect4)) {
                                int W = vw.W(i, rect2, rect4);
                                int X = vw.X(i, rect2, rect4);
                                int i13 = (X * X) + (W * 13 * W);
                                int W2 = vw.W(i, rect2, rect3);
                                int X2 = vw.X(i, rect2, rect3);
                                if (i13 >= (X2 * X2) + (W2 * 13 * W2)) {
                                }
                            }
                        }
                        rect3.set(rect4);
                        i0Var2 = i0Var3;
                    }
                }
            }
            i2 = 0;
        }
        i0 i0Var4 = i0Var2;
        if (i0Var4 != null) {
            int i14 = t30Var.h;
            int i15 = i2;
            while (true) {
                if (i15 >= i14) {
                    break;
                }
                if (t30Var.g[i15] == i0Var4) {
                    i6 = i15;
                    break;
                }
                i15++;
            }
            i5 = t30Var.f[i6];
        }
        return g(i5);
    }

    public final i0 e(int i) {
        if (i != -1) {
            return b(i);
        }
        Chip chip = this.f;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        i0 i0Var = new i0(obtain);
        WeakHashMap weakHashMap = e90.a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        c(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            i0Var.a.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return i0Var;
    }

    public final void f(int i, boolean z) {
        Chip chip = this.k;
        if (i == 1) {
            chip.s = z;
        }
        ga gaVar = chip.j;
        boolean z2 = chip.s;
        boolean z3 = false;
        if (gaVar.Z != null) {
            z3 = gaVar.X(z2 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : ga.T0);
        }
        if (z3) {
            chip.refreshDrawableState();
        }
    }

    public final boolean g(int i) {
        int i2;
        Chip chip = this.f;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.i) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            a(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.i = i;
        f(i, true);
        h(i, 8);
        return true;
    }

    @Override // defpackage.w
    public final k0 getAccessibilityNodeProvider(View view) {
        if (this.g == null) {
            this.g = new li(this);
        }
        return this.g;
    }

    public final void h(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.e.isEnabled() || (parent = (view = this.f).getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i2);
            i0 e = e(i);
            obtain.getText().add(e.f());
            AccessibilityNodeInfo accessibilityNodeInfo = e.a;
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

    @Override // defpackage.w
    public final void onInitializeAccessibilityNodeInfo(View view, i0 i0Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = i0Var.a;
        super.onInitializeAccessibilityNodeInfo(view, i0Var);
        Chip chip = this.k;
        ga gaVar = chip.j;
        accessibilityNodeInfo.setCheckable(gaVar != null && gaVar.e0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        i0Var.g(chip.getAccessibilityClassName());
        i0Var.h(chip.getText());
    }
}
