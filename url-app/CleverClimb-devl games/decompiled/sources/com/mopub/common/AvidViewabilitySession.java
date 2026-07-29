package com.mopub.common;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.cmplay.base.util.ipc.a;
import com.mopub.common.ExternalViewabilitySession;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Reflection;
import com.mopub.mobileads.VastExtensionXmlManager;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
class AvidViewabilitySession implements ExternalViewabilitySession {
    private static final String AVID_AD_SESSION_MANAGER_PATH = "com.integralads.avid.library.mopub.session.AvidAdSessionManager";
    private static final String AVID_KEY = "avid";
    private static final String AVID_MANAGER_PATH = "com.integralads.avid.library.mopub.AvidManager";
    private static final String EXTERNAL_AVID_AD_SESSION_CONTEXT_PATH = "com.integralads.avid.library.mopub.session.ExternalAvidAdSessionContext";
    private static Object sAvidAdSessionContextDeferred;
    private static Object sAvidAdSessionContextNonDeferred;
    private static boolean sIsVendorDisabled;
    private static Boolean sIsViewabilityEnabledViaReflection;
    private Object mAvidDisplayAdSession;
    private Object mAvidVideoAdSession;

    @Override // com.mopub.common.ExternalViewabilitySession
    public String getName() {
        return VastExtensionXmlManager.AVID;
    }

    AvidViewabilitySession() {
    }

    static boolean isEnabled() {
        return !sIsVendorDisabled && isViewabilityEnabledViaReflection();
    }

    static void disable() {
        sIsVendorDisabled = true;
    }

    private static boolean isViewabilityEnabledViaReflection() {
        if (sIsViewabilityEnabledViaReflection == null) {
            sIsViewabilityEnabledViaReflection = Boolean.valueOf(Reflection.classFound(AVID_AD_SESSION_MANAGER_PATH));
            StringBuilder sb = new StringBuilder();
            sb.append("Avid is ");
            sb.append(sIsViewabilityEnabledViaReflection.booleanValue() ? "" : "un");
            sb.append("available via reflection.");
            MoPubLog.d(sb.toString());
        }
        return sIsViewabilityEnabledViaReflection.booleanValue();
    }

    private static Object getAvidAdSessionContextDeferred() {
        if (sAvidAdSessionContextDeferred == null) {
            try {
                sAvidAdSessionContextDeferred = Reflection.instantiateClassWithConstructor(EXTERNAL_AVID_AD_SESSION_CONTEXT_PATH, Object.class, new Class[]{String.class, Boolean.TYPE}, new Object[]{"5.0.0", true});
            } catch (Exception e) {
                MoPubLog.d("Unable to generate Avid deferred ad session context: " + e.getMessage());
            }
        }
        return sAvidAdSessionContextDeferred;
    }

    private static Object getAvidAdSessionContextNonDeferred() {
        if (sAvidAdSessionContextNonDeferred == null) {
            try {
                sAvidAdSessionContextNonDeferred = Reflection.instantiateClassWithConstructor(EXTERNAL_AVID_AD_SESSION_CONTEXT_PATH, Object.class, new Class[]{String.class}, new Object[]{"5.0.0"});
            } catch (Exception e) {
                MoPubLog.d("Unable to generate Avid ad session context: " + e.getMessage());
            }
        }
        return sAvidAdSessionContextNonDeferred;
    }

    @Override // com.mopub.common.ExternalViewabilitySession
    public Boolean initialize(Context context) {
        Preconditions.checkNotNull(context);
        return !isEnabled() ? null : true;
    }

    @Override // com.mopub.common.ExternalViewabilitySession
    public Boolean invalidate() {
        if (!isEnabled()) {
            return null;
        }
        this.mAvidDisplayAdSession = null;
        this.mAvidVideoAdSession = null;
        return true;
    }

    @Override // com.mopub.common.ExternalViewabilitySession
    public Boolean createDisplaySession(Context context, WebView webView, boolean z) {
        Object avidAdSessionContextNonDeferred;
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(webView);
        if (!isEnabled()) {
            return null;
        }
        if (z) {
            avidAdSessionContextNonDeferred = getAvidAdSessionContextDeferred();
        } else {
            avidAdSessionContextNonDeferred = getAvidAdSessionContextNonDeferred();
        }
        Activity activity = context instanceof Activity ? (Activity) context : null;
        try {
            this.mAvidDisplayAdSession = new Reflection.MethodBuilder(null, "startAvidDisplayAdSession").setStatic(AVID_AD_SESSION_MANAGER_PATH).addParam((Class<Class>) Context.class, (Class) context).addParam(EXTERNAL_AVID_AD_SESSION_CONTEXT_PATH, avidAdSessionContextNonDeferred).execute();
            new Reflection.MethodBuilder(this.mAvidDisplayAdSession, "registerAdView").addParam((Class<Class>) View.class, (Class) webView).addParam((Class<Class>) Activity.class, (Class) activity).execute();
            return true;
        } catch (Exception e) {
            MoPubLog.d("Unable to execute Avid start display session: " + e.getMessage());
            return false;
        }
    }

    @Override // com.mopub.common.ExternalViewabilitySession
    public Boolean startDeferredDisplaySession(Activity activity) {
        if (!isEnabled()) {
            return null;
        }
        if (this.mAvidDisplayAdSession == null) {
            MoPubLog.d("Avid DisplayAdSession unexpectedly null.");
            return false;
        }
        try {
            new Reflection.MethodBuilder(new Reflection.MethodBuilder(null, a.FORCE_STATIC_METHOD).setStatic(AVID_MANAGER_PATH).execute(), "registerActivity").addParam((Class<Class>) Activity.class, (Class) activity).execute();
            Object execute = new Reflection.MethodBuilder(this.mAvidDisplayAdSession, "getAvidDeferredAdSessionListener").execute();
            if (execute == null) {
                MoPubLog.d("Avid AdSessionListener unexpectedly null.");
                return false;
            }
            new Reflection.MethodBuilder(execute, "recordReadyEvent").execute();
            return true;
        } catch (Exception e) {
            MoPubLog.d("Unable to execute Avid record deferred session: " + e.getMessage());
            return false;
        }
    }

    @Override // com.mopub.common.ExternalViewabilitySession
    public Boolean endDisplaySession() {
        if (!isEnabled()) {
            return null;
        }
        if (this.mAvidDisplayAdSession == null) {
            MoPubLog.d("Avid DisplayAdSession unexpectedly null.");
            return false;
        }
        try {
            new Reflection.MethodBuilder(this.mAvidDisplayAdSession, "endSession").execute();
            return true;
        } catch (Exception e) {
            MoPubLog.d("Unable to execute Avid end session: " + e.getMessage());
            return false;
        }
    }

    @Override // com.mopub.common.ExternalViewabilitySession
    public Boolean createVideoSession(Activity activity, View view, Set<String> set, Map<String, String> map) {
        Preconditions.checkNotNull(activity);
        Preconditions.checkNotNull(view);
        Preconditions.checkNotNull(set);
        Preconditions.checkNotNull(map);
        if (!isEnabled()) {
            return null;
        }
        try {
            this.mAvidVideoAdSession = new Reflection.MethodBuilder(null, "startAvidManagedVideoAdSession").setStatic(AVID_AD_SESSION_MANAGER_PATH).addParam((Class<Class>) Context.class, (Class) activity).addParam(EXTERNAL_AVID_AD_SESSION_CONTEXT_PATH, getAvidAdSessionContextNonDeferred()).execute();
            new Reflection.MethodBuilder(this.mAvidVideoAdSession, "registerAdView").addParam((Class<Class>) View.class, (Class) view).addParam((Class<Class>) Activity.class, (Class) activity).execute();
            if (!TextUtils.isEmpty(map.get(AVID_KEY))) {
                new Reflection.MethodBuilder(this.mAvidVideoAdSession, "injectJavaScriptResource").addParam((Class<Class>) String.class, (Class) map.get(AVID_KEY)).execute();
            }
            for (String str : set) {
                if (!TextUtils.isEmpty(str)) {
                    new Reflection.MethodBuilder(this.mAvidVideoAdSession, "injectJavaScriptResource").addParam((Class<Class>) String.class, (Class) str).execute();
                }
            }
            return true;
        } catch (Exception e) {
            MoPubLog.d("Unable to execute Avid start video session: " + e.getMessage());
            return false;
        }
    }

    @Override // com.mopub.common.ExternalViewabilitySession
    public Boolean registerVideoObstruction(View view) {
        Preconditions.checkNotNull(view);
        if (!isEnabled()) {
            return null;
        }
        if (this.mAvidVideoAdSession == null) {
            MoPubLog.d("Avid VideoAdSession unexpectedly null.");
            return false;
        }
        try {
            new Reflection.MethodBuilder(this.mAvidVideoAdSession, "registerFriendlyObstruction").addParam((Class<Class>) View.class, (Class) view).execute();
            return true;
        } catch (Exception e) {
            MoPubLog.d("Unable to register Avid video obstructions: " + e.getMessage());
            return false;
        }
    }

    @Override // com.mopub.common.ExternalViewabilitySession
    public Boolean onVideoPrepared(View view, int i) {
        Preconditions.checkNotNull(view);
        return !isEnabled() ? null : true;
    }

    @Override // com.mopub.common.ExternalViewabilitySession
    public Boolean recordVideoEvent(ExternalViewabilitySession.VideoEvent videoEvent, int i) {
        Preconditions.checkNotNull(videoEvent);
        if (!isEnabled()) {
            return null;
        }
        if (this.mAvidVideoAdSession == null) {
            MoPubLog.d("Avid VideoAdSession unexpectedly null.");
            return false;
        }
        try {
            switch (videoEvent) {
                case AD_LOADED:
                case AD_STARTED:
                case AD_STOPPED:
                case AD_PAUSED:
                case AD_PLAYING:
                case AD_SKIPPED:
                case AD_IMPRESSED:
                case AD_CLICK_THRU:
                case AD_VIDEO_FIRST_QUARTILE:
                case AD_VIDEO_MIDPOINT:
                case AD_VIDEO_THIRD_QUARTILE:
                case AD_COMPLETE:
                    handleVideoEventReflection(videoEvent);
                    return true;
                case RECORD_AD_ERROR:
                    handleVideoEventReflection(videoEvent, "error");
                    return true;
                default:
                    MoPubLog.d("Unexpected video event type: " + videoEvent);
                    return false;
            }
        } catch (Exception e) {
            MoPubLog.d("Unable to execute Avid video event for " + videoEvent.getAvidMethodName() + ": " + e.getMessage());
            return false;
        }
    }

    @Override // com.mopub.common.ExternalViewabilitySession
    public Boolean endVideoSession() {
        if (!isEnabled()) {
            return null;
        }
        if (this.mAvidVideoAdSession == null) {
            MoPubLog.d("Avid VideoAdSession unexpectedly null.");
            return false;
        }
        try {
            new Reflection.MethodBuilder(this.mAvidVideoAdSession, "endSession").execute();
            return true;
        } catch (Exception e) {
            MoPubLog.d("Unable to execute Avid end video session: " + e.getMessage());
            return false;
        }
    }

    private void handleVideoEventReflection(ExternalViewabilitySession.VideoEvent videoEvent) throws Exception {
        handleVideoEventReflection(videoEvent, null);
    }

    private void handleVideoEventReflection(ExternalViewabilitySession.VideoEvent videoEvent, String str) throws Exception {
        Reflection.MethodBuilder methodBuilder = new Reflection.MethodBuilder(new Reflection.MethodBuilder(this.mAvidVideoAdSession, "getAvidVideoPlaybackListener").execute(), videoEvent.getAvidMethodName());
        if (!TextUtils.isEmpty(str)) {
            methodBuilder.addParam((Class<Class>) String.class, (Class) str);
        }
        methodBuilder.execute();
    }
}
