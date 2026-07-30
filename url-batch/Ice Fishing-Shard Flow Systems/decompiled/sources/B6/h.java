package B6;

import A6.AbstractC0091c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends O6.g {

    /* renamed from: a, reason: collision with root package name */
    public final v f223a;

    public h(v lexer, AbstractC0091c json) {
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f223a = lexer;
        json.getClass();
    }

    @Override // O6.g, y6.b
    public final long a() {
        v vVar = this.f223a;
        String j = vVar.j();
        try {
            return kotlin.text.u.d(j);
        } catch (IllegalArgumentException unused) {
            v.m(vVar, C4.p.i("Failed to parse type 'ULong' for input '", j, '\''), 0, 6);
            throw null;
        }
    }

    @Override // y6.a
    public final int o(x6.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // O6.g, y6.b
    public final int p() {
        v vVar = this.f223a;
        String j = vVar.j();
        try {
            return kotlin.text.u.b(j);
        } catch (IllegalArgumentException unused) {
            v.m(vVar, C4.p.i("Failed to parse type 'UInt' for input '", j, '\''), 0, 6);
            throw null;
        }
    }

    @Override // O6.g, y6.b
    public final byte q() {
        v vVar = this.f223a;
        String j = vVar.j();
        try {
            return kotlin.text.u.a(j);
        } catch (IllegalArgumentException unused) {
            v.m(vVar, C4.p.i("Failed to parse type 'UByte' for input '", j, '\''), 0, 6);
            throw null;
        }
    }

    @Override // O6.g, y6.b
    public final short u() {
        v vVar = this.f223a;
        String j = vVar.j();
        try {
            return kotlin.text.u.f(j);
        } catch (IllegalArgumentException unused) {
            v.m(vVar, C4.p.i("Failed to parse type 'UShort' for input '", j, '\''), 0, 6);
            throw null;
        }
    }
}
