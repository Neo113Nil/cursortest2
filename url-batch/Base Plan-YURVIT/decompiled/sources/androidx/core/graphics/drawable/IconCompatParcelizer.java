package androidx.core.graphics.drawable;

import H.k;
import R.a;
import R.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i2 = iconCompat.f1397a;
        if (aVar.e(1)) {
            i2 = ((b) aVar).f815e.readInt();
        }
        iconCompat.f1397a = i2;
        byte[] bArr = iconCompat.f1399c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f815e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1399c = bArr;
        iconCompat.f1400d = aVar.f(iconCompat.f1400d, 3);
        int i3 = iconCompat.f1401e;
        if (aVar.e(4)) {
            i3 = ((b) aVar).f815e.readInt();
        }
        iconCompat.f1401e = i3;
        int i4 = iconCompat.f1402f;
        if (aVar.e(5)) {
            i4 = ((b) aVar).f815e.readInt();
        }
        iconCompat.f1402f = i4;
        iconCompat.f1403g = (ColorStateList) aVar.f(iconCompat.f1403g, 6);
        String str = iconCompat.f1405i;
        if (aVar.e(7)) {
            str = ((b) aVar).f815e.readString();
        }
        iconCompat.f1405i = str;
        String str2 = iconCompat.f1406j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f815e.readString();
        }
        iconCompat.f1406j = str2;
        iconCompat.f1404h = PorterDuff.Mode.valueOf(iconCompat.f1405i);
        switch (iconCompat.f1397a) {
            case -1:
                Parcelable parcelable = iconCompat.f1400d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1398b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                Parcelable parcelable2 = iconCompat.f1400d;
                if (parcelable2 != null) {
                    iconCompat.f1398b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f1399c;
                iconCompat.f1398b = bArr3;
                iconCompat.f1397a = 3;
                iconCompat.f1401e = 0;
                iconCompat.f1402f = bArr3.length;
                return iconCompat;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                String str3 = new String(iconCompat.f1399c, Charset.forName("UTF-16"));
                iconCompat.f1398b = str3;
                if (iconCompat.f1397a == 2 && iconCompat.f1406j == null) {
                    iconCompat.f1406j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f1398b = iconCompat.f1399c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f1405i = iconCompat.f1404h.name();
        switch (iconCompat.f1397a) {
            case -1:
                iconCompat.f1400d = (Parcelable) iconCompat.f1398b;
                break;
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.f1400d = (Parcelable) iconCompat.f1398b;
                break;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                iconCompat.f1399c = ((String) iconCompat.f1398b).getBytes(Charset.forName("UTF-16"));
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f1399c = (byte[]) iconCompat.f1398b;
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.f1399c = iconCompat.f1398b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f1397a;
        if (-1 != i2) {
            aVar.h(1);
            ((b) aVar).f815e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f1399c;
        if (bArr != null) {
            aVar.h(2);
            Parcel parcel = ((b) aVar).f815e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1400d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f815e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f1401e;
        if (i3 != 0) {
            aVar.h(4);
            ((b) aVar).f815e.writeInt(i3);
        }
        int i4 = iconCompat.f1402f;
        if (i4 != 0) {
            aVar.h(5);
            ((b) aVar).f815e.writeInt(i4);
        }
        ColorStateList colorStateList = iconCompat.f1403g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f815e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f1405i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f815e.writeString(str);
        }
        String str2 = iconCompat.f1406j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f815e.writeString(str2);
        }
    }
}
