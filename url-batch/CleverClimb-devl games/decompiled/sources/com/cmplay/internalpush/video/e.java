package com.cmplay.internalpush.video;

import android.content.Context;
import com.cmplay.internalpush.data.ParseCloudDataVideo;
import com.cmplay.internalpush.o;

/* compiled from: InnerPushVideoManager.java */
/* loaded from: classes.dex */
public class e extends h {

    /* renamed from: a, reason: collision with root package name */
    public static Context f4376a;

    /* renamed from: b, reason: collision with root package name */
    public static com.cmplay.internalpush.video.b.a f4377b;
    private static com.cmplay.internalpush.video.b.c f;

    public static void a(Context context, boolean z, com.cmplay.internalpush.video.b.a aVar) {
        f4377b = aVar;
        f4376a = context;
        com.cmplay.internalpush.a.d.a(context);
        com.cmplay.internalpush.a.e.a(context);
        com.cmplay.internalpush.video.a.b.a().a(context);
        h.f4392d = z;
    }

    public static void a(Context context, boolean z, com.cmplay.internalpush.video.b.a aVar, com.cmplay.base.util.c.c cVar) {
        a(context, z, aVar);
        a(cVar);
    }

    public static void a(com.cmplay.internalpush.video.b.d dVar) {
        if (dVar != null) {
            ParseCloudDataVideo.a(f4376a).a(dVar);
        }
    }

    public static void a(com.cmplay.internalpush.video.b.c cVar) {
        if (cVar != null) {
            f = cVar;
        }
    }

    public static void a() {
        if (f4376a == null) {
            return;
        }
        com.cmplay.base.util.h.a("通知到了-----" + f4377b);
        if (f4377b != null) {
            ParseCloudDataVideo.a(f4376a).a(f4377b.b("section_video_distribution"), f4377b, f);
        }
    }

    public static boolean a(int i, boolean z) {
        if (z) {
            o.a().a(4, 19, "", 0L, "", 0, 0, 0L);
        }
        boolean c2 = ParseCloudDataVideo.a(f4376a).c(i);
        if (z && !c2) {
            ParseCloudDataVideo.a(f4376a).b(0L);
        }
        return c2;
    }

    public static boolean b(int i, boolean z) {
        if (z) {
            o.a().a(4, 19, "", 0L, "", 0, 0, 999L);
        }
        boolean d2 = ParseCloudDataVideo.a(f4376a).d(i);
        if (z && !d2) {
            ParseCloudDataVideo.a(f4376a).b(999L);
        }
        return d2;
    }

    public static boolean a(int i) {
        return ParseCloudDataVideo.a(f4376a).b(i);
    }
}
