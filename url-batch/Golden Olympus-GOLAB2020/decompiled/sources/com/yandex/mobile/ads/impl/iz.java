package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.yandex.mobile.ads.impl.hz;
import com.yandex.mobile.ads.impl.nz;
import com.yandex.mobile.ads.impl.rv0;
import java.util.Map;

/* loaded from: classes3.dex */
public final class iz implements y30 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f27427a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private rv0.d f27428b;

    /* renamed from: c, reason: collision with root package name */
    private hz f27429c;

    private static hz a(rv0.d dVar) {
        nz.a b4 = new nz.a().b();
        Uri uri = dVar.f31406b;
        eh0 eh0Var = new eh0(uri == null ? null : uri.toString(), dVar.f31410f, b4);
        x72<Map.Entry<String, String>> it = dVar.f31407c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            eh0Var.a(next.getKey(), next.getValue());
        }
        hz a4 = new hz.a().a(dVar.f31405a, hc0.f26703e).a(dVar.f31408d).b(dVar.f31409e).a(pp0.a(dVar.f31411g)).a(eh0Var);
        a4.a(dVar.a());
        return a4;
    }

    @Override // com.yandex.mobile.ads.impl.y30
    public final x30 a(rv0 rv0Var) {
        hz hzVar;
        rv0Var.f31379c.getClass();
        rv0.d dVar = rv0Var.f31379c.f31429c;
        if (dVar != null && u82.f32873a >= 18) {
            synchronized (this.f27427a) {
                try {
                    if (!u82.a(dVar, this.f27428b)) {
                        this.f27428b = dVar;
                        this.f27429c = a(dVar);
                    }
                    hzVar = this.f27429c;
                    hzVar.getClass();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return hzVar;
        }
        return x30.f34370a;
    }
}
