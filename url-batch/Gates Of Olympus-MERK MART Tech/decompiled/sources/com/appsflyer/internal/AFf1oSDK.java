package com.appsflyer.internal;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class AFf1oSDK extends AFf1rSDK<Map<String, String>> {
    private final UUID afDebugLog;
    private final boolean afInfoLog;
    public AFa1tSDK e;
    private final AFe1wSDK force;
    private String i;
    private String v;
    private String w;

    public interface AFa1tSDK {
        void AFInAppEventParameterName(Map<String, String> map);

        void AFKeystoreWrapper(String str);
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1dSDK
    public final boolean AFKeystoreWrapper() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final boolean afInfoLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final AppsFlyerRequestListener registerClient() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final boolean unregisterClient() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1oSDK(AFd1mSDK aFd1mSDK, UUID uuid, Uri uri) {
        super(AFe1eSDK.ONELINK, new AFe1eSDK[]{AFe1eSDK.RC_CDN}, aFd1mSDK, uuid.toString());
        boolean z = false;
        this.force = aFd1mSDK.AFKeystoreWrapper();
        this.afDebugLog = uuid;
        try {
            if (!AFc1vSDK.AFKeystoreWrapper(uri.getHost()) && !AFc1vSDK.AFKeystoreWrapper(uri.getPath())) {
                try {
                    Object[] objArr = {uri, aFd1mSDK.afVerboseLog()};
                    Object obj = AFc1gSDK.afErrorLog.get(-1664926929);
                    if (obj == null) {
                        obj = ((Class) AFc1gSDK.values((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, (ViewConfiguration.getTapTimeout() >> 16) + 37, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))).getDeclaredConstructor(Uri.class, AFc1pSDK.class);
                        AFc1gSDK.afErrorLog.put(-1664926929, obj);
                    }
                    Object newInstance = ((Constructor) obj).newInstance(objArr);
                    try {
                        Object obj2 = AFc1gSDK.afErrorLog.get(1006844384);
                        if (obj2 == null) {
                            obj2 = ((Class) AFc1gSDK.values(View.combineMeasuredStates(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37, (char) TextUtils.getTrimmedLength(""))).getMethod("AFInAppEventType", null);
                            AFc1gSDK.afErrorLog.put(1006844384, obj2);
                        }
                        Object invoke = ((Method) obj2).invoke(newInstance, null);
                        try {
                            Object obj3 = AFc1gSDK.afErrorLog.get(-1473153535);
                            if (obj3 == null) {
                                obj3 = ((Class) AFc1gSDK.values(View.combineMeasuredStates(0, 0) + 37, (ViewConfiguration.getPressedStateDuration() >> 16) + 52, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("AFInAppEventType", null);
                                AFc1gSDK.afErrorLog.put(-1473153535, obj3);
                            }
                            boolean booleanValue = ((Boolean) ((Method) obj3).invoke(invoke, null)).booleanValue();
                            try {
                                Object obj4 = AFc1gSDK.afErrorLog.get(1439112177);
                                if (obj4 == null) {
                                    obj4 = ((Class) AFc1gSDK.values(38 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (Process.myTid() >> 22) + 52, (char) (ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod("AFInAppEventParameterName", null);
                                    AFc1gSDK.afErrorLog.put(1439112177, obj4);
                                }
                                z = ((Boolean) ((Method) obj4).invoke(invoke, null)).booleanValue();
                                String[] split = uri.getPath().split("/");
                                if (booleanValue && split.length == 3) {
                                    this.w = split[1];
                                    this.v = split[2];
                                    this.i = uri.toString();
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
        this.afInfoLog = z;
    }

    public final boolean v() {
        return (TextUtils.isEmpty(this.w) || TextUtils.isEmpty(this.v) || this.w.equals("app")) ? false : true;
    }

    public final boolean i() {
        return this.afInfoLog;
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        super.AFInAppEventType();
        AFa1tSDK aFa1tSDK = this.e;
        if (aFa1tSDK != null) {
            if (this.AFKeystoreWrapper == AFe1bSDK.SUCCESS && ((AFf1rSDK) this).d != null) {
                aFa1tSDK.AFInAppEventParameterName((Map) ((AFf1rSDK) this).d.getBody());
                return;
            }
            Throwable AFLogger = AFLogger();
            if (AFLogger instanceof ParsingException) {
                if (((ParsingException) AFLogger).getRawResponse().isSuccessful()) {
                    aFa1tSDK.AFKeystoreWrapper("Can't parse one link data");
                    return;
                } else {
                    String str = this.i;
                    aFa1tSDK.AFKeystoreWrapper(str != null ? str : "Can't get OneLink data");
                    return;
                }
            }
            String str2 = this.i;
            aFa1tSDK.AFKeystoreWrapper(str2 != null ? str2 : "Can't get OneLink data");
        }
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final AFe1xSDK<Map<String, String>> values(String str) {
        return this.force.values(this.w, this.v, this.afDebugLog, str);
    }
}
