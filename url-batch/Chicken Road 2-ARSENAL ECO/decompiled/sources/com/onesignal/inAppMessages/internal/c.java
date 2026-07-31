package com.onesignal.inAppMessages.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t2.InterfaceC0661a;

/* loaded from: classes.dex */
public final class c implements l2.d {
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
    private l2.k urlTarget;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public c(JSONObject json, InterfaceC0661a promptFactory) {
        kotlin.jvm.internal.i.e(json, "json");
        kotlin.jvm.internal.i.e(promptFactory, "promptFactory");
        this.outcomes = new ArrayList();
        this.prompts = new ArrayList();
        this.clickId = json.optString(ID, null);
        this.actionId = json.optString(NAME, null);
        this.url = json.optString(URL, null);
        this.pageId = json.optString("pageId", null);
        setUrlTarget(l2.k.Companion.fromString(json.optString(URL_TARGET, null)));
        if (getUrlTarget() == null) {
            setUrlTarget(l2.k.IN_APP_WEBVIEW);
        }
        this.closingMessage = json.optBoolean(CLOSE, true);
        if (json.has(OUTCOMES)) {
            parseOutcomes(json);
        }
        if (json.has(TAGS)) {
            JSONObject jSONObject = json.getJSONObject(TAGS);
            kotlin.jvm.internal.i.d(jSONObject, "getJSONObject(...)");
            this.tags = new i(jSONObject);
        }
        if (json.has(PROMPTS)) {
            parsePrompts(json, promptFactory);
        }
    }

    private final void parseOutcomes(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray(OUTCOMES);
        int length = jSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            List<f> list = this.outcomes;
            Object obj = jSONArray.get(i7);
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type org.json.JSONObject");
            list.add(new f((JSONObject) obj));
        }
    }

    private final void parsePrompts(JSONObject jSONObject, InterfaceC0661a interfaceC0661a) {
        JSONArray jSONArray = jSONObject.getJSONArray(PROMPTS);
        int length = jSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            String string = jSONArray.getString(i7);
            kotlin.jvm.internal.i.b(string);
            com.onesignal.inAppMessages.internal.prompt.impl.b createPrompt = interfaceC0661a.createPrompt(string);
            if (createPrompt != null) {
                this.prompts.add(createPrompt);
            }
        }
    }

    @Override // l2.d
    public String getActionId() {
        return this.actionId;
    }

    public final String getClickId() {
        return this.clickId;
    }

    @Override // l2.d
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

    @Override // l2.d
    public String getUrl() {
        return this.url;
    }

    @Override // l2.d
    public l2.k getUrlTarget() {
        return this.urlTarget;
    }

    public final boolean isFirstClick() {
        return this.isFirstClick;
    }

    public final void setFirstClick(boolean z5) {
        this.isFirstClick = z5;
    }

    public final void setTags(i iVar) {
        this.tags = iVar;
    }

    public void setUrlTarget(l2.k kVar) {
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
                kotlin.jvm.internal.i.b(iVar);
                jSONObject.put(TAGS, iVar.toJSONObject());
            }
            if (getUrlTarget() != null) {
                jSONObject.put(URL_TARGET, String.valueOf(getUrlTarget()));
            }
            return jSONObject;
        } catch (JSONException e4) {
            e4.printStackTrace();
            return jSONObject;
        }
    }
}
