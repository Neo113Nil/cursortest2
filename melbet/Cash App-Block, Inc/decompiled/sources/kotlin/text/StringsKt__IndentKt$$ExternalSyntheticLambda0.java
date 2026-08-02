package kotlin.text;

import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* loaded from: classes5.dex */
public final /* synthetic */ class StringsKt__IndentKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ StringsKt__IndentKt$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                String str = (String) obj2;
                String str2 = (String) obj;
                str2.getClass();
                return StringsKt.isBlank(str2) ? str2.length() < str.length() ? str : str2 : str.concat(str2);
            case 1:
                IntRange intRange = (IntRange) obj;
                intRange.getClass();
                return StringsKt__StringsKt.substring((CharSequence) obj2, intRange);
            default:
                return ((MatcherMatchResult$groups$1) obj2).get(((Integer) obj).intValue());
        }
    }
}
