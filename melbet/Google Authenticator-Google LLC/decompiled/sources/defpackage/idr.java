package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.auth.TokenData;
import j$.time.Instant;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class idr implements idk {
    private final Optional a;
    private final Context b;
    private final iel c;

    public idr(Optional optional, Context context, iel ielVar) {
        gty aC = hoq.aC(285, "GoogleGmsCoreTokenProviderImpl#<init>");
        try {
            this.a = optional;
            this.b = context;
            this.c = ielVar;
            aC.close();
        } catch (Throwable th) {
            try {
                aC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.idk
    public final void a(String str) {
        try {
            gty aC = hoq.aC(286, "GoogleGmsCoreTokenProviderImpl#clearToken");
            try {
                Context context = this.b;
                long c = this.c.c();
                String str2 = chi.a;
                long currentTimeMillis = System.currentTimeMillis();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                bvw h = bvw.h(context);
                try {
                    oy.ao("Calling this from your main thread can lead to deadlock");
                    cho.e(context, 8400000);
                    Bundle bundle = new Bundle();
                    cho.f(context, bundle);
                    cho.b(context, cho.d, new chl(str, bundle), c, null);
                    h.g(1707, 0, currentTimeMillis, System.currentTimeMillis(), elapsedRealtime);
                    aC.close();
                } catch (Exception e) {
                    h.g(1707, 13, currentTimeMillis, System.currentTimeMillis(), elapsedRealtime);
                    throw e;
                }
            } finally {
            }
        } catch (chh e2) {
            throw new idi(e2);
        }
    }

    @Override // defpackage.idk
    public final iyi b(Account account, String str) {
        try {
            gty aC = hoq.aC(287, "GoogleGmsCoreTokenProviderImpl#getTokenWithDetails");
            try {
                iel ielVar = this.c;
                TokenData a = chi.a(this.b, account, str, null, ielVar.c(), ielVar.o() ? (Executor) this.a.orElse(null) : null);
                String str2 = a.b;
                Instant now = Instant.now();
                Optional ofNullable = Optional.ofNullable(a.c);
                if (true == ofNullable.isPresent()) {
                    ofNullable = Optional.ofNullable(Instant.ofEpochSecond(((Long) ofNullable.get()).longValue()));
                }
                iyi iyiVar = new iyi(str2, now, (Instant) ofNullable.orElse(null));
                aC.close();
                return iyiVar;
            } finally {
            }
        } catch (chh e) {
            throw new idi(e);
        }
    }
}
