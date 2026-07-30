package defpackage;

import androidx.compose.foundation.lazy.layout.a;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class oa1 {
    public final int a;
    public final Object b;
    public final int c;
    public final u81 d;
    public final List e;
    public final long f;
    public final Object g;
    public final a h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public int m = Integer.MIN_VALUE;
    public final long n;
    public long o;
    public int p;
    public int q;

    public oa1(int i, Object obj, int i2, int i3, u81 u81Var, int i4, int i5, List list, long j, Object obj2, a aVar, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.c = i2;
        this.d = u81Var;
        this.e = list;
        this.f = j;
        this.g = obj2;
        this.h = aVar;
        this.i = i6;
        this.j = i7;
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 = Math.max(i8, ((n12) list.get(i9)).n);
        }
        this.k = i8;
        int i10 = i3 + i8;
        this.l = i10 >= 0 ? i10 : 0;
        this.n = zm3.d(this.c, i8);
        this.o = 0L;
        this.p = -1;
        this.q = -1;
    }

    public final void a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.m = i4;
        if (this.d == u81.n) {
            i2 = (i3 - i2) - this.c;
        }
        this.o = yk3.h(i2, i);
        this.p = i5;
        this.q = i6;
    }
}
