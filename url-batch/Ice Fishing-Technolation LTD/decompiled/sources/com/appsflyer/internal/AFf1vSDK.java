package com.appsflyer.internal;

import android.media.AudioTrack;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class AFf1vSDK extends AFe1fSDK<Map<String, String>> {
    private final UUID AFInAppEventType;
    public AFa1tSDK component2;
    private String copy;
    private String copydefault;
    private final AFd1nSDK equals;
    private String hashCode;
    private final boolean toString;

    public interface AFa1tSDK {
        void AFAdRevenueData(String str);

        void getCurrencyIso4217Code(Map<String, String> map);
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected final AppsFlyerRequestListener component2() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1vSDK(AFd1zSDK aFd1zSDK, UUID uuid, Uri uri) {
        super(AFe1pSDK.ONELINK, new AFe1pSDK[]{AFe1pSDK.RC_CDN}, aFd1zSDK, uuid.toString());
        boolean z = false;
        this.equals = aFd1zSDK.getRevenue();
        this.AFInAppEventType = uuid;
        try {
            if (!AFk1wSDK.getMonetizationNetwork(uri.getHost()) && !AFk1wSDK.getMonetizationNetwork(uri.getPath())) {
                try {
                    Object[] objArr = {uri, aFd1zSDK.i()};
                    Object obj = AFa1hSDK.d.get(862139947);
                    if (obj == null) {
                        obj = ((Class) AFa1hSDK.getRevenue(TextUtils.getCapsMode("", 0, 0), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 62049), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 36)).getDeclaredConstructor(Uri.class, AFa1mSDK.class);
                        AFa1hSDK.d.put(862139947, obj);
                    }
                    Object newInstance = ((Constructor) obj).newInstance(objArr);
                    try {
                        Object obj2 = AFa1hSDK.d.get(-180621578);
                        if (obj2 == null) {
                            obj2 = ((Class) AFa1hSDK.getRevenue(ViewConfiguration.getJumpTapTimeout() >> 16, (char) (KeyEvent.getDeadChar(0, 0) + 62049), (ViewConfiguration.getTouchSlop() >> 8) + 37)).getMethod("getMediationNetwork", null);
                            AFa1hSDK.d.put(-180621578, obj2);
                        }
                        Object invoke = ((Method) obj2).invoke(newInstance, null);
                        try {
                            Object obj3 = AFa1hSDK.d.get(614194017);
                            if (obj3 == null) {
                                obj3 = ((Class) AFa1hSDK.getRevenue((ViewConfiguration.getLongPressTimeout() >> 16) + 37, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 51)).getMethod("AFAdRevenueData", null);
                                AFa1hSDK.d.put(614194017, obj3);
                            }
                            boolean booleanValue = ((Boolean) ((Method) obj3).invoke(invoke, null)).booleanValue();
                            try {
                                Object obj4 = AFa1hSDK.d.get(2114469703);
                                if (obj4 == null) {
                                    obj4 = ((Class) AFa1hSDK.getRevenue(38 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) View.resolveSizeAndState(0, 0, 0), 51 - (ViewConfiguration.getTapTimeout() >> 16))).getMethod("getRevenue", null);
                                    AFa1hSDK.d.put(2114469703, obj4);
                                }
                                z = ((Boolean) ((Method) obj4).invoke(invoke, null)).booleanValue();
                                String[] split = uri.getPath().split("/");
                                if (booleanValue && split.length == 3) {
                                    this.copydefault = split[1];
                                    this.copy = split[2];
                                    this.hashCode = uri.toString();
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
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("OneLinkValidator: reflection init failed", e);
        }
        this.toString = z;
    }

    public final boolean copy() {
        return (TextUtils.isEmpty(this.copydefault) || TextUtils.isEmpty(this.copy) || this.copydefault.equals("app")) ? false : true;
    }

    public final boolean equals() {
        return this.toString;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        AFa1tSDK aFa1tSDK = this.component2;
        if (aFa1tSDK != null) {
            if (this.getMonetizationNetwork == AFe1uSDK.SUCCESS && ((AFe1fSDK) this).areAllFieldsValid != null) {
                aFa1tSDK.getCurrencyIso4217Code((Map) ((AFe1fSDK) this).areAllFieldsValid.getBody());
                return;
            }
            Throwable component1 = component1();
            if (component1 instanceof ParsingException) {
                if (((ParsingException) component1).getRawResponse().isSuccessful()) {
                    aFa1tSDK.AFAdRevenueData("Can't parse one link data");
                    return;
                } else {
                    String str = this.hashCode;
                    aFa1tSDK.AFAdRevenueData(str != null ? str : "Can't get OneLink data");
                    return;
                }
            }
            String str2 = this.hashCode;
            aFa1tSDK.AFAdRevenueData(str2 != null ? str2 : "Can't get OneLink data");
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected final AFd1hSDK<Map<String, String>> AFAdRevenueData(String str) {
        return this.equals.getMediationNetwork(this.copydefault, this.copy, this.AFInAppEventType, str);
    }
}
