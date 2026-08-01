package expo.modules.updates.manifest;

import android.net.Uri;
import android.util.Log;
import expo.modules.manifests.core.ExpoUpdatesManifest;
import expo.modules.updates.UpdatesConfiguration;
import expo.modules.updates.UpdatesUtils;
import expo.modules.updates.db.entity.AssetEntity;
import expo.modules.updates.db.entity.UpdateEntity;
import expo.modules.updates.db.enums.UpdateStatus;
import expo.modules.updates.loader.EmbeddedLoader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ExpoUpdatesUpdate.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 ,2\u00020\u0001:\u0001,Bi\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR'\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\u001f\u0010 R!\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b%\u0010&R\u001b\u0010(\u001a\u00020)8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001d\u001a\u0004\b(\u0010*¨\u0006-"}, d2 = {"Lexpo/modules/updates/manifest/ExpoUpdatesUpdate;", "Lexpo/modules/updates/manifest/Update;", "manifest", "Lexpo/modules/manifests/core/ExpoUpdatesManifest;", "id", "Ljava/util/UUID;", UpdatesConfiguration.UPDATES_CONFIGURATION_SCOPE_KEY_KEY, "", "commitTime", "Ljava/util/Date;", UpdatesConfiguration.UPDATES_CONFIGURATION_RUNTIME_VERSION_KEY, "launchAsset", "Lorg/json/JSONObject;", "assets", "Lorg/json/JSONArray;", "extensions", "url", "Landroid/net/Uri;", UpdatesConfiguration.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY, "", "<init>", "(Lexpo/modules/manifests/core/ExpoUpdatesManifest;Ljava/util/UUID;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;Lorg/json/JSONObject;Landroid/net/Uri;Ljava/util/Map;)V", "getManifest", "()Lexpo/modules/manifests/core/ExpoUpdatesManifest;", "updateEntity", "Lexpo/modules/updates/db/entity/UpdateEntity;", "getUpdateEntity", "()Lexpo/modules/updates/db/entity/UpdateEntity;", "updateEntity$delegate", "Lkotlin/Lazy;", "assetHeaders", "getAssetHeaders", "()Ljava/util/Map;", "assetHeaders$delegate", "assetEntityList", "", "Lexpo/modules/updates/db/entity/AssetEntity;", "getAssetEntityList", "()Ljava/util/List;", "assetEntityList$delegate", "isDevelopmentMode", "", "()Z", "isDevelopmentMode$delegate", "Companion", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExpoUpdatesUpdate implements Update {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "Update";

    /* renamed from: assetEntityList$delegate, reason: from kotlin metadata */
    private final Lazy assetEntityList;

    /* renamed from: assetHeaders$delegate, reason: from kotlin metadata */
    private final Lazy assetHeaders;
    private final JSONArray assets;
    private final Date commitTime;
    private final JSONObject extensions;
    private final UUID id;

    /* renamed from: isDevelopmentMode$delegate, reason: from kotlin metadata */
    private final Lazy isDevelopmentMode;
    private final JSONObject launchAsset;
    private final ExpoUpdatesManifest manifest;
    private final Map<String, String> requestHeaders;
    private final String runtimeVersion;
    private final String scopeKey;

    /* renamed from: updateEntity$delegate, reason: from kotlin metadata */
    private final Lazy updateEntity;
    private final Uri url;

    public /* synthetic */ ExpoUpdatesUpdate(ExpoUpdatesManifest expoUpdatesManifest, UUID uuid, String str, Date date, String str2, JSONObject jSONObject, JSONArray jSONArray, JSONObject jSONObject2, Uri uri, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(expoUpdatesManifest, uuid, str, date, str2, jSONObject, jSONArray, jSONObject2, uri, map);
    }

    private ExpoUpdatesUpdate(ExpoUpdatesManifest expoUpdatesManifest, UUID uuid, String str, Date date, String str2, JSONObject jSONObject, JSONArray jSONArray, JSONObject jSONObject2, Uri uri, Map<String, String> map) {
        this.manifest = expoUpdatesManifest;
        this.id = uuid;
        this.scopeKey = str;
        this.commitTime = date;
        this.runtimeVersion = str2;
        this.launchAsset = jSONObject;
        this.assets = jSONArray;
        this.extensions = jSONObject2;
        this.url = uri;
        this.requestHeaders = map;
        this.updateEntity = LazyKt.lazy(new Function0() { // from class: expo.modules.updates.manifest.ExpoUpdatesUpdate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                UpdateEntity updateEntity_delegate$lambda$1;
                updateEntity_delegate$lambda$1 = ExpoUpdatesUpdate.updateEntity_delegate$lambda$1(ExpoUpdatesUpdate.this);
                return updateEntity_delegate$lambda$1;
            }
        });
        this.assetHeaders = LazyKt.lazy(new Function0() { // from class: expo.modules.updates.manifest.ExpoUpdatesUpdate$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Map assetHeaders_delegate$lambda$4;
                assetHeaders_delegate$lambda$4 = ExpoUpdatesUpdate.assetHeaders_delegate$lambda$4(ExpoUpdatesUpdate.this);
                return assetHeaders_delegate$lambda$4;
            }
        });
        this.assetEntityList = LazyKt.lazy(new Function0() { // from class: expo.modules.updates.manifest.ExpoUpdatesUpdate$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List assetEntityList_delegate$lambda$7;
                assetEntityList_delegate$lambda$7 = ExpoUpdatesUpdate.assetEntityList_delegate$lambda$7(ExpoUpdatesUpdate.this);
                return assetEntityList_delegate$lambda$7;
            }
        });
        this.isDevelopmentMode = LazyKt.lazy(new Function0() { // from class: expo.modules.updates.manifest.ExpoUpdatesUpdate$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean isDevelopmentMode_delegate$lambda$8;
                isDevelopmentMode_delegate$lambda$8 = ExpoUpdatesUpdate.isDevelopmentMode_delegate$lambda$8(ExpoUpdatesUpdate.this);
                return Boolean.valueOf(isDevelopmentMode_delegate$lambda$8);
            }
        });
    }

    @Override // expo.modules.updates.manifest.Update
    public ExpoUpdatesManifest getManifest() {
        return this.manifest;
    }

    @Override // expo.modules.updates.manifest.Update
    public UpdateEntity getUpdateEntity() {
        return (UpdateEntity) this.updateEntity.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UpdateEntity updateEntity_delegate$lambda$1(ExpoUpdatesUpdate expoUpdatesUpdate) {
        UpdateEntity updateEntity = new UpdateEntity(expoUpdatesUpdate.id, expoUpdatesUpdate.commitTime, expoUpdatesUpdate.runtimeVersion, expoUpdatesUpdate.scopeKey, expoUpdatesUpdate.getManifest().getRawJson(), expoUpdatesUpdate.url, expoUpdatesUpdate.requestHeaders);
        if (expoUpdatesUpdate.getIsDevelopmentMode()) {
            updateEntity.setStatus(UpdateStatus.DEVELOPMENT);
        }
        return updateEntity;
    }

    private final Map<String, JSONObject> getAssetHeaders() {
        return (Map) this.assetHeaders.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map assetHeaders_delegate$lambda$4(ExpoUpdatesUpdate expoUpdatesUpdate) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = expoUpdatesUpdate.extensions;
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
        }
        if (jSONObject3.has("assetRequestHeaders")) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JSONObject.class);
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                Object string = jSONObject3.getString("assetRequestHeaders");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) string;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                jSONObject = (JSONObject) Double.valueOf(jSONObject3.getDouble("assetRequestHeaders"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                jSONObject = (JSONObject) Integer.valueOf(jSONObject3.getInt("assetRequestHeaders"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                jSONObject = (JSONObject) Long.valueOf(jSONObject3.getLong("assetRequestHeaders"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                jSONObject = (JSONObject) Boolean.valueOf(jSONObject3.getBoolean("assetRequestHeaders"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                Object jSONArray = jSONObject3.getJSONArray("assetRequestHeaders");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) jSONArray;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                jSONObject = jSONObject3.getJSONObject("assetRequestHeaders");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                Object obj = jSONObject3.get("assetRequestHeaders");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            Sequence asSequence = SequencesKt.asSequence(keys);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : asSequence) {
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                String str = (String) obj2;
                KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(JSONObject.class);
                if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(String.class))) {
                    Object string2 = jSONObject.getString(str);
                    if (string2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject2 = (JSONObject) string2;
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                    jSONObject2 = (JSONObject) Double.valueOf(jSONObject.getDouble(str));
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                    jSONObject2 = (JSONObject) Integer.valueOf(jSONObject.getInt(str));
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                    jSONObject2 = (JSONObject) Long.valueOf(jSONObject.getLong(str));
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                    jSONObject2 = (JSONObject) Boolean.valueOf(jSONObject.getBoolean(str));
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                    Object jSONArray2 = jSONObject.getJSONArray(str);
                    if (jSONArray2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject2 = (JSONObject) jSONArray2;
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                    jSONObject2 = jSONObject.getJSONObject(str);
                    if (jSONObject2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                } else {
                    Object obj3 = jSONObject.get(str);
                    if (obj3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject2 = (JSONObject) obj3;
                }
                linkedHashMap2.put(obj2, jSONObject2);
            }
            return linkedHashMap;
        }
        return MapsKt.emptyMap();
    }

    @Override // expo.modules.updates.manifest.Update
    public List<AssetEntity> getAssetEntityList() {
        return (List) this.assetEntityList.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List assetEntityList_delegate$lambda$7(ExpoUpdatesUpdate expoUpdatesUpdate) {
        String str;
        String str2;
        String str3;
        String str4;
        ArrayList arrayList = new ArrayList();
        try {
            String string = expoUpdatesUpdate.launchAsset.getString("key");
            JSONObject jSONObject = expoUpdatesUpdate.launchAsset;
            if (jSONObject.has("fileExtension")) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                    str3 = jSONObject.getString("fileExtension");
                    if (str3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                    str3 = (String) Double.valueOf(jSONObject.getDouble("fileExtension"));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                    str3 = (String) Integer.valueOf(jSONObject.getInt("fileExtension"));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                    str3 = (String) Long.valueOf(jSONObject.getLong("fileExtension"));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                    str3 = (String) Boolean.valueOf(jSONObject.getBoolean("fileExtension"));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                    Object jSONArray = jSONObject.getJSONArray("fileExtension");
                    if (jSONArray == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    str3 = (String) jSONArray;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                    Object jSONObject2 = jSONObject.getJSONObject("fileExtension");
                    if (jSONObject2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    str3 = (String) jSONObject2;
                } else {
                    Object obj = jSONObject.get("fileExtension");
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    str3 = (String) obj;
                }
            } else {
                str3 = null;
            }
            AssetEntity assetEntity = new AssetEntity(string, str3);
            assetEntity.setUrl(Uri.parse(expoUpdatesUpdate.launchAsset.getString("url")));
            assetEntity.setExtraRequestHeaders(expoUpdatesUpdate.getAssetHeaders().get(expoUpdatesUpdate.launchAsset.getString("key")));
            assetEntity.setLaunchAsset(true);
            assetEntity.setEmbeddedAssetFilename(EmbeddedLoader.BUNDLE_FILENAME);
            JSONObject jSONObject3 = expoUpdatesUpdate.launchAsset;
            if (jSONObject3.has("hash")) {
                KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(String.class);
                if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(String.class))) {
                    str4 = jSONObject3.getString("hash");
                    if (str4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                    str4 = (String) Double.valueOf(jSONObject3.getDouble("hash"));
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                    str4 = (String) Integer.valueOf(jSONObject3.getInt("hash"));
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                    str4 = (String) Long.valueOf(jSONObject3.getLong("hash"));
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                    str4 = (String) Boolean.valueOf(jSONObject3.getBoolean("hash"));
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                    Object jSONArray2 = jSONObject3.getJSONArray("hash");
                    if (jSONArray2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    str4 = (String) jSONArray2;
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                    Object jSONObject4 = jSONObject3.getJSONObject("hash");
                    if (jSONObject4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    str4 = (String) jSONObject4;
                } else {
                    Object obj2 = jSONObject3.get("hash");
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    str4 = (String) obj2;
                }
            } else {
                str4 = null;
            }
            assetEntity.setExpectedHash(str4);
            arrayList.add(assetEntity);
        } catch (JSONException e) {
            Log.e(TAG, "Could not read launch asset from manifest", e);
        }
        JSONArray jSONArray3 = expoUpdatesUpdate.assets;
        if (jSONArray3 != null && jSONArray3.length() > 0) {
            int length = expoUpdatesUpdate.assets.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject5 = expoUpdatesUpdate.assets.getJSONObject(i);
                    AssetEntity assetEntity2 = new AssetEntity(jSONObject5.getString("key"), jSONObject5.getString("fileExtension"));
                    assetEntity2.setUrl(Uri.parse(jSONObject5.getString("url")));
                    assetEntity2.setExtraRequestHeaders(expoUpdatesUpdate.getAssetHeaders().get(jSONObject5.getString("key")));
                    Intrinsics.checkNotNull(jSONObject5);
                    if (jSONObject5.has("embeddedAssetFilename")) {
                        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(String.class);
                        if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(String.class))) {
                            str = jSONObject5.getString("embeddedAssetFilename");
                            if (str == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                            str = (String) Double.valueOf(jSONObject5.getDouble("embeddedAssetFilename"));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                            str = (String) Integer.valueOf(jSONObject5.getInt("embeddedAssetFilename"));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                            str = (String) Long.valueOf(jSONObject5.getLong("embeddedAssetFilename"));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                            str = (String) Boolean.valueOf(jSONObject5.getBoolean("embeddedAssetFilename"));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                            Object jSONArray4 = jSONObject5.getJSONArray("embeddedAssetFilename");
                            if (jSONArray4 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            str = (String) jSONArray4;
                        } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                            Object jSONObject6 = jSONObject5.getJSONObject("embeddedAssetFilename");
                            if (jSONObject6 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            str = (String) jSONObject6;
                        } else {
                            Object obj3 = jSONObject5.get("embeddedAssetFilename");
                            if (obj3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            str = (String) obj3;
                        }
                    } else {
                        str = null;
                    }
                    assetEntity2.setEmbeddedAssetFilename(str);
                    if (jSONObject5.has("hash")) {
                        KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(String.class);
                        if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(String.class))) {
                            str2 = jSONObject5.getString("hash");
                            if (str2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                            str2 = (String) Double.valueOf(jSONObject5.getDouble("hash"));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                            str2 = (String) Integer.valueOf(jSONObject5.getInt("hash"));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                            str2 = (String) Long.valueOf(jSONObject5.getLong("hash"));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                            str2 = (String) Boolean.valueOf(jSONObject5.getBoolean("hash"));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                            Object jSONArray5 = jSONObject5.getJSONArray("hash");
                            if (jSONArray5 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            str2 = (String) jSONArray5;
                        } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                            Object jSONObject7 = jSONObject5.getJSONObject("hash");
                            if (jSONObject7 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            str2 = (String) jSONObject7;
                        } else {
                            Object obj4 = jSONObject5.get("hash");
                            if (obj4 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            str2 = (String) obj4;
                        }
                    } else {
                        str2 = null;
                    }
                    assetEntity2.setExpectedHash(str2);
                    arrayList.add(assetEntity2);
                } catch (JSONException e2) {
                    Log.e(TAG, "Could not read asset from manifest", e2);
                }
            }
        }
        return arrayList;
    }

    @Override // expo.modules.updates.manifest.Update
    /* renamed from: isDevelopmentMode */
    public boolean getIsDevelopmentMode() {
        return ((Boolean) this.isDevelopmentMode.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isDevelopmentMode_delegate$lambda$8(ExpoUpdatesUpdate expoUpdatesUpdate) {
        return expoUpdatesUpdate.getManifest().isDevelopmentMode();
    }

    /* compiled from: ExpoUpdatesUpdate.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lexpo/modules/updates/manifest/ExpoUpdatesUpdate$Companion;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "fromExpoUpdatesManifest", "Lexpo/modules/updates/manifest/ExpoUpdatesUpdate;", "manifest", "Lexpo/modules/manifests/core/ExpoUpdatesManifest;", "extensions", "Lorg/json/JSONObject;", "configuration", "Lexpo/modules/updates/UpdatesConfiguration;", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ExpoUpdatesUpdate fromExpoUpdatesManifest(ExpoUpdatesManifest manifest, JSONObject extensions, UpdatesConfiguration configuration) throws JSONException {
            Date date;
            Intrinsics.checkNotNullParameter(manifest, "manifest");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            UUID fromString = UUID.fromString(manifest.getID());
            Intrinsics.checkNotNullExpressionValue(fromString, "fromString(...)");
            String scopeKey = configuration.getScopeKey();
            try {
                date = UpdatesUtils.INSTANCE.parseDateString(manifest.getCreatedAt());
            } catch (ParseException e) {
                Log.e(ExpoUpdatesUpdate.TAG, "Could not parse manifest createdAt string; falling back to current time", e);
                date = new Date();
            }
            return new ExpoUpdatesUpdate(manifest, fromString, scopeKey, date, manifest.getRuntimeVersion(), manifest.getLaunchAsset(), manifest.getAssets(), extensions, configuration.getUpdateUrl(), configuration.getRequestHeaders(), null);
        }
    }
}
