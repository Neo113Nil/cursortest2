package kotlin.text;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
/* synthetic */ class Regex$findAll$2 extends FunctionReferenceImpl implements f6.l {
    public static final Regex$findAll$2 INSTANCE = new Regex$findAll$2();

    Regex$findAll$2() {
        super(1, j.class, "next", "next()Lkotlin/text/MatchResult;", 0);
    }

    @Override // f6.l
    public final j invoke(j p02) {
        kotlin.jvm.internal.s.checkNotNullParameter(p02, "p0");
        return p02.next();
    }
}
