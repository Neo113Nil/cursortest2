package androidx.core.graphics.drawable;

import a0.AbstractC0220a;
import a0.C0221b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.onesignal.core.internal.permissions.h;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0220a abstractC0220a) {
        IconCompat iconCompat = new IconCompat();
        int i7 = iconCompat.f3407a;
        if (abstractC0220a.e(1)) {
            i7 = ((C0221b) abstractC0220a).f3117e.readInt();
        }
        iconCompat.f3407a = i7;
        byte[] bArr = iconCompat.f3409c;
        if (abstractC0220a.e(2)) {
            Parcel parcel = ((C0221b) abstractC0220a).f3117e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f3409c = bArr;
        iconCompat.f3410d = abstractC0220a.f(iconCompat.f3410d, 3);
        int i8 = iconCompat.f3411e;
        if (abstractC0220a.e(4)) {
            i8 = ((C0221b) abstractC0220a).f3117e.readInt();
        }
        iconCompat.f3411e = i8;
        int i9 = iconCompat.f3412f;
        if (abstractC0220a.e(5)) {
            i9 = ((C0221b) abstractC0220a).f3117e.readInt();
        }
        iconCompat.f3412f = i9;
        iconCompat.f3413g = (ColorStateList) abstractC0220a.f(iconCompat.f3413g, 6);
        String str = iconCompat.f3415i;
        if (abstractC0220a.e(7)) {
            str = ((C0221b) abstractC0220a).f3117e.readString();
        }
        iconCompat.f3415i = str;
        String str2 = iconCompat.f3416j;
        if (abstractC0220a.e(8)) {
            str2 = ((C0221b) abstractC0220a).f3117e.readString();
        }
        iconCompat.f3416j = str2;
        iconCompat.f3414h = PorterDuff.Mode.valueOf(iconCompat.f3415i);
        switch (iconCompat.f3407a) {
            case -1:
                Parcelable parcelable = iconCompat.f3410d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f3408b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
            case 5:
                Parcelable parcelable2 = iconCompat.f3410d;
                if (parcelable2 != null) {
                    iconCompat.f3408b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f3409c;
                iconCompat.f3408b = bArr3;
                iconCompat.f3407a = 3;
                iconCompat.f3411e = 0;
                iconCompat.f3412f = bArr3.length;
                return iconCompat;
            case h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f3409c, Charset.forName("UTF-16"));
                iconCompat.f3408b = str3;
                if (iconCompat.f3407a == 2 && iconCompat.f3416j == null) {
                    iconCompat.f3416j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f3408b = iconCompat.f3409c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0220a abstractC0220a) {
        abstractC0220a.getClass();
        iconCompat.f3415i = iconCompat.f3414h.name();
        switch (iconCompat.f3407a) {
            case -1:
                iconCompat.f3410d = (Parcelable) iconCompat.f3408b;
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
            case 5:
                iconCompat.f3410d = (Parcelable) iconCompat.f3408b;
                break;
            case h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                iconCompat.f3409c = ((String) iconCompat.f3408b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f3409c = (byte[]) iconCompat.f3408b;
                break;
            case 4:
            case 6:
                iconCompat.f3409c = iconCompat.f3408b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i7 = iconCompat.f3407a;
        if (-1 != i7) {
            abstractC0220a.h(1);
            ((C0221b) abstractC0220a).f3117e.writeInt(i7);
        }
        byte[] bArr = iconCompat.f3409c;
        if (bArr != null) {
            abstractC0220a.h(2);
            Parcel parcel = ((C0221b) abstractC0220a).f3117e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f3410d;
        if (parcelable != null) {
            abstractC0220a.h(3);
            ((C0221b) abstractC0220a).f3117e.writeParcelable(parcelable, 0);
        }
        int i8 = iconCompat.f3411e;
        if (i8 != 0) {
            abstractC0220a.h(4);
            ((C0221b) abstractC0220a).f3117e.writeInt(i8);
        }
        int i9 = iconCompat.f3412f;
        if (i9 != 0) {
            abstractC0220a.h(5);
            ((C0221b) abstractC0220a).f3117e.writeInt(i9);
        }
        ColorStateList colorStateList = iconCompat.f3413g;
        if (colorStateList != null) {
            abstractC0220a.h(6);
            ((C0221b) abstractC0220a).f3117e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f3415i;
        if (str != null) {
            abstractC0220a.h(7);
            ((C0221b) abstractC0220a).f3117e.writeString(str);
        }
        String str2 = iconCompat.f3416j;
        if (str2 != null) {
            abstractC0220a.h(8);
            ((C0221b) abstractC0220a).f3117e.writeString(str2);
        }
    }
}
