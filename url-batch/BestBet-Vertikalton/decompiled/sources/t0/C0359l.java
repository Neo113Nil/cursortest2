package t0;

import androidx.lifecycle.J;
import c1.EnumC0088a;
import com.fortunequest.neontrack.DailyQuestActivity;
import com.fortunequest.neontrack.ui.ColorWaveOverlay;
import d1.AbstractC0100h;
import s1.AbstractC0335s;
import s1.InterfaceC0334q;
import u0.AbstractC0377p;
import u0.C0374m;
import u0.C0375n;
import u0.C0376o;
import u0.C0383v;

/* renamed from: t0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0359l extends AbstractC0100h implements j1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f4140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DailyQuestActivity f4141f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f4142g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0359l(DailyQuestActivity dailyQuestActivity, long j2, b1.d dVar) {
        super(dVar);
        this.f4141f = dailyQuestActivity;
        this.f4142g = j2;
    }

    @Override // d1.AbstractC0093a
    public final b1.d a(Object obj, b1.d dVar) {
        return new C0359l(this.f4141f, this.f4142g, dVar);
    }

    @Override // j1.p
    public final Object d(Object obj, Object obj2) {
        return ((C0359l) a((InterfaceC0334q) obj, (b1.d) obj2)).i(X0.g.f1277c);
    }

    @Override // d1.AbstractC0093a
    public final Object i(Object obj) {
        EnumC0088a enumC0088a = EnumC0088a.f2060a;
        int i = this.f4140e;
        long j2 = this.f4142g;
        DailyQuestActivity dailyQuestActivity = this.f4141f;
        if (i == 0) {
            H1.l.h0(obj);
            C0383v c0383v = (C0383v) dailyQuestActivity.f2077z.a();
            this.f4140e = 1;
            obj = c0383v.a(j2, this);
            if (obj == enumC0088a) {
                return enumC0088a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            H1.l.h0(obj);
        }
        AbstractC0377p abstractC0377p = (AbstractC0377p) obj;
        boolean z2 = abstractC0377p instanceof C0375n;
        X0.g gVar = X0.g.f1277c;
        if (z2) {
            return gVar;
        }
        if (abstractC0377p instanceof C0376o) {
            int i2 = DailyQuestActivity.f2073C;
            dailyQuestActivity.v().f4449g.b(j2);
            dailyQuestActivity.v().f4449g.a(j2);
            ColorWaveOverlay.a(dailyQuestActivity.v().f4446c);
            DailyQuestActivity.t(dailyQuestActivity, ((C0376o) abstractC0377p).f4201a);
            AbstractC0335s.g(J.e(dailyQuestActivity), null, new n(dailyQuestActivity, null), 3);
        } else {
            if (!(abstractC0377p instanceof C0374m)) {
                throw new X0.b();
            }
            int i3 = DailyQuestActivity.f2073C;
            dailyQuestActivity.v().f4449g.b(j2);
            dailyQuestActivity.v().f4449g.a(j2);
            ColorWaveOverlay.a(dailyQuestActivity.v().f4446c);
            C0374m c0374m = (C0374m) abstractC0377p;
            DailyQuestActivity.t(dailyQuestActivity, c0374m.f4198b);
            dailyQuestActivity.v().f4449g.f2117j = true;
            dailyQuestActivity.f2075B = new C0358k(c0374m.f4198b, c0374m.f4197a, c0374m.f4199c);
        }
        return gVar;
    }
}
