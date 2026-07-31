package com.onevcat.uniwebview;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Environment;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import com.imaginationoverflow.unity.referrer.BuildConfig;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z0 extends BroadcastReceiver {
    public final /* synthetic */ a1 a;

    public z0(a1 a1Var) {
        this.a = a1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        long longExtra = intent.getLongExtra("extra_download_id", -1L);
        i iVar = (i) this.a.f.get(Long.valueOf(longExtra));
        if (iVar != null) {
            String a = iVar.a();
            String str2 = iVar.b;
            DownloadManager.Query query = new DownloadManager.Query();
            query.setFilterById(longExtra);
            Object systemService = context.getSystemService("download");
            boolean z = systemService instanceof DownloadManager;
            String str3 = BuildConfig.FLAVOR;
            if (z) {
                Cursor query2 = ((DownloadManager) systemService).query(query);
                if (query2.moveToFirst()) {
                    if (query2.getInt(query2.getColumnIndex(NotificationCompat.CATEGORY_STATUS)) == 8) {
                        Toast.makeText(this.a.a, context.getResources().getString(R.string.DOWNLOAD_COMPLETED), 0).show();
                        str3 = new File(this.a.a.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), str2).getAbsolutePath();
                        Intrinsics.checkNotNullExpressionValue(str3, "file.absolutePath");
                        str = "0";
                    } else {
                        str = String.valueOf(query2.getInt(query2.getColumnIndex("reason")));
                    }
                    if (iVar.c) {
                        c5 c5Var = new c5(a, str, str3, null);
                        a1 a1Var = this.a;
                        a1Var.c.a(a1Var.b, h5.FileDownloadFinished, c5Var);
                    }
                    this.a.f.remove(Long.valueOf(longExtra));
                }
            }
            str = "-1";
            if (iVar.c) {
            }
            this.a.f.remove(Long.valueOf(longExtra));
        }
    }
}
