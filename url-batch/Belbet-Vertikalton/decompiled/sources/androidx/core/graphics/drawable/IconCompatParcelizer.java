package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import r0.AbstractC0350a;
import r0.b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0350a abstractC0350a) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f1862a;
        if (abstractC0350a.e(1)) {
            i = ((b) abstractC0350a).e.readInt();
        }
        iconCompat.f1862a = i;
        byte[] bArr = iconCompat.f1864c;
        if (abstractC0350a.e(2)) {
            Parcel parcel = ((b) abstractC0350a).e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1864c = bArr;
        iconCompat.f1865d = abstractC0350a.f(iconCompat.f1865d, 3);
        int i2 = iconCompat.e;
        if (abstractC0350a.e(4)) {
            i2 = ((b) abstractC0350a).e.readInt();
        }
        iconCompat.e = i2;
        int i3 = iconCompat.f1866f;
        if (abstractC0350a.e(5)) {
            i3 = ((b) abstractC0350a).e.readInt();
        }
        iconCompat.f1866f = i3;
        iconCompat.f1867g = (ColorStateList) abstractC0350a.f(iconCompat.f1867g, 6);
        String str = iconCompat.i;
        if (abstractC0350a.e(7)) {
            str = ((b) abstractC0350a).e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.j;
        if (abstractC0350a.e(8)) {
            str2 = ((b) abstractC0350a).e.readString();
        }
        iconCompat.j = str2;
        iconCompat.f1868h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f1862a) {
            case -1:
                Parcelable parcelable = iconCompat.f1865d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1863b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1865d;
                if (parcelable2 != null) {
                    iconCompat.f1863b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1864c;
                    iconCompat.f1863b = bArr3;
                    iconCompat.f1862a = 3;
                    iconCompat.e = 0;
                    iconCompat.f1866f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1864c, Charset.forName("UTF-16"));
                iconCompat.f1863b = str3;
                if (iconCompat.f1862a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1863b = iconCompat.f1864c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0350a abstractC0350a) {
        abstractC0350a.getClass();
        iconCompat.i = iconCompat.f1868h.name();
        switch (iconCompat.f1862a) {
            case -1:
                iconCompat.f1865d = (Parcelable) iconCompat.f1863b;
                break;
            case 1:
            case 5:
                iconCompat.f1865d = (Parcelable) iconCompat.f1863b;
                break;
            case 2:
                iconCompat.f1864c = ((String) iconCompat.f1863b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1864c = (byte[]) iconCompat.f1863b;
                break;
            case 4:
            case 6:
                iconCompat.f1864c = iconCompat.f1863b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1862a;
        if (-1 != i) {
            abstractC0350a.h(1);
            ((b) abstractC0350a).e.writeInt(i);
        }
        byte[] bArr = iconCompat.f1864c;
        if (bArr != null) {
            abstractC0350a.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) abstractC0350a).e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1865d;
        if (parcelable != null) {
            abstractC0350a.h(3);
            ((b) abstractC0350a).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            abstractC0350a.h(4);
            ((b) abstractC0350a).e.writeInt(i2);
        }
        int i3 = iconCompat.f1866f;
        if (i3 != 0) {
            abstractC0350a.h(5);
            ((b) abstractC0350a).e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f1867g;
        if (colorStateList != null) {
            abstractC0350a.h(6);
            ((b) abstractC0350a).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC0350a.h(7);
            ((b) abstractC0350a).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            abstractC0350a.h(8);
            ((b) abstractC0350a).e.writeString(str2);
        }
    }
}
