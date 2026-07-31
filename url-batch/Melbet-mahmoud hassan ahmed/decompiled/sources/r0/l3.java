package r0;

import android.os.Bundle;
import r0.i;

/* loaded from: classes.dex */
public final class l3 extends c3 {

    /* renamed from: i, reason: collision with root package name */
    public static final i.a<l3> f20765i = new i.a() { // from class: r0.k3
        @Override // r0.i.a
        public final i a(Bundle bundle) {
            l3 e7;
            e7 = l3.e(bundle);
            return e7;
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private final int f20766g;

    /* renamed from: h, reason: collision with root package name */
    private final float f20767h;

    public l3(int i7) {
        o2.a.b(i7 > 0, "maxStars must be a positive integer");
        this.f20766g = i7;
        this.f20767h = -1.0f;
    }

    public l3(int i7, float f7) {
        o2.a.b(i7 > 0, "maxStars must be a positive integer");
        o2.a.b(f7 >= 0.0f && f7 <= ((float) i7), "starRating is out of range [0, maxStars]");
        this.f20766g = i7;
        this.f20767h = f7;
    }

    private static String c(int i7) {
        return Integer.toString(i7, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static l3 e(Bundle bundle) {
        o2.a.a(bundle.getInt(c(0), -1) == 2);
        int i7 = bundle.getInt(c(1), 5);
        float f7 = bundle.getFloat(c(2), -1.0f);
        return f7 == -1.0f ? new l3(i7) : new l3(i7, f7);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj;
        return this.f20766g == l3Var.f20766g && this.f20767h == l3Var.f20767h;
    }

    public int hashCode() {
        return l4.i.b(Integer.valueOf(this.f20766g), Float.valueOf(this.f20767h));
    }
}
