package a0;

import android.content.Context;
import b6.z1;
import java.io.File;
import java.util.Collection;
import m0.b2;
import m0.e2;
import m0.f2;
import m0.h2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements p6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f185e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f186f;

    public /* synthetic */ z0(int i, Object obj, Object obj2) {
        this.f184d = i;
        this.f185e = obj;
        this.f186f = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x007e, code lost:
    
        r7 = new x0.g(r5, java.lang.Integer.valueOf(r9));
     */
    @Override // p6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b() {
        x0.g gVar;
        switch (this.f184d) {
            case 0:
                return new y0((v0.e) this.f185e, d6.v.f2327d, (v0.c) this.f186f);
            case 1:
                Context context = (Context) this.f185e;
                ((a4.b) this.f186f).getClass();
                String concat = "app_preferences".concat(".preferences_pb");
                q6.i.e(concat, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(concat));
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                o4.t tVar = (o4.t) this.f185e;
                String str = ((z1) this.f186f).f1525a;
                t tVar2 = new t(4, tVar);
                tVar.getClass();
                r4.g gVar2 = tVar.f5685b;
                gVar2.getClass();
                gVar2.k(str, h0.a.P(tVar2));
                break;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                ((p6.c) this.f185e).i((b6.k1) this.f186f);
                break;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                ((c.d) this.f185e).f1543d = (p6.e) this.f186f;
                break;
            case 5:
                o.k0 k0Var = (o.k0) this.f185e;
                m0.y yVar = (m0.y) this.f186f;
                Object[] objArr = k0Var.f5490b;
                long[] jArr = k0Var.f5489a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j7 = jArr[i];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8 - ((~(i - length)) >>> 31);
                            for (int i9 = 0; i9 < i8; i9++) {
                                if ((255 & j7) < 128) {
                                    yVar.A(objArr[(i << 3) + i9]);
                                }
                                j7 >>= 8;
                            }
                            if (i8 != 8) {
                            }
                        }
                        if (i != length) {
                            i++;
                        }
                    }
                }
                return c6.m.f1757a;
            case 6:
                ((p4.p) this.f185e).e((o4.d) this.f186f, false);
                break;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((c7.g) this.f185e).t(this.f186f);
                break;
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                t.n nVar = (t.n) this.f185e;
                w1.h0 h0Var = (w1.h0) this.f186f;
                nVar.f6821z = nVar.f6816u.a(h0Var.f7680d.c(), h0Var.getLayoutDirection(), h0Var);
                break;
            case x.v0.f8304b /* 9 */:
                ((q6.s) this.f185e).f6205d = w1.f.i((t.c0) this.f186f, u1.j0.f7226a);
                break;
            default:
                m0.s sVar = ((x0.b) this.f185e).f8317d;
                f2 f2Var = sVar.f5075c;
                boolean z3 = sVar.C;
                Collection collection = d6.u.f2326d;
                if (!z3) {
                    return collection;
                }
                e2 c8 = f2Var.c();
                int i10 = 0;
                while (true) {
                    try {
                        gVar = null;
                        if (i10 >= f2Var.f4929e) {
                            break;
                        } else {
                            boolean l3 = c8.l(i10);
                            Object obj = this.f186f;
                            if (l3) {
                                Object n6 = c8.n(i10);
                                if (n6 != obj) {
                                    b2 b2Var = n6 instanceof b2 ? (b2) n6 : null;
                                    if ((b2Var != null ? b2Var.f4881a : null) == obj) {
                                    }
                                }
                            }
                            int[] iArr = c8.f4908b;
                            int i11 = i10 + 1;
                            int c9 = (i11 < c8.f4909c ? iArr[(i11 * 5) + 4] : c8.f4911e) - h2.c(iArr, i10);
                            int i12 = 0;
                            while (i12 < c9) {
                                Object h8 = c8.h(i10, i12);
                                if (h8 == obj) {
                                    break;
                                } else {
                                    b2 b2Var2 = h8 instanceof b2 ? (b2) h8 : null;
                                    if ((b2Var2 != null ? b2Var2.f4881a : null) == obj) {
                                        break;
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                            i10 = i11;
                        }
                    } finally {
                    }
                }
                x0.g gVar3 = new x0.g(i10, null);
                c8.c();
                gVar = gVar3;
                if (gVar == null) {
                    return collection;
                }
                int i13 = gVar.f8321a;
                Integer num = gVar.f8322b;
                if (sVar.C) {
                    try {
                        collection = r2.r.X(f2Var.c(), i13, num);
                    } finally {
                    }
                }
                return d6.m.b0(collection, sVar.D());
        }
        return c6.m.f1757a;
    }
}
