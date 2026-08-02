package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class idq implements idk {
    private static final hkh b = hkh.l("com/google/frameworks/client/data/android/auth/impl/FallbackGoogleTokenProvider");
    public final iel a;
    private final idk c;
    private final koi d;
    private final koi e = new kop(new ggy(this, 10));

    public idq(Context context, dih dihVar, iel ielVar, idk idkVar) {
        this.a = ielVar;
        this.c = idkVar;
        this.d = new kop(new awb(context, this, 15, null));
    }

    private final idm c() {
        return (idm) this.d.a();
    }

    private final boolean d() {
        return ((Boolean) this.e.a()).booleanValue();
    }

    @Override // defpackage.idk
    public final void a(String str) {
        str.getClass();
        gty aC = hoq.aC(283, "FallbackGoogleTokenProvider#clearToken");
        try {
            try {
                this.c.a(str);
            } catch (IOException e) {
                if (d()) {
                    ((hkf) ((hkf) b.g()).h(e).i("com/google/frameworks/client/data/android/auth/impl/FallbackGoogleTokenProvider", "clearToken$<anonymous>", 65, "FallbackGoogleTokenProvider.kt")).s("Failed to clear token from GMS Core, falling back to AccountManager");
                }
                c().a(str);
            }
            ixf.j(aC, null);
        } finally {
        }
    }

    @Override // defpackage.idk
    public final iyi b(Account account, String str) {
        iyi b2;
        gty aC = hoq.aC(284, "FallbackGoogleTokenProvider#getTokenWithDetails");
        try {
            try {
                b2 = this.c.b(account, str);
            } finally {
            }
        } catch (IOException e) {
            if (this.d()) {
                ((hkf) ((hkf) b.g()).h(e).i("com/google/frameworks/client/data/android/auth/impl/FallbackGoogleTokenProvider", "getTokenWithDetails$<anonymous>", 47, "FallbackGoogleTokenProvider.kt")).s("Failed to get token from GMS Core, falling back to AccountManager");
            }
            b2 = this.c().b(account, str);
        }
        ixf.j(aC, null);
        return b2;
    }
}
