package com.baidu.ar.statistic.performance;

import com.github.mikephil.charting.utils.i;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public String f3242a;

    /* renamed from: b, reason: collision with root package name */
    public double f3243b;

    /* renamed from: c, reason: collision with root package name */
    public long f3244c;

    /* renamed from: d, reason: collision with root package name */
    public long f3245d;

    /* renamed from: e, reason: collision with root package name */
    public long f3246e;

    /* renamed from: f, reason: collision with root package name */
    public BlockingQueue<C0040a> f3247f = new LinkedBlockingQueue();

    /* renamed from: com.baidu.ar.statistic.performance.a$a, reason: collision with other inner class name */
    public static class C0040a {

        /* renamed from: a, reason: collision with root package name */
        public int f3248a;

        /* renamed from: b, reason: collision with root package name */
        public long f3249b;

        /* renamed from: c, reason: collision with root package name */
        public long f3250c;

        /* renamed from: d, reason: collision with root package name */
        public BlockingQueue<C0041a> f3251d = new LinkedBlockingQueue();

        /* renamed from: com.baidu.ar.statistic.performance.a$a$a, reason: collision with other inner class name */
        public static class C0041a {

            /* renamed from: a, reason: collision with root package name */
            public String f3252a;

            /* renamed from: b, reason: collision with root package name */
            public String f3253b;

            /* renamed from: c, reason: collision with root package name */
            public long f3254c;

            /* renamed from: d, reason: collision with root package name */
            public int f3255d;
        }
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("case_id", this.f3242a);
            jSONObject.put("cpu_rate", String.valueOf(this.f3243b));
            jSONObject.put("cpu_tc", String.valueOf(this.f3244c));
            jSONObject.put("mem_total", String.valueOf(this.f3245d));
            jSONObject.put("mem_used", String.valueOf(this.f3246e));
            JSONArray jSONArray = new JSONArray();
            for (C0040a c0040a : this.f3247f) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("frame_index", c0040a.f3248a);
                    jSONObject2.put("frame_in", c0040a.f3249b);
                    jSONObject2.put("frame_out", c0040a.f3250c);
                    JSONArray jSONArray2 = new JSONArray();
                    for (C0040a.C0041a c0041a : c0040a.f3251d) {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("name", c0041a.f3252a);
                            jSONObject3.put("func", c0041a.f3253b);
                            jSONObject3.put("time_cost", c0041a.f3254c);
                            jSONObject3.put("count", c0041a.f3255d);
                            jSONArray2.put(jSONObject3);
                        } catch (JSONException e8) {
                            e8.printStackTrace();
                        }
                    }
                    jSONObject2.put("algo_data", jSONArray2);
                    jSONArray.put(jSONObject2);
                } catch (JSONException e9) {
                    e9.printStackTrace();
                }
            }
            jSONObject.put("frame_data", jSONArray);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public void b() {
        this.f3242a = null;
        this.f3243b = i.DOUBLE_EPSILON;
        this.f3244c = 0L;
        this.f3245d = 0L;
        this.f3246e = 0L;
        this.f3247f = new LinkedBlockingQueue();
    }
}
