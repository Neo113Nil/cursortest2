package r0;

import android.os.Bundle;
import r0.i;

/* loaded from: classes.dex */
public final class v1 extends c3 {

    /* renamed from: i, reason: collision with root package name */
    public static final i.a<v1> f21055i = new i.a() { // from class: r0.u1
        @Override // r0.i.a
        public final i a(Bundle bundle) {
            v1 e7;
            e7 = v1.e(bundle);
            return e7;
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private final boolean f21056g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f21057h;

    public v1() {
        this.f21056g = false;
        this.f21057h = false;
    }

    public v1(boolean z6) {
        this.f21056g = true;
        this.f21057h = z6;
    }

    private static String c(int i7) {
        return Integer.toString(i7, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static v1 e(Bundle bundle) {
        o2.a.a(bundle.getInt(c(0), -1) == 0);
        return bundle.getBoolean(c(1), false) ? new v1(bundle.getBoolean(c(2), false)) : new v1();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return this.f21057h == v1Var.f21057h && this.f21056g == v1Var.f21056g;
    }

    public int hashCode() {
        return l4.i.b(Boolean.valueOf(this.f21056g), Boolean.valueOf(this.f21057h));
    }
}
