package n0;

import com.appsflyer.attribution.RequestError;
import com.google.android.gms.internal.measurement.se;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6818d;

    public /* synthetic */ u(int i3) {
        this.f6818d = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6818d) {
            case 0:
                m.b("Unexpected call to default provider");
                throw new hd.d();
            case 1:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 2:
                return new androidx.lifecycle.r0();
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                k4.d dVar = new k4.d(0);
                dVar.a(wd.c0.a(q4.b.class), new m2.u(27));
                return dVar.c();
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                v vVar = t4.a.f9280a;
                return null;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                v vVar2 = x.u.f10212a;
                return x.o.f10203b;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                throw new IllegalStateException("should not be used in favor of LocalKoinScopeContext");
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new IllegalStateException("should not be used in favor of getKoin()");
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                se seVar = ze.a.f10967b;
                if (seVar != null) {
                    return new xe.a(((jf.b) seVar.f2800i).f5258d, new u(10));
                }
                kotlin.collections.i0.l("KoinApplication has not been started");
                return null;
            case 9:
                se seVar2 = ze.a.f10967b;
                if (seVar2 != null) {
                    return new xe.a(seVar2, new u(11));
                }
                kotlin.collections.i0.l("KoinApplication has not been started");
                return null;
            case 10:
                se seVar3 = ze.a.f10967b;
                if (seVar3 != null) {
                    return ((jf.b) seVar3.f2800i).f5258d;
                }
                kotlin.collections.i0.l("KoinApplication has not been started");
                return null;
            case RequestError.STOP_TRACKING /* 11 */:
                se seVar4 = ze.a.f10967b;
                if (seVar4 != null) {
                    return seVar4;
                }
                kotlin.collections.i0.l("KoinApplication has not been started");
                return null;
            case 12:
                n2 n2Var = y0.b.f10570a;
                return y0.a.f10569d;
            case 13:
                return Unit.f5554a;
            case 14:
                return Unit.f5554a;
            default:
                return Boolean.TRUE;
        }
    }
}
