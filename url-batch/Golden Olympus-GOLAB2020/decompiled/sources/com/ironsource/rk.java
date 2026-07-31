package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public class rk {

    /* renamed from: c, reason: collision with root package name */
    private static rk f18914c;

    /* renamed from: a, reason: collision with root package name */
    private final HashSet<ImpressionDataListener> f18915a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, List<String>> f18916b = new ConcurrentHashMap<>();

    rk() {
    }

    public static synchronized rk b() {
        rk rkVar;
        synchronized (rk.class) {
            try {
                if (f18914c == null) {
                    f18914c = new rk();
                }
                rkVar = f18914c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rkVar;
    }

    public HashSet<ImpressionDataListener> a() {
        return this.f18915a;
    }

    public ConcurrentHashMap<String, List<String>> c() {
        return this.f18916b;
    }

    public void d() {
        synchronized (this) {
            this.f18915a.clear();
        }
    }

    public void a(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f18915a.add(impressionDataListener);
        }
    }

    public void b(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f18915a.remove(impressionDataListener);
        }
    }

    public void a(String str, List<String> list) {
        this.f18916b.put(str, list);
    }
}
