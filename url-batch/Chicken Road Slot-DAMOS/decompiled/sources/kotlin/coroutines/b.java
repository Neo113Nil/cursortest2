package kotlin.coroutines;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b implements f {

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f5587d;

    /* renamed from: e, reason: collision with root package name */
    public final f f5588e;

    public b(f fVar, Function1 function1) {
        fVar.getClass();
        this.f5587d = function1;
        this.f5588e = fVar instanceof b ? ((b) fVar).f5588e : fVar;
    }
}
