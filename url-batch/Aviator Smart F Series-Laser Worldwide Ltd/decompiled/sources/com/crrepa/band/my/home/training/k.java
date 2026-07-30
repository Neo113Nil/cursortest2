package com.crrepa.band.my.home.training;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class k {
    private static final String[] PERMISSION_REQUESTLOCATIONPERMISSION = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    private static final String[] PERMISSION_STARTNODEVICETRAINING = {"android.permission.ACTIVITY_RECOGNITION"};
    private static final int REQUEST_REQUESTLOCATIONPERMISSION = 15;
    private static final int REQUEST_STARTNODEVICETRAINING = 16;

    private static final class b implements q7.a {
        private final WeakReference<HomeTrainingFragment> weakTarget;

        @Override // q7.a
        public void cancel() {
            HomeTrainingFragment homeTrainingFragment = this.weakTarget.get();
            if (homeTrainingFragment == null) {
                return;
            }
            homeTrainingFragment.showDeniedForLocation();
        }

        @Override // q7.a
        public void proceed() {
            HomeTrainingFragment homeTrainingFragment = this.weakTarget.get();
            if (homeTrainingFragment == null) {
                return;
            }
            homeTrainingFragment.requestPermissions(k.PERMISSION_REQUESTLOCATIONPERMISSION, 15);
        }

        private b(@NonNull HomeTrainingFragment homeTrainingFragment) {
            this.weakTarget = new WeakReference<>(homeTrainingFragment);
        }
    }

    private k() {
    }

    static void onRequestPermissionsResult(@NonNull HomeTrainingFragment homeTrainingFragment, int i8, int[] iArr) {
        if (i8 == 15) {
            if (q7.b.verifyPermissions(iArr)) {
                homeTrainingFragment.requestLocationPermission();
                return;
            } else if (q7.b.shouldShowRequestPermissionRationale(homeTrainingFragment, PERMISSION_REQUESTLOCATIONPERMISSION)) {
                homeTrainingFragment.showDeniedForLocation();
                return;
            } else {
                homeTrainingFragment.showNeverAskForLocation();
                return;
            }
        }
        if (i8 != 16) {
            return;
        }
        if (q7.b.verifyPermissions(iArr)) {
            homeTrainingFragment.startNoDeviceTraining();
        } else if (q7.b.shouldShowRequestPermissionRationale(homeTrainingFragment, PERMISSION_STARTNODEVICETRAINING)) {
            homeTrainingFragment.deniedActivityRecognition();
        } else {
            homeTrainingFragment.showNeverAskForActivityRecognition();
        }
    }

    static void requestLocationPermissionWithPermissionCheck(@NonNull HomeTrainingFragment homeTrainingFragment) {
        FragmentActivity requireActivity = homeTrainingFragment.requireActivity();
        String[] strArr = PERMISSION_REQUESTLOCATIONPERMISSION;
        if (q7.b.hasSelfPermissions(requireActivity, strArr)) {
            homeTrainingFragment.requestLocationPermission();
        } else if (q7.b.shouldShowRequestPermissionRationale(homeTrainingFragment, strArr)) {
            homeTrainingFragment.showRationaleForLocation(new b(homeTrainingFragment));
        } else {
            homeTrainingFragment.requestPermissions(strArr, 15);
        }
    }

    static void startNoDeviceTrainingWithPermissionCheck(@NonNull HomeTrainingFragment homeTrainingFragment) {
        FragmentActivity requireActivity = homeTrainingFragment.requireActivity();
        String[] strArr = PERMISSION_STARTNODEVICETRAINING;
        if (q7.b.hasSelfPermissions(requireActivity, strArr)) {
            homeTrainingFragment.startNoDeviceTraining();
        } else {
            homeTrainingFragment.requestPermissions(strArr, 16);
        }
    }
}
