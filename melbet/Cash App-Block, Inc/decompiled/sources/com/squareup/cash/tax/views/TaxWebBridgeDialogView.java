package com.squareup.cash.tax.views;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.tax.primitives.TaxDialogDataModel;
import com.squareup.cash.tax.viewmodels.TaxWebBridgeDialogViewEvent$ButtonClick;
import com.squareup.cash.tax.viewmodels.TaxWebBridgeDialogViewModel;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.cash.ui.SecureScreen;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class TaxWebBridgeDialogView extends AlertDialogView implements OutsideTapCloses, SecureScreen, Ui {
    public final ColorPalette colorPalette;
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxWebBridgeDialogView(Context context) {
        super(context, null, false, 6);
        context.getClass();
        this.colorPalette = ThemeHelpersKt.findThemeInfo(context).colorPalette;
    }

    public final void applyButtonStyle(MooncakePillButton mooncakePillButton, TaxDialogDataModel.Style style) {
        int i;
        int ordinal = style.ordinal();
        ColorPalette colorPalette = this.colorPalette;
        if (ordinal == 0) {
            i = colorPalette.tint;
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            i = colorPalette.error;
        }
        MooncakePillButton.setColors$default(mooncakePillButton, i, 0, null, 4, null);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(TaxWebBridgeDialogViewModel taxWebBridgeDialogViewModel) {
        taxWebBridgeDialogViewModel.getClass();
        if (!(taxWebBridgeDialogViewModel instanceof TaxWebBridgeDialogViewModel.LoadTaxWebBridgeDialog)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        TaxDialogDataModel taxDialogDataModel = ((TaxWebBridgeDialogViewModel.LoadTaxWebBridgeDialog) taxWebBridgeDialogViewModel).taxDialog;
        String str = taxDialogDataModel.title;
        if (str != null) {
            setTitle(str);
        }
        String str2 = taxDialogDataModel.message;
        if (str2 != null) {
            setMessage(str2);
        }
        final TaxDialogDataModel.Button button = taxDialogDataModel.primaryButton;
        AlertDialogView.Layout layout = this.dialog;
        if (button != null) {
            final int i = 0;
            setPositiveButton(button.title, new Function0(this) { // from class: com.squareup.cash.tax.views.TaxWebBridgeDialogView$$ExternalSyntheticLambda0
                public final /* synthetic */ TaxWebBridgeDialogView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i2 = i;
                    TaxDialogDataModel.Button button2 = button;
                    TaxWebBridgeDialogView taxWebBridgeDialogView = this.f$0;
                    switch (i2) {
                        case 0:
                            Ui.EventReceiver eventReceiver = taxWebBridgeDialogView.eventReceiver;
                            if (eventReceiver != null) {
                                eventReceiver.sendEvent(new TaxWebBridgeDialogViewEvent$ButtonClick(button2));
                                return Unit.INSTANCE;
                            }
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        default:
                            Ui.EventReceiver eventReceiver2 = taxWebBridgeDialogView.eventReceiver;
                            if (eventReceiver2 != null) {
                                eventReceiver2.sendEvent(new TaxWebBridgeDialogViewEvent$ButtonClick(button2));
                                return Unit.INSTANCE;
                            }
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                    }
                }
            });
            applyButtonStyle(layout.buttonsContainer.primary, button.style);
        }
        final TaxDialogDataModel.Button button2 = taxDialogDataModel.secondaryButton;
        if (button2 != null) {
            final int i2 = 1;
            setNegativeButton(button2.title, new Function0(this) { // from class: com.squareup.cash.tax.views.TaxWebBridgeDialogView$$ExternalSyntheticLambda0
                public final /* synthetic */ TaxWebBridgeDialogView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i2;
                    TaxDialogDataModel.Button button22 = button2;
                    TaxWebBridgeDialogView taxWebBridgeDialogView = this.f$0;
                    switch (i22) {
                        case 0:
                            Ui.EventReceiver eventReceiver = taxWebBridgeDialogView.eventReceiver;
                            if (eventReceiver != null) {
                                eventReceiver.sendEvent(new TaxWebBridgeDialogViewEvent$ButtonClick(button22));
                                return Unit.INSTANCE;
                            }
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        default:
                            Ui.EventReceiver eventReceiver2 = taxWebBridgeDialogView.eventReceiver;
                            if (eventReceiver2 != null) {
                                eventReceiver2.sendEvent(new TaxWebBridgeDialogViewEvent$ButtonClick(button22));
                                return Unit.INSTANCE;
                            }
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                    }
                }
            });
            applyButtonStyle(layout.buttonsContainer.secondary, button2.style);
        }
    }
}
