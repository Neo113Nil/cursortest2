package com.withpersona.sdk2.inquiry.selfie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.imageview.ShapeableImageView;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieReviewItemBinding;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class SelfieReviewCapturesRunner$SelfieImageAdapter$adapterHelper$2$1 extends FunctionReferenceImpl implements Function3 {
    public static final SelfieReviewCapturesRunner$SelfieImageAdapter$adapterHelper$2$1 INSTANCE = new SelfieReviewCapturesRunner$SelfieImageAdapter$adapterHelper$2$1(3, Pi2SelfieReviewItemBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieReviewItemBinding;", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.pi2_selfie_review_item, viewGroup, false);
        if (booleanValue) {
            viewGroup.addView(inflate);
        }
        int i = R.id.image;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(inflate, R.id.image);
        if (shapeableImageView != null) {
            i = R.id.label;
            TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.label);
            if (textView != null) {
                return new Pi2SelfieReviewItemBinding((ConstraintLayout) inflate, shapeableImageView, textView);
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }
}
