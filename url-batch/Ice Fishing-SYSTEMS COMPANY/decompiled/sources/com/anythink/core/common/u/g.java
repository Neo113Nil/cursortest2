package com.anythink.core.common.u;

import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.d.j;
import com.anythink.core.common.v.q;
import java.util.Map;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f16708a = 10001;

    private static void a(int i, int i4, Map<String, Object> map) {
        if (i == 2 && i4 == 10001 && map != null) {
            try {
                long b9 = q.b(map, "init_st");
                long b10 = q.b(map, "init_et");
                long b11 = q.b(map, "token_st");
                long b12 = q.b(map, "token_et");
                e.a(q.a(map, ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "-1"), q.a(map, "admob_init_adsource_id", ""), q.a(map, "admob_token_adsource_id", ""), q.a(map, j.w.f12767G, 0), b9, b10, b11, b12, (b9 <= 0 || b10 <= 0 || b11 <= 0 || b12 <= 0 || b9 <= b11) ? -1L : b10 - b11);
            } catch (Throwable unused) {
            }
        }
    }
}
