package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class fx1 extends o80 {

    /* renamed from: f, reason: collision with root package name */
    private final ix1 f5261f;

    /* renamed from: g, reason: collision with root package name */
    private final dx1 f5262g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<Long, ww1> f5263h = new HashMap();

    fx1(ix1 ix1Var, dx1 dx1Var) {
        this.f5261f = ix1Var;
        this.f5262g = dx1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static kv s6(Map<String, String> map) {
        char c7;
        lv lvVar = new lv();
        String str = map.get("ad_request");
        if (str == null) {
            return lvVar.a();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                switch (nextName.hashCode()) {
                    case -1289032093:
                        if (nextName.equals("extras")) {
                            c7 = 0;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -839117230:
                        if (nextName.equals("isTestDevice")) {
                            c7 = 2;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -733436947:
                        if (nextName.equals("tagForUnderAgeOfConsent")) {
                            c7 = 4;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -99890337:
                        if (nextName.equals("httpTimeoutMillis")) {
                            c7 = 6;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 523149226:
                        if (nextName.equals("keywords")) {
                            c7 = 1;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 597632527:
                        if (nextName.equals("maxAdContentRating")) {
                            c7 = 5;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1411582723:
                        if (nextName.equals("tagForChildDirectedTreatment")) {
                            c7 = 3;
                            break;
                        }
                        c7 = 65535;
                        break;
                    default:
                        c7 = 65535;
                        break;
                }
                switch (c7) {
                    case 0:
                        jsonReader.beginObject();
                        Bundle bundle = new Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        lvVar.b(bundle);
                        break;
                    case 1:
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        lvVar.e(arrayList);
                        break;
                    case 2:
                        lvVar.d(jsonReader.nextBoolean());
                        break;
                    case 3:
                        if (!jsonReader.nextBoolean()) {
                            lvVar.g(0);
                            break;
                        } else {
                            lvVar.g(1);
                            break;
                        }
                    case 4:
                        if (!jsonReader.nextBoolean()) {
                            lvVar.h(0);
                            break;
                        } else {
                            lvVar.h(1);
                            break;
                        }
                    case 5:
                        String nextString = jsonReader.nextString();
                        if (!r2.u.f21172e.contains(nextString)) {
                            break;
                        } else {
                            lvVar.f(nextString);
                            break;
                        }
                    case 6:
                        lvVar.c(jsonReader.nextInt());
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            io0.b("Ad Request json was malformed, parsing ended early.");
        }
        kv a7 = lvVar.a();
        Bundle bundle2 = a7.f7655r.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 == null) {
            bundle2 = a7.f7645h;
            a7.f7655r.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle2);
        }
        return new kv(a7.f7643f, a7.f7644g, bundle2, a7.f7646i, a7.f7647j, a7.f7648k, a7.f7649l, a7.f7650m, a7.f7651n, a7.f7652o, a7.f7653p, a7.f7654q, a7.f7655r, a7.f7656s, a7.f7657t, a7.f7658u, a7.f7659v, a7.f7660w, a7.f7661x, a7.f7662y, a7.f7663z, a7.A, a7.B, a7.C);
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final void b() {
        this.f5263h.clear();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00b1, code lost:
    
        if (r0.equals("create_interstitial_ad") != false) goto L54;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.p80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(String str) {
        char c7;
        if (((Boolean) sw.c().b(m10.U6)).booleanValue()) {
            String valueOf = String.valueOf(str);
            a3.r1.k(valueOf.length() != 0 ? "Received H5 gmsg: ".concat(valueOf) : new String("Received H5 gmsg: "));
            Uri parse = Uri.parse(str);
            y2.t.q();
            Map<String, String> s7 = a3.g2.s(parse);
            String str2 = s7.get("action");
            if (TextUtils.isEmpty(str2)) {
                io0.b("H5 gmsg did not contain an action");
                return;
            }
            int hashCode = str2.hashCode();
            char c8 = 0;
            if (hashCode != 579053441) {
                if (hashCode == 871091088 && str2.equals("initialize")) {
                    c7 = 0;
                }
                c7 = 65535;
            } else {
                if (str2.equals("dispose_all")) {
                    c7 = 1;
                }
                c7 = 65535;
            }
            if (c7 == 0) {
                this.f5263h.clear();
                this.f5262g.a();
                return;
            }
            if (c7 == 1) {
                Iterator<ww1> it = this.f5263h.values().iterator();
                while (it.hasNext()) {
                    it.next().zza();
                }
                this.f5263h.clear();
                return;
            }
            String str3 = s7.get("obj_id");
            try {
                str3.getClass();
                long parseLong = Long.parseLong(str3);
                switch (str2.hashCode()) {
                    case -1790951212:
                        if (str2.equals("show_interstitial_ad")) {
                            c8 = 2;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case -1266374734:
                        if (str2.equals("show_rewarded_ad")) {
                            c8 = 5;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case -257098725:
                        if (str2.equals("load_rewarded_ad")) {
                            c8 = 4;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 393881811:
                        break;
                    case 585513149:
                        if (str2.equals("load_interstitial_ad")) {
                            c8 = 1;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 1671767583:
                        if (str2.equals("dispose")) {
                            c8 = 6;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 2109237041:
                        if (str2.equals("create_rewarded_ad")) {
                            c8 = 3;
                            break;
                        }
                        c8 = 65535;
                        break;
                    default:
                        c8 = 65535;
                        break;
                }
                switch (c8) {
                    case 0:
                        if (this.f5263h.size() < ((Integer) sw.c().b(m10.V6)).intValue()) {
                            Map<Long, ww1> map = this.f5263h;
                            Long valueOf2 = Long.valueOf(parseLong);
                            if (!map.containsKey(valueOf2)) {
                                String str4 = s7.get("ad_unit");
                                if (!TextUtils.isEmpty(str4)) {
                                    xw1 a7 = this.f5261f.a();
                                    a7.a(parseLong);
                                    a7.b(str4);
                                    this.f5263h.put(valueOf2, a7.c().zza());
                                    this.f5262g.h(parseLong);
                                    StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 59);
                                    sb.append("Created H5 interstitial #");
                                    sb.append(parseLong);
                                    sb.append(" with ad unit ");
                                    sb.append(str4);
                                    a3.r1.k(sb.toString());
                                    break;
                                } else {
                                    io0.g("Could not create H5 ad, missing ad unit id");
                                    this.f5262g.i(parseLong);
                                    break;
                                }
                            } else {
                                io0.b("Could not create H5 ad, object ID already exists");
                                this.f5262g.i(parseLong);
                                break;
                            }
                        } else {
                            io0.g("Could not create H5 ad, too many existing objects");
                            this.f5262g.i(parseLong);
                            break;
                        }
                    case 1:
                        ww1 ww1Var = this.f5263h.get(Long.valueOf(parseLong));
                        if (ww1Var != null) {
                            ww1Var.a(s6(s7));
                            break;
                        } else {
                            io0.b("Could not load H5 ad, object ID does not exist");
                            this.f5262g.f(parseLong);
                            break;
                        }
                    case 2:
                        ww1 ww1Var2 = this.f5263h.get(Long.valueOf(parseLong));
                        if (ww1Var2 != null) {
                            ww1Var2.c();
                            break;
                        } else {
                            io0.b("Could not show H5 ad, object ID does not exist");
                            this.f5262g.f(parseLong);
                            break;
                        }
                    case 3:
                        if (this.f5263h.size() < ((Integer) sw.c().b(m10.V6)).intValue()) {
                            Map<Long, ww1> map2 = this.f5263h;
                            Long valueOf3 = Long.valueOf(parseLong);
                            if (!map2.containsKey(valueOf3)) {
                                String str5 = s7.get("ad_unit");
                                if (!TextUtils.isEmpty(str5)) {
                                    xw1 a8 = this.f5261f.a();
                                    a8.a(parseLong);
                                    a8.b(str5);
                                    this.f5263h.put(valueOf3, a8.c().a());
                                    this.f5262g.h(parseLong);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 55);
                                    sb2.append("Created H5 rewarded #");
                                    sb2.append(parseLong);
                                    sb2.append(" with ad unit ");
                                    sb2.append(str5);
                                    a3.r1.k(sb2.toString());
                                    break;
                                } else {
                                    io0.g("Could not create H5 ad, missing ad unit id");
                                    this.f5262g.i(parseLong);
                                    break;
                                }
                            } else {
                                io0.b("Could not create H5 ad, object ID already exists");
                                this.f5262g.i(parseLong);
                                break;
                            }
                        } else {
                            io0.g("Could not create H5 ad, too many existing objects");
                            this.f5262g.i(parseLong);
                            break;
                        }
                    case 4:
                        ww1 ww1Var3 = this.f5263h.get(Long.valueOf(parseLong));
                        if (ww1Var3 != null) {
                            ww1Var3.a(s6(s7));
                            break;
                        } else {
                            io0.b("Could not load H5 ad, object ID does not exist");
                            this.f5262g.q(parseLong);
                            break;
                        }
                    case 5:
                        ww1 ww1Var4 = this.f5263h.get(Long.valueOf(parseLong));
                        if (ww1Var4 != null) {
                            ww1Var4.c();
                            break;
                        } else {
                            io0.b("Could not show H5 ad, object ID does not exist");
                            this.f5262g.q(parseLong);
                            break;
                        }
                    case 6:
                        Map<Long, ww1> map3 = this.f5263h;
                        Long valueOf4 = Long.valueOf(parseLong);
                        ww1 ww1Var5 = map3.get(valueOf4);
                        if (ww1Var5 != null) {
                            ww1Var5.zza();
                            this.f5263h.remove(valueOf4);
                            StringBuilder sb3 = new StringBuilder(36);
                            sb3.append("Disposed H5 ad #");
                            sb3.append(parseLong);
                            a3.r1.k(sb3.toString());
                            break;
                        } else {
                            io0.b("Could not dispose H5 ad, object ID does not exist");
                            break;
                        }
                    default:
                        io0.b(str2.length() != 0 ? "H5 gmsg contained invalid action: ".concat(str2) : new String("H5 gmsg contained invalid action: "));
                        break;
                }
            } catch (NullPointerException | NumberFormatException unused) {
                String valueOf5 = String.valueOf(str3);
                io0.b(valueOf5.length() != 0 ? "H5 gmsg did not contain a valid object id: ".concat(valueOf5) : new String("H5 gmsg did not contain a valid object id: "));
            }
        }
    }
}
