package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.mlkit.vision.text.zza;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.QRCode;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import io.noties.markwon.MarkwonImpl;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.text.Regex$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public abstract class QRCodeComponentKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StyleElements.PositionType.values().length];
            try {
                iArr[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.PositionType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.PositionType.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ImageView makeView(QRCodeComponent qRCodeComponent, MarkwonImpl markwonImpl, QRCode qRCode) {
        String value;
        QRCode.Attributes attributes = qRCode.getAttributes();
        if (attributes == null || (value = attributes.getValue()) == null) {
            return null;
        }
        int i = qRCodeComponent.width;
        HashMap hashMap = new HashMap();
        hashMap.put(EncodeHintType.MARGIN, 0);
        try {
            BitMatrix encode = new zza(11).encode(value, BarcodeFormat.QR_CODE, i, i, hashMap);
            Integer strokeColor = qRCode.getStrokeColor();
            int intValue = strokeColor != null ? strokeColor.intValue() : -16777216;
            Integer fillColor = qRCode.getFillColor();
            int intValue2 = fillColor != null ? fillColor.intValue() : -1;
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.RGB_565);
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < i; i3++) {
                    createBitmap.setPixel(i2, i3, encode.get(i2, i3) ? intValue : intValue2);
                }
            }
            createBitmap.getClass();
            ImageView imageView = new ImageView((Context) markwonImpl.parser);
            imageView.setImageBitmap(createBitmap);
            ((LinkedList) markwonImpl.plugins).add(new Regex$$ExternalSyntheticLambda1(13, qRCode, imageView));
            return imageView;
        } catch (WriterException unused) {
            return null;
        }
    }
}
