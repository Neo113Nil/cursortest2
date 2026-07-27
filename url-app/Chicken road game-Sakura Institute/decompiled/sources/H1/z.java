package H1;

import kotlin.jvm.internal.Intrinsics;
import o.C0908r0;
import o.Z;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3320a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3321b;

    public /* synthetic */ z(Object obj, boolean z4) {
        this.f3321b = obj;
        this.f3320a = z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(long j4, long j5, E2.c cVar) {
        Z z4;
        int i2;
        long j6;
        if (cVar instanceof Z) {
            z4 = (Z) cVar;
            int i4 = z4.f8740m;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                z4.f8740m = i4 - Integer.MIN_VALUE;
                Object obj = z4.f8738k;
                D2.a aVar = D2.a.f2163d;
                i2 = z4.f8740m;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    if (!this.f3320a) {
                        j6 = 0;
                        return new M0.o(j6);
                    }
                    z4.f8737j = j5;
                    z4.f8740m = 1;
                    obj = ((C0908r0) this.f3321b).b(j5, z4);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j5 = z4.f8737j;
                    AbstractC1343r.b(obj);
                }
                j6 = M0.o.d(j5, ((M0.o) obj).f3563a);
                return new M0.o(j6);
            }
        }
        z4 = new Z(this, cVar);
        Object obj2 = z4.f8738k;
        D2.a aVar2 = D2.a.f2163d;
        i2 = z4.f8740m;
        if (i2 != 0) {
        }
        j6 = M0.o.d(j5, ((M0.o) obj2).f3563a);
        return new M0.o(j6);
    }

    public z(String discriminator, boolean z4) {
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        this.f3320a = z4;
        this.f3321b = discriminator;
    }
}
