package kotlinx.coroutines.selects;

import f6.l;
import kotlinx.coroutines.DelayKt;

/* loaded from: classes5.dex */
public abstract class a {
    public static final <R> void onTimeout(b bVar, long j8, l lVar) {
        bVar.invoke(new OnTimeout(j8).getSelectClause(), lVar);
    }

    /* renamed from: onTimeout-8Mi8wO0, reason: not valid java name */
    public static final <R> void m1299onTimeout8Mi8wO0(b bVar, long j8, l lVar) {
        onTimeout(bVar, DelayKt.m1228toDelayMillisLRDsOJo(j8), lVar);
    }
}
