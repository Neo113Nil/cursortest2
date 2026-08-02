package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.insight.NetworkTestsMetaData;

/* loaded from: classes.dex */
public final class v9 extends w9 {

    /* renamed from: d, reason: collision with root package name */
    public final Context f4606d;

    public v9(Context context, d9 d9Var, g9 g9Var, n9 n9Var) {
        super(d9Var, g9Var, n9Var);
        this.f4606d = context;
    }

    @Override // com.startapp.sdk.internal.w9
    public final int a() {
        u9 u9Var = new u9(this.f4672a);
        u9Var.c(this.f4606d);
        String str = this.f4672a.f3679c;
        if (str != null && str.length() > 0) {
            u9Var.f4769c = str;
        }
        if ((this.f4673b.f3859b & 32) != 0) {
            try {
                com.startapp.sdk.adsbase.g.e(this.f4606d);
            } catch (Throwable th) {
                if (this.f4672a.f3677a != e9.f) {
                    d9.a(th);
                }
            }
        }
        if ((this.f4673b.f3859b & 8) != 0) {
            try {
                u9Var.f4549r0 = ((jh) ((mh) com.startapp.sdk.components.a.a(this.f4606d).f.a()).b()).a(6);
            } catch (Throwable th2) {
                if (this.f4672a.f3677a != e9.f) {
                    d9.a(th2);
                }
            }
        }
        String str2 = null;
        if ((this.f4673b.f3859b & 1) != 0) {
            try {
                u9Var.b(this.f4606d, null);
            } catch (Throwable th3) {
                if (this.f4672a.f3677a != e9.f) {
                    d9.a(th3);
                }
            }
        }
        if ((this.f4673b.f3859b & 2) != 0) {
            try {
                u9Var.d(this.f4606d);
            } catch (Throwable th4) {
                if (this.f4672a.f3677a != e9.f) {
                    d9.a(th4);
                }
            }
        }
        if ((this.f4673b.f3859b & 4) != 0) {
            try {
                u9Var.e(this.f4606d);
            } catch (Throwable th5) {
                if (this.f4672a.f3677a != e9.f) {
                    d9.a(th5);
                }
            }
        }
        if ((this.f4673b.f3859b & 16) != 0) {
            try {
                u9Var.a(this.f4606d);
            } catch (Throwable th6) {
                if (this.f4672a.f3677a != e9.f) {
                    d9.a(th6);
                }
            }
        }
        if ((this.f4673b.f3859b & 1024) != 0) {
            try {
                u9Var.b(this.f4606d);
            } catch (Throwable th7) {
                if (this.f4672a.f3677a != e9.f) {
                    d9.a(th7);
                }
            }
        }
        if ((this.f4673b.f3859b & 128) != 0) {
            try {
                String str3 = (String) ((l2) com.startapp.sdk.components.a.a(this.f4606d).f3477r.a()).b();
                if (str3 != null) {
                    u9Var.f4551t0 = AbstractC0288g.b(str3);
                }
            } catch (Throwable th8) {
                if (this.f4672a.f3677a != e9.f) {
                    d9.a(th8);
                }
            }
        }
        if ((this.f4673b.f3859b & 256) != 0) {
            try {
                String str4 = (String) ((jg) com.startapp.sdk.components.a.a(this.f4606d).f3478s.a()).b();
                if (str4 != null) {
                    u9Var.f4550s0 = AbstractC0288g.b(str4);
                }
            } catch (Throwable th9) {
                if (this.f4672a.f3677a != e9.f) {
                    d9.a(th9);
                }
            }
        }
        if ((this.f4673b.f3859b & 512) != 0) {
            try {
                u9Var.f4763Y = ((n0) com.startapp.sdk.components.a.a(this.f4606d).f3475p.a()).a();
            } catch (Throwable th10) {
                if (this.f4672a.f3677a != e9.f) {
                    d9.a(th10);
                }
            }
        }
        if ((this.f4673b.f3859b & 2048) != 0) {
            try {
                u9Var.f4552u0 = ((vh) com.startapp.sdk.components.a.a(this.f4606d).f3467g.a()).a(this.f4672a.f3677a);
            } catch (Throwable th11) {
                if (this.f4672a.f3677a != e9.f) {
                    d9.a(th11);
                }
            }
        }
        try {
            u9Var.f4749J = ((ef) com.startapp.sdk.components.a.a(this.f4606d).f3469i.a()).a(u9Var);
        } catch (Throwable th12) {
            if (this.f4672a.f3677a != e9.f) {
                d9.a(th12);
            }
        }
        AnalyticsConfig h3 = MetaData.E().h();
        NetworkTestsMetaData L = MetaData.E().L();
        e9 e9Var = this.f4672a.f3677a;
        if (e9Var == e9.f3732m) {
            if (L != null) {
                str2 = L.a();
            }
        } else if (e9Var == e9.f3733n) {
            if (L != null) {
                str2 = L.b();
            }
        } else if (e9Var == e9.o) {
            if (L != null) {
                str2 = L.c();
            }
        } else if (e9Var == e9.f3728i) {
            str2 = h3.e();
        }
        if (str2 == null) {
            str2 = h3.d();
        }
        o8 o8Var = (o8) com.startapp.sdk.components.a.a(this.f4606d).f3474n.a();
        n8 n8Var = new n8(o8Var, str2);
        n8Var.f4194c = u9Var.a(((HttpClientConfig) o8Var.f.a()).e());
        n8Var.f4195d = ((HttpClientConfig) o8Var.f.a()).a(u9Var.f4764Z);
        r8 b3 = n8Var.b();
        return (b3 == null || b3.f4386b == null) ? 0 : 1;
    }
}
