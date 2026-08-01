package com.onesignal.inAppMessages.internal;

import com.onesignal.inAppMessages.internal.display.impl.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
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
    private n.c displayLocation;
    private boolean isFullBleed;
    private int pageHeight;
    private boolean useHeightMargin;
    private boolean useWidthMargin;

    public d(JSONObject jSONObject) {
        Boolean safeBool;
        Boolean safeBool2;
        jSONObject.getClass();
        this.useHeightMargin = true;
        this.useWidthMargin = true;
        this.contentHtml = com.onesignal.common.e.safeString(jSONObject, HTML);
        this.displayDuration = com.onesignal.common.e.safeDouble(jSONObject, DISPLAY_DURATION);
        JSONObject safeJSONObject = com.onesignal.common.e.safeJSONObject(jSONObject, STYLES);
        boolean z10 = false;
        this.useHeightMargin = !((safeJSONObject == null || (safeBool2 = com.onesignal.common.e.safeBool(safeJSONObject, REMOVE_HEIGHT_MARGIN)) == null) ? false : safeBool2.booleanValue());
        if (safeJSONObject != null && (safeBool = com.onesignal.common.e.safeBool(safeJSONObject, REMOVE_WIDTH_MARGIN)) != null) {
            z10 = safeBool.booleanValue();
        }
        this.useWidthMargin = !z10;
        this.isFullBleed = !this.useHeightMargin;
    }

    public final String getContentHtml() {
        return this.contentHtml;
    }

    public final Double getDisplayDuration() {
        return this.displayDuration;
    }

    public final n.c getDisplayLocation() {
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

    public final void setDisplayDuration(Double d10) {
        this.displayDuration = d10;
    }

    public final void setDisplayLocation(n.c cVar) {
        this.displayLocation = cVar;
    }

    public final void setFullBleed(boolean z10) {
        this.isFullBleed = z10;
    }

    public final void setPageHeight(int i3) {
        this.pageHeight = i3;
    }

    public final void setUseHeightMargin(boolean z10) {
        this.useHeightMargin = z10;
    }

    public final void setUseWidthMargin(boolean z10) {
        this.useWidthMargin = z10;
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
