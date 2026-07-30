package com.anythink.core.common.r;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f16229a;

    /* renamed from: b, reason: collision with root package name */
    private long f16230b;

    /* renamed from: c, reason: collision with root package name */
    private int f16231c;

    /* renamed from: d, reason: collision with root package name */
    private long f16232d;

    /* renamed from: e, reason: collision with root package name */
    private int f16233e;

    /* renamed from: f, reason: collision with root package name */
    private long f16234f;

    /* renamed from: g, reason: collision with root package name */
    private int f16235g;

    /* renamed from: h, reason: collision with root package name */
    private long f16236h;
    private int[] i;

    /* renamed from: j, reason: collision with root package name */
    private final List<h> f16237j = Collections.synchronizedList(new ArrayList());

    /* renamed from: k, reason: collision with root package name */
    private final Map<String, h> f16238k = new ConcurrentHashMap();

    public static g a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            g gVar = new g();
            gVar.f16230b = jSONObject.optLong("pre_load_time", 30000L);
            gVar.f16231c = jSONObject.optInt("pre_load_num", 1);
            gVar.f16232d = jSONObject.optLong("pre_load_timeout", 30000L);
            gVar.f16233e = jSONObject.optInt("pre_load_mode", 1);
            gVar.f16234f = jSONObject.optLong("shared_delay_time_in_wf", com.anythink.basead.exoplayer.i.a.f8040f);
            gVar.f16236h = jSONObject.optLong("shared_retry_time_in_loadfailed", 15000L);
            gVar.f16235g = jSONObject.optInt("shared_retry_count_in_loadfailed", 6);
            gVar.i = b(jSONObject);
            JSONArray optJSONArray = jSONObject.optJSONArray("formats");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    try {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            h hVar = new h();
                            hVar.f16239a = optJSONObject.optInt("format");
                            hVar.f16240b = optJSONObject.optString(com.anythink.core.common.m.e.bk, "");
                            hVar.f16241c = optJSONObject.optInt("req_pacing");
                            hVar.f16242d = optJSONObject.optInt("ad_cache", 1);
                            hVar.f16243e = optJSONObject.optDouble("ad_ecpm", -1.0d);
                            hVar.f16247j = gVar;
                            gVar.f16237j.add(hVar);
                            gVar.f16238k.put(hVar.f16240b, hVar);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            return gVar;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    private static int b(int i) {
        switch (i) {
            case 1:
                return 10;
            case 2:
                return 12;
            case 3:
                return 6;
            case 4:
                return 11;
            case 5:
                return 15;
            case 6:
                return 16;
            default:
                return 17;
        }
    }

    private int k() {
        return this.f16233e;
    }

    public final long c() {
        return this.f16232d;
    }

    public final Map<String, h> d() {
        return this.f16238k;
    }

    public final List<h> e() {
        return this.f16237j;
    }

    public final long f() {
        return this.f16234f;
    }

    public final int g() {
        if (this.f16235g <= 0) {
            this.f16235g = 6;
        }
        return this.f16235g;
    }

    public final long h() {
        return this.f16236h;
    }

    public final boolean i() {
        return this.f16229a;
    }

    public final void j() {
        this.f16229a = true;
    }

    public final String toString() {
        return "SharedPlaceConfig{isPreLocalConfig=" + this.f16229a + ", delayPreloadTime=" + this.f16230b + ", parallelReqNum=" + this.f16231c + ", preLoadTimeout=" + this.f16232d + ", preloadMode=" + this.f16233e + ", loadDelayTimeInWF=" + this.f16234f + ", retryLoadCountInFailed=" + this.f16235g + ", retryLoadDelayTimeInfFailed=" + this.f16236h + ", loadModes=" + Arrays.toString(this.i) + ", sharedPlaceInfoList=" + this.f16237j + ", placementIdToSharedPlaceInfoMap=" + this.f16238k + '}';
    }

    private static int[] b(JSONObject jSONObject) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("pre_load_mode_n");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                return new int[]{b(jSONObject.optInt("pre_load_mode", 1)), 6, 11};
            }
            int[] iArr = new int[optJSONArray.length()];
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    iArr[i] = b(optJSONArray.optInt(i));
                } catch (Throwable unused) {
                    return iArr;
                }
            }
            return iArr;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public final int b() {
        return this.f16231c;
    }

    public final long a() {
        return this.f16230b;
    }

    public final boolean a(int i) {
        int[] iArr = this.i;
        if (iArr != null) {
            for (int i4 : iArr) {
                if (i4 == i) {
                    return true;
                }
            }
        }
        return false;
    }
}
