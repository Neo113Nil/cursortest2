package com.withpersona.sdk2.inquiry.shared.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.steps.ui.view.ShadowedNestedScrollView;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner;
import com.withpersona.sdk2.inquiry.ui.databinding.Pi2InquiryUiBinding;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final class BottomSheetUtilsKt$setup$1 extends BottomSheetBehavior.BottomSheetCallback {
    public final /* synthetic */ Object $onCancel;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $tintView;

    public /* synthetic */ BottomSheetUtilsKt$setup$1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.$onCancel = obj;
        this.$tintView = obj2;
    }

    private final void onSlide$com$withpersona$sdk2$inquiry$steps$ui$components$helpbottomsheet$HelpBottomSheetController$close$2$1(View view, float f) {
    }

    private final void onStateChanged$com$withpersona$sdk2$inquiry$ui$UiScreenRunner$setupFooterSheet$3(View view, int i) {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void onSlide(View view, float f) {
        int i = this.$r8$classId;
        Object obj = this.$tintView;
        switch (i) {
            case 0:
                View view2 = (View) obj;
                if (f > RecyclerView.DECELERATION_RATE && view2 != null) {
                    view2.setVisibility(0);
                }
                if (view2 != null) {
                    if (f < RecyclerView.DECELERATION_RATE) {
                        f = 0.0f;
                    }
                    view2.setAlpha(f);
                    break;
                }
                break;
            case 1:
                break;
            default:
                Pi2InquiryUiBinding pi2InquiryUiBinding = ((UiScreenRunner) this.$onCancel).binding;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                float height = f * (pi2InquiryUiBinding.footerSheetScrollView.getHeight() - (bottomSheetBehavior.peekHeightAuto ? -1 : bottomSheetBehavior.peekHeight));
                ShadowedNestedScrollView shadowedNestedScrollView = pi2InquiryUiBinding.nestedScroll;
                shadowedNestedScrollView.setPadding(shadowedNestedScrollView.getPaddingLeft(), pi2InquiryUiBinding.nestedScroll.getPaddingTop(), pi2InquiryUiBinding.nestedScroll.getPaddingRight(), (bottomSheetBehavior.peekHeightAuto ? -1 : bottomSheetBehavior.peekHeight) + ((int) height));
                break;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void onStateChanged(View view, int i) {
        int i2 = this.$r8$classId;
        Object obj = this.$tintView;
        Object obj2 = this.$onCancel;
        switch (i2) {
            case 0:
                if (i == 4 || i == 5) {
                    ((Function0) obj2).invoke();
                    View view2 = (View) obj;
                    if (view2 != null) {
                        view2.setVisibility(8);
                        break;
                    }
                }
                break;
            case 1:
                if (i == 5) {
                    ((Function0) obj2).invoke();
                    ((BottomSheetBehavior) obj).callbacks.remove(this);
                    break;
                }
                break;
        }
    }
}
