package s;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1341p;
import y2.AbstractC1343r;

/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1099c implements S.m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9925a;

    /* renamed from: b, reason: collision with root package name */
    public C2.c f9926b;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(E2.c cVar) {
        C1098b frame;
        int i2;
        C2.c cVar2;
        if (cVar instanceof C1098b) {
            frame = (C1098b) cVar;
            int i4 = frame.f9924m;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                frame.f9924m = i4 - Integer.MIN_VALUE;
                Object obj = frame.f9922k;
                D2.a aVar = D2.a.f2163d;
                i2 = frame.f9924m;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    if (!this.f9925a) {
                        C2.c cVar3 = this.f9926b;
                        frame.f9921j = cVar3;
                        frame.f9924m = 1;
                        C2.a delegate = D2.f.b(frame);
                        Intrinsics.checkNotNullParameter(delegate, "delegate");
                        C2.c cVar4 = new C2.c(delegate, D2.a.f2164e);
                        this.f9926b = cVar4;
                        Object a4 = cVar4.a();
                        if (a4 == aVar) {
                            Intrinsics.checkNotNullParameter(frame, "frame");
                        }
                        if (a4 == aVar) {
                            return aVar;
                        }
                        cVar2 = cVar3;
                    }
                    return Unit.f7487a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar2 = frame.f9921j;
                AbstractC1343r.b(obj);
                if (cVar2 != null) {
                    AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                    cVar2.u(Unit.f7487a);
                }
                return Unit.f7487a;
            }
        }
        frame = new C1098b(this, cVar);
        Object obj2 = frame.f9922k;
        D2.a aVar3 = D2.a.f2163d;
        i2 = frame.f9924m;
        if (i2 != 0) {
        }
        if (cVar2 != null) {
        }
        return Unit.f7487a;
    }
}
