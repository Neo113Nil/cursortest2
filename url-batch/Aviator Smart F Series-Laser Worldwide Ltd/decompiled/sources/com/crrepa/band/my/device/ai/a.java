package com.crrepa.band.my.device.ai;

import android.util.Log;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.crrepa.band.my.device.ai.helper.d;
import com.crrepa.ble.conn.callback.CRPAiCallback;
import java.util.Arrays;
import org.greenrobot.eventbus.c;

/* loaded from: classes2.dex */
public class a implements CRPAiCallback {
    @Override // com.crrepa.ble.conn.callback.CRPAiCallback
    public void onSupportAiFeature(byte b8, byte[] bArr, boolean z7) {
        Log.d("AISupportFeatureListen", "provider: " + ((int) b8) + ", features: " + Arrays.toString(bArr) + ", isStreamChat: " + z7);
        AIProvider.saveProviderType(b8);
        AIProvider.saveSupportAI(bArr);
        AIProvider.saveIsStreamChat(z7);
        if (bArr.length > 0) {
            c.getDefault().post(new b());
            d.initAIAgent();
        }
        if (AIProvider.isSupportAIWatchFace()) {
            i4.getInstance().queryAIWatchFaceLayout();
            i4.getInstance().queryJieliAIPhotoWatchFace();
        }
    }
}
