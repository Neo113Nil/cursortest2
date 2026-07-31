package okhttp3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;

@Metadata
/* loaded from: classes3.dex */
public final class OkHttpClient$Builder$addInterceptor$2 implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function1 f42512a;

    @Override // okhttp3.Interceptor
    public final Response a(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return (Response) this.f42512a.invoke(chain);
    }
}
