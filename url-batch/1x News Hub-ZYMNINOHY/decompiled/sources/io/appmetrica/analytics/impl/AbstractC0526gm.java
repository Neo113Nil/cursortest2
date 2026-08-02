package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.gm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0526gm {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f7416a = C2.b.F("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID);

    /* renamed from: b, reason: collision with root package name */
    public static final SystemTimeProvider f7417b = new SystemTimeProvider();

    /* renamed from: c, reason: collision with root package name */
    public static final K3 f7418c = new K3();

    public static final boolean a(String str) {
        return !(str == null || str.length() == 0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(C0603jm c0603jm, Collection collection, Map map, l2.a aVar) {
        boolean a3;
        if (collection != null && !collection.isEmpty() && !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                switch (str.hashCode()) {
                    case -1367801046:
                        if (!str.equals(StartupParamsCallback.APPMETRICA_UUID)) {
                            break;
                        } else {
                            a3 = a(c0603jm.f7666d);
                            if (a3) {
                                return false;
                            }
                        }
                    case 155670667:
                        if (!str.equals("appmetrica_get_ad_url")) {
                            break;
                        } else {
                            a3 = a(c0603jm.f7670i);
                            if (a3) {
                            }
                        }
                        break;
                    case 299713912:
                        if (!str.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)) {
                            break;
                        } else {
                            a3 = a(c0603jm.f7664b);
                            if (a3) {
                            }
                        }
                        break;
                    case 530949152:
                        if (!str.equals("appmetrica_clids")) {
                            break;
                        } else {
                            K3 k3 = f7418c;
                            H3 h3 = (H3) aVar.invoke();
                            k3.getClass();
                            a3 = K3.a(map, c0603jm, h3);
                            if (a3) {
                            }
                        }
                        break;
                    case 703740463:
                        if (!str.equals("appmetrica_report_ad_url")) {
                            break;
                        } else {
                            a3 = a(c0603jm.f7671j);
                            if (a3) {
                            }
                        }
                        break;
                    case 1117383061:
                        if (!str.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID)) {
                            break;
                        } else {
                            a3 = a(c0603jm.f7663a);
                            if (a3) {
                            }
                        }
                        break;
                }
                if (c0603jm.f7682w) {
                    return false;
                }
                if (f7417b.currentTimeSeconds() > c0603jm.o + c0603jm.z.f6054a) {
                    return false;
                }
            }
        }
        return true;
    }
}
