package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import m1.a;
import m1.b;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f407a;
        if (aVar.e(1)) {
            i = ((b) aVar).f2728e.readInt();
        }
        iconCompat.f407a = i;
        byte[] bArr = iconCompat.f409c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f2728e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f409c = bArr;
        iconCompat.d = aVar.f(iconCompat.d, 3);
        int i4 = iconCompat.f410e;
        if (aVar.e(4)) {
            i4 = ((b) aVar).f2728e.readInt();
        }
        iconCompat.f410e = i4;
        int i5 = iconCompat.f411f;
        if (aVar.e(5)) {
            i5 = ((b) aVar).f2728e.readInt();
        }
        iconCompat.f411f = i5;
        iconCompat.f412g = (ColorStateList) aVar.f(iconCompat.f412g, 6);
        String str = iconCompat.i;
        if (aVar.e(7)) {
            str = ((b) aVar).f2728e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f413j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f2728e.readString();
        }
        iconCompat.f413j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f407a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f408b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.f408b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f409c;
                iconCompat.f408b = bArr3;
                iconCompat.f407a = 3;
                iconCompat.f410e = 0;
                iconCompat.f411f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f409c, Charset.forName("UTF-16"));
                iconCompat.f408b = str3;
                if (iconCompat.f407a == 2 && iconCompat.f413j == null) {
                    iconCompat.f413j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f408b = iconCompat.f409c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f407a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.f408b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f408b;
                break;
            case 2:
                iconCompat.f409c = ((String) iconCompat.f408b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f409c = (byte[]) iconCompat.f408b;
                break;
            case 4:
            case 6:
                iconCompat.f409c = iconCompat.f408b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f407a;
        if (-1 != i) {
            aVar.h(1);
            ((b) aVar).f2728e.writeInt(i);
        }
        byte[] bArr = iconCompat.f409c;
        if (bArr != null) {
            aVar.h(2);
            Parcel parcel = ((b) aVar).f2728e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f2728e.writeParcelable(parcelable, 0);
        }
        int i4 = iconCompat.f410e;
        if (i4 != 0) {
            aVar.h(4);
            ((b) aVar).f2728e.writeInt(i4);
        }
        int i5 = iconCompat.f411f;
        if (i5 != 0) {
            aVar.h(5);
            ((b) aVar).f2728e.writeInt(i5);
        }
        ColorStateList colorStateList = iconCompat.f412g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f2728e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f2728e.writeString(str);
        }
        String str2 = iconCompat.f413j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f2728e.writeString(str2);
        }
    }
}
