package okhttp3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.f;
import okio.h;

@Metadata
/* loaded from: classes3.dex */
public final class RequestBody$Companion$toRequestBody$1 extends RequestBody {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MediaType f42537b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h f42538c;

    @Override // okhttp3.RequestBody
    public long a() {
        return this.f42538c.v();
    }

    @Override // okhttp3.RequestBody
    public MediaType b() {
        return this.f42537b;
    }

    @Override // okhttp3.RequestBody
    public void f(f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.M(this.f42538c);
    }
}
