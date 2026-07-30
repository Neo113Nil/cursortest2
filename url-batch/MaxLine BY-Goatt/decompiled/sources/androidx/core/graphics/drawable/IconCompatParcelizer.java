package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.lh;
import defpackage.n43;
import defpackage.o43;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(n43 n43Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = n43Var.f(iconCompat.a, 1);
        byte[] bArr = iconCompat.c;
        if (n43Var.e(2)) {
            Parcel parcel = ((o43) n43Var).e;
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
        iconCompat.d = n43Var.g(iconCompat.d, 3);
        iconCompat.e = n43Var.f(iconCompat.e, 4);
        iconCompat.f = n43Var.f(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) n43Var.g(iconCompat.g, 6);
        String str = iconCompat.i;
        if (n43Var.e(7)) {
            str = ((o43) n43Var).e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.j;
        if (n43Var.e(8)) {
            str2 = ((o43) n43Var).e.readString();
        }
        iconCompat.j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                lh.e("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.c;
                iconCompat.b = bArr3;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str3;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, n43 n43Var) {
        n43Var.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            n43Var.j(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            n43Var.i(2);
            Parcel parcel = ((o43) n43Var).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            n43Var.i(3);
            ((o43) n43Var).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            n43Var.j(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            n43Var.j(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            n43Var.i(6);
            ((o43) n43Var).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            n43Var.i(7);
            ((o43) n43Var).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            n43Var.i(8);
            ((o43) n43Var).e.writeString(str2);
        }
    }
}
