package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.IReporter;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.gh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2655gh extends AbstractC2601eh {

    /* renamed from: b, reason: collision with root package name */
    public final IReporter f39093b;

    public C2655gh(@NonNull C2953s5 c2953s5, @NonNull IReporter iReporter) {
        super(c2953s5);
        this.f39093b = iReporter;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2601eh
    public final boolean a(@NonNull C2773l6 c2773l6) {
        C2517bd c2517bd = (C2517bd) C2517bd.f38717c.get(c2773l6.f39379d);
        HashMap hashMap = new HashMap();
        hashMap.put("type", c2517bd.f38718a);
        hashMap.put("delivery_method", c2517bd.f38719b);
        this.f39093b.reportEvent("crash_saved", hashMap);
        return false;
    }
}
