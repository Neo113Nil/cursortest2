package b1;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: b1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0296c {

    /* renamed from: c, reason: collision with root package name */
    public static final C0296c f4306c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0296c f4307d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0296c f4308e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0296c f4309f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0296c f4310g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0296c f4311h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0296c f4312i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0296c f4313j;

    /* renamed from: a, reason: collision with root package name */
    public final Object f4314a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4315b;

    static {
        new C0296c(null, 1, null, null);
        new C0296c(null, 2, null, null);
        new C0296c(null, 4, null, null);
        new C0296c(null, 8, null, null);
        new C0296c(null, 16, null, null);
        new C0296c(null, 32, null, null);
        f4306c = new C0296c(null, 64, null, null);
        f4307d = new C0296c(null, 128, null, null);
        new C0296c(null, 256, null, k.class);
        new C0296c(null, 512, null, k.class);
        new C0296c(null, 1024, null, l.class);
        new C0296c(null, 2048, null, l.class);
        f4308e = new C0296c(null, 4096, null, null);
        f4309f = new C0296c(null, 8192, null, null);
        new C0296c(null, 16384, null, null);
        new C0296c(null, 32768, null, null);
        new C0296c(null, 65536, null, null);
        new C0296c(null, 131072, null, p.class);
        new C0296c(null, 262144, null, null);
        new C0296c(null, 524288, null, null);
        new C0296c(null, 1048576, null, null);
        new C0296c(null, 2097152, null, q.class);
        int i3 = Build.VERSION.SDK_INT;
        new C0296c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null);
        new C0296c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, n.class);
        f4310g = new C0296c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null);
        f4311h = new C0296c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null);
        f4312i = new C0296c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null);
        f4313j = new C0296c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null);
        new C0296c(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null);
        new C0296c(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null);
        new C0296c(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null);
        new C0296c(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null);
        new C0296c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null);
        new C0296c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, o.class);
        new C0296c(i3 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, m.class);
        new C0296c(i3 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null);
        new C0296c(i3 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null);
        new C0296c(i3 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null);
        new C0296c(i3 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null);
        new C0296c(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null);
        new C0296c(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null);
        new C0296c(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null);
        new C0296c(i3 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null);
        new C0296c(i3 >= 34 ? f.a() : null, R.id.accessibilityActionScrollInDirection, null, null);
    }

    public C0296c(String str, int i3) {
        this(null, i3, str, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0296c)) {
            return false;
        }
        Object obj2 = ((C0296c) obj).f4314a;
        Object obj3 = this.f4314a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f4314a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String c3 = h.c(this.f4315b);
        if (c3.equals("ACTION_UNKNOWN")) {
            Object obj = this.f4314a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                c3 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(c3);
        return sb.toString();
    }

    public C0296c(Object obj, int i3, String str, Class cls) {
        this.f4315b = i3;
        if (obj == null) {
            this.f4314a = new AccessibilityNodeInfo.AccessibilityAction(i3, str);
        } else {
            this.f4314a = obj;
        }
    }
}
