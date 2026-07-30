package com.chicken.road.cerman.fixs.roost;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: RoostTrace.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0003J\b\u0010\f\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/chicken/road/cerman/fixs/roost/RoostTrace;", "", "appContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "read", "Lcom/chicken/road/cerman/fixs/roost/TraceIds;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "advertisingId", "", "androidId", "stableUuid", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RoostTrace {
    public static final int $stable = 8;
    private final Context appContext;

    public RoostTrace(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
    }

    public final Object read(Continuation<? super TraceIds> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new RoostTrace$read$2(this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String advertisingId() {
        Object obj;
        AdvertisingIdClient.Info advertisingIdInfo;
        String id;
        try {
            Result.Companion companion = Result.INSTANCE;
            RoostTrace roostTrace = this;
            advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.appContext);
            Intrinsics.checkNotNullExpressionValue(advertisingIdInfo, "getAdvertisingIdInfo(...)");
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            obj = Result.m6819constructorimpl(ResultKt.createFailure(th));
        }
        if (!advertisingIdInfo.isLimitAdTrackingEnabled()) {
            id = advertisingIdInfo.getId();
            if (id == null) {
            }
            obj = Result.m6819constructorimpl(id);
            return (String) (Result.m6825isFailureimpl(obj) ? "" : obj);
        }
        id = "";
        obj = Result.m6819constructorimpl(id);
        return (String) (Result.m6825isFailureimpl(obj) ? "" : obj);
    }

    private final String androidId() {
        String string = Settings.Secure.getString(this.appContext.getContentResolver(), "android_id");
        return string == null ? "" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String stableUuid() {
        String str = androidId() + this.appContext.getPackageName();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
        String substring = ArraysKt.joinToString$default(digest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.chicken.road.cerman.fixs.roost.RoostTrace$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence stableUuid$lambda$1;
                stableUuid$lambda$1 = RoostTrace.stableUuid$lambda$1(((Byte) obj).byteValue());
                return stableUuid$lambda$1;
            }
        }, 30, (Object) null).substring(0, 32);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        String substring2 = substring.substring(0, 8);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        String substring3 = substring.substring(8, 12);
        Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
        String substring4 = substring.substring(12, 16);
        Intrinsics.checkNotNullExpressionValue(substring4, "substring(...)");
        String substring5 = substring.substring(16, 20);
        Intrinsics.checkNotNullExpressionValue(substring5, "substring(...)");
        String substring6 = substring.substring(20, 32);
        Intrinsics.checkNotNullExpressionValue(substring6, "substring(...)");
        return substring2 + "-" + substring3 + "-" + substring4 + "-" + substring5 + "-" + substring6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence stableUuid$lambda$1(byte b) {
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
