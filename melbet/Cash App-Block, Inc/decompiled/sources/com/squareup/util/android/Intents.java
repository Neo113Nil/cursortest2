package com.squareup.util.android;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ErrorEvent$Status$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientsync.errors.SyncEntityErrorMetadata;
import com.squareup.cash.clientsync.errors.SyncEntityShadowDivergence;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes6.dex */
public abstract class Intents {
    public static SyncEntityShadowDivergence create(String str, Map map, KClass kClass, KClass kClass2, Set set, Set set2) {
        map.getClass();
        kClass.getClass();
        kClass2.getClass();
        set.getClass();
        set2.getClass();
        Set set3 = set;
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(set3, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        for (Object obj : set3) {
            linkedHashMap.put(Emails.getErrorMetadata((SyncEntity) obj), obj);
        }
        Set set4 = set2;
        int mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(set4, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity2 >= 16 ? mapCapacity2 : 16);
        for (Object obj2 : set4) {
            linkedHashMap2.put(Emails.getErrorMetadata((SyncEntity) obj2), obj2);
        }
        int size = set.size();
        int size2 = set2.size();
        int i = 0;
        if (!(set3 instanceof Collection) || !set3.isEmpty()) {
            Iterator it = set3.iterator();
            while (it.hasNext()) {
                if (set2.contains((SyncEntity) it.next()) && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                    throw null;
                }
            }
        }
        int i2 = i;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            SyncEntityErrorMetadata syncEntityErrorMetadata = (SyncEntityErrorMetadata) entry.getKey();
            SyncEntity syncEntity = (SyncEntity) entry.getValue();
            SyncEntity syncEntity2 = (SyncEntity) linkedHashMap2.get(syncEntityErrorMetadata);
            if (syncEntity2 != null && !Intrinsics.areEqual(syncEntity2.entityProto, syncEntity.entityProto)) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        List list = CollectionsKt.toList(linkedHashMap3.keySet());
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : keySet) {
            if (!linkedHashMap2.containsKey((SyncEntityErrorMetadata) obj3)) {
                arrayList.add(obj3);
            }
        }
        Set keySet2 = linkedHashMap2.keySet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : keySet2) {
            if (!linkedHashMap.containsKey((SyncEntityErrorMetadata) obj4)) {
                arrayList2.add(obj4);
            }
        }
        return new SyncEntityShadowDivergence(new SyncEntityShadowDivergence.Metadata(str, map, kClass, kClass2, size, size2, i2, list, arrayList, arrayList2));
    }

    public static ViewEvent.Device fromJsonObject(JsonObject jsonObject) {
        int i;
        ArrayList arrayList;
        JsonArray asJsonArray;
        String asString;
        try {
            JsonElement jsonElement = jsonObject.get("type");
            if (jsonElement != null && (asString = jsonElement.getAsString()) != null) {
                for (int i2 : CameraSelector$$ExternalSyntheticOutline0.values(7)) {
                    if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$25(i2).equals(asString)) {
                        i = i2;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            i = 0;
            JsonElement jsonElement2 = jsonObject.get("name");
            String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
            JsonElement jsonElement3 = jsonObject.get("model");
            String asString3 = jsonElement3 != null ? jsonElement3.getAsString() : null;
            JsonElement jsonElement4 = jsonObject.get("brand");
            String asString4 = jsonElement4 != null ? jsonElement4.getAsString() : null;
            JsonElement jsonElement5 = jsonObject.get("architecture");
            String asString5 = jsonElement5 != null ? jsonElement5.getAsString() : null;
            JsonElement jsonElement6 = jsonObject.get("locale");
            String asString6 = jsonElement6 != null ? jsonElement6.getAsString() : null;
            JsonElement jsonElement7 = jsonObject.get("locales");
            if (jsonElement7 == null || (asJsonArray = jsonElement7.getAsJsonArray()) == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(asJsonArray.size());
                Iterator<JsonElement> it = asJsonArray.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next().getAsString());
                }
                arrayList = arrayList2;
            }
            JsonElement jsonElement8 = jsonObject.get("time_zone");
            String asString7 = jsonElement8 != null ? jsonElement8.getAsString() : null;
            JsonElement jsonElement9 = jsonObject.get("battery_level");
            Number asNumber = jsonElement9 != null ? jsonElement9.getAsNumber() : null;
            JsonElement jsonElement10 = jsonObject.get("power_saving_mode");
            Boolean valueOf = jsonElement10 != null ? Boolean.valueOf(jsonElement10.getAsBoolean()) : null;
            JsonElement jsonElement11 = jsonObject.get("brightness_level");
            return new ViewEvent.Device(i, asString2, asString3, asString4, asString5, asString6, arrayList, asString7, asNumber, valueOf, jsonElement11 != null ? jsonElement11.getAsNumber() : null);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Device", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Device", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Device", e3);
            return null;
        }
    }

    public static final Map intentToErrorReportingMetadata(String str, Intent intent) {
        intent.getClass();
        return BalanceFeedKt$$ExternalSyntheticOutline0.m("Intent", MapsKt__MapsKt.mapOf(new Pair("Action", intent.getAction()), new Pair("Package", intent.getPackage()), new Pair("Failure Reason", str)));
    }

    public static final boolean maybeStartActivity(Context context, Intent intent, Function0 function0) {
        context.getClass();
        intent.getClass();
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            boolean z = e instanceof SecurityException;
            ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
            if (z) {
                IntentLaunchError intentLaunchError = new IntentLaunchError("Intent launch blocked by SecurityException", intentToErrorReportingMetadata("SecurityException", intent), (RuntimeException) e);
                ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
                if (errorReporter == null) {
                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                    return false;
                }
                errorReporter.report(intentLaunchError, defaultSamplingStrategy);
                function0.invoke();
            } else {
                if (!(e instanceof ActivityNotFoundException)) {
                    throw e;
                }
                IntentLaunchError intentLaunchError2 = new IntentLaunchError("No activity can handle intent", intentToErrorReportingMetadata("ActivityNotFound", intent), (RuntimeException) e);
                ErrorReporter errorReporter2 = ErrorReporter.Companion.INSTANCE;
                if (errorReporter2 == null) {
                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                    return false;
                }
                errorReporter2.report(intentLaunchError2, defaultSamplingStrategy);
                function0.invoke();
            }
            return false;
        }
    }

    public static final boolean maybeStartActivityForResult(Activity activity, Intent intent, int i) {
        activity.getClass();
        try {
            activity.startActivityForResult(intent, i);
            return true;
        } catch (Exception e) {
            boolean z = e instanceof SecurityException;
            ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
            if (z) {
                IntentLaunchError intentLaunchError = new IntentLaunchError("Intent launch for result blocked by SecurityException", intentToErrorReportingMetadata("SecurityException", intent), (RuntimeException) e);
                ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
                if (errorReporter == null) {
                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                    return false;
                }
                errorReporter.report(intentLaunchError, defaultSamplingStrategy);
                ToastKt.toast(activity, R.string.no_intent_handler, 1);
            } else {
                if (!(e instanceof ActivityNotFoundException)) {
                    throw e;
                }
                IntentLaunchError intentLaunchError2 = new IntentLaunchError("No activity can handle intent (for result)", intentToErrorReportingMetadata("ActivityNotFound", intent), (RuntimeException) e);
                ErrorReporter errorReporter2 = ErrorReporter.Companion.INSTANCE;
                if (errorReporter2 == null) {
                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                    return false;
                }
                errorReporter2.report(intentLaunchError2, defaultSamplingStrategy);
                ToastKt.toast(activity, R.string.no_intent_handler, 1);
            }
            return false;
        }
    }
}
