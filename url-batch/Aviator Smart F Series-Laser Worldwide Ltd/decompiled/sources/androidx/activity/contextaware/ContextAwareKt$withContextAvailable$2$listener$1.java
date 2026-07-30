package androidx.activity.contextaware;

import android.content.Context;
import f6.l;
import kotlin.Result;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.n;
import y5.g;

/* loaded from: classes.dex */
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    final /* synthetic */ n $co;
    final /* synthetic */ l $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(n nVar, l lVar) {
        this.$co = nVar;
        this.$onContextAvailable = lVar;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public void onContextAvailable(Context context) {
        Object m348constructorimpl;
        s.checkNotNullParameter(context, "context");
        n nVar = this.$co;
        l lVar = this.$onContextAvailable;
        try {
            Result.a aVar = Result.Companion;
            m348constructorimpl = Result.m348constructorimpl(lVar.invoke(context));
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m348constructorimpl = Result.m348constructorimpl(g.createFailure(th));
        }
        nVar.resumeWith(m348constructorimpl);
    }
}
