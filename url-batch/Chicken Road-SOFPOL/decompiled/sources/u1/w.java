package u1;

import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class w implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7288a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f7289b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f7290c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0 f7292e;

    public /* synthetic */ w(f0 f0Var, a0 a0Var, int i, f0 f0Var2, int i8) {
        this.f7288a = i8;
        this.f7290c = a0Var;
        this.f7291d = i;
        this.f7292e = f0Var2;
        this.f7289b = f0Var;
    }

    @Override // u1.f0
    public final Map a() {
        switch (this.f7288a) {
        }
        return this.f7289b.a();
    }

    @Override // u1.f0
    public final void b() {
        switch (this.f7288a) {
            case 0:
                int i = this.f7291d;
                a0 a0Var = this.f7290c;
                a0Var.f7173h = i;
                this.f7292e.b();
                o.j0 j0Var = a0Var.f7179o;
                long[] jArr = j0Var.f5482a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j7 = jArr[i8];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((255 & j7) < 128) {
                                    int i11 = (i8 << 3) + i10;
                                    Object obj = j0Var.f5483b[i11];
                                    u0 u0Var = (u0) j0Var.f5484c[i11];
                                    int i12 = a0Var.f7180p.i(obj);
                                    if (i12 < 0 || i12 >= a0Var.f7173h) {
                                        u0Var.a();
                                        j0Var.l(i11);
                                    }
                                }
                                j7 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                break;
            default:
                int i13 = this.f7291d;
                a0 a0Var2 = this.f7290c;
                a0Var2.f7172g = i13;
                this.f7292e.b();
                a0Var2.d(a0Var2.f7172g);
                break;
        }
    }

    @Override // u1.f0
    public final int c() {
        switch (this.f7288a) {
        }
        return this.f7289b.c();
    }

    @Override // u1.f0
    public final p6.c d() {
        switch (this.f7288a) {
        }
        return this.f7289b.d();
    }

    @Override // u1.f0
    public final int e() {
        switch (this.f7288a) {
        }
        return this.f7289b.e();
    }
}
