package com.ironsource.sdk.controller;

import com.ironsource.gh;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o9;
import com.ironsource.oh;
import com.ironsource.qo;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sk;
import com.ironsource.tk;
import com.ironsource.uc;
import com.ironsource.uk;
import com.ironsource.wc;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private final String f19270a;

    /* renamed from: b, reason: collision with root package name */
    private final wc f19271b;

    class a implements qo {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ uk f19272a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ tk f19273b;

        a(uk ukVar, tk tkVar) {
            this.f19272a = ukVar;
            this.f19273b = tkVar;
        }

        @Override // com.ironsource.qo
        public void a(oh ohVar) {
            try {
                uk ukVar = this.f19272a;
                tk tkVar = this.f19273b;
                ukVar.b(tkVar, j.this.a(tkVar, ohVar.a()));
            } catch (Exception e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
            }
        }

        @Override // com.ironsource.qo
        public void a(oh ohVar, gh ghVar) {
            try {
                uk ukVar = this.f19272a;
                tk tkVar = this.f19273b;
                ukVar.a(tkVar, j.this.a(tkVar, ghVar.b()));
            } catch (Exception e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
            }
        }
    }

    j(String str, wc wcVar) {
        this.f19270a = str;
        this.f19271b = wcVar;
    }

    private oh a(JSONObject jSONObject, String str) {
        if (jSONObject.has(uc.c.f19916d)) {
            return new oh(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString(uc.c.f19916d)));
        }
        throw new Exception(uc.a.f19900b);
    }

    private oh b(JSONObject jSONObject, String str) {
        if (!jSONObject.has(uc.c.f19915c) || !jSONObject.has(uc.c.f19914b)) {
            throw new Exception(uc.a.f19899a);
        }
        String string = jSONObject.getString(uc.c.f19915c);
        return new oh(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString(uc.c.f19914b));
    }

    private qo a(tk tkVar, uk ukVar) {
        return new a(ukVar, tkVar);
    }

    private JSONObject a(tk tkVar, long j4) {
        try {
            return tkVar.e().put("result", j4);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(tk tkVar, String str) {
        try {
            return tkVar.e().put("errMsg", str);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(tk tkVar, JSONObject jSONObject) {
        try {
            return tkVar.e().put("result", jSONObject);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return new JSONObject();
        }
    }

    void a(JSONObject jSONObject, sk skVar) {
        char c4;
        JSONObject a4;
        JSONObject jSONObject2;
        tk tkVar = new tk(jSONObject);
        uk ukVar = new uk(skVar);
        try {
            String b4 = tkVar.b();
            JSONObject c5 = tkVar.c();
            oh b5 = b(c5, this.f19270a);
            IronSourceStorageUtils.ensurePathSafety(b5, this.f19270a);
            switch (b4.hashCode()) {
                case -2073025383:
                    if (b4.equals(uc.b.f19907a)) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1137024519:
                    if (b4.equals(uc.b.f19909c)) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -318115535:
                    if (b4.equals(uc.b.f19911e)) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 537556755:
                    if (b4.equals(uc.b.f19912f)) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1764172231:
                    if (b4.equals(uc.b.f19908b)) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1953259713:
                    if (b4.equals(uc.b.f19910d)) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            if (c4 == 0) {
                this.f19271b.a(b5, c5.optString(uc.c.f19913a), c5.optInt("connectionTimeout"), c5.optInt("readTimeout"), a(tkVar, ukVar));
                return;
            }
            if (c4 == 1) {
                this.f19271b.a(b5);
                a4 = b5.a();
            } else if (c4 == 2) {
                this.f19271b.b(b5);
                a4 = b5.a();
            } else if (c4 == 3) {
                a4 = this.f19271b.c(b5);
            } else if (c4 == 4) {
                jSONObject2 = a(tkVar, this.f19271b.d(b5));
                ukVar.b(tkVar, jSONObject2);
            } else {
                if (c4 != 5) {
                    return;
                }
                this.f19271b.a(b5, c5.optJSONObject(uc.c.f19919g));
                a4 = b5.a();
            }
            jSONObject2 = a(tkVar, a4);
            ukVar.b(tkVar, jSONObject2);
        } catch (Exception e4) {
            o9.d().a(e4);
            ukVar.a(tkVar, a(tkVar, e4.getMessage()));
        }
    }
}
