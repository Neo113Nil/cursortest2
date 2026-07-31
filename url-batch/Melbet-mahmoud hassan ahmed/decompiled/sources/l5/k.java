package l5;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l5.k;
import m5.k;
import m5.r;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final m5.k f18707a;

    /* renamed from: b, reason: collision with root package name */
    private g f18708b;

    /* renamed from: c, reason: collision with root package name */
    private final k.c f18709c;

    class a implements k.c {
        a() {
        }

        private void b(m5.j jVar, k.d dVar) {
            try {
                k.this.f18708b.f(((Integer) jVar.b()).intValue());
                dVar.a(null);
            } catch (IllegalStateException e7) {
                dVar.b("error", k.c(e7), null);
            }
        }

        private void c(m5.j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            boolean z6 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
            try {
                if (z6) {
                    k.this.f18708b.i(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), wrap));
                    dVar.a(null);
                } else {
                    dVar.a(Long.valueOf(k.this.f18708b.d(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), wrap))));
                }
            } catch (IllegalStateException e7) {
                dVar.b("error", k.c(e7), null);
            }
        }

        private void d(m5.j jVar, k.d dVar) {
            try {
                k.this.f18708b.h(((Integer) ((Map) jVar.b()).get("id")).intValue());
                dVar.a(null);
            } catch (IllegalStateException e7) {
                dVar.b("error", k.c(e7), null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(k.d dVar, c cVar) {
            if (cVar == null) {
                dVar.b("error", "Failed to resize the platform view", null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf(cVar.f18711a));
            hashMap.put("height", Double.valueOf(cVar.f18712b));
            dVar.a(hashMap);
        }

        private void f(m5.j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                k.this.f18708b.b(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get("left")).doubleValue());
                dVar.a(null);
            } catch (IllegalStateException e7) {
                dVar.b("error", k.c(e7), null);
            }
        }

        private void g(m5.j jVar, final k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                k.this.f18708b.e(new e(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new b() { // from class: l5.j
                    @Override // l5.k.b
                    public final void a(k.c cVar) {
                        k.a.e(k.d.this, cVar);
                    }
                });
            } catch (IllegalStateException e7) {
                dVar.b("error", k.c(e7), null);
            }
        }

        private void h(m5.j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                k.this.f18708b.c(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.a(null);
            } catch (IllegalStateException e7) {
                dVar.b("error", k.c(e7), null);
            }
        }

        private void i(m5.j jVar, k.d dVar) {
            try {
                k.this.f18708b.a(((Boolean) jVar.b()).booleanValue());
                dVar.a(null);
            } catch (IllegalStateException e7) {
                dVar.b("error", k.c(e7), null);
            }
        }

        private void j(m5.j jVar, k.d dVar) {
            k.d dVar2;
            List list = (List) jVar.b();
            try {
                k.this.f18708b.g(new f(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                dVar2 = dVar;
            } catch (IllegalStateException e7) {
                e = e7;
                dVar2 = dVar;
            }
            try {
                dVar2.a(null);
            } catch (IllegalStateException e8) {
                e = e8;
                dVar2.b("error", k.c(e), null);
            }
        }

        @Override // m5.k.c
        public void C(m5.j jVar, k.d dVar) {
            if (k.this.f18708b == null) {
            }
            z4.b.e("PlatformViewsChannel", "Received '" + jVar.f19247a + "' message.");
            String str = jVar.f19247a;
            str.hashCode();
            switch (str) {
                case "create":
                    c(jVar, dVar);
                    break;
                case "offset":
                    f(jVar, dVar);
                    break;
                case "resize":
                    g(jVar, dVar);
                    break;
                case "clearFocus":
                    b(jVar, dVar);
                    break;
                case "synchronizeToNativeViewHierarchy":
                    i(jVar, dVar);
                    break;
                case "touch":
                    j(jVar, dVar);
                    break;
                case "setDirection":
                    h(jVar, dVar);
                    break;
                case "dispose":
                    d(jVar, dVar);
                    break;
                default:
                    dVar.c();
                    break;
            }
        }
    }

    public interface b {
        void a(c cVar);
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f18711a;

        /* renamed from: b, reason: collision with root package name */
        public final int f18712b;

        public c(int i7, int i8) {
            this.f18711a = i7;
            this.f18712b = i8;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f18713a;

        /* renamed from: b, reason: collision with root package name */
        public final String f18714b;

        /* renamed from: c, reason: collision with root package name */
        public final double f18715c;

        /* renamed from: d, reason: collision with root package name */
        public final double f18716d;

        /* renamed from: e, reason: collision with root package name */
        public final double f18717e;

        /* renamed from: f, reason: collision with root package name */
        public final double f18718f;

        /* renamed from: g, reason: collision with root package name */
        public final int f18719g;

        /* renamed from: h, reason: collision with root package name */
        public final ByteBuffer f18720h;

        public d(int i7, String str, double d7, double d8, double d9, double d10, int i8, ByteBuffer byteBuffer) {
            this.f18713a = i7;
            this.f18714b = str;
            this.f18717e = d7;
            this.f18718f = d8;
            this.f18715c = d9;
            this.f18716d = d10;
            this.f18719g = i8;
            this.f18720h = byteBuffer;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f18721a;

        /* renamed from: b, reason: collision with root package name */
        public final double f18722b;

        /* renamed from: c, reason: collision with root package name */
        public final double f18723c;

        public e(int i7, double d7, double d8) {
            this.f18721a = i7;
            this.f18722b = d7;
            this.f18723c = d8;
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f18724a;

        /* renamed from: b, reason: collision with root package name */
        public final Number f18725b;

        /* renamed from: c, reason: collision with root package name */
        public final Number f18726c;

        /* renamed from: d, reason: collision with root package name */
        public final int f18727d;

        /* renamed from: e, reason: collision with root package name */
        public final int f18728e;

        /* renamed from: f, reason: collision with root package name */
        public final Object f18729f;

        /* renamed from: g, reason: collision with root package name */
        public final Object f18730g;

        /* renamed from: h, reason: collision with root package name */
        public final int f18731h;

        /* renamed from: i, reason: collision with root package name */
        public final int f18732i;

        /* renamed from: j, reason: collision with root package name */
        public final float f18733j;

        /* renamed from: k, reason: collision with root package name */
        public final float f18734k;

        /* renamed from: l, reason: collision with root package name */
        public final int f18735l;

        /* renamed from: m, reason: collision with root package name */
        public final int f18736m;

        /* renamed from: n, reason: collision with root package name */
        public final int f18737n;

        /* renamed from: o, reason: collision with root package name */
        public final int f18738o;

        /* renamed from: p, reason: collision with root package name */
        public final long f18739p;

        public f(int i7, Number number, Number number2, int i8, int i9, Object obj, Object obj2, int i10, int i11, float f7, float f8, int i12, int i13, int i14, int i15, long j7) {
            this.f18724a = i7;
            this.f18725b = number;
            this.f18726c = number2;
            this.f18727d = i8;
            this.f18728e = i9;
            this.f18729f = obj;
            this.f18730g = obj2;
            this.f18731h = i10;
            this.f18732i = i11;
            this.f18733j = f7;
            this.f18734k = f8;
            this.f18735l = i12;
            this.f18736m = i13;
            this.f18737n = i14;
            this.f18738o = i15;
            this.f18739p = j7;
        }
    }

    public interface g {
        void a(boolean z6);

        void b(int i7, double d7, double d8);

        void c(int i7, int i8);

        long d(d dVar);

        void e(e eVar, b bVar);

        void f(int i7);

        void g(f fVar);

        void h(int i7);

        void i(d dVar);
    }

    public k(a5.a aVar) {
        a aVar2 = new a();
        this.f18709c = aVar2;
        m5.k kVar = new m5.k(aVar, "flutter/platform_views", r.f19262b);
        this.f18707a = kVar;
        kVar.e(aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public void d(int i7) {
        m5.k kVar = this.f18707a;
        if (kVar == null) {
            return;
        }
        kVar.c("viewFocused", Integer.valueOf(i7));
    }

    public void e(g gVar) {
        this.f18708b = gVar;
    }
}
