package io.appmetrica.analytics.coreapi.internal.io;

import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public interface SslSocketFactoryProvider {
    @Nullable
    SSLSocketFactory getSslSocketFactory();
}
