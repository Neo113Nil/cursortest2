package kotlin.sequences;

import java.util.Iterator;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class q {
    private static final int State_Done = 4;
    private static final int State_Failed = 5;
    private static final int State_ManyNotReady = 1;
    private static final int State_ManyReady = 2;
    private static final int State_NotReady = 0;
    private static final int State_Ready = 3;

    public static final class a implements m {
        final /* synthetic */ f6.p $block$inlined;

        public a(f6.p pVar) {
            this.$block$inlined = pVar;
        }

        @Override // kotlin.sequences.m
        public Iterator<T> iterator() {
            Iterator<T> it;
            it = q.iterator(this.$block$inlined);
            return it;
        }
    }

    public static <T> Iterator<T> iterator(f6.p block) {
        kotlin.coroutines.c createCoroutineUnintercepted;
        kotlin.jvm.internal.s.checkNotNullParameter(block, "block");
        n nVar = new n();
        createCoroutineUnintercepted = IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(block, nVar, nVar);
        nVar.setNextStep(createCoroutineUnintercepted);
        return nVar;
    }

    public static <T> m sequence(f6.p block) {
        kotlin.jvm.internal.s.checkNotNullParameter(block, "block");
        return new a(block);
    }
}
