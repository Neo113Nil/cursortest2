package M3;

import G3.C0051b;
import G3.n;
import G3.s;
import G3.t;
import G3.x;
import G3.y;
import K3.k;
import T3.h;
import T3.i;
import T3.o;
import T3.p;
import T3.v;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;

/* loaded from: classes.dex */
public final class g implements L3.e {

    /* renamed from: a, reason: collision with root package name */
    public final s f1777a;

    /* renamed from: b, reason: collision with root package name */
    public final k f1778b;

    /* renamed from: c, reason: collision with root package name */
    public final i f1779c;

    /* renamed from: d, reason: collision with root package name */
    public final h f1780d;

    /* renamed from: e, reason: collision with root package name */
    public int f1781e;

    /* renamed from: f, reason: collision with root package name */
    public final G0.c f1782f;

    /* renamed from: g, reason: collision with root package name */
    public n f1783g;

    public g(s sVar, k kVar, p source, o sink) {
        kotlin.jvm.internal.i.e(source, "source");
        kotlin.jvm.internal.i.e(sink, "sink");
        this.f1777a = sVar;
        this.f1778b = kVar;
        this.f1779c = source;
        this.f1780d = sink;
        this.f1782f = new G0.c(source);
    }

    @Override // L3.e
    public final void a() {
        this.f1780d.flush();
    }

    @Override // L3.e
    public final x b(boolean z) {
        G0.c cVar = this.f1782f;
        int i4 = this.f1781e;
        if (i4 != 1 && i4 != 2 && i4 != 3) {
            throw new IllegalStateException(kotlin.jvm.internal.i.h(Integer.valueOf(i4), "state: ").toString());
        }
        G3.o oVar = null;
        try {
            String g4 = ((i) cVar.f829c).g(cVar.f828b);
            cVar.f828b -= g4.length();
            L3.h s4 = O3.d.s(g4);
            int i5 = s4.f1680b;
            x xVar = new x();
            xVar.f1021b = (t) s4.f1682d;
            xVar.f1022c = i5;
            xVar.f1023d = (String) s4.f1681c;
            xVar.f1025f = cVar.H().d();
            if (z && i5 == 100) {
                return null;
            }
            if (i5 == 100) {
                this.f1781e = 3;
                return xVar;
            }
            if (102 > i5 || i5 >= 200) {
                this.f1781e = 4;
                return xVar;
            }
            this.f1781e = 3;
            return xVar;
        } catch (EOFException e4) {
            G3.p pVar = this.f1778b.f1575b.f846a.f863h;
            pVar.getClass();
            try {
                G3.o oVar2 = new G3.o();
                oVar2.c(pVar, "/...");
                oVar = oVar2;
            } catch (IllegalArgumentException unused) {
            }
            kotlin.jvm.internal.i.b(oVar);
            oVar.f939b = C0051b.b("", 0, " \"':;<=>@[]^`{}|/\\?#", 0, 251);
            oVar.f940c = C0051b.b("", 0, " \"':;<=>@[]^`{}|/\\?#", 0, 251);
            throw new IOException(kotlin.jvm.internal.i.h(oVar.a().f954h, "unexpected end of stream on "), e4);
        }
    }

    @Override // L3.e
    public final k c() {
        return this.f1778b;
    }

    @Override // L3.e
    public final void cancel() {
        Socket socket = this.f1778b.f1576c;
        if (socket == null) {
            return;
        }
        H3.b.d(socket);
    }

    @Override // L3.e
    public final v d(y yVar) {
        if (!L3.f.a(yVar)) {
            return i(0L);
        }
        if ("chunked".equalsIgnoreCase(y.a(yVar, "Transfer-Encoding"))) {
            G3.p pVar = yVar.f1033a.f1012a;
            int i4 = this.f1781e;
            if (i4 != 4) {
                throw new IllegalStateException(kotlin.jvm.internal.i.h(Integer.valueOf(i4), "state: ").toString());
            }
            this.f1781e = 5;
            return new c(this, pVar);
        }
        long i5 = H3.b.i(yVar);
        if (i5 != -1) {
            return i(i5);
        }
        int i6 = this.f1781e;
        if (i6 != 4) {
            throw new IllegalStateException(kotlin.jvm.internal.i.h(Integer.valueOf(i6), "state: ").toString());
        }
        this.f1781e = 5;
        this.f1778b.k();
        return new f(this);
    }

    @Override // L3.e
    public final T3.t e(G3.v vVar, long j4) {
        if ("chunked".equalsIgnoreCase(vVar.f1014c.b("Transfer-Encoding"))) {
            int i4 = this.f1781e;
            if (i4 != 1) {
                throw new IllegalStateException(kotlin.jvm.internal.i.h(Integer.valueOf(i4), "state: ").toString());
            }
            this.f1781e = 2;
            return new b(this);
        }
        if (j4 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        int i5 = this.f1781e;
        if (i5 != 1) {
            throw new IllegalStateException(kotlin.jvm.internal.i.h(Integer.valueOf(i5), "state: ").toString());
        }
        this.f1781e = 2;
        return new e(this);
    }

    @Override // L3.e
    public final void f() {
        this.f1780d.flush();
    }

    @Override // L3.e
    public final long g(y yVar) {
        if (!L3.f.a(yVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(y.a(yVar, "Transfer-Encoding"))) {
            return -1L;
        }
        return H3.b.i(yVar);
    }

    @Override // L3.e
    public final void h(G3.v vVar) {
        Proxy.Type type = this.f1778b.f1575b.f847b.type();
        kotlin.jvm.internal.i.d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append(vVar.f1013b);
        sb.append(' ');
        G3.p pVar = vVar.f1012a;
        if (pVar.f955i || type != Proxy.Type.HTTP) {
            String b4 = pVar.b();
            String d4 = pVar.d();
            if (d4 != null) {
                b4 = b4 + '?' + ((Object) d4);
            }
            sb.append(b4);
        } else {
            sb.append(pVar);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        j(vVar.f1014c, sb2);
    }

    public final d i(long j4) {
        int i4 = this.f1781e;
        if (i4 != 4) {
            throw new IllegalStateException(kotlin.jvm.internal.i.h(Integer.valueOf(i4), "state: ").toString());
        }
        this.f1781e = 5;
        return new d(this, j4);
    }

    public final void j(n nVar, String requestLine) {
        kotlin.jvm.internal.i.e(requestLine, "requestLine");
        int i4 = this.f1781e;
        if (i4 != 0) {
            throw new IllegalStateException(kotlin.jvm.internal.i.h(Integer.valueOf(i4), "state: ").toString());
        }
        h hVar = this.f1780d;
        hVar.h(requestLine).h(IOUtils.LINE_SEPARATOR_WINDOWS);
        int size = nVar.size();
        for (int i5 = 0; i5 < size; i5++) {
            hVar.h(nVar.c(i5)).h(": ").h(nVar.e(i5)).h(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
        hVar.h(IOUtils.LINE_SEPARATOR_WINDOWS);
        this.f1781e = 1;
    }
}
