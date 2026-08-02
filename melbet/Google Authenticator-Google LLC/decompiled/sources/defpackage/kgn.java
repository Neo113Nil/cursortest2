package defpackage;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kgn extends kar {
    private static final boolean a = ixi.b(kgn.class.getClassLoader());

    @Override // defpackage.kan
    public final kaq a(kbz kbzVar, kal kalVar) {
        String str = null;
        if (!"dns".equals(kbzVar.k)) {
            return null;
        }
        int i = hel.d;
        heg hegVar = new heg(4);
        kbz.d(kbzVar.l, hegVar);
        hel g = hegVar.g();
        hoq.F(!g.isEmpty(), "expected 1 path segment in target %s but found %s", kbzVar, g);
        String str2 = (String) g.get(0);
        if (kbzVar.f()) {
            StringBuilder sb = new StringBuilder();
            kbzVar.c(sb);
            str = sb.toString();
        }
        kbz.a(str);
        return new kgm(str2, kalVar, khd.n, new hab(), a);
    }

    @Override // defpackage.kan
    public final kaq b(URI uri, kal kalVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String path = uri.getPath();
        path.getClass();
        hoq.F(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
        String substring = path.substring(1);
        uri.getAuthority();
        return new kgm(substring, kalVar, khd.n, new hab(), a);
    }

    @Override // defpackage.kan
    public final String c() {
        return "dns";
    }

    @Override // defpackage.kar
    public final int d() {
        return 5;
    }

    @Override // defpackage.kar
    public final Collection e() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // defpackage.kar
    protected final void f() {
    }
}
