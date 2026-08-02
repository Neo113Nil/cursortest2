package com.squareup.cash.ui.widget;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.chip.Chip$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.cash.tax.views.TaxReturnsViewKt$$ExternalSyntheticLambda5;
import com.squareup.kotterknife.KotterKnifeKt;
import com.squareup.kotterknife.Lazy;
import com.squareup.util.Strings;
import com.squareup.util.android.ColorsKt;
import com.squareup.util.android.Views;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public class SwitchSettingView extends FrameLayout {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(SwitchSettingView.class, "containerView", "getContainerView()Landroid/widget/LinearLayout;", 0), new PropertyReference1Impl(SwitchSettingView.class, "textContainer", "getTextContainer()Landroid/widget/LinearLayout;", 0), new PropertyReference1Impl(SwitchSettingView.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0), new PropertyReference1Impl(SwitchSettingView.class, "descriptionView", "getDescriptionView()Landroid/widget/TextView;", 0), new PropertyReference1Impl(SwitchSettingView.class, "buttonContainerView", "getButtonContainerView()Landroid/view/ViewGroup;", 0)};
    public final Lazy buttonContainerView$delegate;
    public final SwitchCompat buttonView;
    public final ColorPalette colorPalette;
    public final Lazy containerView$delegate;
    public final Lazy descriptionView$delegate;
    public boolean ignoreChanges;
    public CompoundButton.OnCheckedChangeListener listener;
    public final Lazy textContainer$delegate;
    public final Lazy titleView$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.colorPalette = colorPalette;
        this.containerView$delegate = KotterKnifeKt.bindView(this, R.id.compound_setting_container);
        this.textContainer$delegate = KotterKnifeKt.bindView(this, R.id.text_container);
        this.titleView$delegate = KotterKnifeKt.bindView(this, R.id.title);
        this.descriptionView$delegate = KotterKnifeKt.bindView(this, R.id.description);
        this.buttonContainerView$delegate = KotterKnifeKt.bindView(this, R.id.button_container);
        View.inflate(context, R.layout.compound_setting, this);
        SwitchCompat switchCompat = new SwitchCompat(context);
        this.buttonView = switchCompat;
        getButtonContainerView().addView(switchCompat);
        switchCompat.setOnCheckedChangeListener(new Chip$$ExternalSyntheticLambda0(this, 4));
        setTextHorizontalPadding(R.dimen.item_padding_side);
        setButtonHorizontalPadding(R.dimen.item_padding_side);
        setTitleStyle(TextStyles.mainTitle);
        setTitleColor(colorPalette.label);
        setDescriptionStyle(TextStyles.smallBody);
        setDescriptionColor(colorPalette.secondaryLabel);
        int i = colorPalette.tint;
        setThumbTint(i);
        setTrackTint(i);
        Views.waitForMeasure$default(getButtonContainerView(), new TaxReturnsViewKt$$ExternalSyntheticLambda5(this, 27));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        sparseArray.getClass();
        if (getId() != -1) {
            sparseArray.put(getId(), onSaveInstanceState());
        }
    }

    public final ViewGroup getButtonContainerView() {
        return (ViewGroup) this.buttonContainerView$delegate.getValue(this, $$delegatedProperties[4]);
    }

    public final TextView getDescriptionView() {
        return (TextView) this.descriptionView$delegate.getValue(this, $$delegatedProperties[3]);
    }

    public final LinearLayout getTextContainer() {
        return (LinearLayout) this.textContainer$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final TextView getTitleView() {
        return (TextView) this.titleView$delegate.getValue(this, $$delegatedProperties[2]);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        Bundle bundle = (Bundle) parcelable;
        setChecked(bundle.getBoolean("checked", true), true);
        super.onRestoreInstanceState(bundle.getParcelable("instance"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instance", super.onSaveInstanceState());
        bundle.putBoolean("checked", this.buttonView.isChecked());
        return bundle;
    }

    @Override // android.view.View
    public void setActivated(boolean z) {
        super.setActivated(z);
        KProperty[] kPropertyArr = $$delegatedProperties;
        KProperty kProperty = kPropertyArr[0];
        Lazy lazy = this.containerView$delegate;
        if (((LinearLayout) lazy.getValue(this, kProperty)).getShowDividers() == 0) {
            ((LinearLayout) lazy.getValue(this, kPropertyArr[0])).setClickable(!z);
        }
        SwitchCompat switchCompat = this.buttonView;
        switchCompat.setClickable(!z);
        switchCompat.setAlpha(z ? 0.3f : 1.0f);
    }

    public final void setButtonHorizontalPadding(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        getButtonContainerView().setPadding(dimensionPixelSize, getButtonContainerView().getPaddingTop(), dimensionPixelSize, getButtonContainerView().getPaddingBottom());
    }

    public final void setChecked(boolean z, boolean z2) {
        this.ignoreChanges = z2;
        this.buttonView.setChecked(z);
        this.ignoreChanges = false;
    }

    public final void setDescription(String str) {
        TextView descriptionView = getDescriptionView();
        descriptionView.setText(str);
        descriptionView.setVisibility((str == null || StringsKt.isBlank(str)) ? 8 : 0);
    }

    public final void setDescriptionColor(int i) {
        getDescriptionView().setTextColor(i);
    }

    public final void setDescriptionStyle(TextThemeInfo textThemeInfo) {
        textThemeInfo.getClass();
        Strings.applyStyle(getDescriptionView(), textThemeInfo);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        ((LinearLayout) this.containerView$delegate.getValue(this, $$delegatedProperties[0])).setEnabled(z);
        getTitleView().setEnabled(z);
        getDescriptionView().setEnabled(z);
        this.buttonView.setEnabled(z);
    }

    public final void setOnCheckedChangeListener(Function2<? super CompoundButton, ? super Boolean, Unit> function2) {
        function2.getClass();
        setOnCheckedChangeListener(new Chip$$ExternalSyntheticLambda0(function2, 5));
    }

    public final void setTextHorizontalPadding(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        getTextContainer().setPadding(dimensionPixelSize, getTextContainer().getPaddingTop(), dimensionPixelSize, getTextContainer().getPaddingBottom());
    }

    public final void setThumbTint(int i) {
        SwitchCompat switchCompat = this.buttonView;
        if (switchCompat == null) {
            switchCompat = null;
        }
        if (switchCompat != null) {
            Pair pair = new Pair(new int[]{android.R.attr.state_checked, android.R.attr.state_enabled}, Integer.valueOf(i));
            Pair pair2 = new Pair(new int[]{android.R.attr.state_checked, -16842910}, Integer.valueOf(ColorsKt.lighten(i)));
            int[] iArr = {-16842912, android.R.attr.state_enabled};
            ColorPalette colorPalette = this.colorPalette;
            switchCompat.setThumbTintList(ColorsKt.colorStateListOf(pair, pair2, new Pair(iArr, Integer.valueOf(colorPalette.switchThumbUnchecked)), new Pair(new int[]{-16842912, -16842910}, Integer.valueOf(ColorsKt.lighten(colorPalette.switchThumbUnchecked)))));
        }
    }

    public final void setTitle(String str) {
        getTitleView().setText(str);
    }

    public final void setTitleColor(int i) {
        getTitleView().setTextColor(i);
    }

    public final void setTitleStyle(TextThemeInfo textThemeInfo) {
        textThemeInfo.getClass();
        Strings.applyStyle(getTitleView(), textThemeInfo);
    }

    public final void setTrackTint(int i) {
        SwitchCompat switchCompat = this.buttonView;
        if (switchCompat == null) {
            switchCompat = null;
        }
        if (switchCompat != null) {
            Pair pair = new Pair(new int[]{android.R.attr.state_checked, android.R.attr.state_enabled}, Integer.valueOf(ColorUtils.setAlphaComponent(i, 120)));
            Pair pair2 = new Pair(new int[]{android.R.attr.state_checked, -16842910}, Integer.valueOf(ColorUtils.setAlphaComponent(i, 70)));
            int[] iArr = {-16842912, android.R.attr.state_enabled};
            ColorPalette colorPalette = this.colorPalette;
            switchCompat.setTrackTintList(ColorsKt.colorStateListOf(pair, pair2, new Pair(iArr, Integer.valueOf(colorPalette.switchTrackUnchecked)), new Pair(new int[]{-16842912, -16842910}, Integer.valueOf(ColorUtils.setAlphaComponent(colorPalette.switchTrackUnchecked, 70)))));
        }
    }

    public final void setChecked(boolean z) {
        setChecked(z, false);
    }

    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.listener = onCheckedChangeListener;
    }

    public final void setDescription(int i) {
        setDescription(getContext().getString(i));
    }

    public /* synthetic */ SwitchSettingView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
