package okhttp3.internal.cache;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;

@Metadata
/* loaded from: classes3.dex */
public final class CacheStrategy {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f42606c = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final Request f42607a;

    /* renamed from: b, reason: collision with root package name */
    private final Response f42608b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Response response, Request request) {
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(request, "request");
            int J3 = response.J();
            if (J3 != 200 && J3 != 410 && J3 != 414 && J3 != 501 && J3 != 203 && J3 != 204) {
                if (J3 != 307) {
                    if (J3 != 308 && J3 != 404 && J3 != 405) {
                        switch (J3) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (Response.V(response, "Expires", null, 2, null) == null && response.n().c() == -1 && !response.n().b() && !response.n().a()) {
                    return false;
                }
            }
            return (response.n().h() || request.b().h()) ? false : true;
        }

        private Companion() {
        }
    }

    @Metadata
    public static final class Factory {

        /* renamed from: a, reason: collision with root package name */
        private final long f42609a;

        /* renamed from: b, reason: collision with root package name */
        private final Request f42610b;

        /* renamed from: c, reason: collision with root package name */
        private final Response f42611c;

        /* renamed from: d, reason: collision with root package name */
        private Date f42612d;

        /* renamed from: e, reason: collision with root package name */
        private String f42613e;

        /* renamed from: f, reason: collision with root package name */
        private Date f42614f;

        /* renamed from: g, reason: collision with root package name */
        private String f42615g;

        /* renamed from: h, reason: collision with root package name */
        private Date f42616h;

        /* renamed from: i, reason: collision with root package name */
        private long f42617i;

        /* renamed from: j, reason: collision with root package name */
        private long f42618j;

        /* renamed from: k, reason: collision with root package name */
        private String f42619k;

        /* renamed from: l, reason: collision with root package name */
        private int f42620l;

        public Factory(long j4, Request request, Response response) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f42609a = j4;
            this.f42610b = request;
            this.f42611c = response;
            this.f42620l = -1;
            if (response != null) {
                this.f42617i = response.f0();
                this.f42618j = response.d0();
                Headers W3 = response.W();
                int size = W3.size();
                for (int i4 = 0; i4 < size; i4++) {
                    String d4 = W3.d(i4);
                    String f4 = W3.f(i4);
                    if (StringsKt.w(d4, "Date", true)) {
                        this.f42612d = DatesKt.a(f4);
                        this.f42613e = f4;
                    } else if (StringsKt.w(d4, "Expires", true)) {
                        this.f42616h = DatesKt.a(f4);
                    } else if (StringsKt.w(d4, "Last-Modified", true)) {
                        this.f42614f = DatesKt.a(f4);
                        this.f42615g = f4;
                    } else if (StringsKt.w(d4, "ETag", true)) {
                        this.f42619k = f4;
                    } else if (StringsKt.w(d4, "Age", true)) {
                        this.f42620l = Util.X(f4, -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.f42612d;
            long max = date != null ? Math.max(0L, this.f42618j - date.getTime()) : 0L;
            int i4 = this.f42620l;
            if (i4 != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i4));
            }
            long j4 = this.f42618j;
            return max + (j4 - this.f42617i) + (this.f42609a - j4);
        }

        private final CacheStrategy c() {
            String str;
            if (this.f42611c == null) {
                return new CacheStrategy(this.f42610b, null);
            }
            if (this.f42610b.g() && this.f42611c.Q() == null) {
                return new CacheStrategy(this.f42610b, null);
            }
            if (!CacheStrategy.f42606c.a(this.f42611c, this.f42610b)) {
                return new CacheStrategy(this.f42610b, null);
            }
            CacheControl b4 = this.f42610b.b();
            if (b4.g() || e(this.f42610b)) {
                return new CacheStrategy(this.f42610b, null);
            }
            CacheControl n4 = this.f42611c.n();
            long a4 = a();
            long d4 = d();
            if (b4.c() != -1) {
                d4 = Math.min(d4, TimeUnit.SECONDS.toMillis(b4.c()));
            }
            long j4 = 0;
            long millis = b4.e() != -1 ? TimeUnit.SECONDS.toMillis(b4.e()) : 0L;
            if (!n4.f() && b4.d() != -1) {
                j4 = TimeUnit.SECONDS.toMillis(b4.d());
            }
            if (!n4.g()) {
                long j5 = millis + a4;
                if (j5 < j4 + d4) {
                    Response.Builder a02 = this.f42611c.a0();
                    if (j5 >= d4) {
                        a02.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a4 > 86400000 && f()) {
                        a02.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new CacheStrategy(null, a02.c());
                }
            }
            String str2 = this.f42619k;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f42614f != null) {
                    str2 = this.f42615g;
                } else {
                    if (this.f42612d == null) {
                        return new CacheStrategy(this.f42610b, null);
                    }
                    str2 = this.f42613e;
                }
                str = "If-Modified-Since";
            }
            Headers.Builder e4 = this.f42610b.f().e();
            Intrinsics.checkNotNull(str2);
            e4.c(str, str2);
            return new CacheStrategy(this.f42610b.i().e(e4.d()).a(), this.f42611c);
        }

        private final long d() {
            Response response = this.f42611c;
            Intrinsics.checkNotNull(response);
            if (response.n().c() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.c());
            }
            Date date = this.f42616h;
            if (date != null) {
                Date date2 = this.f42612d;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f42618j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f42614f != null && this.f42611c.e0().j().m() == null) {
                Date date3 = this.f42612d;
                long time2 = date3 != null ? date3.getTime() : this.f42617i;
                Date date4 = this.f42614f;
                Intrinsics.checkNotNull(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / 10;
                }
            }
            return 0L;
        }

        private final boolean e(Request request) {
            return (request.d("If-Modified-Since") == null && request.d("If-None-Match") == null) ? false : true;
        }

        private final boolean f() {
            Response response = this.f42611c;
            Intrinsics.checkNotNull(response);
            return response.n().c() == -1 && this.f42616h == null;
        }

        public final CacheStrategy b() {
            CacheStrategy c4 = c();
            return (c4.b() == null || !this.f42610b.b().i()) ? c4 : new CacheStrategy(null, null);
        }
    }

    public CacheStrategy(Request request, Response response) {
        this.f42607a = request;
        this.f42608b = response;
    }

    public final Response a() {
        return this.f42608b;
    }

    public final Request b() {
        return this.f42607a;
    }
}
