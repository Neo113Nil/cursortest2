package com.stripe.android.uicore.image;

import android.graphics.BitmapFactory;
import java.net.URL;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class NetworkImageDecoder$decode$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public int I$2;
    public URL L$0;
    public BitmapFactory.Options L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NetworkImageDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkImageDecoder$decode$1(NetworkImageDecoder networkImageDecoder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = networkImageDecoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.decode(null, 0, 0, this);
    }
}
