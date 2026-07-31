package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;

/* renamed from: io.appmetrica.analytics.impl.dm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0132dm {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f1223a = SetsKt.setOf((Object[]) new String[]{"appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID});
    public static final SystemTimeProvider b = new SystemTimeProvider();
    public static final D3 c = new D3();

    public static final boolean a(String str) {
        return !(str == null || str.length() == 0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(C0209gm c0209gm, Collection collection, Map map, Function0 function0) {
        boolean a2;
        if (collection != null && !collection.isEmpty() && !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                switch (str.hashCode()) {
                    case -1367801046:
                        if (!str.equals(StartupParamsCallback.APPMETRICA_UUID)) {
                            break;
                        } else {
                            a2 = a(c0209gm.d);
                            if (a2) {
                                return false;
                            }
                        }
                    case 155670667:
                        if (!str.equals("appmetrica_get_ad_url")) {
                            break;
                        } else {
                            a2 = a(c0209gm.i);
                            if (a2) {
                            }
                        }
                        break;
                    case 299713912:
                        if (!str.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)) {
                            break;
                        } else {
                            a2 = a(c0209gm.b);
                            if (a2) {
                            }
                        }
                        break;
                    case 530949152:
                        if (!str.equals("appmetrica_clids")) {
                            break;
                        } else {
                            D3 d3 = c;
                            A3 a3 = (A3) function0.invoke();
                            d3.getClass();
                            a2 = D3.a(map, c0209gm, a3);
                            if (a2) {
                            }
                        }
                        break;
                    case 703740463:
                        if (!str.equals("appmetrica_report_ad_url")) {
                            break;
                        } else {
                            a2 = a(c0209gm.j);
                            if (a2) {
                            }
                        }
                        break;
                    case 1117383061:
                        if (!str.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID)) {
                            break;
                        } else {
                            a2 = a(c0209gm.f1277a);
                            if (a2) {
                            }
                        }
                        break;
                }
                if (c0209gm.w) {
                    return false;
                }
                if (b.currentTimeSeconds() > c0209gm.o + c0209gm.z.f816a) {
                    return false;
                }
            }
        }
        return true;
    }
}
