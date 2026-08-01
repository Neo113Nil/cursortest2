package t0;

import c1.EnumC0088a;
import com.fortunequest.neontrack.AddHabitActivity;
import com.fortunequest.neontrack.data.FortuneQuestDatabase_Impl;
import d1.AbstractC0100h;
import s1.InterfaceC0334q;
import u0.C0372k;
import u0.C0383v;
import u0.CallableC0370i;

/* renamed from: t0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354g extends AbstractC0100h implements j1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f4126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AddHabitActivity f4127f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f4128g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0354g(AddHabitActivity addHabitActivity, long j2, b1.d dVar) {
        super(dVar);
        this.f4127f = addHabitActivity;
        this.f4128g = j2;
    }

    @Override // d1.AbstractC0093a
    public final b1.d a(Object obj, b1.d dVar) {
        return new C0354g(this.f4127f, this.f4128g, dVar);
    }

    @Override // j1.p
    public final Object d(Object obj, Object obj2) {
        return ((C0354g) a((InterfaceC0334q) obj, (b1.d) obj2)).i(X0.g.f1277c);
    }

    @Override // d1.AbstractC0093a
    public final Object i(Object obj) {
        EnumC0088a enumC0088a = EnumC0088a.f2060a;
        int i = this.f4126e;
        X0.g gVar = X0.g.f1277c;
        AddHabitActivity addHabitActivity = this.f4127f;
        if (i == 0) {
            H1.l.h0(obj);
            C0383v c0383v = (C0383v) addHabitActivity.f2072z.a();
            this.f4126e = 1;
            C0372k c0372k = c0383v.f4224a;
            c0372k.getClass();
            Object b2 = h0.e.b((FortuneQuestDatabase_Impl) c0372k.f4190a, new CallableC0370i(c0372k, this.f4128g), this);
            if (b2 != enumC0088a) {
                b2 = gVar;
            }
            if (b2 == enumC0088a) {
                return enumC0088a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            H1.l.h0(obj);
        }
        int i2 = AddHabitActivity.f2069B;
        addHabitActivity.u();
        return gVar;
    }
}
