package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.nl0;
import defpackage.ol0;
import defpackage.s9;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(nl0 nl0Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = -1;
        iconCompat.c = null;
        iconCompat.d = null;
        iconCompat.e = 0;
        iconCompat.f = 0;
        iconCompat.g = null;
        iconCompat.h = IconCompat.k;
        iconCompat.i = null;
        iconCompat.a = !nl0Var.e(1) ? -1 : ((ol0) nl0Var).e.readInt();
        byte[] bArr = iconCompat.c;
        if (nl0Var.e(2)) {
            Parcel parcel = ((ol0) nl0Var).e;
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
        iconCompat.d = nl0Var.f(iconCompat.d, 3);
        int i = iconCompat.e;
        if (nl0Var.e(4)) {
            i = ((ol0) nl0Var).e.readInt();
        }
        iconCompat.e = i;
        int i2 = iconCompat.f;
        if (nl0Var.e(5)) {
            i2 = ((ol0) nl0Var).e.readInt();
        }
        iconCompat.f = i2;
        iconCompat.g = (ColorStateList) nl0Var.f(iconCompat.g, 6);
        String str = iconCompat.i;
        if (nl0Var.e(7)) {
            str = ((ol0) nl0Var).e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.j;
        if (nl0Var.e(8)) {
            str2 = ((ol0) nl0Var).e.readString();
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
                s9.k("Invalid icon");
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

    public static void write(IconCompat iconCompat, nl0 nl0Var) {
        nl0Var.getClass();
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
            nl0Var.h(1);
            ((ol0) nl0Var).e.writeInt(i);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            nl0Var.h(2);
            Parcel parcel = ((ol0) nl0Var).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            nl0Var.h(3);
            ((ol0) nl0Var).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            nl0Var.h(4);
            ((ol0) nl0Var).e.writeInt(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            nl0Var.h(5);
            ((ol0) nl0Var).e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            nl0Var.h(6);
            ((ol0) nl0Var).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            nl0Var.h(7);
            ((ol0) nl0Var).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            nl0Var.h(8);
            ((ol0) nl0Var).e.writeString(str2);
        }
    }
}
