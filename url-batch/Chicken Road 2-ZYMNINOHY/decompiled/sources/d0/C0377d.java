package d0;

import E1.C0025a;
import T.G;
import W.AbstractC0108a;
import W.J;
import Y.s;
import Y.z;
import a0.C0144j;
import android.net.Uri;
import androidx.datastore.preferences.protobuf.C0179l;
import e0.C0393c;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import q0.C1377t;
import u0.q;
import v0.AbstractC1450b;

/* renamed from: d0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0377d implements u0.i, u0.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f8117a;

    @Override // u0.o
    public void a() {
        h hVar = this.f8117a;
        hVar.f8131A.a();
        IOException iOException = hVar.f8133C;
        if (iOException != null) {
            throw iOException;
        }
    }

    public void b() {
        long j4;
        h hVar = this.f8117a;
        synchronized (AbstractC1450b.f15532b) {
            try {
                j4 = AbstractC1450b.f15533c ? AbstractC1450b.f15534d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        hVar.f8141K = j4;
        hVar.B(true);
    }

    @Override // u0.i
    public void g(u0.k kVar, long j4, long j5) {
        long j6;
        q qVar = (q) kVar;
        h hVar = this.f8117a;
        long j7 = qVar.f15487a;
        Y.k kVar2 = qVar.f15488b;
        z zVar = qVar.f15490d;
        C1377t c1377t = new C1377t(kVar2, zVar.f3754c, zVar.f3755d, j4, j5, zVar.f3753b);
        hVar.f8151m.getClass();
        hVar.f8153q.d(c1377t, qVar.f15489c);
        C0393c c0393c = (C0393c) qVar.f15492f;
        C0393c c0393c2 = hVar.f8137G;
        int size = c0393c2 == null ? 0 : c0393c2.f8358m.size();
        long j8 = c0393c.b(0).f8379b;
        int i4 = 0;
        while (i4 < size && hVar.f8137G.b(i4).f8379b < j8) {
            i4++;
        }
        if (c0393c.f8349d) {
            if (size - i4 > c0393c.f8358m.size()) {
                AbstractC0108a.s("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j9 = hVar.f8142M;
                j6 = -9223372036854775807L;
                if (j9 == -9223372036854775807L || c0393c.f8353h * 1000 > j9) {
                    hVar.L = 0;
                } else {
                    AbstractC0108a.s("DashMediaSource", "Loaded stale dynamic manifest: " + c0393c.f8353h + ", " + hVar.f8142M);
                }
            }
            int i5 = hVar.L;
            hVar.L = i5 + 1;
            if (i5 < hVar.f8151m.g(qVar.f15489c)) {
                hVar.f8134D.postDelayed(hVar.v, Math.min((hVar.L - 1) * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 5000));
                return;
            } else {
                hVar.f8133C = new C0179l();
                return;
            }
        }
        j6 = -9223372036854775807L;
        hVar.f8137G = c0393c;
        hVar.f8138H = c0393c.f8349d & hVar.f8138H;
        hVar.f8139I = j4 - j5;
        hVar.f8140J = j4;
        hVar.f8143N += i4;
        synchronized (hVar.f8156t) {
            if (qVar.f15488b.f3701a.equals(hVar.f8135E)) {
                Uri uri = hVar.f8137G.f8356k;
                if (uri == null) {
                    uri = O3.l.u(qVar.f15490d.f3754c);
                }
                hVar.f8135E = uri;
            }
        }
        C0393c c0393c3 = hVar.f8137G;
        if (!c0393c3.f8349d || hVar.f8141K != j6) {
            hVar.B(true);
            return;
        }
        C0025a c0025a = c0393c3.f8354i;
        if (c0025a == null) {
            hVar.y();
            return;
        }
        String str = c0025a.f563b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                hVar.f8141K = J.P(c0025a.f564c) - hVar.f8140J;
                hVar.B(true);
                return;
            } catch (G e4) {
                hVar.A(e4);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            hVar.C(c0025a, new f());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            hVar.C(c0025a, new C0144j(5, false));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            hVar.y();
        } else {
            hVar.A(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // u0.i
    public void m(u0.k kVar, long j4, long j5, boolean z) {
        this.f8117a.z((q) kVar, j4, j5);
    }

    @Override // u0.i
    public void o(u0.k kVar, long j4, long j5, int i4) {
        C1377t c1377t;
        q qVar = (q) kVar;
        if (i4 == 0) {
            long j6 = qVar.f15487a;
            c1377t = new C1377t(qVar.f15488b, j4);
        } else {
            long j7 = qVar.f15487a;
            Y.k kVar2 = qVar.f15488b;
            z zVar = qVar.f15490d;
            c1377t = new C1377t(kVar2, zVar.f3754c, zVar.f3755d, j4, j5, zVar.f3753b);
        }
        this.f8117a.f8153q.h(c1377t, qVar.f15489c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i4);
    }

    @Override // u0.i
    public g1.e p(u0.k kVar, long j4, long j5, IOException iOException, int i4) {
        long min;
        q qVar = (q) kVar;
        long j6 = qVar.f15487a;
        Y.k kVar2 = qVar.f15488b;
        z zVar = qVar.f15490d;
        C1377t c1377t = new C1377t(kVar2, zVar.f3754c, zVar.f3755d, j4, j5, zVar.f3753b);
        int i5 = qVar.f15489c;
        h hVar = this.f8117a;
        hVar.f8151m.getClass();
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if ((th instanceof G) || (th instanceof FileNotFoundException) || (th instanceof s) || (th instanceof u0.m) || ((th instanceof Y.i) && ((Y.i) th).f3694a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i4 - 1) * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 5000);
        g1.e eVar = min == -9223372036854775807L ? u0.n.f15483f : new g1.e(0, min, false);
        hVar.f8153q.g(c1377t, i5, iOException, !eVar.a());
        return eVar;
    }
}
