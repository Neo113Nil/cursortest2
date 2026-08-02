package com.withpersona.sdk2.inquiry.shared;

import com.withpersona.sdk2.inquiry.shared.image.RealImageHelper;
import dagger.internal.Factory;

/* loaded from: classes9.dex */
public final class SharedModule_FileHelperFactory implements Factory {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SharedModule_FileHelperFactory(SharedModule sharedModule, int i) {
        this.$r8$classId = i;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.$r8$classId) {
            case 0:
                return new RealFileHelper();
            default:
                return new RealImageHelper();
        }
    }
}
