package com.linecorp.linesdk.openchat;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class OpenChatParameters {

    @NotNull
    private final OpenChatCategory category;

    @NotNull
    private final String creatorDisplayName;

    @NotNull
    private final String description;
    private final boolean isSearchable;

    @NotNull
    private final String name;

    public OpenChatParameters(@NotNull String name, @NotNull String description, @NotNull String creatorDisplayName, @NotNull OpenChatCategory category, boolean z4) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(creatorDisplayName, "creatorDisplayName");
        Intrinsics.checkNotNullParameter(category, "category");
        this.name = name;
        this.description = description;
        this.creatorDisplayName = creatorDisplayName;
        this.category = category;
        this.isSearchable = z4;
        if (name.length() <= 0 || name.length() > 50) {
            throw new IllegalArgumentException("String size needs to be less or equal to 50");
        }
        if (description.length() > 200) {
            throw new IllegalArgumentException("String size needs to be less or equal to 200");
        }
        if (creatorDisplayName.length() <= 0 || creatorDisplayName.length() > 50) {
            throw new IllegalArgumentException("String size needs to be less or equal to 50");
        }
    }

    @NotNull
    public final String toJsonString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", this.name);
            jSONObject.put("description", this.description);
            jSONObject.put("creatorDisplayName", this.creatorDisplayName);
            jSONObject.put("category", this.category.getId());
            jSONObject.put("allowSearch", this.isSearchable);
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "{\n        JSONObject().a…       }.toString()\n    }");
            return jSONObject2;
        } catch (JSONException unused) {
            return "{}";
        }
    }

    public /* synthetic */ OpenChatParameters(String str, String str2, String str3, OpenChatCategory openChatCategory, boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i4 & 8) != 0 ? OpenChatCategory.Game : openChatCategory, (i4 & 16) != 0 ? true : z4);
    }
}
