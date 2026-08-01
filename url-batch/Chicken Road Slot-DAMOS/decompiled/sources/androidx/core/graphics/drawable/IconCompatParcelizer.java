package androidx.core.graphics.drawable;

import a4.j;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p5.a;
import p5.b;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f477a = -1;
        byte[] bArr = null;
        iconCompat.f479c = null;
        iconCompat.f480d = null;
        iconCompat.f481e = 0;
        iconCompat.f482f = 0;
        iconCompat.g = null;
        iconCompat.f483h = IconCompat.f476k;
        iconCompat.f484i = null;
        iconCompat.f477a = !aVar.e(1) ? -1 : ((b) aVar).f7673e.readInt();
        byte[] bArr2 = iconCompat.f479c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f7673e;
            int readInt = parcel.readInt();
            if (readInt >= 0) {
                bArr = new byte[readInt];
                parcel.readByteArray(bArr);
            }
        } else {
            bArr = bArr2;
        }
        iconCompat.f479c = bArr;
        iconCompat.f480d = aVar.f(iconCompat.f480d, 3);
        int i3 = iconCompat.f481e;
        if (aVar.e(4)) {
            i3 = ((b) aVar).f7673e.readInt();
        }
        iconCompat.f481e = i3;
        int i10 = iconCompat.f482f;
        if (aVar.e(5)) {
            i10 = ((b) aVar).f7673e.readInt();
        }
        iconCompat.f482f = i10;
        iconCompat.g = (ColorStateList) aVar.f(iconCompat.g, 6);
        String str = iconCompat.f484i;
        if (aVar.e(7)) {
            str = ((b) aVar).f7673e.readString();
        }
        iconCompat.f484i = str;
        String str2 = iconCompat.j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f7673e.readString();
        }
        iconCompat.j = str2;
        iconCompat.f483h = PorterDuff.Mode.valueOf(iconCompat.f484i);
        switch (iconCompat.f477a) {
            case -1:
                Parcelable parcelable = iconCompat.f480d;
                if (parcelable != null) {
                    iconCompat.f478b = parcelable;
                    return iconCompat;
                }
                a1.e("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case j.STRING_FIELD_NUMBER /* 5 */:
                Parcelable parcelable2 = iconCompat.f480d;
                if (parcelable2 != null) {
                    iconCompat.f478b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f479c;
                iconCompat.f478b = bArr3;
                iconCompat.f477a = 3;
                iconCompat.f481e = 0;
                iconCompat.f482f = bArr3.length;
                return iconCompat;
            case 2:
            case j.LONG_FIELD_NUMBER /* 4 */:
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                String str3 = new String(iconCompat.f479c, Charset.forName("UTF-16"));
                iconCompat.f478b = str3;
                if (iconCompat.f477a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f478b = iconCompat.f479c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f484i = iconCompat.f483h.name();
        switch (iconCompat.f477a) {
            case -1:
                iconCompat.f480d = (Parcelable) iconCompat.f478b;
                break;
            case 1:
            case j.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.f480d = (Parcelable) iconCompat.f478b;
                break;
            case 2:
                iconCompat.f479c = ((String) iconCompat.f478b).getBytes(Charset.forName("UTF-16"));
                break;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f479c = (byte[]) iconCompat.f478b;
                break;
            case j.LONG_FIELD_NUMBER /* 4 */:
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.f479c = iconCompat.f478b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i3 = iconCompat.f477a;
        if (-1 != i3) {
            aVar.h(1);
            ((b) aVar).f7673e.writeInt(i3);
        }
        byte[] bArr = iconCompat.f479c;
        if (bArr != null) {
            aVar.h(2);
            Parcel parcel = ((b) aVar).f7673e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f480d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f7673e.writeParcelable(parcelable, 0);
        }
        int i10 = iconCompat.f481e;
        if (i10 != 0) {
            aVar.h(4);
            ((b) aVar).f7673e.writeInt(i10);
        }
        int i11 = iconCompat.f482f;
        if (i11 != 0) {
            aVar.h(5);
            ((b) aVar).f7673e.writeInt(i11);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f7673e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f484i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f7673e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f7673e.writeString(str2);
        }
    }
}
