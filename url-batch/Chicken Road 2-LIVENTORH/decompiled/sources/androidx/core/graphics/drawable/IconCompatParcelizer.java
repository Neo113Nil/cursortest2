package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import l1.a;
import l1.b;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f283a;
        if (aVar.e(1)) {
            i = ((b) aVar).f2549e.readInt();
        }
        iconCompat.f283a = i;
        byte[] bArr = iconCompat.f285c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f2549e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f285c = bArr;
        iconCompat.d = aVar.f(iconCompat.d, 3);
        int i4 = iconCompat.f286e;
        if (aVar.e(4)) {
            i4 = ((b) aVar).f2549e.readInt();
        }
        iconCompat.f286e = i4;
        int i5 = iconCompat.f287f;
        if (aVar.e(5)) {
            i5 = ((b) aVar).f2549e.readInt();
        }
        iconCompat.f287f = i5;
        iconCompat.f288g = (ColorStateList) aVar.f(iconCompat.f288g, 6);
        String str = iconCompat.i;
        if (aVar.e(7)) {
            str = ((b) aVar).f2549e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f290j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f2549e.readString();
        }
        iconCompat.f290j = str2;
        iconCompat.f289h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f283a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f284b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.f284b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f285c;
                iconCompat.f284b = bArr3;
                iconCompat.f283a = 3;
                iconCompat.f286e = 0;
                iconCompat.f287f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f285c, Charset.forName("UTF-16"));
                iconCompat.f284b = str3;
                if (iconCompat.f283a == 2 && iconCompat.f290j == null) {
                    iconCompat.f290j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f284b = iconCompat.f285c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.i = iconCompat.f289h.name();
        switch (iconCompat.f283a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.f284b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f284b;
                break;
            case 2:
                iconCompat.f285c = ((String) iconCompat.f284b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f285c = (byte[]) iconCompat.f284b;
                break;
            case 4:
            case 6:
                iconCompat.f285c = iconCompat.f284b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f283a;
        if (-1 != i) {
            aVar.h(1);
            ((b) aVar).f2549e.writeInt(i);
        }
        byte[] bArr = iconCompat.f285c;
        if (bArr != null) {
            aVar.h(2);
            Parcel parcel = ((b) aVar).f2549e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f2549e.writeParcelable(parcelable, 0);
        }
        int i4 = iconCompat.f286e;
        if (i4 != 0) {
            aVar.h(4);
            ((b) aVar).f2549e.writeInt(i4);
        }
        int i5 = iconCompat.f287f;
        if (i5 != 0) {
            aVar.h(5);
            ((b) aVar).f2549e.writeInt(i5);
        }
        ColorStateList colorStateList = iconCompat.f288g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f2549e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f2549e.writeString(str);
        }
        String str2 = iconCompat.f290j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f2549e.writeString(str2);
        }
    }
}
