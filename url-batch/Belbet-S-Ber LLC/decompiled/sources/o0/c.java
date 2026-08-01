package o0;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import n0.y;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f2870e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f2871f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f2872g;
    public static final c h;
    public static final c i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f2873j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f2874k;

    /* renamed from: l, reason: collision with root package name */
    public static final c f2875l;

    /* renamed from: m, reason: collision with root package name */
    public static final c f2876m;

    /* renamed from: a, reason: collision with root package name */
    public final Object f2877a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2878b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f2879c;
    public final p d;

    /* JADX WARN: Code restructure failed: missing block: B:45:0x024f, code lost:
    
        if ((r0 < 36 ? r0 * 100000 : android.os.Build.VERSION.SDK_INT_FULL) >= 3600001) goto L63;
     */
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
        boolean z4 = true;
        new c((String) null, 1);
        new c((String) null, 2);
        new c((String) null, 4);
        new c((String) null, 8);
        f2870e = new c((String) null, 16);
        new c((String) null, 32);
        new c((String) null, 64);
        new c((String) null, 128);
        new c(256, i.class);
        new c(512, i.class);
        new c(1024, j.class);
        new c(2048, j.class);
        f2871f = new c((String) null, 4096);
        f2872g = new c((String) null, 8192);
        new c((String) null, 16384);
        new c((String) null, 32768);
        new c((String) null, 65536);
        new c(131072, n.class);
        h = new c((String) null, 262144);
        new c((String) null, 524288);
        i = new c((String) null, 1048576);
        new c(2097152, o.class);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        f2873j = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, l.class);
        f2874k = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f2875l = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        int i4 = Build.VERSION.SDK_INT;
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
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, m.class);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, k.class);
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
        f2876m = new c(i4 >= 34 ? y.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        int i5 = j0.b.f2129a;
        if (i4 >= 36) {
        }
        z4 = false;
        new c(z4 ? e.a() : null, R.id.ALT, null, null, null);
    }

    public c(String str, int i4) {
        this(null, i4, str, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f2877a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        Object obj2 = ((c) obj).f2877a;
        Object obj3 = this.f2877a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f2877a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d = g.d(this.f2878b);
        if (d.equals("ACTION_UNKNOWN")) {
            Object obj = this.f2877a;
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

    public c(Object obj, int i4, CharSequence charSequence, p pVar, Class cls) {
        this.f2878b = i4;
        this.d = pVar;
        if (obj == null) {
            this.f2877a = new AccessibilityNodeInfo.AccessibilityAction(i4, charSequence);
        } else {
            this.f2877a = obj;
        }
        this.f2879c = cls;
    }
}
