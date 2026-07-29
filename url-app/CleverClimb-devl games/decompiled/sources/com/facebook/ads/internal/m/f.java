package com.facebook.ads.internal.m;

import com.tapjoy.TapjoyConstants;
import com.youappi.sdk.net.model.VideoEvent;

/* loaded from: classes.dex */
public enum f {
    TEST("test"),
    BROWSER_SESSION("browser_session"),
    CLOSE("close"),
    IMPRESSION(VideoEvent.EVENT_IMPRESSION),
    INVALIDATION("invalidation"),
    STORE(TapjoyConstants.TJC_STORE),
    OFF_TARGET_CLICK("off_target_click"),
    OPEN_LINK("open_link"),
    NATIVE_VIEW("native_view"),
    VIDEO("video");

    private String k;

    f(String str) {
        this.k = str;
    }

    public static f a(String str) {
        for (f fVar : values()) {
            if (fVar.k.equalsIgnoreCase(str)) {
                return fVar;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.k;
    }
}
