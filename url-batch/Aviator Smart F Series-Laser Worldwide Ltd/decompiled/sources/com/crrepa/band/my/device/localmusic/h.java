package com.crrepa.band.my.device.localmusic;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class h {
    private static final String[] PERMISSION_ENABLEREADMEDIAAUDIOS = {"android.permission.READ_MEDIA_AUDIO"};
    private static final String[] PERMISSION_UPDATEBANDCONFIG = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    private static final int REQUEST_ENABLEREADMEDIAAUDIOS = 17;
    private static final int REQUEST_UPDATEBANDCONFIG = 18;

    private static final class b implements q7.a {
        private final WeakReference<LocalMusicMainActivity> weakTarget;

        @Override // q7.a
        public void cancel() {
            LocalMusicMainActivity localMusicMainActivity = this.weakTarget.get();
            if (localMusicMainActivity == null) {
                return;
            }
            localMusicMainActivity.showDeniedForCall();
        }

        @Override // q7.a
        public void proceed() {
            LocalMusicMainActivity localMusicMainActivity = this.weakTarget.get();
            if (localMusicMainActivity == null) {
                return;
            }
            ActivityCompat.requestPermissions(localMusicMainActivity, h.PERMISSION_ENABLEREADMEDIAAUDIOS, 17);
        }

        private b(@NonNull LocalMusicMainActivity localMusicMainActivity) {
            this.weakTarget = new WeakReference<>(localMusicMainActivity);
        }
    }

    private static final class c implements q7.a {
        private final WeakReference<LocalMusicMainActivity> weakTarget;

        @Override // q7.a
        public void cancel() {
            LocalMusicMainActivity localMusicMainActivity = this.weakTarget.get();
            if (localMusicMainActivity == null) {
                return;
            }
            localMusicMainActivity.showDeniedForStorage();
        }

        @Override // q7.a
        public void proceed() {
            LocalMusicMainActivity localMusicMainActivity = this.weakTarget.get();
            if (localMusicMainActivity == null) {
                return;
            }
            ActivityCompat.requestPermissions(localMusicMainActivity, h.PERMISSION_UPDATEBANDCONFIG, 18);
        }

        private c(@NonNull LocalMusicMainActivity localMusicMainActivity) {
            this.weakTarget = new WeakReference<>(localMusicMainActivity);
        }
    }

    private h() {
    }

    static void enableReadMediaAudiosWithPermissionCheck(@NonNull LocalMusicMainActivity localMusicMainActivity) {
        String[] strArr = PERMISSION_ENABLEREADMEDIAAUDIOS;
        if (q7.b.hasSelfPermissions(localMusicMainActivity, strArr)) {
            localMusicMainActivity.enableReadMediaAudios();
        } else if (q7.b.shouldShowRequestPermissionRationale(localMusicMainActivity, strArr)) {
            localMusicMainActivity.showRationaleForCall(new b(localMusicMainActivity));
        } else {
            ActivityCompat.requestPermissions(localMusicMainActivity, strArr, 17);
        }
    }

    static void onRequestPermissionsResult(@NonNull LocalMusicMainActivity localMusicMainActivity, int i8, int[] iArr) {
        if (i8 == 17) {
            if (q7.b.verifyPermissions(iArr)) {
                localMusicMainActivity.enableReadMediaAudios();
                return;
            } else if (q7.b.shouldShowRequestPermissionRationale(localMusicMainActivity, PERMISSION_ENABLEREADMEDIAAUDIOS)) {
                localMusicMainActivity.showDeniedForCall();
                return;
            } else {
                localMusicMainActivity.showNeverAskForCall();
                return;
            }
        }
        if (i8 != 18) {
            return;
        }
        if (q7.b.verifyPermissions(iArr)) {
            localMusicMainActivity.updateBandConfig();
        } else if (q7.b.shouldShowRequestPermissionRationale(localMusicMainActivity, PERMISSION_UPDATEBANDCONFIG)) {
            localMusicMainActivity.showDeniedForStorage();
        } else {
            localMusicMainActivity.showNeverAskForStorage();
        }
    }

    static void updateBandConfigWithPermissionCheck(@NonNull LocalMusicMainActivity localMusicMainActivity) {
        String[] strArr = PERMISSION_UPDATEBANDCONFIG;
        if (q7.b.hasSelfPermissions(localMusicMainActivity, strArr)) {
            localMusicMainActivity.updateBandConfig();
        } else if (q7.b.shouldShowRequestPermissionRationale(localMusicMainActivity, strArr)) {
            localMusicMainActivity.showRationaleForStorage(new c(localMusicMainActivity));
        } else {
            ActivityCompat.requestPermissions(localMusicMainActivity, strArr, 18);
        }
    }
}
