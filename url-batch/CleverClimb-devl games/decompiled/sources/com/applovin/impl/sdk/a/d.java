package com.applovin.impl.sdk.a;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.applovin.impl.adview.k;
import com.applovin.impl.sdk.j;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final j f2935a;

    /* renamed from: b, reason: collision with root package name */
    private final k f2936b;

    /* renamed from: c, reason: collision with root package name */
    private AlertDialog f2937c;

    public d(k kVar, j jVar) {
        this.f2935a = jVar;
        this.f2936b = kVar;
    }

    public void a() {
        this.f2936b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.a.d.1
            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f2937c != null) {
                    d.this.f2937c.dismiss();
                }
            }
        });
    }

    public void b() {
        this.f2936b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.a.d.2
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(d.this.f2936b);
                builder.setTitle((CharSequence) d.this.f2935a.a(com.applovin.impl.sdk.b.b.bI));
                builder.setMessage((CharSequence) d.this.f2935a.a(com.applovin.impl.sdk.b.b.bJ));
                builder.setCancelable(false);
                builder.setPositiveButton((CharSequence) d.this.f2935a.a(com.applovin.impl.sdk.b.b.bL), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.a.d.2.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        d.this.f2936b.continueVideo();
                        d.this.f2936b.resumeReportRewardTask();
                    }
                });
                builder.setNegativeButton((CharSequence) d.this.f2935a.a(com.applovin.impl.sdk.b.b.bK), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.a.d.2.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        d.this.f2936b.skipVideo();
                        d.this.f2936b.resumeReportRewardTask();
                    }
                });
                d.this.f2937c = builder.show();
            }
        });
    }

    public void c() {
        this.f2936b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.a.d.3
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(d.this.f2936b);
                builder.setTitle((CharSequence) d.this.f2935a.a(com.applovin.impl.sdk.b.b.bN));
                builder.setMessage((CharSequence) d.this.f2935a.a(com.applovin.impl.sdk.b.b.bO));
                builder.setCancelable(false);
                builder.setPositiveButton((CharSequence) d.this.f2935a.a(com.applovin.impl.sdk.b.b.bQ), (DialogInterface.OnClickListener) null);
                builder.setNegativeButton((CharSequence) d.this.f2935a.a(com.applovin.impl.sdk.b.b.bP), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.a.d.3.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        d.this.f2936b.dismiss();
                    }
                });
                d.this.f2937c = builder.show();
            }
        });
    }

    public boolean d() {
        if (this.f2937c != null) {
            return this.f2937c.isShowing();
        }
        return false;
    }
}
