package com.onesignal.inAppMessages.internal;

import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class InAppMessagePage {
    public static final Companion Companion = new Companion(null);
    public static final String PAGE_ID = "pageId";
    public static final String PAGE_INDEX = "pageIndex";
    private String pageId;
    private String pageIndex;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public InAppMessagePage(JSONObject jsonObject) {
        i.e(jsonObject, "jsonObject");
        this.pageId = jsonObject.optString(PAGE_ID, null);
        this.pageIndex = jsonObject.optString(PAGE_INDEX, null);
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final String getPageIndex() {
        return this.pageIndex;
    }

    public final void setPageId(String str) {
        this.pageId = str;
    }

    public final void setPageIndex(String str) {
        this.pageIndex = str;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PAGE_ID, this.pageId);
            jSONObject.put(PAGE_INDEX, this.pageIndex);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        return jSONObject;
    }
}
