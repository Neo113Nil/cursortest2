package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;

/* loaded from: classes.dex */
final class zf0 implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f15101a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f15102b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bg0 f15103c;

    zf0(bg0 bg0Var, String str, String str2) {
        this.f15103c = bg0Var;
        this.f15101a = str;
        this.f15102b = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        Context context;
        context = this.f15103c.f3418d;
        DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
        try {
            String str = this.f15101a;
            String str2 = this.f15102b;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            y2.t.q();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f15103c.c("Could not store picture.");
        }
    }
}
