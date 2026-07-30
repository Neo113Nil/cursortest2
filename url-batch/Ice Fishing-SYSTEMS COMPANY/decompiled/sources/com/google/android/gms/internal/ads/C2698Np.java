package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Np, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2698Np implements Gu {

    /* renamed from: w, reason: collision with root package name */
    public static final Pattern f26607w = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);

    /* renamed from: n, reason: collision with root package name */
    public final String f26608n;

    /* renamed from: u, reason: collision with root package name */
    public final Vu f26609u;

    /* renamed from: v, reason: collision with root package name */
    public final Yu f26610v;

    public C2698Np(String str, Yu yu, Vu vu) {
        this.f26608n = str;
        this.f26610v = yu;
        this.f26609u = vu;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0136  */
    @Override // com.google.android.gms.internal.ads.Gu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        String str;
        C3275gp c3275gp;
        byte[] bArr;
        JSONObject jSONObject;
        String str2;
        C2681Mp c2681Mp = (C2681Mp) obj;
        int optInt = c2681Mp.f26380a.optInt("http_timeout_millis", 60000);
        C2704Oe c2704Oe = c2681Mp.f26381b;
        int i = c2704Oe.f26712g;
        Yu yu = this.f26610v;
        Vu vu = this.f26609u;
        int i4 = 1;
        str = "";
        if (i != -2) {
            if (i == 1) {
                List list = c2704Oe.f26706a;
                if (list != null) {
                    str = TextUtils.join(", ", list);
                    int i9 = t2.C.f40822b;
                    u2.i.c(str);
                }
                c3275gp = new C3275gp(2, "Error building request URL: ".concat(String.valueOf(str)));
            } else {
                c3275gp = new C3275gp(1);
            }
            vu.c(c3275gp);
            vu.b(false);
            yu.a(vu);
            throw c3275gp;
        }
        HashMap hashMap = new HashMap();
        if (c2704Oe.f26710e) {
            String str3 = this.f26608n;
            if (!TextUtils.isEmpty(str3)) {
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31817w1)).booleanValue()) {
                    if (TextUtils.isEmpty(str3)) {
                        str2 = "";
                    } else {
                        Matcher matcher = f26607w.matcher(str3);
                        str2 = "";
                        while (matcher.find()) {
                            String group = matcher.group(i4);
                            if (group != null) {
                                Locale locale = Locale.ROOT;
                                if (group.toLowerCase(locale).startsWith("id=") || group.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(str2)) {
                                        str2 = str2.concat("; ");
                                    }
                                    str2 = str2.concat(group);
                                }
                            }
                            i4 = 1;
                        }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        hashMap.put("Cookie", str2);
                    }
                } else {
                    hashMap.put("Cookie", str3);
                }
            }
        }
        if (c2704Oe.f26709d && (jSONObject = c2681Mp.f26380a) != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("pii");
            if (optJSONObject != null) {
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
                    hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
                    hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
                }
            } else {
                t2.C.k("DSID signal does not exist.");
            }
        }
        byte[] bArr2 = new byte[0];
        String str4 = c2704Oe.f26708c;
        if (!TextUtils.isEmpty(str4)) {
            byte[] bytes = str4.getBytes(StandardCharsets.UTF_8);
            if (c2704Oe.f26716l) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bytes);
                        gZIPOutputStream.finish();
                        bArr2 = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                    } finally {
                    }
                } catch (IOException e6) {
                    t2.C.l("gzip compression failed, sending uncompressed.", e6);
                    p2.j.f39798C.f39808h.d("PrepareRequestFunction.apply", e6);
                    bArr2 = null;
                }
                if (bArr2 != null) {
                    hashMap.put("Content-Encoding", com.anythink.expressad.foundation.g.f.g.b.f19499d);
                }
            }
            bArr = bytes;
            String str5 = c2704Oe.f26717m;
            str = TextUtils.isEmpty(str5) ? "" : str5;
            vu.b(true);
            yu.a(vu);
            return new C2647Kp(c2704Oe.f26711f, optInt, hashMap, bArr, str);
        }
        bArr = bArr2;
        String str52 = c2704Oe.f26717m;
        if (TextUtils.isEmpty(str52)) {
        }
        vu.b(true);
        yu.a(vu);
        return new C2647Kp(c2704Oe.f26711f, optInt, hashMap, bArr, str);
    }
}
