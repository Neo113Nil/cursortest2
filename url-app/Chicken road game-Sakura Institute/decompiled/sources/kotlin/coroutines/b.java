package kotlin.coroutines;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b implements g {

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f7491d;

    /* renamed from: e, reason: collision with root package name */
    public final g f7492e;

    public b(g baseKey, Function1 safeCast) {
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        this.f7491d = safeCast;
        this.f7492e = baseKey instanceof b ? ((b) baseKey).f7492e : baseKey;
    }
}
