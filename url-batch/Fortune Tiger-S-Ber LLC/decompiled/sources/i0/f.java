package i0;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2092a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2093b;

    public f(e eVar, boolean z3) {
        this.f2093b = eVar;
        this.f2092a = z3;
    }

    public boolean a() {
        return this.f2092a;
    }

    public boolean b(CharSequence charSequence, int i4) {
        if (charSequence == null || i4 < 0 || charSequence.length() - i4 < 0) {
            throw new IllegalArgumentException();
        }
        e eVar = (e) this.f2093b;
        if (eVar == null) {
            return a();
        }
        eVar.getClass();
        char c = 2;
        for (int i5 = 0; i5 < i4 && c == 2; i5++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i5));
            f fVar = g.f2094a;
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
                            c = 2;
                            break;
                    }
                }
                c = 0;
            }
            c = 1;
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return a();
        }
        return false;
    }

    public f(BottomSheetBehavior bottomSheetBehavior, boolean z3) {
        this.f2093b = bottomSheetBehavior;
        this.f2092a = z3;
    }
}
