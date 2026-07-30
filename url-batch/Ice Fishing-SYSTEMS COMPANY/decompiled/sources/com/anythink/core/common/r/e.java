package com.anythink.core.common.r;

import android.os.Handler;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16222a = "e";

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Integer> f16223b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, f> f16224c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private Handler f16225d;

    public final void a(h hVar, Handler handler, a aVar) {
        try {
            this.f16225d = handler;
            g gVar = hVar != null ? hVar.f16247j : null;
            if (gVar == null) {
                return;
            }
            if (!gVar.a(16)) {
                String str = hVar.f16240b;
                return;
            }
            String str2 = hVar.f16240b;
            Integer num = this.f16223b.get(str2);
            Integer valueOf = num != null ? Integer.valueOf(num.intValue() + 1) : 1;
            hVar.i = valueOf.intValue();
            this.f16223b.put(str2, valueOf);
            if (valueOf.intValue() > gVar.g()) {
                return;
            }
            long h9 = gVar.h() * valueOf.intValue();
            f fVar = new f(hVar, aVar);
            this.f16224c.put(str2, fVar);
            handler.postDelayed(fVar, h9);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public final void a(h hVar) {
        f remove;
        if (hVar == null) {
            return;
        }
        String str = hVar.f16240b;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            hVar.i = 0;
            this.f16223b.remove(str);
            if (this.f16225d == null || (remove = this.f16224c.remove(str)) == null) {
                return;
            }
            this.f16225d.removeCallbacks(remove);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
