package androidx.core.graphics.drawable;

import F0.b;
import F0.c;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f4804a;
        if (bVar.e(1)) {
            i = ((c) bVar).f945e.readInt();
        }
        iconCompat.f4804a = i;
        byte[] bArr = iconCompat.f4806c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f945e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f4806c = bArr;
        iconCompat.f4807d = bVar.f(iconCompat.f4807d, 3);
        int i4 = iconCompat.f4808e;
        if (bVar.e(4)) {
            i4 = ((c) bVar).f945e.readInt();
        }
        iconCompat.f4808e = i4;
        int i9 = iconCompat.f4809f;
        if (bVar.e(5)) {
            i9 = ((c) bVar).f945e.readInt();
        }
        iconCompat.f4809f = i9;
        iconCompat.f4810g = (ColorStateList) bVar.f(iconCompat.f4810g, 6);
        String str = iconCompat.i;
        if (bVar.e(7)) {
            str = ((c) bVar).f945e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f4812j;
        if (bVar.e(8)) {
            str2 = ((c) bVar).f945e.readString();
        }
        iconCompat.f4812j = str2;
        iconCompat.f4811h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f4804a) {
            case -1:
                Parcelable parcelable = iconCompat.f4807d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f4805b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f4807d;
                if (parcelable2 != null) {
                    iconCompat.f4805b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f4806c;
                iconCompat.f4805b = bArr3;
                iconCompat.f4804a = 3;
                iconCompat.f4808e = 0;
                iconCompat.f4809f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f4806c, Charset.forName(com.anythink.basead.exoplayer.b.f6547k));
                iconCompat.f4805b = str3;
                if (iconCompat.f4804a == 2 && iconCompat.f4812j == null) {
                    iconCompat.f4812j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f4805b = iconCompat.f4806c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.i = iconCompat.f4811h.name();
        switch (iconCompat.f4804a) {
            case -1:
                iconCompat.f4807d = (Parcelable) iconCompat.f4805b;
                break;
            case 1:
            case 5:
                iconCompat.f4807d = (Parcelable) iconCompat.f4805b;
                break;
            case 2:
                iconCompat.f4806c = ((String) iconCompat.f4805b).getBytes(Charset.forName(com.anythink.basead.exoplayer.b.f6547k));
                break;
            case 3:
                iconCompat.f4806c = (byte[]) iconCompat.f4805b;
                break;
            case 4:
            case 6:
                iconCompat.f4806c = iconCompat.f4805b.toString().getBytes(Charset.forName(com.anythink.basead.exoplayer.b.f6547k));
                break;
        }
        int i = iconCompat.f4804a;
        if (-1 != i) {
            bVar.h(1);
            ((c) bVar).f945e.writeInt(i);
        }
        byte[] bArr = iconCompat.f4806c;
        if (bArr != null) {
            bVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((c) bVar).f945e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f4807d;
        if (parcelable != null) {
            bVar.h(3);
            ((c) bVar).f945e.writeParcelable(parcelable, 0);
        }
        int i4 = iconCompat.f4808e;
        if (i4 != 0) {
            bVar.h(4);
            ((c) bVar).f945e.writeInt(i4);
        }
        int i9 = iconCompat.f4809f;
        if (i9 != 0) {
            bVar.h(5);
            ((c) bVar).f945e.writeInt(i9);
        }
        ColorStateList colorStateList = iconCompat.f4810g;
        if (colorStateList != null) {
            bVar.h(6);
            ((c) bVar).f945e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            bVar.h(7);
            ((c) bVar).f945e.writeString(str);
        }
        String str2 = iconCompat.f4812j;
        if (str2 != null) {
            bVar.h(8);
            ((c) bVar).f945e.writeString(str2);
        }
    }
}
