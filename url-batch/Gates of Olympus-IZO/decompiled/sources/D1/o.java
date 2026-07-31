package D1;

import android.content.Intent;
import com.gates.olympus.miruv.WorkbenchActivity;
import com.gates.olympus.miruv.tenon.TenonPageActivity;
import i1.C0469f;
import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class o extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TenonPageActivity f565f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(TenonPageActivity tenonPageActivity, P1.d dVar) {
        super(2, dVar);
        this.f565f = tenonPageActivity;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new o(this.f565f, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((o) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f564e;
        TenonPageActivity tenonPageActivity = this.f565f;
        if (i3 == 0) {
            I2.l.Q(obj);
            C c3 = (C) tenonPageActivity.f4431x.getValue();
            this.f564e = 1;
            if (D.a(c3.f520a).h(new C0469f(new w(c3, null), null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        tenonPageActivity.startActivity(new Intent(tenonPageActivity, (Class<?>) WorkbenchActivity.class).addFlags(268468224));
        tenonPageActivity.finish();
        return L1.z.f2729a;
    }
}
