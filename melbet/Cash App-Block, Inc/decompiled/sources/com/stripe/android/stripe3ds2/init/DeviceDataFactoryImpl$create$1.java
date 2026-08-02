package com.stripe.android.stripe3ds2.init;

import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class DeviceDataFactoryImpl$create$1 extends ContinuationImpl {
    public int I$0;
    public String L$0;
    public SdkTransactionId L$1;
    public Pair[] L$2;
    public Pair[] L$3;
    public String L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DeviceDataFactoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceDataFactoryImpl$create$1(DeviceDataFactoryImpl deviceDataFactoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = deviceDataFactoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.create(null, null, this);
    }
}
