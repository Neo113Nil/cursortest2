package com.squareup.cash.tax.web.handlers;

import com.squareup.cash.tax.primitives.TaxToolbarConfig;
import com.squareup.protos.cash.tax.TaxWebBridgeConfigureToolbarEventRequest;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class ToolbarConfigHandlersKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType.values().length];
        try {
            iArr[TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType.BACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType.HELP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType.MENU.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType.CLOSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType.DESKTOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[TaxToolbarConfig.ToolbarItem.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            TaxToolbarConfig.ToolbarItem toolbarItem = TaxToolbarConfig.ToolbarItem.BACK;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            TaxToolbarConfig.ToolbarItem toolbarItem2 = TaxToolbarConfig.ToolbarItem.BACK;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            TaxToolbarConfig.ToolbarItem toolbarItem3 = TaxToolbarConfig.ToolbarItem.BACK;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            TaxToolbarConfig.ToolbarItem toolbarItem4 = TaxToolbarConfig.ToolbarItem.BACK;
            iArr2[4] = 5;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
