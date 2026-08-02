package s0;

import V0.l;
import Z.f;
import Z.g;
import Z.i;
import a.AbstractC0124a;
import java.nio.ByteBuffer;

/* renamed from: s0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1406b extends i implements V0.e {
    public final l n;

    public C1406b(l lVar) {
        super(new V0.i[2], new V0.c[2]);
        int i4 = this.f3795g;
        f[] fVarArr = this.f3793e;
        AbstractC0124a.t(i4 == fVarArr.length);
        for (f fVar : fVarArr) {
            fVar.j(1024);
        }
        this.n = lVar;
    }

    @Override // Z.i
    public final f f() {
        return new V0.i(1);
    }

    @Override // Z.i
    public final g g() {
        return new V0.c(this);
    }

    @Override // Z.i
    public final Z.d h(Throwable th) {
        return new V0.f("Unexpected decode error", th);
    }

    @Override // Z.i
    public final Z.d i(f fVar, g gVar, boolean z) {
        V0.i iVar = (V0.i) fVar;
        V0.c cVar = (V0.c) gVar;
        try {
            ByteBuffer byteBuffer = iVar.f3781e;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            l lVar = this.n;
            if (z) {
                lVar.reset();
            }
            V0.d a3 = lVar.a(array, 0, limit);
            long j4 = iVar.f3783g;
            long j5 = iVar.f3205j;
            cVar.f3786c = j4;
            cVar.f3189e = a3;
            if (j5 != Long.MAX_VALUE) {
                j4 = j5;
            }
            cVar.f3190f = j4;
            cVar.f3787d = false;
            return null;
        } catch (V0.f e4) {
            return e4;
        }
    }

    @Override // V0.e
    public final void b(long j4) {
    }
}
