package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ba1 implements fb1 {
    public final Function1 a;
    public final Function2 b;
    public final Function1 c;
    public final my d;

    public ba1(Function1 function1, Function2 function2, Function1 function12, my myVar) {
        this.a = function1;
        this.b = function2;
        this.c = function12;
        this.d = myVar;
    }

    @Override // defpackage.fb1
    public final Function1 a() {
        return this.c;
    }

    @Override // defpackage.fb1
    public final Function1 getKey() {
        return this.a;
    }
}
