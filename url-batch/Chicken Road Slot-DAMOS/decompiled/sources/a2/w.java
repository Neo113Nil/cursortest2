package a2;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f173b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f174c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h0 f176e;

    public /* synthetic */ w(h0 h0Var, c0 c0Var, int i3, h0 h0Var2, int i10) {
        this.f172a = i10;
        this.f174c = c0Var;
        this.f175d = i3;
        this.f176e = h0Var2;
        this.f173b = h0Var;
    }

    @Override // a2.h0
    public final Map a() {
        switch (this.f172a) {
        }
        return this.f173b.a();
    }

    @Override // a2.h0
    public final void b() {
        int i3;
        switch (this.f172a) {
            case 0:
                int i10 = this.f175d;
                c0 c0Var = this.f174c;
                c0Var.f64r = i10;
                this.f176e.b();
                o0.e eVar = c0Var.f72z;
                s.h0 h0Var = c0Var.f71y;
                long[] jArr = h0Var.f8312a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j = jArr[i11];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8;
                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((255 & j) < 128) {
                                    int i15 = (i11 << 3) + i14;
                                    Object obj = h0Var.f8313b[i15];
                                    x0 x0Var = (x0) h0Var.f8314c[i15];
                                    int i16 = eVar.i(obj);
                                    i3 = i12;
                                    if (i16 < 0 || i16 >= c0Var.f64r) {
                                        if (i16 >= 0) {
                                            Object[] objArr = eVar.f7317d;
                                            Object obj2 = objArr[i16];
                                            objArr[i16] = q.f140b;
                                        }
                                        if (c0Var.f69w.b(obj)) {
                                            x0Var.a();
                                        }
                                        h0Var.l(i15);
                                    }
                                } else {
                                    i3 = i12;
                                }
                                j >>= i3;
                                i14++;
                                i12 = i3;
                            }
                            if (i13 != i12) {
                            }
                        }
                        if (i11 != length) {
                            i11++;
                        }
                    }
                }
                c0Var.b(c0Var.f63i);
                break;
            default:
                int i17 = this.f175d;
                c0 c0Var2 = this.f174c;
                c0Var2.f63i = i17;
                this.f176e.b();
                if (c0Var2.f61d.f1556v == null) {
                    c0Var2.b(c0Var2.f63i);
                    break;
                }
                break;
        }
    }

    @Override // a2.h0
    public final int c() {
        switch (this.f172a) {
        }
        return this.f173b.c();
    }

    @Override // a2.h0
    public final Function1 d() {
        switch (this.f172a) {
        }
        return this.f173b.d();
    }

    @Override // a2.h0
    public final int e() {
        switch (this.f172a) {
        }
        return this.f173b.e();
    }
}
