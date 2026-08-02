package kotlin.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class Regex$findAll$2 extends FunctionReferenceImpl implements Function1 {
    public static final Regex$findAll$2 INSTANCE = new Regex$findAll$2();

    public Regex$findAll$2() {
        super(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MatchResult matchResult = (MatchResult) obj;
        matchResult.getClass();
        return matchResult.next();
    }
}
