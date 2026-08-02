package com.stripe.android.stripe3ds2.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.internal.ViewUtils$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.stripe.android.stripe3ds2.init.ui.LabelCustomization;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

/* loaded from: classes8.dex */
public final class InformationZoneView extends FrameLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final int animationDuration;
    public int defaultColor;
    public final AppCompatImageView expandArrow;
    public final LinearLayout expandContainer;
    public final ThreeDS2TextView expandLabel;
    public final ThreeDS2TextView expandText;
    public int toggleColor;
    public final AppCompatImageView whyArrow;
    public final LinearLayout whyContainer;
    public final ThreeDS2TextView whyLabel;
    public final ThreeDS2TextView whyText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InformationZoneView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        final int i2 = 0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.stripe_information_zone_view, (ViewGroup) this, false);
        addView(inflate);
        int i3 = R.id.expand_arrow;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(inflate, R.id.expand_arrow);
        if (appCompatImageView != null) {
            i3 = R.id.expand_container;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(inflate, R.id.expand_container);
            if (linearLayout != null) {
                i3 = R.id.expand_label;
                ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) ViewBindings.findChildViewById(inflate, R.id.expand_label);
                if (threeDS2TextView != null) {
                    i3 = R.id.expand_text;
                    ThreeDS2TextView threeDS2TextView2 = (ThreeDS2TextView) ViewBindings.findChildViewById(inflate, R.id.expand_text);
                    if (threeDS2TextView2 != null) {
                        i3 = R.id.why_arrow;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(inflate, R.id.why_arrow);
                        if (appCompatImageView2 != null) {
                            i3 = R.id.why_container;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(inflate, R.id.why_container);
                            if (linearLayout2 != null) {
                                i3 = R.id.why_label;
                                ThreeDS2TextView threeDS2TextView3 = (ThreeDS2TextView) ViewBindings.findChildViewById(inflate, R.id.why_label);
                                if (threeDS2TextView3 != null) {
                                    i3 = R.id.why_text;
                                    ThreeDS2TextView threeDS2TextView4 = (ThreeDS2TextView) ViewBindings.findChildViewById(inflate, R.id.why_text);
                                    if (threeDS2TextView4 != null) {
                                        this.whyLabel = threeDS2TextView3;
                                        this.whyText = threeDS2TextView4;
                                        this.whyContainer = linearLayout2;
                                        this.whyArrow = appCompatImageView2;
                                        this.expandLabel = threeDS2TextView;
                                        this.expandText = threeDS2TextView2;
                                        this.expandContainer = linearLayout;
                                        this.expandArrow = appCompatImageView;
                                        this.animationDuration = getResources().getInteger(android.R.integer.config_shortAnimTime);
                                        linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: com.stripe.android.stripe3ds2.views.InformationZoneView$$ExternalSyntheticLambda0
                                            public final /* synthetic */ InformationZoneView f$0;

                                            {
                                                this.f$0 = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i4 = i2;
                                                InformationZoneView informationZoneView = this.f$0;
                                                switch (i4) {
                                                    case 0:
                                                        informationZoneView.toggleView(informationZoneView.whyArrow, informationZoneView.whyLabel, informationZoneView.whyText);
                                                        break;
                                                    default:
                                                        informationZoneView.toggleView(informationZoneView.expandArrow, informationZoneView.expandLabel, informationZoneView.expandText);
                                                        break;
                                                }
                                            }
                                        });
                                        final int i4 = 1;
                                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: com.stripe.android.stripe3ds2.views.InformationZoneView$$ExternalSyntheticLambda0
                                            public final /* synthetic */ InformationZoneView f$0;

                                            {
                                                this.f$0 = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i42 = i4;
                                                InformationZoneView informationZoneView = this.f$0;
                                                switch (i42) {
                                                    case 0:
                                                        informationZoneView.toggleView(informationZoneView.whyArrow, informationZoneView.whyLabel, informationZoneView.whyText);
                                                        break;
                                                    default:
                                                        informationZoneView.toggleView(informationZoneView.expandArrow, informationZoneView.expandLabel, informationZoneView.expandText);
                                                        break;
                                                }
                                            }
                                        });
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
        throw null;
    }

    public static /* synthetic */ void setExpandInfo$default(InformationZoneView informationZoneView, String str, String str2, LabelCustomization labelCustomization, int i, Object obj) {
        if ((i & 4) != 0) {
            labelCustomization = null;
        }
        informationZoneView.setExpandInfo(str, str2, labelCustomization);
    }

    public static /* synthetic */ void setWhyInfo$default(InformationZoneView informationZoneView, String str, String str2, LabelCustomization labelCustomization, int i, Object obj) {
        if ((i & 4) != 0) {
            labelCustomization = null;
        }
        informationZoneView.setWhyInfo(str, str2, labelCustomization);
    }

    public final void setExpandInfo(String str, String str2, LabelCustomization labelCustomization) {
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        this.expandLabel.setText(str, labelCustomization);
        this.expandContainer.setVisibility(0);
        this.expandText.setText(str2, labelCustomization);
    }

    public final void setToggleColor$3ds2sdk_release(int i) {
        this.toggleColor = i;
    }

    public final void setWhyInfo(String str, String str2, LabelCustomization labelCustomization) {
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        this.whyLabel.setText(str, labelCustomization);
        this.whyContainer.setVisibility(0);
        this.whyText.setText(str2, labelCustomization);
    }

    public final void toggleView(View view, TextView textView, View view2) {
        boolean z = view2.getVisibility() == 8;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotation", z ? EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE : 0);
        long j = this.animationDuration;
        ofFloat.setDuration(j);
        ofFloat.start();
        textView.setEnabled(z);
        view.setEnabled(z);
        if (this.toggleColor != 0) {
            if (this.defaultColor == 0) {
                this.defaultColor = textView.getTextColors().getDefaultColor();
            }
            textView.setTextColor(z ? this.toggleColor : this.defaultColor);
        }
        view2.setVisibility(z ? 0 : 8);
        if (z) {
            view2.postDelayed(new ViewUtils$$ExternalSyntheticLambda0(view2, 4), j);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InformationZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InformationZoneView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ InformationZoneView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
