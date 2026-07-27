package com.appsflyer.internal;

import android.graphics.Color;
import android.net.Uri;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class AFf1hSDK extends AFf1nSDK<Map<String, String>> {
    private final UUID afErrorLog;
    private String afInfoLog;
    private final AFe1ySDK force;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f5900i;
    public AFa1uSDK unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private String f5901v;

    /* renamed from: w, reason: collision with root package name */
    private String f5902w;

    public interface AFa1uSDK {
        void AFKeystoreWrapper(String str);

        void valueOf(Map<String, String> map);
    }

    public AFf1hSDK(AFd1kSDK aFd1kSDK, UUID uuid, Uri uri) {
        super(AFf1zSDK.ONELINK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1kSDK, uuid.toString());
        this.force = aFd1kSDK.AFInAppEventParameterName();
        this.afErrorLog = uuid;
        boolean z4 = false;
        try {
            if (!AFc1tSDK.values(uri.getHost()) && !AFc1tSDK.values(uri.getPath())) {
                try {
                    Object[] objArr = {uri, aFd1kSDK.afRDLog()};
                    Map<Integer, Object> map = AFc1fSDK.afDebugLog;
                    Object obj = map.get(-1014334364);
                    if (obj == null) {
                        obj = ((Class) AFc1fSDK.valueOf(36 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-1) - TextUtils.lastIndexOf("", '0', 0, 0), (char) TextUtils.indexOf("", "", 0, 0))).getDeclaredConstructor(Uri.class, AFc1vSDK.class);
                        map.put(-1014334364, obj);
                    }
                    Object newInstance = ((Constructor) obj).newInstance(objArr);
                    try {
                        Object obj2 = map.get(-1905680101);
                        if (obj2 == null) {
                            obj2 = ((Class) AFc1fSDK.valueOf(37 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) (ViewConfiguration.getEdgeSlop() >> 16))).getMethod("AFInAppEventType", null);
                            map.put(-1905680101, obj2);
                        }
                        Object invoke = ((Method) obj2).invoke(newInstance, null);
                        try {
                            Object obj3 = map.get(611290704);
                            if (obj3 == null) {
                                obj3 = ((Class) AFc1fSDK.valueOf(52 - Color.blue(0), (ViewConfiguration.getPressedStateDuration() >> 16) + 37, (char) (3794 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))))).getMethod("AFInAppEventParameterName", null);
                                map.put(611290704, obj3);
                            }
                            boolean booleanValue = ((Boolean) ((Method) obj3).invoke(invoke, null)).booleanValue();
                            try {
                                Object obj4 = map.get(574725959);
                                if (obj4 == null) {
                                    obj4 = ((Class) AFc1fSDK.valueOf((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 51, AndroidCharacter.getMirror('0') - 11, (char) (3794 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))))).getMethod("values", null);
                                    map.put(574725959, obj4);
                                }
                                z4 = ((Boolean) ((Method) obj4).invoke(invoke, null)).booleanValue();
                                String[] split = uri.getPath().split("/");
                                if (booleanValue && split.length == 3) {
                                    this.afInfoLog = split[1];
                                    this.f5901v = split[2];
                                    this.f5902w = uri.toString();
                                }
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
        } catch (Exception e4) {
            AFLogger.afErrorLogForExcManagerOnly("OneLinkValidator: reflection init failed", e4);
        }
        this.f5900i = z4;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        ResponseNetwork responseNetwork;
        super.AFInAppEventType();
        AFa1uSDK aFa1uSDK = this.unregisterClient;
        if (aFa1uSDK != null) {
            if (this.values == AFe1bSDK.SUCCESS && (responseNetwork = ((AFf1nSDK) this).registerClient) != null) {
                aFa1uSDK.valueOf((Map) responseNetwork.getBody());
                return;
            }
            Throwable unregisterClient = unregisterClient();
            if (!(unregisterClient instanceof ParsingException)) {
                String str = this.f5902w;
                aFa1uSDK.AFKeystoreWrapper(str != null ? str : "Can't get OneLink data");
            } else if (((ParsingException) unregisterClient).getRawResponse().isSuccessful()) {
                aFa1uSDK.AFKeystoreWrapper("Can't parse one link data");
            } else {
                String str2 = this.f5902w;
                aFa1uSDK.AFKeystoreWrapper(str2 != null ? str2 : "Can't get OneLink data");
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AFe1sSDK<Map<String, String>> AFKeystoreWrapper(String str) {
        return this.force.AFKeystoreWrapper(this.afInfoLog, this.f5901v, this.afErrorLog, str);
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean a_() {
        return false;
    }

    public final boolean afInfoLog() {
        return this.f5900i;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean i() {
        return false;
    }

    public final boolean v() {
        return (TextUtils.isEmpty(this.afInfoLog) || TextUtils.isEmpty(this.f5901v) || this.afInfoLog.equals("app")) ? false : true;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }
}
