package kotlin.coroutines;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b implements f {

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f6141d;

    /* renamed from: e, reason: collision with root package name */
    public final f f6142e;

    public b(f baseKey, Function1 safeCast) {
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        this.f6141d = safeCast;
        this.f6142e = baseKey instanceof b ? ((b) baseKey).f6142e : baseKey;
    }
}
