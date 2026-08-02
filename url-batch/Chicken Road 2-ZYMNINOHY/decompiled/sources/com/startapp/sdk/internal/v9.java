package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.insight.NetworkTestsMetaData;

/* loaded from: classes.dex */
public final class v9 extends w9 {

    /* renamed from: d, reason: collision with root package name */
    public final Context f7748d;

    public v9(Context context, d9 d9Var, g9 g9Var, n9 n9Var) {
        super(d9Var, g9Var, n9Var);
        this.f7748d = context;
    }

    @Override // com.startapp.sdk.internal.w9
    public final int a() {
        u9 u9Var = new u9(this.f7817a);
        u9Var.c(this.f7748d);
        String str = this.f7817a.f6791c;
        if (str != null && str.length() > 0) {
            u9Var.f7915c = str;
        }
        if ((this.f7818b.f6979b & 32) != 0) {
            try {
                com.startapp.sdk.adsbase.g.e(this.f7748d);
            } catch (Throwable th) {
                if (this.f7817a.f6789a != e9.f6840f) {
                    d9.a(th);
                }
            }
        }
        if ((this.f7818b.f6979b & 8) != 0) {
            try {
                u9Var.f7690r0 = ((jh) ((mh) com.startapp.sdk.components.a.a(this.f7748d).f6565f.a()).b()).a(6);
            } catch (Throwable th2) {
                if (this.f7817a.f6789a != e9.f6840f) {
                    d9.a(th2);
                }
            }
        }
        String str2 = null;
        if ((this.f7818b.f6979b & 1) != 0) {
            try {
                u9Var.b(this.f7748d, null);
            } catch (Throwable th3) {
                if (this.f7817a.f6789a != e9.f6840f) {
                    d9.a(th3);
                }
            }
        }
        if ((this.f7818b.f6979b & 2) != 0) {
            try {
                u9Var.d(this.f7748d);
            } catch (Throwable th4) {
                if (this.f7817a.f6789a != e9.f6840f) {
                    d9.a(th4);
                }
            }
        }
        if ((this.f7818b.f6979b & 4) != 0) {
            try {
                u9Var.e(this.f7748d);
            } catch (Throwable th5) {
                if (this.f7817a.f6789a != e9.f6840f) {
                    d9.a(th5);
                }
            }
        }
        if ((this.f7818b.f6979b & 16) != 0) {
            try {
                u9Var.a(this.f7748d);
            } catch (Throwable th6) {
                if (this.f7817a.f6789a != e9.f6840f) {
                    d9.a(th6);
                }
            }
        }
        if ((this.f7818b.f6979b & 1024) != 0) {
            try {
                u9Var.b(this.f7748d);
            } catch (Throwable th7) {
                if (this.f7817a.f6789a != e9.f6840f) {
                    d9.a(th7);
                }
            }
        }
        if ((this.f7818b.f6979b & 128) != 0) {
            try {
                String str3 = (String) ((l2) com.startapp.sdk.components.a.a(this.f7748d).f6575r.a()).b();
                if (str3 != null) {
                    u9Var.f7692t0 = AbstractC0366g.b(str3);
                }
            } catch (Throwable th8) {
                if (this.f7817a.f6789a != e9.f6840f) {
                    d9.a(th8);
                }
            }
        }
        if ((this.f7818b.f6979b & 256) != 0) {
            try {
                String str4 = (String) ((jg) com.startapp.sdk.components.a.a(this.f7748d).f6576s.a()).b();
                if (str4 != null) {
                    u9Var.f7691s0 = AbstractC0366g.b(str4);
                }
            } catch (Throwable th9) {
                if (this.f7817a.f6789a != e9.f6840f) {
                    d9.a(th9);
                }
            }
        }
        if ((this.f7818b.f6979b & 512) != 0) {
            try {
                u9Var.f7909Y = ((n0) com.startapp.sdk.components.a.a(this.f7748d).f6573p.a()).a();
            } catch (Throwable th10) {
                if (this.f7817a.f6789a != e9.f6840f) {
                    d9.a(th10);
                }
            }
        }
        if ((this.f7818b.f6979b & 2048) != 0) {
            try {
                u9Var.f7693u0 = ((vh) com.startapp.sdk.components.a.a(this.f7748d).f6566g.a()).a(this.f7817a.f6789a);
            } catch (Throwable th11) {
                if (this.f7817a.f6789a != e9.f6840f) {
                    d9.a(th11);
                }
            }
        }
        try {
            u9Var.f7895J = ((ef) com.startapp.sdk.components.a.a(this.f7748d).f6568i.a()).a(u9Var);
        } catch (Throwable th12) {
            if (this.f7817a.f6789a != e9.f6840f) {
                d9.a(th12);
            }
        }
        AnalyticsConfig h2 = MetaData.E().h();
        NetworkTestsMetaData L = MetaData.E().L();
        e9 e9Var = this.f7817a.f6789a;
        if (e9Var == e9.f6847m) {
            if (L != null) {
                str2 = L.a();
            }
        } else if (e9Var == e9.n) {
            if (L != null) {
                str2 = L.b();
            }
        } else if (e9Var == e9.o) {
            if (L != null) {
                str2 = L.c();
            }
        } else if (e9Var == e9.f6843i) {
            str2 = h2.e();
        }
        if (str2 == null) {
            str2 = h2.d();
        }
        o8 o8Var = (o8) com.startapp.sdk.components.a.a(this.f7748d).n.a();
        n8 n8Var = new n8(o8Var, str2);
        n8Var.f7327c = u9Var.a(((HttpClientConfig) o8Var.f7374f.a()).e());
        n8Var.f7328d = ((HttpClientConfig) o8Var.f7374f.a()).a(u9Var.f7910Z);
        r8 b4 = n8Var.b();
        return (b4 == null || b4.f7523b == null) ? 0 : 1;
    }
}
