package com.anythink.core.common.s.a;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, a> f16533a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final ReferenceQueue<Object> f16534b = new ReferenceQueue<>();

    public static class a extends WeakReference<Object> {

        /* renamed from: a, reason: collision with root package name */
        private final String f16535a;

        public a(String str, Object obj, ReferenceQueue<Object> referenceQueue) {
            super(obj, referenceQueue);
            this.f16535a = str;
        }
    }

    public final synchronized Object a(String str) {
        b();
        a aVar = this.f16533a.get(str);
        if (aVar == null) {
            return null;
        }
        return aVar.get();
    }

    public final synchronized void b(String str) {
        this.f16533a.remove(str);
    }

    private void b() {
        a aVar = (a) this.f16534b.poll();
        while (aVar != null) {
            a aVar2 = this.f16533a.get(aVar.f16535a);
            if (aVar2 != null && aVar2.get() == null) {
                this.f16533a.remove(aVar.f16535a);
            }
            aVar = (a) this.f16534b.poll();
        }
    }

    public final synchronized void a(String str, Object obj) {
        try {
            b();
            if (obj != null) {
                a aVar = this.f16533a.get(str);
                if (aVar != null) {
                    if (aVar.get() != obj) {
                    }
                }
                this.f16533a.put(str, new a(str, obj, this.f16534b));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() {
        this.f16533a.clear();
        b();
    }
}
