package b.a.a;

import android.support.v7.widget.helper.ItemTouchHelper;
import b.aa;
import b.ac;
import b.s;
import com.aiming.mdt.utils.Constants;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* compiled from: CacheStrategy.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final aa f1813a;

    /* renamed from: b, reason: collision with root package name */
    public final ac f1814b;

    c(aa aaVar, ac acVar) {
        this.f1813a = aaVar;
        this.f1814b = acVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r3.h().d() == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(ac acVar, aa aaVar) {
        switch (acVar.b()) {
            case ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION /* 200 */:
            case 203:
            case 204:
            case 300:
            case 301:
            case 308:
            case 404:
            case 405:
            case 410:
            case 414:
            case 501:
                break;
            case 302:
            case 307:
                if (acVar.a("Expires") == null) {
                    if (acVar.h().c() == -1) {
                        if (!acVar.h().e()) {
                            break;
                        }
                    }
                }
                break;
            default:
                return false;
        }
        return (acVar.h().b() || aaVar.f().b()) ? false : true;
    }

    /* compiled from: CacheStrategy.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final long f1815a;

        /* renamed from: b, reason: collision with root package name */
        final aa f1816b;

        /* renamed from: c, reason: collision with root package name */
        final ac f1817c;

        /* renamed from: d, reason: collision with root package name */
        private Date f1818d;
        private String e;
        private Date f;
        private String g;
        private Date h;
        private long i;
        private long j;
        private String k;
        private int l;

        public a(long j, aa aaVar, ac acVar) {
            this.l = -1;
            this.f1815a = j;
            this.f1816b = aaVar;
            this.f1817c = acVar;
            if (acVar != null) {
                this.i = acVar.i();
                this.j = acVar.j();
                s e = acVar.e();
                int a2 = e.a();
                for (int i = 0; i < a2; i++) {
                    String a3 = e.a(i);
                    String b2 = e.b(i);
                    if ("Date".equalsIgnoreCase(a3)) {
                        this.f1818d = b.a.c.d.a(b2);
                        this.e = b2;
                    } else if ("Expires".equalsIgnoreCase(a3)) {
                        this.h = b.a.c.d.a(b2);
                    } else if (Constants.KEY_LAST_MODIFIED.equalsIgnoreCase(a3)) {
                        this.f = b.a.c.d.a(b2);
                        this.g = b2;
                    } else if (Constants.KEY_ETAG.equalsIgnoreCase(a3)) {
                        this.k = b2;
                    } else if ("Age".equalsIgnoreCase(a3)) {
                        this.l = b.a.c.e.b(b2, -1);
                    }
                }
            }
        }

        public c a() {
            c b2 = b();
            return (b2.f1813a == null || !this.f1816b.f().i()) ? b2 : new c(null, null);
        }

        private c b() {
            String str;
            String str2;
            if (this.f1817c == null) {
                return new c(this.f1816b, null);
            }
            if (this.f1816b.g() && this.f1817c.d() == null) {
                return new c(this.f1816b, null);
            }
            if (!c.a(this.f1817c, this.f1816b)) {
                return new c(this.f1816b, null);
            }
            b.d f = this.f1816b.f();
            if (f.a() || a(this.f1816b)) {
                return new c(this.f1816b, null);
            }
            long d2 = d();
            long c2 = c();
            if (f.c() != -1) {
                c2 = Math.min(c2, TimeUnit.SECONDS.toMillis(f.c()));
            }
            long j = 0;
            long millis = f.h() != -1 ? TimeUnit.SECONDS.toMillis(f.h()) : 0L;
            b.d h = this.f1817c.h();
            if (!h.f() && f.g() != -1) {
                j = TimeUnit.SECONDS.toMillis(f.g());
            }
            if (!h.a()) {
                long j2 = millis + d2;
                if (j2 < j + c2) {
                    ac.a g = this.f1817c.g();
                    if (j2 >= c2) {
                        g.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (d2 > 86400000 && e()) {
                        g.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new c(null, g.a());
                }
            }
            if (this.k != null) {
                str = Constants.KEY_IF_NONE_MATCH;
                str2 = this.k;
            } else if (this.f != null) {
                str = Constants.KEY_IF_MODIFIED_SINCE;
                str2 = this.g;
            } else if (this.f1818d != null) {
                str = Constants.KEY_IF_MODIFIED_SINCE;
                str2 = this.e;
            } else {
                return new c(this.f1816b, null);
            }
            s.a b2 = this.f1816b.c().b();
            b.a.a.f1807a.a(b2, str, str2);
            return new c(this.f1816b.e().a(b2.a()).a(), this.f1817c);
        }

        private long c() {
            long j;
            long j2;
            if (this.f1817c.h().c() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.c());
            }
            if (this.h != null) {
                if (this.f1818d != null) {
                    j2 = this.f1818d.getTime();
                } else {
                    j2 = this.j;
                }
                long time = this.h.getTime() - j2;
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f == null || this.f1817c.a().a().l() != null) {
                return 0L;
            }
            if (this.f1818d != null) {
                j = this.f1818d.getTime();
            } else {
                j = this.i;
            }
            long time2 = j - this.f.getTime();
            if (time2 > 0) {
                return time2 / 10;
            }
            return 0L;
        }

        private long d() {
            long max = this.f1818d != null ? Math.max(0L, this.j - this.f1818d.getTime()) : 0L;
            if (this.l != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(this.l));
            }
            return max + (this.j - this.i) + (this.f1815a - this.j);
        }

        private boolean e() {
            return this.f1817c.h().c() == -1 && this.h == null;
        }

        private static boolean a(aa aaVar) {
            return (aaVar.a(Constants.KEY_IF_MODIFIED_SINCE) == null && aaVar.a(Constants.KEY_IF_NONE_MATCH) == null) ? false : true;
        }
    }
}
