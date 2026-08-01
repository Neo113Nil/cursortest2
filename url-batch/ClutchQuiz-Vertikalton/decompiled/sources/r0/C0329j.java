package r0;

import com.clutchquizarena.app.GameActivity;
import com.clutchquizarena.app.db.AppDatabase;
import com.clutchquizarena.app.db.GameSessionDao;
import com.clutchquizarena.app.db.GameSessionEntity;
import o1.AbstractC0299s;
import o1.AbstractC0305y;
import o1.InterfaceC0298q;

/* renamed from: r0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0329j extends Z0.e implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f3455e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ GameActivity f3456f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ GameSessionEntity f3457g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0329j(X0.d dVar, GameActivity gameActivity, GameSessionEntity gameSessionEntity) {
        super(dVar);
        this.f3456f = gameActivity;
        this.f3457g = gameSessionEntity;
    }

    @Override // Z0.e
    public final X0.d a(Object obj, X0.d dVar) {
        return new C0329j(dVar, this.f3456f, this.f3457g);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        return ((C0329j) a((InterfaceC0298q) obj, (X0.d) obj2)).i(U0.i.f864a);
    }

    @Override // Z0.e
    public final Object i(Object obj) {
        Y0.a aVar = Y0.a.f1163a;
        int i = this.f3455e;
        GameSessionEntity gameSessionEntity = this.f3457g;
        GameActivity gameActivity = this.f3456f;
        if (i == 0) {
            T.d.Q(obj);
            AppDatabase appDatabase = gameActivity.f1717z;
            if (appDatabase == null) {
                g1.f.g("database");
                throw null;
            }
            GameSessionDao gameSessionDao = appDatabase.gameSessionDao();
            this.f3455e = 1;
            if (gameSessionDao.update(gameSessionEntity, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                T.d.Q(obj);
                return U0.i.f864a;
            }
            T.d.Q(obj);
        }
        u1.d dVar = AbstractC0305y.f3369a;
        p1.c cVar = s1.m.f3666a;
        C0328i c0328i = new C0328i(null, gameActivity, gameSessionEntity);
        this.f3455e = 2;
        if (AbstractC0299s.m(cVar, c0328i, this) == aVar) {
            return aVar;
        }
        return U0.i.f864a;
    }
}
