package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class us0 implements t70<tq0> {
    private static final Integer b(Map<String, String> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = map.get(str);
            StringBuilder sb = new StringBuilder(str.length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            io0.g(sb.toString());
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final /* bridge */ /* synthetic */ void a(tq0 tq0Var, Map map) {
        ts0 ts0Var;
        ks0 i7;
        tq0 tq0Var2 = tq0Var;
        if (io0.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            io0.b("Precache GMSG: ".concat(jSONObject.toString()));
        }
        ls0 z6 = y2.t.z();
        if (map.containsKey("abort")) {
            if (z6.l(tq0Var2)) {
                return;
            }
            io0.g("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer b7 = b(map, "periodicReportIntervalMs");
        Integer b8 = b(map, "exoPlayerRenderingIntervalMs");
        Integer b9 = b(map, "exoPlayerIdleIntervalMs");
        sq0 sq0Var = new sq0((String) map.get("flags"));
        boolean z7 = sq0Var.f11931n;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                        strArr2[i8] = jSONArray.getString(i8);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    io0.g(str2.length() != 0 ? "Malformed demuxed URL list for precache: ".concat(str2) : new String("Malformed demuxed URL list for precache: "));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z7) {
                Iterator<ks0> it = z6.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i7 = null;
                        break;
                    }
                    ks0 next = it.next();
                    if (next.f7611c == tq0Var2 && str.equals(next.e())) {
                        i7 = next;
                        break;
                    }
                }
            } else {
                i7 = z6.i(tq0Var2);
            }
            if (i7 != null) {
                io0.g("Precache task is already running.");
                return;
            }
            if (tq0Var2.o() == null) {
                io0.g("Precache requires a dependency provider.");
                return;
            }
            Integer b10 = b(map, "player");
            if (b10 == null) {
                b10 = 0;
            }
            if (b7 != null) {
                tq0Var2.j0(b7.intValue());
            }
            if (b8 != null) {
                tq0Var2.M0(b8.intValue());
            }
            if (b9 != null) {
                tq0Var2.T(b9.intValue());
            }
            int intValue = b10.intValue();
            es0 es0Var = tq0Var2.o().f23384c;
            if (intValue > 0) {
                int V = jq0.V();
                ts0Var = V < sq0Var.f11925h ? new ct0(tq0Var2, sq0Var) : V < sq0Var.f11919b ? new zs0(tq0Var2, sq0Var) : new xs0(tq0Var2);
            } else {
                ts0Var = new ws0(tq0Var2);
            }
            new ks0(tq0Var2, ts0Var, str, strArr).b();
        } else {
            ks0 i9 = z6.i(tq0Var2);
            if (i9 == null) {
                io0.g("Precache must specify a source.");
                return;
            }
            ts0Var = i9.f7612d;
        }
        Integer b11 = b(map, "minBufferMs");
        if (b11 != null) {
            ts0Var.s(b11.intValue());
        }
        Integer b12 = b(map, "maxBufferMs");
        if (b12 != null) {
            ts0Var.r(b12.intValue());
        }
        Integer b13 = b(map, "bufferForPlaybackMs");
        if (b13 != null) {
            ts0Var.o(b13.intValue());
        }
        Integer b14 = b(map, "bufferForPlaybackAfterRebufferMs");
        if (b14 != null) {
            ts0Var.q(b14.intValue());
        }
    }
}
