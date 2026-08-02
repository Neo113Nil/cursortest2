package com.squareup.cash.taptopay.encryption.real;

import com.squareup.cash.taptopay.encryption.api.HieroglyphKeyCompatibilityReport;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.CashBusinessPaymentsClientService;
import com.squareup.protos.hieroglyph.AndroidKeystoreCompatibilityReport;
import com.squareup.protos.hieroglyph.ClientPublicKey;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealHieroglyphKeyProvider$provisionKeys$1 extends ContinuationImpl {
    public ByteString L$1;
    public HieroglyphKeyCompatibilityReport L$2;
    public CashBusinessPaymentsClientService L$5;
    public ClientPublicKey L$6;
    public List L$7;
    public AndroidKeystoreCompatibilityReport L$8;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealHieroglyphKeyProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealHieroglyphKeyProvider$provisionKeys$1(RealHieroglyphKeyProvider realHieroglyphKeyProvider, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realHieroglyphKeyProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.provisionKeys(this);
    }
}
