package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class N2 implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O2 f10683a;

    public N2(O2 o22) {
        this.f10683a = o22;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.BiConsumer
    public final void consume(Object obj, Object obj2) {
        Intent intent = (Intent) obj2;
        synchronized (this.f10683a) {
            try {
                O2 o22 = this.f10683a;
                o22.f10740b = intent;
                ArrayList arrayList = o22.f10739a;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj3 = arrayList.get(i4);
                    i4++;
                    ((Consumer) obj3).consume(intent);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
