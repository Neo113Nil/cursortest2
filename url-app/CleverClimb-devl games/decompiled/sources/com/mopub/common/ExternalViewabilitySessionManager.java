package com.mopub.common;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.mopub.common.ExternalViewabilitySession;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.VastVideoConfig;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
public class ExternalViewabilitySessionManager {
    private final Set<ExternalViewabilitySession> mViewabilitySessions;

    public enum ViewabilityVendor {
        AVID,
        MOAT,
        ALL;

        public void disable() {
            switch (this) {
                case AVID:
                    AvidViewabilitySession.disable();
                    break;
                case MOAT:
                    MoatViewabilitySession.disable();
                    break;
                case ALL:
                    AvidViewabilitySession.disable();
                    MoatViewabilitySession.disable();
                    break;
                default:
                    MoPubLog.d("Attempted to disable an invalid viewability vendor: " + this);
                    return;
            }
            MoPubLog.d("Disabled viewability for " + this);
        }

        public static String getEnabledVendorKey() {
            boolean isEnabled = AvidViewabilitySession.isEnabled();
            boolean isEnabled2 = MoatViewabilitySession.isEnabled();
            return (isEnabled && isEnabled2) ? com.aiming.mdt.utils.Constants.ALL_LOAD : isEnabled ? "1" : isEnabled2 ? "2" : "0";
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static ViewabilityVendor fromKey(String str) {
            char c2;
            Preconditions.checkNotNull(str);
            switch (str.hashCode()) {
                case 49:
                    if (str.equals("1")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 50:
                    if (str.equals("2")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 51:
                    if (str.equals(com.aiming.mdt.utils.Constants.ALL_LOAD)) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    return AVID;
                case 1:
                    return MOAT;
                case 2:
                    return ALL;
                default:
                    return null;
            }
        }
    }

    public ExternalViewabilitySessionManager(Context context) {
        Preconditions.checkNotNull(context);
        this.mViewabilitySessions = new HashSet();
        this.mViewabilitySessions.add(new AvidViewabilitySession());
        this.mViewabilitySessions.add(new MoatViewabilitySession());
        initialize(context);
    }

    private void initialize(Context context) {
        Preconditions.checkNotNull(context);
        for (ExternalViewabilitySession externalViewabilitySession : this.mViewabilitySessions) {
            logEvent(externalViewabilitySession, "initialize", externalViewabilitySession.initialize(context), false);
        }
    }

    public void invalidate() {
        for (ExternalViewabilitySession externalViewabilitySession : this.mViewabilitySessions) {
            logEvent(externalViewabilitySession, "invalidate", externalViewabilitySession.invalidate(), false);
        }
    }

    public void createDisplaySession(Context context, WebView webView, boolean z) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(webView);
        for (ExternalViewabilitySession externalViewabilitySession : this.mViewabilitySessions) {
            logEvent(externalViewabilitySession, "start display session", externalViewabilitySession.createDisplaySession(context, webView, z), true);
        }
    }

    public void createDisplaySession(Context context, WebView webView) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(webView);
        createDisplaySession(context, webView, false);
    }

    public void startDeferredDisplaySession(Activity activity) {
        for (ExternalViewabilitySession externalViewabilitySession : this.mViewabilitySessions) {
            logEvent(externalViewabilitySession, "record deferred session", externalViewabilitySession.startDeferredDisplaySession(activity), true);
        }
    }

    public void endDisplaySession() {
        for (ExternalViewabilitySession externalViewabilitySession : this.mViewabilitySessions) {
            logEvent(externalViewabilitySession, "end display session", externalViewabilitySession.endDisplaySession(), true);
        }
    }

    public void createVideoSession(Activity activity, View view, VastVideoConfig vastVideoConfig) {
        Preconditions.checkNotNull(activity);
        Preconditions.checkNotNull(view);
        Preconditions.checkNotNull(vastVideoConfig);
        for (ExternalViewabilitySession externalViewabilitySession : this.mViewabilitySessions) {
            HashSet hashSet = new HashSet();
            if (externalViewabilitySession instanceof AvidViewabilitySession) {
                hashSet.addAll(vastVideoConfig.getAvidJavascriptResources());
            } else if (externalViewabilitySession instanceof MoatViewabilitySession) {
                hashSet.addAll(vastVideoConfig.getMoatImpressionPixels());
            }
            logEvent(externalViewabilitySession, "start video session", externalViewabilitySession.createVideoSession(activity, view, hashSet, vastVideoConfig.getExternalViewabilityTrackers()), true);
        }
    }

    public void registerVideoObstruction(View view) {
        Preconditions.checkNotNull(view);
        for (ExternalViewabilitySession externalViewabilitySession : this.mViewabilitySessions) {
            logEvent(externalViewabilitySession, "register friendly obstruction", externalViewabilitySession.registerVideoObstruction(view), true);
        }
    }

    public void onVideoPrepared(View view, int i) {
        Preconditions.checkNotNull(view);
        for (ExternalViewabilitySession externalViewabilitySession : this.mViewabilitySessions) {
            logEvent(externalViewabilitySession, "on video prepared", externalViewabilitySession.onVideoPrepared(view, i), true);
        }
    }

    public void recordVideoEvent(ExternalViewabilitySession.VideoEvent videoEvent, int i) {
        Preconditions.checkNotNull(videoEvent);
        for (ExternalViewabilitySession externalViewabilitySession : this.mViewabilitySessions) {
            logEvent(externalViewabilitySession, "record video event (" + videoEvent.name() + ")", externalViewabilitySession.recordVideoEvent(videoEvent, i), true);
        }
    }

    public void endVideoSession() {
        for (ExternalViewabilitySession externalViewabilitySession : this.mViewabilitySessions) {
            logEvent(externalViewabilitySession, "end video session", externalViewabilitySession.endVideoSession(), true);
        }
    }

    private void logEvent(ExternalViewabilitySession externalViewabilitySession, String str, Boolean bool, boolean z) {
        Preconditions.checkNotNull(externalViewabilitySession);
        Preconditions.checkNotNull(str);
        if (bool == null) {
            return;
        }
        String format = String.format(Locale.US, "%s viewability event: %s%s.", externalViewabilitySession.getName(), bool.booleanValue() ? "" : "failed to ", str);
        if (z) {
            MoPubLog.v(format);
        } else {
            MoPubLog.d(format);
        }
    }
}
