package com.facebook.appevents.codeless.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class PathComponent {
    public static final Companion Companion = new Companion(null);
    private static final String PATH_CLASS_NAME_KEY = "class_name";
    private static final String PATH_DESCRIPTION_KEY = "description";
    private static final String PATH_HINT_KEY = "hint";
    private static final String PATH_ID_KEY = "id";
    private static final String PATH_INDEX_KEY = "index";
    private static final String PATH_MATCH_BITMASK_KEY = "match_bitmask";
    private static final String PATH_TAG_KEY = "tag";
    private static final String PATH_TEXT_KEY = "text";
    private final String className;
    private final String description;
    private final String hint;
    private final int id;
    private final int index;
    private final int matchBitmask;
    private final String tag;
    private final String text;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public enum MatchBitmaskType {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);

        private final int value;

        MatchBitmaskType(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public PathComponent(JSONObject jSONObject) {
        jSONObject.getClass();
        String string = jSONObject.getString(PATH_CLASS_NAME_KEY);
        string.getClass();
        this.className = string;
        this.index = jSONObject.optInt("index", -1);
        this.id = jSONObject.optInt("id");
        String optString = jSONObject.optString("text");
        optString.getClass();
        this.text = optString;
        String optString2 = jSONObject.optString("tag");
        optString2.getClass();
        this.tag = optString2;
        String optString3 = jSONObject.optString("description");
        optString3.getClass();
        this.description = optString3;
        String optString4 = jSONObject.optString("hint");
        optString4.getClass();
        this.hint = optString4;
        this.matchBitmask = jSONObject.optInt(PATH_MATCH_BITMASK_KEY);
    }

    public final String getClassName() {
        return this.className;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getHint() {
        return this.hint;
    }

    public final int getId() {
        return this.id;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getMatchBitmask() {
        return this.matchBitmask;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getText() {
        return this.text;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
