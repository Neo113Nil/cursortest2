package defpackage;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class twy4zb2fCtqq {
    public static int Y1f8riQaR6yg;
    public final AccessibilityNodeInfo PxuCJdSBwIXG;
    public int lS5Rgt96tfkO = -1;
    public int TSizfFm2Yiuu = -1;

    public twy4zb2fCtqq(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.PxuCJdSBwIXG = accessibilityNodeInfo;
    }

    public static String TSizfFm2Yiuu(int i) {
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

    public final void PxuCJdSBwIXG(cJeY36nTk9tz cjey36ntk9tz) {
        this.PxuCJdSBwIXG.addAction((AccessibilityNodeInfo.AccessibilityAction) cjey36ntk9tz.PxuCJdSBwIXG);
    }

    public final void RAsUl2FVSrh6(String str) {
        this.PxuCJdSBwIXG.setClassName(str);
    }

    public final boolean Y1f8riQaR6yg(int i) {
        Bundle extras = this.PxuCJdSBwIXG.getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public final void a92UlCVFR9N8(int i, boolean z) {
        Bundle extras = this.PxuCJdSBwIXG.getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public final CharSequence e9gEMXR7LXtO() {
        boolean isEmpty = lS5Rgt96tfkO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.PxuCJdSBwIXG;
        if (isEmpty) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList lS5Rgt96tfkO = lS5Rgt96tfkO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList lS5Rgt96tfkO2 = lS5Rgt96tfkO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList lS5Rgt96tfkO3 = lS5Rgt96tfkO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList lS5Rgt96tfkO4 = lS5Rgt96tfkO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < lS5Rgt96tfkO.size(); i++) {
            spannableString.setSpan(new IXK6ba3ucyzm(((Integer) lS5Rgt96tfkO4.get(i)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) lS5Rgt96tfkO.get(i)).intValue(), ((Integer) lS5Rgt96tfkO2.get(i)).intValue(), ((Integer) lS5Rgt96tfkO3.get(i)).intValue());
        }
        return spannableString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof twy4zb2fCtqq)) {
            return false;
        }
        twy4zb2fCtqq twy4zb2fctqq = (twy4zb2fCtqq) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = twy4zb2fctqq.PxuCJdSBwIXG;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.PxuCJdSBwIXG;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.TSizfFm2Yiuu == twy4zb2fctqq.TSizfFm2Yiuu && this.lS5Rgt96tfkO == twy4zb2fctqq.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.PxuCJdSBwIXG;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final ArrayList lS5Rgt96tfkO(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.PxuCJdSBwIXG;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        AccessibilityNodeInfo accessibilityNodeInfo = this.PxuCJdSBwIXG;
        accessibilityNodeInfo.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            ngxnMNrpiKat.lS5Rgt96tfkO(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(e9gEMXR7LXtO());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(i >= 30 ? hnJvRxDXo0hm.TSizfFm2Yiuu(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; supplementalDescription: ");
        sb.append(i >= 36 ? GlTbNTgfSMqy.TSizfFm2Yiuu(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY"));
        sb.append("; tooltipText: ");
        sb.append(i >= 28 ? accessibilityNodeInfo.getTooltipText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"));
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(i >= 33 ? JLGWdXyAxbxj.TSizfFm2Yiuu(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        int PxuCJdSBwIXG = i >= 36 ? GlTbNTgfSMqy.PxuCJdSBwIXG(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", accessibilityNodeInfo.isChecked() ? 1 : 0);
        String str = "PARTIAL";
        sb.append(PxuCJdSBwIXG == 1 ? "TRUE" : PxuCJdSBwIXG == 2 ? "PARTIAL" : "FALSE");
        sb.append("; fieldRequired: ");
        sb.append(i >= 36 ? GlTbNTgfSMqy.Y1f8riQaR6yg(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"));
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(accessibilityNodeInfo.isContextClickable());
        sb.append("; expandedState: ");
        int lS5Rgt96tfkO = i >= 36 ? GlTbNTgfSMqy.lS5Rgt96tfkO(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
        if (lS5Rgt96tfkO == 0) {
            str = "UNDEFINED";
        } else if (lS5Rgt96tfkO == 1) {
            str = "COLLAPSED";
        } else if (lS5Rgt96tfkO != 2) {
            str = lS5Rgt96tfkO != 3 ? "UNKNOWN" : "FULL";
        }
        sb.append(str);
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; containerTitle: ");
        sb.append(i >= 34 ? ngxnMNrpiKat.TSizfFm2Yiuu(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb.append("; granularScrollingSupported: ");
        sb.append(Y1f8riQaR6yg(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(i >= 33 ? JLGWdXyAxbxj.Y1f8riQaR6yg(accessibilityNodeInfo) : Y1f8riQaR6yg(8388608));
        sb.append("; accessibilityDataSensitive: ");
        sb.append(i >= 34 ? ngxnMNrpiKat.Y1f8riQaR6yg(accessibilityNodeInfo) : Y1f8riQaR6yg(64));
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new cJeY36nTk9tz(actionList.get(i2), 0, null, null));
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            cJeY36nTk9tz cjey36ntk9tz = (cJeY36nTk9tz) arrayList.get(i3);
            Object obj = cjey36ntk9tz.PxuCJdSBwIXG;
            Object obj2 = cjey36ntk9tz.PxuCJdSBwIXG;
            String TSizfFm2Yiuu = TSizfFm2Yiuu(((AccessibilityNodeInfo.AccessibilityAction) obj).getId());
            if (TSizfFm2Yiuu.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) obj2).getLabel() != null) {
                TSizfFm2Yiuu = ((AccessibilityNodeInfo.AccessibilityAction) obj2).getLabel().toString();
            }
            sb.append(TSizfFm2Yiuu);
            if (i3 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
