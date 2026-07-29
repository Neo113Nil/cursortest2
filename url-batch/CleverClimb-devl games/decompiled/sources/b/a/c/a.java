package b.a.c;

import b.aa;
import b.ab;
import b.ac;
import b.m;
import b.s;
import b.u;
import b.v;
import com.aiming.mdt.utils.Constants;
import java.io.IOException;
import java.util.List;

/* compiled from: BridgeInterceptor.java */
/* loaded from: classes.dex */
public final class a implements u {

    /* renamed from: a, reason: collision with root package name */
    private final m f1859a;

    public a(m mVar) {
        this.f1859a = mVar;
    }

    @Override // b.u
    public ac intercept(u.a aVar) throws IOException {
        aa a2 = aVar.a();
        aa.a e = a2.e();
        ab d2 = a2.d();
        if (d2 != null) {
            v a3 = d2.a();
            if (a3 != null) {
                e.a(Constants.KEY_CONTENT_TYPE, a3.toString());
            }
            long b2 = d2.b();
            if (b2 != -1) {
                e.a("Content-Length", Long.toString(b2));
                e.a("Transfer-Encoding");
            } else {
                e.a("Transfer-Encoding", "chunked");
                e.a("Content-Length");
            }
        }
        boolean z = false;
        if (a2.a("Host") == null) {
            e.a("Host", b.a.c.a(a2.a(), false));
        }
        if (a2.a("Connection") == null) {
            e.a("Connection", "Keep-Alive");
        }
        if (a2.a("Accept-Encoding") == null && a2.a("Range") == null) {
            z = true;
            e.a("Accept-Encoding", "gzip");
        }
        List<b.l> a4 = this.f1859a.a(a2.a());
        if (!a4.isEmpty()) {
            e.a("Cookie", a(a4));
        }
        if (a2.a("User-Agent") == null) {
            e.a("User-Agent", b.a.d.a());
        }
        ac a5 = aVar.a(e.a());
        e.a(this.f1859a, a2.a(), a5.e());
        ac.a a6 = a5.g().a(a2);
        if (z && "gzip".equalsIgnoreCase(a5.a("Content-Encoding")) && e.b(a5)) {
            c.i iVar = new c.i(a5.f().c());
            s a7 = a5.e().b().b("Content-Encoding").b("Content-Length").a();
            a6.a(a7);
            a6.a(new h(a7, c.k.a(iVar)));
        }
        return a6.a();
    }

    private String a(List<b.l> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            b.l lVar = list.get(i);
            sb.append(lVar.a());
            sb.append('=');
            sb.append(lVar.b());
        }
        return sb.toString();
    }
}
