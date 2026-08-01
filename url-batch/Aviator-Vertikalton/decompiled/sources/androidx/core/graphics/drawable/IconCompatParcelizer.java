package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import l0.AbstractC0300a;
import l0.b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0300a abstractC0300a) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f1154a;
        if (abstractC0300a.e(1)) {
            i = ((b) abstractC0300a).f3507e.readInt();
        }
        iconCompat.f1154a = i;
        byte[] bArr = iconCompat.f1156c;
        if (abstractC0300a.e(2)) {
            Parcel parcel = ((b) abstractC0300a).f3507e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1156c = bArr;
        iconCompat.f1157d = abstractC0300a.f(iconCompat.f1157d, 3);
        int i2 = iconCompat.f1158e;
        if (abstractC0300a.e(4)) {
            i2 = ((b) abstractC0300a).f3507e.readInt();
        }
        iconCompat.f1158e = i2;
        int i3 = iconCompat.f1159f;
        if (abstractC0300a.e(5)) {
            i3 = ((b) abstractC0300a).f3507e.readInt();
        }
        iconCompat.f1159f = i3;
        iconCompat.f1160g = (ColorStateList) abstractC0300a.f(iconCompat.f1160g, 6);
        String str = iconCompat.i;
        if (abstractC0300a.e(7)) {
            str = ((b) abstractC0300a).f3507e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f1161j;
        if (abstractC0300a.e(8)) {
            str2 = ((b) abstractC0300a).f3507e.readString();
        }
        iconCompat.f1161j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f1154a) {
            case -1:
                Parcelable parcelable = iconCompat.f1157d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1155b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1157d;
                if (parcelable2 != null) {
                    iconCompat.f1155b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1156c;
                    iconCompat.f1155b = bArr3;
                    iconCompat.f1154a = 3;
                    iconCompat.f1158e = 0;
                    iconCompat.f1159f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1156c, Charset.forName("UTF-16"));
                iconCompat.f1155b = str3;
                if (iconCompat.f1154a == 2 && iconCompat.f1161j == null) {
                    iconCompat.f1161j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1155b = iconCompat.f1156c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0300a abstractC0300a) {
        abstractC0300a.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f1154a) {
            case -1:
                iconCompat.f1157d = (Parcelable) iconCompat.f1155b;
                break;
            case 1:
            case 5:
                iconCompat.f1157d = (Parcelable) iconCompat.f1155b;
                break;
            case 2:
                iconCompat.f1156c = ((String) iconCompat.f1155b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1156c = (byte[]) iconCompat.f1155b;
                break;
            case 4:
            case 6:
                iconCompat.f1156c = iconCompat.f1155b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1154a;
        if (-1 != i) {
            abstractC0300a.h(1);
            ((b) abstractC0300a).f3507e.writeInt(i);
        }
        byte[] bArr = iconCompat.f1156c;
        if (bArr != null) {
            abstractC0300a.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) abstractC0300a).f3507e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1157d;
        if (parcelable != null) {
            abstractC0300a.h(3);
            ((b) abstractC0300a).f3507e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f1158e;
        if (i2 != 0) {
            abstractC0300a.h(4);
            ((b) abstractC0300a).f3507e.writeInt(i2);
        }
        int i3 = iconCompat.f1159f;
        if (i3 != 0) {
            abstractC0300a.h(5);
            ((b) abstractC0300a).f3507e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f1160g;
        if (colorStateList != null) {
            abstractC0300a.h(6);
            ((b) abstractC0300a).f3507e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC0300a.h(7);
            ((b) abstractC0300a).f3507e.writeString(str);
        }
        String str2 = iconCompat.f1161j;
        if (str2 != null) {
            abstractC0300a.h(8);
            ((b) abstractC0300a).f3507e.writeString(str2);
        }
    }
}
