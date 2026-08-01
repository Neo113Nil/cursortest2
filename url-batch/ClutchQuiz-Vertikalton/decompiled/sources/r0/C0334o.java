package r0;

import com.clutchquizarena.app.ResultActivity;
import com.clutchquizarena.app.db.AppDatabase;
import com.clutchquizarena.app.db.GameSessionDao;
import com.clutchquizarena.app.db.GameSessionEntity;
import java.util.List;
import o1.AbstractC0299s;
import o1.AbstractC0305y;
import o1.InterfaceC0298q;

/* renamed from: r0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0334o extends Z0.e implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public GameSessionEntity f3466e;

    /* renamed from: f, reason: collision with root package name */
    public int f3467f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ResultActivity f3468g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0334o(ResultActivity resultActivity, X0.d dVar) {
        super(dVar);
        this.f3468g = resultActivity;
    }

    @Override // Z0.e
    public final X0.d a(Object obj, X0.d dVar) {
        return new C0334o(this.f3468g, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        return ((C0334o) a((InterfaceC0298q) obj, (X0.d) obj2)).i(U0.i.f864a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083 A[RETURN] */
    @Override // Z0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj) {
        GameSessionEntity gameSessionEntity;
        p1.c cVar;
        C0333n c0333n;
        Y0.a aVar = Y0.a.f1163a;
        int i = this.f3467f;
        ResultActivity resultActivity = this.f3468g;
        if (i == 0) {
            T.d.Q(obj);
            AppDatabase appDatabase = resultActivity.f1723z;
            if (appDatabase == null) {
                g1.f.g("database");
                throw null;
            }
            GameSessionDao gameSessionDao = appDatabase.gameSessionDao();
            this.f3467f = 1;
            obj = gameSessionDao.getAllFinished(this);
            if (obj == aVar) {
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
                gameSessionEntity = this.f3466e;
                T.d.Q(obj);
                Integer num = (Integer) obj;
                int intValue = num != null ? num.intValue() : 0;
                u1.d dVar = AbstractC0305y.f3369a;
                cVar = s1.m.f3666a;
                c0333n = new C0333n(gameSessionEntity, resultActivity, intValue, null);
                this.f3466e = null;
                this.f3467f = 3;
                if (AbstractC0299s.m(cVar, c0333n, this) == aVar) {
                    return aVar;
                }
                return U0.i.f864a;
            }
            T.d.Q(obj);
        }
        List list = (List) obj;
        g1.f.e(list, "<this>");
        gameSessionEntity = (GameSessionEntity) (list.isEmpty() ? null : list.get(0));
        AppDatabase appDatabase2 = resultActivity.f1723z;
        if (appDatabase2 == null) {
            g1.f.g("database");
            throw null;
        }
        GameSessionDao gameSessionDao2 = appDatabase2.gameSessionDao();
        this.f3466e = gameSessionEntity;
        this.f3467f = 2;
        obj = gameSessionDao2.getBestScore(this);
        if (obj == aVar) {
            return aVar;
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
        }
        u1.d dVar2 = AbstractC0305y.f3369a;
        cVar = s1.m.f3666a;
        c0333n = new C0333n(gameSessionEntity, resultActivity, intValue, null);
        this.f3466e = null;
        this.f3467f = 3;
        if (AbstractC0299s.m(cVar, c0333n, this) == aVar) {
        }
        return U0.i.f864a;
    }
}
