package y3;

import g4.h;
import g4.p;
import java.util.regex.Pattern;
import t3.m;
import t3.u;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class g extends u {

    /* renamed from: f, reason: collision with root package name */
    public final String f4120f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4121g;
    public final p h;

    public g(String str, long j2, p pVar) {
        this.f4120f = str;
        this.f4121g = j2;
        this.h = pVar;
    }

    @Override // t3.u
    public final long m() {
        return this.f4121g;
    }

    @Override // t3.u
    public final m n() {
        String str = this.f4120f;
        if (str == null) {
            return null;
        }
        Pattern pattern = m.f3461c;
        try {
            return s.a.m(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // t3.u
    public final h o() {
        return this.h;
    }
}
