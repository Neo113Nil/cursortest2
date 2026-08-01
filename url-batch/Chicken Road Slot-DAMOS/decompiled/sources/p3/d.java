package p3;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import o3.q;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f7657c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f7658d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f7659e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f7660f;
    public static final d g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f7661h;

    /* renamed from: a, reason: collision with root package name */
    public final Object f7662a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7663b;

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0207, code lost:
    
        if ((r4 < 36 ? r4 * 100000 : android.os.Build.VERSION.SDK_INT_FULL) >= 3600001) goto L67;
     */
    static {
        boolean z10 = true;
        new d(null, 1, null, null);
        new d(null, 2, null, null);
        new d(null, 4, null, null);
        new d(null, 8, null, null);
        new d(null, 16, null, null);
        new d(null, 32, null, null);
        f7657c = new d(null, 64, null, null);
        f7658d = new d(null, 128, null, null);
        new d(null, 256, null, i.class);
        new d(null, 512, null, i.class);
        new d(null, 1024, null, j.class);
        new d(null, 2048, null, j.class);
        f7659e = new d(null, 4096, null, null);
        f7660f = new d(null, 8192, null, null);
        new d(null, 16384, null, null);
        new d(null, 32768, null, null);
        new d(null, 65536, null, null);
        new d(null, 131072, null, n.class);
        new d(null, 262144, null, null);
        new d(null, 524288, null, null);
        new d(null, 1048576, null, null);
        new d(null, 2097152, null, o.class);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, l.class);
        g = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null);
        f7661h = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null);
        int i3 = Build.VERSION.SDK_INT;
        new d(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null);
        new d(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null);
        new d(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null);
        new d(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, m.class);
        new d(i3 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, k.class);
        new d(i3 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null);
        new d(i3 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null);
        new d(i3 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null);
        new d(i3 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null);
        new d(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null);
        new d(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null);
        new d(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null);
        new d(i3 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null);
        new d(i3 >= 34 ? q.a() : null, R.id.accessibilityActionScrollInDirection, null, null);
        k3.c cVar = k3.c.f5376a;
        if (i3 >= 36) {
        }
        z10 = false;
        new d(z10 ? e.a() : null, R.id.ALT, null, null);
    }

    public d(Object obj, int i3, CharSequence charSequence, Class cls) {
        this.f7663b = i3;
        if (obj == null) {
            this.f7662a = new AccessibilityNodeInfo.AccessibilityAction(i3, charSequence);
        } else {
            this.f7662a = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        Object obj2 = ((d) obj).f7662a;
        Object obj3 = this.f7662a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f7662a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String c10 = f.c(this.f7663b);
        if (c10.equals("ACTION_UNKNOWN")) {
            Object obj = this.f7662a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                c10 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(c10);
        return sb2.toString();
    }

    public d(int i3, String str) {
        this(null, i3, str, null);
    }
}
