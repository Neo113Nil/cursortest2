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
import com.google.common.net.HttpHeaders;
import com.onevcat.uniwebview.internal.obfuscated.A;
import com.onevcat.uniwebview.internal.obfuscated.AbstractC0025a;
import com.onevcat.uniwebview.internal.obfuscated.AbstractC0085n;
import com.onevcat.uniwebview.internal.obfuscated.B;
import com.onevcat.uniwebview.internal.obfuscated.B0;
import com.onevcat.uniwebview.internal.obfuscated.C0073k;
import com.onevcat.uniwebview.internal.obfuscated.C0077l;
import com.onevcat.uniwebview.internal.obfuscated.C0081m;
import com.onevcat.uniwebview.internal.obfuscated.D;
import com.onevcat.uniwebview.internal.obfuscated.H3;
import com.onevcat.uniwebview.internal.obfuscated.I;
import com.onevcat.uniwebview.internal.obfuscated.M;
import com.onevcat.uniwebview.internal.obfuscated.r3;
import com.onevcat.uniwebview.internal.obfuscated.v3;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class g {
    public final r3 a;
    public final Activity b;
    public final M c;
    public boolean d;
    public boolean e;
    public Toast f;
    public final HashMap g;
    public final f h;

    public g(r3 messageDispatcher, Activity activity, M customizeHeaders) {
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(customizeHeaders, "customizeHeaders");
        this.a = messageDispatcher;
        this.b = activity;
        this.c = customizeHeaders;
        this.d = true;
        this.e = true;
        this.g = new HashMap();
        this.h = new f(this);
    }

    public final void a(String url, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(url, "url");
        C0073k c0073k = null;
        if (StringsKt.startsWith$default(url, "data:", false, 2, (Object) null)) {
            try {
                D a = B0.a(url);
                if (a != null) {
                    C0077l c0077l = new C0077l(url, a.b);
                    if (str2 == null && (str2 = a.a) == null) {
                        str2 = "";
                    }
                    String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str2);
                    c0073k = new C0073k(c0077l, extensionFromMimeType == null ? I.a(StringCompanionObject.INSTANCE) : I.a(StringCompanionObject.INSTANCE) + '.' + extensionFromMimeType, z);
                }
            } catch (Exception e) {
                B b = B.b;
                String message = "Failed to parse data url: " + url + ". Error: " + e;
                b.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                b.a(A.CRITICAL, message);
            }
        } else if (URLUtil.isValidUrl(url)) {
            String fileName = URLUtil.guessFileName(url, str, str2);
            C0081m c0081m = new C0081m(url);
            Intrinsics.checkNotNullExpressionValue(fileName, "fileName");
            c0073k = new C0073k(c0081m, fileName, z);
        }
        if (c0073k != null) {
            a(c0073k);
        } else {
            Activity activity = this.b;
            Toast.makeText(activity, activity.getResources().getString(R.string.INVALID_URL), 1).show();
        }
    }

    public final void b(C0073k c0073k) {
        AbstractC0085n abstractC0085n = c0073k.a;
        if (abstractC0085n instanceof C0081m) {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(c0073k.a()));
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            request.setDescription(c0073k.b);
            request.setTitle(c0073k.b);
            request.setDestinationInExternalFilesDir(this.b, Environment.DIRECTORY_DOWNLOADS, c0073k.b);
            request.addRequestHeader(HttpHeaders.COOKIE, CookieManager.getInstance().getCookie(c0073k.a()));
            for (Map.Entry entry : ((Map) this.c.invoke()).entrySet()) {
                request.addRequestHeader((String) entry.getKey(), (String) entry.getValue());
            }
            Object systemService = this.b.getSystemService("download");
            if (systemService instanceof DownloadManager) {
                this.g.put(Long.valueOf(((DownloadManager) systemService).enqueue(request)), c0073k);
                Toast toast = this.f;
                if (toast != null) {
                    toast.cancel();
                }
                Activity activity = this.b;
                Toast makeText = Toast.makeText(activity, activity.getResources().getString(R.string.DOWNLOAD_STARTED), 1);
                this.f = makeText;
                if (makeText != null) {
                    makeText.show();
                }
                if (c0073k.c) {
                    v3 payload = new v3(c0073k.a(), "0", c0073k.b, null);
                    r3 r3Var = this.a;
                    H3 method = H3.FileDownloadStarted;
                    r3Var.getClass();
                    Intrinsics.checkNotNullParameter(method, "method");
                    Intrinsics.checkNotNullParameter(payload, "payload");
                    r3Var.a(method, payload.a());
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC0085n instanceof C0077l) {
            Intrinsics.checkNotNull(abstractC0085n, "null cannot be cast to non-null type com.onevcat.uniwebview.DownloadTaskType.DataUrl");
            C0077l c0077l = (C0077l) abstractC0085n;
            String a = c0073k.a();
            if (c0073k.c) {
                v3 payload2 = new v3(a, "0", c0073k.b, null);
                r3 r3Var2 = this.a;
                H3 method2 = H3.FileDownloadStarted;
                r3Var2.getClass();
                Intrinsics.checkNotNullParameter(method2, "method");
                Intrinsics.checkNotNullParameter(payload2, "payload");
                r3Var2.a(method2, payload2.a());
            }
            try {
                File file = new File(this.b.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), c0073k.b);
                FilesKt.writeBytes(file, c0077l.b);
                if (c0073k.c) {
                    String absolutePath = file.getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "file.absolutePath");
                    v3 payload3 = new v3(a, "0", absolutePath, null);
                    r3 r3Var3 = this.a;
                    H3 method3 = H3.FileDownloadFinished;
                    r3Var3.getClass();
                    Intrinsics.checkNotNullParameter(method3, "method");
                    Intrinsics.checkNotNullParameter(payload3, "payload");
                    r3Var3.a(method3, payload3.a());
                }
            } catch (Exception e) {
                B b = B.b;
                String message = "Failed to download base64 data: " + a + ". Error: " + e;
                b.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                b.a(A.CRITICAL, message);
            }
        }
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.b.registerReceiver(this.h, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 2);
        } else {
            this.b.registerReceiver(this.h, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
        }
    }

    public final void a(final C0073k c0073k) {
        if (!this.e) {
            b(c0073k);
            return;
        }
        final EditText editText = new EditText(this.b);
        editText.setSingleLine();
        editText.setText(c0073k.b);
        AlertDialog.Builder cancelable = new AlertDialog.Builder(this.b).setTitle(c0073k.a()).setMessage(this.b.getResources().getString(R.string.DOWNLOAD_DESCRIPTION)).setIcon(android.R.drawable.ic_dialog_info).setCancelable(true);
        Intrinsics.checkNotNullExpressionValue(cancelable, "Builder(activity)\n      …     .setCancelable(true)");
        AbstractC0025a.a(cancelable, editText).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.g$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                g.a(editText, c0073k, this, dialogInterface, i);
            }
        }).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.g$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                g.a(dialogInterface, i);
            }
        }).create().show();
    }

    public static final void a(EditText input, C0073k task, g this$0, DialogInterface dialogInterface, int i) {
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
