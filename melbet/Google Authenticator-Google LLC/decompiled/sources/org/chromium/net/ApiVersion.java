package org.chromium.net;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ApiVersion {
    private static final int API_LEVEL = 49;
    private static final String CRONET_VERSION = "151.0.7922.29";
    private static final String LAST_CHANGE = "3d40be6ffaa85a05625933da34f177cf18b9b963-refs/branch-heads/7922@{#1209}";
    private static final int MIN_COMPATIBLE_API_LEVEL = 3;

    private ApiVersion() {
    }

    public static int getApiLevel() {
        return 3;
    }

    public static String getCronetVersion() {
        return CRONET_VERSION;
    }

    public static String getCronetVersionWithLastChange() {
        return "151.0.7922.29@".concat("3d40be6f");
    }

    public static String getLastChange() {
        return LAST_CHANGE;
    }

    public static int getMaximumAvailableApiLevel() {
        return API_LEVEL;
    }
}
