package n1;

import java.util.Arrays;
import m1.InterfaceC1275b;

/* renamed from: n1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1314a {

    /* renamed from: a, reason: collision with root package name */
    public final int f11358a;

    /* renamed from: b, reason: collision with root package name */
    public final m1.e f11359b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1275b f11360c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11361d;

    public C1314a(m1.e eVar, InterfaceC1275b interfaceC1275b, String str) {
        this.f11359b = eVar;
        this.f11360c = interfaceC1275b;
        this.f11361d = str;
        this.f11358a = Arrays.hashCode(new Object[]{eVar, interfaceC1275b, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1314a)) {
            return false;
        }
        C1314a c1314a = (C1314a) obj;
        return o1.u.j(this.f11359b, c1314a.f11359b) && o1.u.j(this.f11360c, c1314a.f11360c) && o1.u.j(this.f11361d, c1314a.f11361d);
    }

    public final int hashCode() {
        return this.f11358a;
    }
}
