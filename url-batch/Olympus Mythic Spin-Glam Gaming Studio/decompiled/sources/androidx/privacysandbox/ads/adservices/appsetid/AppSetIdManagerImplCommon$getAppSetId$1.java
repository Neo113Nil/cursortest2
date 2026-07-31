package androidx.privacysandbox.ads.adservices.appsetid;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppSetIdManagerImplCommon.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon", f = "AppSetIdManagerImplCommon.kt", l = {38}, m = "getAppSetId$suspendImpl")
/* loaded from: classes11.dex */
final class AppSetIdManagerImplCommon$getAppSetId$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppSetIdManagerImplCommon this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppSetIdManagerImplCommon$getAppSetId$1(AppSetIdManagerImplCommon appSetIdManagerImplCommon, Continuation continuation) {
        super(continuation);
        this.this$0 = appSetIdManagerImplCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AppSetIdManagerImplCommon.getAppSetId$suspendImpl(this.this$0, this);
    }
}
