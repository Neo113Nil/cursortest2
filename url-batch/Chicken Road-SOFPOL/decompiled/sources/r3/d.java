package r3;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import q3.v;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f6541e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f6542f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f6543g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f6544h;
    public static final d i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f6545j;

    /* renamed from: k, reason: collision with root package name */
    public static final d f6546k;

    /* renamed from: l, reason: collision with root package name */
    public static final d f6547l;

    /* renamed from: m, reason: collision with root package name */
    public static final d f6548m;

    /* renamed from: n, reason: collision with root package name */
    public static final d f6549n;

    /* renamed from: o, reason: collision with root package name */
    public static final d f6550o;

    /* renamed from: p, reason: collision with root package name */
    public static final d f6551p;

    /* renamed from: a, reason: collision with root package name */
    public final Object f6552a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6553b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f6554c;

    /* renamed from: d, reason: collision with root package name */
    public final p f6555d;

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
        new d((String) null, 1);
        new d((String) null, 2);
        new d((String) null, 4);
        new d((String) null, 8);
        f6541e = new d((String) null, 16);
        new d((String) null, 32);
        f6542f = new d((String) null, 64);
        f6543g = new d((String) null, 128);
        new d(256, i.class);
        new d(512, i.class);
        new d(1024, j.class);
        new d(2048, j.class);
        f6544h = new d((String) null, 4096);
        i = new d((String) null, 8192);
        new d((String) null, 16384);
        new d((String) null, 32768);
        new d((String) null, 65536);
        new d(131072, n.class);
        f6545j = new d((String) null, 262144);
        f6546k = new d((String) null, 524288);
        f6547l = new d((String) null, 1048576);
        new d(2097152, o.class);
        int i8 = Build.VERSION.SDK_INT;
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, l.class);
        f6548m = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        f6549n = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f6550o = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        f6551p = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        if (i8 >= 29) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            accessibilityAction = accessibilityAction18;
        } else {
            accessibilityAction = null;
        }
        new d(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
        if (i8 >= 29) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction2 = accessibilityAction17;
        } else {
            accessibilityAction2 = null;
        }
        new d(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
        new d(i8 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        if (i8 >= 29) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction3 = accessibilityAction16;
        } else {
            accessibilityAction3 = null;
        }
        new d(accessibilityAction3, R.id.accessibilityActionPageRight, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, m.class);
        new d(i8 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, k.class);
        if (i8 >= 28) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction4 = accessibilityAction15;
        } else {
            accessibilityAction4 = null;
        }
        new d(accessibilityAction4, R.id.accessibilityActionShowTooltip, null, null, null);
        if (i8 >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction5 = accessibilityAction14;
        } else {
            accessibilityAction5 = null;
        }
        new d(accessibilityAction5, R.id.accessibilityActionHideTooltip, null, null, null);
        new d(i8 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i8 >= 30) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction6 = accessibilityAction13;
        } else {
            accessibilityAction6 = null;
        }
        new d(accessibilityAction6, R.id.accessibilityActionImeEnter, null, null, null);
        new d(i8 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        if (i8 >= 32) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction7 = accessibilityAction12;
        } else {
            accessibilityAction7 = null;
        }
        new d(accessibilityAction7, R.id.accessibilityActionDragDrop, null, null, null);
        if (i8 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction8 = accessibilityAction11;
        } else {
            accessibilityAction8 = null;
        }
        new d(accessibilityAction8, R.id.accessibilityActionDragCancel, null, null, null);
        if (i8 >= 33) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction9 = accessibilityAction10;
        } else {
            accessibilityAction9 = null;
        }
        new d(accessibilityAction9, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new d(i8 >= 34 ? v.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public d(String str, int i8) {
        this(null, i8, str, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f6552a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        Object obj2 = ((d) obj).f6552a;
        Object obj3 = this.f6552a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f6552a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d8 = f.d(this.f6553b);
        if (d8.equals("ACTION_UNKNOWN")) {
            Object obj = this.f6552a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d8 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d8);
        return sb.toString();
    }

    public d(int i8, Class cls) {
        this(null, i8, null, null, cls);
    }

    public d(Object obj, int i8, CharSequence charSequence, p pVar, Class cls) {
        this.f6553b = i8;
        this.f6555d = pVar;
        if (obj == null) {
            this.f6552a = new AccessibilityNodeInfo.AccessibilityAction(i8, charSequence);
        } else {
            this.f6552a = obj;
        }
        this.f6554c = cls;
    }
}
