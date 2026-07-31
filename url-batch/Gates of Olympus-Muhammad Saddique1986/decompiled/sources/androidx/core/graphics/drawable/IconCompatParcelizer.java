package androidx.core.graphics.drawable;

import E1.b;
import E1.c;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import k1.i;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        int i3 = iconCompat.f4955a;
        if (bVar.e(1)) {
            i3 = ((c) bVar).f1037e.readInt();
        }
        iconCompat.f4955a = i3;
        byte[] bArr = iconCompat.f4957c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f1037e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f4957c = bArr;
        iconCompat.f4958d = bVar.f(iconCompat.f4958d, 3);
        int i4 = iconCompat.f4959e;
        if (bVar.e(4)) {
            i4 = ((c) bVar).f1037e.readInt();
        }
        iconCompat.f4959e = i4;
        int i5 = iconCompat.f4960f;
        if (bVar.e(5)) {
            i5 = ((c) bVar).f1037e.readInt();
        }
        iconCompat.f4960f = i5;
        iconCompat.f4961g = (ColorStateList) bVar.f(iconCompat.f4961g, 6);
        String str = iconCompat.f4963i;
        if (bVar.e(7)) {
            str = ((c) bVar).f1037e.readString();
        }
        iconCompat.f4963i = str;
        String str2 = iconCompat.f4964j;
        if (bVar.e(8)) {
            str2 = ((c) bVar).f1037e.readString();
        }
        iconCompat.f4964j = str2;
        iconCompat.f4962h = PorterDuff.Mode.valueOf(iconCompat.f4963i);
        switch (iconCompat.f4955a) {
            case -1:
                Parcelable parcelable = iconCompat.f4958d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f4956b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f4958d;
                if (parcelable2 != null) {
                    iconCompat.f4956b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f4957c;
                    iconCompat.f4956b = bArr3;
                    iconCompat.f4955a = 3;
                    iconCompat.f4959e = 0;
                    iconCompat.f4960f = bArr3.length;
                }
                return iconCompat;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
            case i.LONG_FIELD_NUMBER /* 4 */:
            case 6:
                String str3 = new String(iconCompat.f4957c, Charset.forName("UTF-16"));
                iconCompat.f4956b = str3;
                if (iconCompat.f4955a == 2 && iconCompat.f4964j == null) {
                    iconCompat.f4964j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case i.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f4956b = iconCompat.f4957c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.f4963i = iconCompat.f4962h.name();
        switch (iconCompat.f4955a) {
            case -1:
                iconCompat.f4958d = (Parcelable) iconCompat.f4956b;
                break;
            case 1:
            case 5:
                iconCompat.f4958d = (Parcelable) iconCompat.f4956b;
                break;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                iconCompat.f4957c = ((String) iconCompat.f4956b).getBytes(Charset.forName("UTF-16"));
                break;
            case i.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f4957c = (byte[]) iconCompat.f4956b;
                break;
            case i.LONG_FIELD_NUMBER /* 4 */:
            case 6:
                iconCompat.f4957c = iconCompat.f4956b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i3 = iconCompat.f4955a;
        if (-1 != i3) {
            bVar.h(1);
            ((c) bVar).f1037e.writeInt(i3);
        }
        byte[] bArr = iconCompat.f4957c;
        if (bArr != null) {
            bVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((c) bVar).f1037e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f4958d;
        if (parcelable != null) {
            bVar.h(3);
            ((c) bVar).f1037e.writeParcelable(parcelable, 0);
        }
        int i4 = iconCompat.f4959e;
        if (i4 != 0) {
            bVar.h(4);
            ((c) bVar).f1037e.writeInt(i4);
        }
        int i5 = iconCompat.f4960f;
        if (i5 != 0) {
            bVar.h(5);
            ((c) bVar).f1037e.writeInt(i5);
        }
        ColorStateList colorStateList = iconCompat.f4961g;
        if (colorStateList != null) {
            bVar.h(6);
            ((c) bVar).f1037e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f4963i;
        if (str != null) {
            bVar.h(7);
            ((c) bVar).f1037e.writeString(str);
        }
        String str2 = iconCompat.f4964j;
        if (str2 != null) {
            bVar.h(8);
            ((c) bVar).f1037e.writeString(str2);
        }
    }
}
