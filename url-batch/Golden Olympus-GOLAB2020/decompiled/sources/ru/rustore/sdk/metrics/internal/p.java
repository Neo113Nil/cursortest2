package ru.rustore.sdk.metrics.internal;

import java.net.URI;
import java.net.URL;
import kotlin.jvm.functions.Function0;
import ru.rustore.sdk.metrics.BuildConfig;

/* loaded from: classes3.dex */
public final class p extends kotlin.jvm.internal.s implements Function0<URL> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f43734a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar) {
        super(0);
        this.f43734a = sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f43734a.f43760a.getClass();
        return new URI(BuildConfig.BACKEND_URL).resolve("/v1/send_custom_event_batch").toURL();
    }
}
