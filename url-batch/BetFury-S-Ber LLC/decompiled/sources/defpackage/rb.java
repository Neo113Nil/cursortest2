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
import com.trembin.nirefon.betfury.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class rb extends a0 {
    public static final Rect o = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final sl p = new sl();
    public static final sl q = new sl();
    public final AccessibilityManager h;
    public final Chip i;
    public zn j;
    public final /* synthetic */ Chip n;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    public rb(Chip chip, Chip chip2) {
        this.n = chip;
        this.i = chip2;
        this.h = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
        chip2.setFocusable(true);
        if (chip2.getImportantForAccessibility() == 0) {
            chip2.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.a0
    public final o0 b(View view) {
        if (this.j == null) {
            this.j = new zn(this);
        }
        return this.j;
    }

    @Override // defpackage.a0
    public final void d(View view, m0 m0Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = m0Var.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.n;
        sb sbVar = chip.j;
        accessibilityNodeInfo.setCheckable(sbVar != null && sbVar.f0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        m0Var.g(chip.getAccessibilityClassName());
        m0Var.i(chip.getText());
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

    public final m0 k(int i) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        m0 m0Var = new m0(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        m0Var.g("android.view.View");
        Rect rect = o;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.i;
        obtain.setParent(chip);
        AccessibilityNodeInfo accessibilityNodeInfo = m0Var.a;
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
            m0Var.b(g0.e);
            accessibilityNodeInfo.setEnabled(chip2.isEnabled());
            m0Var.g(Button.class.getName());
        } else {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.C);
        }
        if (m0Var.f() == null && obtain.getContentDescription() == null) {
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
        m0Var.b = i;
        obtain.setSource(chip, i);
        if (this.k == i) {
            obtain.setAccessibilityFocused(true);
            m0Var.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            m0Var.a(64);
        }
        boolean z = this.l == i;
        if (z) {
            m0Var.a(2);
        } else if (obtain.isFocusable()) {
            m0Var.a(1);
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
        return m0Var;
    }

    public final void l(ArrayList arrayList) {
        sb sbVar;
        arrayList.add(0);
        Rect rect = Chip.C;
        Chip chip = this.n;
        if (!chip.c() || (sbVar = chip.j) == null || !sbVar.Z || chip.m == null) {
            return;
        }
        arrayList.add(1);
    }

    public final boolean m(int i, Rect rect) {
        int i2;
        Object obj;
        m0 m0Var;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        ne0 ne0Var = new ne0();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ne0Var.c(((Integer) arrayList.get(i3)).intValue(), k(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.l;
        int i5 = Integer.MIN_VALUE;
        m0 m0Var2 = i4 == Integer.MIN_VALUE ? null : (m0) ne0Var.b(i4);
        sl slVar = p;
        sl slVar2 = q;
        Chip chip = this.i;
        int i6 = -1;
        if (i == 1 || i == 2) {
            boolean z = chip.getLayoutDirection() == 1;
            slVar2.getClass();
            int d = ne0Var.d();
            ArrayList arrayList2 = new ArrayList(d);
            for (int i7 = 0; i7 < d; i7++) {
                arrayList2.add((m0) ne0Var.e(i7));
            }
            Collections.sort(arrayList2, new yo(slVar, z));
            if (i == 1) {
                i2 = 0;
                int size = arrayList2.size();
                if (m0Var2 != null) {
                    size = arrayList2.indexOf(m0Var2);
                }
                int i8 = size - 1;
                obj = i8 >= 0 ? arrayList2.get(i8) : null;
            } else {
                if (i != 2) {
                    s9.k("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
                int size2 = arrayList2.size();
                int lastIndexOf = (m0Var2 == null ? -1 : arrayList2.lastIndexOf(m0Var2)) + 1;
                i2 = 0;
                obj = lastIndexOf < size2 ? arrayList2.get(lastIndexOf) : null;
            }
            m0Var = (m0) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                s9.k("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i9 = this.l;
            if (i9 != Integer.MIN_VALUE) {
                n(i9).a.getBoundsInScreen(rect2);
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
                        s9.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
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
                    s9.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            slVar2.getClass();
            int d2 = ne0Var.d();
            Rect rect4 = new Rect();
            m0Var = null;
            for (int i10 = 0; i10 < d2; i10++) {
                m0 m0Var3 = (m0) ne0Var.e(i10);
                if (m0Var3 != m0Var2) {
                    slVar.getClass();
                    m0Var3.a.getBoundsInScreen(rect4);
                    if (d50.A(i, rect2, rect4)) {
                        if (d50.A(i, rect2, rect3) && !d50.b(i, rect2, rect4, rect3)) {
                            if (!d50.b(i, rect2, rect3, rect4)) {
                                int C = d50.C(i, rect2, rect4);
                                int D = d50.D(i, rect2, rect4);
                                int i11 = (D * D) + (C * 13 * C);
                                int C2 = d50.C(i, rect2, rect3);
                                int D2 = d50.D(i, rect2, rect3);
                                if (i11 >= (D2 * D2) + (C2 * 13 * C2)) {
                                }
                            }
                        }
                        rect3.set(rect4);
                        m0Var = m0Var3;
                    }
                }
            }
            i2 = 0;
        }
        m0 m0Var4 = m0Var;
        if (m0Var4 != null) {
            if (ne0Var.f) {
                mv.a(ne0Var);
            }
            int i12 = ne0Var.i;
            int i13 = i2;
            while (true) {
                if (i13 >= i12) {
                    break;
                }
                if (ne0Var.h[i13] == m0Var4) {
                    i6 = i13;
                    break;
                }
                i13++;
            }
            if (ne0Var.f) {
                mv.a(ne0Var);
            }
            i5 = ne0Var.g[i6];
        }
        return p(i5);
    }

    public final m0 n(int i) {
        if (i != -1) {
            return k(i);
        }
        Chip chip = this.i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        m0 m0Var = new m0(obtain);
        WeakHashMap weakHashMap = hm0.a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            m0Var.a.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return m0Var;
    }

    public final void o(int i, boolean z) {
        Chip chip = this.n;
        if (i == 1) {
            chip.s = z;
        }
        sb sbVar = chip.j;
        boolean z2 = chip.s;
        boolean z3 = false;
        if (sbVar.a0 != null) {
            z3 = sbVar.X(z2 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : sb.U0);
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
            m0 n = n(i);
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
