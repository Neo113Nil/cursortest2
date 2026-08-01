package r0;

import com.clutchquizarena.app.MainActivity;
import com.clutchquizarena.app.db.AppDatabase;
import com.clutchquizarena.app.db.GameSessionEntity;
import o1.InterfaceC0298q;

/* renamed from: r0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0332m extends Z0.e implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f3461e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MainActivity f3462f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0332m(MainActivity mainActivity, X0.d dVar) {
        super(dVar);
        this.f3462f = mainActivity;
    }

    @Override // Z0.e
    public final X0.d a(Object obj, X0.d dVar) {
        return new C0332m(this.f3462f, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        return ((C0332m) a((InterfaceC0298q) obj, (X0.d) obj2)).i(U0.i.f864a);
    }

    @Override // Z0.e
    public final Object i(Object obj) {
        Y0.a aVar = Y0.a.f1163a;
        int i = this.f3461e;
        U0.i iVar = U0.i.f864a;
        MainActivity mainActivity = this.f3462f;
        if (i == 0) {
            T.d.Q(obj);
            this.f3461e = 1;
            AppDatabase appDatabase = mainActivity.f1720z;
            if (appDatabase == null) {
                g1.f.g("database");
                throw null;
            }
            Object deactivateAll = appDatabase.gameSessionDao().deactivateAll(this);
            if (deactivateAll != aVar) {
                deactivateAll = iVar;
            }
            if (deactivateAll == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                T.d.Q(obj);
                mainActivity.runOnUiThread(new B0.b(11, mainActivity));
                return iVar;
            }
            T.d.Q(obj);
        }
        GameSessionEntity gameSessionEntity = new GameSessionEntity(0L, 0, 3, 0, 0, 10, 0L, 1, true, false, null, 1, null);
        this.f3461e = 2;
        AppDatabase appDatabase2 = mainActivity.f1720z;
        if (appDatabase2 == null) {
            g1.f.g("database");
            throw null;
        }
        if (appDatabase2.gameSessionDao().insert(gameSessionEntity, this) == aVar) {
            return aVar;
        }
        mainActivity.runOnUiThread(new B0.b(11, mainActivity));
        return iVar;
    }
}
