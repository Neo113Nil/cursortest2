package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import m0.AbstractC0253a;
import m0.C0254b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0253a abstractC0253a) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f1370a;
        if (abstractC0253a.e(1)) {
            i = ((C0254b) abstractC0253a).f3143e.readInt();
        }
        iconCompat.f1370a = i;
        byte[] bArr = iconCompat.f1372c;
        if (abstractC0253a.e(2)) {
            Parcel parcel = ((C0254b) abstractC0253a).f3143e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1372c = bArr;
        iconCompat.d = abstractC0253a.f(iconCompat.d, 3);
        int i2 = iconCompat.f1373e;
        if (abstractC0253a.e(4)) {
            i2 = ((C0254b) abstractC0253a).f3143e.readInt();
        }
        iconCompat.f1373e = i2;
        int i3 = iconCompat.f1374f;
        if (abstractC0253a.e(5)) {
            i3 = ((C0254b) abstractC0253a).f3143e.readInt();
        }
        iconCompat.f1374f = i3;
        iconCompat.f1375g = (ColorStateList) abstractC0253a.f(iconCompat.f1375g, 6);
        String str = iconCompat.i;
        if (abstractC0253a.e(7)) {
            str = ((C0254b) abstractC0253a).f3143e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f1376j;
        if (abstractC0253a.e(8)) {
            str2 = ((C0254b) abstractC0253a).f3143e.readString();
        }
        iconCompat.f1376j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f1370a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1371b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.f1371b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1372c;
                    iconCompat.f1371b = bArr3;
                    iconCompat.f1370a = 3;
                    iconCompat.f1373e = 0;
                    iconCompat.f1374f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1372c, Charset.forName("UTF-16"));
                iconCompat.f1371b = str3;
                if (iconCompat.f1370a == 2 && iconCompat.f1376j == null) {
                    iconCompat.f1376j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1371b = iconCompat.f1372c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0253a abstractC0253a) {
        abstractC0253a.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f1370a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.f1371b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f1371b;
                break;
            case 2:
                iconCompat.f1372c = ((String) iconCompat.f1371b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1372c = (byte[]) iconCompat.f1371b;
                break;
            case 4:
            case 6:
                iconCompat.f1372c = iconCompat.f1371b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1370a;
        if (-1 != i) {
            abstractC0253a.h(1);
            ((C0254b) abstractC0253a).f3143e.writeInt(i);
        }
        byte[] bArr = iconCompat.f1372c;
        if (bArr != null) {
            abstractC0253a.h(2);
            int length = bArr.length;
            Parcel parcel = ((C0254b) abstractC0253a).f3143e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            abstractC0253a.h(3);
            ((C0254b) abstractC0253a).f3143e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f1373e;
        if (i2 != 0) {
            abstractC0253a.h(4);
            ((C0254b) abstractC0253a).f3143e.writeInt(i2);
        }
        int i3 = iconCompat.f1374f;
        if (i3 != 0) {
            abstractC0253a.h(5);
            ((C0254b) abstractC0253a).f3143e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f1375g;
        if (colorStateList != null) {
            abstractC0253a.h(6);
            ((C0254b) abstractC0253a).f3143e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC0253a.h(7);
            ((C0254b) abstractC0253a).f3143e.writeString(str);
        }
        String str2 = iconCompat.f1376j;
        if (str2 != null) {
            abstractC0253a.h(8);
            ((C0254b) abstractC0253a).f3143e.writeString(str2);
        }
    }
}
