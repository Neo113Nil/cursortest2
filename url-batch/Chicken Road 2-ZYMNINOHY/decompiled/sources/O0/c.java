package O0;

import T.D;
import T.E;
import W.G;
import W.t;
import W.u;
import a2.i;
import i2.AbstractC0457a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends AbstractC0457a {

    /* renamed from: k, reason: collision with root package name */
    public final u f2005k = new u();

    /* renamed from: l, reason: collision with root package name */
    public final t f2006l = new t();

    /* renamed from: m, reason: collision with root package name */
    public G f2007m;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r5 != r7) goto L14;
     */
    @Override // i2.AbstractC0457a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final E n(H0.a aVar, ByteBuffer byteBuffer) {
        b dVar;
        long j4;
        u uVar = this.f2005k;
        t tVar = this.f2006l;
        G g4 = this.f2007m;
        if (g4 != null) {
            long j5 = aVar.f1083j;
            synchronized (g4) {
                long j6 = g4.f3259b;
            }
        }
        G g5 = new G(aVar.f3783g);
        this.f2007m = g5;
        g5.a(aVar.f3783g - aVar.f1083j);
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        uVar.K(limit, array);
        tVar.o(limit, array);
        tVar.t(39);
        long i4 = (tVar.i(1) << 32) | tVar.i(32);
        tVar.t(20);
        int i5 = tVar.i(12);
        int i6 = tVar.i(8);
        uVar.N(14);
        if (i6 == 0) {
            dVar = new d();
        } else if (i6 == 255) {
            long B4 = uVar.B();
            int i7 = i5 - 4;
            uVar.k(new byte[i7], 0, i7);
            dVar = new a(0, B4, i4);
        } else if (i6 == 4) {
            int z = uVar.z();
            ArrayList arrayList = new ArrayList(z);
            for (int i8 = 0; i8 < z; i8++) {
                uVar.B();
                boolean z4 = (uVar.z() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z4) {
                    int z5 = uVar.z();
                    boolean z6 = (z5 & 64) != 0;
                    boolean z7 = (z5 & 32) != 0;
                    if (z6) {
                        uVar.B();
                    }
                    if (!z6) {
                        int z8 = uVar.z();
                        ArrayList arrayList3 = new ArrayList(z8);
                        for (int i9 = 0; i9 < z8; i9++) {
                            uVar.z();
                            uVar.B();
                            arrayList3.add(new i(17));
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z7) {
                        uVar.z();
                        uVar.B();
                    }
                    uVar.G();
                    uVar.z();
                    uVar.z();
                }
                i iVar = new i(18);
                Collections.unmodifiableList(arrayList2);
                arrayList.add(iVar);
            }
            dVar = new d();
            Collections.unmodifiableList(arrayList);
        } else if (i6 == 5) {
            G g6 = this.f2007m;
            uVar.B();
            boolean z9 = (uVar.z() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z9) {
                j4 = -9223372036854775807L;
            } else {
                int z10 = uVar.z();
                boolean z11 = (z10 & 64) != 0;
                boolean z12 = (z10 & 32) != 0;
                boolean z13 = (z10 & 16) != 0;
                long d4 = (!z11 || z13) ? -9223372036854775807L : a.d(i4, uVar);
                if (!z11) {
                    int z14 = uVar.z();
                    ArrayList arrayList4 = new ArrayList(z14);
                    for (int i10 = 0; i10 < z14; i10++) {
                        uVar.z();
                        g6.b(!z13 ? a.d(i4, uVar) : -9223372036854775807L);
                        arrayList4.add(new i(16));
                    }
                    list = arrayList4;
                }
                if (z12) {
                    uVar.z();
                    uVar.B();
                }
                uVar.G();
                uVar.z();
                uVar.z();
                j4 = d4;
            }
            dVar = new a(j4, g6.b(j4), list);
        } else if (i6 != 6) {
            dVar = null;
        } else {
            G g7 = this.f2007m;
            long d5 = a.d(i4, uVar);
            dVar = new a(2, d5, g7.b(d5));
        }
        return dVar == null ? new E(new D[0]) : new E(dVar);
    }
}
