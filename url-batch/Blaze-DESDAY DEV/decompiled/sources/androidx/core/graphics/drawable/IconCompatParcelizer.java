package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import n0.AbstractC0281a;
import n0.b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0281a abstractC0281a) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f1443a;
        if (abstractC0281a.e(1)) {
            i = ((b) abstractC0281a).f3238e.readInt();
        }
        iconCompat.f1443a = i;
        byte[] bArr = iconCompat.f1445c;
        if (abstractC0281a.e(2)) {
            Parcel parcel = ((b) abstractC0281a).f3238e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1445c = bArr;
        iconCompat.d = abstractC0281a.f(iconCompat.d, 3);
        int i2 = iconCompat.f1446e;
        if (abstractC0281a.e(4)) {
            i2 = ((b) abstractC0281a).f3238e.readInt();
        }
        iconCompat.f1446e = i2;
        int i3 = iconCompat.f1447f;
        if (abstractC0281a.e(5)) {
            i3 = ((b) abstractC0281a).f3238e.readInt();
        }
        iconCompat.f1447f = i3;
        iconCompat.f1448g = (ColorStateList) abstractC0281a.f(iconCompat.f1448g, 6);
        String str = iconCompat.i;
        if (abstractC0281a.e(7)) {
            str = ((b) abstractC0281a).f3238e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f1449j;
        if (abstractC0281a.e(8)) {
            str2 = ((b) abstractC0281a).f3238e.readString();
        }
        iconCompat.f1449j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f1443a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1444b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.f1444b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1445c;
                    iconCompat.f1444b = bArr3;
                    iconCompat.f1443a = 3;
                    iconCompat.f1446e = 0;
                    iconCompat.f1447f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1445c, Charset.forName("UTF-16"));
                iconCompat.f1444b = str3;
                if (iconCompat.f1443a == 2 && iconCompat.f1449j == null) {
                    iconCompat.f1449j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1444b = iconCompat.f1445c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0281a abstractC0281a) {
        abstractC0281a.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f1443a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.f1444b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f1444b;
                break;
            case 2:
                iconCompat.f1445c = ((String) iconCompat.f1444b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1445c = (byte[]) iconCompat.f1444b;
                break;
            case 4:
            case 6:
                iconCompat.f1445c = iconCompat.f1444b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1443a;
        if (-1 != i) {
            abstractC0281a.h(1);
            ((b) abstractC0281a).f3238e.writeInt(i);
        }
        byte[] bArr = iconCompat.f1445c;
        if (bArr != null) {
            abstractC0281a.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) abstractC0281a).f3238e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            abstractC0281a.h(3);
            ((b) abstractC0281a).f3238e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f1446e;
        if (i2 != 0) {
            abstractC0281a.h(4);
            ((b) abstractC0281a).f3238e.writeInt(i2);
        }
        int i3 = iconCompat.f1447f;
        if (i3 != 0) {
            abstractC0281a.h(5);
            ((b) abstractC0281a).f3238e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f1448g;
        if (colorStateList != null) {
            abstractC0281a.h(6);
            ((b) abstractC0281a).f3238e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC0281a.h(7);
            ((b) abstractC0281a).f3238e.writeString(str);
        }
        String str2 = iconCompat.f1449j;
        if (str2 != null) {
            abstractC0281a.h(8);
            ((b) abstractC0281a).f3238e.writeString(str2);
        }
    }
}
