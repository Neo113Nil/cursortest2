package xyz.block.genie;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.scannerview.SizeMap;
import com.squareup.wire.ProtoAdapter;
import com.withpersona.sdk2.inquiry.logger.Logger$log$1;
import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.rx3.RxConvertKt$asFlow$1;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import xyz.block.genie.GenieSessionError;
import xyz.block.protos.genie.CreateSessionRequest;
import xyz.block.protos.genie.CreateSessionResponse;
import xyz.block.protos.genie.GetSceneRequest;
import xyz.block.protos.genie.GetSceneResponse;

/* loaded from: classes10.dex */
public final class GenieSession {
    public static final Companion Companion = new Companion();
    public final String baseUrl;
    public final SizeMap handler;
    public final String token;

    public final class Companion {
        /* JADX WARN: Removed duplicated region for block: B:12:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object create(String str, String str2, String str3, String str4, String str5, SizeMap sizeMap, ContinuationImpl continuationImpl) {
            GenieSession$Companion$create$1 genieSession$Companion$create$1;
            int i;
            String str6;
            String host;
            String trimEnd;
            Object access$post;
            CreateSessionResponse.Success success;
            String str7 = str;
            SizeMap sizeMap2 = sizeMap;
            if (continuationImpl instanceof GenieSession$Companion$create$1) {
                genieSession$Companion$create$1 = (GenieSession$Companion$create$1) continuationImpl;
                int i2 = genieSession$Companion$create$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    genieSession$Companion$create$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = genieSession$Companion$create$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = genieSession$Companion$create$1.label;
                    Continuation continuation = null;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        str7.getClass();
                        String obj2 = StringsKt.trim(str7).toString();
                        if (obj2.length() == 0) {
                            throw new GenieSessionError.InvalidServerUrl(str7);
                        }
                        if (!StringsKt.contains((CharSequence) obj2, (CharSequence) "://", false)) {
                            obj2 = "https://".concat(obj2);
                        }
                        try {
                            URI uri = new URI(obj2);
                            Set set = ArraysKt___ArraysKt.toSet(new String[]{"http", "https"});
                            String scheme = uri.getScheme();
                            if (scheme != null) {
                                str6 = scheme.toLowerCase(Locale.ROOT);
                                str6.getClass();
                            } else {
                                str6 = null;
                            }
                            if (!CollectionsKt.contains(set, str6) || (host = uri.getHost()) == null || host.length() == 0 || uri.getUserInfo() != null || uri.getRawQuery() != null || uri.getRawFragment() != null) {
                                throw new GenieSessionError.InvalidServerUrl(str7);
                            }
                            String uri2 = uri.toString();
                            uri2.getClass();
                            trimEnd = StringsKt.trimEnd(uri2, '/');
                            String obj3 = StringsKt.trim(str2).toString();
                            if (obj3.length() == 0) {
                                throw new GenieSessionError.InvalidAppSlug("App slug must not be empty.", null);
                            }
                            String obj4 = StringsKt.trim(str4).toString();
                            if (obj4.length() == 0) {
                                throw new GenieSessionError.InvalidAppIdentifier("App identifier must not be empty.", null);
                            }
                            String obj5 = StringsKt.trim(str5).toString();
                            if (obj5.length() == 0) {
                                throw new GenieSessionError.InvalidAppVersion("App version must not be empty.", null);
                            }
                            CreateSessionRequest createSessionRequest = new CreateSessionRequest(obj3, CreateSessionRequest.Platform.PLATFORM_ANDROID, obj4, obj5, str3, ByteString.EMPTY);
                            ProtoAdapter protoAdapter = CreateSessionResponse.ADAPTER;
                            Logger$log$1 logger$log$1 = new Logger$log$1((Object) sizeMap2, trimEnd, continuation, 27);
                            genieSession$Companion$create$1.L$0 = str7;
                            genieSession$Companion$create$1.L$5 = sizeMap2;
                            genieSession$Companion$create$1.L$6 = trimEnd;
                            genieSession$Companion$create$1.label = 1;
                            access$post = GenieSessionKt.access$post(createSessionRequest, protoAdapter, logger$log$1, genieSession$Companion$create$1);
                            if (access$post == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } catch (URISyntaxException unused) {
                            throw new GenieSessionError.InvalidServerUrl(str7);
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        String str8 = genieSession$Companion$create$1.L$6;
                        sizeMap2 = genieSession$Companion$create$1.L$5;
                        String str9 = genieSession$Companion$create$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        trimEnd = str8;
                        str7 = str9;
                        access$post = obj;
                    }
                    CreateSessionResponse createSessionResponse = (CreateSessionResponse) access$post;
                    success = createSessionResponse.success;
                    if (success != null) {
                        CreateSessionResponse.Failure failure = createSessionResponse.failure;
                        if (failure != null) {
                            throw new GenieSessionError.Server(GenieSessionKt.access$serverMessage(failure.error), null);
                        }
                        throw new GenieSessionError.UnsetResult();
                    }
                    String str10 = success.session_token;
                    if (str10 == null) {
                        str10 = "";
                    }
                    if (str10.length() != 0) {
                        return new GenieSession(str10, StringsKt.trim(str7).toString(), trimEnd, sizeMap2);
                    }
                    throw new GenieSessionError.EmptyToken("Server returned an empty session token.", null);
                }
            }
            genieSession$Companion$create$1 = new GenieSession$Companion$create$1(this, continuationImpl);
            Object obj6 = genieSession$Companion$create$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = genieSession$Companion$create$1.label;
            Continuation continuation2 = null;
            if (i != 0) {
            }
            CreateSessionResponse createSessionResponse2 = (CreateSessionResponse) access$post;
            success = createSessionResponse2.success;
            if (success != null) {
            }
        }
    }

    public GenieSession(String str, String str2, String str3, SizeMap sizeMap) {
        str2.getClass();
        str3.getClass();
        sizeMap.getClass();
        this.token = str;
        this.baseUrl = str3;
        this.handler = sizeMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable fetchScene(String str, ContinuationImpl continuationImpl) {
        GenieSession$fetchScene$1 genieSession$fetchScene$1;
        int i;
        GetSceneResponse.Success success;
        if (continuationImpl instanceof GenieSession$fetchScene$1) {
            genieSession$fetchScene$1 = (GenieSession$fetchScene$1) continuationImpl;
            int i2 = genieSession$fetchScene$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                genieSession$fetchScene$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = genieSession$fetchScene$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = genieSession$fetchScene$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String obj2 = StringsKt.trim(str).toString();
                    if (obj2.length() == 0) {
                        throw new GenieSessionError.InvalidSceneSlug("Scene slug must not be empty.", null);
                    }
                    GetSceneRequest getSceneRequest = new GetSceneRequest(obj2, null, null, ByteString.EMPTY);
                    ProtoAdapter protoAdapter = GetSceneResponse.ADAPTER;
                    RxConvertKt$asFlow$1 rxConvertKt$asFlow$1 = new RxConvertKt$asFlow$1(this, continuation, 9);
                    genieSession$fetchScene$1.label = 1;
                    obj = GenieSessionKt.access$post(getSceneRequest, protoAdapter, rxConvertKt$asFlow$1, genieSession$fetchScene$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                GetSceneResponse getSceneResponse = (GetSceneResponse) obj;
                success = getSceneResponse.success;
                if (success == null) {
                    return success.view_plan;
                }
                GetSceneResponse.Failure failure = getSceneResponse.failure;
                if (failure != null) {
                    throw new GenieSessionError.Server(GenieSessionKt.access$serverMessage(failure.error), null);
                }
                throw new GenieSessionError.UnsetResult();
            }
        }
        genieSession$fetchScene$1 = new GenieSession$fetchScene$1(this, continuationImpl);
        Object obj3 = genieSession$fetchScene$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = genieSession$fetchScene$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        GetSceneResponse getSceneResponse2 = (GetSceneResponse) obj3;
        success = getSceneResponse2.success;
        if (success == null) {
        }
    }
}
