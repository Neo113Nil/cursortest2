package b1;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: b1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0503c {

    /* renamed from: c, reason: collision with root package name */
    public static final C0503c f5615c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0503c f5616d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0503c f5617e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0503c f5618f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0503c f5619g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0503c f5620h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0503c f5621i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0503c f5622j;

    /* renamed from: a, reason: collision with root package name */
    public final Object f5623a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5624b;

    static {
        new C0503c(null, 1, null, null);
        new C0503c(null, 2, null, null);
        new C0503c(null, 4, null, null);
        new C0503c(null, 8, null, null);
        new C0503c(null, 16, null, null);
        new C0503c(null, 32, null, null);
        f5615c = new C0503c(null, 64, null, null);
        f5616d = new C0503c(null, 128, null, null);
        new C0503c(null, 256, null, AbstractC0510j.class);
        new C0503c(null, 512, null, AbstractC0510j.class);
        new C0503c(null, 1024, null, AbstractC0511k.class);
        new C0503c(null, 2048, null, AbstractC0511k.class);
        f5617e = new C0503c(null, 4096, null, null);
        f5618f = new C0503c(null, 8192, null, null);
        new C0503c(null, 16384, null, null);
        new C0503c(null, 32768, null, null);
        new C0503c(null, 65536, null, null);
        new C0503c(null, 131072, null, AbstractC0515o.class);
        new C0503c(null, 262144, null, null);
        new C0503c(null, 524288, null, null);
        new C0503c(null, 1048576, null, null);
        new C0503c(null, 2097152, null, AbstractC0516p.class);
        int i2 = Build.VERSION.SDK_INT;
        new C0503c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null);
        new C0503c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, AbstractC0513m.class);
        f5619g = new C0503c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null);
        f5620h = new C0503c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null);
        f5621i = new C0503c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null);
        f5622j = new C0503c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null);
        new C0503c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null);
        new C0503c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null);
        new C0503c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null);
        new C0503c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null);
        new C0503c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null);
        new C0503c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, AbstractC0514n.class);
        new C0503c(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, AbstractC0512l.class);
        new C0503c(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null);
        new C0503c(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null);
        new C0503c(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null);
        new C0503c(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null);
        new C0503c(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null);
        new C0503c(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null);
        new C0503c(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null);
        new C0503c(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null);
        new C0503c(i2 >= 34 ? AbstractC0506f.a() : null, R.id.accessibilityActionScrollInDirection, null, null);
    }

    public C0503c(int i2, String str) {
        this(null, i2, str, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0503c)) {
            return false;
        }
        Object obj2 = ((C0503c) obj).f5623a;
        Object obj3 = this.f5623a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f5623a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String c4 = C0508h.c(this.f5624b);
        if (c4.equals("ACTION_UNKNOWN")) {
            Object obj = this.f5623a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                c4 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(c4);
        return sb.toString();
    }

    public C0503c(Object obj, int i2, String str, Class cls) {
        this.f5624b = i2;
        if (obj == null) {
            this.f5623a = new AccessibilityNodeInfo.AccessibilityAction(i2, str);
        } else {
            this.f5623a = obj;
        }
    }
}
