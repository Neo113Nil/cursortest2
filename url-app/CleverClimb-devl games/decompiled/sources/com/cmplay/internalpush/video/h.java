package com.cmplay.internalpush.video;

import android.content.BroadcastReceiver;
import android.graphics.Bitmap;
import com.cmplay.internalpush.ipc.IpcVideoHelper;

/* compiled from: VideoManagerBase.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static com.cmplay.base.util.c.c f4390a = null;

    /* renamed from: c, reason: collision with root package name */
    protected static CloudVideoReceiver f4391c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f4392d = false;
    public static boolean e = true;

    public static void a(com.cmplay.base.util.c.c cVar) {
        f4390a = cVar;
    }

    public static com.cmplay.base.util.c.c b() {
        return f4390a;
    }

    public static BroadcastReceiver c() {
        if (f4391c == null) {
            f4391c = new CloudVideoReceiver();
        }
        return f4391c;
    }

    public static synchronized void a(String str) {
        synchronized (h.class) {
            if (b() != null) {
                b().a(str, new com.cmplay.base.util.c.b() { // from class: com.cmplay.internalpush.video.h.1
                    @Override // com.cmplay.base.util.c.b
                    public void a(String str2, String str3) {
                        com.cmplay.base.util.h.a("视频图片下载失败!  errorCode:" + str3);
                    }

                    @Override // com.cmplay.base.util.c.b
                    public void a(Bitmap bitmap, String str2, String str3) {
                        com.cmplay.base.util.h.a("视频图片下载成功--!");
                    }
                });
            }
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        try {
            com.cmplay.internalpush.video.a.b.a().a(str, str2);
            a(str3);
            a(str4);
        } catch (Exception e2) {
            e2.printStackTrace();
            com.cmplay.base.util.h.a("zzb", "startServiceLoadData 异常------- " + e2.getMessage());
        }
    }

    public static void b(String str, String str2, String str3, String str4) {
        IpcVideoHelper.getInstance().ipcServiceStartDown(str, str2, str3, str4);
    }
}
