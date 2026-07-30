package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;
import p000createpolar.PolarVoyageAdapterTitanSpark4027;
import p000createpolar.PolarVoyageConstraintSetClonePixelVortex4921;
import p000createpolar.PolarVoyageFilterTurboThunderEclipse3279;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageWithContextPulseSolarHyperion4393(context, new PolarVoyageFilterTurboThunderEclipse3279(1), new PolarVoyageAdapterTitanSpark4027(28, this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark4027 = new PolarVoyageAdapterTitanSpark4027(28, this);
                try {
                    PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageGuidelineStormSolar2850(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    polarVoyageAdapterTitanSpark4027.PolarVoyageContentProviderHyperSpark3838(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    polarVoyageAdapterTitanSpark4027.PolarVoyageContentProviderHyperSpark3838(7, e);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            Process.sendSignal(Process.myPid(), 10);
            Log.d("ProfileInstaller", "");
            setResultCode(12);
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark40272 = new PolarVoyageAdapterTitanSpark4027(28, this);
        if ("DROP_SHADER_CACHE".equals(string2)) {
            if (PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageNavigationViewHyperHyperHyperion1793(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                polarVoyageAdapterTitanSpark40272.PolarVoyageContentProviderHyperSpark3838(14, null);
                return;
            } else {
                polarVoyageAdapterTitanSpark40272.PolarVoyageContentProviderHyperSpark3838(15, null);
                return;
            }
        }
        if (!"SAVE_PROFILE".equals(string2)) {
            polarVoyageAdapterTitanSpark40272.PolarVoyageContentProviderHyperSpark3838(16, null);
        } else {
            Process.sendSignal(extras.getInt("EXTRA_PID", Process.myPid()), 10);
            polarVoyageAdapterTitanSpark40272.PolarVoyageContentProviderHyperSpark3838(12, null);
        }
    }
}
