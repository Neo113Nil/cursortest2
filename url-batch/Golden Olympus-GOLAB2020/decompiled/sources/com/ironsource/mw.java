package com.ironsource;

import android.content.Context;
import com.ironsource.b9;
import com.ironsource.fh;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class mw {

    /* renamed from: a, reason: collision with root package name */
    private final String f18249a;

    /* renamed from: b, reason: collision with root package name */
    private Context f18250b;

    /* renamed from: c, reason: collision with root package name */
    private e9 f18251c;

    /* renamed from: d, reason: collision with root package name */
    private wa f18252d;

    /* renamed from: e, reason: collision with root package name */
    private int f18253e;

    /* renamed from: f, reason: collision with root package name */
    private gb f18254f;

    /* renamed from: g, reason: collision with root package name */
    private int f18255g;

    /* renamed from: h, reason: collision with root package name */
    private int f18256h;

    /* renamed from: i, reason: collision with root package name */
    private final String f18257i = mw.class.getSimpleName();

    /* renamed from: j, reason: collision with root package name */
    private a f18258j;

    protected enum a {
        NOT_RECOVERED,
        RECOVERED,
        IN_RECOVERING,
        NOT_ALLOWED
    }

    public mw(Context context, e9 e9Var, wa waVar, int i4, gb gbVar, String str) {
        a h4 = h();
        this.f18258j = h4;
        if (h4 != a.NOT_ALLOWED) {
            this.f18250b = context;
            this.f18251c = e9Var;
            this.f18252d = waVar;
            this.f18253e = i4;
            this.f18254f = gbVar;
            this.f18255g = 0;
        }
        this.f18249a = str;
    }

    private a h() {
        this.f18256h = FeaturesManager.getInstance().getInitRecoverTrials();
        Logger.i(this.f18257i, "getInitialState mMaxAllowedTrials: " + this.f18256h);
        if (this.f18256h > 0) {
            return a.NOT_RECOVERED;
        }
        Logger.i(this.f18257i, "recovery is not allowed by config");
        return a.NOT_ALLOWED;
    }

    private void j() {
        if (this.f18255g != this.f18256h) {
            this.f18258j = a.NOT_RECOVERED;
            return;
        }
        Logger.i(this.f18257i, "handleRecoveringEndedFailed | Reached max trials");
        this.f18258j = a.NOT_ALLOWED;
        a();
    }

    private void k() {
        a();
        this.f18258j = a.RECOVERED;
    }

    public void a() {
        this.f18250b = null;
        this.f18251c = null;
        this.f18252d = null;
        this.f18254f = null;
    }

    public Context b() {
        return this.f18250b;
    }

    public String c() {
        return this.f18249a;
    }

    public e9 d() {
        return this.f18251c;
    }

    public int e() {
        return this.f18253e;
    }

    public wa f() {
        return this.f18252d;
    }

    public gb g() {
        return this.f18254f;
    }

    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(b9.h.f15430A0, m());
            jSONObject.put(b9.h.f15432B0, this.f18255g);
            jSONObject.put(b9.h.f15434C0, this.f18256h);
            return jSONObject;
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return jSONObject;
        }
    }

    public boolean l() {
        return this.f18258j == a.IN_RECOVERING;
    }

    public boolean m() {
        return this.f18258j == a.RECOVERED;
    }

    public void n() {
        a aVar = this.f18258j;
        a aVar2 = a.IN_RECOVERING;
        if (aVar != aVar2) {
            this.f18255g++;
            Logger.i(this.f18257i, "recoveringStarted - trial number " + this.f18255g);
            this.f18258j = aVar2;
        }
    }

    public void a(boolean z4) {
        if (this.f18258j != a.IN_RECOVERING) {
            return;
        }
        if (z4) {
            k();
        } else {
            j();
        }
    }

    public boolean a(fh.c cVar, fh.b bVar) {
        Logger.i(this.f18257i, "shouldRecoverWebController: ");
        a aVar = this.f18258j;
        if (aVar == a.NOT_ALLOWED) {
            Logger.i(this.f18257i, "shouldRecoverWebController: false | recover is not allowed");
            return false;
        }
        if (cVar != fh.c.Native) {
            Logger.i(this.f18257i, "shouldRecoverWebController: false | current controller type is: " + cVar);
            return false;
        }
        if (bVar == fh.b.Loading || bVar == fh.b.None) {
            Logger.i(this.f18257i, "shouldRecoverWebController: false | a Controller is currently loading");
            return false;
        }
        if (aVar == a.RECOVERED) {
            Logger.i(this.f18257i, "shouldRecoverWebController: false | already recovered");
            return false;
        }
        if (aVar == a.IN_RECOVERING) {
            Logger.i(this.f18257i, "shouldRecoverWebController: false | currently in recovering");
            return false;
        }
        if (this.f18250b == null || this.f18251c == null || this.f18252d == null) {
            Logger.i(this.f18257i, "shouldRecoverWebController: false | missing mandatory param");
            return false;
        }
        Logger.i(this.f18257i, "shouldRecoverWebController: true | allow recovering ");
        return true;
    }
}
