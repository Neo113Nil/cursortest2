package r0;

import android.os.Bundle;
import r0.i;

/* loaded from: classes.dex */
public final class p3 extends c3 {

    /* renamed from: i, reason: collision with root package name */
    public static final i.a<p3> f20888i = new i.a() { // from class: r0.o3
        @Override // r0.i.a
        public final i a(Bundle bundle) {
            p3 e7;
            e7 = p3.e(bundle);
            return e7;
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private final boolean f20889g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f20890h;

    public p3() {
        this.f20889g = false;
        this.f20890h = false;
    }

    public p3(boolean z6) {
        this.f20889g = true;
        this.f20890h = z6;
    }

    private static String c(int i7) {
        return Integer.toString(i7, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p3 e(Bundle bundle) {
        o2.a.a(bundle.getInt(c(0), -1) == 3);
        return bundle.getBoolean(c(1), false) ? new p3(bundle.getBoolean(c(2), false)) : new p3();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj;
        return this.f20890h == p3Var.f20890h && this.f20889g == p3Var.f20889g;
    }

    public int hashCode() {
        return l4.i.b(Boolean.valueOf(this.f20889g), Boolean.valueOf(this.f20890h));
    }
}
