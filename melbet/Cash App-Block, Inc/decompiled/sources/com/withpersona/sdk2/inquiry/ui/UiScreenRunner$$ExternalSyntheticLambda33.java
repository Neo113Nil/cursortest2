package com.withpersona.sdk2.inquiry.ui;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.steps.ui.view.ShadowedNestedScrollView;
import com.withpersona.sdk2.inquiry.ui.databinding.Pi2InquiryUiBinding;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes9.dex */
public final /* synthetic */ class UiScreenRunner$$ExternalSyntheticLambda33 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ UiScreenRunner$$ExternalSyntheticLambda33(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.$r8$classId;
        Object obj = this.f$2;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i9) {
            case 0:
                View view2 = (View) obj2;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                Pi2InquiryUiBinding pi2InquiryUiBinding = ((UiScreenRunner) obj3).binding;
                int bottom = pi2InquiryUiBinding.footerSheet.getBottom();
                Rect rect = new Rect();
                view2.getDrawingRect(rect);
                NestedScrollView nestedScrollView = pi2InquiryUiBinding.footerSheetScrollView;
                ShadowedNestedScrollView shadowedNestedScrollView = pi2InquiryUiBinding.nestedScroll;
                nestedScrollView.offsetDescendantRectToMyCoords(view2, rect);
                int i10 = bottomSheetBehavior.peekHeightAuto ? -1 : bottomSheetBehavior.peekHeight;
                bottomSheetBehavior.setPeekHeight(rect.top);
                if (i10 != (bottomSheetBehavior.peekHeightAuto ? -1 : bottomSheetBehavior.peekHeight)) {
                    shadowedNestedScrollView.setPadding(shadowedNestedScrollView.getPaddingLeft(), shadowedNestedScrollView.getPaddingTop(), shadowedNestedScrollView.getPaddingRight(), bottomSheetBehavior.peekHeightAuto ? -1 : bottomSheetBehavior.peekHeight);
                }
                bottomSheetBehavior.maxHeight = bottom;
                break;
            case 1:
                TextInputLayout textInputLayout = (TextInputLayout) obj3;
                ColorStateList colorStateList = (ColorStateList) obj2;
                ColorStateList colorStateList2 = (ColorStateList) obj;
                CharSequence error = textInputLayout.getError();
                if (error != null && StringsKt___StringsKt.any(error)) {
                    textInputLayout.setDefaultHintTextColor(colorStateList);
                    break;
                } else {
                    textInputLayout.setDefaultHintTextColor(colorStateList2);
                    break;
                }
                break;
            case 2:
                TextInputLayout textInputLayout2 = (TextInputLayout) obj3;
                ColorStateList colorStateList3 = (ColorStateList) obj2;
                ColorStateList colorStateList4 = (ColorStateList) obj;
                CharSequence error2 = textInputLayout2.getError();
                if (error2 != null && StringsKt___StringsKt.any(error2)) {
                    textInputLayout2.setPlaceholderTextColor(colorStateList3);
                    break;
                } else {
                    textInputLayout2.setPlaceholderTextColor(colorStateList4);
                    break;
                }
            case 3:
                TextInputLayout textInputLayout3 = (TextInputLayout) obj3;
                ColorStateList colorStateList5 = (ColorStateList) obj2;
                ColorStateList colorStateList6 = (ColorStateList) obj;
                CharSequence error3 = textInputLayout3.getError();
                if (error3 != null && StringsKt___StringsKt.any(error3)) {
                    textInputLayout3.setDefaultHintTextColor(colorStateList5);
                    break;
                } else {
                    textInputLayout3.setDefaultHintTextColor(colorStateList6);
                    break;
                }
                break;
            default:
                TextInputLayout textInputLayout4 = (TextInputLayout) obj3;
                ColorStateList colorStateList7 = (ColorStateList) obj2;
                ColorStateList colorStateList8 = (ColorStateList) obj;
                CharSequence error4 = textInputLayout4.getError();
                if (error4 != null && StringsKt___StringsKt.any(error4)) {
                    textInputLayout4.setPlaceholderTextColor(colorStateList7);
                    break;
                } else {
                    textInputLayout4.setPlaceholderTextColor(colorStateList8);
                    break;
                }
                break;
        }
    }
}
