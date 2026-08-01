package androidx.profileinstaller;

import A0.c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import e0.AbstractC0107f;
import e0.ExecutorC0105d;
import java.io.File;

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
            AbstractC0107f.s(context, new ExecutorC0105d(0), new c(25, this), true);
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
                c cVar = new c(25, this);
                try {
                    AbstractC0107f.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    cVar.i(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e2) {
                    cVar.i(7, e2);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            Process.sendSignal(Process.myPid(), 10);
            Log.d("ProfileInstaller", "");
            setResultCode(12);
        } else {
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            c cVar2 = new c(25, this);
            if (!"DROP_SHADER_CACHE".equals(string2)) {
                cVar2.i(16, null);
            } else if (AbstractC0107f.c(context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                cVar2.i(14, null);
            } else {
                cVar2.i(15, null);
            }
        }
    }
}
