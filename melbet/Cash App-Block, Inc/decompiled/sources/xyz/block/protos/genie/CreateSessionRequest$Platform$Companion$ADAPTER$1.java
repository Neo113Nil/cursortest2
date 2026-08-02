package xyz.block.protos.genie;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import xyz.block.protos.genie.CreateSessionRequest;

/* loaded from: classes10.dex */
public final class CreateSessionRequest$Platform$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CreateSessionRequest.Platform.Companion.getClass();
        if (i == 0) {
            return CreateSessionRequest.Platform.PLATFORM_UNSPECIFIED;
        }
        if (i == 1) {
            return CreateSessionRequest.Platform.PLATFORM_ANDROID;
        }
        if (i == 2) {
            return CreateSessionRequest.Platform.PLATFORM_IOS;
        }
        if (i != 3) {
            return null;
        }
        return CreateSessionRequest.Platform.PLATFORM_WEB;
    }
}
