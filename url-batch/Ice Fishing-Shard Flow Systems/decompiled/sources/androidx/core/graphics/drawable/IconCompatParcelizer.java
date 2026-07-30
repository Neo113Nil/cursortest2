package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import t0.AbstractC0902a;
import t0.C0903b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0902a abstractC0902a) {
        IconCompat iconCompat = new IconCompat();
        int i2 = iconCompat.f3368a;
        if (abstractC0902a.e(1)) {
            i2 = ((C0903b) abstractC0902a).f7888e.readInt();
        }
        iconCompat.f3368a = i2;
        byte[] bArr = iconCompat.f3370c;
        if (abstractC0902a.e(2)) {
            Parcel parcel = ((C0903b) abstractC0902a).f7888e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f3370c = bArr;
        iconCompat.f3371d = abstractC0902a.f(iconCompat.f3371d, 3);
        int i5 = iconCompat.f3372e;
        if (abstractC0902a.e(4)) {
            i5 = ((C0903b) abstractC0902a).f7888e.readInt();
        }
        iconCompat.f3372e = i5;
        int i7 = iconCompat.f3373f;
        if (abstractC0902a.e(5)) {
            i7 = ((C0903b) abstractC0902a).f7888e.readInt();
        }
        iconCompat.f3373f = i7;
        iconCompat.f3374g = (ColorStateList) abstractC0902a.f(iconCompat.f3374g, 6);
        String str = iconCompat.f3376i;
        if (abstractC0902a.e(7)) {
            str = ((C0903b) abstractC0902a).f7888e.readString();
        }
        iconCompat.f3376i = str;
        String str2 = iconCompat.j;
        if (abstractC0902a.e(8)) {
            str2 = ((C0903b) abstractC0902a).f7888e.readString();
        }
        iconCompat.j = str2;
        iconCompat.f3375h = PorterDuff.Mode.valueOf(iconCompat.f3376i);
        switch (iconCompat.f3368a) {
            case -1:
                Parcelable parcelable = iconCompat.f3371d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f3369b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f3371d;
                if (parcelable2 != null) {
                    iconCompat.f3369b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f3370c;
                iconCompat.f3369b = bArr3;
                iconCompat.f3368a = 3;
                iconCompat.f3372e = 0;
                iconCompat.f3373f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f3370c, Charset.forName("UTF-16"));
                iconCompat.f3369b = str3;
                if (iconCompat.f3368a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f3369b = iconCompat.f3370c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0902a abstractC0902a) {
        abstractC0902a.getClass();
        iconCompat.f3376i = iconCompat.f3375h.name();
        switch (iconCompat.f3368a) {
            case -1:
                iconCompat.f3371d = (Parcelable) iconCompat.f3369b;
                break;
            case 1:
            case 5:
                iconCompat.f3371d = (Parcelable) iconCompat.f3369b;
                break;
            case 2:
                iconCompat.f3370c = ((String) iconCompat.f3369b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f3370c = (byte[]) iconCompat.f3369b;
                break;
            case 4:
            case 6:
                iconCompat.f3370c = iconCompat.f3369b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f3368a;
        if (-1 != i2) {
            abstractC0902a.h(1);
            ((C0903b) abstractC0902a).f7888e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f3370c;
        if (bArr != null) {
            abstractC0902a.h(2);
            Parcel parcel = ((C0903b) abstractC0902a).f7888e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f3371d;
        if (parcelable != null) {
            abstractC0902a.h(3);
            ((C0903b) abstractC0902a).f7888e.writeParcelable(parcelable, 0);
        }
        int i5 = iconCompat.f3372e;
        if (i5 != 0) {
            abstractC0902a.h(4);
            ((C0903b) abstractC0902a).f7888e.writeInt(i5);
        }
        int i7 = iconCompat.f3373f;
        if (i7 != 0) {
            abstractC0902a.h(5);
            ((C0903b) abstractC0902a).f7888e.writeInt(i7);
        }
        ColorStateList colorStateList = iconCompat.f3374g;
        if (colorStateList != null) {
            abstractC0902a.h(6);
            ((C0903b) abstractC0902a).f7888e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f3376i;
        if (str != null) {
            abstractC0902a.h(7);
            ((C0903b) abstractC0902a).f7888e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            abstractC0902a.h(8);
            ((C0903b) abstractC0902a).f7888e.writeString(str2);
        }
    }
}
