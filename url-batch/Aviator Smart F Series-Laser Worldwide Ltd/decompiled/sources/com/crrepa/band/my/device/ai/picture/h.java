package com.crrepa.band.my.device.ai.picture;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;

/* loaded from: classes2.dex */
final class h {
    private static final String[] PERMISSION_ENABLERECORDAUDIO = {"android.permission.RECORD_AUDIO"};
    private static final int REQUEST_ENABLERECORDAUDIO = 1;

    private h() {
    }

    static void enableRecordAudioWithPermissionCheck(@NonNull AIPictureActivity aIPictureActivity) {
        String[] strArr = PERMISSION_ENABLERECORDAUDIO;
        if (q7.b.hasSelfPermissions(aIPictureActivity, strArr)) {
            aIPictureActivity.enableRecordAudio();
        } else {
            ActivityCompat.requestPermissions(aIPictureActivity, strArr, 1);
        }
    }

    static void onRequestPermissionsResult(@NonNull AIPictureActivity aIPictureActivity, int i8, int[] iArr) {
        if (i8 != 1) {
            return;
        }
        if (q7.b.verifyPermissions(iArr)) {
            aIPictureActivity.enableRecordAudio();
        } else if (q7.b.shouldShowRequestPermissionRationale(aIPictureActivity, PERMISSION_ENABLERECORDAUDIO)) {
            aIPictureActivity.showDeniedForCall();
        } else {
            aIPictureActivity.showNeverAskForCall();
        }
    }
}
