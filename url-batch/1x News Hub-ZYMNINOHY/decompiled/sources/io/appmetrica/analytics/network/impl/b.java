package io.appmetrica.analytics.network.impl;

import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.k;

/* loaded from: classes.dex */
public final class b extends k implements l2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HttpsURLConnection f8841a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(HttpsURLConnection httpsURLConnection) {
        super(0);
        this.f8841a = httpsURLConnection;
    }

    @Override // l2.a
    public final Object invoke() {
        return this.f8841a.getErrorStream();
    }
}
