package kotlin.text;

import com.realsil.sdk.dfu.DfuException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@kotlin.coroutines.jvm.internal.d(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", i = {1, 1, 1}, l = {DfuException.ERROR_USER_NOT_ACTIVE_IMAGE_ERROR, 282, DfuException.ERROR_DFU_HAND_SHAKE_FAILED}, m = "invokeSuspend", n = {"$this$sequence", "matcher", "splitCount"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes3.dex */
final class Regex$splitToSequence$1 extends RestrictedSuspendLambda implements f6.p {
    final /* synthetic */ CharSequence $input;
    final /* synthetic */ int $limit;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Regex this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Regex$splitToSequence$1(Regex regex, CharSequence charSequence, int i8, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.this$0 = regex;
        this.$input = charSequence;
        this.$limit = i8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        Regex$splitToSequence$1 regex$splitToSequence$1 = new Regex$splitToSequence$1(this.this$0, this.$input, this.$limit, cVar);
        regex$splitToSequence$1.L$0 = obj;
        return regex$splitToSequence$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0070 -> B:13:0x0073). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Pattern pattern;
        Regex$splitToSequence$1 regex$splitToSequence$1;
        kotlin.sequences.o oVar;
        Matcher matcher;
        int i8;
        String obj2;
        String obj3;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i9 = this.label;
        if (i9 == 0) {
            y5.g.throwOnFailure(obj);
            kotlin.sequences.o oVar2 = (kotlin.sequences.o) this.L$0;
            pattern = this.this$0.nativePattern;
            Matcher matcher2 = pattern.matcher(this.$input);
            if (this.$limit != 1 && matcher2.find()) {
                int i10 = 0;
                regex$splitToSequence$1 = this;
                oVar = oVar2;
                matcher = matcher2;
                i8 = 0;
                obj2 = regex$splitToSequence$1.$input.subSequence(i10, matcher.start()).toString();
                regex$splitToSequence$1.L$0 = oVar;
                regex$splitToSequence$1.L$1 = matcher;
                regex$splitToSequence$1.I$0 = i8;
                regex$splitToSequence$1.label = 2;
                if (oVar.yield(obj2, regex$splitToSequence$1) == coroutine_suspended) {
                }
                i10 = matcher.end();
                i8++;
                if (i8 != regex$splitToSequence$1.$limit - 1) {
                }
                CharSequence charSequence = regex$splitToSequence$1.$input;
                obj3 = charSequence.subSequence(i10, charSequence.length()).toString();
                regex$splitToSequence$1.L$0 = null;
                regex$splitToSequence$1.L$1 = null;
                regex$splitToSequence$1.label = 3;
                if (oVar.yield(obj3, regex$splitToSequence$1) == coroutine_suspended) {
                }
                return y5.w.INSTANCE;
            }
            String obj4 = this.$input.toString();
            this.label = 1;
            if (oVar2.yield(obj4, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                    return y5.w.INSTANCE;
                }
                i8 = this.I$0;
                Matcher matcher3 = (Matcher) this.L$1;
                oVar = (kotlin.sequences.o) this.L$0;
                y5.g.throwOnFailure(obj);
                regex$splitToSequence$1 = this;
                matcher = matcher3;
                i10 = matcher.end();
                i8++;
                if (i8 != regex$splitToSequence$1.$limit - 1 || !matcher.find()) {
                    CharSequence charSequence2 = regex$splitToSequence$1.$input;
                    obj3 = charSequence2.subSequence(i10, charSequence2.length()).toString();
                    regex$splitToSequence$1.L$0 = null;
                    regex$splitToSequence$1.L$1 = null;
                    regex$splitToSequence$1.label = 3;
                    if (oVar.yield(obj3, regex$splitToSequence$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return y5.w.INSTANCE;
                }
                obj2 = regex$splitToSequence$1.$input.subSequence(i10, matcher.start()).toString();
                regex$splitToSequence$1.L$0 = oVar;
                regex$splitToSequence$1.L$1 = matcher;
                regex$splitToSequence$1.I$0 = i8;
                regex$splitToSequence$1.label = 2;
                if (oVar.yield(obj2, regex$splitToSequence$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i10 = matcher.end();
                i8++;
                if (i8 != regex$splitToSequence$1.$limit - 1) {
                }
                CharSequence charSequence22 = regex$splitToSequence$1.$input;
                obj3 = charSequence22.subSequence(i10, charSequence22.length()).toString();
                regex$splitToSequence$1.L$0 = null;
                regex$splitToSequence$1.L$1 = null;
                regex$splitToSequence$1.label = 3;
                if (oVar.yield(obj3, regex$splitToSequence$1) == coroutine_suspended) {
                }
                return y5.w.INSTANCE;
            }
            y5.g.throwOnFailure(obj);
        }
        return y5.w.INSTANCE;
    }

    @Override // f6.p
    public final Object invoke(kotlin.sequences.o oVar, kotlin.coroutines.c cVar) {
        return ((Regex$splitToSequence$1) create(oVar, cVar)).invokeSuspend(y5.w.INSTANCE);
    }
}
