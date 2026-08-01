package l0;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2631a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2632b;

    public f(e eVar, boolean z4) {
        this.f2632b = eVar;
        this.f2631a = z4;
    }

    public boolean a() {
        return this.f2631a;
    }

    public boolean b(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        e eVar = (e) this.f2632b;
        if (eVar == null) {
            return a();
        }
        eVar.getClass();
        char c5 = 2;
        for (int i4 = 0; i4 < i && c5 == 2; i4++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i4));
            f fVar = g.f2633a;
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
                            c5 = 2;
                            break;
                    }
                }
                c5 = 0;
            }
            c5 = 1;
        }
        if (c5 == 0) {
            return true;
        }
        if (c5 != 1) {
            return a();
        }
        return false;
    }

    public f(BottomSheetBehavior bottomSheetBehavior, boolean z4) {
        this.f2632b = bottomSheetBehavior;
        this.f2631a = z4;
    }
}
