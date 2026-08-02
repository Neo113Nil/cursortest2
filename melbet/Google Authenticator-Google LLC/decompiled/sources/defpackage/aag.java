package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aag {
    public static final aag a = new aag(null, 1, null, null, null);
    public static final aag b = new aag(null, 2, null, null, null);
    public static final aag c;
    public static final aag d;
    public static final aag e;
    public static final aag f;
    public static final aag g;
    public static final aag h;
    public static final aag i;
    public static final aag j;
    final Object k;
    public final int l;
    public final Class m;
    public final aas n;

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
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction25;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction26;
        new aag(null, 4, null, null, null);
        new aag(null, 8, null, null, null);
        c = new aag(null, 16, null, null, null);
        new aag(null, 32, null, null, null);
        new aag(null, 64, null, null, null);
        new aag(null, 128, null, null, null);
        new aag(null, 256, null, null, aal.class);
        new aag(null, 512, null, null, aal.class);
        new aag(null, 1024, null, null, aam.class);
        new aag(null, 2048, null, null, aam.class);
        d = new aag(null, 4096, null, null, null);
        e = new aag(null, 8192, null, null, null);
        new aag(null, 16384, null, null, null);
        new aag(null, 32768, null, null, null);
        new aag(null, 65536, null, null, null);
        new aag(null, 131072, null, null, aaq.class);
        new aag(null, 262144, null, null, null);
        new aag(null, 524288, null, null, null);
        f = new aag(null, 1048576, null, null, null);
        new aag(null, 2097152, null, null, aar.class);
        new aag(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        g = new aag(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, aao.class);
        h = new aag(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new aag(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        i = new aag(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new aag(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction27 = null;
        if (Build.VERSION.SDK_INT >= 29) {
            accessibilityAction26 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            accessibilityAction = accessibilityAction26;
        } else {
            accessibilityAction = null;
        }
        new aag(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
        if (Build.VERSION.SDK_INT >= 29) {
            accessibilityAction25 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction2 = accessibilityAction25;
        } else {
            accessibilityAction2 = null;
        }
        new aag(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
        if (Build.VERSION.SDK_INT >= 29) {
            accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
            accessibilityAction3 = accessibilityAction24;
        } else {
            accessibilityAction3 = null;
        }
        new aag(accessibilityAction3, R.id.accessibilityActionPageLeft, null, null, null);
        if (Build.VERSION.SDK_INT >= 29) {
            accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction4 = accessibilityAction23;
        } else {
            accessibilityAction4 = null;
        }
        new aag(accessibilityAction4, R.id.accessibilityActionPageRight, null, null, null);
        new aag(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        new aag(accessibilityAction5, R.id.accessibilityActionSetProgress, null, null, aap.class);
        accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        new aag(accessibilityAction6, R.id.accessibilityActionMoveWindow, null, null, aan.class);
        accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        new aag(accessibilityAction7, R.id.accessibilityActionShowTooltip, null, null, null);
        accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        new aag(accessibilityAction8, R.id.accessibilityActionHideTooltip, null, null, null);
        if (Build.VERSION.SDK_INT >= 30) {
            accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
            accessibilityAction9 = accessibilityAction22;
        } else {
            accessibilityAction9 = null;
        }
        new aag(accessibilityAction9, R.id.accessibilityActionPressAndHold, null, null, null);
        if (Build.VERSION.SDK_INT >= 30) {
            accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction10 = accessibilityAction21;
        } else {
            accessibilityAction10 = null;
        }
        new aag(accessibilityAction10, R.id.accessibilityActionImeEnter, null, null, null);
        if (Build.VERSION.SDK_INT >= 32) {
            accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
            accessibilityAction11 = accessibilityAction20;
        } else {
            accessibilityAction11 = null;
        }
        new aag(accessibilityAction11, R.id.accessibilityActionDragStart, null, null, null);
        if (Build.VERSION.SDK_INT >= 32) {
            accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction12 = accessibilityAction19;
        } else {
            accessibilityAction12 = null;
        }
        new aag(accessibilityAction12, R.id.accessibilityActionDragDrop, null, null, null);
        if (Build.VERSION.SDK_INT >= 32) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction13 = accessibilityAction18;
        } else {
            accessibilityAction13 = null;
        }
        new aag(accessibilityAction13, R.id.accessibilityActionDragCancel, null, null, null);
        if (Build.VERSION.SDK_INT >= 33) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction14 = accessibilityAction17;
        } else {
            accessibilityAction14 = null;
        }
        new aag(accessibilityAction14, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        if (Build.VERSION.SDK_INT >= 34) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
            accessibilityAction15 = accessibilityAction16;
        } else {
            accessibilityAction15 = null;
        }
        j = new aag(accessibilityAction15, R.id.accessibilityActionScrollInDirection, null, null, null);
        int i2 = vq.a;
        if (Build.VERSION.SDK_INT >= 36) {
            if ((Build.VERSION.SDK_INT < 36 ? Build.VERSION.SDK_INT * 100000 : Build.VERSION.SDK_INT_FULL) >= 3600001) {
                accessibilityAction27 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_EXTENDED_SELECTION;
            }
        }
        new aag(accessibilityAction27, R.id.ALT, null, null, null);
    }

    public aag(Object obj, int i2, CharSequence charSequence, aas aasVar, Class cls) {
        this.l = i2;
        this.n = aasVar;
        this.k = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence) : obj;
        this.m = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.k).getId();
    }

    public final CharSequence b() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.k).getLabel();
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof aag) && this.k.equals(((aag) obj).k);
    }

    public final int hashCode() {
        return this.k.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String f2 = aah.f(this.l);
        if (f2.equals("ACTION_UNKNOWN") && b() != null) {
            f2 = b().toString();
        }
        sb.append(f2);
        return sb.toString();
    }
}
