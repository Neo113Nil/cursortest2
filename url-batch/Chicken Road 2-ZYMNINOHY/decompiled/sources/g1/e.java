package g1;

import W.u;
import a.AbstractC0124a;
import y0.o;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f9026a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9027b;

    public /* synthetic */ e(int i4, long j4, boolean z) {
        this.f9026a = i4;
        this.f9027b = j4;
    }

    public static e b(o oVar, u uVar) {
        oVar.E(uVar.f3351a, 0, 8);
        uVar.M(0);
        return new e(uVar.m(), uVar.q(), false);
    }

    public boolean a() {
        int i4 = this.f9026a;
        return i4 == 0 || i4 == 1;
    }

    public e(int i4, long j4) {
        AbstractC0124a.h(j4 >= 0);
        this.f9026a = i4;
        this.f9027b = j4;
    }
}
