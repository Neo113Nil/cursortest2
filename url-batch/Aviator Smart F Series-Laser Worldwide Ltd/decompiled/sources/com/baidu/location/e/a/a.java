package com.baidu.location.e.a;

import android.os.Handler;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Integer, Object> f5157a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private Handler f5158b;

    /* renamed from: com.baidu.location.e.a.a$a, reason: collision with other inner class name */
    private static class C0054a {

        /* renamed from: a, reason: collision with root package name */
        private static a f5159a = new a();
    }

    public static a a() {
        return C0054a.f5159a;
    }

    public void b() {
        this.f5158b = new Handler();
    }
}
