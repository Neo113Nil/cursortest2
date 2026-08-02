package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahe {
    public final ahg b;
    public final List c;
    public final List d;
    public boolean e;
    public cfz f;

    public ahe(ahg ahgVar, boolean z) {
        this.b = ahgVar;
        kpk kpkVar = kpk.a;
        this.c = kpkVar;
        this.d = kpkVar;
        this.e = z;
    }

    protected void a() {
        throw null;
    }

    protected void b() {
        throw null;
    }

    protected void c(ahd ahdVar) {
        throw null;
    }

    public void e() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        int i;
        cfz cfzVar = this.f;
        if (cfzVar != null) {
            int hashCode = hashCode() * (-862048943);
            qt qtVar = (qt) cfzVar.a;
            int i2 = qtVar.f;
            int i3 = ((hashCode ^ (hashCode << 16)) >>> 7) & i2;
            int i4 = 0;
            loop0: while (true) {
                long[] jArr = qtVar.a;
                int i5 = i3 >> 3;
                int i6 = (i3 & 7) << 3;
                int i7 = i4;
                long j = (((-i6) >> 63) & (jArr[i5 + 1] << (64 - i6))) | (jArr[i5] >>> i6);
                long j2 = ((r2 & 127) * 72340172838076673L) ^ j;
                long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L);
                while (true) {
                    if (j3 == 0) {
                        break;
                    }
                    i = ((Long.numberOfTrailingZeros(j3) >> 3) + i3) & i2;
                    if (ksp.b(qtVar.b[i], this)) {
                        break loop0;
                    } else {
                        j3 &= (-1) + j3;
                    }
                }
                i4 = i7 + 8;
                i3 = (i3 + i4) & i2;
            }
            if (i >= 0) {
                qtVar.g--;
                long[] jArr2 = qtVar.a;
                int i8 = qtVar.f;
                int i9 = i >> 3;
                int i10 = (i & 7) << 3;
                long j4 = (jArr2[i9] & (~(255 << i10))) | (254 << i10);
                jArr2[i9] = j4;
                jArr2[(((i - 7) & i8) + (i8 & 7)) >> 3] = j4;
                qtVar.b[i] = null;
                long[] jArr3 = qtVar.c;
                long j5 = jArr3[i];
                long j6 = j5 >> 31;
                int i11 = (int) (j5 & 2147483647L);
                int i12 = (int) (j6 & 2147483647L);
                if (i12 != Integer.MAX_VALUE) {
                    jArr3[i12] = (jArr3[i12] & (-2147483648L)) | i11;
                } else {
                    qtVar.d = i11;
                }
                if (i11 != Integer.MAX_VALUE) {
                    jArr3[i11] = (i12 << 31) | (jArr3[i11] & (-4611686016279904257L));
                } else {
                    qtVar.e = i12;
                }
                jArr3[i] = 4611686018427387903L;
                ahi ahiVar = (ahi) cfzVar.d;
                if (ksp.b(this, ahiVar.c)) {
                    if (ahiVar.d == -1) {
                        a();
                    }
                    ahiVar.c = null;
                    ahiVar.d = 0;
                    ahiVar.e = null;
                }
                ahiVar.a.remove(this);
                ahiVar.b.remove(this);
                this.f = null;
                ahiVar.b();
            }
        }
    }

    public final void g(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        cfz cfzVar = this.f;
        if (cfzVar != null) {
            ((ahi) cfzVar.d).b();
        }
    }
}
