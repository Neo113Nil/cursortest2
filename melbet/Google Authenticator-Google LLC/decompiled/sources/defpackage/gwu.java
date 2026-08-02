package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gwu extends hur {
    public static gwu g(hvi hviVar) {
        return hviVar instanceof gwu ? (gwu) hviVar : new gwu(hviVar);
    }

    public final gwu d(Class cls, gzf gzfVar, Executor executor) {
        return new gwu(hoq.ao(this.b, cls, gzfVar, executor));
    }

    public final gwu e(Class cls, htr htrVar, Executor executor) {
        return new gwu(hoq.ap(this.b, cls, htrVar, executor));
    }

    public final gwu h(gzf gzfVar, Executor executor) {
        return new gwu(hoq.at(this.b, gzfVar, executor));
    }

    public final gwu i(htr htrVar, Executor executor) {
        return new gwu(hoq.au(this.b, htrVar, executor));
    }
}
