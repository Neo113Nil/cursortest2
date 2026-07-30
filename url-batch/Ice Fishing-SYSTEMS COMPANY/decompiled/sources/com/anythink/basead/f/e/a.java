package com.anythink.basead.f.e;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.b.c.c;
import com.anythink.basead.d.f;
import com.anythink.basead.d.g;
import com.anythink.basead.d.j;
import com.anythink.basead.f.f.c;
import com.anythink.basead.i.d;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.s;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.bi;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.m.q;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f9101c;

    /* renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, Boolean> f9102a = new ConcurrentHashMap<>(3);

    /* renamed from: b, reason: collision with root package name */
    private Context f9103b;

    /* renamed from: com.anythink.basead.f.e.a$1, reason: invalid class name */
    public class AnonymousClass1 implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f9104a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0040a f9105b;

        public AnonymousClass1(x xVar, InterfaceC0040a interfaceC0040a) {
            this.f9104a = xVar;
            this.f9105b = interfaceC0040a;
        }

        @Override // com.anythink.core.common.m.q
        public final void onLoadCanceled(int i) {
            InterfaceC0040a interfaceC0040a = this.f9105b;
            if (interfaceC0040a != null) {
                interfaceC0040a.a(null, g.a(g.i, "Cancel Request."));
            }
        }

        @Override // com.anythink.core.common.m.q
        public final void onLoadError(int i, String str, AdError adError) {
            InterfaceC0040a interfaceC0040a = this.f9105b;
            if (interfaceC0040a != null) {
                interfaceC0040a.a(null, g.a(g.i, str));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        @Override // com.anythink.core.common.m.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onLoadFinish(int i, Object obj) {
            JSONObject jSONObject;
            bi biVar;
            try {
                jSONObject = (JSONObject) obj;
                try {
                    jSONObject.put(b.f9111a, System.currentTimeMillis());
                    biVar = b.a(this.f9104a, jSONObject);
                } catch (Exception unused) {
                    biVar = null;
                    if (biVar != null) {
                    }
                }
            } catch (Exception unused2) {
                jSONObject = null;
            }
            if (biVar != null) {
                InterfaceC0040a interfaceC0040a = this.f9105b;
                if (interfaceC0040a != null) {
                    interfaceC0040a.a(null, g.a(g.i, obj != null ? obj.toString() : "No Ad Return."));
                    return;
                }
                return;
            }
            com.anythink.basead.f.f.b.a(biVar);
            if (biVar.e() == 1 && com.anythink.basead.b.b.a(a.this.f9103b.getApplicationContext(), biVar.I())) {
                c a9 = c.a();
                Context context = a.this.f9103b;
                x xVar = this.f9104a;
                a9.a(context, c.a(xVar.f14313b, xVar.f14314c), biVar, this.f9104a.f14325o);
                InterfaceC0040a interfaceC0040a2 = this.f9105b;
                if (interfaceC0040a2 != null) {
                    interfaceC0040a2.a(null, g.a(g.i, "Application installed."));
                    return;
                }
                return;
            }
            if (biVar.e() == 2 && !com.anythink.basead.b.b.a(a.this.f9103b.getApplicationContext(), biVar.I())) {
                c a10 = c.a();
                Context context2 = a.this.f9103b;
                x xVar2 = this.f9104a;
                a10.a(context2, c.a(xVar2.f14313b, xVar2.f14314c), biVar, this.f9104a.f14325o);
                InterfaceC0040a interfaceC0040a3 = this.f9105b;
                if (interfaceC0040a3 != null) {
                    interfaceC0040a3.a(null, g.a(g.i, "Application not installed yet."));
                    return;
                }
                return;
            }
            com.anythink.basead.f.f.a.a(this.f9104a, biVar);
            com.anythink.basead.b.b.a(10, biVar, new j(this.f9104a, ""));
            com.anythink.core.basead.b.a();
            Context context3 = a.this.f9103b;
            com.anythink.core.basead.b.a();
            com.anythink.core.basead.b.a(context3, com.anythink.core.basead.b.a(this.f9104a), jSONObject.toString());
            a.this.a(this.f9104a, biVar);
            InterfaceC0040a interfaceC0040a4 = this.f9105b;
            if (interfaceC0040a4 != null) {
                interfaceC0040a4.a();
            }
            a.this.a(biVar, this.f9104a, this.f9105b);
        }

        @Override // com.anythink.core.common.m.q
        public final void onLoadStart(int i) {
        }
    }

    /* renamed from: com.anythink.basead.f.e.a$a, reason: collision with other inner class name */
    public interface InterfaceC0040a {
        void a();

        void a(bi biVar);

        void a(bi biVar, f fVar);
    }

    private a(Context context) {
        this.f9103b = context.getApplicationContext();
    }

    private void b(x xVar, String str, InterfaceC0040a interfaceC0040a) {
        bi biVar;
        int i;
        int i4;
        int i9;
        String[] split;
        try {
            biVar = a(xVar);
        } catch (Throwable unused) {
            biVar = null;
        }
        if (biVar != null && !biVar.ay()) {
            a(xVar, biVar);
            if (interfaceC0040a != null) {
                interfaceC0040a.a();
            }
            a(biVar, xVar, interfaceC0040a);
            return;
        }
        if (TextUtils.isEmpty(xVar.f14325o.D())) {
            i9 = 0;
            i4 = 0;
        } else {
            try {
                split = xVar.f14325o.D().split("x");
                i = Integer.parseInt(split[0]);
            } catch (Throwable unused2) {
                i = 0;
            }
            try {
                i4 = Integer.parseInt(split[1]);
            } catch (Throwable unused3) {
                i4 = 0;
                i9 = i;
                new d(xVar, i9, i4, c.a().a(this.f9103b, c.a(xVar.f14313b, xVar.f14314c)), str).a(0, (q) new AnonymousClass1(xVar, interfaceC0040a));
            }
            i9 = i;
        }
        new d(xVar, i9, i4, c.a().a(this.f9103b, c.a(xVar.f14313b, xVar.f14314c)), str).a(0, (q) new AnonymousClass1(xVar, interfaceC0040a));
    }

    public static a a(Context context) {
        if (f9101c == null) {
            synchronized (a.class) {
                try {
                    if (f9101c == null) {
                        f9101c = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f9101c;
    }

    public final void a(x xVar, String str, InterfaceC0040a interfaceC0040a) {
        int i;
        int i4;
        int i9;
        String[] split;
        com.anythink.core.basead.b.a();
        String a9 = com.anythink.core.basead.b.a(xVar);
        bi biVar = null;
        if (this.f9102a.contains(a9) && this.f9102a.get(a9).booleanValue()) {
            interfaceC0040a.a(null, g.a(g.f6333g, g.f6348w));
            return;
        }
        this.f9102a.put(a9, Boolean.TRUE);
        try {
            biVar = a(xVar);
        } catch (Throwable unused) {
        }
        if (biVar != null && !biVar.ay()) {
            a(xVar, biVar);
            interfaceC0040a.a();
            a(biVar, xVar, interfaceC0040a);
            return;
        }
        if (TextUtils.isEmpty(xVar.f14325o.D())) {
            i9 = 0;
            i4 = 0;
        } else {
            try {
                split = xVar.f14325o.D().split("x");
                i = Integer.parseInt(split[0]);
            } catch (Throwable unused2) {
                i = 0;
            }
            try {
                i4 = Integer.parseInt(split[1]);
            } catch (Throwable unused3) {
                i4 = 0;
                i9 = i;
                new d(xVar, i9, i4, c.a().a(this.f9103b, c.a(xVar.f14313b, xVar.f14314c)), str).a(0, (q) new AnonymousClass1(xVar, interfaceC0040a));
            }
            i9 = i;
        }
        new d(xVar, i9, i4, c.a().a(this.f9103b, c.a(xVar.f14313b, xVar.f14314c)), str).a(0, (q) new AnonymousClass1(xVar, interfaceC0040a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(x xVar, w wVar) {
        s c4 = t.b().c();
        if (c4 != null && c4.a()) {
            c4.fillDataFetchStatus(this.f9103b, wVar, xVar);
        } else {
            wVar.m(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final bi biVar, final x xVar, final InterfaceC0040a interfaceC0040a) {
        com.anythink.basead.b.f.a();
        com.anythink.basead.b.f.a(xVar.f14313b, biVar, xVar, new c.b() { // from class: com.anythink.basead.f.e.a.2
            @Override // com.anythink.basead.b.c.c.b
            public final void a() {
                ConcurrentHashMap<String, Boolean> concurrentHashMap = a.this.f9102a;
                com.anythink.core.basead.b.a();
                concurrentHashMap.put(com.anythink.core.basead.b.a(xVar), Boolean.FALSE);
                InterfaceC0040a interfaceC0040a2 = interfaceC0040a;
                if (interfaceC0040a2 != null) {
                    interfaceC0040a2.a(biVar);
                }
            }

            @Override // com.anythink.basead.b.c.c.b
            public final void a(f fVar) {
                ConcurrentHashMap<String, Boolean> concurrentHashMap = a.this.f9102a;
                com.anythink.core.basead.b.a();
                concurrentHashMap.put(com.anythink.core.basead.b.a(xVar), Boolean.FALSE);
                InterfaceC0040a interfaceC0040a2 = interfaceC0040a;
                if (interfaceC0040a2 != null) {
                    interfaceC0040a2.a(biVar, fVar);
                }
            }
        });
    }

    private bi a(x xVar) {
        com.anythink.core.basead.b.a();
        String a9 = com.anythink.core.basead.b.a(xVar);
        com.anythink.core.basead.b.a();
        String a10 = com.anythink.core.basead.b.a(this.f9103b, a9);
        bi biVar = null;
        if (TextUtils.isEmpty(a10)) {
            return null;
        }
        try {
            biVar = b.a(xVar, new JSONObject(a10));
        } catch (Throwable unused) {
        }
        if (biVar != null) {
            com.anythink.basead.f.f.b.a(biVar);
            com.anythink.basead.f.f.a.a(xVar, biVar);
        }
        return biVar;
    }
}
