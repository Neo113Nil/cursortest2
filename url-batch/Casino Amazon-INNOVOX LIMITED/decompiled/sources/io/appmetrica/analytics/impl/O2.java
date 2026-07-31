package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class O2 implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P2 f980a;

    public O2(P2 p2) {
        this.f980a = p2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.BiConsumer
    public final void consume(Object obj, Object obj2) {
        Intent intent = (Intent) obj2;
        synchronized (this.f980a) {
            P2 p2 = this.f980a;
            p2.b = intent;
            Iterator it = p2.f996a.iterator();
            while (it.hasNext()) {
                ((Consumer) it.next()).consume(intent);
            }
        }
    }
}
