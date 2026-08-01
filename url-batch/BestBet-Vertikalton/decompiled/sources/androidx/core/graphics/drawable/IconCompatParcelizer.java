package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import r0.AbstractC0313a;
import r0.C0314b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0313a abstractC0313a) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f1816a;
        if (abstractC0313a.e(1)) {
            i = ((C0314b) abstractC0313a).f3828e.readInt();
        }
        iconCompat.f1816a = i;
        byte[] bArr = iconCompat.f1818c;
        if (abstractC0313a.e(2)) {
            Parcel parcel = ((C0314b) abstractC0313a).f3828e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1818c = bArr;
        iconCompat.d = abstractC0313a.f(iconCompat.d, 3);
        int i2 = iconCompat.f1819e;
        if (abstractC0313a.e(4)) {
            i2 = ((C0314b) abstractC0313a).f3828e.readInt();
        }
        iconCompat.f1819e = i2;
        int i3 = iconCompat.f1820f;
        if (abstractC0313a.e(5)) {
            i3 = ((C0314b) abstractC0313a).f3828e.readInt();
        }
        iconCompat.f1820f = i3;
        iconCompat.f1821g = (ColorStateList) abstractC0313a.f(iconCompat.f1821g, 6);
        String str = iconCompat.i;
        if (abstractC0313a.e(7)) {
            str = ((C0314b) abstractC0313a).f3828e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f1822j;
        if (abstractC0313a.e(8)) {
            str2 = ((C0314b) abstractC0313a).f3828e.readString();
        }
        iconCompat.f1822j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f1816a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1817b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.f1817b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1818c;
                    iconCompat.f1817b = bArr3;
                    iconCompat.f1816a = 3;
                    iconCompat.f1819e = 0;
                    iconCompat.f1820f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1818c, Charset.forName("UTF-16"));
                iconCompat.f1817b = str3;
                if (iconCompat.f1816a == 2 && iconCompat.f1822j == null) {
                    iconCompat.f1822j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1817b = iconCompat.f1818c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0313a abstractC0313a) {
        abstractC0313a.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f1816a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.f1817b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f1817b;
                break;
            case 2:
                iconCompat.f1818c = ((String) iconCompat.f1817b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1818c = (byte[]) iconCompat.f1817b;
                break;
            case 4:
            case 6:
                iconCompat.f1818c = iconCompat.f1817b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1816a;
        if (-1 != i) {
            abstractC0313a.h(1);
            ((C0314b) abstractC0313a).f3828e.writeInt(i);
        }
        byte[] bArr = iconCompat.f1818c;
        if (bArr != null) {
            abstractC0313a.h(2);
            int length = bArr.length;
            Parcel parcel = ((C0314b) abstractC0313a).f3828e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            abstractC0313a.h(3);
            ((C0314b) abstractC0313a).f3828e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f1819e;
        if (i2 != 0) {
            abstractC0313a.h(4);
            ((C0314b) abstractC0313a).f3828e.writeInt(i2);
        }
        int i3 = iconCompat.f1820f;
        if (i3 != 0) {
            abstractC0313a.h(5);
            ((C0314b) abstractC0313a).f3828e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f1821g;
        if (colorStateList != null) {
            abstractC0313a.h(6);
            ((C0314b) abstractC0313a).f3828e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC0313a.h(7);
            ((C0314b) abstractC0313a).f3828e.writeString(str);
        }
        String str2 = iconCompat.f1822j;
        if (str2 != null) {
            abstractC0313a.h(8);
            ((C0314b) abstractC0313a).f3828e.writeString(str2);
        }
    }
}
