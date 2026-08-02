package com.squareup.util;

import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.clientrouting.data.FeatureContextKt;
import com.squareup.cash.clientsync.errors.IllegalSyncValueCardinality;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.util.android.ColorsKt;
import com.squareup.util.android.Emails;
import com.squareup.util.coil.UtilsKt;
import com.squareup.util.compose.ResourcesKt;
import com.squareup.util.compose.ScaledSizeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes4.dex */
public abstract class MathsKt {
    public static IllegalSyncValueCardinality create(String str, List list) {
        str.getClass();
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Emails.getErrorMetadata((SyncEntity) it.next()).toString());
        }
        return new IllegalSyncValueCardinality(new IllegalSyncValueCardinality.Metadata(str, arrayList));
    }

    public static ViewEvent.Dd fromJsonObject(JsonObject jsonObject) {
        ArrayList arrayList;
        JsonObject asJsonObject;
        JsonObject asJsonObject2;
        JsonObject asJsonObject3;
        JsonArray asJsonArray;
        JsonObject asJsonObject4;
        JsonObject asJsonObject5;
        jsonObject.getClass();
        try {
            long asLong = jsonObject.get("format_version").getAsLong();
            JsonElement jsonElement = jsonObject.get("session");
            ViewEvent.DdSession fromJsonObject = (jsonElement == null || (asJsonObject5 = jsonElement.getAsJsonObject()) == null) ? null : Emails.fromJsonObject(asJsonObject5);
            JsonElement jsonElement2 = jsonObject.get(BreadcrumbHelper.Category.CONFIGURATION);
            ViewEvent.Configuration fromJsonObject2 = (jsonElement2 == null || (asJsonObject4 = jsonElement2.getAsJsonObject()) == null) ? null : FeatureContextKt.fromJsonObject(asJsonObject4);
            JsonElement jsonElement3 = jsonObject.get("browser_sdk_version");
            String asString = jsonElement3 != null ? jsonElement3.getAsString() : null;
            JsonElement jsonElement4 = jsonObject.get("sdk_name");
            String asString2 = jsonElement4 != null ? jsonElement4.getAsString() : null;
            long asLong2 = jsonObject.get("document_version").getAsLong();
            JsonElement jsonElement5 = jsonObject.get("page_states");
            if (jsonElement5 == null || (asJsonArray = jsonElement5.getAsJsonArray()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(asJsonArray.size());
                Iterator<JsonElement> it = asJsonArray.iterator();
                while (it.hasNext()) {
                    JsonObject asJsonObject6 = it.next().getAsJsonObject();
                    asJsonObject6.getClass();
                    arrayList.add(UtilsKt.fromJsonObject(asJsonObject6));
                }
            }
            JsonElement jsonElement6 = jsonObject.get("replay_stats");
            ViewEvent.ReplayStats fromJsonObject3 = (jsonElement6 == null || (asJsonObject3 = jsonElement6.getAsJsonObject()) == null) ? null : ScaledSizeKt.fromJsonObject(asJsonObject3);
            JsonElement jsonElement7 = jsonObject.get("cls");
            ViewEvent.DdCls fromJsonObject4 = (jsonElement7 == null || (asJsonObject2 = jsonElement7.getAsJsonObject()) == null) ? null : ColorsKt.fromJsonObject(asJsonObject2);
            JsonElement jsonElement8 = jsonObject.get("profiling");
            ViewEvent.Profiling fromJsonObject5 = (jsonElement8 == null || (asJsonObject = jsonElement8.getAsJsonObject()) == null) ? null : ResourcesKt.fromJsonObject(asJsonObject);
            if (asLong == 2) {
                return new ViewEvent.Dd(fromJsonObject, fromJsonObject2, asString, asString2, asLong2, arrayList, fromJsonObject3, fromJsonObject4, fromJsonObject5);
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Dd", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Dd", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Dd", e3);
            return null;
        }
    }

    public static final float min(float f, float... fArr) {
        for (float f2 : fArr) {
            f = Math.min(f, f2);
        }
        return f;
    }
}
