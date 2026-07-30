package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import d4.b;
import d4.c;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        int i7 = iconCompat.f756a;
        if (bVar.e(1)) {
            i7 = ((c) bVar).f2598e.readInt();
        }
        iconCompat.f756a = i7;
        byte[] bArr = iconCompat.f758c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f2598e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f758c = bArr;
        iconCompat.f759d = bVar.f(iconCompat.f759d, 3);
        int i8 = iconCompat.f760e;
        if (bVar.e(4)) {
            i8 = ((c) bVar).f2598e.readInt();
        }
        iconCompat.f760e = i8;
        int i9 = iconCompat.f761f;
        if (bVar.e(5)) {
            i9 = ((c) bVar).f2598e.readInt();
        }
        iconCompat.f761f = i9;
        iconCompat.f762g = (ColorStateList) bVar.f(iconCompat.f762g, 6);
        String str = iconCompat.f764i;
        if (bVar.e(7)) {
            str = ((c) bVar).f2598e.readString();
        }
        iconCompat.f764i = str;
        String str2 = iconCompat.f765j;
        if (bVar.e(8)) {
            str2 = ((c) bVar).f2598e.readString();
        }
        iconCompat.f765j = str2;
        iconCompat.f763h = PorterDuff.Mode.valueOf(iconCompat.f764i);
        switch (iconCompat.f756a) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                Parcelable parcelable = iconCompat.f759d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f757b = parcelable;
                return iconCompat;
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f759d;
                if (parcelable2 != null) {
                    iconCompat.f757b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f758c;
                iconCompat.f757b = bArr3;
                iconCompat.f756a = 3;
                iconCompat.f760e = 0;
                iconCompat.f761f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f758c, Charset.forName("UTF-16"));
                iconCompat.f757b = str3;
                if (iconCompat.f756a == 2 && iconCompat.f765j == null) {
                    iconCompat.f765j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f757b = iconCompat.f758c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.f764i = iconCompat.f763h.name();
        switch (iconCompat.f756a) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                iconCompat.f759d = (Parcelable) iconCompat.f757b;
                break;
            case 1:
            case 5:
                iconCompat.f759d = (Parcelable) iconCompat.f757b;
                break;
            case 2:
                iconCompat.f758c = ((String) iconCompat.f757b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f758c = (byte[]) iconCompat.f757b;
                break;
            case 4:
            case 6:
                iconCompat.f758c = iconCompat.f757b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i7 = iconCompat.f756a;
        if (-1 != i7) {
            bVar.h(1);
            ((c) bVar).f2598e.writeInt(i7);
        }
        byte[] bArr = iconCompat.f758c;
        if (bArr != null) {
            bVar.h(2);
            Parcel parcel = ((c) bVar).f2598e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f759d;
        if (parcelable != null) {
            bVar.h(3);
            ((c) bVar).f2598e.writeParcelable(parcelable, 0);
        }
        int i8 = iconCompat.f760e;
        if (i8 != 0) {
            bVar.h(4);
            ((c) bVar).f2598e.writeInt(i8);
        }
        int i9 = iconCompat.f761f;
        if (i9 != 0) {
            bVar.h(5);
            ((c) bVar).f2598e.writeInt(i9);
        }
        ColorStateList colorStateList = iconCompat.f762g;
        if (colorStateList != null) {
            bVar.h(6);
            ((c) bVar).f2598e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f764i;
        if (str != null) {
            bVar.h(7);
            ((c) bVar).f2598e.writeString(str);
        }
        String str2 = iconCompat.f765j;
        if (str2 != null) {
            bVar.h(8);
            ((c) bVar).f2598e.writeString(str2);
        }
    }
}
