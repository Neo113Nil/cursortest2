package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class gs0 implements t70<tq0> {

    /* renamed from: a, reason: collision with root package name */
    private boolean f5739a;

    private static int b(Context context, Map<String, String> map, String str, int i7) {
        String str2 = map.get(str);
        if (str2 != null) {
            try {
                qw.b();
                i7 = bo0.s(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(str.length() + 34 + str2.length());
                sb.append("Could not parse ");
                sb.append(str);
                sb.append(" in a video GMSG: ");
                sb.append(str2);
                io0.g(sb.toString());
            }
        }
        if (a3.r1.m()) {
            StringBuilder sb2 = new StringBuilder(str.length() + 48 + String.valueOf(str2).length());
            sb2.append("Parse pixels for ");
            sb2.append(str);
            sb2.append(", got string ");
            sb2.append(str2);
            sb2.append(", int ");
            sb2.append(i7);
            sb2.append(".");
            a3.r1.k(sb2.toString());
        }
        return i7;
    }

    private static void c(gq0 gq0Var, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                gq0Var.H(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                io0.g(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            gq0Var.G(Integer.parseInt(str2));
        }
        if (str3 != null) {
            gq0Var.E(Integer.parseInt(str3));
        }
        if (str4 != null) {
            gq0Var.F(Integer.parseInt(str4));
        }
        if (str5 != null) {
            gq0Var.k(Integer.parseInt(str5));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:191|(1:(10:194|195|(1:197)(3:217|(1:219)|220)|199|200|201|202|203|204|(2:213|214)(2:208|(2:210|211)(1:212)))(1:221))(3:223|(1:225)|226)|222|195|(0)(0)|199|200|201|202|203|204|(1:206)|213|214) */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03dc, code lost:
    
        if (r0 == (-1)) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x042a, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03df  */
    @Override // com.google.android.gms.internal.ads.t70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void a(tq0 tq0Var, Map map) {
        int i7;
        int min;
        int h7;
        int i8;
        tq0 tq0Var2 = tq0Var;
        String str = (String) map.get("action");
        if (str == null) {
            io0.g("Action missing from video GMSG.");
            return;
        }
        if (io0.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(str.length() + 13 + String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(jSONObject2);
            io0.b(sb.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                io0.g("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                tq0Var2.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                io0.g("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if ("playerBackground".equals(str)) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                io0.g("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                tq0Var2.z0(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                io0.g("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if ("decoderProps".equals(str)) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                io0.g("No MIME types specified for decoder properties inspection.");
                HashMap hashMap = new HashMap();
                hashMap.put("event", "decoderProps");
                hashMap.put("error", "missingMimeTypes");
                tq0Var2.t("onVideoEvent", hashMap);
                return;
            }
            HashMap hashMap2 = new HashMap();
            for (String str5 : str4.split(",")) {
                hashMap2.put(str5, a3.o1.a(str5.trim()));
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("event", "decoderProps");
            hashMap3.put("mimeTypes", hashMap2);
            tq0Var2.t("onVideoEvent", hashMap3);
            return;
        }
        hq0 y02 = tq0Var2.y0();
        if (y02 == null) {
            io0.g("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = "new".equals(str);
        boolean equals2 = "position".equals(str);
        if (equals || equals2) {
            Context context = tq0Var2.getContext();
            int b7 = b(context, map, "x", 0);
            int b8 = b(context, map, "y", 0);
            int b9 = b(context, map, "w", -1);
            e10<Boolean> e10Var = m10.f8328w2;
            if (!((Boolean) sw.c().b(e10Var)).booleanValue()) {
                if (a3.r1.m()) {
                    int i9 = tq0Var2.i();
                    StringBuilder sb2 = new StringBuilder(110);
                    sb2.append("Calculate width with original width ");
                    sb2.append(b9);
                    sb2.append(", videoHost.getVideoBoundingWidth() ");
                    sb2.append(i9);
                    sb2.append(", x ");
                    sb2.append(b7);
                    sb2.append(".");
                    a3.r1.k(sb2.toString());
                }
                i7 = tq0Var2.i() - b7;
            } else {
                if (b9 == -1) {
                    min = tq0Var2.i();
                    int b10 = b(context, map, "h", -1);
                    if (((Boolean) sw.c().b(e10Var)).booleanValue()) {
                        if (a3.r1.m()) {
                            int h8 = tq0Var2.h();
                            StringBuilder sb3 = new StringBuilder(113);
                            sb3.append("Calculate height with original height ");
                            sb3.append(b10);
                            sb3.append(", videoHost.getVideoBoundingHeight() ");
                            sb3.append(h8);
                            sb3.append(", y ");
                            sb3.append(b8);
                            sb3.append(".");
                            a3.r1.k(sb3.toString());
                        }
                        h7 = tq0Var2.h() - b8;
                    } else {
                        h7 = tq0Var2.h();
                    }
                    h7 = Math.min(b10, h7);
                    i8 = h7;
                    int i10 = Integer.parseInt((String) map.get("player"));
                    boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
                    if (equals || y02.a() != null) {
                        y02.b(b7, b8, min, i8);
                        return;
                    }
                    y02.c(b7, b8, min, i8, i10, parseBoolean, new sq0((String) map.get("flags")));
                    gq0 a7 = y02.a();
                    if (a7 != null) {
                        c(a7, map);
                        return;
                    }
                    return;
                }
                i7 = tq0Var2.i();
            }
            min = Math.min(b9, i7);
            int b102 = b(context, map, "h", -1);
            if (((Boolean) sw.c().b(e10Var)).booleanValue()) {
            }
            h7 = Math.min(b102, h7);
            i8 = h7;
            int i102 = Integer.parseInt((String) map.get("player"));
            boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("spherical"));
            if (equals) {
            }
            y02.b(b7, b8, min, i8);
            return;
        }
        bv0 p7 = tq0Var2.p();
        if (p7 != null) {
            if ("timeupdate".equals(str)) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    io0.g("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    p7.x6(Float.parseFloat(str6));
                    return;
                } catch (NumberFormatException unused3) {
                    io0.g(str6.length() != 0 ? "Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6) : new String("Could not parse currentTime parameter from timeupdate video GMSG: "));
                    return;
                }
            }
            if ("skip".equals(str)) {
                p7.y();
                return;
            }
        }
        gq0 a8 = y02.a();
        if (a8 == null) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put("event", "no_video_view");
            tq0Var2.t("onVideoEvent", hashMap4);
            return;
        }
        if ("click".equals(str)) {
            Context context2 = tq0Var2.getContext();
            int b11 = b(context2, map, "x", 0);
            int b12 = b(context2, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, b11, b12, 0);
            a8.D(obtain);
            obtain.recycle();
            return;
        }
        if ("currentTime".equals(str)) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                io0.g("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                a8.C((int) (Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (NumberFormatException unused4) {
                io0.g(str7.length() != 0 ? "Could not parse time parameter from currentTime video GMSG: ".concat(str7) : new String("Could not parse time parameter from currentTime video GMSG: "));
                return;
            }
        }
        if ("hide".equals(str)) {
            a8.setVisibility(4);
            return;
        }
        if ("load".equals(str)) {
            a8.x();
            return;
        }
        if ("loadControl".equals(str)) {
            c(a8, map);
            return;
        }
        if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                a8.y();
                return;
            } else {
                a8.p();
                return;
            }
        }
        if ("pause".equals(str)) {
            a8.A();
            return;
        }
        if ("play".equals(str)) {
            a8.B();
            return;
        }
        if ("show".equals(str)) {
            a8.setVisibility(0);
            return;
        }
        if ("src".equals(str)) {
            String str8 = (String) map.get("src");
            Integer num = null;
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    num = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused5) {
                    io0.g("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                }
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        strArr2[i11] = jSONArray.getString(i11);
                    }
                    strArr = strArr2;
                } catch (JSONException unused6) {
                    io0.g(str9.length() != 0 ? "Malformed demuxed URL list for playback: ".concat(str9) : new String("Malformed demuxed URL list for playback: "));
                    strArr = new String[]{str8};
                }
            }
            if (num != null) {
                tq0Var2.j0(num.intValue());
            }
            a8.l(str8, strArr);
            return;
        }
        if ("touchMove".equals(str)) {
            Context context3 = tq0Var2.getContext();
            a8.o(b(context3, map, "dx", 0), b(context3, map, "dy", 0));
            if (this.f5739a) {
                return;
            }
            tq0Var2.a0();
            this.f5739a = true;
            return;
        }
        if (!"volume".equals(str)) {
            if ("watermark".equals(str)) {
                a8.u();
                return;
            } else {
                io0.g(str.length() != 0 ? "Unknown video action: ".concat(str) : new String("Unknown video action: "));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            io0.g("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            a8.n(Float.parseFloat(str10));
        } catch (NumberFormatException unused7) {
            io0.g(str10.length() != 0 ? "Could not parse volume parameter from volume video GMSG: ".concat(str10) : new String("Could not parse volume parameter from volume video GMSG: "));
        }
    }
}
