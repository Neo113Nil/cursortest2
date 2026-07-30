package com.onesignal.inAppMessages.internal;

import com.onesignal.inAppMessages.internal.display.impl.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {
    public static final a Companion = new a(null);
    public static final String DISPLAY_DURATION = "display_duration";
    public static final String HTML = "html";
    public static final String REMOVE_HEIGHT_MARGIN = "remove_height_margin";
    public static final String REMOVE_WIDTH_MARGIN = "remove_width_margin";
    public static final String STYLES = "styles";
    private String contentHtml;
    private Double displayDuration;
    private m.c displayLocation;
    private boolean isFullBleed;
    private int pageHeight;
    private boolean useHeightMargin;
    private boolean useWidthMargin;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(JSONObject jsonObject) {
        Boolean safeBool;
        Boolean safeBool2;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.useHeightMargin = true;
        this.useWidthMargin = true;
        this.contentHtml = com.onesignal.common.e.safeString(jsonObject, HTML);
        this.displayDuration = com.onesignal.common.e.safeDouble(jsonObject, DISPLAY_DURATION);
        JSONObject safeJSONObject = com.onesignal.common.e.safeJSONObject(jsonObject, STYLES);
        boolean z7 = false;
        this.useHeightMargin = !((safeJSONObject == null || (safeBool2 = com.onesignal.common.e.safeBool(safeJSONObject, REMOVE_HEIGHT_MARGIN)) == null) ? false : safeBool2.booleanValue());
        if (safeJSONObject != null && (safeBool = com.onesignal.common.e.safeBool(safeJSONObject, REMOVE_WIDTH_MARGIN)) != null) {
            z7 = safeBool.booleanValue();
        }
        this.useWidthMargin = !z7;
        this.isFullBleed = !this.useHeightMargin;
    }

    public final String getContentHtml() {
        return this.contentHtml;
    }

    public final Double getDisplayDuration() {
        return this.displayDuration;
    }

    public final m.c getDisplayLocation() {
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

    public final void setDisplayDuration(Double d7) {
        this.displayDuration = d7;
    }

    public final void setDisplayLocation(m.c cVar) {
        this.displayLocation = cVar;
    }

    public final void setFullBleed(boolean z7) {
        this.isFullBleed = z7;
    }

    public final void setPageHeight(int i2) {
        this.pageHeight = i2;
    }

    public final void setUseHeightMargin(boolean z7) {
        this.useHeightMargin = z7;
    }

    public final void setUseWidthMargin(boolean z7) {
        this.useWidthMargin = z7;
    }
}
