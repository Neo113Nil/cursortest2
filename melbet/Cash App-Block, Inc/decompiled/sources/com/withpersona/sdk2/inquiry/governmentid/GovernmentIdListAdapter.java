package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.google.android.material.timepicker.ClockFaceView;
import com.squareup.cash.R;
import com.squareup.scannerview.ScannerView$$ExternalSyntheticLambda11;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidIdlistBinding;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import com.withpersona.sdk2.inquiry.shared.ViewBindingViewHolder;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.InquiryTheme;
import com.withpersona.sdk2.inquiry.shared.ui.ClickableConstraintLayout;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.utils.RemoteImageUtilsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.collections.EmptySet;

/* loaded from: classes9.dex */
public final class GovernmentIdListAdapter extends RecyclerView.Adapter {
    public final NextStep.GovernmentId.AssetConfig.SelectPage assetConfig;
    public final HashMap cachedImages;
    public final ArrayList data;
    public final InquiryTheme.IconStyle iconStyle;
    public boolean isEnabled;
    public final HCaptcha$$ExternalSyntheticLambda2 onClick;
    public final StepStyles.GovernmentIdStepStyle styles;
    public final boolean useIcons;

    public GovernmentIdListAdapter(Context context, ArrayList arrayList, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.GovernmentId.AssetConfig.SelectPage selectPage, InquiryTheme.IconStyle iconStyle, HCaptcha$$ExternalSyntheticLambda2 hCaptcha$$ExternalSyntheticLambda2) {
        context.getClass();
        iconStyle.getClass();
        this.data = arrayList;
        this.styles = governmentIdStepStyle;
        this.assetConfig = selectPage;
        this.iconStyle = iconStyle;
        this.onClick = hCaptcha$$ExternalSyntheticLambda2;
        this.cachedImages = new HashMap();
        this.useIcons = !ResToolsKt.boolFromAttr$default(context, R.attr.personaGovIdSelectHideIcon);
        this.isEnabled = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.data.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        RemoteImage iconPassport;
        int i2;
        Drawable mutate;
        Integer governmentIdIconFillColor;
        Integer governmentIdIconStrokeColor;
        viewHolder.getClass();
        EnabledIdClass enabledIdClass = (EnabledIdClass) this.data.get(i);
        Pi2GovernmentidIdlistBinding pi2GovernmentidIdlistBinding = (Pi2GovernmentidIdlistBinding) ((ViewBindingViewHolder) viewHolder).binding;
        TextView textView = pi2GovernmentidIdlistBinding.label;
        ClickableConstraintLayout clickableConstraintLayout = pi2GovernmentidIdlistBinding.rootView;
        ImageView imageView = pi2GovernmentidIdlistBinding.icon;
        ConstraintLayout constraintLayout = pi2GovernmentidIdlistBinding.iconContainer;
        textView.setText(enabledIdClass.name);
        IdIcon idIcon = enabledIdClass.icon;
        int ordinal = idIcon.ordinal();
        NextStep.GovernmentId.AssetConfig.SelectPage selectPage = this.assetConfig;
        if (ordinal == 0) {
            if (selectPage != null) {
                iconPassport = selectPage.getIconPassport();
            }
            iconPassport = null;
        } else if (ordinal == 1) {
            if (selectPage != null) {
                iconPassport = selectPage.getIconGovernmentId();
            }
            iconPassport = null;
        } else if (ordinal == 2) {
            if (selectPage != null) {
                iconPassport = selectPage.getIconDriversLicense();
            }
            iconPassport = null;
        } else if (ordinal != 3) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        } else if (selectPage == null || (iconPassport = selectPage.getIconNationalId()) == null) {
            if (selectPage != null) {
                iconPassport = selectPage.getIconGovernmentId();
            }
            iconPassport = null;
        }
        Object tag = constraintLayout.getTag(R.id.pi2_remote_image_view);
        View view = tag instanceof View ? (View) tag : null;
        if (view != null) {
            constraintLayout.removeView(view);
        }
        if (!this.useIcons || this.iconStyle == InquiryTheme.IconStyle.None) {
            constraintLayout.setVisibility(8);
            textView.setPaddingRelative(0, textView.getPaddingTop(), textView.getPaddingEnd(), textView.getPaddingBottom());
        } else if (iconPassport != null) {
            constraintLayout.setTag(R.id.pi2_remote_image_view, RemoteImageUtilsKt.renderToContainer(iconPassport, constraintLayout, true));
            imageView.setVisibility(8);
            textView.setPaddingRelative((int) ExtensionsKt.getDpToPx(8.0d), textView.getPaddingTop(), textView.getPaddingEnd(), textView.getPaddingBottom());
        } else {
            imageView.setVisibility(0);
            Integer valueOf = Integer.valueOf(i);
            HashMap hashMap = this.cachedImages;
            if (hashMap.get(valueOf) != null) {
                imageView.setImageDrawable((Drawable) hashMap.get(Integer.valueOf(i)));
            } else {
                int ordinal2 = idIcon.ordinal();
                if (ordinal2 == 0) {
                    i2 = R.drawable.pi2_governmentid_world;
                } else if (ordinal2 == 1) {
                    i2 = R.drawable.pi2_governmentid_card;
                } else if (ordinal2 == 2) {
                    i2 = R.drawable.pi2_governmentid_flag;
                } else {
                    if (ordinal2 != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    i2 = R.drawable.pi2_governmentid_house;
                }
                Drawable drawable = DimensionKt.getDrawable(clickableConstraintLayout.getContext(), i2);
                if (drawable != null) {
                    StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
                    Integer valueOf2 = (governmentIdStepStyle == null || (governmentIdIconStrokeColor = governmentIdStepStyle.getGovernmentIdIconStrokeColor()) == null) ? null : Integer.valueOf(governmentIdIconStrokeColor.intValue());
                    Integer valueOf3 = (governmentIdStepStyle == null || (governmentIdIconFillColor = governmentIdStepStyle.getGovernmentIdIconFillColor()) == null) ? null : Integer.valueOf(governmentIdIconFillColor.intValue());
                    Context context = clickableConstraintLayout.getContext();
                    context.getClass();
                    ArrayList arrayList = new ArrayList();
                    if (valueOf2 != null) {
                        drawable.mutate().setTint(valueOf2.intValue());
                    }
                    Drawable drawable2 = DimensionKt.getDrawable(context, R.drawable.pi2_governmentid_circle_background);
                    if (valueOf3 != null && drawable2 != null && (mutate = drawable2.mutate()) != null) {
                        mutate.setTint(valueOf3.intValue());
                    }
                    if (drawable2 != null) {
                        arrayList.add(drawable2);
                    }
                    arrayList.add(drawable);
                    Drawable mutate2 = new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0])).mutate();
                    mutate2.getClass();
                    imageView.setImageDrawable(mutate2);
                    hashMap.put(Integer.valueOf(i), imageView.getDrawable());
                }
            }
            textView.setPaddingRelative((int) ExtensionsKt.getDpToPx(8.0d), textView.getPaddingTop(), textView.getPaddingEnd(), textView.getPaddingBottom());
        }
        clickableConstraintLayout.getClass();
        ViewCompat.setAccessibilityDelegate(clickableConstraintLayout, new ClockFaceView.AnonymousClass2(clickableConstraintLayout, 9));
        clickableConstraintLayout.setOnClickListener(new ScannerView$$ExternalSyntheticLambda11(4, this, enabledIdClass));
        clickableConstraintLayout.setEnabled(this.isEnabled);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Double governmentIdSelectOptionMinRowHeight;
        Integer backgroundColorValue;
        Integer chevronColor;
        TextBasedComponentStyle governmentIdVerticalOptionTextStyle;
        viewGroup.getClass();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pi2_governmentid_idlist, viewGroup, false);
        int i2 = R.id.chevron;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(inflate, R.id.chevron);
        if (imageView != null) {
            i2 = R.id.icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(inflate, R.id.icon);
            if (imageView2 != null) {
                i2 = R.id.icon_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(inflate, R.id.icon_container);
                if (constraintLayout != null) {
                    i2 = R.id.label;
                    TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.label);
                    if (textView != null) {
                        ClickableConstraintLayout clickableConstraintLayout = (ClickableConstraintLayout) inflate;
                        ViewBindingViewHolder viewBindingViewHolder = new ViewBindingViewHolder(new Pi2GovernmentidIdlistBinding(clickableConstraintLayout, imageView, imageView2, constraintLayout, textView, clickableConstraintLayout));
                        ViewBinding viewBinding = viewBindingViewHolder.binding;
                        viewBinding.getClass();
                        Pi2GovernmentidIdlistBinding pi2GovernmentidIdlistBinding = (Pi2GovernmentidIdlistBinding) viewBinding;
                        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
                        if (governmentIdStepStyle != null && (governmentIdVerticalOptionTextStyle = governmentIdStepStyle.getGovernmentIdVerticalOptionTextStyle()) != null) {
                            TextStylingKt.style(pi2GovernmentidIdlistBinding.label, governmentIdVerticalOptionTextStyle, EmptySet.INSTANCE);
                        }
                        if (governmentIdStepStyle != null && (chevronColor = governmentIdStepStyle.getChevronColor()) != null) {
                            pi2GovernmentidIdlistBinding.chevron.setColorFilter(chevronColor.intValue());
                        }
                        if (governmentIdStepStyle != null && (backgroundColorValue = governmentIdStepStyle.getBackgroundColorValue()) != null) {
                            int intValue = backgroundColorValue.intValue();
                            Integer activeOptionBackgroundColorValue = governmentIdStepStyle.getActiveOptionBackgroundColorValue();
                            if (activeOptionBackgroundColorValue != null) {
                                pi2GovernmentidIdlistBinding.rootView.setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{activeOptionBackgroundColorValue.intValue()}), new ColorDrawable(intValue), null));
                            }
                        }
                        if (governmentIdStepStyle != null && (governmentIdSelectOptionMinRowHeight = governmentIdStepStyle.getGovernmentIdSelectOptionMinRowHeight()) != null) {
                            pi2GovernmentidIdlistBinding.rootLayout.setMinHeight((int) ExtensionsKt.getDpToPx(governmentIdSelectOptionMinRowHeight.doubleValue()));
                        }
                        return viewBindingViewHolder;
                    }
                }
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
