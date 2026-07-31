package ru.rustore.sdk.metrics.internal;

import java.net.URL;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.s implements Function0<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ URL f43751a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f43752b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f43753c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f43754d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(URL url, int i4, String str, String str2) {
        super(0);
        this.f43751a = url;
        this.f43752b = i4;
        this.f43753c = str;
        this.f43754d = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return StringsKt.f("\n                    HTTP REQUEST\n                    URL: " + this.f43751a + "\n                    CODE: " + this.f43752b + "\n                    BODY: " + this.f43753c + "\n                    HEADER X-Metrics-Request-Time: " + this.f43754d + "\n                ");
    }
}
