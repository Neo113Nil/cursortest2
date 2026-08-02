package com.squareup.cash.tax.views;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.primitives.MenuItemStyle;
import com.squareup.cash.tax.primitives.TaxMenuItem;
import com.squareup.cash.tax.viewmodels.TaxMenuSheetViewModel;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.cash.ui.SecureScreen;
import com.squareup.cash.ui.drawable.DividerDrawable;
import com.squareup.cash.ui.drawable.RippleDrawableKt;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;

/* loaded from: classes7.dex */
public final class TaxMenuSheetView extends LinearLayout implements OutsideTapCloses, SecureScreen, Ui {
    public final ColorPalette colorPalette;
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxMenuSheetView(Context context) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(context).colorPalette;
        this.colorPalette = colorPalette;
        setOrientation(1);
        setBackgroundColor(colorPalette.elevatedBackground);
        setDividerDrawable(new DividerDrawable(colorPalette.hairline));
        setShowDividers(2);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    @Override // app.cash.broadway.ui.Ui
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setModel(TaxMenuSheetViewModel taxMenuSheetViewModel) {
        int i;
        int ordinal;
        TextThemeInfo textThemeInfo;
        taxMenuSheetViewModel.getClass();
        if (!(taxMenuSheetViewModel instanceof TaxMenuSheetViewModel.LoadMenuItems)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        List<TaxMenuItem> list = ((TaxMenuSheetViewModel.LoadMenuItems) taxMenuSheetViewModel).menuItems;
        removeAllViews();
        for (TaxMenuItem taxMenuItem : list) {
            Button button = new Button(getContext());
            button.setId(View.generateViewId());
            button.setText(taxMenuItem.title);
            MenuItemStyle menuItemStyle = taxMenuItem.style;
            int ordinal2 = menuItemStyle.ordinal();
            ColorPalette colorPalette = this.colorPalette;
            if (ordinal2 != 0 && ordinal2 != 1) {
                if (ordinal2 == 2) {
                    i = colorPalette.error;
                    button.setTextColor(i);
                    ordinal = menuItemStyle.ordinal();
                    if (ordinal != 0) {
                        textThemeInfo = TextStyles.mainBody;
                    } else if (ordinal == 1) {
                        textThemeInfo = TextStyles.mainTitle;
                    } else if (ordinal == 2) {
                        textThemeInfo = TextStyles.mainTitle;
                    } else {
                        if (ordinal != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        textThemeInfo = TextStyles.mainTitle;
                    }
                    Strings.applyStyle(button, textThemeInfo);
                    int dimensionPixelSize = button.getContext().getResources().getDimensionPixelSize(R.dimen.bottom_sheet_item_padding);
                    button.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                    button.setBackground(RippleDrawableKt.createRippleDrawable$default(button));
                    button.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(29, this, taxMenuItem));
                    addView(button, new LinearLayout.LayoutParams(-1, -2));
                } else if (ordinal2 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
            }
            i = colorPalette.label;
            button.setTextColor(i);
            ordinal = menuItemStyle.ordinal();
            if (ordinal != 0) {
            }
            Strings.applyStyle(button, textThemeInfo);
            int dimensionPixelSize2 = button.getContext().getResources().getDimensionPixelSize(R.dimen.bottom_sheet_item_padding);
            button.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
            button.setBackground(RippleDrawableKt.createRippleDrawable$default(button));
            button.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(29, this, taxMenuItem));
            addView(button, new LinearLayout.LayoutParams(-1, -2));
        }
    }
}
