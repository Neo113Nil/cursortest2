package com.onevcat.uniwebview;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.webkit.CookieManager;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.widget.EditText;
import android.widget.Toast;
import com.imaginationoverflow.unity.referrer.BuildConfig;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class a1 {
    public final Activity a;
    public final String b;
    public final g5 c;
    public final Function0 d;
    public boolean e;
    public final HashMap f;
    public final z0 g;

    public a1(Activity activity, String name, g5 messageSender, x customizeHeaders) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(messageSender, "messageSender");
        Intrinsics.checkNotNullParameter(customizeHeaders, "customizeHeaders");
        this.a = activity;
        this.b = name;
        this.c = messageSender;
        this.d = customizeHeaders;
        this.e = true;
        this.f = new HashMap();
        this.g = new z0(this);
    }

    public final void a(String url, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(url, "url");
        i iVar = null;
        if (StringsKt.startsWith$default(url, "data:", false, 2, (Object) null)) {
            try {
                p a = y0.a(url);
                if (a != null) {
                    j jVar = new j(url, a.b);
                    if (str2 == null && (str2 = a.a) == null) {
                        str2 = BuildConfig.FLAVOR;
                    }
                    String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str2);
                    iVar = new i(jVar, extensionFromMimeType == null ? u.a(StringCompanionObject.INSTANCE) : u.a(StringCompanionObject.INSTANCE) + '.' + extensionFromMimeType, z);
                }
            } catch (Exception e) {
                o oVar = o.b;
                String message = "Failed to parse data url: " + url + ". Error: " + e;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                oVar.a(n.CRITICAL, message);
            }
        } else if (URLUtil.isValidUrl(url)) {
            String fileName = URLUtil.guessFileName(url, str, str2);
            k kVar = new k(url);
            Intrinsics.checkNotNullExpressionValue(fileName, "fileName");
            iVar = new i(kVar, fileName, z);
        }
        if (iVar != null) {
            a(iVar);
        } else {
            Activity activity = this.a;
            Toast.makeText(activity, activity.getResources().getString(R.string.INVALID_URL), 1).show();
        }
    }

    public final void b(i iVar) {
        l lVar = iVar.a;
        if (lVar instanceof k) {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(iVar.a()));
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            request.setDescription(iVar.b);
            request.setTitle(iVar.b);
            request.setDestinationInExternalFilesDir(this.a, Environment.DIRECTORY_DOWNLOADS, iVar.b);
            request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(iVar.a()));
            for (Map.Entry entry : ((Map) this.d.invoke()).entrySet()) {
                request.addRequestHeader((String) entry.getKey(), (String) entry.getValue());
            }
            Object systemService = this.a.getSystemService("download");
            if (systemService instanceof DownloadManager) {
                this.f.put(Long.valueOf(((DownloadManager) systemService).enqueue(request)), iVar);
                Activity activity = this.a;
                Toast.makeText(activity, activity.getResources().getString(R.string.DOWNLOAD_STARTED), 1).show();
                if (iVar.c) {
                    this.c.a(this.b, h5.FileDownloadStarted, new c5(iVar.a(), "0", iVar.b, null));
                    return;
                }
                return;
            }
            return;
        }
        if (lVar instanceof j) {
            j jVar = (j) lVar;
            String a = iVar.a();
            if (iVar.c) {
                this.c.a(this.b, h5.FileDownloadStarted, new c5(a, "0", iVar.b, null));
            }
            try {
                File file = new File(this.a.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), iVar.b);
                FilesKt.writeBytes(file, jVar.b);
                if (iVar.c) {
                    String absolutePath = file.getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "file.absolutePath");
                    this.c.a(this.b, h5.FileDownloadFinished, new c5(a, "0", absolutePath, null));
                }
            } catch (Exception e) {
                o oVar = o.b;
                String message = "Failed to download base64 data: " + a + ". Error: " + e;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                oVar.a(n.CRITICAL, message);
            }
        }
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.a.registerReceiver(this.g, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 2);
        } else {
            this.a.registerReceiver(this.g, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
        }
    }

    public final void a(final i iVar) {
        if (!this.e) {
            b(iVar);
            return;
        }
        final EditText editText = new EditText(this.a);
        editText.setSingleLine();
        editText.setText(iVar.b);
        AlertDialog.Builder cancelable = new AlertDialog.Builder(this.a).setTitle(iVar.a()).setMessage(this.a.getResources().getString(R.string.DOWNLOAD_DESCRIPTION)).setIcon(android.R.drawable.ic_dialog_info).setCancelable(true);
        Intrinsics.checkNotNullExpressionValue(cancelable, "Builder(activity)\n      …     .setCancelable(true)");
        a.a(cancelable, editText).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.a1$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                a1.a(editText, iVar, this, dialogInterface, i);
            }
        }).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.a1$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                a1.a(dialogInterface, i);
            }
        }).create().show();
    }

    public static final void a(EditText input, i task, a1 this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(input, "$input");
        Intrinsics.checkNotNullParameter(task, "$task");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String obj = input.getText().toString();
        dialogInterface.dismiss();
        task.getClass();
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        task.b = obj;
        this$0.b(task);
    }

    public static final void a(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
