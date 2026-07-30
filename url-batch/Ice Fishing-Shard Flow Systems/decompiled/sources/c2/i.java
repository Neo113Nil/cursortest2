package c2;

import h6.AbstractC0498d;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0786t;
import n6.Q;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4192d;

    public /* synthetic */ i(int i2) {
        this.f4192d = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it) {
        switch (this.f4192d) {
            case 0:
                T.b bVar = (T.b) it;
                T.d dVar = l.f4197c;
                long j = 0;
                for (Map.Entry entry : bVar.a().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        T.d dVar2 = (T.d) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String b7 = l.b(System.currentTimeMillis());
                        if (set.contains(b7)) {
                            Object[] objArr = {b7};
                            HashSet hashSet = new HashSet(1);
                            Object obj = objArr[0];
                            Objects.requireNonNull(obj);
                            if (!hashSet.add(obj)) {
                                throw new IllegalArgumentException("duplicate element: " + obj);
                            }
                            bVar.e(dVar2, Collections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            bVar.d(dVar2);
                        }
                    }
                }
                if (j == 0) {
                    bVar.d(dVar);
                    return null;
                }
                bVar.e(dVar, Long.valueOf(j));
                return null;
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(AbstractC0498d.f5285d.a() + 65536);
            case 2:
                return Boolean.valueOf(it == null);
            case 3:
                CoroutineContext.Element element = (CoroutineContext.Element) it;
                if (element instanceof AbstractC0786t) {
                    return (AbstractC0786t) element;
                }
                return null;
            default:
                CoroutineContext.Element element2 = (CoroutineContext.Element) it;
                if (element2 instanceof Q) {
                    return (Q) element2;
                }
                return null;
        }
    }
}
