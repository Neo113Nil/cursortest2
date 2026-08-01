package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import o0.AbstractC0281a;
import o0.b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0281a abstractC0281a) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f1501a;
        if (abstractC0281a.e(1)) {
            i = ((b) abstractC0281a).f3410e.readInt();
        }
        iconCompat.f1501a = i;
        byte[] bArr = iconCompat.f1503c;
        if (abstractC0281a.e(2)) {
            Parcel parcel = ((b) abstractC0281a).f3410e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1503c = bArr;
        iconCompat.d = abstractC0281a.f(iconCompat.d, 3);
        int i2 = iconCompat.f1504e;
        if (abstractC0281a.e(4)) {
            i2 = ((b) abstractC0281a).f3410e.readInt();
        }
        iconCompat.f1504e = i2;
        int i3 = iconCompat.f1505f;
        if (abstractC0281a.e(5)) {
            i3 = ((b) abstractC0281a).f3410e.readInt();
        }
        iconCompat.f1505f = i3;
        iconCompat.f1506g = (ColorStateList) abstractC0281a.f(iconCompat.f1506g, 6);
        String str = iconCompat.i;
        if (abstractC0281a.e(7)) {
            str = ((b) abstractC0281a).f3410e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f1508j;
        if (abstractC0281a.e(8)) {
            str2 = ((b) abstractC0281a).f3410e.readString();
        }
        iconCompat.f1508j = str2;
        iconCompat.f1507h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f1501a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1502b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.f1502b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1503c;
                    iconCompat.f1502b = bArr3;
                    iconCompat.f1501a = 3;
                    iconCompat.f1504e = 0;
                    iconCompat.f1505f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1503c, Charset.forName("UTF-16"));
                iconCompat.f1502b = str3;
                if (iconCompat.f1501a == 2 && iconCompat.f1508j == null) {
                    iconCompat.f1508j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1502b = iconCompat.f1503c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0281a abstractC0281a) {
        abstractC0281a.getClass();
        iconCompat.i = iconCompat.f1507h.name();
        switch (iconCompat.f1501a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.f1502b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f1502b;
                break;
            case 2:
                iconCompat.f1503c = ((String) iconCompat.f1502b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1503c = (byte[]) iconCompat.f1502b;
                break;
            case 4:
            case 6:
                iconCompat.f1503c = iconCompat.f1502b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1501a;
        if (-1 != i) {
            abstractC0281a.h(1);
            ((b) abstractC0281a).f3410e.writeInt(i);
        }
        byte[] bArr = iconCompat.f1503c;
        if (bArr != null) {
            abstractC0281a.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) abstractC0281a).f3410e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            abstractC0281a.h(3);
            ((b) abstractC0281a).f3410e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f1504e;
        if (i2 != 0) {
            abstractC0281a.h(4);
            ((b) abstractC0281a).f3410e.writeInt(i2);
        }
        int i3 = iconCompat.f1505f;
        if (i3 != 0) {
            abstractC0281a.h(5);
            ((b) abstractC0281a).f3410e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f1506g;
        if (colorStateList != null) {
            abstractC0281a.h(6);
            ((b) abstractC0281a).f3410e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC0281a.h(7);
            ((b) abstractC0281a).f3410e.writeString(str);
        }
        String str2 = iconCompat.f1508j;
        if (str2 != null) {
            abstractC0281a.h(8);
            ((b) abstractC0281a).f3410e.writeString(str2);
        }
    }
}
