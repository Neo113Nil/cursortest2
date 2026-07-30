package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cq2;
import defpackage.dq2;
import defpackage.u9;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(cq2 cq2Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.PxuCJdSBwIXG = -1;
        iconCompat.TSizfFm2Yiuu = null;
        iconCompat.Y1f8riQaR6yg = null;
        iconCompat.e9gEMXR7LXtO = 0;
        iconCompat.a92UlCVFR9N8 = 0;
        iconCompat.RAsUl2FVSrh6 = null;
        iconCompat.rtx2ld2ELZv4 = IconCompat.dgRBjINgWbAK;
        iconCompat.OPXfSBeufaJ8 = null;
        iconCompat.PxuCJdSBwIXG = !cq2Var.e9gEMXR7LXtO(1) ? -1 : ((dq2) cq2Var).e9gEMXR7LXtO.readInt();
        byte[] bArr = iconCompat.TSizfFm2Yiuu;
        if (cq2Var.e9gEMXR7LXtO(2)) {
            Parcel parcel = ((dq2) cq2Var).e9gEMXR7LXtO;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.TSizfFm2Yiuu = bArr;
        iconCompat.Y1f8riQaR6yg = cq2Var.a92UlCVFR9N8(iconCompat.Y1f8riQaR6yg, 3);
        int i = iconCompat.e9gEMXR7LXtO;
        if (cq2Var.e9gEMXR7LXtO(4)) {
            i = ((dq2) cq2Var).e9gEMXR7LXtO.readInt();
        }
        iconCompat.e9gEMXR7LXtO = i;
        int i2 = iconCompat.a92UlCVFR9N8;
        if (cq2Var.e9gEMXR7LXtO(5)) {
            i2 = ((dq2) cq2Var).e9gEMXR7LXtO.readInt();
        }
        iconCompat.a92UlCVFR9N8 = i2;
        iconCompat.RAsUl2FVSrh6 = (ColorStateList) cq2Var.a92UlCVFR9N8(iconCompat.RAsUl2FVSrh6, 6);
        String str = iconCompat.OPXfSBeufaJ8;
        if (cq2Var.e9gEMXR7LXtO(7)) {
            str = ((dq2) cq2Var).e9gEMXR7LXtO.readString();
        }
        iconCompat.OPXfSBeufaJ8 = str;
        String str2 = iconCompat.wdg6QnbFHrFF;
        if (cq2Var.e9gEMXR7LXtO(8)) {
            str2 = ((dq2) cq2Var).e9gEMXR7LXtO.readString();
        }
        iconCompat.wdg6QnbFHrFF = str2;
        iconCompat.rtx2ld2ELZv4 = PorterDuff.Mode.valueOf(iconCompat.OPXfSBeufaJ8);
        switch (iconCompat.PxuCJdSBwIXG) {
            case -1:
                Parcelable parcelable = iconCompat.Y1f8riQaR6yg;
                if (parcelable != null) {
                    iconCompat.lS5Rgt96tfkO = parcelable;
                    return iconCompat;
                }
                u9.XL4ISE6Oc65B("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.Y1f8riQaR6yg;
                if (parcelable2 != null) {
                    iconCompat.lS5Rgt96tfkO = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.TSizfFm2Yiuu;
                iconCompat.lS5Rgt96tfkO = bArr3;
                iconCompat.PxuCJdSBwIXG = 3;
                iconCompat.e9gEMXR7LXtO = 0;
                iconCompat.a92UlCVFR9N8 = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.TSizfFm2Yiuu, Charset.forName("UTF-16"));
                iconCompat.lS5Rgt96tfkO = str3;
                if (iconCompat.PxuCJdSBwIXG == 2 && iconCompat.wdg6QnbFHrFF == null) {
                    iconCompat.wdg6QnbFHrFF = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.lS5Rgt96tfkO = iconCompat.TSizfFm2Yiuu;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, cq2 cq2Var) {
        cq2Var.getClass();
        iconCompat.OPXfSBeufaJ8 = iconCompat.rtx2ld2ELZv4.name();
        switch (iconCompat.PxuCJdSBwIXG) {
            case -1:
                iconCompat.Y1f8riQaR6yg = (Parcelable) iconCompat.lS5Rgt96tfkO;
                break;
            case 1:
            case 5:
                iconCompat.Y1f8riQaR6yg = (Parcelable) iconCompat.lS5Rgt96tfkO;
                break;
            case 2:
                iconCompat.TSizfFm2Yiuu = ((String) iconCompat.lS5Rgt96tfkO).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.TSizfFm2Yiuu = (byte[]) iconCompat.lS5Rgt96tfkO;
                break;
            case 4:
            case 6:
                iconCompat.TSizfFm2Yiuu = iconCompat.lS5Rgt96tfkO.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.PxuCJdSBwIXG;
        if (-1 != i) {
            cq2Var.rtx2ld2ELZv4(1);
            ((dq2) cq2Var).e9gEMXR7LXtO.writeInt(i);
        }
        byte[] bArr = iconCompat.TSizfFm2Yiuu;
        if (bArr != null) {
            cq2Var.rtx2ld2ELZv4(2);
            Parcel parcel = ((dq2) cq2Var).e9gEMXR7LXtO;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.Y1f8riQaR6yg;
        if (parcelable != null) {
            cq2Var.rtx2ld2ELZv4(3);
            ((dq2) cq2Var).e9gEMXR7LXtO.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e9gEMXR7LXtO;
        if (i2 != 0) {
            cq2Var.rtx2ld2ELZv4(4);
            ((dq2) cq2Var).e9gEMXR7LXtO.writeInt(i2);
        }
        int i3 = iconCompat.a92UlCVFR9N8;
        if (i3 != 0) {
            cq2Var.rtx2ld2ELZv4(5);
            ((dq2) cq2Var).e9gEMXR7LXtO.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.RAsUl2FVSrh6;
        if (colorStateList != null) {
            cq2Var.rtx2ld2ELZv4(6);
            ((dq2) cq2Var).e9gEMXR7LXtO.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.OPXfSBeufaJ8;
        if (str != null) {
            cq2Var.rtx2ld2ELZv4(7);
            ((dq2) cq2Var).e9gEMXR7LXtO.writeString(str);
        }
        String str2 = iconCompat.wdg6QnbFHrFF;
        if (str2 != null) {
            cq2Var.rtx2ld2ELZv4(8);
            ((dq2) cq2Var).e9gEMXR7LXtO.writeString(str2);
        }
    }
}
