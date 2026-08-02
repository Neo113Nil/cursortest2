package F;

import E.AbstractC0021w;
import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f735c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f736d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f737e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f738f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f739a;

    /* renamed from: b, reason: collision with root package name */
    public final int f740b;

    static {
        new d(null, 1, null);
        new d(null, 2, null);
        new d(null, 4, null);
        new d(null, 8, null);
        new d(null, 16, null);
        new d(null, 32, null);
        new d(null, 64, null);
        new d(null, 128, null);
        new d(null, 256, g.class);
        new d(null, 512, g.class);
        new d(null, 1024, h.class);
        new d(null, 2048, h.class);
        f735c = new d(null, 4096, null);
        f736d = new d(null, 8192, null);
        new d(null, 16384, null);
        new d(null, 32768, null);
        new d(null, 65536, null);
        new d(null, 131072, l.class);
        new d(null, 262144, null);
        new d(null, 524288, null);
        new d(null, 1048576, null);
        new d(null, 2097152, m.class);
        int i4 = Build.VERSION.SDK_INT;
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, j.class);
        f737e = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null);
        f738f = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null);
        new d(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null);
        new d(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null);
        new d(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null);
        new d(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, k.class);
        new d(i4 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, i.class);
        new d(i4 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null);
        new d(i4 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null);
        new d(i4 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null);
        new d(i4 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null);
        new d(i4 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null);
        new d(i4 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null);
        new d(i4 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null);
        new d(i4 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null);
        new d(i4 >= 34 ? AbstractC0021w.a() : null, R.id.accessibilityActionScrollInDirection, null);
    }

    public d(Object obj, int i4, Class cls) {
        this.f740b = i4;
        if (obj == null) {
            this.f739a = new AccessibilityNodeInfo.AccessibilityAction(i4, null);
        } else {
            this.f739a = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        Object obj2 = ((d) obj).f739a;
        Object obj3 = this.f739a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f739a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String b4 = f.b(this.f740b);
        if (b4.equals("ACTION_UNKNOWN")) {
            Object obj = this.f739a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                b4 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(b4);
        return sb.toString();
    }
}
