package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class f9 extends g9 {
    public final Context d;

    public f9(Context context, n8 n8Var, q8 q8Var, x8 x8Var) {
        super(n8Var, q8Var, x8Var);
        this.d = context;
    }

    @Override // com.startapp.sdk.internal.g9
    public final int a() {
        String str;
        e9 e9Var = new e9(this.f250a);
        e9Var.c(this.d);
        String str2 = this.f250a.c;
        if (str2 != null && str2.length() > 0) {
            e9Var.c = str2;
        }
        if ((this.b.b & 32) != 0) {
            try {
                com.startapp.sdk.adsbase.g.e(this.d);
            } catch (Throwable th) {
                if (this.f250a.f348a != o8.f) {
                    n8.a(th);
                }
            }
        }
        if ((this.b.b & 8) != 0) {
            try {
                e9Var.r0 = ((sg) ((vg) com.startapp.sdk.components.a.a(this.d).e.a()).b()).a(6);
            } catch (Throwable th2) {
                if (this.f250a.f348a != o8.f) {
                    n8.a(th2);
                }
            }
        }
        c8 c8Var = null;
        if ((this.b.b & 1) != 0) {
            try {
                e9Var.b(this.d, null);
            } catch (Throwable th3) {
                if (this.f250a.f348a != o8.f) {
                    n8.a(th3);
                }
            }
        }
        if ((this.b.b & 2) != 0) {
            try {
                e9Var.d(this.d);
            } catch (Throwable th4) {
                if (this.f250a.f348a != o8.f) {
                    n8.a(th4);
                }
            }
        }
        if ((this.b.b & 4) != 0) {
            try {
                e9Var.e(this.d);
            } catch (Throwable th5) {
                if (this.f250a.f348a != o8.f) {
                    n8.a(th5);
                }
            }
        }
        if ((this.b.b & 16) != 0) {
            try {
                e9Var.a(this.d);
            } catch (Throwable th6) {
                if (this.f250a.f348a != o8.f) {
                    n8.a(th6);
                }
            }
        }
        if ((this.b.b & 1024) != 0) {
            try {
                e9Var.b(this.d);
            } catch (Throwable th7) {
                if (this.f250a.f348a != o8.f) {
                    n8.a(th7);
                }
            }
        }
        if ((this.b.b & 128) != 0) {
            try {
                String str3 = (String) ((f2) com.startapp.sdk.components.a.a(this.d).q.a()).b();
                if (str3 != null) {
                    e9Var.t0 = g.b(str3);
                }
            } catch (Throwable th8) {
                if (this.f250a.f348a != o8.f) {
                    n8.a(th8);
                }
            }
        }
        if ((this.b.b & 256) != 0) {
            try {
                String str4 = (String) ((sf) com.startapp.sdk.components.a.a(this.d).s.a()).b();
                if (str4 != null) {
                    e9Var.s0 = g.b(str4);
                }
            } catch (Throwable th9) {
                if (this.f250a.f348a != o8.f) {
                    n8.a(th9);
                }
            }
        }
        if ((this.b.b & 512) != 0) {
            try {
                e9Var.Y = ((k0) com.startapp.sdk.components.a.a(this.d).o.a()).a();
            } catch (Throwable th10) {
                if (this.f250a.f348a != o8.f) {
                    n8.a(th10);
                }
            }
        }
        if ((this.b.b & 2048) != 0) {
            try {
                e9Var.u0 = ((eh) com.startapp.sdk.components.a.a(this.d).f.a()).a(this.f250a.f348a);
            } catch (Throwable th11) {
                if (this.f250a.f348a != o8.f) {
                    n8.a(th11);
                }
            }
        }
        try {
            e9Var.J = ((me) com.startapp.sdk.components.a.a(this.d).h.a()).a(e9Var);
        } catch (Throwable th12) {
            if (this.f250a.f348a != o8.f) {
                n8.a(th12);
            }
        }
        AnalyticsConfig g = MetaData.A().g();
        if (g != null) {
            str = this.f250a.f348a == o8.i ? g.e() : null;
            if (str == null) {
                str = g.d();
            }
        } else {
            str = null;
        }
        if (str == null) {
            str = AnalyticsConfig.f150a;
        }
        z7 z7Var = (z7) com.startapp.sdk.components.a.a(this.d).m.a();
        y7 y7Var = new y7(z7Var, str);
        y7Var.c = e9Var.a(((HttpClientConfig) z7Var.f.a()).e());
        y7Var.d = z7Var.a(e9Var.Z);
        try {
            c8Var = z7Var.b(y7Var);
        } catch (Throwable th13) {
            if (z7Var.b(4)) {
                n8.a(th13);
            }
        }
        return (c8Var == null || c8Var.b == null) ? 0 : 1;
    }
}
