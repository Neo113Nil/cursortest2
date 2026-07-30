package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.Ub, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2803Ub implements InterfaceC2990bc {

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f28041n = Pattern.compile("^[a-zA-Z]([a-zA-Z0-9]|:|-|_)*$");

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f28042u = Pattern.compile("^[0-9]*(,[0-9]*)*$");

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
    public final void g(Object obj, Map map) {
        InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) obj;
        String str = (String) map.get(NativeAdvancedJsUtils.f18064p);
        boolean equals = "tick".equals(str);
        Pattern pattern = f28041n;
        if (!equals) {
            if ("experiment".equals(str)) {
                String str2 = (String) map.get("value");
                if (TextUtils.isEmpty(str2)) {
                    int i = t2.C.f40822b;
                    u2.i.f("No value given for CSI experiment.");
                    return;
                }
                if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31452H2)).booleanValue() || f28042u.matcher(str2).matches()) {
                    ((C3636na) interfaceC3858rh.n().f28863v).c("e", str2);
                    return;
                } else {
                    int i4 = t2.C.f40822b;
                    u2.i.a("Invalid value given for CSI experiment. Should be a comma separated list of numbers.");
                    return;
                }
            }
            if ("extra".equals(str)) {
                String str3 = (String) map.get("name");
                String str4 = (String) map.get("value");
                if (TextUtils.isEmpty(str4)) {
                    int i9 = t2.C.f40822b;
                    u2.i.f("No value given for CSI extra.");
                    return;
                }
                if (TextUtils.isEmpty(str3)) {
                    int i10 = t2.C.f40822b;
                    u2.i.f("No name given for CSI extra.");
                    return;
                }
                if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31452H2)).booleanValue() || pattern.matcher(str3).matches()) {
                    ((C3636na) interfaceC3858rh.n().f28863v).c(str3, str4);
                    return;
                } else {
                    int i11 = t2.C.f40822b;
                    u2.i.a("Invalid name given for CSI extra. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                    return;
                }
            }
            return;
        }
        String str5 = (String) map.get("label");
        String str6 = (String) map.get("start_label");
        String str7 = (String) map.get(com.anythink.expressad.foundation.d.d.f18754u);
        if (TextUtils.isEmpty(str5)) {
            int i12 = t2.C.f40822b;
            u2.i.f("No label given for CSI tick.");
            return;
        }
        C3151ea c3151ea = AbstractC3368ia.f31452H2;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && !pattern.matcher(str5).matches()) {
            int i13 = t2.C.f40822b;
            u2.i.a("Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            return;
        }
        if (TextUtils.isEmpty(str7)) {
            int i14 = t2.C.f40822b;
            u2.i.f("No timestamp given for CSI tick.");
            return;
        }
        try {
            long parseLong = Long.parseLong(str7);
            p2.j jVar = p2.j.f39798C;
            jVar.f39810k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            jVar.f39810k.getClass();
            long elapsedRealtime = (parseLong - currentTimeMillis) + SystemClock.elapsedRealtime();
            if (true == TextUtils.isEmpty(str6)) {
                str6 = "native:view_load";
            }
            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && !pattern.matcher(str6).matches()) {
                int i15 = t2.C.f40822b;
                u2.i.a("Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                return;
            }
            C2881Yl n9 = interfaceC3858rh.n();
            HashMap hashMap = (HashMap) n9.f28862u;
            C3528la c3528la = (C3528la) hashMap.get(str6);
            String[] strArr = {str5};
            if (c3528la != null) {
                ((C3636na) n9.f28863v).a(c3528la, elapsedRealtime, strArr);
            }
            hashMap.put(str5, new C3528la(elapsedRealtime, null, null));
        } catch (NumberFormatException e6) {
            int i16 = t2.C.f40822b;
            u2.i.g("Malformed timestamp for CSI tick.", e6);
        }
    }
}
