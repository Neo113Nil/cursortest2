package com.google.zxing;

import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* loaded from: classes4.dex */
public interface Writer {
    BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i8, int i9);

    BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i8, int i9, Map<EncodeHintType, ?> map);
}
