package r0;

import com.clutchquizarena.app.ResultActivity;
import com.clutchquizarena.app.db.AppDatabase;
import com.clutchquizarena.app.db.GameSessionDao;
import com.clutchquizarena.app.db.GameSessionEntity;
import o1.AbstractC0299s;
import o1.AbstractC0305y;
import o1.InterfaceC0298q;

/* renamed from: r0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0336q extends Z0.e implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f3470e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ResultActivity f3471f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0336q(ResultActivity resultActivity, X0.d dVar) {
        super(dVar);
        this.f3471f = resultActivity;
    }

    @Override // Z0.e
    public final X0.d a(Object obj, X0.d dVar) {
        return new C0336q(this.f3471f, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        return ((C0336q) a((InterfaceC0298q) obj, (X0.d) obj2)).i(U0.i.f864a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007c A[RETURN] */
    @Override // Z0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj) {
        p1.c cVar;
        C0335p c0335p;
        Y0.a aVar = Y0.a.f1163a;
        int i = this.f3470e;
        ResultActivity resultActivity = this.f3471f;
        if (i == 0) {
            T.d.Q(obj);
            AppDatabase appDatabase = resultActivity.f1723z;
            if (appDatabase == null) {
                g1.f.g("database");
                throw null;
            }
            GameSessionDao gameSessionDao = appDatabase.gameSessionDao();
            this.f3470e = 1;
            if (gameSessionDao.deactivateAll(this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    T.d.Q(obj);
                    return U0.i.f864a;
                }
                T.d.Q(obj);
                u1.d dVar = AbstractC0305y.f3369a;
                cVar = s1.m.f3666a;
                c0335p = new C0335p(resultActivity, null);
                this.f3470e = 3;
                if (AbstractC0299s.m(cVar, c0335p, this) == aVar) {
                    return aVar;
                }
                return U0.i.f864a;
            }
            T.d.Q(obj);
        }
        AppDatabase appDatabase2 = resultActivity.f1723z;
        if (appDatabase2 == null) {
            g1.f.g("database");
            throw null;
        }
        GameSessionDao gameSessionDao2 = appDatabase2.gameSessionDao();
        GameSessionEntity gameSessionEntity = new GameSessionEntity(0L, 0, 3, 0, 0, 10, 0L, 1, true, false, null, 1, null);
        this.f3470e = 2;
        if (gameSessionDao2.insert(gameSessionEntity, this) == aVar) {
            return aVar;
        }
        u1.d dVar2 = AbstractC0305y.f3369a;
        cVar = s1.m.f3666a;
        c0335p = new C0335p(resultActivity, null);
        this.f3470e = 3;
        if (AbstractC0299s.m(cVar, c0335p, this) == aVar) {
        }
        return U0.i.f864a;
    }
}
