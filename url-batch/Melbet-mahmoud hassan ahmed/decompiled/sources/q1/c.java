package q1;

import j1.a;
import j1.h;
import java.nio.ByteBuffer;
import o2.a0;
import o2.i0;
import o2.z;

/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    private final a0 f20168a = new a0();

    /* renamed from: b, reason: collision with root package name */
    private final z f20169b = new z();

    /* renamed from: c, reason: collision with root package name */
    private i0 f20170c;

    @Override // j1.h
    protected j1.a b(j1.e eVar, ByteBuffer byteBuffer) {
        i0 i0Var = this.f20170c;
        if (i0Var == null || eVar.f18075n != i0Var.e()) {
            i0 i0Var2 = new i0(eVar.f22413j);
            this.f20170c = i0Var2;
            i0Var2.a(eVar.f22413j - eVar.f18075n);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f20168a.M(array, limit);
        this.f20169b.o(array, limit);
        this.f20169b.r(39);
        long h7 = (this.f20169b.h(1) << 32) | this.f20169b.h(32);
        this.f20169b.r(20);
        int h8 = this.f20169b.h(12);
        int h9 = this.f20169b.h(8);
        a.b bVar = null;
        this.f20168a.P(14);
        if (h9 == 0) {
            bVar = new e();
        } else if (h9 == 255) {
            bVar = a.a(this.f20168a, h8, h7);
        } else if (h9 == 4) {
            bVar = f.a(this.f20168a);
        } else if (h9 == 5) {
            bVar = d.a(this.f20168a, h7, this.f20170c);
        } else if (h9 == 6) {
            bVar = g.a(this.f20168a, h7, this.f20170c);
        }
        return bVar == null ? new j1.a(new a.b[0]) : new j1.a(bVar);
    }
}
