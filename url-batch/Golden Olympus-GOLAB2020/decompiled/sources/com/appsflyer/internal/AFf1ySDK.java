package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
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
public final class AFf1ySDK extends AFe1dSDK<Map<String, String>> {
    public AFa1ySDK component2;
    private final AFd1oSDK copy;
    private String copydefault;
    private final boolean equals;
    private String hashCode;
    private final UUID registerClient;
    private String toString;

    public interface AFa1ySDK {
        void getRevenue(String str);

        void getRevenue(Map<String, String> map);
    }

    public AFf1ySDK(AFc1dSDK aFc1dSDK, UUID uuid, Uri uri) {
        super(AFe1mSDK.ONELINK, new AFe1mSDK[]{AFe1mSDK.RC_CDN}, aFc1dSDK, uuid.toString());
        this.copy = aFc1dSDK.getCurrencyIso4217Code();
        this.registerClient = uuid;
        boolean z4 = false;
        try {
            if (!AFk1ySDK.getMediationNetwork(uri.getHost()) && !AFk1ySDK.getMediationNetwork(uri.getPath())) {
                try {
                    Object[] objArr = {uri, aFc1dSDK.d()};
                    Map map = AFa1kSDK.f13355i;
                    Object obj = map.get(-1523018365);
                    if (obj == null) {
                        obj = ((Class) AFa1kSDK.getCurrencyIso4217Code(Color.red(0), (char) (MotionEvent.axisFromString("") + 1), 37 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getDeclaredConstructor(Uri.class, AFa1oSDK.class);
                        map.put(-1523018365, obj);
                    }
                    Object newInstance = ((Constructor) obj).newInstance(objArr);
                    try {
                        Object obj2 = map.get(1191605722);
                        if (obj2 == null) {
                            obj2 = ((Class) AFa1kSDK.getCurrencyIso4217Code(ViewConfiguration.getWindowTouchSlop() >> 8, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 37 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("getRevenue", null);
                            map.put(1191605722, obj2);
                        }
                        Object invoke = ((Method) obj2).invoke(newInstance, null);
                        try {
                            Object obj3 = map.get(1984406162);
                            if (obj3 == null) {
                                obj3 = ((Class) AFa1kSDK.getCurrencyIso4217Code((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 37, (char) (44103 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), KeyEvent.keyCodeFromString("") + 50)).getMethod("getRevenue", null);
                                map.put(1984406162, obj3);
                            }
                            boolean booleanValue = ((Boolean) ((Method) obj3).invoke(invoke, null)).booleanValue();
                            try {
                                Object obj4 = map.get(-1632086821);
                                if (obj4 == null) {
                                    obj4 = ((Class) AFa1kSDK.getCurrencyIso4217Code((ViewConfiguration.getKeyRepeatDelay() >> 16) + 37, (char) (44102 - View.MeasureSpec.makeMeasureSpec(0, 0)), 50 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).getMethod("getMonetizationNetwork", null);
                                    map.put(-1632086821, obj4);
                                }
                                z4 = ((Boolean) ((Method) obj4).invoke(invoke, null)).booleanValue();
                                String[] split = uri.getPath().split("/");
                                if (booleanValue && split.length == 3) {
                                    this.hashCode = split[1];
                                    this.toString = split[2];
                                    this.copydefault = uri.toString();
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
        this.equals = z4;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final AppsFlyerRequestListener component3() {
        return null;
    }

    public final boolean copy() {
        return this.equals;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final boolean copydefault() {
        return false;
    }

    public final boolean equals() {
        return (TextUtils.isEmpty(this.hashCode) || TextUtils.isEmpty(this.toString) || this.hashCode.equals("app")) ? false : true;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final long getMonetizationNetwork() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final void getRevenue() {
        ResponseNetwork responseNetwork;
        super.getRevenue();
        AFa1ySDK aFa1ySDK = this.component2;
        if (aFa1ySDK != null) {
            if (this.getMediationNetwork == AFe1rSDK.SUCCESS && (responseNetwork = ((AFe1dSDK) this).component1) != null) {
                aFa1ySDK.getRevenue((Map<String, String>) responseNetwork.getBody());
                return;
            }
            Throwable component4 = component4();
            if (!(component4 instanceof ParsingException)) {
                String str = this.copydefault;
                aFa1ySDK.getRevenue(str != null ? str : "Can't get OneLink data");
            } else if (((ParsingException) component4).getRawResponse().isSuccessful()) {
                aFa1ySDK.getRevenue("Can't parse one link data");
            } else {
                String str2 = this.copydefault;
                aFa1ySDK.getRevenue(str2 != null ? str2 : "Can't get OneLink data");
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final AFd1nSDK<Map<String, String>> getRevenue(String str) {
        return this.copy.getRevenue(this.hashCode, this.toString, this.registerClient, str);
    }
}
