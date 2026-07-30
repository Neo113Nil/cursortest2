package com.anythink.basead.b;

import android.content.Context;
import android.content.IntentFilter;
import com.anythink.core.common.h.w;
import com.anythink.core.common.l;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    private static volatile h f6185b;

    /* renamed from: a, reason: collision with root package name */
    g f6186a;

    /* renamed from: c, reason: collision with root package name */
    private Context f6187c;

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap<String, w> f6188d = new ConcurrentHashMap<>();

    private h(Context context) {
        this.f6187c = context;
    }

    public static h a(Context context) {
        if (f6185b == null) {
            synchronized (h.class) {
                try {
                    if (f6185b == null) {
                        f6185b = new h(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6185b;
    }

    private void b() {
        if (this.f6186a != null) {
            l.a(this.f6187c).a(this.f6186a);
            this.f6186a = null;
        }
    }

    public final void c(String str, String str2) {
        w wVar = this.f6188d.get(str);
        if (wVar != null) {
            com.anythink.basead.d.j jVar = new com.anythink.basead.d.j("", "");
            com.anythink.basead.d.b bVar = new com.anythink.basead.d.b();
            jVar.f6372k = bVar;
            bVar.f6288a = str2;
            b.a(20, wVar, jVar);
        }
    }

    public final void d(String str, String str2) {
        w remove = this.f6188d.remove(str);
        if (remove != null) {
            com.anythink.basead.d.j jVar = new com.anythink.basead.d.j("", "");
            com.anythink.basead.d.b bVar = new com.anythink.basead.d.b();
            jVar.f6372k = bVar;
            bVar.f6288a = str2;
            b.a(21, remove, jVar);
        }
        if (this.f6188d.size() != 0 || this.f6186a == null) {
            return;
        }
        l.a(this.f6187c).a(this.f6186a);
        this.f6186a = null;
    }

    public final void b(String str, String str2) {
        w wVar = this.f6188d.get(str);
        if (wVar != null) {
            com.anythink.basead.d.j jVar = new com.anythink.basead.d.j("", "");
            com.anythink.basead.d.b bVar = new com.anythink.basead.d.b();
            jVar.f6372k = bVar;
            bVar.f6288a = str2;
            b.a(19, wVar, jVar);
        }
    }

    public final void a() {
        if (this.f6187c != null && this.f6186a == null) {
            this.f6186a = new g();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("at_offer_action_1");
            intentFilter.addAction("at_offer_action_2");
            intentFilter.addAction("at_offer_action_3");
            intentFilter.addAction("at_offer_action_4");
            l.a(this.f6187c).a(this.f6186a, intentFilter);
        }
    }

    public final void a(String str, w wVar) {
        this.f6188d.put(str, wVar);
    }

    public final void a(String str, String str2) {
        w wVar = this.f6188d.get(str);
        if (wVar != null) {
            com.anythink.basead.d.j jVar = new com.anythink.basead.d.j("", "");
            com.anythink.basead.d.b bVar = new com.anythink.basead.d.b();
            jVar.f6372k = bVar;
            bVar.f6288a = str2;
            b.a(18, wVar, jVar);
        }
    }
}
