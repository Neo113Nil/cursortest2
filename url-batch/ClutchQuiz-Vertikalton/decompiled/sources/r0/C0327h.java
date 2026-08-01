package r0;

import com.clutchquizarena.app.GameActivity;
import com.clutchquizarena.app.db.AppDatabase;
import com.clutchquizarena.app.db.GameSessionDao;
import com.clutchquizarena.app.db.GameSessionEntity;
import o1.AbstractC0299s;
import o1.AbstractC0305y;
import o1.InterfaceC0298q;

/* renamed from: r0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327h extends Z0.e implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public GameActivity f3450e;

    /* renamed from: f, reason: collision with root package name */
    public int f3451f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ GameActivity f3452g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0327h(GameActivity gameActivity, X0.d dVar) {
        super(dVar);
        this.f3452g = gameActivity;
    }

    @Override // Z0.e
    public final X0.d a(Object obj, X0.d dVar) {
        return new C0327h(this.f3452g, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        return ((C0327h) a((InterfaceC0298q) obj, (X0.d) obj2)).i(U0.i.f864a);
    }

    @Override // Z0.e
    public final Object i(Object obj) {
        GameActivity gameActivity;
        Y0.a aVar = Y0.a.f1163a;
        int i = this.f3451f;
        GameActivity gameActivity2 = this.f3452g;
        if (i == 0) {
            T.d.Q(obj);
            AppDatabase appDatabase = gameActivity2.f1717z;
            if (appDatabase == null) {
                g1.f.g("database");
                throw null;
            }
            GameSessionDao gameSessionDao = appDatabase.gameSessionDao();
            this.f3450e = gameActivity2;
            this.f3451f = 1;
            obj = gameSessionDao.getActiveSession(this);
            if (obj == aVar) {
                return aVar;
            }
            gameActivity = gameActivity2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                T.d.Q(obj);
                return U0.i.f864a;
            }
            gameActivity = this.f3450e;
            T.d.Q(obj);
        }
        gameActivity.f1711A = (GameSessionEntity) obj;
        u1.d dVar = AbstractC0305y.f3369a;
        p1.c cVar = s1.m.f3666a;
        C0326g c0326g = new C0326g(gameActivity2, null);
        this.f3450e = null;
        this.f3451f = 2;
        if (AbstractC0299s.m(cVar, c0326g, this) == aVar) {
            return aVar;
        }
        return U0.i.f864a;
    }
}
