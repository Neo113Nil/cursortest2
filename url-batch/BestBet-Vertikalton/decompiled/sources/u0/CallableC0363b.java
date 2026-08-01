package u0;

import android.database.Cursor;
import c1.AbstractC0091d;
import com.fortunequest.neontrack.data.FortuneQuestDatabase_Impl;
import java.util.concurrent.Callable;
import l0.C0276c;
import l0.C0283j;

/* renamed from: u0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0363b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4168a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4169b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4170c;

    public /* synthetic */ CallableC0363b(Object obj, int i, Object obj2) {
        this.f4168a = i;
        this.f4170c = obj;
        this.f4169b = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FortuneQuestDatabase_Impl fortuneQuestDatabase_Impl;
        C0362a c0362a;
        C0283j a2;
        switch (this.f4168a) {
            case 0:
                C0365d c0365d = (C0365d) this.f4170c;
                fortuneQuestDatabase_Impl = (FortuneQuestDatabase_Impl) c0365d.f4175b;
                fortuneQuestDatabase_Impl.a();
                fortuneQuestDatabase_Impl.a();
                C0276c m2 = fortuneQuestDatabase_Impl.f().m();
                fortuneQuestDatabase_Impl.f2099e.c(m2);
                if (m2.s()) {
                    m2.d();
                } else {
                    m2.a();
                }
                try {
                    c0362a = (C0362a) c0365d.f4176c;
                    C0368g c0368g = (C0368g) this.f4169b;
                    a2 = c0362a.a();
                    try {
                        c0362a.p(a2, c0368g);
                        a2.a();
                        c0362a.n(a2);
                        fortuneQuestDatabase_Impl.f().m().v();
                        fortuneQuestDatabase_Impl.j();
                        return X0.g.f1277c;
                    } finally {
                    }
                } finally {
                }
            case 1:
                C0372k c0372k = (C0372k) this.f4170c;
                fortuneQuestDatabase_Impl = (FortuneQuestDatabase_Impl) c0372k.f4190a;
                fortuneQuestDatabase_Impl.a();
                fortuneQuestDatabase_Impl.a();
                C0276c m3 = fortuneQuestDatabase_Impl.f().m();
                fortuneQuestDatabase_Impl.f2099e.c(m3);
                if (m3.s()) {
                    m3.d();
                } else {
                    m3.a();
                }
                try {
                    c0362a = (C0362a) c0372k.f4191b;
                    C0373l c0373l = (C0373l) this.f4169b;
                    a2 = c0362a.a();
                    try {
                        c0362a.p(a2, c0373l);
                        long a3 = a2.a();
                        c0362a.n(a2);
                        Long valueOf = Long.valueOf(a3);
                        fortuneQuestDatabase_Impl.f().m().v();
                        return valueOf;
                    } finally {
                    }
                } finally {
                }
            case 2:
                C0385x c0385x = (C0385x) this.f4170c;
                fortuneQuestDatabase_Impl = (FortuneQuestDatabase_Impl) c0385x.f4231b;
                fortuneQuestDatabase_Impl.a();
                fortuneQuestDatabase_Impl.a();
                C0276c m4 = fortuneQuestDatabase_Impl.f().m();
                fortuneQuestDatabase_Impl.f2099e.c(m4);
                if (m4.s()) {
                    m4.d();
                } else {
                    m4.a();
                }
                try {
                    c0362a = (C0362a) c0385x.f4232c;
                    C0386y c0386y = (C0386y) this.f4169b;
                    a2 = c0362a.a();
                    try {
                        c0362a.p(a2, c0386y);
                        a2.a();
                        c0362a.n(a2);
                        fortuneQuestDatabase_Impl.f().m().v();
                        fortuneQuestDatabase_Impl.j();
                        return X0.g.f1277c;
                    } finally {
                    }
                } finally {
                }
            default:
                FortuneQuestDatabase_Impl fortuneQuestDatabase_Impl2 = (FortuneQuestDatabase_Impl) ((C0385x) this.f4170c).f4231b;
                h0.p pVar = (h0.p) this.f4169b;
                Cursor l2 = fortuneQuestDatabase_Impl2.l(pVar, null);
                try {
                    return l2.moveToFirst() ? new C0386y(l2.getInt(AbstractC0091d.i(l2, "id")), l2.getInt(AbstractC0091d.i(l2, "currentStreak")), l2.getInt(AbstractC0091d.i(l2, "bestStreak")), l2.getLong(AbstractC0091d.i(l2, "lastCompletedDay")), l2.getLong(AbstractC0091d.i(l2, "lastOpenedDay")), l2.getInt(AbstractC0091d.i(l2, "graceRemaining")), l2.getFloat(AbstractC0091d.i(l2, "multiplier"))) : null;
                } finally {
                    l2.close();
                    pVar.k();
                }
        }
    }
}
