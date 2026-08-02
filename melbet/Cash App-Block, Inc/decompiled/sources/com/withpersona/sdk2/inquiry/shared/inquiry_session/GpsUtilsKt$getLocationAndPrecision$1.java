package com.withpersona.sdk2.inquiry.shared.inquiry_session;

import com.google.android.play.core.splitcompat.zzf;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class GpsUtilsKt$getLocationAndPrecision$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return zzf.getLocationAndPrecision(null, this);
    }
}
