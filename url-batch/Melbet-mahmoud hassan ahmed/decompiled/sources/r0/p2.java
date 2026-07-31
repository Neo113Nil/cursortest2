package r0;

import android.os.Bundle;
import r0.i;

/* loaded from: classes.dex */
public final class p2 extends c3 {

    /* renamed from: h, reason: collision with root package name */
    public static final i.a<p2> f20886h = new i.a() { // from class: r0.o2
        @Override // r0.i.a
        public final i a(Bundle bundle) {
            p2 e7;
            e7 = p2.e(bundle);
            return e7;
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private final float f20887g;

    public p2() {
        this.f20887g = -1.0f;
    }

    public p2(float f7) {
        o2.a.b(f7 >= 0.0f && f7 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f20887g = f7;
    }

    private static String c(int i7) {
        return Integer.toString(i7, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p2 e(Bundle bundle) {
        o2.a.a(bundle.getInt(c(0), -1) == 1);
        float f7 = bundle.getFloat(c(1), -1.0f);
        return f7 == -1.0f ? new p2() : new p2(f7);
    }

    public boolean equals(Object obj) {
        return (obj instanceof p2) && this.f20887g == ((p2) obj).f20887g;
    }

    public int hashCode() {
        return l4.i.b(Float.valueOf(this.f20887g));
    }
}
