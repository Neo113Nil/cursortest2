package com.squareup.cash.tax.web.handlers;

import com.squareup.cash.tax.primitives.TaxDialogDataModel;
import com.squareup.protos.cash.tax.TaxWebBridgeDialog;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes7.dex */
public abstract class ShowDialogEventHandlersKt {

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaxWebBridgeDialog.Button.Style.values().length];
            try {
                iArr[TaxWebBridgeDialog.Button.Style.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaxWebBridgeDialog.Button.Style.DESTRUCTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final TaxDialogDataModel.Style toDialogStyle(TaxWebBridgeDialog.Button.Style style) {
        int i = style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i != -1 && i != 1) {
            if (i == 2) {
                return TaxDialogDataModel.Style.Destructive;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        return TaxDialogDataModel.Style.Default;
    }
}
