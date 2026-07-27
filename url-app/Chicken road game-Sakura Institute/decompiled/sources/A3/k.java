package A3;

import M2.E;
import M2.p;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import z3.z;

/* loaded from: classes.dex */
public final class k extends p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ E f872e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E f873i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ E f874j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(z zVar, E e4, E e5, E e6) {
        super(2);
        this.f871d = zVar;
        this.f872e = e4;
        this.f873i = e5;
        this.f874j = e6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 21589) {
            if (longValue < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            byte d4 = this.f871d.d();
            boolean z4 = (d4 & 1) == 1;
            boolean z5 = (d4 & 2) == 2;
            boolean z6 = (d4 & 4) == 4;
            long j4 = z4 ? 5L : 1L;
            if (z5) {
                j4 += 4;
            }
            if (z6) {
                j4 += 4;
            }
            if (longValue < j4) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z4) {
                this.f872e.f3580d = Long.valueOf(r2.i() * 1000);
            }
            if (z5) {
                this.f873i.f3580d = Long.valueOf(r2.i() * 1000);
            }
            if (z6) {
                this.f874j.f3580d = Long.valueOf(r2.i() * 1000);
            }
        }
        return Unit.f7487a;
    }
}
