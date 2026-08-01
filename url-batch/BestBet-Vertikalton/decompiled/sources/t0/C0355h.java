package t0;

import android.os.CancellationSignal;
import c1.EnumC0088a;
import com.fortunequest.neontrack.AddHabitActivity;
import com.fortunequest.neontrack.data.FortuneQuestDatabase_Impl;
import d1.AbstractC0100h;
import java.util.ArrayList;
import s1.InterfaceC0334q;
import u0.C0372k;
import u0.C0373l;
import u0.C0383v;
import u0.CallableC0371j;

/* renamed from: t0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0355h extends AbstractC0100h implements j1.p {

    /* renamed from: e, reason: collision with root package name */
    public C0353f f4129e;

    /* renamed from: f, reason: collision with root package name */
    public int f4130f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AddHabitActivity f4131g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0355h(AddHabitActivity addHabitActivity, b1.d dVar) {
        super(dVar);
        this.f4131g = addHabitActivity;
    }

    @Override // d1.AbstractC0093a
    public final b1.d a(Object obj, b1.d dVar) {
        return new C0355h(this.f4131g, dVar);
    }

    @Override // j1.p
    public final Object d(Object obj, Object obj2) {
        return ((C0355h) a((InterfaceC0334q) obj, (b1.d) obj2)).i(X0.g.f1277c);
    }

    @Override // d1.AbstractC0093a
    public final Object i(Object obj) {
        C0353f c0353f;
        EnumC0088a enumC0088a = EnumC0088a.f2060a;
        int i = this.f4130f;
        if (i == 0) {
            H1.l.h0(obj);
            AddHabitActivity addHabitActivity = this.f4131g;
            C0353f c0353f2 = addHabitActivity.f2070A;
            C0383v c0383v = (C0383v) addHabitActivity.f2072z.a();
            this.f4129e = c0353f2;
            this.f4130f = 1;
            C0372k c0372k = c0383v.f4224a;
            c0372k.getClass();
            h0.p a2 = h0.p.a("SELECT * FROM habits ORDER BY createdAt ASC", 0);
            obj = h0.e.a((FortuneQuestDatabase_Impl) c0372k.f4190a, new CancellationSignal(), new CallableC0371j(c0372k, a2, 1), this);
            if (obj == enumC0088a) {
                return enumC0088a;
            }
            c0353f = c0353f2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0353f = this.f4129e;
            H1.l.h0(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (((C0373l) obj2).f4196e) {
                arrayList.add(obj2);
            }
        }
        c0353f.getClass();
        c0353f.f4125e = arrayList;
        c0353f.f2955a.b();
        return X0.g.f1277c;
    }
}
