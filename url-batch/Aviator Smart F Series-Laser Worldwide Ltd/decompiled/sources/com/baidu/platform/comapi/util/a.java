package com.baidu.platform.comapi.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9822a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, CopyOnWriteArraySet<b>> f9823b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, Object> f9824c = new HashMap();

    /* renamed from: com.baidu.platform.comapi.util.a$a, reason: collision with other inner class name */
    class RunnableC0119a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f9825a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f9826b;

        RunnableC0119a(b bVar, Object obj) {
            this.f9825a = bVar;
            this.f9826b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a(this.f9825a, this.f9826b);
        }
    }

    private class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final c f9828a;

        @Override // com.baidu.platform.comapi.util.a.c
        public void a(Object obj) {
            this.f9828a.a(obj);
        }

        public boolean equals(Object obj) {
            return this.f9828a.equals(obj);
        }
    }

    public interface c {
        void a(Object obj);
    }

    private a() {
    }

    public static a a() {
        return f9822a;
    }

    public void a(Object obj) {
        CopyOnWriteArraySet<b> copyOnWriteArraySet;
        if (this.f9823b.containsKey(obj.getClass())) {
            synchronized (this) {
                copyOnWriteArraySet = this.f9823b.get(obj.getClass());
            }
            Iterator<b> it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                j.a(new RunnableC0119a(it.next(), obj), 0L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c cVar, Object obj) {
        cVar.a(obj);
    }
}
