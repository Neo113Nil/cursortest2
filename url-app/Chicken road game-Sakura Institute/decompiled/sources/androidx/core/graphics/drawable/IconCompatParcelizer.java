package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.charset.Charset;
import y1.AbstractC1320a;
import y1.b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC1320a abstractC1320a) {
        IconCompat iconCompat = new IconCompat();
        int i2 = iconCompat.f5229a;
        if (abstractC1320a.e(1)) {
            i2 = ((b) abstractC1320a).f11647e.readInt();
        }
        iconCompat.f5229a = i2;
        byte[] bArr = iconCompat.f5231c;
        if (abstractC1320a.e(2)) {
            Parcel parcel = ((b) abstractC1320a).f11647e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f5231c = bArr;
        iconCompat.f5232d = abstractC1320a.f(iconCompat.f5232d, 3);
        int i4 = iconCompat.f5233e;
        if (abstractC1320a.e(4)) {
            i4 = ((b) abstractC1320a).f11647e.readInt();
        }
        iconCompat.f5233e = i4;
        int i5 = iconCompat.f5234f;
        if (abstractC1320a.e(5)) {
            i5 = ((b) abstractC1320a).f11647e.readInt();
        }
        iconCompat.f5234f = i5;
        iconCompat.f5235g = (ColorStateList) abstractC1320a.f(iconCompat.f5235g, 6);
        String str = iconCompat.f5237i;
        if (abstractC1320a.e(7)) {
            str = ((b) abstractC1320a).f11647e.readString();
        }
        iconCompat.f5237i = str;
        String str2 = iconCompat.f5238j;
        if (abstractC1320a.e(8)) {
            str2 = ((b) abstractC1320a).f11647e.readString();
        }
        iconCompat.f5238j = str2;
        iconCompat.f5236h = PorterDuff.Mode.valueOf(iconCompat.f5237i);
        switch (iconCompat.f5229a) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                Parcelable parcelable = iconCompat.f5232d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f5230b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f5232d;
                if (parcelable2 != null) {
                    iconCompat.f5230b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f5231c;
                    iconCompat.f5230b = bArr3;
                    iconCompat.f5229a = 3;
                    iconCompat.f5233e = 0;
                    iconCompat.f5234f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f5231c, Charset.forName("UTF-16"));
                iconCompat.f5230b = str3;
                if (iconCompat.f5229a == 2 && iconCompat.f5238j == null) {
                    iconCompat.f5238j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f5230b = iconCompat.f5231c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC1320a abstractC1320a) {
        abstractC1320a.getClass();
        iconCompat.f5237i = iconCompat.f5236h.name();
        switch (iconCompat.f5229a) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                iconCompat.f5232d = (Parcelable) iconCompat.f5230b;
                break;
            case 1:
            case 5:
                iconCompat.f5232d = (Parcelable) iconCompat.f5230b;
                break;
            case 2:
                iconCompat.f5231c = ((String) iconCompat.f5230b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f5231c = (byte[]) iconCompat.f5230b;
                break;
            case 4:
            case 6:
                iconCompat.f5231c = iconCompat.f5230b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f5229a;
        if (-1 != i2) {
            abstractC1320a.h(1);
            ((b) abstractC1320a).f11647e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f5231c;
        if (bArr != null) {
            abstractC1320a.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) abstractC1320a).f11647e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f5232d;
        if (parcelable != null) {
            abstractC1320a.h(3);
            ((b) abstractC1320a).f11647e.writeParcelable(parcelable, 0);
        }
        int i4 = iconCompat.f5233e;
        if (i4 != 0) {
            abstractC1320a.h(4);
            ((b) abstractC1320a).f11647e.writeInt(i4);
        }
        int i5 = iconCompat.f5234f;
        if (i5 != 0) {
            abstractC1320a.h(5);
            ((b) abstractC1320a).f11647e.writeInt(i5);
        }
        ColorStateList colorStateList = iconCompat.f5235g;
        if (colorStateList != null) {
            abstractC1320a.h(6);
            ((b) abstractC1320a).f11647e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f5237i;
        if (str != null) {
            abstractC1320a.h(7);
            ((b) abstractC1320a).f11647e.writeString(str);
        }
        String str2 = iconCompat.f5238j;
        if (str2 != null) {
            abstractC1320a.h(8);
            ((b) abstractC1320a).f11647e.writeString(str2);
        }
    }
}
