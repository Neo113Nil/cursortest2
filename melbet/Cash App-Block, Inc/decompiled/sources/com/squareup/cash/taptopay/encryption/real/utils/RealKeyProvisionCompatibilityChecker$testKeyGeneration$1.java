package com.squareup.cash.taptopay.encryption.real.utils;

import com.squareup.cash.taptopay.encryption.api.HieroglyphKeyCompatibilityReport;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealKeyProvisionCompatibilityChecker$testKeyGeneration$1 extends ContinuationImpl {
    public int I$0;
    public HieroglyphKeyCompatibilityReport L$0;
    public RealKeyProvisionCompatibilityChecker L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealKeyProvisionCompatibilityChecker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealKeyProvisionCompatibilityChecker$testKeyGeneration$1(RealKeyProvisionCompatibilityChecker realKeyProvisionCompatibilityChecker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realKeyProvisionCompatibilityChecker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.testKeyGeneration(null, this);
    }
}
