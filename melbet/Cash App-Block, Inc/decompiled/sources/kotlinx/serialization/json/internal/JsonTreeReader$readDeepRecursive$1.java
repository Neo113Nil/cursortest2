package kotlinx.serialization.json.internal;

import androidx.recyclerview.widget.AdapterHelper;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.fido.zzfz;
import kotlin.DeepRecursiveScope;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.serialization.json.JsonElement;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class JsonTreeReader$readDeepRecursive$1 extends RestrictedSuspendLambda implements Function3 {
    public /* synthetic */ DeepRecursiveScope L$0;
    public int label;
    public final /* synthetic */ zzfz this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readDeepRecursive$1(zzfz zzfzVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = zzfzVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this.this$0, (Continuation) obj3);
        jsonTreeReader$readDeepRecursive$1.L$0 = (DeepRecursiveScope) obj;
        return jsonTreeReader$readDeepRecursive$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzfz zzfzVar = this.this$0;
        AdapterHelper adapterHelper = (AdapterHelper) zzfzVar.zza;
        DeepRecursiveScope deepRecursiveScope = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            byte peekNextToken = adapterHelper.peekNextToken();
            if (peekNextToken == 1) {
                return zzfzVar.readValue(true);
            }
            if (peekNextToken == 0) {
                return zzfzVar.readValue(false);
            }
            if (peekNextToken != 6) {
                if (peekNextToken == 8) {
                    return zzfzVar.readArray();
                }
                AdapterHelper.fail$default(adapterHelper, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.L$0 = null;
            this.label = 1;
            obj = zzfz.access$readObject(zzfzVar, deepRecursiveScope, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return (JsonElement) obj;
    }
}
