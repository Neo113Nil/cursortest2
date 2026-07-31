package B1;

import D1.m;
import D1.t;
import I2.l;
import L1.z;
import R1.i;
import Y1.e;
import android.content.Intent;
import com.gates.olympus.miruv.WorkbenchActivity;
import com.gates.olympus.miruv.tenon.TenonPageActivity;
import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class c extends i implements e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ WorkbenchActivity f406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f407f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WorkbenchActivity workbenchActivity, t tVar, P1.d dVar) {
        super(2, dVar);
        this.f406e = workbenchActivity;
        this.f407f = tVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new c(this.f406e, this.f407f, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        c cVar = (c) create((InterfaceC0550w) obj, (P1.d) obj2);
        z zVar = z.f2729a;
        cVar.invokeSuspend(zVar);
        return zVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        l.Q(obj);
        m mVar = TenonPageActivity.Companion;
        t tVar = this.f407f;
        String str = tVar.f571a;
        boolean z3 = tVar.f572b;
        mVar.getClass();
        WorkbenchActivity workbenchActivity = this.f406e;
        Z1.i.f(workbenchActivity, "ctx");
        Z1.i.f(str, "url");
        Intent putExtra = new Intent(workbenchActivity, (Class<?>) TenonPageActivity.class).putExtra("extra_url", str).putExtra("extra_consent", z3);
        Z1.i.e(putExtra, "putExtra(...)");
        workbenchActivity.startActivity(putExtra);
        workbenchActivity.finish();
        return z.f2729a;
    }
}
