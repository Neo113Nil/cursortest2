package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.luckyarcade.spinthrow.GameConfig;
import java.nio.charset.Charset;
import l0.AbstractC0302a;
import l0.b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0302a abstractC0302a) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f1155a;
        if (abstractC0302a.e(1)) {
            i = ((b) abstractC0302a).f3510e.readInt();
        }
        iconCompat.f1155a = i;
        byte[] bArr = iconCompat.f1157c;
        if (abstractC0302a.e(2)) {
            Parcel parcel = ((b) abstractC0302a).f3510e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1157c = bArr;
        iconCompat.f1158d = abstractC0302a.f(iconCompat.f1158d, 3);
        int i2 = iconCompat.f1159e;
        if (abstractC0302a.e(4)) {
            i2 = ((b) abstractC0302a).f3510e.readInt();
        }
        iconCompat.f1159e = i2;
        int i3 = iconCompat.f1160f;
        if (abstractC0302a.e(5)) {
            i3 = ((b) abstractC0302a).f3510e.readInt();
        }
        iconCompat.f1160f = i3;
        iconCompat.f1161g = (ColorStateList) abstractC0302a.f(iconCompat.f1161g, 6);
        String str = iconCompat.i;
        if (abstractC0302a.e(7)) {
            str = ((b) abstractC0302a).f3510e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f1162j;
        if (abstractC0302a.e(8)) {
            str2 = ((b) abstractC0302a).f3510e.readString();
        }
        iconCompat.f1162j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f1155a) {
            case -1:
                Parcelable parcelable = iconCompat.f1158d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1156b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1158d;
                if (parcelable2 != null) {
                    iconCompat.f1156b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1157c;
                    iconCompat.f1156b = bArr3;
                    iconCompat.f1155a = 3;
                    iconCompat.f1159e = 0;
                    iconCompat.f1160f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1157c, Charset.forName("UTF-16"));
                iconCompat.f1156b = str3;
                if (iconCompat.f1155a == 2 && iconCompat.f1162j == null) {
                    iconCompat.f1162j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case GameConfig.COMBO_EVERY /* 3 */:
                iconCompat.f1156b = iconCompat.f1157c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0302a abstractC0302a) {
        abstractC0302a.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f1155a) {
            case -1:
                iconCompat.f1158d = (Parcelable) iconCompat.f1156b;
                break;
            case 1:
            case 5:
                iconCompat.f1158d = (Parcelable) iconCompat.f1156b;
                break;
            case 2:
                iconCompat.f1157c = ((String) iconCompat.f1156b).getBytes(Charset.forName("UTF-16"));
                break;
            case GameConfig.COMBO_EVERY /* 3 */:
                iconCompat.f1157c = (byte[]) iconCompat.f1156b;
                break;
            case 4:
            case 6:
                iconCompat.f1157c = iconCompat.f1156b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1155a;
        if (-1 != i) {
            abstractC0302a.h(1);
            ((b) abstractC0302a).f3510e.writeInt(i);
        }
        byte[] bArr = iconCompat.f1157c;
        if (bArr != null) {
            abstractC0302a.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) abstractC0302a).f3510e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1158d;
        if (parcelable != null) {
            abstractC0302a.h(3);
            ((b) abstractC0302a).f3510e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f1159e;
        if (i2 != 0) {
            abstractC0302a.h(4);
            ((b) abstractC0302a).f3510e.writeInt(i2);
        }
        int i3 = iconCompat.f1160f;
        if (i3 != 0) {
            abstractC0302a.h(5);
            ((b) abstractC0302a).f3510e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f1161g;
        if (colorStateList != null) {
            abstractC0302a.h(6);
            ((b) abstractC0302a).f3510e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC0302a.h(7);
            ((b) abstractC0302a).f3510e.writeString(str);
        }
        String str2 = iconCompat.f1162j;
        if (str2 != null) {
            abstractC0302a.h(8);
            ((b) abstractC0302a).f3510e.writeString(str2);
        }
    }
}
