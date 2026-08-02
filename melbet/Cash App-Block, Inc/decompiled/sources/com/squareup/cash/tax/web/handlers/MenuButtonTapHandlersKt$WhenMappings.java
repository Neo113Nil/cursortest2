package com.squareup.cash.tax.web.handlers;

import com.squareup.protos.cash.tax.TaxWebBridgeMenuItem;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class MenuButtonTapHandlersKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[TaxWebBridgeMenuItem.Style.values().length];
        try {
            iArr[TaxWebBridgeMenuItem.Style.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TaxWebBridgeMenuItem.Style.PRIMARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TaxWebBridgeMenuItem.Style.DESTRUCTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
