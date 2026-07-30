package com.baidu.ar;

import android.content.Context;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.platform.comapi.map.MapController;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class y {

    /* renamed from: g, reason: collision with root package name */
    public static final String f3720g = "y";

    /* renamed from: a, reason: collision with root package name */
    public Context f3721a;

    /* renamed from: b, reason: collision with root package name */
    public JSONObject f3722b;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f3723c;

    /* renamed from: d, reason: collision with root package name */
    public b0 f3724d;

    /* renamed from: e, reason: collision with root package name */
    public String f3725e;

    /* renamed from: f, reason: collision with root package name */
    public ICallbackWith<String> f3726f;

    public class a implements ICallbackWith<String> {
        public a() {
        }

        @Override // com.baidu.ar.callback.ICallbackWith
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void run(String str) {
            if (y.this.f3726f != null) {
                y.this.f3726f.run(str);
            }
        }
    }

    public class b implements ICallbackWith<x> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ICallbackWith f3728a;

        public b(ICallbackWith iCallbackWith) {
            this.f3728a = iCallbackWith;
        }

        @Override // com.baidu.ar.callback.ICallbackWith
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void run(x xVar) {
            y.this.f3724d = null;
            y.this.a(xVar);
            ICallbackWith iCallbackWith = this.f3728a;
            if (iCallbackWith == null || xVar == null) {
                return;
            }
            iCallbackWith.run(xVar.f3654b);
        }
    }

    public y(Context context) {
        this.f3725e = MapController.DEFAULT_LAYER_TAG;
        if (context != null) {
            this.f3721a = context.getApplicationContext();
            x a8 = a0.a(context);
            if (a8 != null) {
                this.f3722b = a8.f3654b;
                this.f3725e = a8.f3653a;
            }
        }
    }

    public final int a() {
        int b8 = z.b();
        if (b8 != 1) {
            return b8 != 2 ? 4999 : 8001;
        }
        return 5001;
    }

    public int b() {
        return z.b();
    }

    public Map<String, Object> c() {
        JSONObject d8;
        HashMap hashMap = new HashMap();
        if (d() == null || (d8 = d()) == null || !d8.has("common")) {
            hashMap.put("cpu_score", Integer.valueOf(a()));
            return hashMap;
        }
        try {
            JSONObject jSONObject = d8.getJSONObject("common");
            hashMap.put("cpu_score", jSONObject.has("cpu_score") ? Integer.valueOf(jSONObject.getInt("cpu_score")) : Integer.valueOf(a()));
        } catch (JSONException e8) {
            e8.printStackTrace();
            hashMap.put("cpu_score", Integer.valueOf(a()));
        }
        return hashMap;
    }

    public JSONObject d() {
        if (this.f3723c == null) {
            h.a(f3720g, "use inner config: " + this.f3722b);
            return this.f3722b;
        }
        h.a(f3720g, "use outter config: " + this.f3723c);
        return this.f3723c;
    }

    public void e() {
        this.f3726f = null;
        b0 b0Var = this.f3724d;
        if (b0Var != null) {
            b0Var.b();
            this.f3724d = null;
        }
        this.f3721a = null;
    }

    public void b(ICallbackWith<JSONObject> iCallbackWith) {
        b0 b0Var = new b0();
        this.f3724d = b0Var;
        b0Var.a(new a());
        this.f3724d.a(this.f3721a, this.f3725e, new b(iCallbackWith));
    }

    public void a(ICallbackWith<String> iCallbackWith) {
        this.f3726f = iCallbackWith;
    }

    public final void a(x xVar) {
        Context context;
        if (xVar == null || (context = this.f3721a) == null) {
            return;
        }
        this.f3725e = xVar.f3653a;
        this.f3722b = xVar.f3654b;
        a0.a(context, xVar);
    }

    public void a(JSONObject jSONObject) {
        this.f3723c = jSONObject;
    }
}
