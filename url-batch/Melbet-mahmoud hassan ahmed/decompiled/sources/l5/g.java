package l5;

import java.util.HashMap;
import m5.k;
import m5.r;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final m5.k f18649a;

    /* renamed from: b, reason: collision with root package name */
    private b f18650b;

    /* renamed from: c, reason: collision with root package name */
    private final k.c f18651c;

    class a implements k.c {
        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
        
            return;
         */
        @Override // m5.k.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void C(m5.j jVar, k.d dVar) {
            if (g.this.f18650b == null) {
                return;
            }
            String str = jVar.f19247a;
            z4.b.e("MouseCursorChannel", "Received '" + str + "' message.");
            char c7 = 65535;
            try {
                if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                    c7 = 0;
                }
                try {
                    g.this.f18650b.a((String) ((HashMap) jVar.f19248b).get("kind"));
                    dVar.a(Boolean.TRUE);
                } catch (Exception e7) {
                    dVar.b("error", "Error when setting cursors: " + e7.getMessage(), null);
                }
            } catch (Exception e8) {
                dVar.b("error", "Unhandled error: " + e8.getMessage(), null);
            }
        }
    }

    public interface b {
        void a(String str);
    }

    public g(a5.a aVar) {
        a aVar2 = new a();
        this.f18651c = aVar2;
        m5.k kVar = new m5.k(aVar, "flutter/mousecursor", r.f19262b);
        this.f18649a = kVar;
        kVar.e(aVar2);
    }

    public void b(b bVar) {
        this.f18650b = bVar;
    }
}
