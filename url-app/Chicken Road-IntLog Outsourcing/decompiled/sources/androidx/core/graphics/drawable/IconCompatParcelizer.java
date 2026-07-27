package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import h0.a;
import h0.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i2 = iconCompat.f4308a;
        if (aVar.e(1)) {
            i2 = ((b) aVar).f5764e.readInt();
        }
        iconCompat.f4308a = i2;
        byte[] bArr = iconCompat.f4310c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f5764e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f4310c = bArr;
        iconCompat.f4311d = aVar.f(iconCompat.f4311d, 3);
        int i3 = iconCompat.f4312e;
        if (aVar.e(4)) {
            i3 = ((b) aVar).f5764e.readInt();
        }
        iconCompat.f4312e = i3;
        int i6 = iconCompat.f4313f;
        if (aVar.e(5)) {
            i6 = ((b) aVar).f5764e.readInt();
        }
        iconCompat.f4313f = i6;
        iconCompat.f4314g = (ColorStateList) aVar.f(iconCompat.f4314g, 6);
        String str = iconCompat.f4316i;
        if (aVar.e(7)) {
            str = ((b) aVar).f5764e.readString();
        }
        iconCompat.f4316i = str;
        String str2 = iconCompat.f4317j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f5764e.readString();
        }
        iconCompat.f4317j = str2;
        iconCompat.f4315h = PorterDuff.Mode.valueOf(iconCompat.f4316i);
        switch (iconCompat.f4308a) {
            case -1:
                Parcelable parcelable = iconCompat.f4311d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f4309b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f4311d;
                if (parcelable2 != null) {
                    iconCompat.f4309b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f4310c;
                    iconCompat.f4309b = bArr3;
                    iconCompat.f4308a = 3;
                    iconCompat.f4312e = 0;
                    iconCompat.f4313f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f4310c, Charset.forName("UTF-16"));
                iconCompat.f4309b = str3;
                if (iconCompat.f4308a == 2 && iconCompat.f4317j == null) {
                    iconCompat.f4317j = str3.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f4309b = iconCompat.f4310c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f4316i = iconCompat.f4315h.name();
        switch (iconCompat.f4308a) {
            case -1:
                iconCompat.f4311d = (Parcelable) iconCompat.f4309b;
                break;
            case 1:
            case 5:
                iconCompat.f4311d = (Parcelable) iconCompat.f4309b;
                break;
            case 2:
                iconCompat.f4310c = ((String) iconCompat.f4309b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f4310c = (byte[]) iconCompat.f4309b;
                break;
            case 4:
            case 6:
                iconCompat.f4310c = iconCompat.f4309b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f4308a;
        if (-1 != i2) {
            aVar.h(1);
            ((b) aVar).f5764e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f4310c;
        if (bArr != null) {
            aVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f5764e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f4311d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f5764e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f4312e;
        if (i3 != 0) {
            aVar.h(4);
            ((b) aVar).f5764e.writeInt(i3);
        }
        int i6 = iconCompat.f4313f;
        if (i6 != 0) {
            aVar.h(5);
            ((b) aVar).f5764e.writeInt(i6);
        }
        ColorStateList colorStateList = iconCompat.f4314g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f5764e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f4316i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f5764e.writeString(str);
        }
        String str2 = iconCompat.f4317j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f5764e.writeString(str2);
        }
    }
}
