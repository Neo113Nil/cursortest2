package n2;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import n2.l;
import n2.u;

/* loaded from: classes.dex */
public final class t implements l {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19561a;

    /* renamed from: b, reason: collision with root package name */
    private final List<p0> f19562b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final l f19563c;

    /* renamed from: d, reason: collision with root package name */
    private l f19564d;

    /* renamed from: e, reason: collision with root package name */
    private l f19565e;

    /* renamed from: f, reason: collision with root package name */
    private l f19566f;

    /* renamed from: g, reason: collision with root package name */
    private l f19567g;

    /* renamed from: h, reason: collision with root package name */
    private l f19568h;

    /* renamed from: i, reason: collision with root package name */
    private l f19569i;

    /* renamed from: j, reason: collision with root package name */
    private l f19570j;

    /* renamed from: k, reason: collision with root package name */
    private l f19571k;

    public static final class a implements l.a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f19572a;

        /* renamed from: b, reason: collision with root package name */
        private final l.a f19573b;

        /* renamed from: c, reason: collision with root package name */
        private p0 f19574c;

        public a(Context context) {
            this(context, new u.b());
        }

        public a(Context context, l.a aVar) {
            this.f19572a = context.getApplicationContext();
            this.f19573b = aVar;
        }

        @Override // n2.l.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t a() {
            t tVar = new t(this.f19572a, this.f19573b.a());
            p0 p0Var = this.f19574c;
            if (p0Var != null) {
                tVar.d(p0Var);
            }
            return tVar;
        }
    }

    public t(Context context, l lVar) {
        this.f19561a = context.getApplicationContext();
        this.f19563c = (l) o2.a.e(lVar);
    }

    private void q(l lVar) {
        for (int i7 = 0; i7 < this.f19562b.size(); i7++) {
            lVar.d(this.f19562b.get(i7));
        }
    }

    private l r() {
        if (this.f19565e == null) {
            c cVar = new c(this.f19561a);
            this.f19565e = cVar;
            q(cVar);
        }
        return this.f19565e;
    }

    private l s() {
        if (this.f19566f == null) {
            h hVar = new h(this.f19561a);
            this.f19566f = hVar;
            q(hVar);
        }
        return this.f19566f;
    }

    private l t() {
        if (this.f19569i == null) {
            j jVar = new j();
            this.f19569i = jVar;
            q(jVar);
        }
        return this.f19569i;
    }

    private l u() {
        if (this.f19564d == null) {
            y yVar = new y();
            this.f19564d = yVar;
            q(yVar);
        }
        return this.f19564d;
    }

    private l v() {
        if (this.f19570j == null) {
            k0 k0Var = new k0(this.f19561a);
            this.f19570j = k0Var;
            q(k0Var);
        }
        return this.f19570j;
    }

    private l w() {
        if (this.f19567g == null) {
            try {
                l lVar = (l) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f19567g = lVar;
                q(lVar);
            } catch (ClassNotFoundException unused) {
                o2.r.i("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e7) {
                throw new RuntimeException("Error instantiating RTMP extension", e7);
            }
            if (this.f19567g == null) {
                this.f19567g = this.f19563c;
            }
        }
        return this.f19567g;
    }

    private l x() {
        if (this.f19568h == null) {
            q0 q0Var = new q0();
            this.f19568h = q0Var;
            q(q0Var);
        }
        return this.f19568h;
    }

    private void y(l lVar, p0 p0Var) {
        if (lVar != null) {
            lVar.d(p0Var);
        }
    }

    @Override // n2.l
    public long b(p pVar) {
        l s7;
        o2.a.f(this.f19571k == null);
        String scheme = pVar.f19496a.getScheme();
        if (o2.m0.v0(pVar.f19496a)) {
            String path = pVar.f19496a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                s7 = u();
            }
            s7 = r();
        } else {
            if (!"asset".equals(scheme)) {
                s7 = "content".equals(scheme) ? s() : "rtmp".equals(scheme) ? w() : "udp".equals(scheme) ? x() : "data".equals(scheme) ? t() : ("rawresource".equals(scheme) || "android.resource".equals(scheme)) ? v() : this.f19563c;
            }
            s7 = r();
        }
        this.f19571k = s7;
        return this.f19571k.b(pVar);
    }

    @Override // n2.l
    public void close() {
        l lVar = this.f19571k;
        if (lVar != null) {
            try {
                lVar.close();
            } finally {
                this.f19571k = null;
            }
        }
    }

    @Override // n2.l
    public void d(p0 p0Var) {
        o2.a.e(p0Var);
        this.f19563c.d(p0Var);
        this.f19562b.add(p0Var);
        y(this.f19564d, p0Var);
        y(this.f19565e, p0Var);
        y(this.f19566f, p0Var);
        y(this.f19567g, p0Var);
        y(this.f19568h, p0Var);
        y(this.f19569i, p0Var);
        y(this.f19570j, p0Var);
    }

    @Override // n2.l
    public Map<String, List<String>> g() {
        l lVar = this.f19571k;
        return lVar == null ? Collections.emptyMap() : lVar.g();
    }

    @Override // n2.l
    public Uri k() {
        l lVar = this.f19571k;
        if (lVar == null) {
            return null;
        }
        return lVar.k();
    }

    @Override // n2.i
    public int read(byte[] bArr, int i7, int i8) {
        return ((l) o2.a.e(this.f19571k)).read(bArr, i7, i8);
    }
}
