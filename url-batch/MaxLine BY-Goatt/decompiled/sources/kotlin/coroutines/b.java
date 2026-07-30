package kotlin.coroutines;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class b implements g {
    public final Function1 m;
    public final g n;

    public b(g gVar, Function1 function1) {
        gVar.getClass();
        this.m = function1;
        this.n = gVar instanceof b ? ((b) gVar).n : gVar;
    }
}
