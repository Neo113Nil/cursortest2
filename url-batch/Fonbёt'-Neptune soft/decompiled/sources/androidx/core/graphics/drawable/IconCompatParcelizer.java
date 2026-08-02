package androidx.core.graphics.drawable;

import K.k;
import T.a;
import T.b;
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
        int i2 = iconCompat.f1558a;
        if (aVar.e(1)) {
            i2 = ((b) aVar).f1079e.readInt();
        }
        iconCompat.f1558a = i2;
        byte[] bArr = iconCompat.f1560c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f1079e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1560c = bArr;
        iconCompat.f1561d = aVar.f(iconCompat.f1561d, 3);
        int i3 = iconCompat.f1562e;
        if (aVar.e(4)) {
            i3 = ((b) aVar).f1079e.readInt();
        }
        iconCompat.f1562e = i3;
        int i4 = iconCompat.f1563f;
        if (aVar.e(5)) {
            i4 = ((b) aVar).f1079e.readInt();
        }
        iconCompat.f1563f = i4;
        iconCompat.f1564g = (ColorStateList) aVar.f(iconCompat.f1564g, 6);
        String str = iconCompat.f1566i;
        if (aVar.e(7)) {
            str = ((b) aVar).f1079e.readString();
        }
        iconCompat.f1566i = str;
        String str2 = iconCompat.f1567j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f1079e.readString();
        }
        iconCompat.f1567j = str2;
        iconCompat.f1565h = PorterDuff.Mode.valueOf(iconCompat.f1566i);
        switch (iconCompat.f1558a) {
            case -1:
                Parcelable parcelable = iconCompat.f1561d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1559b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                Parcelable parcelable2 = iconCompat.f1561d;
                if (parcelable2 != null) {
                    iconCompat.f1559b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1560c;
                    iconCompat.f1559b = bArr3;
                    iconCompat.f1558a = 3;
                    iconCompat.f1562e = 0;
                    iconCompat.f1563f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                String str3 = new String(iconCompat.f1560c, Charset.forName("UTF-16"));
                iconCompat.f1559b = str3;
                if (iconCompat.f1558a == 2 && iconCompat.f1567j == null) {
                    iconCompat.f1567j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1559b = iconCompat.f1560c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f1566i = iconCompat.f1565h.name();
        switch (iconCompat.f1558a) {
            case -1:
                iconCompat.f1561d = (Parcelable) iconCompat.f1559b;
                break;
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.f1561d = (Parcelable) iconCompat.f1559b;
                break;
            case 2:
                iconCompat.f1560c = ((String) iconCompat.f1559b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1560c = (byte[]) iconCompat.f1559b;
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.f1560c = iconCompat.f1559b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f1558a;
        if (-1 != i2) {
            aVar.h(1);
            ((b) aVar).f1079e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f1560c;
        if (bArr != null) {
            aVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f1079e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1561d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f1079e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f1562e;
        if (i3 != 0) {
            aVar.h(4);
            ((b) aVar).f1079e.writeInt(i3);
        }
        int i4 = iconCompat.f1563f;
        if (i4 != 0) {
            aVar.h(5);
            ((b) aVar).f1079e.writeInt(i4);
        }
        ColorStateList colorStateList = iconCompat.f1564g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f1079e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f1566i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f1079e.writeString(str);
        }
        String str2 = iconCompat.f1567j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f1079e.writeString(str2);
        }
    }
}
