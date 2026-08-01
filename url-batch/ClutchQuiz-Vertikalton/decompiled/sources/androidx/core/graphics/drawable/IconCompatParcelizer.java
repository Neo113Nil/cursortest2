package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p0.AbstractC0310a;
import p0.C0311b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0310a abstractC0310a) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f1435a;
        if (abstractC0310a.e(1)) {
            i = ((C0311b) abstractC0310a).f3391e.readInt();
        }
        iconCompat.f1435a = i;
        byte[] bArr = iconCompat.f1437c;
        if (abstractC0310a.e(2)) {
            Parcel parcel = ((C0311b) abstractC0310a).f3391e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1437c = bArr;
        iconCompat.d = abstractC0310a.f(iconCompat.d, 3);
        int i2 = iconCompat.f1438e;
        if (abstractC0310a.e(4)) {
            i2 = ((C0311b) abstractC0310a).f3391e.readInt();
        }
        iconCompat.f1438e = i2;
        int i3 = iconCompat.f1439f;
        if (abstractC0310a.e(5)) {
            i3 = ((C0311b) abstractC0310a).f3391e.readInt();
        }
        iconCompat.f1439f = i3;
        iconCompat.f1440g = (ColorStateList) abstractC0310a.f(iconCompat.f1440g, 6);
        String str = iconCompat.i;
        if (abstractC0310a.e(7)) {
            str = ((C0311b) abstractC0310a).f3391e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f1441j;
        if (abstractC0310a.e(8)) {
            str2 = ((C0311b) abstractC0310a).f3391e.readString();
        }
        iconCompat.f1441j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f1435a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1436b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.f1436b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1437c;
                    iconCompat.f1436b = bArr3;
                    iconCompat.f1435a = 3;
                    iconCompat.f1438e = 0;
                    iconCompat.f1439f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1437c, Charset.forName("UTF-16"));
                iconCompat.f1436b = str3;
                if (iconCompat.f1435a == 2 && iconCompat.f1441j == null) {
                    iconCompat.f1441j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1436b = iconCompat.f1437c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0310a abstractC0310a) {
        abstractC0310a.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f1435a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.f1436b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f1436b;
                break;
            case 2:
                iconCompat.f1437c = ((String) iconCompat.f1436b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1437c = (byte[]) iconCompat.f1436b;
                break;
            case 4:
            case 6:
                iconCompat.f1437c = iconCompat.f1436b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1435a;
        if (-1 != i) {
            abstractC0310a.h(1);
            ((C0311b) abstractC0310a).f3391e.writeInt(i);
        }
        byte[] bArr = iconCompat.f1437c;
        if (bArr != null) {
            abstractC0310a.h(2);
            int length = bArr.length;
            Parcel parcel = ((C0311b) abstractC0310a).f3391e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            abstractC0310a.h(3);
            ((C0311b) abstractC0310a).f3391e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f1438e;
        if (i2 != 0) {
            abstractC0310a.h(4);
            ((C0311b) abstractC0310a).f3391e.writeInt(i2);
        }
        int i3 = iconCompat.f1439f;
        if (i3 != 0) {
            abstractC0310a.h(5);
            ((C0311b) abstractC0310a).f3391e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f1440g;
        if (colorStateList != null) {
            abstractC0310a.h(6);
            ((C0311b) abstractC0310a).f3391e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC0310a.h(7);
            ((C0311b) abstractC0310a).f3391e.writeString(str);
        }
        String str2 = iconCompat.f1441j;
        if (str2 != null) {
            abstractC0310a.h(8);
            ((C0311b) abstractC0310a).f3391e.writeString(str2);
        }
    }
}
