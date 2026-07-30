package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import defpackage.bn1;
import defpackage.cn1;
import defpackage.dd0;
import defpackage.ry0;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(bn1 bn1Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = -1;
        iconCompat.c = null;
        iconCompat.d = null;
        iconCompat.e = 0;
        iconCompat.f = 0;
        iconCompat.g = null;
        iconCompat.h = IconCompat.k;
        iconCompat.i = null;
        iconCompat.a = !bn1Var.e(1) ? -1 : ((cn1) bn1Var).e.readInt();
        byte[] bArr = iconCompat.c;
        if (bn1Var.e(2)) {
            Parcel parcel = ((cn1) bn1Var).e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = bn1Var.f(iconCompat.d, 3);
        int i = iconCompat.e;
        if (bn1Var.e(4)) {
            i = ((cn1) bn1Var).e.readInt();
        }
        iconCompat.e = i;
        int i2 = iconCompat.f;
        if (bn1Var.e(5)) {
            i2 = ((cn1) bn1Var).e.readInt();
        }
        iconCompat.f = i2;
        iconCompat.g = (ColorStateList) bn1Var.f(iconCompat.g, 6);
        String str = iconCompat.i;
        if (bn1Var.e(7)) {
            str = ((cn1) bn1Var).e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.j;
        if (bn1Var.e(8)) {
            str2 = ((cn1) bn1Var).e.readString();
        }
        iconCompat.j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                dd0.e("Invalid icon");
                return null;
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            default:
                return iconCompat;
            case 1:
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.c;
                iconCompat.b = bArr3;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                String str3 = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str3;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, bn1 bn1Var) {
        bn1Var.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            bn1Var.h(1);
            ((cn1) bn1Var).e.writeInt(i);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            bn1Var.h(2);
            Parcel parcel = ((cn1) bn1Var).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            bn1Var.h(3);
            ((cn1) bn1Var).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            bn1Var.h(4);
            ((cn1) bn1Var).e.writeInt(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            bn1Var.h(5);
            ((cn1) bn1Var).e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            bn1Var.h(6);
            ((cn1) bn1Var).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            bn1Var.h(7);
            ((cn1) bn1Var).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            bn1Var.h(8);
            ((cn1) bn1Var).e.writeString(str2);
        }
    }
}
