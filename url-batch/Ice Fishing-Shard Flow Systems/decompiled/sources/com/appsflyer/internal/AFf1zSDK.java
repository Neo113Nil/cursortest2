package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class AFf1zSDK extends AFe1bSDK<Map<String, String>> {
    private final UUID AFLogger;
    public AFa1vSDK component2;
    private final AFd1mSDK copy;
    private String copydefault;
    private String equals;
    private String hashCode;
    private final boolean toString;

    public interface AFa1vSDK {
        void getMonetizationNetwork(Map<String, String> map);

        void getRevenue(String str);
    }

    public AFf1zSDK(AFd1zSDK aFd1zSDK, UUID uuid, Uri uri) {
        super(AFe1lSDK.ONELINK, new AFe1lSDK[]{AFe1lSDK.RC_CDN}, aFd1zSDK, uuid.toString());
        this.copy = aFd1zSDK.getRevenue();
        this.AFLogger = uuid;
        boolean z7 = false;
        try {
            if (!AFk1zSDK.getMediationNetwork(uri.getHost()) && !AFk1zSDK.getMediationNetwork(uri.getPath())) {
                try {
                    Object[] objArr = {uri, aFd1zSDK.i()};
                    Map map = AFa1kSDK.f4295i;
                    Object obj = map.get(-1523018365);
                    if (obj == null) {
                        obj = ((Class) AFa1kSDK.getMediationNetwork((char) (AndroidCharacter.getMirror('0') - '0'), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37, KeyEvent.normalizeMetaState(0))).getDeclaredConstructor(Uri.class, AFa1oSDK.class);
                        map.put(-1523018365, obj);
                    }
                    Object newInstance = ((Constructor) obj).newInstance(objArr);
                    try {
                        Object obj2 = map.get(275685916);
                        if (obj2 == null) {
                            obj2 = ((Class) AFa1kSDK.getMediationNetwork((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 37 - View.MeasureSpec.getSize(0), TextUtils.getCapsMode("", 0, 0))).getMethod("getMediationNetwork", null);
                            map.put(275685916, obj2);
                        }
                        Object invoke = ((Method) obj2).invoke(newInstance, null);
                        try {
                            Object obj3 = map.get(-1366801308);
                            if (obj3 == null) {
                                obj3 = ((Class) AFa1kSDK.getMediationNetwork((char) (44102 - (KeyEvent.getMaxKeyCode() >> 16)), 50 - (ViewConfiguration.getPressedStateDuration() >> 16), View.MeasureSpec.getSize(0) + 37)).getMethod("getMediationNetwork", null);
                                map.put(-1366801308, obj3);
                            }
                            boolean booleanValue = ((Boolean) ((Method) obj3).invoke(invoke, null)).booleanValue();
                            try {
                                Object obj4 = map.get(-1632086821);
                                if (obj4 == null) {
                                    obj4 = ((Class) AFa1kSDK.getMediationNetwork((char) ((-16733114) - Color.rgb(0, 0, 0)), 50 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), KeyEvent.keyCodeFromString("") + 37)).getMethod("getMonetizationNetwork", null);
                                    map.put(-1632086821, obj4);
                                }
                                z7 = ((Boolean) ((Method) obj4).invoke(invoke, null)).booleanValue();
                                String[] split = uri.getPath().split("/");
                                if (booleanValue && split.length == 3) {
                                    this.hashCode = split[1];
                                    this.copydefault = split[2];
                                    this.equals = uri.toString();
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
        } catch (Exception e7) {
            AFLogger.afErrorLogForExcManagerOnly("OneLinkValidator: reflection init failed", e7);
        }
        this.toString = z7;
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AppsFlyerRequestListener component1() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final boolean copy() {
        return false;
    }

    public final boolean copydefault() {
        return (TextUtils.isEmpty(this.hashCode) || TextUtils.isEmpty(this.copydefault) || this.hashCode.equals("app")) ? false : true;
    }

    public final boolean equals() {
        return this.toString;
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final void getMonetizationNetwork() {
        ResponseNetwork responseNetwork;
        super.getMonetizationNetwork();
        AFa1vSDK aFa1vSDK = this.component2;
        if (aFa1vSDK != null) {
            if (this.AFAdRevenueData == AFe1rSDK.SUCCESS && (responseNetwork = ((AFe1bSDK) this).component4) != null) {
                aFa1vSDK.getMonetizationNetwork((Map) responseNetwork.getBody());
                return;
            }
            Throwable component2 = component2();
            if (!(component2 instanceof ParsingException)) {
                String str = this.equals;
                aFa1vSDK.getRevenue(str != null ? str : "Can't get OneLink data");
            } else if (((ParsingException) component2).getRawResponse().isSuccessful()) {
                aFa1vSDK.getRevenue("Can't parse one link data");
            } else {
                String str2 = this.equals;
                aFa1vSDK.getRevenue(str2 != null ? str2 : "Can't get OneLink data");
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final long getRevenue() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AFd1fSDK<Map<String, String>> getRevenue(String str) {
        return this.copy.getMediationNetwork(this.hashCode, this.copydefault, this.AFLogger, str);
    }
}
