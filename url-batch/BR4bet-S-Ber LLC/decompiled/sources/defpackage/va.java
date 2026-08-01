package defpackage;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import com.moontiko.really.admiralcasino.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class va extends y {
    public static final Rect o = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final ej p = new ej(22);
    public static final ej q = new ej(23);
    public final AccessibilityManager h;
    public final Chip i;
    public yk j;
    public final /* synthetic */ Chip n;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    public va(Chip chip, Chip chip2) {
        this.n = chip;
        this.i = chip2;
        this.h = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
        chip2.setFocusable(true);
        if (chip2.getImportantForAccessibility() == 0) {
            chip2.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.y
    public final rc0 b(View view) {
        if (this.j == null) {
            this.j = new yk(this);
        }
        return this.j;
    }

    @Override // defpackage.y
    public final void d(View view, k0 k0Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = k0Var.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.n;
        wa waVar = chip.j;
        accessibilityNodeInfo.setCheckable(waVar != null && waVar.f0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        k0Var.g(chip.getAccessibilityClassName());
        k0Var.i(chip.getText());
    }

    public final boolean j(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        o(i, false);
        q(i, 8);
        return true;
    }

    public final k0 k(int i) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        k0 k0Var = new k0(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        k0Var.g("android.view.View");
        Rect rect = o;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.i;
        obtain.setParent(chip);
        AccessibilityNodeInfo accessibilityNodeInfo = k0Var.a;
        if (i == 1) {
            Chip chip2 = this.n;
            CharSequence closeIconContentDescription = chip2.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip2.getText();
                accessibilityNodeInfo.setContentDescription(chip2.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            closeIconTouchBoundsInt = chip2.getCloseIconTouchBoundsInt();
            accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
            k0Var.b(e0.e);
            accessibilityNodeInfo.setEnabled(chip2.isEnabled());
            k0Var.g(Button.class.getName());
        } else {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.C);
        }
        if (k0Var.f() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.e;
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
        k0Var.b = i;
        obtain.setSource(chip, i);
        if (this.k == i) {
            obtain.setAccessibilityFocused(true);
            k0Var.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            k0Var.a(64);
        }
        boolean z = this.l == i;
        if (z) {
            k0Var.a(2);
        } else if (obtain.isFocusable()) {
            k0Var.a(1);
        }
        obtain.setFocused(z);
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
        Rect rect5 = this.f;
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
        return k0Var;
    }

    public final void l(ArrayList arrayList) {
        wa waVar;
        arrayList.add(0);
        Rect rect = Chip.C;
        Chip chip = this.n;
        if (!chip.c() || (waVar = chip.j) == null || !waVar.Z || chip.m == null) {
            return;
        }
        arrayList.add(1);
    }

    public final boolean m(int i, Rect rect) {
        Object obj;
        k0 k0Var;
        int i2;
        Object obj2;
        k0 k0Var2;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        k60 k60Var = new k60();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            k60Var.b(((Integer) arrayList.get(i3)).intValue(), k(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.l;
        int i5 = Integer.MIN_VALUE;
        if (i4 == Integer.MIN_VALUE) {
            k0Var = null;
        } else {
            int f = xf.f(k60Var.h, i4, k60Var.f);
            if (f < 0 || (obj = k60Var.g[f]) == mz.f) {
                obj = null;
            }
            k0Var = (k0) obj;
        }
        ej ejVar = p;
        ej ejVar2 = q;
        Chip chip = this.i;
        int i6 = -1;
        if (i == 1 || i == 2) {
            boolean z = chip.getLayoutDirection() == 1;
            ejVar2.getClass();
            int i7 = k60Var.h;
            ArrayList arrayList2 = new ArrayList(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                arrayList2.add((k0) k60Var.g[i8]);
            }
            Collections.sort(arrayList2, new sl(ejVar, z));
            if (i == 1) {
                i2 = 0;
                int size = arrayList2.size();
                if (k0Var != null) {
                    size = arrayList2.indexOf(k0Var);
                }
                int i9 = size - 1;
                obj2 = i9 >= 0 ? arrayList2.get(i9) : null;
            } else {
                if (i != 2) {
                    g9.i("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
                int size2 = arrayList2.size();
                int lastIndexOf = (k0Var == null ? -1 : arrayList2.lastIndexOf(k0Var)) + 1;
                i2 = 0;
                obj2 = lastIndexOf < size2 ? arrayList2.get(lastIndexOf) : null;
            }
            k0Var2 = (k0) obj2;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                g9.i("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i10 = this.l;
            if (i10 != Integer.MIN_VALUE) {
                n(i10).a.getBoundsInScreen(rect2);
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
                        g9.i("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
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
                    g9.i("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            ejVar2.getClass();
            int i11 = k60Var.h;
            Rect rect4 = new Rect();
            k0Var2 = null;
            for (int i12 = 0; i12 < i11; i12++) {
                k0 k0Var3 = (k0) k60Var.g[i12];
                if (k0Var3 != k0Var) {
                    ejVar.getClass();
                    k0Var3.a.getBoundsInScreen(rect4);
                    if (xf.x(i, rect2, rect4)) {
                        if (xf.x(i, rect2, rect3) && !xf.d(i, rect2, rect4, rect3)) {
                            if (!xf.d(i, rect2, rect3, rect4)) {
                                int A = xf.A(i, rect2, rect4);
                                int B = xf.B(i, rect2, rect4);
                                int i13 = (B * B) + (A * 13 * A);
                                int A2 = xf.A(i, rect2, rect3);
                                int B2 = xf.B(i, rect2, rect3);
                                if (i13 >= (B2 * B2) + (A2 * 13 * A2)) {
                                }
                            }
                        }
                        rect3.set(rect4);
                        k0Var2 = k0Var3;
                    }
                }
            }
            i2 = 0;
        }
        k0 k0Var4 = k0Var2;
        if (k0Var4 != null) {
            int i14 = k60Var.h;
            int i15 = i2;
            while (true) {
                if (i15 >= i14) {
                    break;
                }
                if (k60Var.g[i15] == k0Var4) {
                    i6 = i15;
                    break;
                }
                i15++;
            }
            i5 = k60Var.f[i6];
        }
        return p(i5);
    }

    public final k0 n(int i) {
        if (i != -1) {
            return k(i);
        }
        Chip chip = this.i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        k0 k0Var = new k0(obtain);
        WeakHashMap weakHashMap = ic0.a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            k0Var.a.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return k0Var;
    }

    public final void o(int i, boolean z) {
        Chip chip = this.n;
        if (i == 1) {
            chip.s = z;
        }
        wa waVar = chip.j;
        boolean z2 = chip.s;
        boolean z3 = false;
        if (waVar.a0 != null) {
            z3 = waVar.X(z2 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : wa.U0);
        }
        if (z3) {
            chip.refreshDrawableState();
        }
    }

    public final boolean p(int i) {
        int i2;
        Chip chip = this.i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i;
        o(i, true);
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
            k0 n = n(i);
            obtain.getText().add(n.f());
            AccessibilityNodeInfo accessibilityNodeInfo = n.a;
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
