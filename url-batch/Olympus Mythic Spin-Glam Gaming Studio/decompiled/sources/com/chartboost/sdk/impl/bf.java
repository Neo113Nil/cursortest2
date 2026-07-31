package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.sg;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.GDPR;
import com.ironsource.C4538a2;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bf {
    public final lf a;
    public final y8 b;
    public final rf c;
    public final z8 d;
    public final a9 e;
    public final ph f;
    public final x8 g;
    public final String h;
    public sg.b i;

    public cf g() {
        return new cf(Integer.valueOf(a()), f(), Integer.valueOf(c()), b(), e(), d(), this.f.a(), this.g.b(), this.g.a());
    }

    public bf(lf lfVar, y8 y8Var, rf rfVar, z8 z8Var, a9 a9Var, ph phVar, x8 x8Var, String str) {
        this.a = lfVar;
        this.b = y8Var;
        this.c = rfVar;
        this.d = z8Var;
        this.e = a9Var;
        this.f = phVar;
        this.g = x8Var;
        this.h = str;
    }

    public JSONObject e() {
        List f = f();
        z8 z8Var = this.d;
        if (z8Var == null || f == null) {
            return null;
        }
        return z8Var.a(f);
    }

    public List f() {
        sg.b bVar;
        a9 a9Var = this.e;
        if (a9Var == null || (bVar = this.i) == null) {
            return null;
        }
        return a9Var.a(bVar);
    }

    public String d() {
        DataUseConsent a = this.b.a("gdpr");
        if (a == null) {
            return C4538a2.f;
        }
        return (String) a.getConsent();
    }

    public int a() {
        return d().equals(GDPR.GDPR_CONSENT.BEHAVIORAL.getValue()) ? 1 : 0;
    }

    public int c() {
        return !d().equals(C4538a2.f) ? 1 : 0;
    }

    public Integer b() {
        COPPA coppa = (COPPA) a("coppa");
        if (coppa == null) {
            return null;
        }
        if (coppa.getConsent().booleanValue()) {
            return 1;
        }
        return 0;
    }

    public DataUseConsent a(String str) {
        y8 y8Var = this.b;
        if (y8Var != null) {
            return y8Var.a(str);
        }
        return null;
    }

    public void b(String str) {
        rf rfVar = this.c;
        if (rfVar != null) {
            rfVar.a(str);
        }
    }

    public void a(DataUseConsent dataUseConsent) {
        lf lfVar = this.a;
        if (lfVar != null) {
            lfVar.a(dataUseConsent);
        }
    }

    public void a(sg.b bVar) {
        this.i = bVar;
    }
}
