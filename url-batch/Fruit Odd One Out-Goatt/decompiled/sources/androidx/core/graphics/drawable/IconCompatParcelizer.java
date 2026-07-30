package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import r.b;
import r.c;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f13a = -1;
        byte[] bArr = null;
        iconCompat.f15c = null;
        iconCompat.f16d = null;
        iconCompat.f17e = 0;
        iconCompat.f18f = 0;
        iconCompat.f19g = null;
        iconCompat.f20h = IconCompat.f12k;
        iconCompat.f21i = null;
        iconCompat.f13a = !bVar.e(1) ? -1 : ((c) bVar).f1135e.readInt();
        byte[] bArr2 = iconCompat.f15c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f1135e;
            int readInt = parcel.readInt();
            if (readInt >= 0) {
                bArr = new byte[readInt];
                parcel.readByteArray(bArr);
            }
        } else {
            bArr = bArr2;
        }
        iconCompat.f15c = bArr;
        iconCompat.f16d = bVar.f(iconCompat.f16d, 3);
        int i2 = iconCompat.f17e;
        if (bVar.e(4)) {
            i2 = ((c) bVar).f1135e.readInt();
        }
        iconCompat.f17e = i2;
        int i3 = iconCompat.f18f;
        if (bVar.e(5)) {
            i3 = ((c) bVar).f1135e.readInt();
        }
        iconCompat.f18f = i3;
        iconCompat.f19g = (ColorStateList) bVar.f(iconCompat.f19g, 6);
        String str = iconCompat.f21i;
        if (bVar.e(7)) {
            str = ((c) bVar).f1135e.readString();
        }
        iconCompat.f21i = str;
        String str2 = iconCompat.f22j;
        if (bVar.e(8)) {
            str2 = ((c) bVar).f1135e.readString();
        }
        iconCompat.f22j = str2;
        iconCompat.f20h = PorterDuff.Mode.valueOf(iconCompat.f21i);
        switch (iconCompat.f13a) {
            case -1:
                Parcelable parcelable = iconCompat.f16d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f14b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f16d;
                if (parcelable2 != null) {
                    iconCompat.f14b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f15c;
                iconCompat.f14b = bArr3;
                iconCompat.f13a = 3;
                iconCompat.f17e = 0;
                iconCompat.f18f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f15c, Charset.forName("UTF-16"));
                iconCompat.f14b = str3;
                if (iconCompat.f13a == 2 && iconCompat.f22j == null) {
                    iconCompat.f22j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f14b = iconCompat.f15c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.f21i = iconCompat.f20h.name();
        switch (iconCompat.f13a) {
            case -1:
                iconCompat.f16d = (Parcelable) iconCompat.f14b;
                break;
            case 1:
            case 5:
                iconCompat.f16d = (Parcelable) iconCompat.f14b;
                break;
            case 2:
                iconCompat.f15c = ((String) iconCompat.f14b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f15c = (byte[]) iconCompat.f14b;
                break;
            case 4:
            case 6:
                iconCompat.f15c = iconCompat.f14b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f13a;
        if (-1 != i2) {
            bVar.h(1);
            ((c) bVar).f1135e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f15c;
        if (bArr != null) {
            bVar.h(2);
            Parcel parcel = ((c) bVar).f1135e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f16d;
        if (parcelable != null) {
            bVar.h(3);
            ((c) bVar).f1135e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f17e;
        if (i3 != 0) {
            bVar.h(4);
            ((c) bVar).f1135e.writeInt(i3);
        }
        int i4 = iconCompat.f18f;
        if (i4 != 0) {
            bVar.h(5);
            ((c) bVar).f1135e.writeInt(i4);
        }
        ColorStateList colorStateList = iconCompat.f19g;
        if (colorStateList != null) {
            bVar.h(6);
            ((c) bVar).f1135e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f21i;
        if (str != null) {
            bVar.h(7);
            ((c) bVar).f1135e.writeString(str);
        }
        String str2 = iconCompat.f22j;
        if (str2 != null) {
            bVar.h(8);
            ((c) bVar).f1135e.writeString(str2);
        }
    }
}
