package com.onesignal.inAppMessages.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements wa.d {
    private static final String CLICK_NAME = "click_name";
    private static final String CLICK_URL = "click_url";
    private static final String CLOSE = "close";
    private static final String CLOSES_MESSAGE = "closes_message";
    public static final a Companion = new a(null);
    private static final String FIRST_CLICK = "first_click";
    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String OUTCOMES = "outcomes";
    private static final String PAGE_ID = "pageId";
    private static final String PROMPTS = "prompts";
    private static final String TAGS = "tags";
    private static final String URL = "url";
    private static final String URL_TARGET = "url_target";
    private final String actionId;
    private final String clickId;
    private final boolean closingMessage;
    private boolean isFirstClick;
    private final List<f> outcomes;
    private final String pageId;
    private final List<com.onesignal.inAppMessages.internal.prompt.impl.b> prompts;
    private i tags;
    private final String url;
    private wa.k urlTarget;

    public c(JSONObject jSONObject, eb.a aVar) {
        jSONObject.getClass();
        aVar.getClass();
        this.outcomes = new ArrayList();
        this.prompts = new ArrayList();
        this.clickId = jSONObject.optString(ID, null);
        this.actionId = jSONObject.optString(NAME, null);
        this.url = jSONObject.optString(URL, null);
        this.pageId = jSONObject.optString("pageId", null);
        setUrlTarget(wa.k.Companion.fromString(jSONObject.optString(URL_TARGET, null)));
        if (getUrlTarget() == null) {
            setUrlTarget(wa.k.IN_APP_WEBVIEW);
        }
        this.closingMessage = jSONObject.optBoolean(CLOSE, true);
        if (jSONObject.has(OUTCOMES)) {
            parseOutcomes(jSONObject);
        }
        if (jSONObject.has(TAGS)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(TAGS);
            jSONObject2.getClass();
            this.tags = new i(jSONObject2);
        }
        if (jSONObject.has(PROMPTS)) {
            parsePrompts(jSONObject, aVar);
        }
    }

    private final void parseOutcomes(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray(OUTCOMES);
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            List<f> list = this.outcomes;
            Object obj = jSONArray.get(i3);
            obj.getClass();
            list.add(new f((JSONObject) obj));
        }
    }

    private final void parsePrompts(JSONObject jSONObject, eb.a aVar) {
        JSONArray jSONArray = jSONObject.getJSONArray(PROMPTS);
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            String string = jSONArray.getString(i3);
            string.getClass();
            com.onesignal.inAppMessages.internal.prompt.impl.b createPrompt = aVar.createPrompt(string);
            if (createPrompt != null) {
                this.prompts.add(createPrompt);
            }
        }
    }

    @Override // wa.d
    public String getActionId() {
        return this.actionId;
    }

    public final String getClickId() {
        return this.clickId;
    }

    @Override // wa.d
    public boolean getClosingMessage() {
        return this.closingMessage;
    }

    public final List<f> getOutcomes() {
        return this.outcomes;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final List<com.onesignal.inAppMessages.internal.prompt.impl.b> getPrompts() {
        return this.prompts;
    }

    public final i getTags() {
        return this.tags;
    }

    @Override // wa.d
    public String getUrl() {
        return this.url;
    }

    @Override // wa.d
    public wa.k getUrlTarget() {
        return this.urlTarget;
    }

    public final boolean isFirstClick() {
        return this.isFirstClick;
    }

    public final void setFirstClick(boolean z10) {
        this.isFirstClick = z10;
    }

    public final void setTags(i iVar) {
        this.tags = iVar;
    }

    public void setUrlTarget(wa.k kVar) {
        this.urlTarget = kVar;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CLICK_NAME, getActionId());
            jSONObject.put(CLICK_URL, getUrl());
            jSONObject.put(FIRST_CLICK, this.isFirstClick);
            jSONObject.put(CLOSES_MESSAGE, getClosingMessage());
            JSONArray jSONArray = new JSONArray();
            Iterator<f> it = this.outcomes.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toJSONObject());
            }
            jSONObject.put(OUTCOMES, jSONArray);
            i iVar = this.tags;
            if (iVar != null) {
                iVar.getClass();
                jSONObject.put(TAGS, iVar.toJSONObject());
            }
            if (getUrlTarget() != null) {
                jSONObject.put(URL_TARGET, String.valueOf(getUrlTarget()));
            }
            return jSONObject;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return jSONObject;
        }
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
