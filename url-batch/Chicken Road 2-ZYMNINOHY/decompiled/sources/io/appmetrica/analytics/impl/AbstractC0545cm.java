package io.appmetrica.analytics.impl;

import i2.AbstractC0457a;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o3.InterfaceC1328a;

/* renamed from: io.appmetrica.analytics.impl.cm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0545cm {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f11632a = AbstractC0457a.B("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID);

    /* renamed from: b, reason: collision with root package name */
    public static final SystemTimeProvider f11633b = new SystemTimeProvider();

    /* renamed from: c, reason: collision with root package name */
    public static final C3 f11634c = new C3();

    public static final boolean a(String str) {
        return !(str == null || str.length() == 0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(C0622fm c0622fm, Collection collection, Map map, InterfaceC1328a interfaceC1328a) {
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
                            a3 = a(c0622fm.f11863d);
                            if (a3) {
                                return false;
                            }
                        }
                    case 155670667:
                        if (!str.equals("appmetrica_get_ad_url")) {
                            break;
                        } else {
                            a3 = a(c0622fm.f11868i);
                            if (a3) {
                            }
                        }
                        break;
                    case 299713912:
                        if (!str.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)) {
                            break;
                        } else {
                            a3 = a(c0622fm.f11861b);
                            if (a3) {
                            }
                        }
                        break;
                    case 530949152:
                        if (!str.equals("appmetrica_clids")) {
                            break;
                        } else {
                            C3 c32 = f11634c;
                            C1121z3 c1121z3 = (C1121z3) interfaceC1328a.invoke();
                            c32.getClass();
                            a3 = C3.a(map, c0622fm, c1121z3);
                            if (a3) {
                            }
                        }
                        break;
                    case 703740463:
                        if (!str.equals("appmetrica_report_ad_url")) {
                            break;
                        } else {
                            a3 = a(c0622fm.f11869j);
                            if (a3) {
                            }
                        }
                        break;
                    case 1117383061:
                        if (!str.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID)) {
                            break;
                        } else {
                            a3 = a(c0622fm.f11860a);
                            if (a3) {
                            }
                        }
                        break;
                }
                if (c0622fm.f11879w) {
                    return false;
                }
                if (f11633b.currentTimeSeconds() > c0622fm.o + c0622fm.z.f10172a) {
                    return false;
                }
            }
        }
        return true;
    }
}
