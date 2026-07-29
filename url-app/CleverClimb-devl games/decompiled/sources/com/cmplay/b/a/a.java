package com.cmplay.b.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v4.content.FileProvider;
import android.text.TextUtils;
import android.util.Log;
import com.cmplay.b.f;
import com.cmplay.b.g;
import com.dancingbogo.skyrolline.R;
import java.io.File;

/* compiled from: DefaultPlatform.java */
/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: c, reason: collision with root package name */
    private long f3903c;

    /* renamed from: d, reason: collision with root package name */
    private f f3904d;

    public a(Context context) {
        super(context);
    }

    @Override // com.cmplay.b.a.c
    public void a(f fVar) {
        Uri fromFile;
        this.f3904d = fVar;
        Intent intent = new Intent("android.intent.action.SEND");
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(fVar.b())) {
            sb.append(fVar.b());
        }
        if (fVar.a() != null) {
            if (sb.length() > 0) {
                sb.append("#RollingSky");
                sb.append("->");
            }
            sb.append(fVar.a());
        }
        String sb2 = sb.toString();
        intent.putExtra("sms_body", sb2);
        intent.putExtra("Kdescription", sb2);
        intent.setType("text/plain");
        String c2 = fVar.c();
        if (!TextUtils.isEmpty(c2)) {
            File file = new File(c2);
            if (file.exists() && file.isFile()) {
                intent.setType("image/*");
                if (Build.VERSION.SDK_INT >= 24) {
                    fromFile = FileProvider.getUriForFile(this.f3912b, "com.dancingbogo.skyrolline.provider", file);
                } else {
                    fromFile = Uri.fromFile(file);
                    intent.putExtra("android.intent.extra.TEXT", sb2);
                }
                intent.putExtra("android.intent.extra.STREAM", fromFile);
            }
        }
        intent.setFlags(268435456);
        com.dancingbogo.skyrolline.util.d.a((Activity) this.f3912b, Intent.createChooser(intent, this.f3912b.getResources().getString(R.string.share_title)), 1001);
        this.f3903c = System.currentTimeMillis();
        String a2 = com.cmplay.b.b.a(this.f3904d.g());
        a("clk_system_share");
        a("clk_system_share" + a2);
        g.a().a(com.cmplay.b.b.b(this.f3904d.g()), com.cmplay.b.b.d(), com.cmplay.b.b.a(this.f3904d.g(), this.f3904d.f()), 2);
    }

    @Override // com.cmplay.b.d
    public void a(int i, int i2, Intent intent) {
        if (i != 1001) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DefaultPlatform onActivityResult result code is ");
        sb.append(i2);
        sb.append(",data=null is ");
        sb.append(intent == null);
        Log.e("MMM", sb.toString());
        String a2 = com.cmplay.b.b.a(this.f3904d.g());
        int b2 = com.cmplay.b.b.b(this.f3904d.g());
        int d2 = com.cmplay.b.b.d();
        int a3 = com.cmplay.b.b.a(this.f3904d.g(), this.f3904d.f());
        if (System.currentTimeMillis() - this.f3903c > 4000) {
            a(5, 1);
            a("at_sys_share_valid");
            a("at_sys_share_valid" + a2);
            g.a().a(b2, d2, a3, 3);
        } else {
            a(5, 2);
            a("at_sys_share_invalid");
            a("at_sys_share_invalid" + a2);
            g.a().a(b2, d2, a3, 4);
        }
        g.a().b(this);
        b();
    }
}
