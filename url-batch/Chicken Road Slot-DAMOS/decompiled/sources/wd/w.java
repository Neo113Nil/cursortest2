package wd;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class w extends y implements Function2 {
    @Override // wd.d
    public final ce.a b() {
        c0.f10143a.getClass();
        return this;
    }

    public abstract Object h();

    public final void i() {
        if (this.f10163u) {
            a2.r.r("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return;
        }
        ce.a g = g();
        if (g == this) {
            throw new ud.a();
        }
        ((w) ((y) g)).i();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        h();
        throw null;
    }
}
