package com.chartboost.sdk.impl;

import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes6.dex */
public final class yb {
    public static final a b = new a(null);
    public final String a;

    public yb(String javascript) {
        Intrinsics.checkNotNullParameter(javascript, "javascript");
        this.a = javascript;
    }

    public final String a() {
        return this.a;
    }

    public static final class a {
        public final yb c(id screenMetrics) {
            Intrinsics.checkNotNullParameter(screenMetrics, "screenMetrics");
            gb b = screenMetrics.b().b();
            return new yb("window.mraidbridge.setDefaultPosition(" + b.c() + ", " + b.d() + ", " + b.b() + ", " + b.a() + ");");
        }

        public final yb d(id screenMetrics) {
            Intrinsics.checkNotNullParameter(screenMetrics, "screenMetrics");
            gb b = screenMetrics.c().b();
            return new yb("window.mraidbridge.setMaxSize(" + b.b() + ", " + b.a() + ");");
        }

        public final yb e(id screenMetrics) {
            Intrinsics.checkNotNullParameter(screenMetrics, "screenMetrics");
            gb b = screenMetrics.d().b();
            return new yb("window.mraidbridge.setScreenSize(" + b.b() + ", " + b.a() + ");");
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final yb b() {
            return a("{hostSDKName: 'Chartboost-Android-SDK'}");
        }

        public final yb b(id screenMetrics) {
            Intrinsics.checkNotNullParameter(screenMetrics, "screenMetrics");
            gb b = screenMetrics.a().b();
            return new yb("window.mraidbridge.setCurrentPosition(" + b.c() + ", " + b.d() + ", " + b.b() + ", " + b.a() + ");");
        }

        public final yb a(Float f) {
            String str;
            if (f != null) {
                float floatValue = f.floatValue();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(floatValue)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            } else {
                str = POBCommonConstants.NULL_VALUE;
            }
            return new yb("window.mraidbridge.notifyAudioVolumeChangeEvent(" + str + ");");
        }

        public final yb a(fd command) {
            Intrinsics.checkNotNullParameter(command, "command");
            return new yb("window.mraidbridge.nativeCallComplete({" + command.b() + "});");
        }

        public final yb b(String sdkVersion) {
            Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
            return a("{hostSDKVersion: '" + sdkVersion + "'}");
        }

        public final yb a(id screenMetrics) {
            Intrinsics.checkNotNullParameter(screenMetrics, "screenMetrics");
            gb b = screenMetrics.c().b();
            return new yb("window.mraidbridge.notifySizeChangeEvent(" + b.b() + ", " + b.a() + ");");
        }

        public final yb a(zc state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return a("{state: '" + state.b() + "'}");
        }

        public final yb a(boolean z) {
            String lowerCase = String.valueOf(z).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return a("{viewable: " + lowerCase + "}");
        }

        public final yb a(xc orientation, boolean z) {
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            return a("{orientation: '" + orientation.b() + "', locked: " + z + "}");
        }

        public final yb a(yc placementType) {
            Intrinsics.checkNotNullParameter(placementType, "placementType");
            return new yb("window.mraidbridge.setPlacementType('" + placementType.b() + "');");
        }

        public final yb a() {
            return new yb("window.mraidbridge.notifyReadyEvent();");
        }

        public final yb a(String str) {
            return new yb("window.mraidbridge.fireChangeEvent(" + str + ");");
        }
    }
}
