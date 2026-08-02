package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gix implements giw {
    private final iee a;

    public gix(iee ieeVar) {
        this.a = ieeVar;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, jsb] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, jsb] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, koe] */
    @Override // defpackage.giw
    public final giv a(String str) {
        iee ieeVar = this.a;
        return new giv(((gmu) ieeVar.g).b(), ((fuk) ieeVar.a).b(), ((ghs) ieeVar.b).b(), (giz) ieeVar.f.b(), ieeVar.e, (Executor) ieeVar.c.b(), ((jrz) ieeVar.d).b(), str);
    }
}
