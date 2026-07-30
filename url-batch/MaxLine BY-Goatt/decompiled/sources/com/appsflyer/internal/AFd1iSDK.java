package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFd1iSDK extends AFd1nSDK<Map<String, String>> {
    private String AFLogger$LogLevel;
    private final AFc1qSDK AFVersionDeclaration;
    private final boolean afErrorLogForExcManagerOnly;
    public AFa1xSDK afInfoLog;
    private String afWarnLog;
    private String getLevel;
    private final UUID onInstallConversionFailureNative;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface AFa1xSDK {
        void AFKeystoreWrapper(String str);

        void AFKeystoreWrapper(Map<String, String> map);
    }

    public AFd1iSDK(AFc1zSDK aFc1zSDK, UUID uuid, Uri uri) {
        super(AFd1vSDK.ONELINK, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1zSDK, uuid.toString());
        this.AFVersionDeclaration = aFc1zSDK.AFInAppEventType();
        this.onInstallConversionFailureNative = uuid;
        boolean z = false;
        if (!AFb1vSDK.AFInAppEventParameterName(uri.getHost()) && !AFb1vSDK.AFInAppEventParameterName(uri.getPath())) {
            try {
                try {
                    Object invoke = ((Class) AFb1pSDK.values((char) ((-1) - ImageFormat.getBitsPerPixel(0)), KeyEvent.getDeadChar(0, 0) + 37, KeyEvent.normalizeMetaState(0))).getMethod("values", null).invoke(((Class) AFb1pSDK.values((char) ExpandableListView.getPackedPositionType(0L), 38 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L))).getDeclaredConstructor(Uri.class, AFb1uSDK.class).newInstance(uri, aFc1zSDK.init()), null);
                    try {
                        boolean booleanValue = ((Boolean) ((Class) AFb1pSDK.values((char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 1), 51 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 36 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0))).getMethod("values", null).invoke(invoke, null)).booleanValue();
                        try {
                            z = ((Boolean) ((Class) AFb1pSDK.values((char) Color.green(0), 49 - MotionEvent.axisFromString(BuildConfig.FLAVOR), 36 - ((byte) KeyEvent.getModifierMetaStateMask()))).getMethod("AFInAppEventParameterName", null).invoke(invoke, null)).booleanValue();
                            String[] split = uri.getPath().split("/");
                            if (booleanValue && split.length == 3) {
                                this.getLevel = split[1];
                                this.afWarnLog = split[2];
                                this.AFLogger$LogLevel = uri.toString();
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
        this.afErrorLogForExcManagerOnly = z;
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final boolean AFInAppEventType() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AFc1nSDK<Map<String, String>> AFKeystoreWrapper(String str) {
        return this.AFVersionDeclaration.AFKeystoreWrapper(this.getLevel, this.afWarnLog, this.onInstallConversionFailureNative, str);
    }

    public final boolean AFLogger$LogLevel() {
        return (TextUtils.isEmpty(this.getLevel) || TextUtils.isEmpty(this.afWarnLog) || this.getLevel.equals("app")) ? false : true;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AppsFlyerRequestListener afDebugLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final boolean afRDLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final boolean afWarnLog() {
        return false;
    }

    public final boolean getLevel() {
        return this.afErrorLogForExcManagerOnly;
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final void valueOf() {
        ResponseNetwork responseNetwork;
        super.valueOf();
        AFa1xSDK aFa1xSDK = this.afInfoLog;
        if (aFa1xSDK != null) {
            if (this.AFKeystoreWrapper == AFd1ySDK.SUCCESS && (responseNetwork = ((AFd1nSDK) this).AFLogger) != null) {
                aFa1xSDK.AFKeystoreWrapper((Map<String, String>) responseNetwork.getBody());
                return;
            }
            Throwable afInfoLog = afInfoLog();
            if (!(afInfoLog instanceof ParsingException)) {
                String str = this.AFLogger$LogLevel;
                aFa1xSDK.AFKeystoreWrapper(str != null ? str : "Can't get OneLink data");
            } else if (((ParsingException) afInfoLog).getRawResponse().isSuccessful()) {
                aFa1xSDK.AFKeystoreWrapper("Can't parse one link data");
            } else {
                String str2 = this.AFLogger$LogLevel;
                aFa1xSDK.AFKeystoreWrapper(str2 != null ? str2 : "Can't get OneLink data");
            }
        }
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final long AFKeystoreWrapper() {
        return 3000L;
    }
}
