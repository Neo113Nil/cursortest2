package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ao3;
import com.google.android.gms.internal.ads.bo3;

/* loaded from: classes.dex */
public abstract class ao3<MessageType extends bo3<MessageType, BuilderType>, BuilderType extends ao3<MessageType, BuilderType>> implements jr3 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.jr3
    public final /* bridge */ /* synthetic */ jr3 c(kr3 kr3Var) {
        if (a().getClass().isInstance(kr3Var)) {
            return j((bo3) kr3Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    protected abstract BuilderType j(MessageType messagetype);
}
