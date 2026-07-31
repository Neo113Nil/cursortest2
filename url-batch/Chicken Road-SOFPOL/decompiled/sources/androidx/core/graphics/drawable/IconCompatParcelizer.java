package androidx.core.graphics.drawable;

import a4.i;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import e5.b;
import e5.c;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f614a;
        if (bVar.e(1)) {
            i = ((c) bVar).f2497e.readInt();
        }
        iconCompat.f614a = i;
        byte[] bArr = iconCompat.f616c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f2497e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f616c = bArr;
        iconCompat.f617d = bVar.f(iconCompat.f617d, 3);
        int i8 = iconCompat.f618e;
        if (bVar.e(4)) {
            i8 = ((c) bVar).f2497e.readInt();
        }
        iconCompat.f618e = i8;
        int i9 = iconCompat.f619f;
        if (bVar.e(5)) {
            i9 = ((c) bVar).f2497e.readInt();
        }
        iconCompat.f619f = i9;
        iconCompat.f620g = (ColorStateList) bVar.f(iconCompat.f620g, 6);
        String str = iconCompat.i;
        if (bVar.e(7)) {
            str = ((c) bVar).f2497e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f622j;
        if (bVar.e(8)) {
            str2 = ((c) bVar).f2497e.readString();
        }
        iconCompat.f622j = str2;
        iconCompat.f621h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f614a) {
            case -1:
                Parcelable parcelable = iconCompat.f617d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f615b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f617d;
                if (parcelable2 != null) {
                    iconCompat.f615b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f616c;
                iconCompat.f615b = bArr3;
                iconCompat.f614a = 3;
                iconCompat.f618e = 0;
                iconCompat.f619f = bArr3.length;
                return iconCompat;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
            case i.LONG_FIELD_NUMBER /* 4 */:
            case 6:
                String str3 = new String(iconCompat.f616c, Charset.forName("UTF-16"));
                iconCompat.f615b = str3;
                if (iconCompat.f614a == 2 && iconCompat.f622j == null) {
                    iconCompat.f622j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case i.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f615b = iconCompat.f616c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.i = iconCompat.f621h.name();
        switch (iconCompat.f614a) {
            case -1:
                iconCompat.f617d = (Parcelable) iconCompat.f615b;
                break;
            case 1:
            case 5:
                iconCompat.f617d = (Parcelable) iconCompat.f615b;
                break;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                iconCompat.f616c = ((String) iconCompat.f615b).getBytes(Charset.forName("UTF-16"));
                break;
            case i.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f616c = (byte[]) iconCompat.f615b;
                break;
            case i.LONG_FIELD_NUMBER /* 4 */:
            case 6:
                iconCompat.f616c = iconCompat.f615b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f614a;
        if (-1 != i) {
            bVar.h(1);
            ((c) bVar).f2497e.writeInt(i);
        }
        byte[] bArr = iconCompat.f616c;
        if (bArr != null) {
            bVar.h(2);
            Parcel parcel = ((c) bVar).f2497e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f617d;
        if (parcelable != null) {
            bVar.h(3);
            ((c) bVar).f2497e.writeParcelable(parcelable, 0);
        }
        int i8 = iconCompat.f618e;
        if (i8 != 0) {
            bVar.h(4);
            ((c) bVar).f2497e.writeInt(i8);
        }
        int i9 = iconCompat.f619f;
        if (i9 != 0) {
            bVar.h(5);
            ((c) bVar).f2497e.writeInt(i9);
        }
        ColorStateList colorStateList = iconCompat.f620g;
        if (colorStateList != null) {
            bVar.h(6);
            ((c) bVar).f2497e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            bVar.h(7);
            ((c) bVar).f2497e.writeString(str);
        }
        String str2 = iconCompat.f622j;
        if (str2 != null) {
            bVar.h(8);
            ((c) bVar).f2497e.writeString(str2);
        }
    }
}
