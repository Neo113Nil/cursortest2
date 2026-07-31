package com.onevcat.uniwebview;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Environment;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class V extends BroadcastReceiver {
    public final /* synthetic */ W a;

    public V(W w) {
        this.a = w;
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
        C0045g c0045g = (C0045g) this.a.f.get(Long.valueOf(longExtra));
        if (c0045g != null) {
            String a = c0045g.a();
            String str2 = c0045g.b;
            DownloadManager.Query query = new DownloadManager.Query();
            query.setFilterById(longExtra);
            Object systemService = context.getSystemService("download");
            String str3 = "";
            if (systemService instanceof DownloadManager) {
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
                    if (c0045g.c) {
                        Y1 y1 = new Y1(a, str, str3, null);
                        W w = this.a;
                        w.c.a(w.b, d2.FileDownloadFinished, y1);
                    }
                    this.a.f.remove(Long.valueOf(longExtra));
                }
            }
            str = "-1";
            if (c0045g.c) {
            }
            this.a.f.remove(Long.valueOf(longExtra));
        }
    }
}
