package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(androidx.versionedparcelable.a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f11780a = aVar.p(iconCompat.f11780a, 1);
        iconCompat.f11782c = aVar.j(iconCompat.f11782c, 2);
        iconCompat.f11783d = aVar.r(iconCompat.f11783d, 3);
        iconCompat.f11784e = aVar.p(iconCompat.f11784e, 4);
        iconCompat.f11785f = aVar.p(iconCompat.f11785f, 5);
        iconCompat.f11786g = (ColorStateList) aVar.r(iconCompat.f11786g, 6);
        iconCompat.f11788i = aVar.t(iconCompat.f11788i, 7);
        iconCompat.f11789j = aVar.t(iconCompat.f11789j, 8);
        iconCompat.j();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(true, true);
        iconCompat.k(aVar.f());
        int i4 = iconCompat.f11780a;
        if (-1 != i4) {
            aVar.F(i4, 1);
        }
        byte[] bArr = iconCompat.f11782c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f11783d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i5 = iconCompat.f11784e;
        if (i5 != 0) {
            aVar.F(i5, 4);
        }
        int i6 = iconCompat.f11785f;
        if (i6 != 0) {
            aVar.F(i6, 5);
        }
        ColorStateList colorStateList = iconCompat.f11786g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f11788i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f11789j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
