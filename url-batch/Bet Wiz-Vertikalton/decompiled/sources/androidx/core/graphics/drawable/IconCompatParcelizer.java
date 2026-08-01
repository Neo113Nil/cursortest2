package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import m0.AbstractC0274a;
import m0.b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0274a abstractC0274a) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f1398a;
        if (abstractC0274a.e(1)) {
            i = ((b) abstractC0274a).f3177e.readInt();
        }
        iconCompat.f1398a = i;
        byte[] bArr = iconCompat.f1400c;
        if (abstractC0274a.e(2)) {
            Parcel parcel = ((b) abstractC0274a).f3177e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1400c = bArr;
        iconCompat.d = abstractC0274a.f(iconCompat.d, 3);
        int i2 = iconCompat.f1401e;
        if (abstractC0274a.e(4)) {
            i2 = ((b) abstractC0274a).f3177e.readInt();
        }
        iconCompat.f1401e = i2;
        int i3 = iconCompat.f1402f;
        if (abstractC0274a.e(5)) {
            i3 = ((b) abstractC0274a).f3177e.readInt();
        }
        iconCompat.f1402f = i3;
        iconCompat.f1403g = (ColorStateList) abstractC0274a.f(iconCompat.f1403g, 6);
        String str = iconCompat.i;
        if (abstractC0274a.e(7)) {
            str = ((b) abstractC0274a).f3177e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f1404j;
        if (abstractC0274a.e(8)) {
            str2 = ((b) abstractC0274a).f3177e.readString();
        }
        iconCompat.f1404j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f1398a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1399b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.f1399b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1400c;
                    iconCompat.f1399b = bArr3;
                    iconCompat.f1398a = 3;
                    iconCompat.f1401e = 0;
                    iconCompat.f1402f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1400c, Charset.forName("UTF-16"));
                iconCompat.f1399b = str3;
                if (iconCompat.f1398a == 2 && iconCompat.f1404j == null) {
                    iconCompat.f1404j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1399b = iconCompat.f1400c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0274a abstractC0274a) {
        abstractC0274a.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f1398a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.f1399b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f1399b;
                break;
            case 2:
                iconCompat.f1400c = ((String) iconCompat.f1399b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1400c = (byte[]) iconCompat.f1399b;
                break;
            case 4:
            case 6:
                iconCompat.f1400c = iconCompat.f1399b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1398a;
        if (-1 != i) {
            abstractC0274a.h(1);
            ((b) abstractC0274a).f3177e.writeInt(i);
        }
        byte[] bArr = iconCompat.f1400c;
        if (bArr != null) {
            abstractC0274a.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) abstractC0274a).f3177e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            abstractC0274a.h(3);
            ((b) abstractC0274a).f3177e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f1401e;
        if (i2 != 0) {
            abstractC0274a.h(4);
            ((b) abstractC0274a).f3177e.writeInt(i2);
        }
        int i3 = iconCompat.f1402f;
        if (i3 != 0) {
            abstractC0274a.h(5);
            ((b) abstractC0274a).f3177e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f1403g;
        if (colorStateList != null) {
            abstractC0274a.h(6);
            ((b) abstractC0274a).f3177e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC0274a.h(7);
            ((b) abstractC0274a).f3177e.writeString(str);
        }
        String str2 = iconCompat.f1404j;
        if (str2 != null) {
            abstractC0274a.h(8);
            ((b) abstractC0274a).f3177e.writeString(str2);
        }
    }
}
