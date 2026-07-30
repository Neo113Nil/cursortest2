package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class b2 {
    public static final b2 c;
    public static final b2 d;
    public static final b2 e;
    public static final b2 f;
    public static final b2 g;
    public static final b2 h;
    public static final b2 i;
    public static final b2 j;
    public final Object a;
    public final int b;

    static {
        new b2(null, 1, null, null);
        new b2(null, 2, null, null);
        new b2(null, 4, null, null);
        new b2(null, 8, null, null);
        new b2(null, 16, null, null);
        new b2(null, 32, null, null);
        c = new b2(null, 64, null, null);
        d = new b2(null, 128, null, null);
        new b2(null, 256, null, j2.class);
        new b2(null, 512, null, j2.class);
        new b2(null, 1024, null, k2.class);
        new b2(null, 2048, null, k2.class);
        e = new b2(null, 4096, null, null);
        f = new b2(null, Utility.DEFAULT_STREAM_BUFFER_SIZE, null, null);
        new b2(null, 16384, null, null);
        new b2(null, 32768, null, null);
        new b2(null, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST, null, null);
        new b2(null, 131072, null, o2.class);
        new b2(null, 262144, null, null);
        new b2(null, 524288, null, null);
        new b2(null, 1048576, null, null);
        new b2(null, 2097152, null, p2.class);
        new b2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null);
        new b2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, m2.class);
        g = new b2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null);
        h = new b2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null);
        i = new b2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null);
        j = new b2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null);
        int i2 = Build.VERSION.SDK_INT;
        new b2(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null);
        new b2(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null);
        new b2(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null);
        new b2(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null);
        new b2(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null);
        new b2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, n2.class);
        new b2(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, l2.class);
        new b2(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null);
        new b2(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null);
        new b2(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null);
        new b2(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null);
        new b2(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null);
        new b2(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null);
        new b2(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null);
        new b2(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null);
        new b2(i2 >= 34 ? v1.b() : null, R.id.accessibilityActionScrollInDirection, null, null);
        int i3 = rq.a;
        new b2((i2 < 36 || qq.a() < 3600001) ? null : f2.a(), R.id.ALT, null, null);
    }

    public b2(Object obj, int i2, CharSequence charSequence, Class cls) {
        this.b = i2;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
        } else {
            this.a = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b2)) {
            return false;
        }
        Object obj2 = ((b2) obj).a;
        Object obj3 = this.a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String c2 = g2.c(this.b);
        if (c2.equals("ACTION_UNKNOWN")) {
            Object obj = this.a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                c2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(c2);
        return sb.toString();
    }

    public b2(int i2, String str) {
        this(null, i2, str, null);
    }
}
