package t0;

import c1.EnumC0088a;
import com.fortunequest.neontrack.DailyQuestActivity;
import d1.AbstractC0100h;
import java.util.ArrayList;
import s1.InterfaceC0334q;
import u0.C0367f;
import u0.C0383v;

/* renamed from: t0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0360m extends AbstractC0100h implements j1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f4143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DailyQuestActivity f4144f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0360m(DailyQuestActivity dailyQuestActivity, b1.d dVar) {
        super(dVar);
        this.f4144f = dailyQuestActivity;
    }

    @Override // d1.AbstractC0093a
    public final b1.d a(Object obj, b1.d dVar) {
        return new C0360m(this.f4144f, dVar);
    }

    @Override // j1.p
    public final Object d(Object obj, Object obj2) {
        return ((C0360m) a((InterfaceC0334q) obj, (b1.d) obj2)).i(X0.g.f1277c);
    }

    @Override // d1.AbstractC0093a
    public final Object i(Object obj) {
        EnumC0088a enumC0088a = EnumC0088a.f2060a;
        int i = this.f4143e;
        DailyQuestActivity dailyQuestActivity = this.f4144f;
        if (i == 0) {
            H1.l.h0(obj);
            C0383v c0383v = (C0383v) dailyQuestActivity.f2077z.a();
            this.f4143e = 1;
            obj = c0383v.c(this);
            if (obj == enumC0088a) {
                return enumC0088a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            H1.l.h0(obj);
        }
        C0367f c0367f = (C0367f) obj;
        DailyQuestActivity.u(this.f4144f, c0367f.f4178b, c0367f.f4180e, c0367f.d, c0367f.f4181f, c0367f.f4182g, c0367f.h);
        ArrayList arrayList = c0367f.f4177a;
        if (arrayList.isEmpty()) {
            dailyQuestActivity.v().f4447e.setVisibility(0);
            dailyQuestActivity.v().h.setVisibility(8);
        } else {
            dailyQuestActivity.v().f4447e.setVisibility(8);
            dailyQuestActivity.v().h.setVisibility(0);
            dailyQuestActivity.v().f4449g.setHabits(arrayList);
        }
        return X0.g.f1277c;
    }
}
