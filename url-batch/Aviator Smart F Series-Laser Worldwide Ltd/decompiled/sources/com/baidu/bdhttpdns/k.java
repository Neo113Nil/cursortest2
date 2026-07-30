package com.baidu.bdhttpdns;

import android.content.Context;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.bdhttpdns.BDHttpDns;
import com.baidu.bdhttpdns.h;
import com.baidu.bdhttpdns.i;
import java.util.Map;

/* loaded from: classes.dex */
public class k implements i.a {

    /* renamed from: a, reason: collision with root package name */
    private final h f4272a;

    /* renamed from: b, reason: collision with root package name */
    private final BDHttpDns f4273b;

    /* renamed from: c, reason: collision with root package name */
    private final BDHttpDns.CachePolicy f4274c;

    /* renamed from: d, reason: collision with root package name */
    private final i f4275d;

    public k(Context context) {
        BDHttpDns service = BDHttpDns.getService(context);
        this.f4273b = service;
        this.f4272a = service.a();
        this.f4274c = service.c();
        this.f4275d = service.d();
    }

    @Override // com.baidu.bdhttpdns.i.a
    public void a(int i8, i.d dVar, Map<String, i.e> map, String str) {
        if (i8 != -1) {
            if (i8 != 0) {
                l.a("Internal error: async httpdns resolve completion get error ret(%d)", Integer.valueOf(i8));
            } else {
                for (Map.Entry<String, i.e> entry : map.entrySet()) {
                    String key = entry.getKey();
                    i.e value = entry.getValue();
                    if (value != null) {
                        h.a aVar = new h.a();
                        aVar.a(value.c());
                        aVar.b(System.currentTimeMillis() / 1000);
                        aVar.a(value.a());
                        aVar.b(value.b());
                        this.f4272a.a(key, aVar);
                    } else if (this.f4274c == BDHttpDns.CachePolicy.POLICY_TOLERANT) {
                        this.f4272a.b(key);
                    }
                }
            }
        } else if (dVar.equals(i.d.DNLIST_HOSTS) && this.f4274c == BDHttpDns.CachePolicy.POLICY_TOLERANT) {
            for (String str2 : str.split(SystemInfoUtil.COMMA)) {
                this.f4272a.b(str2);
            }
        }
        if (this.f4273b.e() <= 0 || this.f4275d.f()) {
            return;
        }
        this.f4275d.b(true);
        l.a("preResolve has finished", new Object[0]);
    }
}
