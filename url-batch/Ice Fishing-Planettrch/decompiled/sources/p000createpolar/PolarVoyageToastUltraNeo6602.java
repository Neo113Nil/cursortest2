package p000createpolar;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageToastUltraNeo6602 {
    public static int PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final AccessibilityNodeInfo PolarVoyageZipVortexCelestial6185;
    public int PolarVoyageMotionLayoutTransitionHeroVision4068 = -1;
    public int PolarVoyageKotlinBetaPulseBeta3653 = -1;

    public PolarVoyageToastUltraNeo6602(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.PolarVoyageZipVortexCelestial6185 = accessibilityNodeInfo;
    }

    public static String PolarVoyageKotlinBetaPulseBeta3653(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
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

    public final boolean PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i) {
        Bundle extras = this.PolarVoyageZipVortexCelestial6185.getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public final CharSequence PolarVoyageBitmapVisionAuroraPixel4705() {
        boolean isEmpty = PolarVoyageMotionLayoutTransitionHeroVision4068("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.PolarVoyageZipVortexCelestial6185;
        if (isEmpty) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList PolarVoyageMotionLayoutTransitionHeroVision40682 = PolarVoyageMotionLayoutTransitionHeroVision4068("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList PolarVoyageMotionLayoutTransitionHeroVision40683 = PolarVoyageMotionLayoutTransitionHeroVision4068("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList PolarVoyageMotionLayoutTransitionHeroVision40684 = PolarVoyageMotionLayoutTransitionHeroVision4068("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < PolarVoyageMotionLayoutTransitionHeroVision4068.size(); i++) {
            spannableString.setSpan(new PolarVoyageLocationManagerOlympianSpeedHyper2037(((Integer) PolarVoyageMotionLayoutTransitionHeroVision40684.get(i)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) PolarVoyageMotionLayoutTransitionHeroVision4068.get(i)).intValue(), ((Integer) PolarVoyageMotionLayoutTransitionHeroVision40682.get(i)).intValue(), ((Integer) PolarVoyageMotionLayoutTransitionHeroVision40683.get(i)).intValue());
        }
        return spannableString;
    }

    public final void PolarVoyageDiffUtilTurboStrike5735(int i, boolean z) {
        Bundle extras = this.PolarVoyageZipVortexCelestial6185.getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public final ArrayList PolarVoyageMotionLayoutTransitionHeroVision4068(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.PolarVoyageZipVortexCelestial6185;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final void PolarVoyageTextInputEditTextNebulaHero6651(String str) {
        this.PolarVoyageZipVortexCelestial6185.setClassName(str);
    }

    public final void PolarVoyageZipVortexCelestial6185(PolarVoyageAnimatorSetVisionEpic3385 polarVoyageAnimatorSetVisionEpic3385) {
        this.PolarVoyageZipVortexCelestial6185.addAction((AccessibilityNodeInfo.AccessibilityAction) polarVoyageAnimatorSetVisionEpic3385.PolarVoyageZipVortexCelestial6185);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PolarVoyageToastUltraNeo6602)) {
            return false;
        }
        PolarVoyageToastUltraNeo6602 polarVoyageToastUltraNeo6602 = (PolarVoyageToastUltraNeo6602) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = polarVoyageToastUltraNeo6602.PolarVoyageZipVortexCelestial6185;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.PolarVoyageZipVortexCelestial6185;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.PolarVoyageKotlinBetaPulseBeta3653 == polarVoyageToastUltraNeo6602.PolarVoyageKotlinBetaPulseBeta3653 && this.PolarVoyageMotionLayoutTransitionHeroVision4068 == polarVoyageToastUltraNeo6602.PolarVoyageMotionLayoutTransitionHeroVision4068;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.PolarVoyageZipVortexCelestial6185;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        AccessibilityNodeInfo accessibilityNodeInfo = this.PolarVoyageZipVortexCelestial6185;
        accessibilityNodeInfo.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            PolarVoyageToolbarBlazeTitanium3444.PolarVoyageMotionLayoutTransitionHeroVision4068(accessibilityNodeInfo, rect);
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
        sb.append(PolarVoyageBitmapVisionAuroraPixel4705());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(i >= 30 ? PolarVoyageObjectDetectionCosmosDragonNebula8799.PolarVoyageKotlinBetaPulseBeta3653(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; supplementalDescription: ");
        sb.append(i >= 36 ? PolarVoyageLiveDataScopeEliteOmegaStrike6721.PolarVoyageKotlinBetaPulseBeta3653(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY"));
        sb.append("; tooltipText: ");
        sb.append(i >= 28 ? accessibilityNodeInfo.getTooltipText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"));
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(i >= 33 ? PolarVoyageLiveDataTurboDragonNovaX6549.PolarVoyageBarcodeScannerInfernoSolarSpark7767(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        int PolarVoyageZipVortexCelestial6185 = i >= 36 ? PolarVoyageLiveDataScopeEliteOmegaStrike6721.PolarVoyageZipVortexCelestial6185(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", accessibilityNodeInfo.isChecked() ? 1 : 0);
        String str = "PARTIAL";
        sb.append(PolarVoyageZipVortexCelestial6185 == 1 ? "TRUE" : PolarVoyageZipVortexCelestial6185 == 2 ? "PARTIAL" : "FALSE");
        sb.append("; fieldRequired: ");
        sb.append(i >= 36 ? PolarVoyageLiveDataScopeEliteOmegaStrike6721.PolarVoyageBarcodeScannerInfernoSolarSpark7767(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"));
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
        int PolarVoyageMotionLayoutTransitionHeroVision4068 = i >= 36 ? PolarVoyageLiveDataScopeEliteOmegaStrike6721.PolarVoyageMotionLayoutTransitionHeroVision4068(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
        if (PolarVoyageMotionLayoutTransitionHeroVision4068 == 0) {
            str = "UNDEFINED";
        } else if (PolarVoyageMotionLayoutTransitionHeroVision4068 == 1) {
            str = "COLLAPSED";
        } else if (PolarVoyageMotionLayoutTransitionHeroVision4068 != 2) {
            str = PolarVoyageMotionLayoutTransitionHeroVision4068 != 3 ? "UNKNOWN" : "FULL";
        }
        sb.append(str);
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; containerTitle: ");
        sb.append(i >= 34 ? PolarVoyageToolbarBlazeTitanium3444.PolarVoyageKotlinBetaPulseBeta3653(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb.append("; granularScrollingSupported: ");
        sb.append(PolarVoyageBarcodeScannerInfernoSolarSpark7767(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(i >= 33 ? PolarVoyageLiveDataTurboDragonNovaX6549.PolarVoyageBitmapVisionAuroraPixel4705(accessibilityNodeInfo) : PolarVoyageBarcodeScannerInfernoSolarSpark7767(8388608));
        sb.append("; accessibilityDataSensitive: ");
        sb.append(i >= 34 ? PolarVoyageToolbarBlazeTitanium3444.PolarVoyageBarcodeScannerInfernoSolarSpark7767(accessibilityNodeInfo) : PolarVoyageBarcodeScannerInfernoSolarSpark7767(64));
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new PolarVoyageAnimatorSetVisionEpic3385(actionList.get(i2), 0, null, null));
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            PolarVoyageAnimatorSetVisionEpic3385 polarVoyageAnimatorSetVisionEpic3385 = (PolarVoyageAnimatorSetVisionEpic3385) arrayList.get(i3);
            Object obj = polarVoyageAnimatorSetVisionEpic3385.PolarVoyageZipVortexCelestial6185;
            Object obj2 = polarVoyageAnimatorSetVisionEpic3385.PolarVoyageZipVortexCelestial6185;
            String PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageKotlinBetaPulseBeta3653(((AccessibilityNodeInfo.AccessibilityAction) obj).getId());
            if (PolarVoyageKotlinBetaPulseBeta3653.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) obj2).getLabel() != null) {
                PolarVoyageKotlinBetaPulseBeta3653 = ((AccessibilityNodeInfo.AccessibilityAction) obj2).getLabel().toString();
            }
            sb.append(PolarVoyageKotlinBetaPulseBeta3653);
            if (i3 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
