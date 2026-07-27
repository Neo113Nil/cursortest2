package com.onesignal.location.internal;

import com.onesignal.core.internal.minification.KeepStub;
import com.onesignal.location.ILocationManager;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;

@KeepStub
/* loaded from: classes.dex */
public final class MisconfiguredLocationManager implements ILocationManager {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:Location in order to use this functionality!");
        }

        private Companion() {
        }
    }

    @Override // com.onesignal.location.ILocationManager
    public boolean isShared() {
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.location.ILocationManager
    public Object requestPermission(InterfaceC1218d interfaceC1218d) {
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.location.ILocationManager
    public void setShared(boolean z) {
        throw Companion.getEXCEPTION();
    }
}
