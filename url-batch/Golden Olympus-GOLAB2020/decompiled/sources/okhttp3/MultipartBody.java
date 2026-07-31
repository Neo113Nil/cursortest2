package okhttp3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okio.C3372e;
import okio.f;
import okio.h;

@Metadata
/* loaded from: classes3.dex */
public final class MultipartBody extends RequestBody {

    /* renamed from: f, reason: collision with root package name */
    public static final Companion f42420f = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    public static final MediaType f42421g;

    /* renamed from: h, reason: collision with root package name */
    public static final MediaType f42422h;

    /* renamed from: i, reason: collision with root package name */
    public static final MediaType f42423i;

    /* renamed from: j, reason: collision with root package name */
    public static final MediaType f42424j;

    /* renamed from: k, reason: collision with root package name */
    public static final MediaType f42425k;

    /* renamed from: l, reason: collision with root package name */
    private static final byte[] f42426l;

    /* renamed from: m, reason: collision with root package name */
    private static final byte[] f42427m;

    /* renamed from: n, reason: collision with root package name */
    private static final byte[] f42428n;

    /* renamed from: b, reason: collision with root package name */
    private final h f42429b;

    /* renamed from: c, reason: collision with root package name */
    private final List f42430c;

    /* renamed from: d, reason: collision with root package name */
    private final MediaType f42431d;

    /* renamed from: e, reason: collision with root package name */
    private long f42432e;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final h f42433a;

        /* renamed from: b, reason: collision with root package name */
        private MediaType f42434b;

        /* renamed from: c, reason: collision with root package name */
        private final List f42435c;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Builder(String boundary) {
            Intrinsics.checkNotNullParameter(boundary, "boundary");
            this.f42433a = h.f43270e.d(boundary);
            this.f42434b = MultipartBody.f42421g;
            this.f42435c = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Builder(String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
            if ((i4 & 1) != 0) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
            }
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    public static final class Part {

        /* renamed from: c, reason: collision with root package name */
        public static final Companion f42436c = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        private final Headers f42437a;

        /* renamed from: b, reason: collision with root package name */
        private final RequestBody f42438b;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public final RequestBody a() {
            return this.f42438b;
        }

        public final Headers b() {
            return this.f42437a;
        }
    }

    static {
        MediaType.Companion companion = MediaType.f42413e;
        f42421g = companion.a("multipart/mixed");
        f42422h = companion.a("multipart/alternative");
        f42423i = companion.a("multipart/digest");
        f42424j = companion.a("multipart/parallel");
        f42425k = companion.a("multipart/form-data");
        f42426l = new byte[]{58, 32};
        f42427m = new byte[]{13, 10};
        f42428n = new byte[]{45, 45};
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long g(f fVar, boolean z4) {
        C3372e c3372e;
        if (z4) {
            fVar = new C3372e();
            c3372e = fVar;
        } else {
            c3372e = 0;
        }
        int size = this.f42430c.size();
        long j4 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Part part = (Part) this.f42430c.get(i4);
            Headers b4 = part.b();
            RequestBody a4 = part.a();
            Intrinsics.checkNotNull(fVar);
            fVar.L(f42428n);
            fVar.M(this.f42429b);
            fVar.L(f42427m);
            if (b4 != null) {
                int size2 = b4.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    fVar.C(b4.d(i5)).L(f42426l).C(b4.f(i5)).L(f42427m);
                }
            }
            MediaType b5 = a4.b();
            if (b5 != null) {
                fVar.C("Content-Type: ").C(b5.toString()).L(f42427m);
            }
            long a5 = a4.a();
            if (a5 != -1) {
                fVar.C("Content-Length: ").P(a5).L(f42427m);
            } else if (z4) {
                Intrinsics.checkNotNull(c3372e);
                c3372e.m();
                return -1L;
            }
            byte[] bArr = f42427m;
            fVar.L(bArr);
            if (z4) {
                j4 += a5;
            } else {
                a4.f(fVar);
            }
            fVar.L(bArr);
        }
        Intrinsics.checkNotNull(fVar);
        byte[] bArr2 = f42428n;
        fVar.L(bArr2);
        fVar.M(this.f42429b);
        fVar.L(bArr2);
        fVar.L(f42427m);
        if (!z4) {
            return j4;
        }
        Intrinsics.checkNotNull(c3372e);
        long l02 = j4 + c3372e.l0();
        c3372e.m();
        return l02;
    }

    @Override // okhttp3.RequestBody
    public long a() {
        long j4 = this.f42432e;
        if (j4 != -1) {
            return j4;
        }
        long g4 = g(null, true);
        this.f42432e = g4;
        return g4;
    }

    @Override // okhttp3.RequestBody
    public MediaType b() {
        return this.f42431d;
    }

    @Override // okhttp3.RequestBody
    public void f(f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        g(sink, false);
    }
}
