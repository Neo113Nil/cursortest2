package androidx.media;

import android.media.session.MediaSessionManager;
import androidx.annotation.RequiresApi;
import androidx.media.MediaSessionManagerImplBase;

@RequiresApi
/* loaded from: classes5.dex */
class MediaSessionManagerImplApi28 extends MediaSessionManagerImplApi21 {

    @RequiresApi
    static final class RemoteUserInfoImplApi28 extends MediaSessionManagerImplBase.RemoteUserInfoImplBase {
        final MediaSessionManager.RemoteUserInfo mObject;

        RemoteUserInfoImplApi28(String str, int i, int i2) {
            super(str, i, i2);
            this.mObject = MediaSessionManagerImplApi28$RemoteUserInfoImplApi28$$ExternalSyntheticApiModelOutline0.m(str, i, i2);
        }
    }
}
