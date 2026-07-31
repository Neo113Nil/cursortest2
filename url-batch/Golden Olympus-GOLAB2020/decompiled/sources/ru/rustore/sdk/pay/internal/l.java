package ru.rustore.sdk.pay.internal;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.s implements Function0<Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f44496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f44497b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f44498c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, String str, Map<String, String> map) {
        super(0);
        this.f44496a = mVar;
        this.f44497b = str;
        this.f44498c = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        m mVar = this.f44496a;
        mVar.f44610a.postAnalyticsEvent(mVar.f44613d, this.f44497b, this.f44498c);
        return Unit.f41027a;
    }
}
