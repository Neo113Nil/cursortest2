package com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts;

import java.io.File;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class RealFontDownloader$downloadFontFile$1 extends ContinuationImpl {
    public File L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealFontDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealFontDownloader$downloadFontFile$1(RealFontDownloader realFontDownloader, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realFontDownloader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealFontDownloader.access$downloadFontFile(this.this$0, null, null, this);
    }
}
