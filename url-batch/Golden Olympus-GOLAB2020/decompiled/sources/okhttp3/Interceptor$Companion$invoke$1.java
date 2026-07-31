package okhttp3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;

@Metadata
/* loaded from: classes3.dex */
public final class Interceptor$Companion$invoke$1 implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function1 f42412a;

    @Override // okhttp3.Interceptor
    public final Response a(Interceptor.Chain it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Response) this.f42412a.invoke(it);
    }
}
