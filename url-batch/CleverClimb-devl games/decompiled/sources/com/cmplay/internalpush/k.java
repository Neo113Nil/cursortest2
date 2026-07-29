package com.cmplay.internalpush;

import android.content.Context;
import android.text.TextUtils;
import com.cmplay.base.util.x;
import com.cmplay.internalpush.data.ParseCloudDataVideo;
import com.cmplay.internalpush.data.SmallVideoParseCloudData;
import com.cmplay.internalpush.data.SmallVideoSettingParseCloudData;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: InternalPushManager.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static Context f4264a;

    /* renamed from: b, reason: collision with root package name */
    public static CloudUpdateReceiver f4265b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f4266c;
    private static ArrayList<String> g = new ArrayList<>();
    private static boolean h = false;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f4267d = false;
    public static boolean e = false;
    public static h f = null;

    public static h a() {
        return f;
    }

    public static void a(Context context, h hVar) {
        com.cmplay.base.util.h.b("zzb_pro", "Openscreen init2");
        f4264a = context.getApplicationContext();
        f = hVar;
        if (f == null) {
            throw new RuntimeException("error: innerPushCallBack is null");
        }
        com.cmplay.internalpush.a.a.b.a().a(f4264a);
        f.a(g);
        Iterator<String> it = g.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (TextUtils.equals(next, "open_screen_scene")) {
                com.cmplay.internalpush.data.m.a(context);
            } else if (TextUtils.equals(next, "section_result_card")) {
                com.cmplay.internalpush.data.o.a(context);
            } else if (TextUtils.equals(next, "section_setting_card")) {
                com.cmplay.internalpush.data.p.a(context);
                f4267d = true;
            } else if (TextUtils.equals(next, "insert_screen_scene")) {
                com.cmplay.internalpush.data.j.a(context);
            } else if (TextUtils.equals(next, "section_family_popup")) {
                com.cmplay.internalpush.data.b.a(context);
                e = true;
            } else if (TextUtils.equals(next, "section_video_distribution")) {
                ParseCloudDataVideo.a(context);
            } else if (TextUtils.equals(next, "section_small_video")) {
                SmallVideoParseCloudData.a(context);
            } else if (TextUtils.equals(next, "section_small_video_setting")) {
                SmallVideoSettingParseCloudData.a(context);
            }
        }
        b();
        if (x.b()) {
            int a2 = com.cmplay.internalpush.a.d.a("launch_time", 0);
            com.cmplay.internalpush.a.d.b("launch_time", a2 + 1);
            com.cmplay.internalpush.a.d.b("app_launch_time", com.cmplay.internalpush.a.d.a("app_launch_time", 0) + 1);
            int a3 = com.cmplay.internalpush.a.d.a("hit_top_launch_time", 0);
            com.cmplay.internalpush.a.d.b("hit_top_launch_time", a3 + 1);
            com.cmplay.base.util.h.a("internal_push", "CMPlaySDK.init  LAUNCH_TIME   lastLaunchTime:" + a2 + "  curLaunchTime:" + com.cmplay.internalpush.a.d.a("launch_time", 0) + "    lastLaunchTimeOfHitTop:" + a3 + "  curLaunchTimeOfHitTop:" + com.cmplay.internalpush.a.d.a("hit_top_launch_time", 0));
        }
        h = true;
    }

    public static void b() {
        if (f4266c) {
            return;
        }
        f4265b = new CloudUpdateReceiver();
        g.a(f4265b);
        f4266c = true;
    }
}
