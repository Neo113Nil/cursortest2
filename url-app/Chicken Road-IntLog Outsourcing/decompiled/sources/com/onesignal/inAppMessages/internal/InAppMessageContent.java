package com.onesignal.inAppMessages.internal;

import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class InAppMessageContent {
    public static final Companion Companion = new Companion(null);
    public static final String DISPLAY_DURATION = "display_duration";
    public static final String HTML = "html";
    public static final String REMOVE_HEIGHT_MARGIN = "remove_height_margin";
    public static final String REMOVE_WIDTH_MARGIN = "remove_width_margin";
    public static final String STYLES = "styles";
    private String contentHtml;
    private Double displayDuration;
    private WebViewManager.Position displayLocation;
    private boolean isFullBleed;
    private int pageHeight;
    private boolean useHeightMargin;
    private boolean useWidthMargin;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public InAppMessageContent(JSONObject jsonObject) {
        Boolean safeBool;
        Boolean safeBool2;
        i.e(jsonObject, "jsonObject");
        this.useHeightMargin = true;
        this.useWidthMargin = true;
        this.contentHtml = JSONObjectExtensionsKt.safeString(jsonObject, HTML);
        this.displayDuration = JSONObjectExtensionsKt.safeDouble(jsonObject, DISPLAY_DURATION);
        JSONObject safeJSONObject = JSONObjectExtensionsKt.safeJSONObject(jsonObject, STYLES);
        boolean z = false;
        this.useHeightMargin = !((safeJSONObject == null || (safeBool2 = JSONObjectExtensionsKt.safeBool(safeJSONObject, REMOVE_HEIGHT_MARGIN)) == null) ? false : safeBool2.booleanValue());
        if (safeJSONObject != null && (safeBool = JSONObjectExtensionsKt.safeBool(safeJSONObject, REMOVE_WIDTH_MARGIN)) != null) {
            z = safeBool.booleanValue();
        }
        this.useWidthMargin = !z;
        this.isFullBleed = !this.useHeightMargin;
    }

    public final String getContentHtml() {
        return this.contentHtml;
    }

    public final Double getDisplayDuration() {
        return this.displayDuration;
    }

    public final WebViewManager.Position getDisplayLocation() {
        return this.displayLocation;
    }

    public final int getPageHeight() {
        return this.pageHeight;
    }

    public final boolean getUseHeightMargin() {
        return this.useHeightMargin;
    }

    public final boolean getUseWidthMargin() {
        return this.useWidthMargin;
    }

    public final boolean isFullBleed() {
        return this.isFullBleed;
    }

    public final void setContentHtml(String str) {
        this.contentHtml = str;
    }

    public final void setDisplayDuration(Double d6) {
        this.displayDuration = d6;
    }

    public final void setDisplayLocation(WebViewManager.Position position) {
        this.displayLocation = position;
    }

    public final void setFullBleed(boolean z) {
        this.isFullBleed = z;
    }

    public final void setPageHeight(int i2) {
        this.pageHeight = i2;
    }

    public final void setUseHeightMargin(boolean z) {
        this.useHeightMargin = z;
    }

    public final void setUseWidthMargin(boolean z) {
        this.useWidthMargin = z;
    }
}
