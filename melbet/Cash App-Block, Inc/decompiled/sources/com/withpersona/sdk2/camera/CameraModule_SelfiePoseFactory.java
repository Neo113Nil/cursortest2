package com.withpersona.sdk2.camera;

import dagger.internal.Factory;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes9.dex */
public final class CameraModule_SelfiePoseFactory implements Factory {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CameraModule_SelfiePoseFactory(CameraHelper cameraHelper, int i) {
        this.$r8$classId = i;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.$r8$classId) {
        }
        return FlowKt.MutableSharedFlow$default(0, 0, null, 7);
    }
}
