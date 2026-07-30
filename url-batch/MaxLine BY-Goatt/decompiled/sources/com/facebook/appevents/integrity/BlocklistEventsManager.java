package com.facebook.appevents.integrity;

import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class BlocklistEventsManager {
    public static final BlocklistEventsManager INSTANCE = new BlocklistEventsManager();
    private static Set<String> blocklist = new HashSet();
    private static boolean enabled;

    private BlocklistEventsManager() {
    }

    public static final void disable() {
        if (CrashShieldHandler.isObjectCrashing(BlocklistEventsManager.class)) {
            return;
        }
        try {
            enabled = false;
            blocklist = new HashSet();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BlocklistEventsManager.class);
        }
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(BlocklistEventsManager.class)) {
            return;
        }
        try {
            INSTANCE.loadBlocklistEvents();
            Set<String> set = blocklist;
            if (set != null && !set.isEmpty()) {
                enabled = true;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BlocklistEventsManager.class);
        }
    }

    public static final boolean isInBlocklist(String str) {
        if (CrashShieldHandler.isObjectCrashing(BlocklistEventsManager.class)) {
            return false;
        }
        try {
            str.getClass();
            if (enabled) {
                return blocklist.contains(str);
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BlocklistEventsManager.class);
            return false;
        }
    }

    private final void loadBlocklistEvents() {
        HashSet<String> convertJSONArrayToHashSet;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
            if (queryAppSettings == null || (convertJSONArrayToHashSet = Utility.convertJSONArrayToHashSet(queryAppSettings.getBlocklistEvents())) == null) {
                return;
            }
            blocklist = convertJSONArrayToHashSet;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
