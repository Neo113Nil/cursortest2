package r0;

import android.content.Intent;
import com.clutchquizarena.app.GameActivity;
import com.clutchquizarena.app.ResultActivity;
import o1.InterfaceC0298q;

/* renamed from: r0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0322c extends Z0.e implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ GameActivity f3441e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0322c(GameActivity gameActivity, X0.d dVar) {
        super(dVar);
        this.f3441e = gameActivity;
    }

    @Override // Z0.e
    public final X0.d a(Object obj, X0.d dVar) {
        return new C0322c(this.f3441e, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        C0322c c0322c = (C0322c) a((InterfaceC0298q) obj, (X0.d) obj2);
        U0.i iVar = U0.i.f864a;
        c0322c.i(iVar);
        return iVar;
    }

    @Override // Z0.e
    public final Object i(Object obj) {
        T.d.Q(obj);
        int i = GameActivity.F;
        GameActivity gameActivity = this.f3441e;
        gameActivity.getClass();
        gameActivity.startActivity(new Intent(gameActivity, (Class<?>) ResultActivity.class));
        gameActivity.finish();
        return U0.i.f864a;
    }
}
