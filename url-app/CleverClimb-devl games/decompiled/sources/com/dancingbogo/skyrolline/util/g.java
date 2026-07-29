package com.dancingbogo.skyrolline.util;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.text.TextUtils;
import com.aiming.mdt.utils.Constants;
import com.dancingbogo.skyrolline.GameApp;
import java.util.zip.CRC32;

/* compiled from: Helper.java */
/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    protected static GLSurfaceView f4615a;

    /* renamed from: b, reason: collision with root package name */
    protected static Handler f4616b;

    public static void a(Runnable runnable) {
        if (f4615a != null) {
            f4615a.queueEvent(runnable);
        }
    }

    public static void a(String str) {
        try {
            if (GameApp.f4485a.getPackageManager().getPackageInfo(Constants.PKG_FB, 0).versionCode >= 3002850) {
                d.a(GameApp.f4485a, new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=" + str)));
            } else {
                d.a(GameApp.f4485a, new Intent("android.intent.action.VIEW", Uri.parse(str)));
            }
        } catch (PackageManager.NameNotFoundException unused) {
            d.a(GameApp.f4485a, new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }
    }

    public static int a() {
        String a2 = d.a(GameApp.f4485a);
        if (TextUtils.isEmpty(a2)) {
            return 0;
        }
        CRC32 crc32 = new CRC32();
        crc32.update(a2.getBytes());
        return (int) (crc32.getValue() % 2);
    }

    public static boolean b() {
        return d.b(Constants.PKG_FB);
    }
}
