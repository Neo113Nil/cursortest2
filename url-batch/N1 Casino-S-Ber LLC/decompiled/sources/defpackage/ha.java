package defpackage;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.derinko.gbini.n1casino.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ha extends w {
    public static final Rect o = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final dh p = new dh(19);
    public static final dh q = new dh(20);
    public final AccessibilityManager h;
    public final Chip i;
    public si j;
    public final /* synthetic */ Chip n;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    public ha(Chip chip, Chip chip2) {
        this.n = chip;
        this.i = chip2;
        this.h = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
        chip2.setFocusable(true);
        if (chip2.getImportantForAccessibility() == 0) {
            chip2.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.w
    public final k0 b(View view) {
        if (this.j == null) {
            this.j = new si(this);
        }
        return this.j;
    }

    @Override // defpackage.w
    public final void d(View view, i0 i0Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = i0Var.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.n;
        ia iaVar = chip.j;
        accessibilityNodeInfo.setCheckable(iaVar != null && iaVar.f0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        i0Var.g(chip.getAccessibilityClassName());
        i0Var.i(chip.getText());
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

    public final i0 k(int i) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        i0 i0Var = new i0(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        i0Var.g("android.view.View");
        Rect rect = o;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.i;
        obtain.setParent(chip);
        AccessibilityNodeInfo accessibilityNodeInfo = i0Var.a;
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
            i0Var.b(c0.e);
            accessibilityNodeInfo.setEnabled(chip2.isEnabled());
            i0Var.g(Button.class.getName());
        } else {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.B);
        }
        if (i0Var.f() == null && obtain.getContentDescription() == null) {
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
        i0Var.b = i;
        obtain.setSource(chip, i);
        if (this.k == i) {
            obtain.setAccessibilityFocused(true);
            i0Var.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            i0Var.a(64);
        }
        boolean z = this.l == i;
        if (z) {
            i0Var.a(2);
        } else if (obtain.isFocusable()) {
            i0Var.a(1);
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
        return i0Var;
    }

    public final void l(ArrayList arrayList) {
        ia iaVar;
        arrayList.add(0);
        Rect rect = Chip.B;
        Chip chip = this.n;
        if (!chip.c() || (iaVar = chip.j) == null || !iaVar.Z || chip.m == null) {
            return;
        }
        arrayList.add(1);
    }

    public final boolean m(int i, Rect rect) {
        Object obj;
        i0 i0Var;
        int i2;
        Object obj2;
        i0 i0Var2;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        i30 i30Var = new i30();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            i30Var.b(((Integer) arrayList.get(i3)).intValue(), k(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.l;
        int i5 = Integer.MIN_VALUE;
        if (i4 == Integer.MIN_VALUE) {
            i0Var = null;
        } else {
            int i6 = jw.i(i30Var.h, i4, i30Var.f);
            if (i6 < 0 || (obj = i30Var.g[i6]) == e70.h) {
                obj = null;
            }
            i0Var = (i0) obj;
        }
        dh dhVar = p;
        dh dhVar2 = q;
        Chip chip = this.i;
        int i7 = -1;
        if (i == 1 || i == 2) {
            boolean z = chip.getLayoutDirection() == 1;
            dhVar2.getClass();
            int i8 = i30Var.h;
            ArrayList arrayList2 = new ArrayList(i8);
            for (int i9 = 0; i9 < i8; i9++) {
                arrayList2.add((i0) i30Var.g[i9]);
            }
            Collections.sort(arrayList2, new oj(dhVar, z));
            if (i == 1) {
                i2 = 0;
                int size = arrayList2.size();
                if (i0Var != null) {
                    size = arrayList2.indexOf(i0Var);
                }
                int i10 = size - 1;
                obj2 = i10 >= 0 ? arrayList2.get(i10) : null;
            } else {
                if (i != 2) {
                    t8.k("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
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
                t8.k("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i11 = this.l;
            if (i11 != Integer.MIN_VALUE) {
                n(i11).a.getBoundsInScreen(rect2);
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
                        t8.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
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
                    t8.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            dhVar2.getClass();
            int i12 = i30Var.h;
            Rect rect4 = new Rect();
            i0Var2 = null;
            for (int i13 = 0; i13 < i12; i13++) {
                i0 i0Var3 = (i0) i30Var.g[i13];
                if (i0Var3 != i0Var) {
                    dhVar.getClass();
                    i0Var3.a.getBoundsInScreen(rect4);
                    if (e70.B(i, rect2, rect4)) {
                        if (e70.B(i, rect2, rect3) && !e70.c(i, rect2, rect4, rect3)) {
                            if (!e70.c(i, rect2, rect3, rect4)) {
                                int E = e70.E(i, rect2, rect4);
                                int F = e70.F(i, rect2, rect4);
                                int i14 = (F * F) + (E * 13 * E);
                                int E2 = e70.E(i, rect2, rect3);
                                int F2 = e70.F(i, rect2, rect3);
                                if (i14 >= (F2 * F2) + (E2 * 13 * E2)) {
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
            int i15 = i30Var.h;
            int i16 = i2;
            while (true) {
                if (i16 >= i15) {
                    break;
                }
                if (i30Var.g[i16] == i0Var4) {
                    i7 = i16;
                    break;
                }
                i16++;
            }
            i5 = i30Var.f[i7];
        }
        return p(i5);
    }

    public final i0 n(int i) {
        if (i != -1) {
            return k(i);
        }
        Chip chip = this.i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        i0 i0Var = new i0(obtain);
        WeakHashMap weakHashMap = x80.a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            i0Var.a.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return i0Var;
    }

    public final void o(int i, boolean z) {
        Chip chip = this.n;
        if (i == 1) {
            chip.r = z;
        }
        ia iaVar = chip.j;
        boolean z2 = chip.r;
        boolean z3 = false;
        if (iaVar.a0 != null) {
            z3 = iaVar.X(z2 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : ia.U0);
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
            i0 n = n(i);
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
