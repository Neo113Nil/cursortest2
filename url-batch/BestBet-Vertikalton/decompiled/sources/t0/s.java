package t0;

import android.content.Intent;
import c1.EnumC0088a;
import com.fortunequest.neontrack.DefeatActivity;
import com.fortunequest.neontrack.HomeActivity;
import com.fortunequest.neontrack.R;
import d1.AbstractC0100h;
import s1.InterfaceC0334q;
import u0.C0367f;
import u0.C0383v;

/* loaded from: classes.dex */
public final class s extends AbstractC0100h implements j1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f4155e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f4156f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(HomeActivity homeActivity, b1.d dVar) {
        super(dVar);
        this.f4156f = homeActivity;
    }

    @Override // d1.AbstractC0093a
    public final b1.d a(Object obj, b1.d dVar) {
        return new s(this.f4156f, dVar);
    }

    @Override // j1.p
    public final Object d(Object obj, Object obj2) {
        return ((s) a((InterfaceC0334q) obj, (b1.d) obj2)).i(X0.g.f1277c);
    }

    @Override // d1.AbstractC0093a
    public final Object i(Object obj) {
        EnumC0088a enumC0088a = EnumC0088a.f2060a;
        int i = this.f4155e;
        HomeActivity homeActivity = this.f4156f;
        if (i == 0) {
            H1.l.h0(obj);
            C0383v c0383v = (C0383v) homeActivity.f2082z.a();
            this.f4155e = 1;
            obj = c0383v.d(this);
            if (obj == enumC0088a) {
                return enumC0088a;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                H1.l.h0(obj);
                C0367f c0367f = (C0367f) obj;
                int i2 = HomeActivity.f2080A;
                homeActivity.t().f4459f.setText(homeActivity.getString(R.string.streak_label, new Integer(c0367f.f4178b)));
                homeActivity.t().f4456b.setText(homeActivity.getString(R.string.best_streak_label, new Integer(c0367f.f4179c)));
                return X0.g.f1277c;
            }
            H1.l.h0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            homeActivity.startActivity(new Intent(homeActivity, (Class<?>) DefeatActivity.class));
        }
        C0383v c0383v2 = (C0383v) homeActivity.f2082z.a();
        this.f4155e = 2;
        obj = c0383v2.c(this);
        if (obj == enumC0088a) {
            return enumC0088a;
        }
        C0367f c0367f2 = (C0367f) obj;
        int i22 = HomeActivity.f2080A;
        homeActivity.t().f4459f.setText(homeActivity.getString(R.string.streak_label, new Integer(c0367f2.f4178b)));
        homeActivity.t().f4456b.setText(homeActivity.getString(R.string.best_streak_label, new Integer(c0367f2.f4179c)));
        return X0.g.f1277c;
    }
}
