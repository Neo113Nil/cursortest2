package com.squareup.cash.treehouse.android.configuration;

import com.squareup.cash.db2.TreehouseAppConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealTreehouseConfigurationStore$toModel$1 extends ContinuationImpl {
    public int I$0;
    public String L$0;
    public TreehouseAppConfigurations L$1;
    public TreehouseAppConfig L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealTreehouseConfigurationStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTreehouseConfigurationStore$toModel$1(RealTreehouseConfigurationStore realTreehouseConfigurationStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realTreehouseConfigurationStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealTreehouseConfigurationStore.access$toModel(this.this$0, null, null, null, this);
    }
}
