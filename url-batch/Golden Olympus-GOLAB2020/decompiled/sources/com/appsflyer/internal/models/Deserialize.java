package com.appsflyer.internal.models;

import kotlin.Metadata;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public interface Deserialize<T> {
    T fromJson(JSONObject jSONObject);
}
