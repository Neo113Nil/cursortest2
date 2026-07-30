package p000createpolar;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.polarvoyage.glacialoceans.icepathfinder.quest.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageOnTouchListenerNebulaHyperion5391 extends View.AccessibilityDelegate {
    public final PolarVoyageCombineRoguePulse7620 PolarVoyageZipVortexCelestial6185;

    public PolarVoyageOnTouchListenerNebulaHyperion5391(PolarVoyageCombineRoguePulse7620 polarVoyageCombineRoguePulse7620) {
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageCombineRoguePulse7620;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        PolarVoyageRealtimeDatabaseEclipseUltra8894 PolarVoyageZipVortexCelestial6185 = this.PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185(view);
        if (PolarVoyageZipVortexCelestial6185 != null) {
            return (AccessibilityNodeProvider) PolarVoyageZipVortexCelestial6185.PolarVoyageStrictModeLegendEpic1532;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object obj;
        Object tag2;
        Object obj2;
        int i;
        PolarVoyageToastUltraNeo6602 polarVoyageToastUltraNeo6602 = new PolarVoyageToastUltraNeo6602(accessibilityNodeInfo);
        int i2 = PolarVoyageLayoutInflaterTitaniumStrike4588.PolarVoyageZipVortexCelestial6185;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            tag = Boolean.valueOf(PolarVoyageFaceDetectionUltraForce1708.PolarVoyageKotlinBetaPulseBeta3653(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        boolean z = bool != null && bool.booleanValue();
        if (i3 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z);
        } else {
            polarVoyageToastUltraNeo6602.PolarVoyageDiffUtilTurboStrike5735(1, z);
        }
        if (i3 >= 28) {
            obj = Boolean.valueOf(PolarVoyageFaceDetectionUltraForce1708.PolarVoyageMotionLayoutTransitionHeroVision4068(view));
        } else {
            Object tag3 = view.getTag(R.id.tag_accessibility_heading);
            obj = Boolean.class.isInstance(tag3) ? tag3 : null;
        }
        Boolean bool2 = (Boolean) obj;
        boolean z2 = bool2 != null && bool2.booleanValue();
        if (i3 >= 28) {
            accessibilityNodeInfo.setHeading(z2);
        } else {
            polarVoyageToastUltraNeo6602.PolarVoyageDiffUtilTurboStrike5735(2, z2);
        }
        if (i3 >= 28) {
            tag2 = PolarVoyageFaceDetectionUltraForce1708.PolarVoyageZipVortexCelestial6185(view);
        } else {
            tag2 = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag2;
        if (i3 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
        if (i3 >= 30) {
            obj2 = PolarVoyageHandlerNovaXAlphaForce6855.PolarVoyageZipVortexCelestial6185(view);
        } else {
            Object tag4 = view.getTag(R.id.tag_state_description);
            obj2 = CharSequence.class.isInstance(tag4) ? tag4 : null;
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        if (i3 >= 30) {
            PolarVoyageObjectDetectionCosmosDragonNebula8799.PolarVoyageItemDecorationUltraDeltaEpic7485(accessibilityNodeInfo, charSequence2);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence2);
        }
        this.PolarVoyageZipVortexCelestial6185.PolarVoyageMotionLayoutTransitionHeroVision4068(view, polarVoyageToastUltraNeo6602);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i3 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                    if (((WeakReference) sparseArray.valueAt(i4)).get() == null) {
                        arrayList.add(Integer.valueOf(i4));
                    }
                }
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    sparseArray.remove(((Integer) arrayList.get(i5)).intValue());
                }
            }
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                for (int i6 = 0; i6 < clickableSpanArr.length; i6++) {
                    ClickableSpan clickableSpan = clickableSpanArr[i6];
                    int i7 = 0;
                    while (true) {
                        if (i7 >= sparseArray2.size()) {
                            i = PolarVoyageToastUltraNeo6602.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                            PolarVoyageToastUltraNeo6602.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i + 1;
                            break;
                        } else {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i7)).get())) {
                                i = sparseArray2.keyAt(i7);
                                break;
                            }
                            i7++;
                        }
                    }
                    sparseArray2.put(i, new WeakReference(clickableSpanArr[i6]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i6];
                    Spanned spanned = (Spanned) text;
                    polarVoyageToastUltraNeo6602.PolarVoyageMotionLayoutTransitionHeroVision4068("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    polarVoyageToastUltraNeo6602.PolarVoyageMotionLayoutTransitionHeroVision4068("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    polarVoyageToastUltraNeo6602.PolarVoyageMotionLayoutTransitionHeroVision4068("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    polarVoyageToastUltraNeo6602.PolarVoyageMotionLayoutTransitionHeroVision4068("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            polarVoyageToastUltraNeo6602.PolarVoyageZipVortexCelestial6185((PolarVoyageAnimatorSetVisionEpic3385) list.get(i8));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        PolarVoyageCombineRoguePulse7620 polarVoyageCombineRoguePulse7620 = this.PolarVoyageZipVortexCelestial6185;
        polarVoyageCombineRoguePulse7620.getClass();
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i2 = 0; i2 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((PolarVoyageAnimatorSetVisionEpic3385) list.get(i2)).PolarVoyageZipVortexCelestial6185).getId() != i; i2++) {
        }
        boolean performAccessibilityAction = polarVoyageCombineRoguePulse7620.PolarVoyageZipVortexCelestial6185.performAccessibilityAction(view, i, bundle);
        if (performAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return performAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i4 = 0; clickableSpanArr != null && i4 < clickableSpanArr.length; i4++) {
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185.sendAccessibilityEvent(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
