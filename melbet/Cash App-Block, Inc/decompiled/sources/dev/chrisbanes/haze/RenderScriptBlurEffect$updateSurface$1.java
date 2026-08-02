package dev.chrisbanes.haze;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class RenderScriptBlurEffect$updateSurface$1 extends ContinuationImpl {
    public float F$0;
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public GraphicsLayer L$0;
    public String L$2;
    public RenderScriptContext L$4;
    public String L$7;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RenderScriptBlurEffect this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenderScriptBlurEffect$updateSurface$1(RenderScriptBlurEffect renderScriptBlurEffect, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = renderScriptBlurEffect;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RenderScriptBlurEffect.access$updateSurface(this.this$0, null, RecyclerView.DECELERATION_RATE, this);
    }
}
