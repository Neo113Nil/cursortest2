package r0;

import android.widget.TextView;
import com.clutchquizarena.app.R;
import com.clutchquizarena.app.ResultActivity;
import com.clutchquizarena.app.db.GameSessionEntity;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import l.C0237s;
import o1.InterfaceC0298q;

/* renamed from: r0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0333n extends Z0.e implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ GameSessionEntity f3463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ResultActivity f3464f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3465g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0333n(GameSessionEntity gameSessionEntity, ResultActivity resultActivity, int i, X0.d dVar) {
        super(dVar);
        this.f3463e = gameSessionEntity;
        this.f3464f = resultActivity;
        this.f3465g = i;
    }

    @Override // Z0.e
    public final X0.d a(Object obj, X0.d dVar) {
        return new C0333n(this.f3463e, this.f3464f, this.f3465g, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        return ((C0333n) a((InterfaceC0298q) obj, (X0.d) obj2)).i(U0.i.f864a);
    }

    @Override // Z0.e
    public final Object i(Object obj) {
        T.d.Q(obj);
        U0.i iVar = U0.i.f864a;
        ResultActivity resultActivity = this.f3464f;
        GameSessionEntity gameSessionEntity = this.f3463e;
        if (gameSessionEntity == null) {
            resultActivity.finish();
            return iVar;
        }
        int i = ResultActivity.f1721A;
        resultActivity.getClass();
        if (gameSessionEntity.isWin()) {
            C0237s c0237s = resultActivity.f1722y;
            if (c0237s == null) {
                g1.f.g("binding");
                throw null;
            }
            ((TextView) c0237s.f3044b).setText(resultActivity.getString(R.string.result_win));
            C0237s c0237s2 = resultActivity.f1722y;
            if (c0237s2 == null) {
                g1.f.g("binding");
                throw null;
            }
            ((TextView) c0237s2.f3044b).setTextColor(A.b.a(resultActivity, R.color.win_green));
        } else {
            C0237s c0237s3 = resultActivity.f1722y;
            if (c0237s3 == null) {
                g1.f.g("binding");
                throw null;
            }
            ((TextView) c0237s3.f3044b).setText(resultActivity.getString(R.string.result_lose));
            C0237s c0237s4 = resultActivity.f1722y;
            if (c0237s4 == null) {
                g1.f.g("binding");
                throw null;
            }
            ((TextView) c0237s4.f3044b).setTextColor(A.b.a(resultActivity, R.color.lose_red));
        }
        C0237s c0237s5 = resultActivity.f1722y;
        if (c0237s5 == null) {
            g1.f.g("binding");
            throw null;
        }
        ((TextView) c0237s5.f3046e).setText(resultActivity.getString(R.string.result_score, Integer.valueOf(gameSessionEntity.getScore())));
        C0237s c0237s6 = resultActivity.f1722y;
        if (c0237s6 == null) {
            g1.f.g("binding");
            throw null;
        }
        ((TextView) c0237s6.d).setText(resultActivity.getString(R.string.result_correct, Integer.valueOf(gameSessionEntity.getCorrectAnswers()), Integer.valueOf(gameSessionEntity.getTotalQuestions())));
        C0237s c0237s7 = resultActivity.f1722y;
        if (c0237s7 == null) {
            g1.f.g("binding");
            throw null;
        }
        long elapsedTimeMs = gameSessionEntity.getElapsedTimeMs();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ((TextView) c0237s7.f3047f).setText(resultActivity.getString(R.string.result_time, String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toMinutes(elapsedTimeMs)), Long.valueOf(timeUnit.toSeconds(elapsedTimeMs) % 60)}, 2))));
        C0237s c0237s8 = resultActivity.f1722y;
        if (c0237s8 == null) {
            g1.f.g("binding");
            throw null;
        }
        ((TextView) c0237s8.f3045c).setText(resultActivity.getString(R.string.result_best, Integer.valueOf(this.f3465g)));
        return iVar;
    }
}
