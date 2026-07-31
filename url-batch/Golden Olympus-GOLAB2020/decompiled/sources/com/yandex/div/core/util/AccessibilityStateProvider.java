package com.yandex.div.core.util;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AccessibilityStateProvider {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private static Boolean touchModeEnabled;
    private final boolean a11yConfigurationEnabled;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void evaluateTouchModeEnabled(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (getTouchModeEnabled() != null) {
                return;
            }
            Object systemService = context.getSystemService("accessibility");
            AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
            setTouchModeEnabled(accessibilityManager != null ? Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()) : Boolean.FALSE);
        }

        @Nullable
        public final Boolean getTouchModeEnabled() {
            return AccessibilityStateProvider.touchModeEnabled;
        }

        public final void setTouchModeEnabled(@Nullable Boolean bool) {
            AccessibilityStateProvider.touchModeEnabled = bool;
        }

        private Companion() {
        }
    }

    public AccessibilityStateProvider(boolean z4) {
        this.a11yConfigurationEnabled = z4;
    }

    public final boolean isAccessibilityEnabled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.a11yConfigurationEnabled) {
            return false;
        }
        Boolean bool = touchModeEnabled;
        if (bool != null) {
            Intrinsics.checkNotNull(bool);
            return bool.booleanValue();
        }
        Companion.evaluateTouchModeEnabled(context);
        Boolean bool2 = touchModeEnabled;
        Intrinsics.checkNotNull(bool2);
        return bool2.booleanValue();
    }
}
