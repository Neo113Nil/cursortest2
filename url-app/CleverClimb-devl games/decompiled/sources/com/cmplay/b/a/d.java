package com.cmplay.b.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.cmplay.b.f;
import com.cmplay.b.g;
import java.io.File;

/* compiled from: TwitterPlatform.java */
/* loaded from: classes.dex */
public class d extends c implements com.cmplay.b.d {

    /* renamed from: c, reason: collision with root package name */
    private String f3913c;

    /* renamed from: d, reason: collision with root package name */
    private String f3914d;
    private Uri e;
    private f f;

    public d(Context context) {
        super(context, com.cmplay.b.a.Twitter);
    }

    @Override // com.cmplay.b.a.c
    public void a(f fVar) {
        this.f = fVar;
        this.f3913c = fVar.b();
        this.f3914d = fVar.a();
        if (!TextUtils.isEmpty(fVar.c())) {
            this.e = Uri.fromFile(new File(fVar.c()));
        }
        com.dancingbogo.skyrolline.util.d.a((Activity) this.f3912b, c(), 1000);
        String a2 = com.cmplay.b.b.a(this.f.g());
        com.cmplay.b.b.a().a("clk_twitter_share");
        com.cmplay.b.b.a().a("clk_twitter_share" + a2);
        g.a().a(com.cmplay.b.b.b(this.f.g()), com.cmplay.b.b.d(), com.cmplay.b.b.a(this.f.g(), this.f.f()), 2);
    }

    public Intent c() {
        return d();
    }

    Intent d() {
        Intent intent = new Intent("android.intent.action.SEND");
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f3913c)) {
            sb.append(this.f3913c);
        }
        if (this.f3914d != null) {
            if (sb.length() > 0) {
                sb.append("->");
            }
            sb.append(this.f3914d.toString());
        }
        intent.putExtra("android.intent.extra.TEXT", sb.toString());
        intent.setType("text/plain");
        if (this.e != null) {
            intent.putExtra("android.intent.extra.STREAM", this.e);
            intent.setType("image/*");
        }
        intent.setClassName(this.f3911a.a(), this.f3911a.b());
        return intent;
    }

    @Override // com.cmplay.b.d
    public void a(int i, int i2, Intent intent) {
        if (i != 1000) {
            return;
        }
        String a2 = com.cmplay.b.b.a(this.f.g());
        int b2 = com.cmplay.b.b.b(this.f.g());
        int d2 = com.cmplay.b.b.d();
        int a3 = com.cmplay.b.b.a(this.f.g(), this.f.f());
        if (i2 == -1) {
            a(4, 1);
            com.cmplay.b.b.a().a("at_twitter_share_success");
            com.cmplay.b.b.a().a("at_twitter_share_success" + a2);
            g.a().a(b2, d2, a3, 3);
        } else {
            a(4, 0);
            com.cmplay.b.b.a().a("at_twitter_share_faild");
            com.cmplay.b.b.a().a("at_twitter_share_faild" + a2);
            g.a().a(b2, d2, a3, 4);
        }
        g.a().b(this);
        b();
    }
}
