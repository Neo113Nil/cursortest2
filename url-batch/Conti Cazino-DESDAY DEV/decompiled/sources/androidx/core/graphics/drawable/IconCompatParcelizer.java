package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import m0.AbstractC0276a;
import m0.b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0276a abstractC0276a) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f1292a;
        if (abstractC0276a.e(1)) {
            i = ((b) abstractC0276a).f3193e.readInt();
        }
        iconCompat.f1292a = i;
        byte[] bArr = iconCompat.f1294c;
        if (abstractC0276a.e(2)) {
            Parcel parcel = ((b) abstractC0276a).f3193e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1294c = bArr;
        iconCompat.d = abstractC0276a.f(iconCompat.d, 3);
        int i2 = iconCompat.f1295e;
        if (abstractC0276a.e(4)) {
            i2 = ((b) abstractC0276a).f3193e.readInt();
        }
        iconCompat.f1295e = i2;
        int i3 = iconCompat.f1296f;
        if (abstractC0276a.e(5)) {
            i3 = ((b) abstractC0276a).f3193e.readInt();
        }
        iconCompat.f1296f = i3;
        iconCompat.f1297g = (ColorStateList) abstractC0276a.f(iconCompat.f1297g, 6);
        String str = iconCompat.i;
        if (abstractC0276a.e(7)) {
            str = ((b) abstractC0276a).f3193e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f1298j;
        if (abstractC0276a.e(8)) {
            str2 = ((b) abstractC0276a).f3193e.readString();
        }
        iconCompat.f1298j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f1292a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1293b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.f1293b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1294c;
                    iconCompat.f1293b = bArr3;
                    iconCompat.f1292a = 3;
                    iconCompat.f1295e = 0;
                    iconCompat.f1296f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1294c, Charset.forName("UTF-16"));
                iconCompat.f1293b = str3;
                if (iconCompat.f1292a == 2 && iconCompat.f1298j == null) {
                    iconCompat.f1298j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1293b = iconCompat.f1294c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0276a abstractC0276a) {
        abstractC0276a.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f1292a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.f1293b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f1293b;
                break;
            case 2:
                iconCompat.f1294c = ((String) iconCompat.f1293b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1294c = (byte[]) iconCompat.f1293b;
                break;
            case 4:
            case 6:
                iconCompat.f1294c = iconCompat.f1293b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1292a;
        if (-1 != i) {
            abstractC0276a.h(1);
            ((b) abstractC0276a).f3193e.writeInt(i);
        }
        byte[] bArr = iconCompat.f1294c;
        if (bArr != null) {
            abstractC0276a.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) abstractC0276a).f3193e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            abstractC0276a.h(3);
            ((b) abstractC0276a).f3193e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f1295e;
        if (i2 != 0) {
            abstractC0276a.h(4);
            ((b) abstractC0276a).f3193e.writeInt(i2);
        }
        int i3 = iconCompat.f1296f;
        if (i3 != 0) {
            abstractC0276a.h(5);
            ((b) abstractC0276a).f3193e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f1297g;
        if (colorStateList != null) {
            abstractC0276a.h(6);
            ((b) abstractC0276a).f3193e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC0276a.h(7);
            ((b) abstractC0276a).f3193e.writeString(str);
        }
        String str2 = iconCompat.f1298j;
        if (str2 != null) {
            abstractC0276a.h(8);
            ((b) abstractC0276a).f3193e.writeString(str2);
        }
    }
}
