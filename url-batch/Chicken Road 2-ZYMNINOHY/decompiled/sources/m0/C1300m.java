package m0;

import E1.C0025a;
import E1.N;
import W.J;
import a.AbstractC0124a;
import android.net.Uri;
import android.util.SparseArray;
import androidx.datastore.preferences.protobuf.C0179l;
import d2.C0389g;
import java.io.Closeable;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import v2.f0;

/* renamed from: m0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1300m implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final d0.g f14404a;

    /* renamed from: b, reason: collision with root package name */
    public final d0.g f14405b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14406c;

    /* renamed from: d, reason: collision with root package name */
    public final SocketFactory f14407d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f14408e = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray f14409f = new SparseArray();

    /* renamed from: g, reason: collision with root package name */
    public final L3.h f14410g = new L3.h(this);

    /* renamed from: h, reason: collision with root package name */
    public Uri f14411h;

    /* renamed from: i, reason: collision with root package name */
    public y f14412i;

    /* renamed from: j, reason: collision with root package name */
    public C0025a f14413j;

    /* renamed from: k, reason: collision with root package name */
    public String f14414k;

    /* renamed from: l, reason: collision with root package name */
    public long f14415l;

    /* renamed from: m, reason: collision with root package name */
    public RunnableC1299l f14416m;
    public N n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f14417p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14418q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f14419r;

    /* renamed from: s, reason: collision with root package name */
    public long f14420s;

    public C1300m(d0.g gVar, d0.g gVar2, String str, Uri uri, SocketFactory socketFactory) {
        Uri build;
        this.f14404a = gVar;
        this.f14405b = gVar2;
        this.f14406c = str;
        this.f14407d = socketFactory;
        Pattern pattern = z.f14477a;
        if (uri.getUserInfo() == null) {
            build = uri;
        } else {
            String encodedAuthority = uri.getEncodedAuthority();
            encodedAuthority.getClass();
            AbstractC0124a.h(encodedAuthority.contains("@"));
            String str2 = J.f3263a;
            build = uri.buildUpon().encodedAuthority(encodedAuthority.split("@", -1)[1]).build();
        }
        this.f14411h = build;
        this.f14412i = new y(new C0389g(this));
        this.f14415l = 60000L;
        this.f14413j = z.d(uri);
        this.f14420s = -9223372036854775807L;
        this.o = -1;
    }

    public static void a(C1300m c1300m, C0179l c0179l) {
        c1300m.getClass();
        if (c1300m.f14417p) {
            c1300m.f14405b.c(c0179l);
            return;
        }
        d0.g gVar = c1300m.f14404a;
        String message = c0179l.getMessage();
        if (message == null) {
            message = "";
        }
        gVar.e(message, c0179l);
    }

    public final void b() {
        long Z3;
        p pVar = (p) this.f14408e.pollFirst();
        if (pVar == null) {
            r rVar = (r) this.f14405b.f8130b;
            long j4 = rVar.n;
            if (j4 != -9223372036854775807L) {
                Z3 = J.Z(j4);
            } else {
                long j5 = rVar.o;
                Z3 = j5 != -9223372036854775807L ? J.Z(j5) : 0L;
            }
            rVar.f14437d.k(Z3);
            return;
        }
        Uri uri = pVar.f14425b.f14352b.f14462b;
        pVar.f14426c.getClass();
        String str = pVar.f14426c;
        String str2 = this.f14414k;
        L3.h hVar = this.f14410g;
        ((C1300m) hVar.f1681c).o = 0;
        v2.r.c("Transport", str);
        hVar.g(hVar.c(10, str2, f0.b(1, new Object[]{"Transport", str}, null), uri));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        RunnableC1299l runnableC1299l = this.f14416m;
        if (runnableC1299l != null) {
            runnableC1299l.close();
            this.f14416m = null;
            Uri uri = this.f14411h;
            String str = this.f14414k;
            str.getClass();
            L3.h hVar = this.f14410g;
            C1300m c1300m = (C1300m) hVar.f1681c;
            int i4 = c1300m.o;
            if (i4 != -1 && i4 != 0) {
                c1300m.o = 0;
                hVar.g(hVar.c(12, str, f0.f15629g, uri));
            }
        }
        this.f14412i.close();
    }

    public final Socket e(Uri uri) {
        AbstractC0124a.h(uri.getHost() != null);
        int port = uri.getPort() > 0 ? uri.getPort() : 554;
        String host = uri.getHost();
        host.getClass();
        return this.f14407d.createSocket(host, port);
    }

    public final void f(long j4) {
        if (this.o == 2 && !this.f14419r) {
            Uri uri = this.f14411h;
            String str = this.f14414k;
            str.getClass();
            L3.h hVar = this.f14410g;
            C1300m c1300m = (C1300m) hVar.f1681c;
            AbstractC0124a.t(c1300m.o == 2);
            hVar.g(hVar.c(5, str, f0.f15629g, uri));
            c1300m.f14419r = true;
        }
        this.f14420s = j4;
    }

    public final void k(long j4) {
        Uri uri = this.f14411h;
        String str = this.f14414k;
        str.getClass();
        L3.h hVar = this.f14410g;
        int i4 = ((C1300m) hVar.f1681c).o;
        AbstractC0124a.t(i4 == 1 || i4 == 2);
        C1280B c1280b = C1280B.f14296c;
        Object[] objArr = {Double.valueOf(j4 / 1000.0d)};
        String str2 = J.f3263a;
        hVar.g(hVar.c(6, str, f0.b(1, new Object[]{"Range", String.format(Locale.US, "npt=%.3f-", objArr)}, null), uri));
    }
}
