package o0;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import n0.u;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f2850e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f2851f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f2852g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f2853h;
    public static final c i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f2854j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f2855k;

    /* renamed from: l, reason: collision with root package name */
    public static final c f2856l;

    /* renamed from: a, reason: collision with root package name */
    public final Object f2857a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2858b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f2859c;
    public final o d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        new c((String) null, 1);
        new c((String) null, 2);
        new c((String) null, 4);
        new c((String) null, 8);
        f2850e = new c((String) null, 16);
        new c((String) null, 32);
        new c((String) null, 64);
        new c((String) null, 128);
        new c(256, h.class);
        new c(512, h.class);
        new c(1024, i.class);
        new c(2048, i.class);
        f2851f = new c((String) null, 4096);
        f2852g = new c((String) null, 8192);
        new c((String) null, 16384);
        new c((String) null, 32768);
        new c((String) null, 65536);
        new c(131072, m.class);
        f2853h = new c((String) null, 262144);
        i = new c((String) null, 524288);
        f2854j = new c((String) null, 1048576);
        new c(2097152, n.class);
        int i4 = Build.VERSION.SDK_INT;
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, k.class);
        f2855k = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f2856l = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        if (i4 >= 29) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            accessibilityAction = accessibilityAction18;
        } else {
            accessibilityAction = null;
        }
        new c(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
        if (i4 >= 29) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction2 = accessibilityAction17;
        } else {
            accessibilityAction2 = null;
        }
        new c(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
        new c(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        if (i4 >= 29) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction3 = accessibilityAction16;
        } else {
            accessibilityAction3 = null;
        }
        new c(accessibilityAction3, R.id.accessibilityActionPageRight, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, l.class);
        new c(i4 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, j.class);
        if (i4 >= 28) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction4 = accessibilityAction15;
        } else {
            accessibilityAction4 = null;
        }
        new c(accessibilityAction4, R.id.accessibilityActionShowTooltip, null, null, null);
        if (i4 >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction5 = accessibilityAction14;
        } else {
            accessibilityAction5 = null;
        }
        new c(accessibilityAction5, R.id.accessibilityActionHideTooltip, null, null, null);
        new c(i4 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i4 >= 30) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction6 = accessibilityAction13;
        } else {
            accessibilityAction6 = null;
        }
        new c(accessibilityAction6, R.id.accessibilityActionImeEnter, null, null, null);
        new c(i4 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        if (i4 >= 32) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction7 = accessibilityAction12;
        } else {
            accessibilityAction7 = null;
        }
        new c(accessibilityAction7, R.id.accessibilityActionDragDrop, null, null, null);
        if (i4 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction8 = accessibilityAction11;
        } else {
            accessibilityAction8 = null;
        }
        new c(accessibilityAction8, R.id.accessibilityActionDragCancel, null, null, null);
        if (i4 >= 33) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction9 = accessibilityAction10;
        } else {
            accessibilityAction9 = null;
        }
        new c(accessibilityAction9, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new c(i4 >= 34 ? u.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public c(String str, int i4) {
        this(null, i4, str, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f2857a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        Object obj2 = ((c) obj).f2857a;
        Object obj3 = this.f2857a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f2857a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d = e.d(this.f2858b);
        if (d.equals("ACTION_UNKNOWN")) {
            Object obj = this.f2857a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d);
        return sb.toString();
    }

    public c(int i4, Class cls) {
        this(null, i4, null, null, cls);
    }

    public c(Object obj, int i4, CharSequence charSequence, o oVar, Class cls) {
        this.f2858b = i4;
        this.d = oVar;
        if (obj == null) {
            this.f2857a = new AccessibilityNodeInfo.AccessibilityAction(i4, charSequence);
        } else {
            this.f2857a = obj;
        }
        this.f2859c = cls;
    }
}
