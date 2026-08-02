package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ael {
    public boolean a;
    public List b;
    public aek c;
    public gdy d;
    public final brn e;
    private int f;
    private boolean g;
    private final lao h;
    private final brn i;

    public ael(aer aerVar) {
        this.e = new brn(null, null, null, null);
        this.d = new gdy((byte[]) null);
        this.i = new brn(aerVar);
        this.b = new ArrayList();
        aek aekVar = aek.b;
        this.c = aekVar;
        this.h = lak.a(aekVar);
    }

    public static void e(String str) {
        if (!op.a().b()) {
            throw new IllegalStateException(a.Z(str, "Method ", " must be called on the main thread"));
        }
    }

    private final aek f(aeq aeqVar) {
        aef aefVar = (aef) ((qv) this.d.a).a(aeqVar);
        aek aekVar = null;
        aef aefVar2 = aefVar != null ? aefVar.c : null;
        Object obj = aefVar2 != null ? ((gdy) aefVar2.a).c : null;
        if (!this.b.isEmpty()) {
            aekVar = (aek) this.b.get(r0.size() - 1);
        }
        return yj.i(yj.i(this.c, (aek) obj), aekVar);
    }

    private final void g(aek aekVar) {
        if (this.c == aekVar) {
            return;
        }
        aer aerVar = (aer) this.i.G();
        aek aekVar2 = this.c;
        if (aekVar2 == aek.b && aekVar == aek.a) {
            throw new IllegalStateException("State must be at least '" + aek.c + "' to be moved to '" + aekVar + "' in component " + aerVar);
        }
        aek aekVar3 = aek.a;
        if (aekVar2 == aekVar3 && aekVar2 != aekVar) {
            throw new IllegalStateException("State is '" + aekVar3 + "' and cannot be moved to `" + aekVar + "` in component " + aerVar);
        }
        this.c = aekVar;
        if (this.g || this.f != 0) {
            this.a = true;
            return;
        }
        this.g = true;
        h();
        this.g = false;
        if (this.c == aekVar3) {
            this.d = new gdy((byte[]) null);
        }
    }

    private final void h() {
        Object G = this.i.G();
        if (G == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        aer aerVar = (aer) G;
        while (true) {
            int i = 0;
            if (this.d.k() == 0) {
                break;
            }
            Object obj = ((gdy) ((aef) this.d.l()).a).c;
            gdy gdyVar = this.d;
            Object obj2 = gdyVar.b;
            if (obj2 == null) {
                throw new NoSuchElementException("Collection is empty.");
            }
            Object obj3 = ((gdy) ((aef) obj2).a).c;
            if (obj == obj3 && this.c == obj3) {
                break;
            }
            this.a = false;
            if (this.c.compareTo((aek) ((gdy) ((aef) gdyVar.l()).a).c) < 0) {
                gdy gdyVar2 = this.d;
                aes aesVar = new aes(this, aerVar, 1);
                Object obj4 = gdyVar2.b;
                while (obj4 != null) {
                    aef aefVar = (aef) obj4;
                    if (!aefVar.d) {
                        aesVar.a(obj4);
                    }
                    obj4 = aefVar.c;
                }
            }
            Object obj5 = this.d.b;
            if (!this.a && obj5 != null && this.c.compareTo((aek) ((gdy) ((aef) obj5).a).c) > 0) {
                gdy gdyVar3 = this.d;
                aes aesVar2 = new aes(this, aerVar, i);
                Object obj6 = gdyVar3.c;
                while (obj6 != null) {
                    aef aefVar2 = (aef) obj6;
                    if (!aefVar2.d) {
                        aesVar2.a(obj6);
                    }
                    obj6 = aefVar2.b;
                }
            }
        }
        this.a = false;
        this.h.d(this.c);
    }

    public final void a(aeq aeqVar) {
        Object obj;
        aer aerVar;
        aeqVar.getClass();
        e("addObserver");
        aek aekVar = this.c;
        aek aekVar2 = aek.a;
        if (aekVar != aekVar2) {
            aekVar2 = aek.b;
        }
        gdy gdyVar = new gdy(aeqVar, aekVar2);
        gdy gdyVar2 = this.d;
        qv qvVar = (qv) gdyVar2.a;
        aef aefVar = (aef) qvVar.a(aeqVar);
        if (aefVar != null) {
            obj = aefVar.a;
        } else {
            aef aefVar2 = new aef(aeqVar, gdyVar);
            qvVar.c(aeqVar, aefVar2);
            Object obj2 = gdyVar2.b;
            if (obj2 == null) {
                gdyVar2.c = aefVar2;
            } else {
                aef aefVar3 = (aef) obj2;
                aefVar3.b = aefVar2;
                aefVar2.c = aefVar3;
            }
            gdyVar2.b = aefVar2;
            obj = null;
        }
        if (obj == null && (aerVar = (aer) this.i.G()) != null) {
            boolean z = this.f != 0 || this.g;
            aek f = f(aeqVar);
            this.f++;
            while (((aek) gdyVar.c).compareTo(f) < 0 && this.d.m(aeqVar)) {
                this.b.add(gdyVar.c);
                aei aeiVar = aej.Companion;
                aej b = aei.b((aek) gdyVar.c);
                if (b == null) {
                    Object obj3 = gdyVar.c;
                    Objects.toString(obj3);
                    throw new IllegalStateException("no event up from ".concat(String.valueOf(obj3)));
                }
                gdyVar.d(aerVar, b);
                ixc.z(this.b);
                f = f(aeqVar);
            }
            if (!z) {
                h();
            }
            this.f--;
        }
    }

    public void b(aej aejVar) {
        aejVar.getClass();
        e("handleLifecycleEvent");
        aok.a.a("androidx.lifecycle");
        cyi cyiVar = cyi.a;
        try {
            g(aejVar.a());
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        r12 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(aeq aeqVar) {
        int i;
        aeqVar.getClass();
        e("removeObserver");
        gdy gdyVar = this.d;
        Object obj = gdyVar.a;
        int hashCode = aeqVar.hashCode() * (-862048943);
        qv qvVar = (qv) obj;
        int i2 = qvVar.d;
        int i3 = ((hashCode ^ (hashCode << 16)) >>> 7) & i2;
        int i4 = 0;
        loop0: while (true) {
            long[] jArr = qvVar.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = (((-i6) >> 63) & (jArr[i5 + 1] << (64 - i6))) | (jArr[i5] >>> i6);
            long j2 = j ^ ((r2 & 127) * 72340172838076673L);
            long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i3) & i2;
                if (ksp.b(qvVar.b[i], aeqVar)) {
                    break loop0;
                } else {
                    j3 &= (-1) + j3;
                }
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
        aef aefVar = null;
        if (i >= 0) {
            qvVar.e--;
            long[] jArr2 = qvVar.a;
            int i7 = qvVar.d;
            int i8 = i >> 3;
            int i9 = (i & 7) << 3;
            long j4 = (jArr2[i8] & (~(255 << i9))) | (254 << i9);
            jArr2[i8] = j4;
            jArr2[(((i - 7) & i7) + (i7 & 7)) >> 3] = j4;
            qvVar.b[i] = null;
            ?? r1 = qvVar.c;
            ?? r3 = r1[i];
            r1[i] = 0;
            aefVar = r3;
        }
        aef aefVar2 = aefVar;
        if (aefVar2 == null) {
            return;
        }
        aef aefVar3 = aefVar2.c;
        aef aefVar4 = aefVar2.b;
        if (aefVar3 == null) {
            gdyVar.c = aefVar4;
        } else {
            aefVar3.b = aefVar4;
        }
        aef aefVar5 = aefVar2.b;
        if (aefVar5 == null) {
            gdyVar.b = aefVar3;
        } else {
            aefVar5.c = aefVar3;
        }
        aefVar2.d = true;
    }

    public final void d(aek aekVar) {
        aekVar.getClass();
        e("setCurrentState");
        g(aekVar);
    }

    public ael() {
        this.e = new brn(null, null, null, null);
    }
}
