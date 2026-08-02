package com.squareup.util.android;

import android.content.res.ColorStateList;
import android.graphics.Color;
import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientsync.errors.StorageOperationEntityVersionDowngrade;
import com.squareup.cash.clientsync.errors.StorageOperationErrorMetadata;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.pipeline.EntityStorageOperation;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* loaded from: classes6.dex */
public abstract class ColorsKt {
    public static final ColorStateList colorStateListOf(Pair... pairArr) {
        ArrayList arrayList = new ArrayList(pairArr.length);
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair pair : pairArr) {
            arrayList.add(pair.first);
            arrayList2.add(pair.second);
        }
        return new ColorStateList((int[][]) arrayList.toArray(new int[0][]), CollectionsKt.toIntArray(arrayList2));
    }

    public static StorageOperationEntityVersionDowngrade create(SyncEntity syncEntity, EntityStorageOperation entityStorageOperation) {
        return new StorageOperationEntityVersionDowngrade(new StorageOperationEntityVersionDowngrade.Metadata(Emails.getErrorMetadata(syncEntity), new StorageOperationErrorMetadata(entityStorageOperation)));
    }

    public static ViewEvent.DdCls fromJsonObject(JsonObject jsonObject) {
        try {
            JsonElement jsonElement = jsonObject.get("device_pixel_ratio");
            return new ViewEvent.DdCls(jsonElement != null ? jsonElement.getAsNumber() : null);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type DdCls", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type DdCls", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type DdCls", e3);
            return null;
        }
    }

    public static final int lighten(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        float f = fArr[2] + 0.1f;
        if (f > 1.0f) {
            return i;
        }
        fArr[2] = f;
        return Color.HSVToColor(fArr);
    }
}
