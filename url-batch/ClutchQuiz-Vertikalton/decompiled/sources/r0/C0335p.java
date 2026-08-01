package r0;

import android.content.Intent;
import com.clutchquizarena.app.GameActivity;
import com.clutchquizarena.app.ResultActivity;
import o1.InterfaceC0298q;

/* renamed from: r0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335p extends Z0.e implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ResultActivity f3469e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0335p(ResultActivity resultActivity, X0.d dVar) {
        super(dVar);
        this.f3469e = resultActivity;
    }

    @Override // Z0.e
    public final X0.d a(Object obj, X0.d dVar) {
        return new C0335p(this.f3469e, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        C0335p c0335p = (C0335p) a((InterfaceC0298q) obj, (X0.d) obj2);
        U0.i iVar = U0.i.f864a;
        c0335p.i(iVar);
        return iVar;
    }

    @Override // Z0.e
    public final Object i(Object obj) {
        T.d.Q(obj);
        ResultActivity resultActivity = this.f3469e;
        resultActivity.startActivity(new Intent(resultActivity, (Class<?>) GameActivity.class));
        resultActivity.finish();
        return U0.i.f864a;
    }
}
