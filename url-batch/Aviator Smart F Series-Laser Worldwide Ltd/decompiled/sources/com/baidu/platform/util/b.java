package com.baidu.platform.util;

import android.text.TextUtils;
import com.baidu.mapapi.http.wrapper.HttpManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f10621a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Integer, HttpManager> f10622b = new HashMap();

    private b() {
    }

    public static b a() {
        if (f10621a == null) {
            synchronized (b.class) {
                try {
                    if (f10621a == null) {
                        f10621a = new b();
                    }
                } finally {
                }
            }
        }
        return f10621a;
    }

    public HttpManager b(int i8) {
        if (this.f10622b.containsKey(Integer.valueOf(i8))) {
            return this.f10622b.get(Integer.valueOf(i8));
        }
        a(i8);
        return this.f10622b.get(Integer.valueOf(i8));
    }

    private synchronized void a(int i8) {
        if (this.f10622b.containsKey(Integer.valueOf(i8))) {
            return;
        }
        String str = com.baidu.platform.domain.a.f10618a.get(Integer.valueOf(i8));
        String str2 = com.baidu.platform.domain.a.f10619b.get(Integer.valueOf(i8));
        if (!TextUtils.isEmpty(str)) {
            this.f10622b.put(Integer.valueOf(i8), new HttpManager(str, str2));
        }
    }
}
