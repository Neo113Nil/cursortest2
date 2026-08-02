package xyz.block.genie;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import xyz.block.genie.GenieSessionError;
import xyz.block.protos.genie.DisplayError;
import xyz.block.protos.genie.Error;
import xyz.block.protos.genie.ErrorCode;

/* loaded from: classes10.dex */
public abstract class GenieSessionKt {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$post(Message message, ProtoAdapter protoAdapter, Function2 function2, ContinuationImpl continuationImpl) {
        GenieSessionKt$post$1 genieSessionKt$post$1;
        int i;
        int i2;
        byte[] bArr;
        try {
            if (continuationImpl instanceof GenieSessionKt$post$1) {
                genieSessionKt$post$1 = (GenieSessionKt$post$1) continuationImpl;
                int i3 = genieSessionKt$post$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    genieSessionKt$post$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj = genieSessionKt$post$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = genieSessionKt$post$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        try {
                            Object encode = message.adapter().encode(message);
                            genieSessionKt$post$1.L$1 = protoAdapter;
                            genieSessionKt$post$1.label = 1;
                            obj = function2.invoke(encode, genieSessionKt$post$1);
                            if (obj == obj2) {
                                return obj2;
                            }
                        } catch (Exception e) {
                            throw new GenieSessionError.Encode(Recorder$$ExternalSyntheticOutline2.m("Could not encode request: ", e.getMessage()), e);
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        protoAdapter = genieSessionKt$post$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                    }
                    SessionHTTPPayload sessionHTTPPayload = (SessionHTTPPayload) obj;
                    i2 = sessionHTTPPayload.statusCode;
                    bArr = sessionHTTPPayload.body;
                    if (200 > i2 && i2 < 300) {
                        if (bArr.length == 0) {
                            throw new GenieSessionError.EmptyResponse("Server returned an empty body.", null);
                        }
                        try {
                            return protoAdapter.decode(bArr);
                        } catch (Exception e2) {
                            throw new GenieSessionError.Decode(Recorder$$ExternalSyntheticOutline2.m("Could not decode response: ", e2.getMessage()), e2);
                        }
                    }
                    throw new GenieSessionError.HttpStatus("HTTP " + sessionHTTPPayload.statusCode + ": " + StringsKt__StringsJVMKt.decodeToString$default(0, Math.min(bArr.length, 256), 5, bArr), null);
                }
            }
            if (i != 0) {
            }
            SessionHTTPPayload sessionHTTPPayload2 = (SessionHTTPPayload) obj;
            i2 = sessionHTTPPayload2.statusCode;
            bArr = sessionHTTPPayload2.body;
            if (200 > i2) {
            }
            throw new GenieSessionError.HttpStatus("HTTP " + sessionHTTPPayload2.statusCode + ": " + StringsKt__StringsJVMKt.decodeToString$default(0, Math.min(bArr.length, 256), 5, bArr), null);
        } catch (IOException e3) {
            throw new GenieSessionError.Transport(e3);
        } catch (CancellationException e4) {
            throw e4;
        } catch (Exception e5) {
            throw new GenieSessionError.Transport(e5);
        }
        genieSessionKt$post$1 = new GenieSessionKt$post$1(continuationImpl);
        Object obj3 = genieSessionKt$post$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = genieSessionKt$post$1.label;
    }

    public static final String access$serverMessage(Error error) {
        String str;
        if (error == null) {
            return "Server reported a failure with no details.";
        }
        ErrorCode errorCode = error.code;
        if (errorCode == null || (str = errorCode.toString()) == null) {
            str = "UNKNOWN";
        }
        DisplayError displayError = error.display_error;
        String str2 = displayError != null ? displayError.title : null;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = displayError != null ? displayError.description : null;
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{str2, str3 != null ? str3 : ""});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOf) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        String joinToString$default = CollectionsKt.joinToString$default(arrayList, " - ", null, null, 0, null, null, 62);
        return joinToString$default.length() == 0 ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Server error (", str, ")") : Recorder$$ExternalSyntheticOutline2.m(str, ": ", joinToString$default);
    }
}
