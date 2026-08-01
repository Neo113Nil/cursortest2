package u0;

import com.fortunequest.neontrack.data.FortuneQuestDatabase_Impl;
import l0.C0283j;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0362a extends h0.r {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0362a(FortuneQuestDatabase_Impl fortuneQuestDatabase_Impl, int i) {
        super(fortuneQuestDatabase_Impl);
        this.d = i;
    }

    @Override // h0.r
    public final String l() {
        switch (this.d) {
            case 0:
                return "INSERT OR REPLACE INTO `completions` (`habitId`,`dayEpoch`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `habits` (`id`,`title`,`symbolIndex`,`createdAt`,`active`) VALUES (nullif(?, 0),?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `streak_state` (`id`,`currentStreak`,`bestStreak`,`lastCompletedDay`,`lastOpenedDay`,`graceRemaining`,`multiplier`) VALUES (?,?,?,?,?,?,?)";
        }
    }

    public final void p(C0283j c0283j, Object obj) {
        switch (this.d) {
            case 0:
                C0368g c0368g = (C0368g) obj;
                c0283j.n(1, c0368g.f4183a);
                c0283j.n(2, c0368g.f4184b);
                break;
            case 1:
                C0373l c0373l = (C0373l) obj;
                c0283j.n(1, c0373l.f4193a);
                String str = c0373l.f4194b;
                if (str == null) {
                    c0283j.f(2);
                } else {
                    c0283j.g(str, 2);
                }
                c0283j.n(3, c0373l.f4195c);
                c0283j.n(4, c0373l.d);
                c0283j.n(5, c0373l.f4196e ? 1L : 0L);
                break;
            default:
                C0386y c0386y = (C0386y) obj;
                c0283j.n(1, c0386y.f4233a);
                c0283j.n(2, c0386y.f4234b);
                c0283j.n(3, c0386y.f4235c);
                c0283j.n(4, c0386y.d);
                c0283j.n(5, c0386y.f4236e);
                c0283j.n(6, c0386y.f4237f);
                c0283j.h(7, c0386y.f4238g);
                break;
        }
    }
}
