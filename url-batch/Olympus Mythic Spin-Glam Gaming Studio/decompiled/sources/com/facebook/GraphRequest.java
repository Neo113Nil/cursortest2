package com.facebook;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.InternalSettings;
import com.facebook.internal.Logger;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.ironsource.C4901tg;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.device.UserAgentInfo;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.safedk.android.analytics.brandsafety.m;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GraphRequest.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 `2\u00020\u0001:\t^_`abcdefBO\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rB\u0019\b\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010F\u001a\u00020GH\u0002J\u0018\u0010H\u001a\u00020\u00052\u0006\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u001eH\u0002J\u0006\u0010K\u001a\u00020LJ\u0006\u0010M\u001a\u00020NJ\n\u0010O\u001a\u0004\u0018\u00010\u0005H\u0002J\n\u0010P\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010Q\u001a\u00020\u00052\u0006\u0010I\u001a\u00020\u0005H\u0002J\b\u0010R\u001a\u00020\u001eH\u0002J\b\u0010S\u001a\u00020\u001eH\u0002J$\u0010T\u001a\u00020G2\u0006\u0010U\u001a\u00020V2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020Y0XH\u0002J\u000e\u0010Z\u001a\u00020G2\u0006\u0010[\u001a\u00020\u001eJ\b\u0010\\\u001a\u00020\u001eH\u0002J\b\u0010]\u001a\u00020\u0005H\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u0010\u0019R\u0016\u00100\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0017R(\u0010\b\u001a\u0004\u0018\u00010\t2\b\u00102\u001a\u0004\u0018\u00010\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0011\u0010;\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b<\u0010\u0017R\u001c\u0010=\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0011\u0010B\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bC\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0017\"\u0004\bE\u0010\u0019¨\u0006g"}, d2 = {"Lcom/facebook/GraphRequest;", "", SDKConstants.PARAM_ACCESS_TOKEN, "Lcom/facebook/AccessToken;", "graphPath", "", "parameters", "Landroid/os/Bundle;", "httpMethod", "Lcom/facebook/HttpMethod;", "callback", "Lcom/facebook/GraphRequest$Callback;", "version", "(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/GraphRequest$Callback;Ljava/lang/String;)V", "overriddenURL", "Ljava/net/URL;", "(Lcom/facebook/AccessToken;Ljava/net/URL;)V", "getAccessToken", "()Lcom/facebook/AccessToken;", "setAccessToken", "(Lcom/facebook/AccessToken;)V", "batchEntryDependsOn", "getBatchEntryDependsOn", "()Ljava/lang/String;", "setBatchEntryDependsOn", "(Ljava/lang/String;)V", "batchEntryName", "getBatchEntryName", "setBatchEntryName", "batchEntryOmitResultOnSuccess", "", "getBatchEntryOmitResultOnSuccess", "()Z", "setBatchEntryOmitResultOnSuccess", "(Z)V", "getCallback", "()Lcom/facebook/GraphRequest$Callback;", "setCallback", "(Lcom/facebook/GraphRequest$Callback;)V", "forceApplicationRequest", "graphObject", "Lorg/json/JSONObject;", "getGraphObject", "()Lorg/json/JSONObject;", "setGraphObject", "(Lorg/json/JSONObject;)V", "getGraphPath", "setGraphPath", "graphPathWithVersion", "getGraphPathWithVersion", "value", "getHttpMethod", "()Lcom/facebook/HttpMethod;", "setHttpMethod", "(Lcom/facebook/HttpMethod;)V", "getParameters", "()Landroid/os/Bundle;", "setParameters", "(Landroid/os/Bundle;)V", "relativeUrlForBatchedRequest", "getRelativeUrlForBatchedRequest", "tag", "getTag", "()Ljava/lang/Object;", "setTag", "(Ljava/lang/Object;)V", "urlForSingleRequest", "getUrlForSingleRequest", C4901tg.b, "setVersion", "addCommonParameters", "", "appendParametersToBaseUrl", "baseUrl", "isBatch", "executeAndWait", "Lcom/facebook/GraphResponse;", "executeAsync", "Lcom/facebook/GraphRequestAsyncTask;", "getAccessTokenToUseForRequest", "getClientTokenForRequest", "getUrlWithGraphPath", "isApplicationRequest", "isValidGraphRequestForDomain", "serializeToBatch", GraphRequest.BATCH_PARAM, "Lorg/json/JSONArray;", "attachments", "", "Lcom/facebook/GraphRequest$Attachment;", "setForceApplicationRequest", "forceOverride", "shouldForceClientTokenForRequest", "toString", "Attachment", "Callback", "Companion", "GraphJSONArrayCallback", "GraphJSONObjectCallback", "KeyValueSerializer", "OnProgressCallback", "ParcelableResourceWithMimeType", "Serializer", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes13.dex */
public final class GraphRequest {

    @NotNull
    private static final String ACCEPT_LANGUAGE_HEADER = "Accept-Language";

    @NotNull
    public static final String ACCESS_TOKEN_PARAM = "access_token";

    @NotNull
    private static final String ATTACHED_FILES_PARAM = "attached_files";

    @NotNull
    private static final String ATTACHMENT_FILENAME_PREFIX = "file";

    @NotNull
    private static final String BATCH_APP_ID_PARAM = "batch_app_id";

    @NotNull
    private static final String BATCH_BODY_PARAM = "body";

    @NotNull
    private static final String BATCH_ENTRY_DEPENDS_ON_PARAM = "depends_on";

    @NotNull
    private static final String BATCH_ENTRY_NAME_PARAM = "name";

    @NotNull
    private static final String BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM = "omit_response_on_success";

    @NotNull
    private static final String BATCH_METHOD_PARAM = "method";

    @NotNull
    private static final String BATCH_PARAM = "batch";

    @NotNull
    private static final String BATCH_RELATIVE_URL_PARAM = "relative_url";

    @NotNull
    private static final String CAPTION_PARAM = "caption";

    @NotNull
    private static final String CONTENT_ENCODING_HEADER = "Content-Encoding";

    @NotNull
    private static final String CONTENT_TYPE_HEADER = "Content-Type";

    @NotNull
    private static final String DEBUG_KEY = "__debug__";

    @NotNull
    private static final String DEBUG_MESSAGES_KEY = "messages";

    @NotNull
    private static final String DEBUG_MESSAGE_KEY = "message";

    @NotNull
    private static final String DEBUG_MESSAGE_LINK_KEY = "link";

    @NotNull
    private static final String DEBUG_MESSAGE_TYPE_KEY = "type";

    @NotNull
    private static final String DEBUG_PARAM = "debug";

    @NotNull
    private static final String DEBUG_SEVERITY_INFO = "info";

    @NotNull
    private static final String DEBUG_SEVERITY_WARNING = "warning";

    @NotNull
    public static final String FIELDS_PARAM = "fields";

    @NotNull
    private static final String FORMAT_JSON = "json";

    @NotNull
    private static final String FORMAT_PARAM = "format";

    @NotNull
    private static final String ISO_8601_FORMAT_STRING = "yyyy-MM-dd'T'HH:mm:ssZ";
    public static final int MAXIMUM_BATCH_SIZE = 50;

    @NotNull
    private static final String ME = "me";

    @NotNull
    private static final String MIME_BOUNDARY;

    @NotNull
    private static final String MY_FRIENDS = "me/friends";

    @NotNull
    private static final String MY_PHOTOS = "me/photos";

    @NotNull
    private static final String PICTURE_PARAM = "picture";

    @NotNull
    private static final String SDK_ANDROID = "android";

    @NotNull
    private static final String SDK_PARAM = "sdk";

    @NotNull
    private static final String SEARCH = "search";

    @NotNull
    private static final String USER_AGENT_BASE = "FBAndroidSDK";

    @NotNull
    private static final String USER_AGENT_HEADER = "User-Agent";

    @NotNull
    private static final String VIDEOS_SUFFIX = "/videos";

    @Nullable
    private static String defaultBatchApplicationId;

    @Nullable
    private static volatile String userAgent;
    private static final Pattern versionPattern;

    @Nullable
    private AccessToken accessToken;

    @Nullable
    private String batchEntryDependsOn;

    @Nullable
    private String batchEntryName;
    private boolean batchEntryOmitResultOnSuccess;

    @Nullable
    private Callback callback;
    private boolean forceApplicationRequest;

    @Nullable
    private JSONObject graphObject;

    @Nullable
    private String graphPath;

    @Nullable
    private HttpMethod httpMethod;

    @Nullable
    private String overriddenURL;

    @NotNull
    private Bundle parameters;

    @Nullable
    private Object tag;

    @Nullable
    private String version;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final String TAG = GraphRequest.class.getSimpleName();

    /* compiled from: GraphRequest.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/GraphRequest$Callback;", "", "onCompleted", "", "response", "Lcom/facebook/GraphResponse;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface Callback {
        void onCompleted(@NotNull GraphResponse response);
    }

    /* compiled from: GraphRequest.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/facebook/GraphRequest$GraphJSONArrayCallback;", "", "onCompleted", "", "objects", "Lorg/json/JSONArray;", "response", "Lcom/facebook/GraphResponse;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface GraphJSONArrayCallback {
        void onCompleted(@Nullable JSONArray objects, @Nullable GraphResponse response);
    }

    /* compiled from: GraphRequest.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/facebook/GraphRequest$GraphJSONObjectCallback;", "", "onCompleted", "", "obj", "Lorg/json/JSONObject;", "response", "Lcom/facebook/GraphResponse;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface GraphJSONObjectCallback {
        void onCompleted(@Nullable JSONObject obj, @Nullable GraphResponse response);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GraphRequest.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/facebook/GraphRequest$KeyValueSerializer;", "", "writeString", "", "key", "", "value", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    interface KeyValueSerializer {
        void writeString(@NotNull String key, @NotNull String value);
    }

    /* compiled from: GraphRequest.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/facebook/GraphRequest$OnProgressCallback;", "Lcom/facebook/GraphRequest$Callback;", "onProgress", "", "current", "", "max", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface OnProgressCallback extends Callback {
        void onProgress(long current, long max);
    }

    public GraphRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public GraphRequest(@Nullable AccessToken accessToken) {
        this(accessToken, null, null, null, null, null, 62, null);
    }

    public GraphRequest(@Nullable AccessToken accessToken, @Nullable String str) {
        this(accessToken, str, null, null, null, null, 60, null);
    }

    public GraphRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle) {
        this(accessToken, str, bundle, null, null, null, 56, null);
    }

    public GraphRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle, @Nullable HttpMethod httpMethod) {
        this(accessToken, str, bundle, httpMethod, null, null, 48, null);
    }

    public GraphRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle, @Nullable HttpMethod httpMethod, @Nullable Callback callback) {
        this(accessToken, str, bundle, httpMethod, callback, null, 32, null);
    }

    @NotNull
    public static final GraphResponse executeAndWait(@NotNull GraphRequest graphRequest) {
        return INSTANCE.executeAndWait(graphRequest);
    }

    @NotNull
    public static final List<GraphResponse> executeBatchAndWait(@NotNull GraphRequestBatch graphRequestBatch) {
        return INSTANCE.executeBatchAndWait(graphRequestBatch);
    }

    @NotNull
    public static final List<GraphResponse> executeBatchAndWait(@NotNull Collection<GraphRequest> collection) {
        return INSTANCE.executeBatchAndWait(collection);
    }

    @NotNull
    public static final List<GraphResponse> executeBatchAndWait(@NotNull GraphRequest... graphRequestArr) {
        return INSTANCE.executeBatchAndWait(graphRequestArr);
    }

    @NotNull
    public static final GraphRequestAsyncTask executeBatchAsync(@NotNull GraphRequestBatch graphRequestBatch) {
        return INSTANCE.executeBatchAsync(graphRequestBatch);
    }

    @NotNull
    public static final GraphRequestAsyncTask executeBatchAsync(@NotNull Collection<GraphRequest> collection) {
        return INSTANCE.executeBatchAsync(collection);
    }

    @NotNull
    public static final GraphRequestAsyncTask executeBatchAsync(@NotNull GraphRequest... graphRequestArr) {
        return INSTANCE.executeBatchAsync(graphRequestArr);
    }

    @NotNull
    public static final List<GraphResponse> executeConnectionAndWait(@NotNull HttpURLConnection httpURLConnection, @NotNull GraphRequestBatch graphRequestBatch) {
        return INSTANCE.executeConnectionAndWait(httpURLConnection, graphRequestBatch);
    }

    @NotNull
    public static final List<GraphResponse> executeConnectionAndWait(@NotNull HttpURLConnection httpURLConnection, @NotNull Collection<GraphRequest> collection) {
        return INSTANCE.executeConnectionAndWait(httpURLConnection, collection);
    }

    @NotNull
    public static final GraphRequestAsyncTask executeConnectionAsync(@Nullable Handler handler, @NotNull HttpURLConnection httpURLConnection, @NotNull GraphRequestBatch graphRequestBatch) {
        return INSTANCE.executeConnectionAsync(handler, httpURLConnection, graphRequestBatch);
    }

    @NotNull
    public static final GraphRequestAsyncTask executeConnectionAsync(@NotNull HttpURLConnection httpURLConnection, @NotNull GraphRequestBatch graphRequestBatch) {
        return INSTANCE.executeConnectionAsync(httpURLConnection, graphRequestBatch);
    }

    @Nullable
    public static final String getDefaultBatchApplicationId() {
        return INSTANCE.getDefaultBatchApplicationId();
    }

    @NotNull
    public static final GraphRequest newCustomAudienceThirdPartyIdRequest(@Nullable AccessToken accessToken, @NotNull Context context, @Nullable Callback callback) {
        return INSTANCE.newCustomAudienceThirdPartyIdRequest(accessToken, context, callback);
    }

    @NotNull
    public static final GraphRequest newCustomAudienceThirdPartyIdRequest(@Nullable AccessToken accessToken, @NotNull Context context, @Nullable String str, @Nullable Callback callback) {
        return INSTANCE.newCustomAudienceThirdPartyIdRequest(accessToken, context, str, callback);
    }

    @NotNull
    public static final GraphRequest newDeleteObjectRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Callback callback) {
        return INSTANCE.newDeleteObjectRequest(accessToken, str, callback);
    }

    @NotNull
    public static final GraphRequest newGraphPathRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Callback callback) {
        return INSTANCE.newGraphPathRequest(accessToken, str, callback);
    }

    @NotNull
    public static final GraphRequest newMeRequest(@Nullable AccessToken accessToken, @Nullable GraphJSONObjectCallback graphJSONObjectCallback) {
        return INSTANCE.newMeRequest(accessToken, graphJSONObjectCallback);
    }

    @NotNull
    public static final GraphRequest newMyFriendsRequest(@Nullable AccessToken accessToken, @Nullable GraphJSONArrayCallback graphJSONArrayCallback) {
        return INSTANCE.newMyFriendsRequest(accessToken, graphJSONArrayCallback);
    }

    @NotNull
    public static final GraphRequest newPlacesSearchRequest(@Nullable AccessToken accessToken, @Nullable Location location, int i, int i2, @Nullable String str, @Nullable GraphJSONArrayCallback graphJSONArrayCallback) {
        return INSTANCE.newPlacesSearchRequest(accessToken, location, i, i2, str, graphJSONArrayCallback);
    }

    @NotNull
    public static final GraphRequest newPostRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable JSONObject jSONObject, @Nullable Callback callback) {
        return INSTANCE.newPostRequest(accessToken, str, jSONObject, callback);
    }

    @NotNull
    public static final GraphRequest newPostRequestWithBundle(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle, @Nullable Callback callback) {
        return INSTANCE.newPostRequestWithBundle(accessToken, str, bundle, callback);
    }

    @NotNull
    public static final GraphRequest newUploadPhotoRequest(@Nullable AccessToken accessToken, @Nullable String str, @NotNull Bitmap bitmap, @Nullable String str2, @Nullable Bundle bundle, @Nullable Callback callback) {
        return INSTANCE.newUploadPhotoRequest(accessToken, str, bitmap, str2, bundle, callback);
    }

    @NotNull
    public static final GraphRequest newUploadPhotoRequest(@Nullable AccessToken accessToken, @Nullable String str, @NotNull Uri uri, @Nullable String str2, @Nullable Bundle bundle, @Nullable Callback callback) throws FileNotFoundException, FacebookException {
        return INSTANCE.newUploadPhotoRequest(accessToken, str, uri, str2, bundle, callback);
    }

    @NotNull
    public static final GraphRequest newUploadPhotoRequest(@Nullable AccessToken accessToken, @Nullable String str, @NotNull File file, @Nullable String str2, @Nullable Bundle bundle, @Nullable Callback callback) throws FileNotFoundException {
        return INSTANCE.newUploadPhotoRequest(accessToken, str, file, str2, bundle, callback);
    }

    public static final void setDefaultBatchApplicationId(@Nullable String str) {
        INSTANCE.setDefaultBatchApplicationId(str);
    }

    @NotNull
    public static final HttpURLConnection toHttpConnection(@NotNull GraphRequestBatch graphRequestBatch) {
        return INSTANCE.toHttpConnection(graphRequestBatch);
    }

    @NotNull
    public static final HttpURLConnection toHttpConnection(@NotNull Collection<GraphRequest> collection) {
        return INSTANCE.toHttpConnection(collection);
    }

    @NotNull
    public static final HttpURLConnection toHttpConnection(@NotNull GraphRequest... graphRequestArr) {
        return INSTANCE.toHttpConnection(graphRequestArr);
    }

    @Nullable
    public final AccessToken getAccessToken() {
        return this.accessToken;
    }

    public final void setAccessToken(@Nullable AccessToken accessToken) {
        this.accessToken = accessToken;
    }

    @Nullable
    public final String getGraphPath() {
        return this.graphPath;
    }

    public final void setGraphPath(@Nullable String str) {
        this.graphPath = str;
    }

    @Nullable
    public final JSONObject getGraphObject() {
        return this.graphObject;
    }

    public final void setGraphObject(@Nullable JSONObject jSONObject) {
        this.graphObject = jSONObject;
    }

    @Nullable
    public final String getBatchEntryName() {
        return this.batchEntryName;
    }

    public final void setBatchEntryName(@Nullable String str) {
        this.batchEntryName = str;
    }

    @Nullable
    public final String getBatchEntryDependsOn() {
        return this.batchEntryDependsOn;
    }

    public final void setBatchEntryDependsOn(@Nullable String str) {
        this.batchEntryDependsOn = str;
    }

    public final boolean getBatchEntryOmitResultOnSuccess() {
        return this.batchEntryOmitResultOnSuccess;
    }

    public final void setBatchEntryOmitResultOnSuccess(boolean z) {
        this.batchEntryOmitResultOnSuccess = z;
    }

    @NotNull
    public final Bundle getParameters() {
        return this.parameters;
    }

    public final void setParameters(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        this.parameters = bundle;
    }

    @Nullable
    public final Object getTag() {
        return this.tag;
    }

    public final void setTag(@Nullable Object obj) {
        this.tag = obj;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public final void setVersion(@Nullable String str) {
        this.version = str;
    }

    @Nullable
    public final Callback getCallback() {
        return this.callback;
    }

    public final void setCallback(@Nullable final Callback callback) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO) || FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            this.callback = new Callback() { // from class: com.facebook.GraphRequest$$ExternalSyntheticLambda0
                @Override // com.facebook.GraphRequest.Callback
                public final void onCompleted(GraphResponse graphResponse) {
                    GraphRequest.m3300_set_callback_$lambda0(GraphRequest.Callback.this, graphResponse);
                }
            };
        } else {
            this.callback = callback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _set_callback_$lambda-0, reason: not valid java name */
    public static final void m3300_set_callback_$lambda0(Callback callback, GraphResponse response) {
        int length;
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject graphObject = response.getGraphObject();
        JSONObject optJSONObject = graphObject == null ? null : graphObject.optJSONObject(DEBUG_KEY);
        JSONArray optJSONArray = optJSONObject == null ? null : optJSONObject.optJSONArray(DEBUG_MESSAGES_KEY);
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                String optString = optJSONObject2 == null ? null : optJSONObject2.optString("message");
                String optString2 = optJSONObject2 == null ? null : optJSONObject2.optString("type");
                String optString3 = optJSONObject2 == null ? null : optJSONObject2.optString("link");
                if (optString != null && optString2 != null) {
                    LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
                    if (Intrinsics.areEqual(optString2, DEBUG_SEVERITY_WARNING)) {
                        loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
                    }
                    if (!Utility.isNullOrEmpty(optString3)) {
                        optString = ((Object) optString) + " Link: " + ((Object) optString3);
                    }
                    Logger.Companion companion = Logger.INSTANCE;
                    String TAG2 = TAG;
                    Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                    companion.log(loggingBehavior, TAG2, optString);
                }
                if (i2 >= length) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        if (callback == null) {
            return;
        }
        callback.onCompleted(response);
    }

    @Nullable
    public final HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    public final void setHttpMethod(@Nullable HttpMethod httpMethod) {
        if (this.overriddenURL != null && httpMethod != HttpMethod.GET) {
            throw new FacebookException("Can't change HTTP method on request with overridden URL.");
        }
        if (httpMethod == null) {
            httpMethod = HttpMethod.GET;
        }
        this.httpMethod = httpMethod;
    }

    /* compiled from: GraphRequest.kt */
    @Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0007J\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00020<0@2\u0006\u0010A\u001a\u00020BH\u0007J'\u0010?\u001a\b\u0012\u0004\u0012\u00020<0@2\u0012\u0010A\u001a\n\u0012\u0006\b\u0001\u0012\u00020>0C\"\u00020>H\u0007¢\u0006\u0002\u0010DJ\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020<0@2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020>0EH\u0007J\u0010\u0010F\u001a\u00020G2\u0006\u0010A\u001a\u00020BH\u0007J!\u0010F\u001a\u00020G2\u0012\u0010A\u001a\n\u0012\u0006\b\u0001\u0012\u00020>0C\"\u00020>H\u0007¢\u0006\u0002\u0010HJ\u0016\u0010F\u001a\u00020G2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020>0EH\u0007J\u001e\u0010I\u001a\b\u0012\u0004\u0012\u00020<0@2\u0006\u0010J\u001a\u0002082\u0006\u0010A\u001a\u00020BH\u0007J$\u0010I\u001a\b\u0012\u0004\u0012\u00020<0@2\u0006\u0010J\u001a\u0002082\f\u0010A\u001a\b\u0012\u0004\u0012\u00020>0EH\u0007J\"\u0010K\u001a\u00020G2\b\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010J\u001a\u0002082\u0006\u0010A\u001a\u00020BH\u0007J\u0018\u0010K\u001a\u00020G2\u0006\u0010J\u001a\u0002082\u0006\u0010A\u001a\u00020BH\u0007J\u0010\u0010N\u001a\u00020\u00042\u0006\u0010O\u001a\u00020BH\u0002J\n\u0010P\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010Q\u001a\u00020\u00042\b\u0010R\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010S\u001a\u00020T2\u0006\u0010A\u001a\u00020BH\u0002J\u0010\u0010U\u001a\u00020T2\u0006\u0010A\u001a\u00020BH\u0002J\u0010\u0010V\u001a\u00020T2\u0006\u0010W\u001a\u00020\u0004H\u0002J\u0012\u0010X\u001a\u00020T2\b\u0010Y\u001a\u0004\u0018\u00010\u0001H\u0002J\u0012\u0010Z\u001a\u00020T2\b\u0010Y\u001a\u0004\u0018\u00010\u0001H\u0002J$\u0010[\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\u0006\u0010^\u001a\u00020_2\b\u0010`\u001a\u0004\u0018\u00010aH\u0007J.\u0010[\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\u0006\u0010^\u001a\u00020_2\b\u0010b\u001a\u0004\u0018\u00010\u00042\b\u0010`\u001a\u0004\u0018\u00010aH\u0007J&\u0010c\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010d\u001a\u0004\u0018\u00010\u00042\b\u0010`\u001a\u0004\u0018\u00010aH\u0007J&\u0010e\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010R\u001a\u0004\u0018\u00010\u00042\b\u0010`\u001a\u0004\u0018\u00010aH\u0007J\u001c\u0010f\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010`\u001a\u0004\u0018\u00010gH\u0007J\u001c\u0010h\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010`\u001a\u0004\u0018\u00010iH\u0007J@\u0010j\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010k\u001a\u0004\u0018\u00010l2\u0006\u0010m\u001a\u00020 2\u0006\u0010n\u001a\u00020 2\b\u0010o\u001a\u0004\u0018\u00010\u00042\b\u0010`\u001a\u0004\u0018\u00010iH\u0007J0\u0010p\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010R\u001a\u0004\u0018\u00010\u00042\b\u0010q\u001a\u0004\u0018\u00010r2\b\u0010`\u001a\u0004\u0018\u00010aH\u0007J0\u0010s\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010R\u001a\u0004\u0018\u00010\u00042\b\u0010t\u001a\u0004\u0018\u00010u2\b\u0010`\u001a\u0004\u0018\u00010aH\u0007JB\u0010v\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010R\u001a\u0004\u0018\u00010\u00042\u0006\u0010w\u001a\u00020x2\b\u0010y\u001a\u0004\u0018\u00010\u00042\b\u0010z\u001a\u0004\u0018\u00010u2\b\u0010`\u001a\u0004\u0018\u00010aH\u0007JB\u0010v\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010R\u001a\u0004\u0018\u00010\u00042\u0006\u0010{\u001a\u00020|2\b\u0010y\u001a\u0004\u0018\u00010\u00042\b\u0010z\u001a\u0004\u0018\u00010u2\b\u0010`\u001a\u0004\u0018\u00010aH\u0007JB\u0010v\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010R\u001a\u0004\u0018\u00010\u00042\u0006\u0010}\u001a\u00020~2\b\u0010y\u001a\u0004\u0018\u00010\u00042\b\u0010z\u001a\u0004\u0018\u00010u2\b\u0010`\u001a\u0004\u0018\u00010aH\u0007J\u0012\u0010\u007f\u001a\u00020\u00042\b\u0010Y\u001a\u0004\u0018\u00010\u0001H\u0002J$\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0006\u0010q\u001a\u00020r2\u0006\u0010W\u001a\u00020\u00042\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0002J.\u0010\u0084\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0085\u0001\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u00012\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u0086\u0001\u001a\u00020TH\u0002JB\u0010\u0087\u0001\u001a\u00030\u0081\u00012\u0006\u0010A\u001a\u00020B2\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u00012\u0007\u0010\u008a\u0001\u001a\u00020 2\u0006\u00109\u001a\u00020:2\b\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u008d\u0001\u001a\u00020TH\u0002J'\u0010\u008e\u0001\u001a\u00030\u0081\u00012\u0006\u0010A\u001a\u00020B2\r\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020<0@H\u0001¢\u0006\u0003\b\u0090\u0001J+\u0010\u0091\u0001\u001a\u00030\u0081\u00012\u0015\u0010\u0092\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030\u0094\u00010\u0093\u00012\b\u0010\u0082\u0001\u001a\u00030\u0095\u0001H\u0002J%\u0010\u0096\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0097\u0001\u001a\u00020u2\b\u0010\u0082\u0001\u001a\u00030\u0095\u00012\u0006\u0010=\u001a\u00020>H\u0002J9\u0010\u0098\u0001\u001a\u00030\u0081\u00012\b\u0010\u0082\u0001\u001a\u00030\u0095\u00012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020>0E2\u0015\u0010\u0092\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030\u0094\u00010\u0099\u0001H\u0002J \u0010\u009a\u0001\u001a\u00030\u0081\u00012\u0006\u0010A\u001a\u00020B2\u0006\u0010J\u001a\u000208H\u0001¢\u0006\u0003\b\u009b\u0001J\u001b\u0010\u009c\u0001\u001a\u00030\u0081\u00012\u0006\u0010J\u001a\u0002082\u0007\u0010\u008d\u0001\u001a\u00020TH\u0002J\u0014\u0010\u009d\u0001\u001a\u00030\u0081\u00012\b\u0010b\u001a\u0004\u0018\u00010\u0004H\u0007J\u0011\u0010\u009e\u0001\u001a\u0002082\u0006\u0010A\u001a\u00020BH\u0007J#\u0010\u009e\u0001\u001a\u0002082\u0012\u0010A\u001a\n\u0012\u0006\b\u0001\u0012\u00020>0C\"\u00020>H\u0007¢\u0006\u0003\u0010\u009f\u0001J\u0017\u0010\u009e\u0001\u001a\u0002082\f\u0010A\u001a\b\u0012\u0004\u0012\u00020>0EH\u0007J\u0018\u0010 \u0001\u001a\u00030\u0081\u00012\u0006\u0010A\u001a\u00020BH\u0001¢\u0006\u0003\b¡\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010)\u001a\n **\u0004\u0018\u00010\u00040\u00048\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b+\u0010\u0002R\u000e\u0010,\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u00048BX\u0082\u000e¢\u0006\b\n\u0000\u001a\u0004\b4\u00102R\u0016\u00105\u001a\n **\u0004\u0018\u00010606X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006¢\u0001"}, d2 = {"Lcom/facebook/GraphRequest$Companion;", "", "()V", "ACCEPT_LANGUAGE_HEADER", "", "ACCESS_TOKEN_PARAM", "ATTACHED_FILES_PARAM", "ATTACHMENT_FILENAME_PREFIX", "BATCH_APP_ID_PARAM", "BATCH_BODY_PARAM", "BATCH_ENTRY_DEPENDS_ON_PARAM", "BATCH_ENTRY_NAME_PARAM", "BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM", "BATCH_METHOD_PARAM", "BATCH_PARAM", "BATCH_RELATIVE_URL_PARAM", "CAPTION_PARAM", "CONTENT_ENCODING_HEADER", "CONTENT_TYPE_HEADER", "DEBUG_KEY", "DEBUG_MESSAGES_KEY", "DEBUG_MESSAGE_KEY", "DEBUG_MESSAGE_LINK_KEY", "DEBUG_MESSAGE_TYPE_KEY", "DEBUG_PARAM", "DEBUG_SEVERITY_INFO", "DEBUG_SEVERITY_WARNING", "FIELDS_PARAM", "FORMAT_JSON", "FORMAT_PARAM", "ISO_8601_FORMAT_STRING", "MAXIMUM_BATCH_SIZE", "", "ME", "MIME_BOUNDARY", "MY_FRIENDS", "MY_PHOTOS", "PICTURE_PARAM", "SDK_ANDROID", "SDK_PARAM", ViewHierarchyConstants.SEARCH, "TAG", "kotlin.jvm.PlatformType", "getTAG$facebook_core_release$annotations", "USER_AGENT_BASE", "USER_AGENT_HEADER", "VIDEOS_SUFFIX", "defaultBatchApplicationId", "mimeContentType", "getMimeContentType", "()Ljava/lang/String;", UserAgentInfo.CACHE_USER_AGENT_VALUE_KEY, "getUserAgent", "versionPattern", "Ljava/util/regex/Pattern;", "createConnection", "Ljava/net/HttpURLConnection;", "url", "Ljava/net/URL;", "executeAndWait", "Lcom/facebook/GraphResponse;", "request", "Lcom/facebook/GraphRequest;", "executeBatchAndWait", "", "requests", "Lcom/facebook/GraphRequestBatch;", "", "([Lcom/facebook/GraphRequest;)Ljava/util/List;", "", "executeBatchAsync", "Lcom/facebook/GraphRequestAsyncTask;", "([Lcom/facebook/GraphRequest;)Lcom/facebook/GraphRequestAsyncTask;", "executeConnectionAndWait", "connection", "executeConnectionAsync", "callbackHandler", "Landroid/os/Handler;", "getBatchAppId", GraphRequest.BATCH_PARAM, "getDefaultBatchApplicationId", "getDefaultPhotoPathIfNull", "graphPath", "hasOnProgressCallbacks", "", "isGzipCompressible", "isMeRequest", "path", "isSupportedAttachmentType", "value", "isSupportedParameterType", "newCustomAudienceThirdPartyIdRequest", SDKConstants.PARAM_ACCESS_TOKEN, "Lcom/facebook/AccessToken;", "context", "Landroid/content/Context;", "callback", "Lcom/facebook/GraphRequest$Callback;", "applicationId", "newDeleteObjectRequest", "id", "newGraphPathRequest", "newMeRequest", "Lcom/facebook/GraphRequest$GraphJSONObjectCallback;", "newMyFriendsRequest", "Lcom/facebook/GraphRequest$GraphJSONArrayCallback;", "newPlacesSearchRequest", "location", "Landroid/location/Location;", "radiusInMeters", "resultsLimit", "searchText", "newPostRequest", "graphObject", "Lorg/json/JSONObject;", "newPostRequestWithBundle", "parameters", "Landroid/os/Bundle;", "newUploadPhotoRequest", "image", "Landroid/graphics/Bitmap;", "caption", "params", "photoUri", "Landroid/net/Uri;", "file", "Ljava/io/File;", "parameterToString", "processGraphObject", "", "serializer", "Lcom/facebook/GraphRequest$KeyValueSerializer;", "processGraphObjectProperty", "key", "passByValue", "processRequest", "logger", "Lcom/facebook/internal/Logger;", "numRequests", "outputStream", "Ljava/io/OutputStream;", "shouldUseGzip", "runCallbacks", "responses", "runCallbacks$facebook_core_release", "serializeAttachments", "attachments", "", "Lcom/facebook/GraphRequest$Attachment;", "Lcom/facebook/GraphRequest$Serializer;", "serializeParameters", POBConstants.KEY_BUNDLE, "serializeRequestsAsJSON", "", "serializeToUrlConnection", "serializeToUrlConnection$facebook_core_release", "setConnectionContentType", "setDefaultBatchApplicationId", "toHttpConnection", "([Lcom/facebook/GraphRequest;)Ljava/net/HttpURLConnection;", "validateFieldsParamForGetRequests", "validateFieldsParamForGetRequests$facebook_core_release", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void getTAG$facebook_core_release$annotations() {
        }

        private Companion() {
        }

        @Nullable
        public final String getDefaultBatchApplicationId() {
            return GraphRequest.defaultBatchApplicationId;
        }

        public final void setDefaultBatchApplicationId(@Nullable String applicationId) {
            GraphRequest.defaultBatchApplicationId = applicationId;
        }

        @NotNull
        public final GraphRequest newDeleteObjectRequest(@Nullable AccessToken accessToken, @Nullable String id, @Nullable Callback callback) {
            return new GraphRequest(accessToken, id, null, HttpMethod.DELETE, callback, null, 32, null);
        }

        @NotNull
        public final GraphRequest newMeRequest(@Nullable AccessToken accessToken, @Nullable final GraphJSONObjectCallback callback) {
            return new GraphRequest(accessToken, "me", null, null, new Callback() { // from class: com.facebook.GraphRequest$Companion$$ExternalSyntheticLambda1
                @Override // com.facebook.GraphRequest.Callback
                public final void onCompleted(GraphResponse graphResponse) {
                    GraphRequest.Companion.m3303newMeRequest$lambda0(GraphRequest.GraphJSONObjectCallback.this, graphResponse);
                }
            }, null, 32, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: newMeRequest$lambda-0, reason: not valid java name */
        public static final void m3303newMeRequest$lambda0(GraphJSONObjectCallback graphJSONObjectCallback, GraphResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (graphJSONObjectCallback == null) {
                return;
            }
            graphJSONObjectCallback.onCompleted(response.getGraphObject(), response);
        }

        @NotNull
        public final GraphRequest newPostRequest(@Nullable AccessToken accessToken, @Nullable String graphPath, @Nullable JSONObject graphObject, @Nullable Callback callback) {
            GraphRequest graphRequest = new GraphRequest(accessToken, graphPath, null, HttpMethod.POST, callback, null, 32, null);
            graphRequest.setGraphObject(graphObject);
            return graphRequest;
        }

        @NotNull
        public final GraphRequest newPostRequestWithBundle(@Nullable AccessToken accessToken, @Nullable String graphPath, @Nullable Bundle parameters, @Nullable Callback callback) {
            return new GraphRequest(accessToken, graphPath, parameters, HttpMethod.POST, callback, null, 32, null);
        }

        @NotNull
        public final GraphRequest newMyFriendsRequest(@Nullable AccessToken accessToken, @Nullable final GraphJSONArrayCallback callback) {
            return new GraphRequest(accessToken, GraphRequest.MY_FRIENDS, null, null, new Callback() { // from class: com.facebook.GraphRequest$Companion$newMyFriendsRequest$wrapper$1
                @Override // com.facebook.GraphRequest.Callback
                public void onCompleted(@NotNull GraphResponse response) {
                    Intrinsics.checkNotNullParameter(response, "response");
                    if (GraphRequest.GraphJSONArrayCallback.this != null) {
                        JSONObject graphObject = response.getGraphObject();
                        GraphRequest.GraphJSONArrayCallback.this.onCompleted(graphObject == null ? null : graphObject.optJSONArray("data"), response);
                    }
                }
            }, null, 32, null);
        }

        @NotNull
        public final GraphRequest newGraphPathRequest(@Nullable AccessToken accessToken, @Nullable String graphPath, @Nullable Callback callback) {
            return new GraphRequest(accessToken, graphPath, null, null, callback, null, 32, null);
        }

        @NotNull
        public final GraphRequest newPlacesSearchRequest(@Nullable AccessToken accessToken, @Nullable Location location, int radiusInMeters, int resultsLimit, @Nullable String searchText, @Nullable final GraphJSONArrayCallback callback) {
            if (location == null && Utility.isNullOrEmpty(searchText)) {
                throw new FacebookException("Either location or searchText must be specified.");
            }
            Bundle bundle = new Bundle(5);
            bundle.putString("type", "place");
            bundle.putInt("limit", resultsLimit);
            if (location != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.US, "%f,%f", Arrays.copyOf(new Object[]{Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                bundle.putString("center", format);
                bundle.putInt("distance", radiusInMeters);
            }
            if (!Utility.isNullOrEmpty(searchText)) {
                bundle.putString(CampaignEx.JSON_KEY_AD_Q, searchText);
            }
            return new GraphRequest(accessToken, "search", bundle, HttpMethod.GET, new Callback() { // from class: com.facebook.GraphRequest$Companion$$ExternalSyntheticLambda0
                @Override // com.facebook.GraphRequest.Callback
                public final void onCompleted(GraphResponse graphResponse) {
                    GraphRequest.Companion.m3304newPlacesSearchRequest$lambda1(GraphRequest.GraphJSONArrayCallback.this, graphResponse);
                }
            }, null, 32, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: newPlacesSearchRequest$lambda-1, reason: not valid java name */
        public static final void m3304newPlacesSearchRequest$lambda1(GraphJSONArrayCallback graphJSONArrayCallback, GraphResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (graphJSONArrayCallback != null) {
                JSONObject graphObject = response.getGraphObject();
                graphJSONArrayCallback.onCompleted(graphObject == null ? null : graphObject.optJSONArray("data"), response);
            }
        }

        @NotNull
        public final GraphRequest newUploadPhotoRequest(@Nullable AccessToken accessToken, @Nullable String graphPath, @NotNull Bitmap image, @Nullable String caption, @Nullable Bundle params, @Nullable Callback callback) {
            Intrinsics.checkNotNullParameter(image, "image");
            Bundle bundle = new Bundle();
            if (params != null) {
                bundle.putAll(params);
            }
            bundle.putParcelable("picture", image);
            if (caption != null && caption.length() > 0) {
                bundle.putString("caption", caption);
            }
            return new GraphRequest(accessToken, getDefaultPhotoPathIfNull(graphPath), bundle, HttpMethod.POST, callback, null, 32, null);
        }

        @NotNull
        public final GraphRequest newUploadPhotoRequest(@Nullable AccessToken accessToken, @Nullable String graphPath, @NotNull File file, @Nullable String caption, @Nullable Bundle params, @Nullable Callback callback) throws FileNotFoundException {
            Intrinsics.checkNotNullParameter(file, "file");
            ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
            Bundle bundle = new Bundle();
            if (params != null) {
                bundle.putAll(params);
            }
            bundle.putParcelable("picture", open);
            if (caption != null && caption.length() > 0) {
                bundle.putString("caption", caption);
            }
            return new GraphRequest(accessToken, getDefaultPhotoPathIfNull(graphPath), bundle, HttpMethod.POST, callback, null, 32, null);
        }

        @NotNull
        public final GraphRequest newUploadPhotoRequest(@Nullable AccessToken accessToken, @Nullable String graphPath, @NotNull Uri photoUri, @Nullable String caption, @Nullable Bundle params, @Nullable Callback callback) throws FileNotFoundException, FacebookException {
            Intrinsics.checkNotNullParameter(photoUri, "photoUri");
            if (Utility.isFileUri(photoUri)) {
                return newUploadPhotoRequest(accessToken, graphPath, new File(photoUri.getPath()), caption, params, callback);
            }
            if (!Utility.isContentUri(photoUri)) {
                throw new FacebookException("The photo Uri must be either a file:// or content:// Uri");
            }
            Bundle bundle = new Bundle();
            if (params != null) {
                bundle.putAll(params);
            }
            bundle.putParcelable("picture", photoUri);
            if (caption != null && caption.length() > 0) {
                bundle.putString("caption", caption);
            }
            return new GraphRequest(accessToken, getDefaultPhotoPathIfNull(graphPath), bundle, HttpMethod.POST, callback, null, 32, null);
        }

        @NotNull
        public final GraphRequest newCustomAudienceThirdPartyIdRequest(@Nullable AccessToken accessToken, @NotNull Context context, @Nullable String applicationId, @Nullable Callback callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (applicationId == null && accessToken != null) {
                applicationId = accessToken.getApplicationId();
            }
            if (applicationId == null) {
                applicationId = Utility.getMetadataApplicationId(context);
            }
            if (applicationId == null) {
                throw new FacebookException("Facebook App ID cannot be determined");
            }
            String stringPlus = Intrinsics.stringPlus(applicationId, "/custom_audience_third_party_id");
            AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.INSTANCE.getAttributionIdentifiers(context);
            Bundle bundle = new Bundle();
            if (accessToken == null) {
                if (attributionIdentifiers == null) {
                    throw new FacebookException("There is no access token and attribution identifiers could not be retrieved");
                }
                String attributionId = attributionIdentifiers.getAttributionId() != null ? attributionIdentifiers.getAttributionId() : attributionIdentifiers.getAndroidAdvertiserId();
                if (attributionId != null) {
                    bundle.putString("udid", attributionId);
                }
            }
            if (FacebookSdk.getLimitEventAndDataUsage(context) || (attributionIdentifiers != null && attributionIdentifiers.getIsTrackingLimited())) {
                bundle.putString("limit_event_usage", "1");
            }
            return new GraphRequest(accessToken, stringPlus, bundle, HttpMethod.GET, callback, null, 32, null);
        }

        @NotNull
        public final GraphRequest newCustomAudienceThirdPartyIdRequest(@Nullable AccessToken accessToken, @NotNull Context context, @Nullable Callback callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            return newCustomAudienceThirdPartyIdRequest(accessToken, context, null, callback);
        }

        @NotNull
        public final HttpURLConnection toHttpConnection(@NotNull GraphRequest... requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return toHttpConnection(ArraysKt.toList(requests));
        }

        @NotNull
        public final HttpURLConnection toHttpConnection(@NotNull Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Validate.notEmpty(requests, "requests");
            return toHttpConnection(new GraphRequestBatch(requests));
        }

        @NotNull
        public final HttpURLConnection toHttpConnection(@NotNull GraphRequestBatch requests) {
            URL url;
            Intrinsics.checkNotNullParameter(requests, "requests");
            validateFieldsParamForGetRequests$facebook_core_release(requests);
            try {
                if (requests.size() == 1) {
                    url = new URL(requests.get(0).getUrlForSingleRequest());
                } else {
                    url = new URL(ServerProtocol.getGraphUrlBase());
                }
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = createConnection(url);
                    serializeToUrlConnection$facebook_core_release(requests, httpURLConnection);
                    return httpURLConnection;
                } catch (IOException e) {
                    Utility.disconnectQuietly(httpURLConnection);
                    throw new FacebookException("could not construct request body", e);
                } catch (JSONException e2) {
                    Utility.disconnectQuietly(httpURLConnection);
                    throw new FacebookException("could not construct request body", e2);
                }
            } catch (MalformedURLException e3) {
                throw new FacebookException("could not construct URL for request", e3);
            }
        }

        @NotNull
        public final GraphResponse executeAndWait(@NotNull GraphRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            List<GraphResponse> executeBatchAndWait = executeBatchAndWait(request);
            if (executeBatchAndWait.size() != 1) {
                throw new FacebookException("invalid state: expected a single response");
            }
            return executeBatchAndWait.get(0);
        }

        @NotNull
        public final List<GraphResponse> executeBatchAndWait(@NotNull GraphRequest... requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return executeBatchAndWait(ArraysKt.toList(requests));
        }

        @NotNull
        public final List<GraphResponse> executeBatchAndWait(@NotNull Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return executeBatchAndWait(new GraphRequestBatch(requests));
        }

        @NotNull
        public final List<GraphResponse> executeBatchAndWait(@NotNull GraphRequestBatch requests) {
            Exception exc;
            HttpURLConnection httpURLConnection;
            List<GraphResponse> list;
            Intrinsics.checkNotNullParameter(requests, "requests");
            Validate.notEmptyAndContainsNoNulls(requests, "requests");
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = toHttpConnection(requests);
                exc = null;
            } catch (Exception e) {
                exc = e;
                httpURLConnection = null;
            } catch (Throwable th) {
                th = th;
                Utility.disconnectQuietly(httpURLConnection2);
                throw th;
            }
            try {
                if (httpURLConnection != null) {
                    list = executeConnectionAndWait(httpURLConnection, requests);
                } else {
                    List<GraphResponse> constructErrorResponses = GraphResponse.INSTANCE.constructErrorResponses(requests.getRequests(), null, new FacebookException(exc));
                    runCallbacks$facebook_core_release(requests, constructErrorResponses);
                    list = constructErrorResponses;
                }
                Utility.disconnectQuietly(httpURLConnection);
                return list;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                Utility.disconnectQuietly(httpURLConnection2);
                throw th;
            }
        }

        @NotNull
        public final GraphRequestAsyncTask executeBatchAsync(@NotNull GraphRequest... requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return executeBatchAsync(ArraysKt.toList(requests));
        }

        @NotNull
        public final GraphRequestAsyncTask executeBatchAsync(@NotNull Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return executeBatchAsync(new GraphRequestBatch(requests));
        }

        @NotNull
        public final GraphRequestAsyncTask executeBatchAsync(@NotNull GraphRequestBatch requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Validate.notEmptyAndContainsNoNulls(requests, "requests");
            GraphRequestAsyncTask graphRequestAsyncTask = new GraphRequestAsyncTask(requests);
            graphRequestAsyncTask.executeOnExecutor(FacebookSdk.getExecutor(), new Void[0]);
            return graphRequestAsyncTask;
        }

        @NotNull
        public final List<GraphResponse> executeConnectionAndWait(@NotNull HttpURLConnection connection, @NotNull Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            return executeConnectionAndWait(connection, new GraphRequestBatch(requests));
        }

        @NotNull
        public final List<GraphResponse> executeConnectionAndWait(@NotNull HttpURLConnection connection, @NotNull GraphRequestBatch requests) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            List<GraphResponse> fromHttpConnection$facebook_core_release = GraphResponse.INSTANCE.fromHttpConnection$facebook_core_release(connection, requests);
            Utility.disconnectQuietly(connection);
            int size = requests.size();
            if (size != fromHttpConnection$facebook_core_release.size()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(fromHttpConnection$facebook_core_release.size()), Integer.valueOf(size)}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                throw new FacebookException(format);
            }
            runCallbacks$facebook_core_release(requests, fromHttpConnection$facebook_core_release);
            AccessTokenManager.INSTANCE.getInstance().extendAccessTokenIfNeeded();
            return fromHttpConnection$facebook_core_release;
        }

        @NotNull
        public final GraphRequestAsyncTask executeConnectionAsync(@NotNull HttpURLConnection connection, @NotNull GraphRequestBatch requests) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            return executeConnectionAsync(null, connection, requests);
        }

        @NotNull
        public final GraphRequestAsyncTask executeConnectionAsync(@Nullable Handler callbackHandler, @NotNull HttpURLConnection connection, @NotNull GraphRequestBatch requests) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            GraphRequestAsyncTask graphRequestAsyncTask = new GraphRequestAsyncTask(connection, requests);
            requests.setCallbackHandler(callbackHandler);
            graphRequestAsyncTask.executeOnExecutor(FacebookSdk.getExecutor(), new Void[0]);
            return graphRequestAsyncTask;
        }

        public final void runCallbacks$facebook_core_release(@NotNull final GraphRequestBatch requests, @NotNull List<GraphResponse> responses) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Intrinsics.checkNotNullParameter(responses, "responses");
            int size = requests.size();
            final ArrayList arrayList = new ArrayList();
            if (size > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    GraphRequest graphRequest = requests.get(i);
                    if (graphRequest.getCallback() != null) {
                        arrayList.add(new Pair(graphRequest.getCallback(), responses.get(i)));
                    }
                    if (i2 >= size) {
                        break;
                    } else {
                        i = i2;
                    }
                }
            }
            if (arrayList.size() > 0) {
                Runnable runnable = new Runnable() { // from class: com.facebook.GraphRequest$Companion$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        GraphRequest.Companion.m3305runCallbacks$lambda2(arrayList, requests);
                    }
                };
                Handler callbackHandler = requests.getCallbackHandler();
                if ((callbackHandler == null ? null : Boolean.valueOf(callbackHandler.post(runnable))) == null) {
                    runnable.run();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: runCallbacks$lambda-2, reason: not valid java name */
        public static final void m3305runCallbacks$lambda2(ArrayList callbacks, GraphRequestBatch requests) {
            Intrinsics.checkNotNullParameter(callbacks, "$callbacks");
            Intrinsics.checkNotNullParameter(requests, "$requests");
            Iterator it = callbacks.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Callback callback = (Callback) pair.first;
                Object obj = pair.second;
                Intrinsics.checkNotNullExpressionValue(obj, "pair.second");
                callback.onCompleted((GraphResponse) obj);
            }
            Iterator<GraphRequestBatch.Callback> it2 = requests.getCallbacks().iterator();
            while (it2.hasNext()) {
                it2.next().onBatchCompleted(requests);
            }
        }

        private final String getDefaultPhotoPathIfNull(String graphPath) {
            return graphPath == null ? GraphRequest.MY_PHOTOS : graphPath;
        }

        private final HttpURLConnection createConnection(URL url) throws IOException {
            URLConnection openConnection = url.openConnection();
            if (openConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestProperty("User-Agent", getUserAgent());
            httpURLConnection.setRequestProperty(GraphRequest.ACCEPT_LANGUAGE_HEADER, Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        private final boolean hasOnProgressCallbacks(GraphRequestBatch requests) {
            Iterator<GraphRequestBatch.Callback> it = requests.getCallbacks().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof GraphRequestBatch.OnProgressCallback) {
                    return true;
                }
            }
            Iterator<GraphRequest> it2 = requests.iterator();
            while (it2.hasNext()) {
                if (it2.next().getCallback() instanceof OnProgressCallback) {
                    return true;
                }
            }
            return false;
        }

        private final void setConnectionContentType(HttpURLConnection connection, boolean shouldUseGzip) {
            if (shouldUseGzip) {
                connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                connection.setRequestProperty(GraphRequest.CONTENT_ENCODING_HEADER, "gzip");
            } else {
                connection.setRequestProperty("Content-Type", getMimeContentType());
            }
        }

        private final boolean isGzipCompressible(GraphRequestBatch requests) {
            Iterator<GraphRequest> it = requests.iterator();
            while (it.hasNext()) {
                GraphRequest next = it.next();
                Iterator<String> it2 = next.getParameters().keySet().iterator();
                while (it2.hasNext()) {
                    if (isSupportedAttachmentType(next.getParameters().get(it2.next()))) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final void validateFieldsParamForGetRequests$facebook_core_release(@NotNull GraphRequestBatch requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Iterator<GraphRequest> it = requests.iterator();
            while (it.hasNext()) {
                GraphRequest next = it.next();
                if (HttpMethod.GET == next.getHttpMethod()) {
                    Utility utility = Utility.INSTANCE;
                    if (Utility.isNullOrEmpty(next.getParameters().getString(GraphRequest.FIELDS_PARAM))) {
                        Logger.Companion companion = Logger.INSTANCE;
                        LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                        StringBuilder sb = new StringBuilder();
                        sb.append("GET requests for /");
                        String graphPath = next.getGraphPath();
                        if (graphPath == null) {
                            graphPath = "";
                        }
                        sb.append(graphPath);
                        sb.append(" should contain an explicit \"fields\" parameter.");
                        companion.log(loggingBehavior, 5, "Request", sb.toString());
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void serializeToUrlConnection$facebook_core_release(@NotNull GraphRequestBatch requests, @NotNull HttpURLConnection connection) throws IOException, JSONException {
            OutputStream outputStream;
            Intrinsics.checkNotNullParameter(requests, "requests");
            Intrinsics.checkNotNullParameter(connection, "connection");
            Logger logger = new Logger(LoggingBehavior.REQUESTS, "Request");
            int size = requests.size();
            boolean isGzipCompressible = isGzipCompressible(requests);
            OutputStream outputStream2 = null;
            HttpMethod httpMethod = size == 1 ? requests.get(0).getHttpMethod() : null;
            if (httpMethod == null) {
                httpMethod = HttpMethod.POST;
            }
            connection.setRequestMethod(httpMethod.name());
            setConnectionContentType(connection, isGzipCompressible);
            URL url = connection.getURL();
            logger.append("Request:\n");
            logger.appendKeyValue("Id", requests.getId());
            Intrinsics.checkNotNullExpressionValue(url, "url");
            logger.appendKeyValue("URL", url);
            Object requestMethod = connection.getRequestMethod();
            Intrinsics.checkNotNullExpressionValue(requestMethod, "connection.requestMethod");
            logger.appendKeyValue("Method", requestMethod);
            Object requestProperty = connection.getRequestProperty("User-Agent");
            Intrinsics.checkNotNullExpressionValue(requestProperty, "connection.getRequestProperty(\"User-Agent\")");
            logger.appendKeyValue("User-Agent", requestProperty);
            Object requestProperty2 = connection.getRequestProperty("Content-Type");
            Intrinsics.checkNotNullExpressionValue(requestProperty2, "connection.getRequestProperty(\"Content-Type\")");
            logger.appendKeyValue("Content-Type", requestProperty2);
            connection.setConnectTimeout(requests.getTimeoutInMilliseconds());
            connection.setReadTimeout(requests.getTimeoutInMilliseconds());
            if (httpMethod != HttpMethod.POST) {
                logger.log();
                return;
            }
            connection.setDoOutput(true);
            try {
                OutputStream bufferedOutputStream = new BufferedOutputStream(connection.getOutputStream());
                if (isGzipCompressible) {
                    try {
                        outputStream2 = new GZIPOutputStream(bufferedOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        outputStream2 = bufferedOutputStream;
                        if (outputStream2 != null) {
                            outputStream2.close();
                        }
                        throw th;
                    }
                } else {
                    outputStream2 = bufferedOutputStream;
                }
                if (hasOnProgressCallbacks(requests)) {
                    ProgressNoopOutputStream progressNoopOutputStream = new ProgressNoopOutputStream(requests.getCallbackHandler());
                    processRequest(requests, null, size, url, progressNoopOutputStream, isGzipCompressible);
                    outputStream = new ProgressOutputStream(outputStream2, requests, progressNoopOutputStream.getProgressMap(), progressNoopOutputStream.getMaxProgress());
                } else {
                    outputStream = outputStream2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                processRequest(requests, logger, size, url, outputStream, isGzipCompressible);
                outputStream.close();
                logger.log();
            } catch (Throwable th3) {
                th = th3;
                outputStream2 = outputStream;
                if (outputStream2 != null) {
                }
                throw th;
            }
        }

        private final void processRequest(GraphRequestBatch requests, Logger logger, int numRequests, URL url, OutputStream outputStream, boolean shouldUseGzip) {
            Serializer serializer = new Serializer(outputStream, logger, shouldUseGzip);
            if (numRequests == 1) {
                GraphRequest graphRequest = requests.get(0);
                HashMap hashMap = new HashMap();
                for (String key : graphRequest.getParameters().keySet()) {
                    Object obj = graphRequest.getParameters().get(key);
                    if (isSupportedAttachmentType(obj)) {
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        hashMap.put(key, new Attachment(graphRequest, obj));
                    }
                }
                if (logger != null) {
                    logger.append("  Parameters:\n");
                }
                serializeParameters(graphRequest.getParameters(), serializer, graphRequest);
                if (logger != null) {
                    logger.append("  Attachments:\n");
                }
                serializeAttachments(hashMap, serializer);
                JSONObject graphObject = graphRequest.getGraphObject();
                if (graphObject != null) {
                    String path = url.getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "url.path");
                    processGraphObject(graphObject, path, serializer);
                    return;
                }
                return;
            }
            String batchAppId = getBatchAppId(requests);
            if (batchAppId.length() == 0) {
                throw new FacebookException("App ID was not specified at the request or Settings.");
            }
            serializer.writeString(GraphRequest.BATCH_APP_ID_PARAM, batchAppId);
            HashMap hashMap2 = new HashMap();
            serializeRequestsAsJSON(serializer, requests, hashMap2);
            if (logger != null) {
                logger.append("  Attachments:\n");
            }
            serializeAttachments(hashMap2, serializer);
        }

        private final boolean isMeRequest(String path) {
            Matcher matcher = GraphRequest.versionPattern.matcher(path);
            if (matcher.matches()) {
                path = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(path, "matcher.group(1)");
            }
            return StringsKt.startsWith$default(path, "me/", false, 2, (Object) null) || StringsKt.startsWith$default(path, "/me/", false, 2, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void processGraphObject(JSONObject graphObject, String path, KeyValueSerializer serializer) {
            boolean z;
            Iterator<String> keys;
            if (isMeRequest(path)) {
                int indexOf$default = StringsKt.indexOf$default((CharSequence) path, ":", 0, false, 6, (Object) null);
                int indexOf$default2 = StringsKt.indexOf$default((CharSequence) path, "?", 0, false, 6, (Object) null);
                if (indexOf$default > 3 && (indexOf$default2 == -1 || indexOf$default < indexOf$default2)) {
                    z = true;
                    keys = graphObject.keys();
                    while (keys.hasNext()) {
                        String key = keys.next();
                        Object value = graphObject.opt(key);
                        boolean z2 = z && StringsKt.equals(key, "image", true);
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        Intrinsics.checkNotNullExpressionValue(value, "value");
                        processGraphObjectProperty(key, value, serializer, z2);
                    }
                }
            }
            z = false;
            keys = graphObject.keys();
            while (keys.hasNext()) {
            }
        }

        private final void processGraphObjectProperty(String key, Object value, KeyValueSerializer serializer, boolean passByValue) {
            Class<?> cls = value.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) value;
                if (passByValue) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format("%s[%s]", Arrays.copyOf(new Object[]{key, next}, 2));
                        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                        Object opt = jSONObject.opt(next);
                        Intrinsics.checkNotNullExpressionValue(opt, "jsonObject.opt(propertyName)");
                        processGraphObjectProperty(format, opt, serializer, passByValue);
                    }
                    return;
                }
                if (jSONObject.has("id")) {
                    String optString = jSONObject.optString("id");
                    Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(\"id\")");
                    processGraphObjectProperty(key, optString, serializer, passByValue);
                    return;
                } else if (jSONObject.has("url")) {
                    String optString2 = jSONObject.optString("url");
                    Intrinsics.checkNotNullExpressionValue(optString2, "jsonObject.optString(\"url\")");
                    processGraphObjectProperty(key, optString2, serializer, passByValue);
                    return;
                } else {
                    if (jSONObject.has(NativeProtocol.OPEN_GRAPH_CREATE_OBJECT_KEY)) {
                        String jSONObject2 = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonObject.toString()");
                        processGraphObjectProperty(key, jSONObject2, serializer, passByValue);
                        return;
                    }
                    return;
                }
            }
            if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) value;
                int length = jSONArray.length();
                if (length <= 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String format2 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{key, Integer.valueOf(i)}, 2));
                    Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
                    Object opt2 = jSONArray.opt(i);
                    Intrinsics.checkNotNullExpressionValue(opt2, "jsonArray.opt(i)");
                    processGraphObjectProperty(format2, opt2, serializer, passByValue);
                    if (i2 >= length) {
                        return;
                    } else {
                        i = i2;
                    }
                }
            } else {
                if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                    serializer.writeString(key, value.toString());
                    return;
                }
                if (Date.class.isAssignableFrom(cls)) {
                    String format3 = new SimpleDateFormat(GraphRequest.ISO_8601_FORMAT_STRING, Locale.US).format((Date) value);
                    Intrinsics.checkNotNullExpressionValue(format3, "iso8601DateFormat.format(date)");
                    serializer.writeString(key, format3);
                    return;
                }
                Utility utility = Utility.INSTANCE;
                Utility.logd(GraphRequest.TAG, "The type of property " + key + " in the graph object is unknown. It won't be sent in the request.");
            }
        }

        private final void serializeParameters(Bundle bundle, Serializer serializer, GraphRequest request) {
            for (String key : bundle.keySet()) {
                Object obj = bundle.get(key);
                if (isSupportedParameterType(obj)) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    serializer.writeObject(key, obj, request);
                }
            }
        }

        private final void serializeRequestsAsJSON(Serializer serializer, Collection<GraphRequest> requests, Map<String, Attachment> attachments) {
            JSONArray jSONArray = new JSONArray();
            Iterator<GraphRequest> it = requests.iterator();
            while (it.hasNext()) {
                it.next().serializeToBatch(jSONArray, attachments);
            }
            serializer.writeRequestsAsJson(GraphRequest.BATCH_PARAM, jSONArray, requests);
        }

        private final String getMimeContentType() {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{GraphRequest.MIME_BOUNDARY}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            return format;
        }

        private final String getUserAgent() {
            if (GraphRequest.userAgent == null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("%s.%s", Arrays.copyOf(new Object[]{GraphRequest.USER_AGENT_BASE, FacebookSdkVersion.BUILD}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                GraphRequest.userAgent = format;
                String customUserAgent = InternalSettings.getCustomUserAgent();
                if (!Utility.isNullOrEmpty(customUserAgent)) {
                    String format2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{GraphRequest.userAgent, customUserAgent}, 2));
                    Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
                    GraphRequest.userAgent = format2;
                }
            }
            return GraphRequest.userAgent;
        }

        private final String getBatchAppId(GraphRequestBatch batch) {
            String batchApplicationId = batch.getBatchApplicationId();
            if (batchApplicationId != null && !batch.isEmpty()) {
                return batchApplicationId;
            }
            Iterator<GraphRequest> it = batch.iterator();
            while (it.hasNext()) {
                AccessToken accessToken = it.next().getAccessToken();
                if (accessToken != null) {
                    return accessToken.getApplicationId();
                }
            }
            String str = GraphRequest.defaultBatchApplicationId;
            return (str == null || str.length() <= 0) ? FacebookSdk.getApplicationId() : str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSupportedAttachmentType(Object value) {
            return (value instanceof Bitmap) || (value instanceof byte[]) || (value instanceof Uri) || (value instanceof ParcelFileDescriptor) || (value instanceof ParcelableResourceWithMimeType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSupportedParameterType(Object value) {
            return (value instanceof String) || (value instanceof Boolean) || (value instanceof Number) || (value instanceof Date);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String parameterToString(Object value) {
            if (value instanceof String) {
                return (String) value;
            }
            if ((value instanceof Boolean) || (value instanceof Number)) {
                return value.toString();
            }
            if (value instanceof Date) {
                String format = new SimpleDateFormat(GraphRequest.ISO_8601_FORMAT_STRING, Locale.US).format((Date) value);
                Intrinsics.checkNotNullExpressionValue(format, "iso8601DateFormat.format(value)");
                return format;
            }
            throw new IllegalArgumentException("Unsupported parameter type.");
        }

        private final void serializeAttachments(Map<String, Attachment> attachments, Serializer serializer) {
            for (Map.Entry<String, Attachment> entry : attachments.entrySet()) {
                if (GraphRequest.INSTANCE.isSupportedAttachmentType(entry.getValue().getValue())) {
                    serializer.writeObject(entry.getKey(), entry.getValue().getValue(), entry.getValue().getRequest());
                }
            }
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        if (nextInt > 0) {
            int i = 0;
            do {
                i++;
                sb.append(charArray[secureRandom.nextInt(charArray.length)]);
            } while (i < nextInt);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "buffer.toString()");
        MIME_BOUNDARY = sb2;
        versionPattern = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public /* synthetic */ GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, Callback callback, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : accessToken, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bundle, (i & 8) != 0 ? null : httpMethod, (i & 16) != 0 ? null : callback, (i & 32) != 0 ? null : str2);
    }

    public GraphRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle, @Nullable HttpMethod httpMethod, @Nullable Callback callback, @Nullable String str2) {
        this.batchEntryOmitResultOnSuccess = true;
        this.accessToken = accessToken;
        this.graphPath = str;
        this.version = str2;
        setCallback(callback);
        setHttpMethod(httpMethod);
        if (bundle != null) {
            this.parameters = new Bundle(bundle);
        } else {
            this.parameters = new Bundle();
        }
        if (this.version == null) {
            this.version = FacebookSdk.getGraphApiVersion();
        }
    }

    public GraphRequest(@Nullable AccessToken accessToken, @NotNull URL overriddenURL) {
        Intrinsics.checkNotNullParameter(overriddenURL, "overriddenURL");
        this.batchEntryOmitResultOnSuccess = true;
        this.accessToken = accessToken;
        this.overriddenURL = overriddenURL.toString();
        setHttpMethod(HttpMethod.GET);
        this.parameters = new Bundle();
    }

    public final void setForceApplicationRequest(boolean forceOverride) {
        this.forceApplicationRequest = forceOverride;
    }

    @NotNull
    public final GraphResponse executeAndWait() {
        return INSTANCE.executeAndWait(this);
    }

    @NotNull
    public final GraphRequestAsyncTask executeAsync() {
        return INSTANCE.executeBatchAsync(this);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        Object obj = this.accessToken;
        if (obj == null) {
            obj = POBCommonConstants.NULL_VALUE;
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.graphPath);
        sb.append(", graphObject: ");
        sb.append(this.graphObject);
        sb.append(", httpMethod: ");
        sb.append(this.httpMethod);
        sb.append(", parameters: ");
        sb.append(this.parameters);
        sb.append("}");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return sb2;
    }

    private final void addCommonParameters() {
        Bundle bundle = this.parameters;
        if (shouldForceClientTokenForRequest()) {
            bundle.putString("access_token", getClientTokenForRequest());
        } else {
            String accessTokenToUseForRequest = getAccessTokenToUseForRequest();
            if (accessTokenToUseForRequest != null) {
                bundle.putString("access_token", accessTokenToUseForRequest);
            }
        }
        if (!bundle.containsKey("access_token")) {
            Utility utility = Utility.INSTANCE;
            if (Utility.isNullOrEmpty(FacebookSdk.getClientToken())) {
                Log.w(TAG, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
            }
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", "json");
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            bundle.putString("debug", DEBUG_SEVERITY_INFO);
        } else if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString("debug", DEBUG_SEVERITY_WARNING);
        }
    }

    private final String getAccessTokenToUseForRequest() {
        AccessToken accessToken = this.accessToken;
        if (accessToken != null) {
            if (!this.parameters.containsKey("access_token")) {
                String token = accessToken.getToken();
                Logger.INSTANCE.registerAccessToken(token);
                return token;
            }
        } else if (!this.parameters.containsKey("access_token")) {
            return getClientTokenForRequest();
        }
        return this.parameters.getString("access_token");
    }

    private final String getClientTokenForRequest() {
        String applicationId = FacebookSdk.getApplicationId();
        String clientToken = FacebookSdk.getClientToken();
        if (applicationId.length() > 0 && clientToken.length() > 0) {
            return applicationId + '|' + clientToken;
        }
        Utility utility = Utility.INSTANCE;
        Utility.logd(TAG, "Warning: Request without access token missing application ID or client token.");
        return null;
    }

    private final String appendParametersToBaseUrl(String baseUrl, boolean isBatch) {
        if (!isBatch && this.httpMethod == HttpMethod.POST) {
            return baseUrl;
        }
        Uri.Builder buildUpon = Uri.parse(baseUrl).buildUpon();
        for (String str : this.parameters.keySet()) {
            Object obj = this.parameters.get(str);
            if (obj == null) {
                obj = "";
            }
            Companion companion = INSTANCE;
            if (!companion.isSupportedParameterType(obj)) {
                if (this.httpMethod != HttpMethod.GET) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                    throw new IllegalArgumentException(format);
                }
            } else {
                buildUpon.appendQueryParameter(str, companion.parameterToString(obj).toString());
            }
        }
        String builder = buildUpon.toString();
        Intrinsics.checkNotNullExpressionValue(builder, "uriBuilder.toString()");
        return builder;
    }

    @NotNull
    public final String getRelativeUrlForBatchedRequest() {
        if (this.overriddenURL != null) {
            throw new FacebookException("Can't override URL for a batch request");
        }
        String urlWithGraphPath = getUrlWithGraphPath(ServerProtocol.getGraphUrlBase());
        addCommonParameters();
        Uri parse = Uri.parse(appendParametersToBaseUrl(urlWithGraphPath, true));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s?%s", Arrays.copyOf(new Object[]{parse.getPath(), parse.getQuery()}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @NotNull
    public final String getUrlForSingleRequest() {
        String graphUrlBaseForSubdomain;
        String str = this.overriddenURL;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.graphPath;
        if (this.httpMethod == HttpMethod.POST && str2 != null && StringsKt.endsWith$default(str2, VIDEOS_SUFFIX, false, 2, (Object) null)) {
            graphUrlBaseForSubdomain = ServerProtocol.getGraphVideoUrlBase();
        } else {
            ServerProtocol serverProtocol = ServerProtocol.INSTANCE;
            graphUrlBaseForSubdomain = ServerProtocol.getGraphUrlBaseForSubdomain(FacebookSdk.getGraphDomain());
        }
        String urlWithGraphPath = getUrlWithGraphPath(graphUrlBaseForSubdomain);
        addCommonParameters();
        return appendParametersToBaseUrl(urlWithGraphPath, false);
    }

    private final String getGraphPathWithVersion() {
        if (versionPattern.matcher(this.graphPath).matches()) {
            return this.graphPath;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{this.version, this.graphPath}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final String getUrlWithGraphPath(String baseUrl) {
        if (!isValidGraphRequestForDomain()) {
            baseUrl = ServerProtocol.getFacebookGraphUrlBase();
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{baseUrl, getGraphPathWithVersion()}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final boolean shouldForceClientTokenForRequest() {
        String accessTokenToUseForRequest = getAccessTokenToUseForRequest();
        boolean contains$default = accessTokenToUseForRequest == null ? false : StringsKt.contains$default((CharSequence) accessTokenToUseForRequest, (CharSequence) m.ad, false, 2, (Object) null);
        if (accessTokenToUseForRequest == null || !StringsKt.startsWith$default(accessTokenToUseForRequest, "IG", false, 2, (Object) null) || contains$default || !isApplicationRequest()) {
            return (isValidGraphRequestForDomain() || contains$default) ? false : true;
        }
        return true;
    }

    private final boolean isValidGraphRequestForDomain() {
        if (Intrinsics.areEqual(FacebookSdk.getGraphDomain(), FacebookSdk.INSTAGRAM_COM)) {
            return !isApplicationRequest();
        }
        return true;
    }

    private final boolean isApplicationRequest() {
        if (this.graphPath == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("^/?");
        sb.append(FacebookSdk.getApplicationId());
        sb.append("/?.*");
        return this.forceApplicationRequest || Pattern.matches(sb.toString(), this.graphPath) || Pattern.matches("^/?app/?.*", this.graphPath);
    }

    /* compiled from: GraphRequest.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/facebook/GraphRequest$Attachment;", "", "request", "Lcom/facebook/GraphRequest;", "value", "(Lcom/facebook/GraphRequest;Ljava/lang/Object;)V", "getRequest", "()Lcom/facebook/GraphRequest;", "getValue", "()Ljava/lang/Object;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class Attachment {

        @NotNull
        private final GraphRequest request;

        @Nullable
        private final Object value;

        public Attachment(@NotNull GraphRequest request, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.request = request;
            this.value = obj;
        }

        @NotNull
        public final GraphRequest getRequest() {
            return this.request;
        }

        @Nullable
        public final Object getValue() {
            return this.value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void serializeToBatch(JSONArray batch, Map<String, Attachment> attachments) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        String str = this.batchEntryName;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put(BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM, this.batchEntryOmitResultOnSuccess);
        }
        String str2 = this.batchEntryDependsOn;
        if (str2 != null) {
            jSONObject.put(BATCH_ENTRY_DEPENDS_ON_PARAM, str2);
        }
        String relativeUrlForBatchedRequest = getRelativeUrlForBatchedRequest();
        jSONObject.put(BATCH_RELATIVE_URL_PARAM, relativeUrlForBatchedRequest);
        jSONObject.put("method", this.httpMethod);
        AccessToken accessToken = this.accessToken;
        if (accessToken != null) {
            Logger.INSTANCE.registerAccessToken(accessToken.getToken());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.parameters.keySet().iterator();
        while (it.hasNext()) {
            Object obj = this.parameters.get(it.next());
            if (INSTANCE.isSupportedAttachmentType(obj)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(attachments.size())}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                arrayList.add(format);
                attachments.put(format, new Attachment(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put(ATTACHED_FILES_PARAM, TextUtils.join(StringUtils.COMMA, arrayList));
        }
        JSONObject jSONObject2 = this.graphObject;
        if (jSONObject2 != null) {
            final ArrayList arrayList2 = new ArrayList();
            INSTANCE.processGraphObject(jSONObject2, relativeUrlForBatchedRequest, new KeyValueSerializer() { // from class: com.facebook.GraphRequest$serializeToBatch$1
                @Override // com.facebook.GraphRequest.KeyValueSerializer
                public void writeString(@NotNull String key, @NotNull String value) throws IOException {
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value, "value");
                    ArrayList<String> arrayList3 = arrayList2;
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String format2 = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{key, URLEncoder.encode(value, "UTF-8")}, 2));
                    Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
                    arrayList3.add(format2);
                }
            });
            jSONObject.put("body", TextUtils.join(X3.j.c, arrayList2));
        }
        batch.put(jSONObject);
    }

    /* compiled from: GraphRequest.kt */
    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ+\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00150\u0014\"\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dJ$\u0010\u001e\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u00122\b\u0010 \u001a\u0004\u0018\u00010\u00122\b\u0010!\u001a\u0004\u0018\u00010\u0012J \u0010\"\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0012J \u0010&\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(2\b\u0010%\u001a\u0004\u0018\u00010\u0012J+\u0010)\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00150\u0014\"\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\"\u0010*\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010\u00152\b\u0010,\u001a\u0004\u0018\u00010-J\u0006\u0010.\u001a\u00020\u0010J$\u0010/\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u00100\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020-03J\u0018\u00104\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u0012H\u0016R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\u00060\u000bj\u0002`\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/facebook/GraphRequest$Serializer;", "Lcom/facebook/GraphRequest$KeyValueSerializer;", "outputStream", "Ljava/io/OutputStream;", "logger", "Lcom/facebook/internal/Logger;", "useUrlEncode", "", "(Ljava/io/OutputStream;Lcom/facebook/internal/Logger;Z)V", "firstWrite", "invalidTypeError", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "getInvalidTypeError", "()Ljava/lang/RuntimeException;", "write", "", "format", "", "args", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "writeBitmap", "key", "bitmap", "Landroid/graphics/Bitmap;", "writeBytes", "bytes", "", "writeContentDisposition", "name", "filename", "contentType", "writeContentUri", "contentUri", "Landroid/net/Uri;", "mimeType", "writeFile", "descriptor", "Landroid/os/ParcelFileDescriptor;", "writeLine", "writeObject", "value", "request", "Lcom/facebook/GraphRequest;", "writeRecordBoundary", "writeRequestsAsJson", "requestJsonArray", "Lorg/json/JSONArray;", "requests", "", "writeString", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class Serializer implements KeyValueSerializer {
        private boolean firstWrite;

        @Nullable
        private final Logger logger;

        @NotNull
        private final OutputStream outputStream;
        private final boolean useUrlEncode;

        public Serializer(@NotNull OutputStream outputStream, @Nullable Logger logger, boolean z) {
            Intrinsics.checkNotNullParameter(outputStream, "outputStream");
            this.outputStream = outputStream;
            this.logger = logger;
            this.firstWrite = true;
            this.useUrlEncode = z;
        }

        public final void writeObject(@NotNull String key, @Nullable Object value, @Nullable GraphRequest request) {
            Intrinsics.checkNotNullParameter(key, "key");
            Closeable closeable = this.outputStream;
            if (closeable instanceof RequestOutputStream) {
                ((RequestOutputStream) closeable).setCurrentRequest(request);
            }
            Companion companion = GraphRequest.INSTANCE;
            if (companion.isSupportedParameterType(value)) {
                writeString(key, companion.parameterToString(value));
                return;
            }
            if (value instanceof Bitmap) {
                writeBitmap(key, (Bitmap) value);
                return;
            }
            if (value instanceof byte[]) {
                writeBytes(key, (byte[]) value);
                return;
            }
            if (value instanceof Uri) {
                writeContentUri(key, (Uri) value, null);
                return;
            }
            if (value instanceof ParcelFileDescriptor) {
                writeFile(key, (ParcelFileDescriptor) value, null);
                return;
            }
            if (value instanceof ParcelableResourceWithMimeType) {
                ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) value;
                Parcelable resource = parcelableResourceWithMimeType.getResource();
                String mimeType = parcelableResourceWithMimeType.getMimeType();
                if (resource instanceof ParcelFileDescriptor) {
                    writeFile(key, (ParcelFileDescriptor) resource, mimeType);
                    return;
                } else {
                    if (resource instanceof Uri) {
                        writeContentUri(key, (Uri) resource, mimeType);
                        return;
                    }
                    throw getInvalidTypeError();
                }
            }
            throw getInvalidTypeError();
        }

        private final RuntimeException getInvalidTypeError() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        public final void writeRequestsAsJson(@NotNull String key, @NotNull JSONArray requestJsonArray, @NotNull Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(requestJsonArray, "requestJsonArray");
            Intrinsics.checkNotNullParameter(requests, "requests");
            Closeable closeable = this.outputStream;
            if (!(closeable instanceof RequestOutputStream)) {
                String jSONArray = requestJsonArray.toString();
                Intrinsics.checkNotNullExpressionValue(jSONArray, "requestJsonArray.toString()");
                writeString(key, jSONArray);
                return;
            }
            RequestOutputStream requestOutputStream = (RequestOutputStream) closeable;
            writeContentDisposition(key, null, null);
            write(X3.j.d, new Object[0]);
            int i = 0;
            for (GraphRequest graphRequest : requests) {
                int i2 = i + 1;
                JSONObject jSONObject = requestJsonArray.getJSONObject(i);
                requestOutputStream.setCurrentRequest(graphRequest);
                if (i > 0) {
                    write(",%s", jSONObject.toString());
                } else {
                    write("%s", jSONObject.toString());
                }
                i = i2;
            }
            write(X3.j.e, new Object[0]);
            Logger logger = this.logger;
            if (logger == null) {
                return;
            }
            String stringPlus = Intrinsics.stringPlus("    ", key);
            String jSONArray2 = requestJsonArray.toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray2, "requestJsonArray.toString()");
            logger.appendKeyValue(stringPlus, jSONArray2);
        }

        @Override // com.facebook.GraphRequest.KeyValueSerializer
        public void writeString(@NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            writeContentDisposition(key, null, null);
            writeLine("%s", value);
            writeRecordBoundary();
            Logger logger = this.logger;
            if (logger == null) {
                return;
            }
            logger.appendKeyValue(Intrinsics.stringPlus("    ", key), value);
        }

        public final void writeBitmap(@NotNull String key, @NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            writeContentDisposition(key, key, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.outputStream);
            writeLine("", new Object[0]);
            writeRecordBoundary();
            Logger logger = this.logger;
            if (logger == null) {
                return;
            }
            logger.appendKeyValue(Intrinsics.stringPlus("    ", key), "<Image>");
        }

        public final void writeBytes(@NotNull String key, @NotNull byte[] bytes) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            writeContentDisposition(key, key, "content/unknown");
            this.outputStream.write(bytes);
            writeLine("", new Object[0]);
            writeRecordBoundary();
            Logger logger = this.logger;
            if (logger == null) {
                return;
            }
            String stringPlus = Intrinsics.stringPlus("    ", key);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            logger.appendKeyValue(stringPlus, format);
        }

        public final void writeContentUri(@NotNull String key, @NotNull Uri contentUri, @Nullable String mimeType) {
            int copyAndCloseInputStream;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(contentUri, "contentUri");
            if (mimeType == null) {
                mimeType = "content/unknown";
            }
            writeContentDisposition(key, key, mimeType);
            if (this.outputStream instanceof ProgressNoopOutputStream) {
                ((ProgressNoopOutputStream) this.outputStream).addProgress(Utility.getContentSize(contentUri));
                copyAndCloseInputStream = 0;
            } else {
                InputStream openInputStream = FacebookSdk.getApplicationContext().getContentResolver().openInputStream(contentUri);
                Utility utility = Utility.INSTANCE;
                copyAndCloseInputStream = Utility.copyAndCloseInputStream(openInputStream, this.outputStream);
            }
            writeLine("", new Object[0]);
            writeRecordBoundary();
            Logger logger = this.logger;
            if (logger == null) {
                return;
            }
            String stringPlus = Intrinsics.stringPlus("    ", key);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(copyAndCloseInputStream)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            logger.appendKeyValue(stringPlus, format);
        }

        public final void writeFile(@NotNull String key, @NotNull ParcelFileDescriptor descriptor, @Nullable String mimeType) {
            int copyAndCloseInputStream;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            if (mimeType == null) {
                mimeType = "content/unknown";
            }
            writeContentDisposition(key, key, mimeType);
            OutputStream outputStream = this.outputStream;
            if (outputStream instanceof ProgressNoopOutputStream) {
                ((ProgressNoopOutputStream) outputStream).addProgress(descriptor.getStatSize());
                copyAndCloseInputStream = 0;
            } else {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(descriptor);
                Utility utility = Utility.INSTANCE;
                copyAndCloseInputStream = Utility.copyAndCloseInputStream(autoCloseInputStream, this.outputStream);
            }
            writeLine("", new Object[0]);
            writeRecordBoundary();
            Logger logger = this.logger;
            if (logger == null) {
                return;
            }
            String stringPlus = Intrinsics.stringPlus("    ", key);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(copyAndCloseInputStream)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            logger.appendKeyValue(stringPlus, format);
        }

        public final void writeRecordBoundary() {
            if (!this.useUrlEncode) {
                writeLine("--%s", GraphRequest.MIME_BOUNDARY);
                return;
            }
            OutputStream outputStream = this.outputStream;
            byte[] bytes = X3.j.c.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void writeContentDisposition(@Nullable String name, @Nullable String filename, @Nullable String contentType) {
            if (!this.useUrlEncode) {
                write("Content-Disposition: form-data; name=\"%s\"", name);
                if (filename != null) {
                    write("; filename=\"%s\"", filename);
                }
                writeLine("", new Object[0]);
                if (contentType != null) {
                    writeLine("%s: %s", "Content-Type", contentType);
                }
                writeLine("", new Object[0]);
                return;
            }
            OutputStream outputStream = this.outputStream;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%s=", Arrays.copyOf(new Object[]{name}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            byte[] bytes = format.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void write(@NotNull String format, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (!this.useUrlEncode) {
                if (this.firstWrite) {
                    OutputStream outputStream = this.outputStream;
                    Charset charset = Charsets.UTF_8;
                    byte[] bytes = "--".getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    OutputStream outputStream2 = this.outputStream;
                    String str = GraphRequest.MIME_BOUNDARY;
                    if (str == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    byte[] bytes2 = str.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
                    outputStream2.write(bytes2);
                    OutputStream outputStream3 = this.outputStream;
                    byte[] bytes3 = "\r\n".getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes3, "(this as java.lang.String).getBytes(charset)");
                    outputStream3.write(bytes3);
                    this.firstWrite = false;
                }
                OutputStream outputStream4 = this.outputStream;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] copyOf = Arrays.copyOf(args, args.length);
                String format2 = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
                Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
                byte[] bytes4 = format2.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                return;
            }
            OutputStream outputStream5 = this.outputStream;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            Locale locale = Locale.US;
            Object[] copyOf2 = Arrays.copyOf(args, args.length);
            String format3 = String.format(locale, format, Arrays.copyOf(copyOf2, copyOf2.length));
            Intrinsics.checkNotNullExpressionValue(format3, "java.lang.String.format(locale, format, *args)");
            String encode = URLEncoder.encode(format3, "UTF-8");
            Intrinsics.checkNotNullExpressionValue(encode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
            byte[] bytes5 = encode.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        public final void writeLine(@NotNull String format, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            write(format, Arrays.copyOf(args, args.length));
            if (this.useUrlEncode) {
                return;
            }
            write("\r\n", new Object[0]);
        }
    }

    /* compiled from: GraphRequest.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u0015*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\u00020\u0002:\u0001\u0015B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "RESOURCE", "Landroid/os/Parcelable;", "resource", "mimeType", "", "(Landroid/os/Parcelable;Ljava/lang/String;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getMimeType", "()Ljava/lang/String;", "getResource", "()Landroid/os/Parcelable;", "Landroid/os/Parcelable;", "describeContents", "", "writeToParcel", "", "out", "flags", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {

        @Nullable
        private final String mimeType;

        @Nullable
        private final RESOURCE resource;

        @NotNull
        public static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new Parcelable.Creator<ParcelableResourceWithMimeType<?>>() { // from class: com.facebook.GraphRequest$ParcelableResourceWithMimeType$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public GraphRequest.ParcelableResourceWithMimeType<?> createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new GraphRequest.ParcelableResourceWithMimeType<>(source, (DefaultConstructorMarker) null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public GraphRequest.ParcelableResourceWithMimeType<?>[] newArray(int size) {
                return new GraphRequest.ParcelableResourceWithMimeType[size];
            }
        };

        public /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Nullable
        public final String getMimeType() {
            return this.mimeType;
        }

        @Nullable
        public final RESOURCE getResource() {
            return this.resource;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int flags) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.mimeType);
            out.writeParcelable(this.resource, flags);
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, @Nullable String str) {
            this.mimeType = str;
            this.resource = resource;
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.mimeType = parcel.readString();
            this.resource = (RESOURCE) parcel.readParcelable(FacebookSdk.getApplicationContext().getClassLoader());
        }
    }
}
