package com.anythink.core.common.h;

import com.anythink.core.c.b.e;
import com.anythink.core.mg.api.MgComparedResult;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    private int f13518a;

    /* renamed from: b, reason: collision with root package name */
    private int f13519b;

    /* renamed from: c, reason: collision with root package name */
    private int f13520c;

    /* renamed from: d, reason: collision with root package name */
    private double f13521d;

    /* renamed from: e, reason: collision with root package name */
    private String f13522e;

    /* renamed from: f, reason: collision with root package name */
    private int f13523f;

    /* renamed from: g, reason: collision with root package name */
    private long f13524g;

    /* renamed from: h, reason: collision with root package name */
    private int f13525h;
    private String i;

    private ab() {
    }

    public static ab a(cd cdVar) {
        ab abVar = new ab();
        abVar.f13518a = 1;
        abVar.f13519b = cdVar.x();
        abVar.f13520c = cdVar.A();
        abVar.f13521d = cdVar.p();
        abVar.i = cdVar.g();
        a(abVar, cdVar.C());
        return abVar;
    }

    public static ab a(aw awVar) {
        ab abVar = new ab();
        abVar.f13518a = 2;
        abVar.f13519b = awVar.w();
        abVar.f13520c = awVar.r();
        abVar.f13521d = awVar.x();
        abVar.f13522e = awVar.y();
        abVar.f13523f = awVar.E();
        a(abVar, awVar.F());
        return abVar;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", this.f13518a);
            jSONObject.put("post_t", this.f13519b);
            jSONObject.put(e.a.f12225h, String.valueOf(this.f13521d));
            long j9 = this.f13524g;
            if (j9 > 0) {
                jSONObject.put("real_wait_price_t", j9);
            }
            int i = this.f13525h;
            if (i > 0) {
                jSONObject.put("bp_from", i);
            }
            if (this.f13518a == 2) {
                jSONObject.put("reason", this.f13522e);
                jSONObject.put("winner_firm_id", this.f13523f);
            }
            if (this.f13518a == 1) {
                jSONObject.put("h_code", this.i);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private static void a(ab abVar, MgComparedResult mgComparedResult) {
        abVar.f13524g = mgComparedResult != null ? mgComparedResult.getCpCostTime() : 0L;
        int i = 0;
        if (mgComparedResult != null && mgComparedResult.isCompared()) {
            i = mgComparedResult.isMgWin() ? 2 : 1;
        }
        abVar.f13525h = i;
    }
}
