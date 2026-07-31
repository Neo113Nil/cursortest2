package androidx.core.graphics.drawable;

import A1.b;
import A1.c;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import h1.C0438i;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        int i3 = iconCompat.f3755a;
        if (bVar.e(1)) {
            i3 = ((c) bVar).f16e.readInt();
        }
        iconCompat.f3755a = i3;
        byte[] bArr = iconCompat.f3757c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f16e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f3757c = bArr;
        iconCompat.f3758d = bVar.f(iconCompat.f3758d, 3);
        int i4 = iconCompat.f3759e;
        if (bVar.e(4)) {
            i4 = ((c) bVar).f16e.readInt();
        }
        iconCompat.f3759e = i4;
        int i5 = iconCompat.f3760f;
        if (bVar.e(5)) {
            i5 = ((c) bVar).f16e.readInt();
        }
        iconCompat.f3760f = i5;
        iconCompat.f3761g = (ColorStateList) bVar.f(iconCompat.f3761g, 6);
        String str = iconCompat.f3763i;
        if (bVar.e(7)) {
            str = ((c) bVar).f16e.readString();
        }
        iconCompat.f3763i = str;
        String str2 = iconCompat.f3764j;
        if (bVar.e(8)) {
            str2 = ((c) bVar).f16e.readString();
        }
        iconCompat.f3764j = str2;
        iconCompat.f3762h = PorterDuff.Mode.valueOf(iconCompat.f3763i);
        switch (iconCompat.f3755a) {
            case -1:
                Parcelable parcelable = iconCompat.f3758d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f3756b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f3758d;
                if (parcelable2 != null) {
                    iconCompat.f3756b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f3757c;
                    iconCompat.f3756b = bArr3;
                    iconCompat.f3755a = 3;
                    iconCompat.f3759e = 0;
                    iconCompat.f3760f = bArr3.length;
                }
                return iconCompat;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
            case 6:
                String str3 = new String(iconCompat.f3757c, Charset.forName("UTF-16"));
                iconCompat.f3756b = str3;
                if (iconCompat.f3755a == 2 && iconCompat.f3764j == null) {
                    iconCompat.f3764j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f3756b = iconCompat.f3757c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.f3763i = iconCompat.f3762h.name();
        switch (iconCompat.f3755a) {
            case -1:
                iconCompat.f3758d = (Parcelable) iconCompat.f3756b;
                break;
            case 1:
            case 5:
                iconCompat.f3758d = (Parcelable) iconCompat.f3756b;
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                iconCompat.f3757c = ((String) iconCompat.f3756b).getBytes(Charset.forName("UTF-16"));
                break;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f3757c = (byte[]) iconCompat.f3756b;
                break;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
            case 6:
                iconCompat.f3757c = iconCompat.f3756b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i3 = iconCompat.f3755a;
        if (-1 != i3) {
            bVar.h(1);
            ((c) bVar).f16e.writeInt(i3);
        }
        byte[] bArr = iconCompat.f3757c;
        if (bArr != null) {
            bVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((c) bVar).f16e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f3758d;
        if (parcelable != null) {
            bVar.h(3);
            ((c) bVar).f16e.writeParcelable(parcelable, 0);
        }
        int i4 = iconCompat.f3759e;
        if (i4 != 0) {
            bVar.h(4);
            ((c) bVar).f16e.writeInt(i4);
        }
        int i5 = iconCompat.f3760f;
        if (i5 != 0) {
            bVar.h(5);
            ((c) bVar).f16e.writeInt(i5);
        }
        ColorStateList colorStateList = iconCompat.f3761g;
        if (colorStateList != null) {
            bVar.h(6);
            ((c) bVar).f16e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f3763i;
        if (str != null) {
            bVar.h(7);
            ((c) bVar).f16e.writeString(str);
        }
        String str2 = iconCompat.f3764j;
        if (str2 != null) {
            bVar.h(8);
            ((c) bVar).f16e.writeString(str2);
        }
    }
}
