package com.cmplay.internalpush;

import android.content.Context;
import android.graphics.Bitmap;
import com.cmplay.base.util.webview.ui.WebViewActivity;
import com.cmplay.base.util.x;
import com.unity3d.player.UnityPlayer;

/* compiled from: CMPPromotionVideoCallBack.java */
/* loaded from: classes.dex */
public class e implements com.cmplay.base.util.c.c, com.cmplay.internalpush.video.b.a, com.cmplay.internalpush.video.b.c, com.cmplay.internalpush.video.b.d {

    /* renamed from: a, reason: collision with root package name */
    private Context f4249a;

    /* renamed from: b, reason: collision with root package name */
    private m f4250b = null;

    @Override // com.cmplay.internalpush.video.b.d
    public void d() {
    }

    /* compiled from: CMPPromotionVideoCallBack.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static e f4253a = new e();
    }

    public static e a() {
        return a.f4253a;
    }

    @Override // com.cmplay.internalpush.video.b.a
    public String b(String str) {
        return com.ijinshan.cloudconfig.a.b(com.cmplay.base.util.j.c(), str);
    }

    @Override // com.cmplay.base.util.b.a
    public void a(String str, String str2, boolean z) {
        f.a(str, str2, z);
        com.cmplay.base.util.h.a("视频埋点：" + str2);
    }

    @Override // com.cmplay.base.util.c.c
    public void a(String str, final com.cmplay.base.util.c.b bVar) {
        com.cmplay.base.util.c.d.a(f.r).a(str, new com.cmplay.base.util.c.b() { // from class: com.cmplay.internalpush.e.1
            @Override // com.cmplay.base.util.c.b
            public void a(String str2, String str3) {
                bVar.a(str2, str3);
            }

            @Override // com.cmplay.base.util.c.b
            public void a(Bitmap bitmap, String str2, String str3) {
                bVar.a(bitmap, str2, str3);
            }
        });
    }

    @Override // com.cmplay.base.util.b.a
    public boolean a(String str) {
        com.cmplay.base.util.h.a("zzb", "innerPushJumpWebView --> " + str);
        WebViewActivity.StartWebViewActivity(f.r, str, 0);
        return true;
    }

    @Override // com.cmplay.base.util.b.a
    public void a(int i) {
        com.cmplay.base.util.h.a("zzb", "CMPPromotionVideoCallBack.onDataUpdate  sceneType:" + i);
    }

    public void a(Context context) {
        if (x.b()) {
            this.f4249a = context.getApplicationContext();
            com.cmplay.internalpush.video.e.a((com.cmplay.internalpush.video.b.c) this);
            com.cmplay.internalpush.video.e.a((com.cmplay.internalpush.video.b.d) this);
            com.cmplay.internalpush.video.f.a((com.cmplay.internalpush.video.b.c) this);
            com.cmplay.internalpush.video.f.a((com.cmplay.internalpush.video.b.d) this);
            com.cmplay.internalpush.video.g.a((com.cmplay.internalpush.video.b.c) this);
            com.cmplay.internalpush.video.g.a((com.cmplay.internalpush.video.b.d) this);
        }
    }

    @Override // com.cmplay.internalpush.video.b.c
    public void b() {
        f.s = true;
        try {
            if (d.c()) {
                UnityPlayer.UnitySendMessage(com.cmplay.base.util.j.b(), "onLoadSuccess", "");
            }
        } catch (Throwable unused) {
        }
        new com.cmplay.a.d().a(2, 2, 0, 1, 99);
    }

    @Override // com.cmplay.internalpush.video.b.c
    public void a(int i, String str) {
        try {
            if (d.c()) {
                UnityPlayer.UnitySendMessage(com.cmplay.base.util.j.b(), "onLoadError", str);
            }
        } catch (Throwable unused) {
        }
        new com.cmplay.a.d().a(2, 3, i, 1, 99);
    }

    @Override // com.cmplay.internalpush.video.b.d
    public void c() {
        try {
            if (d.c()) {
                UnityPlayer.UnitySendMessage(com.cmplay.base.util.j.b(), "onVideoShow", "");
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.cmplay.internalpush.video.b.d
    public void c(String str) {
        try {
            if (d.c()) {
                UnityPlayer.UnitySendMessage(com.cmplay.base.util.j.b(), "onVideoShowFail", str);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.cmplay.internalpush.video.b.d
    public void a(boolean z) {
        if (this.f4250b != null) {
            this.f4250b.a();
        }
        d.a(z);
    }
}
