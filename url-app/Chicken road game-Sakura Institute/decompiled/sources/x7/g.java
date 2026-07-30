package x7;

import a8.m;
import f8.a0;
import f8.h;
import java.util.regex.Pattern;
import s7.n;
import s7.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g extends u {

    /* renamed from: f, reason: collision with root package name */
    public final String f9697f;

    /* renamed from: g, reason: collision with root package name */
    public final long f9698g;

    /* renamed from: h, reason: collision with root package name */
    public final a0 f9699h;

    public g(String str, long j8, a0 a0Var) {
        this.f9697f = str;
        this.f9698g = j8;
        this.f9699h = a0Var;
    }

    @Override // s7.u
    public final long b() {
        return this.f9698g;
    }

    @Override // s7.u
    public final n c() {
        String str = this.f9697f;
        if (str == null) {
            return null;
        }
        Pattern pattern = n.f8617c;
        try {
            return m.z(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // s7.u
    public final h k() {
        return this.f9699h;
    }
}
