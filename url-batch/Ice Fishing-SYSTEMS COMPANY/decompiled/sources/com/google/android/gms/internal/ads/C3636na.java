package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.internal.consent_sdk.C4313b;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.na, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3636na {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f32865a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f32866b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f32867c;

    public C3636na(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f32866b = linkedHashMap;
        this.f32867c = new Object();
        linkedHashMap.put(NativeAdvancedJsUtils.f18064p, "make_wv");
        linkedHashMap.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, str);
    }

    public static final C3528la d() {
        p2.j.f39798C.f39810k.getClass();
        return new C3528la(SystemClock.elapsedRealtime(), null, null);
    }

    public final void a(C3528la c3528la, long j9, String... strArr) {
        synchronized (this.f32867c) {
            this.f32865a.add(new C3528la(j9, strArr[0], c3528la));
        }
    }

    public final C3582ma b() {
        C3582ma c3582ma;
        boolean booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31828x2)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.f32867c) {
            try {
                LinkedList<C3528la> linkedList = this.f32865a;
                for (C3528la c3528la : linkedList) {
                    long j9 = c3528la.f32569a;
                    String str = c3528la.f32570b;
                    C3528la c3528la2 = c3528la.f32571c;
                    if (c3528la2 != null && j9 > 0) {
                        long j10 = j9 - c3528la2.f32569a;
                        sb.append(str);
                        sb.append('.');
                        sb.append(j10);
                        sb.append(',');
                        if (booleanValue) {
                            if (hashMap.containsKey(Long.valueOf(c3528la2.f32569a))) {
                                StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(c3528la2.f32569a));
                                sb2.append('+');
                                sb2.append(str);
                            } else {
                                hashMap.put(Long.valueOf(c3528la2.f32569a), new StringBuilder(str));
                            }
                        }
                    }
                }
                linkedList.clear();
                String str2 = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (booleanValue) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        long longValue = ((Long) entry.getKey()).longValue();
                        p2.j jVar = p2.j.f39798C;
                        jVar.f39810k.getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        jVar.f39810k.getClass();
                        sb3.append(currentTimeMillis + (longValue - SystemClock.elapsedRealtime()));
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    str2 = sb3.toString();
                }
                c3582ma = new C3582ma(sb.toString(), str2, 0);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3582ma;
    }

    public final void c(String str, String str2) {
        C4313b a9;
        if (TextUtils.isEmpty(str2) || (a9 = p2.j.f39798C.f39808h.a()) == null) {
            return;
        }
        synchronized (this.f32867c) {
            C3474ka c3474ka = (C3474ka) ((HashMap) a9.f35813c).get(str);
            if (c3474ka == null) {
                c3474ka = C3474ka.f32307b;
            }
            LinkedHashMap linkedHashMap = this.f32866b;
            linkedHashMap.put(str, c3474ka.a((String) linkedHashMap.get(str), str2));
        }
    }
}
