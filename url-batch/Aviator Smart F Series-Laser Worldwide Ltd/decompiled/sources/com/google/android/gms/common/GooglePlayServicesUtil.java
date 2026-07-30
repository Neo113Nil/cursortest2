package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.zag;
import com.google.errorprone.annotations.InlineMe;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public final class GooglePlayServicesUtil extends GooglePlayServicesUtilLight {

    @NonNull
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";

    @NonNull
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    @NonNull
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Nullable
    @Deprecated
    public static Dialog getErrorDialog(int i8, @NonNull Activity activity, int i9) {
        return getErrorDialog(i8, activity, i9, null);
    }

    @NonNull
    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i8, @NonNull Context context, int i9) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i8, i9);
    }

    @NonNull
    @Deprecated
    public static String getErrorString(int i8) {
        return GooglePlayServicesUtilLight.getErrorString(i8);
    }

    @NonNull
    public static Context getRemoteContext(@NonNull Context context) {
        return GooglePlayServicesUtilLight.getRemoteContext(context);
    }

    @NonNull
    public static Resources getRemoteResource(@NonNull Context context) {
        return GooglePlayServicesUtilLight.getRemoteResource(context);
    }

    @ResultIgnorabilityUnspecified
    @HideFirstParty
    @Deprecated
    public static int isGooglePlayServicesAvailable(@NonNull Context context) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i8) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(i8);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static boolean showErrorDialogFragment(int i8, @NonNull Activity activity, int i9) {
        return showErrorDialogFragment(i8, activity, i9, null);
    }

    @Deprecated
    public static void showErrorNotification(int i8, @NonNull Context context) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i8) || GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i8)) {
            googleApiAvailability.zaf(context);
        } else {
            googleApiAvailability.showErrorNotification(context, i8);
        }
    }

    @Nullable
    @Deprecated
    public static Dialog getErrorDialog(int i8, @NonNull Activity activity, int i9, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i8)) {
            i8 = 18;
        }
        return GoogleApiAvailability.getInstance().getErrorDialog(activity, i8, i9, onCancelListener);
    }

    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(@NonNull Context context, int i8) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i8);
    }

    @ResultIgnorabilityUnspecified
    @InlineMe(imports = {"androidx.fragment.app.Fragment", "com.google.android.gms.common.GooglePlayServicesUtil"}, replacement = "GooglePlayServicesUtil.showErrorDialogFragment(errorCode, activity, (Fragment) null, requestCode, cancelListener)")
    @Deprecated
    public static boolean showErrorDialogFragment(int i8, @NonNull Activity activity, int i9, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i8, activity, null, i9, onCancelListener);
    }

    @ResultIgnorabilityUnspecified
    public static boolean showErrorDialogFragment(int i8, @NonNull Activity activity, @Nullable Fragment fragment, int i9, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        int i10 = true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i8) ? 18 : i8;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (fragment == null) {
            return googleApiAvailability.showErrorDialogFragment(activity, i10, i9, onCancelListener);
        }
        Dialog zaa = googleApiAvailability.zaa(activity, i10, zag.zac(fragment, GoogleApiAvailability.getInstance().getErrorResolutionIntent(activity, i10, "d"), i9), onCancelListener, null);
        if (zaa == null) {
            return false;
        }
        googleApiAvailability.zad(activity, zaa, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }
}
