package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import o0.AbstractC0252a;
import o0.C0253b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0252a abstractC0252a) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f1500a;
        if (abstractC0252a.e(1)) {
            i = ((C0253b) abstractC0252a).f3307e.readInt();
        }
        iconCompat.f1500a = i;
        byte[] bArr = iconCompat.f1502c;
        if (abstractC0252a.e(2)) {
            Parcel parcel = ((C0253b) abstractC0252a).f3307e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1502c = bArr;
        iconCompat.d = abstractC0252a.f(iconCompat.d, 3);
        int i2 = iconCompat.f1503e;
        if (abstractC0252a.e(4)) {
            i2 = ((C0253b) abstractC0252a).f3307e.readInt();
        }
        iconCompat.f1503e = i2;
        int i3 = iconCompat.f1504f;
        if (abstractC0252a.e(5)) {
            i3 = ((C0253b) abstractC0252a).f3307e.readInt();
        }
        iconCompat.f1504f = i3;
        iconCompat.f1505g = (ColorStateList) abstractC0252a.f(iconCompat.f1505g, 6);
        String str = iconCompat.i;
        if (abstractC0252a.e(7)) {
            str = ((C0253b) abstractC0252a).f3307e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f1506j;
        if (abstractC0252a.e(8)) {
            str2 = ((C0253b) abstractC0252a).f3307e.readString();
        }
        iconCompat.f1506j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f1500a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1501b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.f1501b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1502c;
                    iconCompat.f1501b = bArr3;
                    iconCompat.f1500a = 3;
                    iconCompat.f1503e = 0;
                    iconCompat.f1504f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1502c, Charset.forName("UTF-16"));
                iconCompat.f1501b = str3;
                if (iconCompat.f1500a == 2 && iconCompat.f1506j == null) {
                    iconCompat.f1506j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1501b = iconCompat.f1502c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0252a abstractC0252a) {
        abstractC0252a.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f1500a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.f1501b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f1501b;
                break;
            case 2:
                iconCompat.f1502c = ((String) iconCompat.f1501b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1502c = (byte[]) iconCompat.f1501b;
                break;
            case 4:
            case 6:
                iconCompat.f1502c = iconCompat.f1501b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1500a;
        if (-1 != i) {
            abstractC0252a.h(1);
            ((C0253b) abstractC0252a).f3307e.writeInt(i);
        }
        byte[] bArr = iconCompat.f1502c;
        if (bArr != null) {
            abstractC0252a.h(2);
            int length = bArr.length;
            Parcel parcel = ((C0253b) abstractC0252a).f3307e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            abstractC0252a.h(3);
            ((C0253b) abstractC0252a).f3307e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f1503e;
        if (i2 != 0) {
            abstractC0252a.h(4);
            ((C0253b) abstractC0252a).f3307e.writeInt(i2);
        }
        int i3 = iconCompat.f1504f;
        if (i3 != 0) {
            abstractC0252a.h(5);
            ((C0253b) abstractC0252a).f3307e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f1505g;
        if (colorStateList != null) {
            abstractC0252a.h(6);
            ((C0253b) abstractC0252a).f3307e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC0252a.h(7);
            ((C0253b) abstractC0252a).f3307e.writeString(str);
        }
        String str2 = iconCompat.f1506j;
        if (str2 != null) {
            abstractC0252a.h(8);
            ((C0253b) abstractC0252a).f3307e.writeString(str2);
        }
    }
}
