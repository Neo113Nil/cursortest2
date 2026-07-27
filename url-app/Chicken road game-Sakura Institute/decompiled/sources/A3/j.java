package A3;

import M2.A;
import M2.D;
import M2.p;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import z3.z;

/* loaded from: classes.dex */
public final class j extends p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A f865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f866e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ D f867i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z f868j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ D f869k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ D f870l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(A a4, long j4, D d4, z zVar, D d5, D d6) {
        super(2);
        this.f865d = a4;
        this.f866e = j4;
        this.f867i = d4;
        this.f868j = zVar;
        this.f869k = d5;
        this.f870l = d6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 1) {
            A a4 = this.f865d;
            if (a4.f3576d) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            a4.f3576d = true;
            if (longValue < this.f866e) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            D d4 = this.f867i;
            long j4 = d4.f3579d;
            z zVar = this.f868j;
            if (j4 == 4294967295L) {
                j4 = zVar.j();
            }
            d4.f3579d = j4;
            D d5 = this.f869k;
            d5.f3579d = d5.f3579d == 4294967295L ? zVar.j() : 0L;
            D d6 = this.f870l;
            d6.f3579d = d6.f3579d == 4294967295L ? zVar.j() : 0L;
        }
        return Unit.f7487a;
    }
}
