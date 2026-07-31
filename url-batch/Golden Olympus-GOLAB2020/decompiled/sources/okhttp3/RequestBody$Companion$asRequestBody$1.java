package okhttp3;

import f2.AbstractC2420c;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.B;
import okio.f;
import okio.p;

@Metadata
/* loaded from: classes3.dex */
public final class RequestBody$Companion$asRequestBody$1 extends RequestBody {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MediaType f42535b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ File f42536c;

    @Override // okhttp3.RequestBody
    public long a() {
        return this.f42536c.length();
    }

    @Override // okhttp3.RequestBody
    public MediaType b() {
        return this.f42535b;
    }

    @Override // okhttp3.RequestBody
    public void f(f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        B j4 = p.j(this.f42536c);
        try {
            sink.F(j4);
            AbstractC2420c.a(j4, null);
        } finally {
        }
    }
}
