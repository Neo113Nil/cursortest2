package com.squareup.cash.taptopay.encryption.real;

import android.security.keystore.KeyGenParameterSpec;
import com.squareup.cash.biometrics.AndroidSecureStore;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealHieroglyphKeyProvider$importEncryptedHieroglyphKey$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public long J$0;
    public KeyGenParameterSpec L$1;
    public AndroidSecureStore L$10;
    public Iterator L$3;
    public String L$8;
    public String L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealHieroglyphKeyProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealHieroglyphKeyProvider$importEncryptedHieroglyphKey$1(RealHieroglyphKeyProvider realHieroglyphKeyProvider, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realHieroglyphKeyProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.importEncryptedHieroglyphKey(null, this);
    }
}
