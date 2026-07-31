package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* renamed from: io.appmetrica.analytics.impl.cm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2553cm {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f38791a = kotlin.collections.T.h("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID);

    /* renamed from: b, reason: collision with root package name */
    public static final SystemTimeProvider f38792b = new SystemTimeProvider();

    /* renamed from: c, reason: collision with root package name */
    public static final Y3 f38793c = new Y3();

    public static final boolean a(String str) {
        return !(str == null || str.length() == 0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(C2633fm c2633fm, Collection collection, Map map, Function0 function0) {
        boolean a4;
        if (collection != null && !collection.isEmpty() && !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                switch (str.hashCode()) {
                    case -1367801046:
                        if (!str.equals(StartupParamsCallback.APPMETRICA_UUID)) {
                            break;
                        } else {
                            a4 = a(c2633fm.f38982d);
                            if (a4) {
                                return false;
                            }
                        }
                    case 155670667:
                        if (!str.equals("appmetrica_get_ad_url")) {
                            break;
                        } else {
                            a4 = a(c2633fm.f38987i);
                            if (a4) {
                            }
                        }
                        break;
                    case 299713912:
                        if (!str.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)) {
                            break;
                        } else {
                            a4 = a(c2633fm.f38980b);
                            if (a4) {
                            }
                        }
                        break;
                    case 530949152:
                        if (!str.equals("appmetrica_clids")) {
                            break;
                        } else {
                            Y3 y32 = f38793c;
                            V3 v32 = (V3) function0.invoke();
                            y32.getClass();
                            a4 = Y3.a(map, c2633fm, v32);
                            if (a4) {
                            }
                        }
                        break;
                    case 703740463:
                        if (!str.equals("appmetrica_report_ad_url")) {
                            break;
                        } else {
                            a4 = a(c2633fm.f38988j);
                            if (a4) {
                            }
                        }
                        break;
                    case 1117383061:
                        if (!str.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID)) {
                            break;
                        } else {
                            a4 = a(c2633fm.f38979a);
                            if (a4) {
                            }
                        }
                        break;
                }
                if (c2633fm.f39001w) {
                    return false;
                }
                if (f38792b.currentTimeSeconds() > c2633fm.f38993o + c2633fm.f38976A.f37383a) {
                    return false;
                }
            }
        }
        return true;
    }
}
