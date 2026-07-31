package ru.rustore.sdk.metrics.internal;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.metrics.internal.v0;

/* loaded from: classes3.dex */
public final class t0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f43764c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final n0 f43765a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f43766b;

    public t0(n0 persistentMetricsEventRepository, s0 sendMetricsEventBatchUseCase) {
        Intrinsics.checkNotNullParameter(persistentMetricsEventRepository, "persistentMetricsEventRepository");
        Intrinsics.checkNotNullParameter(sendMetricsEventBatchUseCase, "sendMetricsEventBatchUseCase");
        this.f43765a = persistentMetricsEventRepository;
        this.f43766b = sendMetricsEventBatchUseCase;
    }

    public final void a() {
        synchronized (f43764c) {
            while (true) {
                try {
                    v0 a4 = this.f43766b.a();
                    if (Intrinsics.areEqual(a4, v0.a.f43773a)) {
                        Unit unit = Unit.f41027a;
                    } else if (a4 instanceof v0.b) {
                        n0 n0Var = this.f43765a;
                        ArrayList persistentMetricsEvents = ((v0.b) a4).f43774a;
                        Intrinsics.checkNotNullParameter(persistentMetricsEvents, "persistentMetricsEvents");
                        i0 i0Var = n0Var.f43729a;
                        l0 l0Var = n0Var.f43731c;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(persistentMetricsEvents, 10));
                        int size = persistentMetricsEvents.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj = persistentMetricsEvents.get(i4);
                            i4++;
                            arrayList.add(l0Var.a((d0) obj));
                        }
                        i0Var.a(arrayList);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
