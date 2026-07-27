package r;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import z2.C1412P;

/* loaded from: classes.dex */
public final class j extends M2.p implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s.t f9472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f9473e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9474i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f9475j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(s.t tVar, long j4, int i2, int i4) {
        super(3);
        this.f9472d = tVar;
        this.f9473e = j4;
        this.f9474i = i2;
        this.f9475j = i4;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int i2 = intValue + this.f9474i;
        long j4 = this.f9473e;
        int s4 = u3.d.s(j4, i2);
        int r2 = u3.d.r(j4, intValue2 + this.f9475j);
        Map c4 = C1412P.c();
        return this.f9472d.f9964e.t(s4, r2, c4, (Function1) obj3);
    }
}
