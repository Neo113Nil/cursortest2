package C0;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f91a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f92b;

    public d(I.g gVar, boolean z2) {
        this.f92b = gVar;
        this.f91a = z2;
    }

    public boolean a() {
        return this.f91a;
    }

    public boolean b(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        if (((I.g) this.f92b) == null) {
            return a();
        }
        char c2 = 2;
        for (int i2 = 0; i2 < i && c2 == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            d dVar = I.h.f539a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c2 = 2;
                            break;
                    }
                }
                c2 = 0;
            }
            c2 = 1;
        }
        if (c2 == 0) {
            return true;
        }
        if (c2 != 1) {
            return a();
        }
        return false;
    }

    public d(String str, boolean z2) {
        this.f91a = z2;
        this.f92b = str;
    }

    public d(BottomSheetBehavior bottomSheetBehavior, boolean z2) {
        this.f92b = bottomSheetBehavior;
        this.f91a = z2;
    }
}
