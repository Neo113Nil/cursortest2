package okhttp3.internal.http;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.g;

@Metadata
/* loaded from: classes3.dex */
public final class RealResponseBody extends ResponseBody {

    /* renamed from: c, reason: collision with root package name */
    private final String f42848c;

    /* renamed from: d, reason: collision with root package name */
    private final long f42849d;

    /* renamed from: e, reason: collision with root package name */
    private final g f42850e;

    public RealResponseBody(String str, long j4, g source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f42848c = str;
        this.f42849d = j4;
        this.f42850e = source;
    }

    @Override // okhttp3.ResponseBody
    public g J() {
        return this.f42850e;
    }

    @Override // okhttp3.ResponseBody
    public long o() {
        return this.f42849d;
    }

    @Override // okhttp3.ResponseBody
    public MediaType p() {
        String str = this.f42848c;
        if (str != null) {
            return MediaType.f42413e.b(str);
        }
        return null;
    }
}
