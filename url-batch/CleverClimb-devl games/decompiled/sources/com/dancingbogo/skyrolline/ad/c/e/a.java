package com.dancingbogo.skyrolline.ad.c.e;

import android.app.Activity;
import com.cmplay.internalpush.video.b.d;
import com.cmplay.internalpush.video.e;
import com.dancingbogo.skyrolline.ad.a.b;

/* compiled from: InnerPushVideoAds.java */
/* loaded from: classes2.dex */
public class a extends com.dancingbogo.skyrolline.ad.a.a {

    /* renamed from: a, reason: collision with root package name */
    private b f4521a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4522b = false;

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onResume(Activity activity) {
    }

    /* compiled from: InnerPushVideoAds.java */
    /* renamed from: com.dancingbogo.skyrolline.ad.c.e.a$a, reason: collision with other inner class name */
    private static class C0333a {

        /* renamed from: a, reason: collision with root package name */
        private static a f4524a = new a();
    }

    public static a a() {
        return C0333a.f4524a;
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onCreate(Activity activity) {
        super.onCreate(activity);
        this.mContext = activity.getApplicationContext();
        e.a(new d() { // from class: com.dancingbogo.skyrolline.ad.c.e.a.1
            @Override // com.cmplay.internalpush.video.b.d
            public void d() {
            }

            @Override // com.cmplay.internalpush.video.b.d
            public void c() {
                if (a.this.f4521a != null) {
                    a.this.f4521a.a();
                    com.dancingbogo.skyrolline.util.b.a("zzb", "开始播放");
                }
            }

            @Override // com.cmplay.internalpush.video.b.d
            public void c(String str) {
                if (a.this.f4521a != null) {
                    a.this.f4521a.a(true);
                    com.dancingbogo.skyrolline.util.b.a("zzb", "播放失败:" + str);
                }
            }

            @Override // com.cmplay.internalpush.video.b.d
            public void a(boolean z) {
                if (a.this.f4521a != null) {
                    a.this.f4521a.a(!z);
                    com.dancingbogo.skyrolline.util.b.a("zzb", "播放完成");
                }
            }
        });
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public boolean canShow(int i) {
        if (this.f4522b) {
            return com.cmplay.internalpush.b.d(i, com.dancingbogo.skyrolline.ad.a.k);
        }
        return com.cmplay.internalpush.b.c(i, com.dancingbogo.skyrolline.ad.a.k);
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public boolean show(int i) {
        return com.cmplay.internalpush.b.a(i);
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void setListener(b bVar) {
        this.f4521a = bVar;
    }

    public void a(boolean z) {
        this.f4522b = z;
    }
}
