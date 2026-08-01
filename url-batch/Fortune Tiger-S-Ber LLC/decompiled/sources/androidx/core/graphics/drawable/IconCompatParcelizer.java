package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import h1.a;
import h1.b;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i4 = iconCompat.f298a;
        if (aVar.e(1)) {
            i4 = ((b) aVar).f2004e.readInt();
        }
        iconCompat.f298a = i4;
        byte[] bArr = iconCompat.c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f2004e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.f300d = aVar.f(iconCompat.f300d, 3);
        int i5 = iconCompat.f301e;
        if (aVar.e(4)) {
            i5 = ((b) aVar).f2004e.readInt();
        }
        iconCompat.f301e = i5;
        int i6 = iconCompat.f302f;
        if (aVar.e(5)) {
            i6 = ((b) aVar).f2004e.readInt();
        }
        iconCompat.f302f = i6;
        iconCompat.g = (ColorStateList) aVar.f(iconCompat.g, 6);
        String str = iconCompat.f303i;
        if (aVar.e(7)) {
            str = ((b) aVar).f2004e.readString();
        }
        iconCompat.f303i = str;
        String str2 = iconCompat.f304j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f2004e.readString();
        }
        iconCompat.f304j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.f303i);
        switch (iconCompat.f298a) {
            case -1:
                Parcelable parcelable = iconCompat.f300d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f299b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f300d;
                if (parcelable2 != null) {
                    iconCompat.f299b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.c;
                iconCompat.f299b = bArr3;
                iconCompat.f298a = 3;
                iconCompat.f301e = 0;
                iconCompat.f302f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.f299b = str3;
                if (iconCompat.f298a == 2 && iconCompat.f304j == null) {
                    iconCompat.f304j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f299b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f303i = iconCompat.h.name();
        switch (iconCompat.f298a) {
            case -1:
                iconCompat.f300d = (Parcelable) iconCompat.f299b;
                break;
            case 1:
            case 5:
                iconCompat.f300d = (Parcelable) iconCompat.f299b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.f299b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.f299b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.f299b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i4 = iconCompat.f298a;
        if (-1 != i4) {
            aVar.h(1);
            ((b) aVar).f2004e.writeInt(i4);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            aVar.h(2);
            Parcel parcel = ((b) aVar).f2004e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f300d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f2004e.writeParcelable(parcelable, 0);
        }
        int i5 = iconCompat.f301e;
        if (i5 != 0) {
            aVar.h(4);
            ((b) aVar).f2004e.writeInt(i5);
        }
        int i6 = iconCompat.f302f;
        if (i6 != 0) {
            aVar.h(5);
            ((b) aVar).f2004e.writeInt(i6);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f2004e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f303i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f2004e.writeString(str);
        }
        String str2 = iconCompat.f304j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f2004e.writeString(str2);
        }
    }
}
