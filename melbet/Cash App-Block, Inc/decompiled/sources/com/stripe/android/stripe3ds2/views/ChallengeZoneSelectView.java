package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.core.os.BundleKt;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.squareup.cash.R;
import com.stripe.android.stripe3ds2.init.ui.BaseCustomization;
import com.stripe.android.stripe3ds2.init.ui.ButtonCustomization;
import com.stripe.android.stripe3ds2.init.ui.LabelCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeButtonCustomization;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;

/* loaded from: classes8.dex */
public final class ChallengeZoneSelectView extends FrameLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final int buttonBottomMargin;
    public final int buttonLabelPadding;
    public final int buttonMinHeight;
    public final int buttonOffsetMargin;
    public final ThreeDS2TextView infoLabel;
    public final boolean isSingleSelectMode;
    public final LinearLayout selectGroup;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChallengeZoneSelectView(Context context, AttributeSet attributeSet, int i, boolean z, int i2) {
        super(context, attributeSet, i);
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        z = (i2 & 8) != 0 ? false : z;
        context.getClass();
        this.isSingleSelectMode = z;
        if (getId() == -1) {
            setId(R.id.stripe_3ds2_default_challenge_zone_select_view_id);
        }
        this.buttonBottomMargin = context.getResources().getDimensionPixelSize(R.dimen.stripe_3ds2_challenge_zone_select_button_vertical_margin);
        this.buttonLabelPadding = context.getResources().getDimensionPixelSize(R.dimen.stripe_3ds2_challenge_zone_select_button_label_padding);
        this.buttonOffsetMargin = context.getResources().getDimensionPixelSize(R.dimen.stripe_3ds2_challenge_zone_select_button_offset_margin);
        this.buttonMinHeight = context.getResources().getDimensionPixelSize(R.dimen.stripe_3ds2_challenge_zone_select_button_min_height);
        int i3 = R.id.select_group;
        if (z) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.stripe_challenge_zone_single_select_view, (ViewGroup) this, false);
            addView(inflate);
            ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) ViewBindings.findChildViewById(inflate, R.id.label);
            if (threeDS2TextView != null) {
                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(inflate, R.id.select_group);
                if (radioGroup != null) {
                    this.infoLabel = threeDS2TextView;
                    this.selectGroup = radioGroup;
                    return;
                }
            } else {
                i3 = R.id.label;
            }
            a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
            throw null;
        }
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.stripe_challenge_zone_multi_select_view, (ViewGroup) this, false);
        addView(inflate2);
        ThreeDS2TextView threeDS2TextView2 = (ThreeDS2TextView) ViewBindings.findChildViewById(inflate2, R.id.label);
        if (threeDS2TextView2 != null) {
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(inflate2, R.id.select_group);
            if (linearLayout != null) {
                this.infoLabel = threeDS2TextView2;
                this.selectGroup = linearLayout;
                return;
            }
        } else {
            i3 = R.id.label;
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
        throw null;
    }

    public final List getSelectedIndexes$3ds2sdk_release() {
        LinearLayout linearLayout = this.selectGroup;
        IntRange until = RangesKt___RangesKt.until(0, linearLayout.getChildCount());
        ArrayList arrayList = new ArrayList();
        Iterator it = until.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            View childAt = linearLayout.getChildAt(nextInt);
            childAt.getClass();
            Integer valueOf = ((CompoundButton) childAt).isChecked() ? Integer.valueOf(nextInt) : null;
            if (valueOf != null) {
                arrayList.add(valueOf);
            }
        }
        return CollectionsKt.take(arrayList, this.isSingleSelectMode ? 1 : arrayList.size());
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState((Parcelable) SizeKt.getParcelable(bundle, "state_super", Parcelable.class));
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("state_selected_indexes");
        if (integerArrayList != null) {
            for (Integer num : integerArrayList) {
                num.getClass();
                View childAt = this.selectGroup.getChildAt(num.intValue());
                childAt.getClass();
                ((CompoundButton) childAt).setChecked(true);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return BundleKt.bundleOf(new Pair("state_super", super.onSaveInstanceState()), new Pair("state_selected_indexes", new ArrayList(getSelectedIndexes$3ds2sdk_release())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setChallengeSelectOptions(List<ChallengeResponseData.ChallengeSelectOption> list, ButtonCustomization buttonCustomization) {
        if (list != null) {
            int size = list.size();
            Iterator it = RangesKt___RangesKt.until(0, size).iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                ChallengeResponseData.ChallengeSelectOption challengeSelectOption = list.get(nextInt);
                boolean z = nextInt == size + (-1);
                challengeSelectOption.getClass();
                CompoundButton materialRadioButton = this.isSingleSelectMode ? new MaterialRadioButton(getContext()) : new MaterialCheckBox(getContext());
                if (buttonCustomization != 0) {
                    String str = ((StripeButtonCustomization) buttonCustomization).mBackgroundColor;
                    if (str != null && !StringsKt.isBlank(str)) {
                        materialRadioButton.setButtonTintList(ColorStateList.valueOf(Color.parseColor(str)));
                    }
                    String str2 = ((BaseCustomization) buttonCustomization).mTextColor;
                    if (str2 != null && !StringsKt.isBlank(str2)) {
                        materialRadioButton.setTextColor(Color.parseColor(str2));
                    }
                }
                materialRadioButton.setId(View.generateViewId());
                materialRadioButton.setTag(challengeSelectOption);
                materialRadioButton.setText(challengeSelectOption.text);
                materialRadioButton.setPadding(this.buttonLabelPadding, materialRadioButton.getPaddingTop(), materialRadioButton.getPaddingRight(), materialRadioButton.getPaddingBottom());
                materialRadioButton.setMinimumHeight(this.buttonMinHeight);
                RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
                if (!z) {
                    layoutParams.bottomMargin = this.buttonBottomMargin;
                }
                layoutParams.leftMargin = this.buttonOffsetMargin;
                materialRadioButton.setLayoutParams(layoutParams);
                this.selectGroup.addView(materialRadioButton);
            }
        }
    }

    public final void setTextEntryLabel(String str, LabelCustomization labelCustomization) {
        ThreeDS2TextView threeDS2TextView = this.infoLabel;
        if (str == null || StringsKt.isBlank(str)) {
            threeDS2TextView.setVisibility(8);
        } else {
            threeDS2TextView.setText(str, labelCustomization);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneSelectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneSelectView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneSelectView(Context context) {
        this(context, null, 0, false, 14);
        context.getClass();
    }
}
