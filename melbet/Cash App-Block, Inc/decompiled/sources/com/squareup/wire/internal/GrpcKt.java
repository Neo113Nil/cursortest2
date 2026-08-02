package com.squareup.wire.internal;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.db.WireAdapter;
import com.squareup.wire.GrpcException;
import com.squareup.wire.GrpcStatus;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import java.util.List;
import kotlin.Lazy;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.UnsignedKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;
import okio.ByteString;
import okio.Okio;
import okio.RealBufferedSink;
import okio.Utf8;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public abstract class GrpcKt {
    public static final MediaType APPLICATION_GRPC_MEDIA_TYPE;

    static {
        Regex regex = MediaType.TYPE_SUBTYPE;
        APPLICATION_GRPC_MEDIA_TYPE = UnsignedKt.get("application/grpc");
    }

    public static final IOException grpcResponseToException(Response response, IOException e) {
        Integer intOrNull;
        response.getClass();
        Headers headers = response.headers;
        Headers headers2 = Headers.EMPTY;
        Headers of = TuplesKt.of(new String[0]);
        if (e == null) {
            try {
                of = response.trailersSource.get();
            } catch (IOException e2) {
                e = e2;
            }
        }
        String str = of.get("grpc-status");
        ByteString byteString = null;
        if (str == null) {
            String str2 = headers.get("grpc-status");
            str = str2 == null ? null : str2;
        }
        String str3 = of.get("grpc-message");
        if (str3 == null) {
            String str4 = headers.get("grpc-message");
            str3 = str4 == null ? null : str4;
        }
        Request request = response.request;
        int i = response.code;
        String str5 = request.url.url;
        if (str != null && (intOrNull = StringsKt.toIntOrNull(str)) != null) {
            if (intOrNull.intValue() == 0) {
                intOrNull = null;
            }
            if (intOrNull != null) {
                int intValue = intOrNull.intValue();
                String str6 = of.get("grpc-status-details-bin");
                if (str6 == null) {
                    String str7 = headers.get("grpc-status-details-bin");
                    str6 = str7 == null ? null : str7;
                }
                if (str6 != null) {
                    try {
                        ByteString.Companion companion = ByteString.Companion;
                        byteString = ByteString.Companion.decodeBase64(str6);
                    } catch (IllegalArgumentException e3) {
                        throw new IOException(CameraState$Type$EnumUnboxingLocalUtility.m(re$$ExternalSyntheticOutline0.m("gRPC transport failure, invalid grpc-status-details-bin (HTTP status=", i, ", grpc-status=", str, ", grpc-message="), str3, ')'), e3);
                    }
                }
                List list = GrpcStatus.INSTANCES;
                GrpcStatus grpcStatus = GrpcStatus.Companion.get(intValue);
                if (byteString != null) {
                    byteString.toByteArray();
                }
                return new GrpcException(grpcStatus, str3, str5);
            }
        }
        if (e == null) {
            if ((str != null ? StringsKt.toIntOrNull(str) : null) != null) {
                return null;
            }
        }
        return new IOException(CameraState$Type$EnumUnboxingLocalUtility.m(re$$ExternalSyntheticOutline0.m("gRPC transport failure (HTTP status=", i, ", grpc-status=", str, ", grpc-message="), str3, ')'), e);
    }

    public static final GrpcMessageSource messageSource(Response response, ProtoAdapter protoAdapter) {
        protoAdapter.getClass();
        ResponseBody responseBody = response.body;
        responseBody.getClass();
        MediaType contentType = responseBody.contentType();
        int i = response.code;
        if (i == 200 && contentType != null) {
            String str = contentType.subtype;
            if (Intrinsics.areEqual(contentType.f1545type, "application") && (Intrinsics.areEqual(str, "grpc") || Intrinsics.areEqual(str, "grpc+proto"))) {
                String str2 = response.headers.get("grpc-encoding");
                if (str2 == null) {
                    str2 = null;
                }
                responseBody.getClass();
                return new GrpcMessageSource(responseBody.source(), protoAdapter, str2);
            }
        }
        throw new IOException("expected gRPC but was HTTP status=" + i + ", content-type=" + contentType);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:3|(6:5|6|7|(1:(7:10|11|12|13|14|15|(6:17|18|(1:20)|14|15|(4:22|23|24|25)(0))(0))(2:39|40))(11:41|42|43|45|46|47|18|(0)|14|15|(0)(0))|29|30))|7|(0)(0)|29|30|(2:(1:55)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00bc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a3 A[Catch: all -> 0x00af, TRY_LEAVE, TryCatch #8 {all -> 0x00af, blocks: (B:15:0x009a, B:17:0x00a3, B:18:0x0085), top: B:14:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2 A[Catch: all -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00bf, blocks: (B:34:0x00cd, B:35:0x00d0, B:22:0x00b2, B:30:0x00ca), top: B:7:0x0020, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, okhttp3.Call] */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.squareup.wire.internal.GrpcMessageSink] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v8, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.squareup.wire.internal.PipeDuplexRequestBody, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.squareup.wire.internal.GrpcMessageSink] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0097 -> B:14:0x009a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object writeToRequestBody(BufferedChannel bufferedChannel, PipeDuplexRequestBody pipeDuplexRequestBody, long j, ProtoAdapter protoAdapter, Call call, ContinuationImpl continuationImpl) {
        GrpcKt$writeToRequestBody$1 grpcKt$writeToRequestBody$1;
        int i;
        Throwable th;
        ?? r10;
        Throwable th2;
        Ref$BooleanRef ref$BooleanRef;
        BufferedChannel bufferedChannel2;
        GrpcMessageSink grpcMessageSink;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator;
        GrpcMessageSink grpcMessageSink2;
        BufferedChannel bufferedChannel3;
        GrpcMessageSink grpcMessageSink3;
        ?? r102;
        BufferedChannel bufferedChannel4;
        try {
            try {
                if (continuationImpl instanceof GrpcKt$writeToRequestBody$1) {
                    grpcKt$writeToRequestBody$1 = (GrpcKt$writeToRequestBody$1) continuationImpl;
                    int i2 = grpcKt$writeToRequestBody$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        grpcKt$writeToRequestBody$1.label = i2 - PKIFailureInfo.systemUnavail;
                        Object obj = grpcKt$writeToRequestBody$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = grpcKt$writeToRequestBody$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            pipeDuplexRequestBody.getClass();
                            protoAdapter.getClass();
                            call.getClass();
                            RealBufferedSink buffer = Okio.buffer(pipeDuplexRequestBody.pipe.sink);
                            Lazy lazy = PlatformKt.AddSuppressedMethod$delegate;
                            ?? grpcMessageSink4 = new GrpcMessageSink(buffer, j, protoAdapter, new WireAdapter((Object) call));
                            try {
                                Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                                ref$BooleanRef2.element = true;
                                try {
                                    bufferedChannel.getClass();
                                    GrpcMessageSink grpcMessageSink5 = grpcMessageSink4;
                                    grpcMessageSink = grpcMessageSink5;
                                    BufferedChannel bufferedChannel5 = bufferedChannel;
                                    bufferedChannelIterator = bufferedChannel.new BufferedChannelIterator();
                                    ref$BooleanRef = ref$BooleanRef2;
                                    bufferedChannel2 = bufferedChannel5;
                                    bufferedChannel3 = bufferedChannel5;
                                    grpcMessageSink2 = grpcMessageSink5;
                                    grpcKt$writeToRequestBody$1.L$0 = bufferedChannel3;
                                    grpcKt$writeToRequestBody$1.L$1 = grpcMessageSink;
                                    grpcKt$writeToRequestBody$1.L$2 = grpcMessageSink2;
                                    grpcKt$writeToRequestBody$1.L$3 = ref$BooleanRef;
                                    grpcKt$writeToRequestBody$1.L$4 = bufferedChannel2;
                                    grpcKt$writeToRequestBody$1.L$5 = bufferedChannelIterator;
                                    grpcKt$writeToRequestBody$1.label = 1;
                                    obj = bufferedChannelIterator.hasNext(grpcKt$writeToRequestBody$1);
                                    bufferedChannel4 = bufferedChannel3;
                                    r102 = grpcMessageSink2;
                                    grpcMessageSink3 = grpcMessageSink;
                                    if (obj == coroutineSingletons) {
                                    }
                                    if (((Boolean) obj).booleanValue()) {
                                    }
                                } catch (Throwable th3) {
                                    ProtoAdapter protoAdapter2 = grpcMessageSink4;
                                    call = protoAdapter2;
                                    BufferedChannel bufferedChannel6 = bufferedChannel;
                                    th2 = th3;
                                    ref$BooleanRef = ref$BooleanRef2;
                                    bufferedChannel2 = bufferedChannel6;
                                    pipeDuplexRequestBody = bufferedChannel6;
                                    protoAdapter = protoAdapter2;
                                }
                            } catch (Throwable th4) {
                                r10 = grpcMessageSink4;
                                pipeDuplexRequestBody = bufferedChannel;
                                th = th4;
                                try {
                                    throw th;
                                } catch (Throwable th5) {
                                    Utf8.closeFinally(r10, th);
                                    throw th5;
                                }
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            bufferedChannelIterator = grpcKt$writeToRequestBody$1.L$5;
                            ?? r7 = grpcKt$writeToRequestBody$1.L$4;
                            Ref$BooleanRef ref$BooleanRef3 = grpcKt$writeToRequestBody$1.L$3;
                            ?? r9 = grpcKt$writeToRequestBody$1.L$2;
                            GrpcMessageSink grpcMessageSink6 = grpcKt$writeToRequestBody$1.L$1;
                            ?? r11 = grpcKt$writeToRequestBody$1.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                bufferedChannel2 = r7;
                                bufferedChannel4 = r11;
                                grpcMessageSink3 = grpcMessageSink6;
                                r102 = r9;
                                ref$BooleanRef = ref$BooleanRef3;
                                try {
                                    if (((Boolean) obj).booleanValue()) {
                                        Object next = bufferedChannelIterator.next();
                                        ref$BooleanRef.element = false;
                                        grpcMessageSink3.write(next);
                                        ref$BooleanRef.element = true;
                                        bufferedChannel3 = bufferedChannel4;
                                        grpcMessageSink2 = r102;
                                        grpcMessageSink = grpcMessageSink3;
                                        grpcKt$writeToRequestBody$1.L$0 = bufferedChannel3;
                                        grpcKt$writeToRequestBody$1.L$1 = grpcMessageSink;
                                        grpcKt$writeToRequestBody$1.L$2 = grpcMessageSink2;
                                        grpcKt$writeToRequestBody$1.L$3 = ref$BooleanRef;
                                        grpcKt$writeToRequestBody$1.L$4 = bufferedChannel2;
                                        grpcKt$writeToRequestBody$1.L$5 = bufferedChannelIterator;
                                        grpcKt$writeToRequestBody$1.label = 1;
                                        obj = bufferedChannelIterator.hasNext(grpcKt$writeToRequestBody$1);
                                        bufferedChannel4 = bufferedChannel3;
                                        r102 = grpcMessageSink2;
                                        grpcMessageSink3 = grpcMessageSink;
                                        if (obj == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        if (((Boolean) obj).booleanValue()) {
                                            bufferedChannel2.cancel(null);
                                            ref$BooleanRef.element = false;
                                            Utf8.closeFinally(r102, null);
                                            return Unit.INSTANCE;
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th2 = th6;
                                    pipeDuplexRequestBody = bufferedChannel4;
                                    protoAdapter = r102;
                                    call = grpcMessageSink3;
                                }
                            } catch (Throwable th7) {
                                th2 = th7;
                                bufferedChannel2 = r7;
                                pipeDuplexRequestBody = r11;
                                call = grpcMessageSink6;
                                protoAdapter = r9;
                                ref$BooleanRef = ref$BooleanRef3;
                            }
                        }
                        throw th2;
                    }
                }
                throw th2;
            } catch (Throwable th8) {
                SafeTrace.cancelConsumed(bufferedChannel2, th2);
                throw th8;
            }
            if (i != 0) {
            }
        } catch (Throwable th9) {
            try {
                if (!ref$BooleanRef.element) {
                    throw th9;
                }
                if (call.closed) {
                    throw new IllegalStateException("closed");
                }
                ((RealCall) ((Call) call.callForCancel.adapter)).cancel();
                throw th9;
            } catch (Throwable th10) {
                th = th10;
                pipeDuplexRequestBody = pipeDuplexRequestBody;
                r10 = protoAdapter;
                throw th;
            }
        }
        grpcKt$writeToRequestBody$1 = new GrpcKt$writeToRequestBody$1(continuationImpl);
        Object obj2 = grpcKt$writeToRequestBody$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = grpcKt$writeToRequestBody$1.label;
    }
}
