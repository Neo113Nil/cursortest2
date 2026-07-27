package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import t4.InterfaceC1430a;

/* renamed from: io.appmetrica.analytics.impl.gm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0677gm {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f8292a = e5.g.x("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID);

    /* renamed from: b, reason: collision with root package name */
    public static final SystemTimeProvider f8293b = new SystemTimeProvider();

    /* renamed from: c, reason: collision with root package name */
    public static final K3 f8294c = new K3();

    public static final boolean a(String str) {
        return !(str == null || str.length() == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(C0754jm c0754jm, Collection collection, Map map, InterfaceC1430a interfaceC1430a) {
        boolean a6;
        if (collection == null || collection.isEmpty() || collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            switch (str.hashCode()) {
                case -1367801046:
                    if (!str.equals(StartupParamsCallback.APPMETRICA_UUID)) {
                        if (c0754jm.f8581w) {
                            break;
                        } else {
                            if (f8293b.currentTimeSeconds() > c0754jm.f8573o + c0754jm.z.f6847a) {
                                break;
                            }
                        }
                    } else {
                        a6 = a(c0754jm.f8562d);
                        if (a6) {
                            break;
                        }
                    }
                case 155670667:
                    if (str.equals("appmetrica_get_ad_url")) {
                        a6 = a(c0754jm.f8567i);
                        if (a6) {
                        }
                    } else if (c0754jm.f8581w) {
                    }
                    break;
                case 299713912:
                    if (str.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)) {
                        a6 = a(c0754jm.f8560b);
                        if (a6) {
                        }
                    } else if (c0754jm.f8581w) {
                    }
                    break;
                case 530949152:
                    if (str.equals("appmetrica_clids")) {
                        K3 k3 = f8294c;
                        H3 h3 = (H3) interfaceC1430a.invoke();
                        k3.getClass();
                        a6 = K3.a(map, c0754jm, h3);
                        if (a6) {
                        }
                    } else if (c0754jm.f8581w) {
                    }
                    break;
                case 703740463:
                    if (str.equals("appmetrica_report_ad_url")) {
                        a6 = a(c0754jm.f8568j);
                        if (a6) {
                        }
                    } else if (c0754jm.f8581w) {
                    }
                    break;
                case 1117383061:
                    if (str.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID)) {
                        a6 = a(c0754jm.f8559a);
                        if (a6) {
                        }
                    } else if (c0754jm.f8581w) {
                    }
                    break;
                default:
                    if (c0754jm.f8581w) {
                    }
                    break;
            }
            return true;
        }
        return true;
    }
}
