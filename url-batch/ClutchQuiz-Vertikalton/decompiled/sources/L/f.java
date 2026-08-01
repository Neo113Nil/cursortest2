package L;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final f f467e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f468f;

    /* renamed from: g, reason: collision with root package name */
    public static final f f469g;
    public static final f h;
    public static final f i;

    /* renamed from: j, reason: collision with root package name */
    public static final f f470j;

    /* renamed from: k, reason: collision with root package name */
    public static final f f471k;

    /* renamed from: l, reason: collision with root package name */
    public static final f f472l;

    /* renamed from: a, reason: collision with root package name */
    public final Object f473a;

    /* renamed from: b, reason: collision with root package name */
    public final int f474b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f475c;
    public final t d;

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
        new f(1);
        new f(2);
        new f(4);
        new f(8);
        f467e = new f(16);
        new f(32);
        new f(64);
        new f(128);
        new f(256, m.class);
        new f(512, m.class);
        new f(1024, n.class);
        new f(2048, n.class);
        f468f = new f(4096);
        f469g = new f(8192);
        new f(16384);
        new f(32768);
        new f(65536);
        new f(131072, r.class);
        h = new f(262144);
        i = new f(524288);
        f470j = new f(1048576);
        new f(2097152, s.class);
        int i2 = Build.VERSION.SDK_INT;
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, p.class);
        f471k = new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f472l = new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new f(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        if (i2 >= 29) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction = accessibilityAction16;
        } else {
            accessibilityAction = null;
        }
        new f(accessibilityAction, R.id.accessibilityActionPageDown, null, null, null);
        new f(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        if (i2 >= 29) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction2 = accessibilityAction15;
        } else {
            accessibilityAction2 = null;
        }
        new f(accessibilityAction2, R.id.accessibilityActionPageRight, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, q.class);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, o.class);
        if (i2 >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction3 = accessibilityAction14;
        } else {
            accessibilityAction3 = null;
        }
        new f(accessibilityAction3, R.id.accessibilityActionShowTooltip, null, null, null);
        if (i2 >= 28) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction4 = accessibilityAction13;
        } else {
            accessibilityAction4 = null;
        }
        new f(accessibilityAction4, R.id.accessibilityActionHideTooltip, null, null, null);
        new f(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i2 >= 30) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction5 = accessibilityAction12;
        } else {
            accessibilityAction5 = null;
        }
        new f(accessibilityAction5, R.id.accessibilityActionImeEnter, null, null, null);
        new f(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        if (i2 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction6 = accessibilityAction11;
        } else {
            accessibilityAction6 = null;
        }
        new f(accessibilityAction6, R.id.accessibilityActionDragDrop, null, null, null);
        if (i2 >= 32) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction7 = accessibilityAction10;
        } else {
            accessibilityAction7 = null;
        }
        new f(accessibilityAction7, R.id.accessibilityActionDragCancel, null, null, null);
        if (i2 >= 33) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction8 = accessibilityAction9;
        } else {
            accessibilityAction8 = null;
        }
        new f(accessibilityAction8, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new f(i2 >= 34 ? i.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public f(int i2) {
        this(null, i2, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f473a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        Object obj2 = ((f) obj).f473a;
        Object obj3 = this.f473a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f473a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d = k.d(this.f474b);
        if (d.equals("ACTION_UNKNOWN")) {
            Object obj = this.f473a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d);
        return sb.toString();
    }

    public f(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public f(Object obj, int i2, String str, t tVar, Class cls) {
        this.f474b = i2;
        this.d = tVar;
        if (obj == null) {
            this.f473a = new AccessibilityNodeInfo.AccessibilityAction(i2, str);
        } else {
            this.f473a = obj;
        }
        this.f475c = cls;
    }
}
