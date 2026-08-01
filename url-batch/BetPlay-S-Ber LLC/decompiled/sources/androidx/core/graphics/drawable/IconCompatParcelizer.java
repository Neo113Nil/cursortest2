package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.m80;
import defpackage.n80;
import defpackage.o8;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(m80 m80Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = -1;
        iconCompat.c = null;
        iconCompat.d = null;
        iconCompat.e = 0;
        iconCompat.f = 0;
        iconCompat.g = null;
        iconCompat.h = IconCompat.k;
        iconCompat.i = null;
        iconCompat.a = !m80Var.e(1) ? -1 : ((n80) m80Var).e.readInt();
        byte[] bArr = iconCompat.c;
        if (m80Var.e(2)) {
            Parcel parcel = ((n80) m80Var).e;
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
        iconCompat.d = m80Var.f(iconCompat.d, 3);
        int i = iconCompat.e;
        if (m80Var.e(4)) {
            i = ((n80) m80Var).e.readInt();
        }
        iconCompat.e = i;
        int i2 = iconCompat.f;
        if (m80Var.e(5)) {
            i2 = ((n80) m80Var).e.readInt();
        }
        iconCompat.f = i2;
        iconCompat.g = (ColorStateList) m80Var.f(iconCompat.g, 6);
        String str = iconCompat.i;
        if (m80Var.e(7)) {
            str = ((n80) m80Var).e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.j;
        if (m80Var.e(8)) {
            str2 = ((n80) m80Var).e.readString();
        }
        iconCompat.j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                o8.j("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
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
            case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
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

    public static void write(IconCompat iconCompat, m80 m80Var) {
        m80Var.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            m80Var.h(1);
            ((n80) m80Var).e.writeInt(i);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            m80Var.h(2);
            Parcel parcel = ((n80) m80Var).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            m80Var.h(3);
            ((n80) m80Var).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            m80Var.h(4);
            ((n80) m80Var).e.writeInt(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            m80Var.h(5);
            ((n80) m80Var).e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            m80Var.h(6);
            ((n80) m80Var).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            m80Var.h(7);
            ((n80) m80Var).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            m80Var.h(8);
            ((n80) m80Var).e.writeString(str2);
        }
    }
}
