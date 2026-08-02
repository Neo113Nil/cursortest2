package defpackage;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aah {
    public final AccessibilityNodeInfo a;
    public int b = -1;
    public int c = -1;

    public aah(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    private final List K(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private final boolean L(int i) {
        Bundle a = a();
        return a != null && (a.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public static aah b() {
        return new aah(AccessibilityNodeInfo.obtain());
    }

    static String f(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        switch (i) {
                                            case R.id.accessibilityActionScrollInDirection:
                                                return "ACTION_SCROLL_IN_DIRECTION";
                                            case R.id.ALT:
                                                return "ACTION_SET_EXTENDED_SELECTION";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
        }
    }

    public final void A(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final void B(View view) {
        this.a.setTraversalAfter(view);
    }

    public final void C(boolean z) {
        this.a.setVisibleToUser(z);
    }

    public final boolean D() {
        return this.a.isEnabled();
    }

    public final boolean E() {
        return this.a.isFocusable();
    }

    public final boolean F() {
        return this.a.isPassword();
    }

    public final boolean G() {
        return this.a.isScrollable();
    }

    public final void H(aag aagVar) {
        this.a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aagVar.k);
    }

    public final void I() {
        Bundle a = a();
        if (a != null) {
            a.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (a.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-67108865)) | 67108864);
        }
    }

    public final void J() {
        this.a.setScrollable(true);
    }

    public final Bundle a() {
        return this.a.getExtras();
    }

    public final CharSequence c() {
        return this.a.getClassName();
    }

    public final CharSequence d() {
        return this.a.getContentDescription();
    }

    public final CharSequence e() {
        if (K("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            return this.a.getText();
        }
        List K = K("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List K2 = K("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List K3 = K("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List K4 = K("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < K.size(); i++) {
            spannableString.setSpan(new aaf(((Integer) K4.get(i)).intValue(), this, a().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) K.get(i)).intValue(), ((Integer) K2.get(i)).intValue(), ((Integer) K3.get(i)).intValue());
        }
        return spannableString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof aah)) {
            return false;
        }
        aah aahVar = (aah) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            if (aahVar.a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(aahVar.a)) {
            return false;
        }
        return this.c == aahVar.c && this.b == aahVar.b;
    }

    public final void g(int i) {
        this.a.addAction(i);
    }

    public final void h(aag aagVar) {
        this.a.addAction((AccessibilityNodeInfo.AccessibilityAction) aagVar.k);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    @Deprecated
    public final void i(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public final void j(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public final void k(boolean z) {
        this.a.setAccessibilityFocused(z);
    }

    @Deprecated
    public final void l(Rect rect) {
        this.a.setBoundsInParent(rect);
    }

    public final void m(Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public final void n(boolean z) {
        this.a.setCheckable(z);
    }

    public final void o(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public final void p(boolean z) {
        this.a.setClickable(z);
    }

    public final void q(Object obj) {
        this.a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) ((brn) obj).a);
    }

    public final void r(Object obj) {
        this.a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((brn) obj).a);
    }

    public final void s(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public final void t(boolean z) {
        this.a.setEnabled(z);
    }

    public final String toString() {
        CharSequence tooltipText;
        boolean isImportantForAccessibility;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        i(rect);
        rect.toString();
        sb.append("; boundsInParent: ".concat(rect.toString()));
        j(rect);
        rect.toString();
        sb.append("; boundsInScreen: ".concat(rect.toString()));
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (i >= 34) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        rect.toString();
        sb.append("; boundsInWindow: ".concat(rect.toString()));
        sb.append("; packageName: ");
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.a;
        sb.append(accessibilityNodeInfo2.getPackageName());
        sb.append("; className: ");
        sb.append(c());
        sb.append("; text: ");
        sb.append(e());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo2.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo2.getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(Build.VERSION.SDK_INT >= 30 ? accessibilityNodeInfo2.getStateDescription() : accessibilityNodeInfo2.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb.append("; contentDescription: ");
        sb.append(d());
        sb.append("; supplementalDescription: ");
        sb.append(Build.VERSION.SDK_INT >= 36 ? accessibilityNodeInfo2.getSupplementalDescription() : accessibilityNodeInfo2.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY"));
        sb.append("; tooltipText: ");
        tooltipText = accessibilityNodeInfo2.getTooltipText();
        sb.append(tooltipText);
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo2.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(Build.VERSION.SDK_INT >= 33 ? accessibilityNodeInfo2.getUniqueId() : accessibilityNodeInfo2.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo2.isCheckable());
        sb.append("; checked: ");
        int checked = Build.VERSION.SDK_INT >= 36 ? accessibilityNodeInfo2.getChecked() : accessibilityNodeInfo2.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", accessibilityNodeInfo2.isChecked() ? 1 : 0);
        String str = "PARTIAL";
        sb.append(checked == 1 ? "TRUE" : checked == 2 ? "PARTIAL" : "FALSE");
        sb.append("; fieldRequired: ");
        sb.append(Build.VERSION.SDK_INT >= 36 ? accessibilityNodeInfo2.isFieldRequired() : accessibilityNodeInfo2.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"));
        sb.append("; focusable: ");
        sb.append(E());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo2.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo2.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo2.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo2.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(accessibilityNodeInfo2.isContextClickable());
        sb.append("; expandedState: ");
        int expandedState = Build.VERSION.SDK_INT >= 36 ? accessibilityNodeInfo2.getExpandedState() : accessibilityNodeInfo2.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
        if (expandedState == 0) {
            str = "UNDEFINED";
        } else if (expandedState == 1) {
            str = "COLLAPSED";
        } else if (expandedState != 2) {
            str = expandedState != 3 ? "UNKNOWN" : "FULL";
        }
        sb.append(str);
        sb.append("; enabled: ");
        sb.append(D());
        sb.append("; password: ");
        sb.append(F());
        sb.append("; scrollable: " + G());
        sb.append("; containerTitle: ");
        sb.append(Build.VERSION.SDK_INT >= 34 ? accessibilityNodeInfo2.getContainerTitle() : accessibilityNodeInfo2.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb.append("; granularScrollingSupported: ");
        sb.append(L(67108864));
        sb.append("; importantForAccessibility: ");
        isImportantForAccessibility = accessibilityNodeInfo2.isImportantForAccessibility();
        sb.append(isImportantForAccessibility);
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo2.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(Build.VERSION.SDK_INT >= 33 ? accessibilityNodeInfo2.isTextSelectable() : L(8388608));
        sb.append("; accessibilityDataSensitive: ");
        sb.append(Build.VERSION.SDK_INT >= 34 ? accessibilityNodeInfo2.isAccessibilityDataSensitive() : L(64));
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo2.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new aag(actionList.get(i2), 0, null, null, null));
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            aag aagVar = (aag) arrayList.get(i3);
            String f = f(aagVar.a());
            if (f.equals("ACTION_UNKNOWN") && aagVar.b() != null) {
                f = aagVar.b().toString();
            }
            sb.append(f);
            if (i3 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final void u(boolean z) {
        this.a.setFocusable(z);
    }

    public final void v(boolean z) {
        this.a.setFocused(z);
    }

    public final void w(boolean z) {
        this.a.setHeading(z);
    }

    public final void x(CharSequence charSequence) {
        this.a.setHintText(charSequence);
    }

    public final void y(View view) {
        this.b = -1;
        this.a.setParent(view);
    }

    public final void z(CharSequence charSequence) {
        this.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }
}
