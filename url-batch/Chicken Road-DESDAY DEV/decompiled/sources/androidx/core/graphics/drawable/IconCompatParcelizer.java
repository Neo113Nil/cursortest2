package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import m0.AbstractC0275a;
import m0.b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0275a abstractC0275a) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f1353a;
        if (abstractC0275a.e(1)) {
            i = ((b) abstractC0275a).f3111e.readInt();
        }
        iconCompat.f1353a = i;
        byte[] bArr = iconCompat.f1355c;
        if (abstractC0275a.e(2)) {
            Parcel parcel = ((b) abstractC0275a).f3111e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1355c = bArr;
        iconCompat.d = abstractC0275a.f(iconCompat.d, 3);
        int i2 = iconCompat.f1356e;
        if (abstractC0275a.e(4)) {
            i2 = ((b) abstractC0275a).f3111e.readInt();
        }
        iconCompat.f1356e = i2;
        int i3 = iconCompat.f1357f;
        if (abstractC0275a.e(5)) {
            i3 = ((b) abstractC0275a).f3111e.readInt();
        }
        iconCompat.f1357f = i3;
        iconCompat.f1358g = (ColorStateList) abstractC0275a.f(iconCompat.f1358g, 6);
        String str = iconCompat.i;
        if (abstractC0275a.e(7)) {
            str = ((b) abstractC0275a).f3111e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f1359j;
        if (abstractC0275a.e(8)) {
            str2 = ((b) abstractC0275a).f3111e.readString();
        }
        iconCompat.f1359j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f1353a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1354b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.f1354b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1355c;
                    iconCompat.f1354b = bArr3;
                    iconCompat.f1353a = 3;
                    iconCompat.f1356e = 0;
                    iconCompat.f1357f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1355c, Charset.forName("UTF-16"));
                iconCompat.f1354b = str3;
                if (iconCompat.f1353a == 2 && iconCompat.f1359j == null) {
                    iconCompat.f1359j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1354b = iconCompat.f1355c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0275a abstractC0275a) {
        abstractC0275a.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f1353a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.f1354b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f1354b;
                break;
            case 2:
                iconCompat.f1355c = ((String) iconCompat.f1354b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1355c = (byte[]) iconCompat.f1354b;
                break;
            case 4:
            case 6:
                iconCompat.f1355c = iconCompat.f1354b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1353a;
        if (-1 != i) {
            abstractC0275a.h(1);
            ((b) abstractC0275a).f3111e.writeInt(i);
        }
        byte[] bArr = iconCompat.f1355c;
        if (bArr != null) {
            abstractC0275a.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) abstractC0275a).f3111e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            abstractC0275a.h(3);
            ((b) abstractC0275a).f3111e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f1356e;
        if (i2 != 0) {
            abstractC0275a.h(4);
            ((b) abstractC0275a).f3111e.writeInt(i2);
        }
        int i3 = iconCompat.f1357f;
        if (i3 != 0) {
            abstractC0275a.h(5);
            ((b) abstractC0275a).f3111e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f1358g;
        if (colorStateList != null) {
            abstractC0275a.h(6);
            ((b) abstractC0275a).f3111e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC0275a.h(7);
            ((b) abstractC0275a).f3111e.writeString(str);
        }
        String str2 = iconCompat.f1359j;
        if (str2 != null) {
            abstractC0275a.h(8);
            ((b) abstractC0275a).f3111e.writeString(str2);
        }
    }
}
