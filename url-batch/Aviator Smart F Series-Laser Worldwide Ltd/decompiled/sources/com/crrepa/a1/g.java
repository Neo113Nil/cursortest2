package com.crrepa.a1;

import com.crrepa.ble.conn.bean.CRPWatchFaceInfo;
import com.crrepa.ble.conn.listener.CRPWatchFaceTransListener;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static f f10851a;

    /* renamed from: b, reason: collision with root package name */
    private static com.crrepa.s0.c f10852b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10853a;

        static {
            int[] iArr = new int[CRPWatchFaceInfo.WacthFaceType.values().length];
            f10853a = iArr;
            try {
                iArr[CRPWatchFaceInfo.WacthFaceType.SIFLI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10853a[CRPWatchFaceInfo.WacthFaceType.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10853a[CRPWatchFaceInfo.WacthFaceType.JIELI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private g() {
    }

    private static f a(CRPWatchFaceInfo.WacthFaceType wacthFaceType) {
        int i8 = a.f10853a[wacthFaceType.ordinal()];
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? f10851a : new b() : new f() : new e();
    }

    public static f b() {
        return f10851a;
    }

    public static void c() {
        f10851a = null;
        f10852b = null;
    }

    public static void a() {
        f fVar = f10851a;
        if (fVar != null) {
            fVar.abort();
        }
        com.crrepa.s0.c cVar = f10852b;
        if (cVar != null) {
            cVar.abort();
        }
    }

    public static void a(CRPWatchFaceInfo cRPWatchFaceInfo, CRPWatchFaceTransListener cRPWatchFaceTransListener, int i8) {
        c();
        if (cRPWatchFaceInfo.getType() == CRPWatchFaceInfo.WacthFaceType.HISILICON) {
            com.crrepa.s0.c a8 = com.crrepa.s0.d.a().a((byte) 3);
            f10852b = a8;
            a8.a(cRPWatchFaceTransListener);
            f10852b.setTimeout(i8);
            f10852b.a(cRPWatchFaceInfo.getFile());
            return;
        }
        f a9 = a(cRPWatchFaceInfo.getType());
        f10851a = a9;
        a9.a(cRPWatchFaceTransListener);
        f10851a.setTimeout(i8);
        f10851a.a(cRPWatchFaceInfo.getFile());
    }
}
