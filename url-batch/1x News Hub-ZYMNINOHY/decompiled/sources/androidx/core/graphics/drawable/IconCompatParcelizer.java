package androidx.core.graphics.drawable;

import Z.a;
import Z.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2174a = aVar.f(iconCompat.f2174a, 1);
        byte[] bArr = iconCompat.f2176c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f1909e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f2176c = bArr;
        iconCompat.f2177d = aVar.g(iconCompat.f2177d, 3);
        iconCompat.f2178e = aVar.f(iconCompat.f2178e, 4);
        iconCompat.f = aVar.f(iconCompat.f, 5);
        iconCompat.f2179g = (ColorStateList) aVar.g(iconCompat.f2179g, 6);
        String str = iconCompat.f2181i;
        if (aVar.e(7)) {
            str = ((b) aVar).f1909e.readString();
        }
        iconCompat.f2181i = str;
        String str2 = iconCompat.f2182j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f1909e.readString();
        }
        iconCompat.f2182j = str2;
        iconCompat.f2180h = PorterDuff.Mode.valueOf(iconCompat.f2181i);
        switch (iconCompat.f2174a) {
            case -1:
                Parcelable parcelable = iconCompat.f2177d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f2175b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f2177d;
                if (parcelable2 != null) {
                    iconCompat.f2175b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f2176c;
                iconCompat.f2175b = bArr3;
                iconCompat.f2174a = 3;
                iconCompat.f2178e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f2176c, Charset.forName(CharEncoding.UTF_16));
                iconCompat.f2175b = str3;
                if (iconCompat.f2174a == 2 && iconCompat.f2182j == null) {
                    iconCompat.f2182j = str3.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f2175b = iconCompat.f2176c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f2181i = iconCompat.f2180h.name();
        switch (iconCompat.f2174a) {
            case -1:
                iconCompat.f2177d = (Parcelable) iconCompat.f2175b;
                break;
            case 1:
            case 5:
                iconCompat.f2177d = (Parcelable) iconCompat.f2175b;
                break;
            case 2:
                iconCompat.f2176c = ((String) iconCompat.f2175b).getBytes(Charset.forName(CharEncoding.UTF_16));
                break;
            case 3:
                iconCompat.f2176c = (byte[]) iconCompat.f2175b;
                break;
            case 4:
            case 6:
                iconCompat.f2176c = iconCompat.f2175b.toString().getBytes(Charset.forName(CharEncoding.UTF_16));
                break;
        }
        int i3 = iconCompat.f2174a;
        if (-1 != i3) {
            aVar.j(i3, 1);
        }
        byte[] bArr = iconCompat.f2176c;
        if (bArr != null) {
            aVar.i(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f1909e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f2177d;
        if (parcelable != null) {
            aVar.i(3);
            ((b) aVar).f1909e.writeParcelable(parcelable, 0);
        }
        int i4 = iconCompat.f2178e;
        if (i4 != 0) {
            aVar.j(i4, 4);
        }
        int i5 = iconCompat.f;
        if (i5 != 0) {
            aVar.j(i5, 5);
        }
        ColorStateList colorStateList = iconCompat.f2179g;
        if (colorStateList != null) {
            aVar.i(6);
            ((b) aVar).f1909e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f2181i;
        if (str != null) {
            aVar.i(7);
            ((b) aVar).f1909e.writeString(str);
        }
        String str2 = iconCompat.f2182j;
        if (str2 != null) {
            aVar.i(8);
            ((b) aVar).f1909e.writeString(str2);
        }
    }
}
