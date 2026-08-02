package com.squareup.cash.treehouse.platform;

import androidx.emoji2.text.MetadataRepo;
import app.cash.zipline.ZiplineManifest;
import com.squareup.cash.treehouse.network.prefetch.RealPrefetchClient;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.internal.ContextScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class PlatformLauncher$launch$1 extends ContinuationImpl {
    public ContextScope L$0;
    public ZiplineManifest L$1;
    public String L$2;
    public RealPrefetchClient L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MetadataRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformLauncher$launch$1(MetadataRepo metadataRepo, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = metadataRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return MetadataRepo.access$launch(this.this$0, null, null, this);
    }
}
