package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.jG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3409jG {

    /* renamed from: b, reason: collision with root package name */
    public static final C3409jG f32096b = new C3409jG();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f32097a = new HashMap();

    public final synchronized void a(String str, AbstractC4000uE abstractC4000uE) {
        try {
            HashMap hashMap = this.f32097a;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, abstractC4000uE);
                return;
            }
            if (((AbstractC4000uE) hashMap.get(str)).equals(abstractC4000uE)) {
                return;
            }
            String valueOf = String.valueOf(hashMap.get(str));
            String valueOf2 = String.valueOf(abstractC4000uE);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + valueOf.length() + 17 + valueOf2.length());
            sb.append("Parameters object with name ");
            sb.append(str);
            sb.append(" already exists (");
            sb.append(valueOf);
            sb.append("), cannot insert ");
            sb.append(valueOf2);
            throw new GeneralSecurityException(sb.toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (AbstractC4000uE) entry.getValue());
        }
    }
}
