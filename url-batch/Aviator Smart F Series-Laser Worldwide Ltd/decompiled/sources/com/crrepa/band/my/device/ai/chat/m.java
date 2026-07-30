package com.crrepa.band.my.device.ai.chat;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;

/* loaded from: classes2.dex */
final class m {
    private static final String[] PERMISSION_ENABLERECORDAUDIO = {"android.permission.RECORD_AUDIO"};
    private static final int REQUEST_ENABLERECORDAUDIO = 0;

    private m() {
    }

    static void enableRecordAudioWithPermissionCheck(@NonNull AIChatActivity aIChatActivity) {
        String[] strArr = PERMISSION_ENABLERECORDAUDIO;
        if (q7.b.hasSelfPermissions(aIChatActivity, strArr)) {
            aIChatActivity.enableRecordAudio();
        } else {
            ActivityCompat.requestPermissions(aIChatActivity, strArr, 0);
        }
    }

    static void onRequestPermissionsResult(@NonNull AIChatActivity aIChatActivity, int i8, int[] iArr) {
        if (i8 != 0) {
            return;
        }
        if (q7.b.verifyPermissions(iArr)) {
            aIChatActivity.enableRecordAudio();
        } else if (q7.b.shouldShowRequestPermissionRationale(aIChatActivity, PERMISSION_ENABLERECORDAUDIO)) {
            aIChatActivity.showDeniedForCall();
        } else {
            aIChatActivity.showNeverAskForCall();
        }
    }
}
