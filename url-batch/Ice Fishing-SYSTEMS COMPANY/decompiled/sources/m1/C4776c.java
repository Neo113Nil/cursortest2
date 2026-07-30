package m1;

import O.C0357t;
import S0.i;
import S0.n;
import S0.q;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.anythink.basead.exoplayer.d;
import com.google.android.gms.internal.ads.RunnableC3878s0;
import com.google.android.gms.internal.ads.T4;
import i8.m;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l1.j;
import t0.AbstractC5051n;

/* renamed from: m1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4776c implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public boolean f39555A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f39556B;

    /* renamed from: C, reason: collision with root package name */
    public final C0357t f39557C;

    /* renamed from: D, reason: collision with root package name */
    public T4 f39558D;

    /* renamed from: E, reason: collision with root package name */
    public n f39559E;

    /* renamed from: F, reason: collision with root package name */
    public final Object f39560F;

    /* renamed from: G, reason: collision with root package name */
    public final i f39561G;

    /* renamed from: n, reason: collision with root package name */
    public final l1.i f39562n;

    /* renamed from: u, reason: collision with root package name */
    public final String f39563u;

    /* renamed from: v, reason: collision with root package name */
    public final int f39564v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f39565w;

    /* renamed from: x, reason: collision with root package name */
    public final m f39566x;

    /* renamed from: y, reason: collision with root package name */
    public Integer f39567y;

    /* renamed from: z, reason: collision with root package name */
    public q f39568z;

    public C4776c(String str, i iVar, m mVar) {
        Uri parse;
        String host;
        this.f39562n = l1.i.f39040c ? new l1.i() : null;
        this.f39565w = new Object();
        this.f39555A = true;
        int i = 0;
        this.f39556B = false;
        this.f39558D = null;
        this.f39563u = str;
        this.f39566x = mVar;
        C0357t c0357t = new C0357t();
        c0357t.f2319a = d.f6921c;
        this.f39557C = c0357t;
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i = host.hashCode();
        }
        this.f39564v = i;
        this.f39560F = new Object();
        this.f39561G = iVar;
    }

    public static com.bumptech.glide.manager.n f(com.bumptech.glide.manager.n nVar) {
        String str;
        long j9;
        boolean z8;
        long j10;
        long j11;
        long j12;
        long j13;
        T4 t42;
        Map map = (Map) nVar.f23619v;
        byte[] bArr = (byte[]) nVar.f23618u;
        try {
            str = new String(bArr, U2.a.o(map));
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (map != null) {
            String str2 = (String) map.get("Date");
            long p6 = str2 != null ? U2.a.p(str2) : 0L;
            String str3 = (String) map.get("Cache-Control");
            int i = 0;
            if (str3 != null) {
                String[] split = str3.split(",", 0);
                z8 = false;
                j10 = 0;
                j11 = 0;
                while (i < split.length) {
                    String trim = split[i].trim();
                    if (!trim.equals("no-cache") && !trim.equals("no-store")) {
                        if (trim.startsWith("max-age=")) {
                            try {
                                j10 = Long.parseLong(trim.substring(8));
                            } catch (Exception unused2) {
                            }
                        } else if (trim.startsWith("stale-while-revalidate=")) {
                            j11 = Long.parseLong(trim.substring(23));
                        } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                            z8 = true;
                        }
                        i++;
                    }
                }
                j9 = 0;
                i = 1;
            } else {
                j9 = 0;
                z8 = false;
                j10 = 0;
                j11 = 0;
            }
            String str4 = (String) map.get("Expires");
            long p9 = str4 != null ? U2.a.p(str4) : j9;
            String str5 = (String) map.get("Last-Modified");
            long p10 = str5 != null ? U2.a.p(str5) : j9;
            String str6 = (String) map.get("ETag");
            if (i != 0) {
                long j14 = (j10 * 1000) + currentTimeMillis;
                j12 = j14;
                j13 = z8 ? j14 : (j11 * 1000) + j14;
            } else {
                j12 = (p6 <= j9 || p9 < p6) ? j9 : (p9 - p6) + currentTimeMillis;
                j13 = j12;
            }
            T4 t43 = new T4(1);
            t43.f27709a = bArr;
            t43.f27710b = str6;
            t43.f27714f = j12;
            t43.f27713e = j13;
            t43.f27711c = p6;
            t43.f27712d = p10;
            t43.f27715g = map;
            t43.f27716h = (List) nVar.f23620w;
            t42 = t43;
            return new com.bumptech.glide.manager.n(str, t42);
        }
        t42 = null;
        return new com.bumptech.glide.manager.n(str, t42);
    }

    public final void a(String str) {
        if (l1.i.f39040c) {
            this.f39562n.a(str, Thread.currentThread().getId());
        }
    }

    public final void b(String str) {
        q qVar = this.f39568z;
        if (qVar != null) {
            synchronized (((HashSet) qVar.f2940b)) {
                ((HashSet) qVar.f2940b).remove(this);
            }
            synchronized (((ArrayList) qVar.f2947j)) {
                Iterator it = ((ArrayList) qVar.f2947j).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            qVar.j();
        }
        if (l1.i.f39040c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC3878s0(this, str, id));
            } else {
                this.f39562n.a(str, id);
                this.f39562n.b(toString());
            }
        }
    }

    public final boolean c() {
        boolean z8;
        synchronized (this.f39565w) {
            z8 = this.f39556B;
        }
        return z8;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C4776c c4776c = (C4776c) obj;
        c4776c.getClass();
        return this.f39567y.intValue() - c4776c.f39567y.intValue();
    }

    public final void d() {
        n nVar;
        synchronized (this.f39565w) {
            nVar = this.f39559E;
        }
        if (nVar != null) {
            nVar.e(this);
        }
    }

    public final void e(com.bumptech.glide.manager.n nVar) {
        n nVar2;
        List list;
        synchronized (this.f39565w) {
            nVar2 = this.f39559E;
        }
        if (nVar2 != null) {
            T4 t42 = (T4) nVar.f23619v;
            if (t42 != null) {
                if (t42.f27713e >= System.currentTimeMillis()) {
                    String str = this.f39563u;
                    synchronized (nVar2) {
                        list = (List) ((HashMap) nVar2.f2914n).remove(str);
                    }
                    if (list != null) {
                        if (j.f39043a) {
                            j.d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), str);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((m) nVar2.f2915u).h((C4776c) it.next(), nVar, null);
                        }
                        return;
                    }
                    return;
                }
            }
            nVar2.e(this);
        }
    }

    public final void g() {
        q qVar = this.f39568z;
        if (qVar != null) {
            qVar.j();
        }
    }

    public final String toString() {
        String str = "0x" + Integer.toHexString(this.f39564v);
        StringBuilder sb = new StringBuilder("[ ] ");
        synchronized (this.f39565w) {
        }
        AbstractC5051n.j(sb, this.f39563u, " ", str, " ");
        sb.append("NORMAL");
        sb.append(" ");
        sb.append(this.f39567y);
        return sb.toString();
    }
}
