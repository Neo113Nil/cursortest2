package kotlinx.serialization.json.internal;

import com.google.android.gms.internal.fido.zzfz;
import java.util.LinkedHashMap;
import kotlin.DeepRecursiveScope;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class JsonTreeReader$readObject$2 extends ContinuationImpl {
    public int I$0;
    public DeepRecursiveScope L$0;
    public zzfz L$1;
    public LinkedHashMap L$2;
    public String L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ zzfz this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readObject$2(zzfz zzfzVar, BaseContinuationImpl baseContinuationImpl) {
        super(baseContinuationImpl);
        this.this$0 = zzfzVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return zzfz.access$readObject(this.this$0, null, this);
    }
}
