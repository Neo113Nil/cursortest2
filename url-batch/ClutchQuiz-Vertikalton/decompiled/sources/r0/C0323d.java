package r0;

import com.clutchquizarena.app.GameActivity;
import com.clutchquizarena.app.db.AppDatabase;
import com.clutchquizarena.app.db.GameSessionDao;
import com.clutchquizarena.app.db.GameSessionEntity;
import o1.AbstractC0299s;
import o1.AbstractC0305y;
import o1.InterfaceC0298q;

/* renamed from: r0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323d extends Z0.e implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f3442e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ GameActivity f3443f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ GameSessionEntity f3444g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0323d(GameActivity gameActivity, GameSessionEntity gameSessionEntity, boolean z2, X0.d dVar) {
        super(dVar);
        this.f3443f = gameActivity;
        this.f3444g = gameSessionEntity;
        this.h = z2;
    }

    @Override // Z0.e
    public final X0.d a(Object obj, X0.d dVar) {
        return new C0323d(this.f3443f, this.f3444g, this.h, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        return ((C0323d) a((InterfaceC0298q) obj, (X0.d) obj2)).i(U0.i.f864a);
    }

    @Override // Z0.e
    public final Object i(Object obj) {
        GameSessionEntity copy;
        Y0.a aVar = Y0.a.f1163a;
        int i = this.f3442e;
        GameActivity gameActivity = this.f3443f;
        if (i == 0) {
            T.d.Q(obj);
            long currentTimeMillis = System.currentTimeMillis();
            copy = r13.copy((r28 & 1) != 0 ? r13.id : 0L, (r28 & 2) != 0 ? r13.score : 0, (r28 & 4) != 0 ? r13.lives : 0, (r28 & 8) != 0 ? r13.currentQuestionIndex : 0, (r28 & 16) != 0 ? r13.correctAnswers : 0, (r28 & 32) != 0 ? r13.totalQuestions : 0, (r28 & 64) != 0 ? r13.elapsedTimeMs : System.currentTimeMillis() - gameActivity.f1713C, (r28 & 128) != 0 ? r13.level : 0, (r28 & 256) != 0 ? r13.isActive : false, (r28 & 512) != 0 ? r13.isWin : this.h, (r28 & 1024) != 0 ? this.f3444g.finishedAt : new Long(currentTimeMillis));
            AppDatabase appDatabase = gameActivity.f1717z;
            if (appDatabase == null) {
                g1.f.g("database");
                throw null;
            }
            GameSessionDao gameSessionDao = appDatabase.gameSessionDao();
            this.f3442e = 1;
            if (gameSessionDao.update(copy, this) == aVar) {
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
        C0322c c0322c = new C0322c(gameActivity, null);
        this.f3442e = 2;
        if (AbstractC0299s.m(cVar, c0322c, this) == aVar) {
            return aVar;
        }
        return U0.i.f864a;
    }
}
