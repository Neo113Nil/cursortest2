package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p.b;
import p.c;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        int i2 = iconCompat.f473a;
        if (bVar.e(1)) {
            i2 = ((c) bVar).f1125e.readInt();
        }
        iconCompat.f473a = i2;
        byte[] bArr = iconCompat.f475c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f1125e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f475c = bArr;
        iconCompat.f476d = bVar.f(iconCompat.f476d, 3);
        int i3 = iconCompat.f477e;
        if (bVar.e(4)) {
            i3 = ((c) bVar).f1125e.readInt();
        }
        iconCompat.f477e = i3;
        int i4 = iconCompat.f478f;
        if (bVar.e(5)) {
            i4 = ((c) bVar).f1125e.readInt();
        }
        iconCompat.f478f = i4;
        iconCompat.f479g = (ColorStateList) bVar.f(iconCompat.f479g, 6);
        String str = iconCompat.f481i;
        if (bVar.e(7)) {
            str = ((c) bVar).f1125e.readString();
        }
        iconCompat.f481i = str;
        String str2 = iconCompat.f482j;
        if (bVar.e(8)) {
            str2 = ((c) bVar).f1125e.readString();
        }
        iconCompat.f482j = str2;
        iconCompat.f480h = PorterDuff.Mode.valueOf(iconCompat.f481i);
        switch (iconCompat.f473a) {
            case -1:
                Parcelable parcelable = iconCompat.f476d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f474b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f476d;
                if (parcelable2 != null) {
                    iconCompat.f474b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f475c;
                    iconCompat.f474b = bArr3;
                    iconCompat.f473a = 3;
                    iconCompat.f477e = 0;
                    iconCompat.f478f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f475c, Charset.forName("UTF-16"));
                iconCompat.f474b = str3;
                if (iconCompat.f473a == 2 && iconCompat.f482j == null) {
                    iconCompat.f482j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f474b = iconCompat.f475c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.f481i = iconCompat.f480h.name();
        switch (iconCompat.f473a) {
            case -1:
                iconCompat.f476d = (Parcelable) iconCompat.f474b;
                break;
            case 1:
            case 5:
                iconCompat.f476d = (Parcelable) iconCompat.f474b;
                break;
            case 2:
                iconCompat.f475c = ((String) iconCompat.f474b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f475c = (byte[]) iconCompat.f474b;
                break;
            case 4:
            case 6:
                iconCompat.f475c = iconCompat.f474b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f473a;
        if (-1 != i2) {
            bVar.h(1);
            ((c) bVar).f1125e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f475c;
        if (bArr != null) {
            bVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((c) bVar).f1125e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f476d;
        if (parcelable != null) {
            bVar.h(3);
            ((c) bVar).f1125e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f477e;
        if (i3 != 0) {
            bVar.h(4);
            ((c) bVar).f1125e.writeInt(i3);
        }
        int i4 = iconCompat.f478f;
        if (i4 != 0) {
            bVar.h(5);
            ((c) bVar).f1125e.writeInt(i4);
        }
        ColorStateList colorStateList = iconCompat.f479g;
        if (colorStateList != null) {
            bVar.h(6);
            ((c) bVar).f1125e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f481i;
        if (str != null) {
            bVar.h(7);
            ((c) bVar).f1125e.writeString(str);
        }
        String str2 = iconCompat.f482j;
        if (str2 != null) {
            bVar.h(8);
            ((c) bVar).f1125e.writeString(str2);
        }
    }
}
