package com.appsflyer.internal.models;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SubscriptionPurchase.kt */
@Metadata(d1 = {"\u0000&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0005\u001a\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0007\"\u0004\b\u0000\u0010\u0001*\u00020\bH\u0002\u001a/\u0010\t\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00010\u000bH\u0002¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"getNullable", "T", "Lorg/json/JSONObject;", "key", "", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Object;", "toList", "", "Lorg/json/JSONArray;", "toObject", "convert", "Lcom/appsflyer/internal/models/Deserialize;", "(Lorg/json/JSONObject;Ljava/lang/String;Lcom/appsflyer/internal/models/Deserialize;)Ljava/lang/Object;", "purchase_prodRelease"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SubscriptionPurchaseKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<T> toList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.get(i));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T toObject(JSONObject jSONObject, String str, Deserialize<T> deserialize) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            return deserialize.fromJson(optJSONObject);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T getNullable(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return (T) jSONObject.get(str);
        }
        return null;
    }
}
