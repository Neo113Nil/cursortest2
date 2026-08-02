package com.squareup.scannerview.scanner;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.ReaderException;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeReader;
import com.squareup.util.cash.Luhn$$ExternalSyntheticLambda0;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes4.dex */
public final class RealObjectScanner {
    public static final RealObjectScanner INSTANCE = new RealObjectScanner();
    public static final Lazy qrCodeReader$delegate = LazyKt.lazy(new Luhn$$ExternalSyntheticLambda0(7));

    public static String tryDecodeSource(LuminanceSource luminanceSource) {
        try {
            return (String) ((QRCodeReader) qrCodeReader$delegate.getValue()).decode(new BinaryBitmap(new HybridBinarizer(luminanceSource))).text;
        } catch (ReaderException unused) {
            return null;
        }
    }
}
