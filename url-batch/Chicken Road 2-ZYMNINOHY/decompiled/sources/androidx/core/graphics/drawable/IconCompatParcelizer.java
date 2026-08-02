package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;
import r1.AbstractC1400a;
import r1.C1401b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC1400a abstractC1400a) {
        IconCompat iconCompat = new IconCompat();
        int i4 = iconCompat.f4508a;
        if (abstractC1400a.e(1)) {
            i4 = ((C1401b) abstractC1400a).f15192e.readInt();
        }
        iconCompat.f4508a = i4;
        byte[] bArr = iconCompat.f4510c;
        if (abstractC1400a.e(2)) {
            Parcel parcel = ((C1401b) abstractC1400a).f15192e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f4510c = bArr;
        iconCompat.f4511d = abstractC1400a.f(iconCompat.f4511d, 3);
        int i5 = iconCompat.f4512e;
        if (abstractC1400a.e(4)) {
            i5 = ((C1401b) abstractC1400a).f15192e.readInt();
        }
        iconCompat.f4512e = i5;
        int i6 = iconCompat.f4513f;
        if (abstractC1400a.e(5)) {
            i6 = ((C1401b) abstractC1400a).f15192e.readInt();
        }
        iconCompat.f4513f = i6;
        iconCompat.f4514g = (ColorStateList) abstractC1400a.f(iconCompat.f4514g, 6);
        String str = iconCompat.f4516i;
        if (abstractC1400a.e(7)) {
            str = ((C1401b) abstractC1400a).f15192e.readString();
        }
        iconCompat.f4516i = str;
        String str2 = iconCompat.f4517j;
        if (abstractC1400a.e(8)) {
            str2 = ((C1401b) abstractC1400a).f15192e.readString();
        }
        iconCompat.f4517j = str2;
        iconCompat.f4515h = PorterDuff.Mode.valueOf(iconCompat.f4516i);
        switch (iconCompat.f4508a) {
            case -1:
                Parcelable parcelable = iconCompat.f4511d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f4509b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f4511d;
                if (parcelable2 != null) {
                    iconCompat.f4509b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f4510c;
                iconCompat.f4509b = bArr3;
                iconCompat.f4508a = 3;
                iconCompat.f4512e = 0;
                iconCompat.f4513f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f4510c, Charset.forName(CharEncoding.UTF_16));
                iconCompat.f4509b = str3;
                if (iconCompat.f4508a == 2 && iconCompat.f4517j == null) {
                    iconCompat.f4517j = str3.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f4509b = iconCompat.f4510c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC1400a abstractC1400a) {
        abstractC1400a.getClass();
        iconCompat.f4516i = iconCompat.f4515h.name();
        switch (iconCompat.f4508a) {
            case -1:
                iconCompat.f4511d = (Parcelable) iconCompat.f4509b;
                break;
            case 1:
            case 5:
                iconCompat.f4511d = (Parcelable) iconCompat.f4509b;
                break;
            case 2:
                iconCompat.f4510c = ((String) iconCompat.f4509b).getBytes(Charset.forName(CharEncoding.UTF_16));
                break;
            case 3:
                iconCompat.f4510c = (byte[]) iconCompat.f4509b;
                break;
            case 4:
            case 6:
                iconCompat.f4510c = iconCompat.f4509b.toString().getBytes(Charset.forName(CharEncoding.UTF_16));
                break;
        }
        int i4 = iconCompat.f4508a;
        if (-1 != i4) {
            abstractC1400a.h(1);
            ((C1401b) abstractC1400a).f15192e.writeInt(i4);
        }
        byte[] bArr = iconCompat.f4510c;
        if (bArr != null) {
            abstractC1400a.h(2);
            Parcel parcel = ((C1401b) abstractC1400a).f15192e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f4511d;
        if (parcelable != null) {
            abstractC1400a.h(3);
            ((C1401b) abstractC1400a).f15192e.writeParcelable(parcelable, 0);
        }
        int i5 = iconCompat.f4512e;
        if (i5 != 0) {
            abstractC1400a.h(4);
            ((C1401b) abstractC1400a).f15192e.writeInt(i5);
        }
        int i6 = iconCompat.f4513f;
        if (i6 != 0) {
            abstractC1400a.h(5);
            ((C1401b) abstractC1400a).f15192e.writeInt(i6);
        }
        ColorStateList colorStateList = iconCompat.f4514g;
        if (colorStateList != null) {
            abstractC1400a.h(6);
            ((C1401b) abstractC1400a).f15192e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f4516i;
        if (str != null) {
            abstractC1400a.h(7);
            ((C1401b) abstractC1400a).f15192e.writeString(str);
        }
        String str2 = iconCompat.f4517j;
        if (str2 != null) {
            abstractC1400a.h(8);
            ((C1401b) abstractC1400a).f15192e.writeString(str2);
        }
    }
}
