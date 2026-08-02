package n0;

import W.J;
import W.t;
import W.u;
import a.AbstractC0124a;
import kotlin.KotlinVersion;
import m0.C1298k;
import y0.AbstractC1569a;
import y0.C1570b;
import y0.F;
import y0.p;

/* renamed from: n0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1316b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final C1298k f14510a;

    /* renamed from: c, reason: collision with root package name */
    public F f14512c;

    /* renamed from: d, reason: collision with root package name */
    public int f14513d;

    /* renamed from: f, reason: collision with root package name */
    public long f14515f;

    /* renamed from: g, reason: collision with root package name */
    public long f14516g;

    /* renamed from: b, reason: collision with root package name */
    public final t f14511b = new t();

    /* renamed from: e, reason: collision with root package name */
    public long f14514e = -9223372036854775807L;

    public C1316b(C1298k c1298k) {
        this.f14510a = c1298k;
    }

    @Override // n0.i
    public final void a(long j4, long j5) {
        this.f14514e = j4;
        this.f14516g = j5;
    }

    @Override // n0.i
    public final void b(long j4) {
        AbstractC0124a.t(this.f14514e == -9223372036854775807L);
        this.f14514e = j4;
    }

    @Override // n0.i
    public final void c(p pVar, int i4) {
        F z = pVar.z(i4, 1);
        this.f14512c = z;
        z.d(this.f14510a.f14397c);
    }

    @Override // n0.i
    public final void d(u uVar, long j4, int i4, boolean z) {
        int z4 = uVar.z() & 3;
        int z5 = uVar.z() & KotlinVersion.MAX_COMPONENT_VALUE;
        long R3 = AbstractC0124a.R(this.f14516g, j4, this.f14514e, this.f14510a.f14396b);
        if (z4 != 0) {
            if (z4 == 1 || z4 == 2) {
                int i5 = this.f14513d;
                if (i5 > 0) {
                    F f4 = this.f14512c;
                    String str = J.f3263a;
                    f4.e(this.f14515f, 1, i5, 0, null);
                    this.f14513d = 0;
                }
            } else if (z4 != 3) {
                throw new IllegalArgumentException(String.valueOf(z4));
            }
            int a3 = uVar.a();
            F f5 = this.f14512c;
            f5.getClass();
            f5.a(a3, uVar);
            int i6 = this.f14513d + a3;
            this.f14513d = i6;
            this.f14515f = R3;
            if (z && z4 == 3) {
                F f6 = this.f14512c;
                String str2 = J.f3263a;
                f6.e(R3, 1, i6, 0, null);
                this.f14513d = 0;
                return;
            }
            return;
        }
        int i7 = this.f14513d;
        if (i7 > 0) {
            F f7 = this.f14512c;
            String str3 = J.f3263a;
            f7.e(this.f14515f, 1, i7, 0, null);
            this.f14513d = 0;
        }
        if (z5 == 1) {
            int a4 = uVar.a();
            F f8 = this.f14512c;
            f8.getClass();
            f8.a(a4, uVar);
            F f9 = this.f14512c;
            String str4 = J.f3263a;
            f9.e(R3, 1, a4, 0, null);
            return;
        }
        byte[] bArr = uVar.f3351a;
        t tVar = this.f14511b;
        tVar.getClass();
        tVar.o(bArr.length, bArr);
        tVar.u(2);
        long j5 = R3;
        for (int i8 = 0; i8 < z5; i8++) {
            C1570b q4 = AbstractC1569a.q(tVar);
            int i9 = q4.f16120d;
            F f10 = this.f14512c;
            f10.getClass();
            f10.a(i9, uVar);
            F f11 = this.f14512c;
            String str5 = J.f3263a;
            f11.e(j5, 1, q4.f16120d, 0, null);
            j5 += (q4.f16121e / q4.f16118b) * 1000000;
            tVar.u(i9);
        }
    }
}
