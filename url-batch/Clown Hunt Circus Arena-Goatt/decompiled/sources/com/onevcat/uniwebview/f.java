package com.onevcat.uniwebview;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Environment;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import com.onevcat.uniwebview.internal.obfuscated.C0073k;
import com.onevcat.uniwebview.internal.obfuscated.H3;
import com.onevcat.uniwebview.internal.obfuscated.r3;
import com.onevcat.uniwebview.internal.obfuscated.v3;
import java.io.File;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends BroadcastReceiver {
    public final /* synthetic */ g a;

    public f(g gVar) {
        this.a = gVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Cursor query;
        String valueOf;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        long longExtra = intent.getLongExtra("extra_download_id", -1L);
        C0073k c0073k = (C0073k) this.a.g.get(Long.valueOf(longExtra));
        if (c0073k != null) {
            String a = c0073k.a();
            String str = c0073k.b;
            DownloadManager.Query query2 = new DownloadManager.Query();
            query2.setFilterById(longExtra);
            Object systemService = context.getSystemService("download");
            String str2 = "";
            String str3 = "-1";
            if ((systemService instanceof DownloadManager) && (query = ((DownloadManager) systemService).query(query2)) != null) {
                g gVar = this.a;
                try {
                    if (query.moveToFirst()) {
                        if (query.getInt(query.getColumnIndex(NotificationCompat.CATEGORY_STATUS)) == 8) {
                            Toast toast = gVar.f;
                            if (toast != null) {
                                toast.cancel();
                            }
                            Toast makeText = Toast.makeText(gVar.b, context.getResources().getString(R.string.DOWNLOAD_COMPLETED), 0);
                            gVar.f = makeText;
                            if (makeText != null) {
                                makeText.show();
                            }
                            str2 = new File(gVar.b.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), str).getAbsolutePath();
                            Intrinsics.checkNotNullExpressionValue(str2, "file.absolutePath");
                            valueOf = "0";
                        } else {
                            valueOf = String.valueOf(query.getInt(query.getColumnIndex("reason")));
                        }
                        str3 = valueOf;
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(query, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(query, th);
                        throw th2;
                    }
                }
            }
            if (c0073k.c) {
                v3 payload = new v3(a, str3, str2, null);
                r3 r3Var = this.a.a;
                H3 method = H3.FileDownloadFinished;
                r3Var.getClass();
                Intrinsics.checkNotNullParameter(method, "method");
                Intrinsics.checkNotNullParameter(payload, "payload");
                r3Var.a(method, payload.a());
            }
            this.a.g.remove(Long.valueOf(longExtra));
        }
    }
}
