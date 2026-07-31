package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.d6;
import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.C4701ic;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public abstract class l6 extends i5 implements q0.e {
    private final com.applovin.impl.sdk.network.a g;
    private final q0.e h;
    private d6.b i;
    private x4 j;
    private x4 k;
    protected q0.b l;

    public l6(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
        this(aVar, kVar, false);
    }

    public abstract void a(String str, int i, String str2, Object obj);

    public abstract void a(String str, Object obj, int i);

    @Override // java.lang.Runnable
    public void run() {
        q0 w = b().w();
        if (!b().E0() && !b().B0()) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "AppLovin SDK is disabled");
            a(this.g.f(), -22, null, null);
        } else if (!StringUtils.isValidString(this.g.f()) || this.g.f().length() < 4) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Task has an invalid or null request endpoint.");
            }
            a(this.g.f(), -900, null, null);
        } else {
            if (TextUtils.isEmpty(this.g.h())) {
                this.g.b(this.g.b() != null ? "POST" : C4701ic.a);
            }
            w.a(this.g, this.l, this.h);
        }
    }

    public l6(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z) {
        super("TaskRepeatRequest", kVar, z);
        this.i = d6.b.OTHER;
        if (aVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        a(aVar.f());
        this.g = aVar;
        this.l = new q0.b();
        this.h = new a(kVar);
    }

    public void b(x4 x4Var) {
        this.k = x4Var;
    }

    public void c(x4 x4Var) {
        this.j = x4Var;
    }

    public void a(d6.b bVar) {
        this.i = bVar;
    }

    class a implements q0.e {
        final /* synthetic */ com.applovin.impl.sdk.k a;

        a(com.applovin.impl.sdk.k kVar) {
            this.a = kVar;
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, Object obj, int i) {
            l6.this.g.a(0);
            l6.this.a(str, obj, i);
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, int i, String str2, Object obj) {
            long millis;
            boolean z = false;
            boolean z2 = i < 200 || i >= 500;
            boolean z3 = i == 429;
            boolean z4 = i != -1009 || l6.this.g.q();
            boolean z5 = (i == -900 || i == -1000) ? false : true;
            if (z4 && z5 && (z2 || z3 || l6.this.g.p())) {
                String a = l6.this.g.a();
                if (l6.this.g.j() <= 0) {
                    if (a != null && a.equals(l6.this.g.f())) {
                        l6 l6Var = l6.this;
                        l6Var.a(l6Var.k);
                    } else {
                        l6 l6Var2 = l6.this;
                        l6Var2.a(l6Var2.j);
                    }
                    l6 l6Var3 = l6.this;
                    l6Var3.a(l6Var3.g.f(), i, str2, obj);
                    return;
                }
                com.applovin.impl.sdk.o oVar = l6.this.c;
                if (com.applovin.impl.sdk.o.a()) {
                    l6 l6Var4 = l6.this;
                    l6Var4.c.k(l6Var4.b, "Unable to send request due to server failure (code " + i + "). " + l6.this.g.j() + " attempts left, retrying in " + TimeUnit.MILLISECONDS.toSeconds(l6.this.g.k()) + " seconds...");
                }
                int j = l6.this.g.j() - 1;
                l6.this.g.a(j);
                if (j == 0) {
                    l6 l6Var5 = l6.this;
                    l6Var5.a(l6Var5.j);
                    if (StringUtils.isValidString(a) && a.length() >= 4) {
                        com.applovin.impl.sdk.o oVar2 = l6.this.c;
                        if (com.applovin.impl.sdk.o.a()) {
                            l6 l6Var6 = l6.this;
                            l6Var6.c.d(l6Var6.b, "Switching to backup endpoint " + a);
                        }
                        l6.this.g.a(a);
                        z = true;
                    }
                }
                if (((Boolean) this.a.a(x4.g3)).booleanValue() && z) {
                    millis = 0;
                } else {
                    millis = l6.this.g.n() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, l6.this.g.c())) : l6.this.g.k();
                }
                d6 q0 = this.a.q0();
                l6 l6Var7 = l6.this;
                q0.a(l6Var7, l6Var7.i, millis);
                return;
            }
            l6 l6Var8 = l6.this;
            l6Var8.a(l6Var8.g.f(), i, str2, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(x4 x4Var) {
        if (x4Var != null) {
            b().o0().a(x4Var, x4Var.a());
        }
    }
}
