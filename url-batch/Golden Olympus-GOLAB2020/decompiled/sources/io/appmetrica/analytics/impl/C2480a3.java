package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.a3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2480a3 implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2507b3 f38658a;

    public C2480a3(C2507b3 c2507b3) {
        this.f38658a = c2507b3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.BiConsumer
    public final void consume(Object obj, Object obj2) {
        Intent intent = (Intent) obj2;
        synchronized (this.f38658a) {
            try {
                C2507b3 c2507b3 = this.f38658a;
                c2507b3.f38707b = intent;
                ArrayList arrayList = c2507b3.f38706a;
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
