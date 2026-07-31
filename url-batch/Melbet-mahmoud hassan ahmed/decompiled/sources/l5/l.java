package l5;

import java.util.HashMap;
import java.util.Map;
import m5.k;
import m5.r;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18740a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f18741b;

    /* renamed from: c, reason: collision with root package name */
    private m5.k f18742c;

    /* renamed from: d, reason: collision with root package name */
    private k.d f18743d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f18744e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f18745f;

    /* renamed from: g, reason: collision with root package name */
    private final k.c f18746g;

    class a implements k.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f18747a;

        a(byte[] bArr) {
            this.f18747a = bArr;
        }

        @Override // m5.k.d
        public void a(Object obj) {
            l.this.f18741b = this.f18747a;
        }

        @Override // m5.k.d
        public void b(String str, String str2, Object obj) {
            z4.b.b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }

        @Override // m5.k.d
        public void c() {
        }
    }

    class b implements k.c {
        b() {
        }

        @Override // m5.k.c
        public void C(m5.j jVar, k.d dVar) {
            Map i7;
            String str = jVar.f19247a;
            Object obj = jVar.f19248b;
            str.hashCode();
            if (str.equals("get")) {
                l.this.f18745f = true;
                if (!l.this.f18744e) {
                    l lVar = l.this;
                    if (lVar.f18740a) {
                        lVar.f18743d = dVar;
                        return;
                    }
                }
                l lVar2 = l.this;
                i7 = lVar2.i(lVar2.f18741b);
            } else if (!str.equals("put")) {
                dVar.c();
                return;
            } else {
                l.this.f18741b = (byte[]) obj;
                i7 = null;
            }
            dVar.a(i7);
        }
    }

    public l(a5.a aVar, boolean z6) {
        this(new m5.k(aVar, "flutter/restoration", r.f19262b), z6);
    }

    l(m5.k kVar, boolean z6) {
        this.f18744e = false;
        this.f18745f = false;
        b bVar = new b();
        this.f18746g = bVar;
        this.f18742c = kVar;
        this.f18740a = z6;
        kVar.e(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> i(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    public void g() {
        this.f18741b = null;
    }

    public byte[] h() {
        return this.f18741b;
    }

    public void j(byte[] bArr) {
        this.f18744e = true;
        k.d dVar = this.f18743d;
        if (dVar != null) {
            dVar.a(i(bArr));
            this.f18743d = null;
        } else if (this.f18745f) {
            this.f18742c.d("push", i(bArr), new a(bArr));
            return;
        }
        this.f18741b = bArr;
    }
}
