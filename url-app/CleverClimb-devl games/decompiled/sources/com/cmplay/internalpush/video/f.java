package com.cmplay.internalpush.video;

import android.app.Activity;
import android.content.Context;
import com.cmplay.internalpush.data.SmallVideoParseCloudData;
import com.cmplay.internalpush.o;
import com.cmplay.internalpush.s;

/* compiled from: SmallVideoResult.java */
/* loaded from: classes.dex */
public class f extends h {

    /* renamed from: a, reason: collision with root package name */
    public static Context f4378a;

    /* renamed from: b, reason: collision with root package name */
    public static com.cmplay.internalpush.video.b.a f4379b;
    private static com.cmplay.internalpush.video.b.c f;
    private static com.cmplay.internalpush.video.b.d g;

    public static void a(Context context, boolean z, com.cmplay.internalpush.video.b.a aVar) {
        f4379b = aVar;
        f4378a = context;
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
            SmallVideoParseCloudData.a(f4378a).a(dVar);
        }
    }

    public static void a(com.cmplay.internalpush.video.b.c cVar) {
        if (cVar != null) {
            f = cVar;
        }
    }

    public static void a() {
        if (f4378a == null) {
            return;
        }
        com.cmplay.base.util.h.a("通知到了-----" + f4379b);
        if (f4379b != null) {
            SmallVideoParseCloudData.a(f4378a).a(f4379b.b("section_small_video"), f4379b, f);
        }
    }

    public static boolean a(int i, boolean z) {
        if (z) {
            o.a().a(8, 19, "", 0L, "", 0, 0, 0L);
        }
        boolean b2 = SmallVideoParseCloudData.a(f4378a).b(i);
        if (z && !b2) {
            SmallVideoParseCloudData.a(f4378a).b(0L);
        }
        return b2;
    }

    public static boolean a(final Activity activity, final int i, final int i2, final int i3, final int i4, final int i5) {
        if (g == null) {
            g = new com.cmplay.internalpush.video.b.d() { // from class: com.cmplay.internalpush.video.f.1
                @Override // com.cmplay.internalpush.video.b.d
                public void c() {
                }

                @Override // com.cmplay.internalpush.video.b.d
                public void c(String str) {
                }

                @Override // com.cmplay.internalpush.video.b.d
                public void d() {
                }

                @Override // com.cmplay.internalpush.video.b.d
                public void a(boolean z) {
                    if (s.a().b()) {
                        return;
                    }
                    com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData    播放完成， 开始下一个展示");
                    SmallVideoParseCloudData.a(f.f4378a).a(activity, i, i2, i3, i4, i5);
                }
            };
        }
        a(g);
        return SmallVideoParseCloudData.a(f4378a).a(activity, i, i2, i3, i4, i5);
    }
}
