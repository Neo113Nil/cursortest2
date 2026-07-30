package com.anythink.core.common;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12376a = "1";

    /* renamed from: c, reason: collision with root package name */
    private static volatile b f12377c;

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, List<a>> f12378b = new ConcurrentHashMap<>();

    public interface a {
        void a(Object obj);
    }

    private b() {
    }

    public static b a() {
        if (f12377c == null) {
            synchronized (b.class) {
                try {
                    if (f12377c == null) {
                        f12377c = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12377c;
    }

    public final synchronized void b(final String str, final a aVar) {
        if (!TextUtils.isEmpty(str) && aVar != null) {
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.b.2
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (b.this) {
                        try {
                            List<a> list = b.this.f12378b.get(str);
                            if (list != null) {
                                list.remove(aVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, 2);
        }
    }

    public final synchronized void a(final String str, final a aVar) {
        if (!TextUtils.isEmpty(str) && aVar != null) {
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (b.this) {
                        try {
                            List<a> list = b.this.f12378b.get(str);
                            if (list == null) {
                                list = new ArrayList<>();
                                b.this.f12378b.put(str, list);
                            }
                            list.add(aVar);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, 2);
        }
    }

    public final synchronized void a(final String str, final Object obj) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.b.3
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (b.this) {
                    try {
                        List<a> list = b.this.f12378b.get(str);
                        if (list == null) {
                            return;
                        }
                        for (a aVar : list) {
                            if (aVar != null) {
                                aVar.a(obj);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }, 2);
    }
}
