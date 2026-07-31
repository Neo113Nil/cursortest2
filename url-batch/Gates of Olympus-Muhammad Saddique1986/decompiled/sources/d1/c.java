package d1;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f5661c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f5662d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f5663e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f5664f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f5665g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f5666h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f5667i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f5668j;

    /* renamed from: a, reason: collision with root package name */
    public final Object f5669a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5670b;

    static {
        new c(null, 1, null, null);
        new c(null, 2, null, null);
        new c(null, 4, null, null);
        new c(null, 8, null, null);
        new c(null, 16, null, null);
        new c(null, 32, null, null);
        f5661c = new c(null, 64, null, null);
        f5662d = new c(null, 128, null, null);
        new c(null, 256, null, k.class);
        new c(null, 512, null, k.class);
        new c(null, 1024, null, l.class);
        new c(null, 2048, null, l.class);
        f5663e = new c(null, 4096, null, null);
        f5664f = new c(null, 8192, null, null);
        new c(null, 16384, null, null);
        new c(null, 32768, null, null);
        new c(null, 65536, null, null);
        new c(null, 131072, null, p.class);
        new c(null, 262144, null, null);
        new c(null, 524288, null, null);
        new c(null, 1048576, null, null);
        new c(null, 2097152, null, q.class);
        int i3 = Build.VERSION.SDK_INT;
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, n.class);
        f5665g = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null);
        f5666h = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null);
        f5667i = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null);
        f5668j = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null);
        new c(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null);
        new c(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null);
        new c(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null);
        new c(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, o.class);
        new c(i3 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, m.class);
        new c(i3 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null);
        new c(i3 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null);
        new c(i3 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null);
        new c(i3 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null);
        new c(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null);
        new c(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null);
        new c(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null);
        new c(i3 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null);
        new c(i3 >= 34 ? f.a() : null, R.id.accessibilityActionScrollInDirection, null, null);
    }

    public c(String str, int i3) {
        this(null, i3, str, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        Object obj2 = ((c) obj).f5669a;
        Object obj3 = this.f5669a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f5669a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String c2 = h.c(this.f5670b);
        if (c2.equals("ACTION_UNKNOWN")) {
            Object obj = this.f5669a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                c2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(c2);
        return sb.toString();
    }

    public c(Object obj, int i3, String str, Class cls) {
        this.f5670b = i3;
        if (obj == null) {
            this.f5669a = new AccessibilityNodeInfo.AccessibilityAction(i3, str);
        } else {
            this.f5669a = obj;
        }
    }
}
