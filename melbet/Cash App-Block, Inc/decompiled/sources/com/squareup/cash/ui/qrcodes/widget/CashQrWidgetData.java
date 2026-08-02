package com.squareup.cash.ui.qrcodes.widget;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CashQrWidgetData {
    public final String cashtag;
    public final Bitmap qrImage;

    public CashQrWidgetData(String str, Bitmap bitmap) {
        this.cashtag = str;
        this.qrImage = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashQrWidgetData)) {
            return false;
        }
        CashQrWidgetData cashQrWidgetData = (CashQrWidgetData) obj;
        return Intrinsics.areEqual(this.cashtag, cashQrWidgetData.cashtag) && Intrinsics.areEqual(this.qrImage, cashQrWidgetData.qrImage);
    }

    public final int hashCode() {
        String str = this.cashtag;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Bitmap bitmap = this.qrImage;
        return hashCode + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public final String toString() {
        return "CashQrWidgetData(cashtag=" + this.cashtag + ", qrImage=" + this.qrImage + ")";
    }
}
