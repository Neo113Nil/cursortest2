package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.a;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f511a = aVar.v(iconCompat.f511a, 1);
        iconCompat.f513c = aVar.m(iconCompat.f513c, 2);
        iconCompat.f514d = aVar.A(iconCompat.f514d, 3);
        iconCompat.f515e = aVar.v(iconCompat.f515e, 4);
        iconCompat.f516f = aVar.v(iconCompat.f516f, 5);
        iconCompat.f517g = (ColorStateList) aVar.A(iconCompat.f517g, 6);
        iconCompat.f519i = aVar.E(iconCompat.f519i, 7);
        iconCompat.f520j = aVar.E(iconCompat.f520j, 8);
        iconCompat.c();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.K(true, true);
        iconCompat.d(aVar.g());
        int i7 = iconCompat.f511a;
        if (-1 != i7) {
            aVar.Y(i7, 1);
        }
        byte[] bArr = iconCompat.f513c;
        if (bArr != null) {
            aVar.Q(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f514d;
        if (parcelable != null) {
            aVar.d0(parcelable, 3);
        }
        int i8 = iconCompat.f515e;
        if (i8 != 0) {
            aVar.Y(i8, 4);
        }
        int i9 = iconCompat.f516f;
        if (i9 != 0) {
            aVar.Y(i9, 5);
        }
        ColorStateList colorStateList = iconCompat.f517g;
        if (colorStateList != null) {
            aVar.d0(colorStateList, 6);
        }
        String str = iconCompat.f519i;
        if (str != null) {
            aVar.h0(str, 7);
        }
        String str2 = iconCompat.f520j;
        if (str2 != null) {
            aVar.h0(str2, 8);
        }
    }
}
