package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.C3372e;
import okio.f;

@Metadata
/* loaded from: classes3.dex */
public final class FormBody extends RequestBody {

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f42372d = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    private static final MediaType f42373e = MediaType.f42413e.a("application/x-www-form-urlencoded");

    /* renamed from: b, reason: collision with root package name */
    private final List f42374b;

    /* renamed from: c, reason: collision with root package name */
    private final List f42375c;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final Charset f42376a;

        /* renamed from: b, reason: collision with root package name */
        private final List f42377b;

        /* renamed from: c, reason: collision with root package name */
        private final List f42378c;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Builder(Charset charset) {
            this.f42376a = charset;
            this.f42377b = new ArrayList();
            this.f42378c = new ArrayList();
        }

        public /* synthetic */ Builder(Charset charset, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? null : charset);
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

    private final long g(f fVar, boolean z4) {
        C3372e q4;
        if (z4) {
            q4 = new C3372e();
        } else {
            Intrinsics.checkNotNull(fVar);
            q4 = fVar.q();
        }
        int size = this.f42374b.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 > 0) {
                q4.w(38);
            }
            q4.C((String) this.f42374b.get(i4));
            q4.w(61);
            q4.C((String) this.f42375c.get(i4));
        }
        if (!z4) {
            return 0L;
        }
        long l02 = q4.l0();
        q4.m();
        return l02;
    }

    @Override // okhttp3.RequestBody
    public long a() {
        return g(null, true);
    }

    @Override // okhttp3.RequestBody
    public MediaType b() {
        return f42373e;
    }

    @Override // okhttp3.RequestBody
    public void f(f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        g(sink, false);
    }
}
