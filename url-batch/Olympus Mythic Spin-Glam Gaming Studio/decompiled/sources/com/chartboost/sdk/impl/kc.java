package com.chartboost.sdk.impl;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import com.chartboost.sdk.events.ChartboostError;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes10.dex */
public abstract class kc {

    public static final class a extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public int f;
        public long g;
        public /* synthetic */ Object h;
        public int i;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.i |= Integer.MIN_VALUE;
            return kc.b((URL) null, this);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:108|109|110|111|(3:113|114|73)(6:118|119|120|121|122|(2:126|(5:128|129|92|93|(1:95)(7:96|14|15|(0)(0)|18|19|(0)(0)))(3:130|75|(9:77|78|79|80|81|(1:83)|63|64|(0)(2:140|141))(4:104|92|93|(0)(0))))(2:124|125))|88|(1:90)(2:100|(1:102)(1:103))|91|92|93|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03b1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03b2, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x031c A[Catch: Exception -> 0x033f, TryCatch #0 {Exception -> 0x033f, blocks: (B:15:0x0316, B:17:0x031c, B:30:0x0343, B:33:0x034a), top: B:14:0x0316 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0343 A[Catch: Exception -> 0x033f, TryCatch #0 {Exception -> 0x033f, blocks: (B:15:0x0316, B:17:0x031c, B:30:0x0343, B:33:0x034a), top: B:14:0x0316 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0146 A[Catch: Exception -> 0x0264, TRY_ENTER, TryCatch #9 {Exception -> 0x0264, blocks: (B:64:0x010d, B:66:0x0146, B:69:0x014d, B:105:0x0170), top: B:63:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0313 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0314  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x010a -> B:63:0x010d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(URL url, Continuation continuation) {
        a aVar;
        int i;
        int i2;
        b7 i3;
        Iterator it;
        Throwable th;
        a aVar2;
        URL url2;
        String str;
        Throwable th2;
        Object a2;
        int i4;
        String str2;
        Exception e;
        a aVar3;
        ChartboostError internal2;
        Object a3;
        URL url3;
        a aVar4;
        long length;
        URL url4;
        List a4;
        ChartboostError internal3;
        List a5;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i5 = aVar.i;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.i = i5 - Integer.MIN_VALUE;
                Object obj = aVar.h;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.i;
                String str3 = X3.j.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    i2 = 0;
                    i3 = f4.b.a().i();
                    it = CollectionsKt.listOf((Object[]) new Long[]{Boxing.boxLong(65536L), Boxing.boxLong(262144L), Boxing.boxLong(524288L), Boxing.boxLong(1048576L), Boxing.boxLong(CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE)}).iterator();
                    th = null;
                    aVar2 = aVar;
                    url2 = url;
                    if (it.hasNext()) {
                    }
                } else if (i == 1) {
                    long j = aVar.g;
                    int i6 = aVar.f;
                    it = (Iterator) aVar.e;
                    th = (Throwable) aVar.d;
                    b7 b7Var = (b7) aVar.c;
                    URL url5 = (URL) aVar.b;
                    try {
                        ResultKt.throwOnFailure(obj);
                        a3 = ((Result) obj).getValue();
                        str2 = X3.j.d;
                        aVar2 = aVar;
                        url2 = url5;
                        i3 = b7Var;
                        i2 = i6;
                        try {
                        } catch (Exception e2) {
                            e = e2;
                            url3 = url2;
                            aVar4 = aVar2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        str2 = X3.j.d;
                    }
                    if (Result.m8028isFailureimpl(a3)) {
                        if (Result.m8028isFailureimpl(a3)) {
                            a3 = null;
                        }
                        File file = (File) a3;
                        if (file == null) {
                            xb.e("Downloaded file is null for " + j + " bytes from " + url2, null, 2, null);
                        } else if (file.exists()) {
                            aVar4 = aVar2;
                            try {
                                length = file.length();
                            } catch (Exception e4) {
                                e = e4;
                                url3 = url2;
                                aVar = aVar4;
                                i6 = i2;
                                b7Var = i3;
                                url5 = url3;
                                if (e instanceof ChartboostError.Load) {
                                }
                                String code = internal2.getCode();
                                StringBuilder sb = new StringBuilder();
                                str = str2;
                                sb.append(str);
                                sb.append(code);
                                sb.append("] Exception occurred while trying to extract codecs with ");
                                sb.append(j);
                                sb.append(" bytes from ");
                                sb.append(url5);
                                xb.b(sb.toString(), internal2);
                                th = e;
                                url2 = url5;
                                i3 = b7Var;
                                i2 = i6;
                                aVar2 = aVar3;
                                xb.a("Partial downloads failed, attempting full file download for " + url2, (Throwable) null, 2, (Object) null);
                                aVar2.b = url2;
                                aVar2.c = th;
                                aVar2.d = null;
                                aVar2.e = null;
                                aVar2.f = i2;
                                aVar2.i = 2;
                                a2 = i3.a(url2, -1L, aVar2);
                                if (a2 == coroutine_suspended) {
                                }
                            }
                            if (length == 0) {
                                try {
                                    xb.e("Downloaded file is empty", null, 2, null);
                                    aVar2 = aVar4;
                                } catch (Exception e5) {
                                    e = e5;
                                    i6 = i2;
                                    b7Var = i3;
                                    url5 = url2;
                                    aVar = aVar4;
                                }
                            } else {
                                try {
                                    try {
                                        String absolutePath = file.getAbsolutePath();
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Downloaded ");
                                        sb2.append(length);
                                        sb2.append(" bytes to ");
                                        sb2.append(absolutePath);
                                        xb.a(sb2.toString(), (Throwable) null, 2, (Object) null);
                                        String absolutePath2 = file.getAbsolutePath();
                                        Intrinsics.checkNotNullExpressionValue(absolutePath2, "getAbsolutePath(...)");
                                        a4 = a(absolutePath2);
                                    } catch (Exception e6) {
                                        e = e6;
                                        url4 = url2;
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    aVar = aVar4;
                                    b7Var = i3;
                                    url5 = url4;
                                    i6 = 1;
                                    if (e instanceof ChartboostError.Load) {
                                    }
                                    String code2 = internal2.getCode();
                                    StringBuilder sb3 = new StringBuilder();
                                    str = str2;
                                    sb3.append(str);
                                    sb3.append(code2);
                                    sb3.append("] Exception occurred while trying to extract codecs with ");
                                    sb3.append(j);
                                    sb3.append(" bytes from ");
                                    sb3.append(url5);
                                    xb.b(sb3.toString(), internal2);
                                    th = e;
                                    url2 = url5;
                                    i3 = b7Var;
                                    i2 = i6;
                                    aVar2 = aVar3;
                                    xb.a("Partial downloads failed, attempting full file download for " + url2, (Throwable) null, 2, (Object) null);
                                    aVar2.b = url2;
                                    aVar2.c = th;
                                    aVar2.d = null;
                                    aVar2.e = null;
                                    aVar2.f = i2;
                                    aVar2.i = 2;
                                    a2 = i3.a(url2, -1L, aVar2);
                                    if (a2 == coroutine_suspended) {
                                    }
                                }
                                url4 = url2;
                                if (!a4.isEmpty()) {
                                    xb.a("Successfully extracted " + a4.size() + " codecs with " + j + " bytes requested (got " + length + " bytes): " + a4, (Throwable) null, 2, (Object) null);
                                    return a4;
                                }
                                if (length < j) {
                                    xb.a("Got less than requested (" + length + " < " + j + "), likely have full file but couldn't extract codecs", (Throwable) null, 2, (Object) null);
                                    aVar2 = aVar4;
                                    str = str2;
                                    url2 = url4;
                                    i2 = 1;
                                    xb.a("Partial downloads failed, attempting full file download for " + url2, (Throwable) null, 2, (Object) null);
                                    aVar2.b = url2;
                                    aVar2.c = th;
                                    aVar2.d = null;
                                    aVar2.e = null;
                                    aVar2.f = i2;
                                    aVar2.i = 2;
                                    a2 = i3.a(url2, -1L, aVar2);
                                    if (a2 == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    i4 = i2;
                                    th2 = th;
                                    if (Result.m8028isFailureimpl(a2)) {
                                    }
                                    i2 = i4;
                                    String a6 = a();
                                    c();
                                    if (i2 != 0) {
                                    }
                                } else {
                                    aVar2 = aVar4;
                                    str3 = str2;
                                    url2 = url4;
                                    i2 = 1;
                                    if (it.hasNext()) {
                                        j = ((Number) it.next()).longValue();
                                        try {
                                            str2 = str3;
                                            xb.a("Trying to extract codecs with " + j + " bytes from " + url2, (Throwable) null, 2, (Object) null);
                                            aVar2.b = url2;
                                            aVar2.c = i3;
                                            aVar2.d = th;
                                            aVar2.e = it;
                                            aVar2.f = i2;
                                            aVar2.g = j;
                                            aVar2.i = 1;
                                            a3 = i3.a(url2, j, aVar2);
                                            if (a3 == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            if (Result.m8028isFailureimpl(a3)) {
                                                try {
                                                    th = Result.m8026exceptionOrNullimpl(a3);
                                                    xb.e("Failed to download first " + j + " bytes from " + url2 + ": " + th, null, 2, null);
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    b7 b7Var2 = i3;
                                                    url5 = url2;
                                                    aVar = aVar2;
                                                    i6 = i2;
                                                    b7Var = b7Var2;
                                                    if (e instanceof ChartboostError.Load) {
                                                    }
                                                    String code22 = internal2.getCode();
                                                    StringBuilder sb32 = new StringBuilder();
                                                    str = str2;
                                                    sb32.append(str);
                                                    sb32.append(code22);
                                                    sb32.append("] Exception occurred while trying to extract codecs with ");
                                                    sb32.append(j);
                                                    sb32.append(" bytes from ");
                                                    sb32.append(url5);
                                                    xb.b(sb32.toString(), internal2);
                                                    th = e;
                                                    url2 = url5;
                                                    i3 = b7Var;
                                                    i2 = i6;
                                                    aVar2 = aVar3;
                                                    xb.a("Partial downloads failed, attempting full file download for " + url2, (Throwable) null, 2, (Object) null);
                                                    aVar2.b = url2;
                                                    aVar2.c = th;
                                                    aVar2.d = null;
                                                    aVar2.e = null;
                                                    aVar2.f = i2;
                                                    aVar2.i = 2;
                                                    a2 = i3.a(url2, -1L, aVar2);
                                                    if (a2 == coroutine_suspended) {
                                                    }
                                                }
                                            }
                                        } catch (Exception e9) {
                                            e = e9;
                                            str2 = str3;
                                            b7 b7Var22 = i3;
                                            url5 = url2;
                                            aVar = aVar2;
                                            i6 = i2;
                                            b7Var = b7Var22;
                                            if (e instanceof ChartboostError.Load) {
                                            }
                                            String code222 = internal2.getCode();
                                            StringBuilder sb322 = new StringBuilder();
                                            str = str2;
                                            sb322.append(str);
                                            sb322.append(code222);
                                            sb322.append("] Exception occurred while trying to extract codecs with ");
                                            sb322.append(j);
                                            sb322.append(" bytes from ");
                                            sb322.append(url5);
                                            xb.b(sb322.toString(), internal2);
                                            th = e;
                                            url2 = url5;
                                            i3 = b7Var;
                                            i2 = i6;
                                            aVar2 = aVar3;
                                            xb.a("Partial downloads failed, attempting full file download for " + url2, (Throwable) null, 2, (Object) null);
                                            aVar2.b = url2;
                                            aVar2.c = th;
                                            aVar2.d = null;
                                            aVar2.e = null;
                                            aVar2.f = i2;
                                            aVar2.i = 2;
                                            a2 = i3.a(url2, -1L, aVar2);
                                            if (a2 == coroutine_suspended) {
                                            }
                                        }
                                    } else {
                                        str = str3;
                                        xb.a("Partial downloads failed, attempting full file download for " + url2, (Throwable) null, 2, (Object) null);
                                        aVar2.b = url2;
                                        aVar2.c = th;
                                        aVar2.d = null;
                                        aVar2.e = null;
                                        aVar2.f = i2;
                                        aVar2.i = 2;
                                        a2 = i3.a(url2, -1L, aVar2);
                                        if (a2 == coroutine_suspended) {
                                        }
                                    }
                                }
                            }
                            if (e instanceof ChartboostError.Load) {
                                internal2 = (ChartboostError.Load) e;
                                aVar3 = aVar;
                            } else if (e instanceof IOException) {
                                String url6 = url5.toString();
                                String message = e.getMessage();
                                StringBuilder sb4 = new StringBuilder();
                                aVar3 = aVar;
                                sb4.append("Failed to download partial file: ");
                                sb4.append(message);
                                internal2 = new ChartboostError.Load.AssetUnavailable(url6, sb4.toString(), e);
                            } else {
                                aVar3 = aVar;
                                internal2 = new ChartboostError.Load.Internal("Failed to extract codecs from partial download: " + e.getMessage(), e);
                            }
                            String code2222 = internal2.getCode();
                            StringBuilder sb3222 = new StringBuilder();
                            str = str2;
                            sb3222.append(str);
                            sb3222.append(code2222);
                            sb3222.append("] Exception occurred while trying to extract codecs with ");
                            sb3222.append(j);
                            sb3222.append(" bytes from ");
                            sb3222.append(url5);
                            xb.b(sb3222.toString(), internal2);
                            th = e;
                            url2 = url5;
                            i3 = b7Var;
                            i2 = i6;
                            aVar2 = aVar3;
                            xb.a("Partial downloads failed, attempting full file download for " + url2, (Throwable) null, 2, (Object) null);
                            aVar2.b = url2;
                            aVar2.c = th;
                            aVar2.d = null;
                            aVar2.e = null;
                            aVar2.f = i2;
                            aVar2.i = 2;
                            a2 = i3.a(url2, -1L, aVar2);
                            if (a2 == coroutine_suspended) {
                            }
                        } else {
                            xb.e("Downloaded file doesn't exist: " + file.getAbsolutePath(), null, 2, null);
                        }
                        aVar4 = aVar2;
                        aVar2 = aVar4;
                    }
                    str3 = str2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i4 = aVar.f;
                    th2 = (Throwable) aVar.c;
                    url2 = (URL) aVar.b;
                    try {
                        ResultKt.throwOnFailure(obj);
                        a2 = ((Result) obj).getValue();
                        str = X3.j.d;
                        try {
                        } catch (Exception e10) {
                            th2 = e10;
                            i2 = i4;
                        }
                    } catch (Exception e11) {
                        th2 = e11;
                        i2 = i4;
                        str = X3.j.d;
                        if (th2 instanceof ChartboostError.Load) {
                        }
                        xb.b(str + internal3.getCode() + "] Exception occurred while trying to download full file from " + url2, internal3);
                        String a62 = a();
                        c();
                        if (i2 != 0) {
                        }
                    }
                    if (Result.m8028isFailureimpl(a2)) {
                        if (Result.m8028isFailureimpl(a2)) {
                            a2 = null;
                        }
                        File file2 = (File) a2;
                        if (file2 != null) {
                            try {
                                xb.a("Successfully downloaded full file: " + file2.getAbsolutePath() + " with size " + file2.length() + " bytes", (Throwable) null, 2, (Object) null);
                                String absolutePath3 = file2.getAbsolutePath();
                                Intrinsics.checkNotNullExpressionValue(absolutePath3, "getAbsolutePath(...)");
                                a5 = a(absolutePath3);
                            } catch (Exception e12) {
                                th2 = e12;
                                i2 = 1;
                                if (th2 instanceof ChartboostError.Load) {
                                    internal3 = (ChartboostError.Load) th2;
                                } else if (th2 instanceof IOException) {
                                    internal3 = new ChartboostError.Load.AssetUnavailable(url2.toString(), "Failed to download full file: " + th2.getMessage(), th2);
                                } else {
                                    internal3 = new ChartboostError.Load.Internal("Failed to process full file download: " + th2.getMessage(), th2);
                                }
                                xb.b(str + internal3.getCode() + "] Exception occurred while trying to download full file from " + url2, internal3);
                                String a622 = a();
                                c();
                                if (i2 != 0) {
                                }
                            }
                            if (!a5.isEmpty()) {
                                xb.a("Successfully extracted " + a5.size() + " codecs from full file: " + a5, (Throwable) null, 2, (Object) null);
                                return a5;
                            }
                            i2 = 1;
                            String a6222 = a();
                            c();
                            if (i2 != 0) {
                                xb.e("All download attempts failed for " + url2 + ". " + a6222, null, 2, null);
                                throw new ChartboostError.Load.AssetUnavailable(url2.toString(), "Failed to download media file for codec detection: " + (th2 != null ? th2.getMessage() : null) + ". " + a6222, a(url2, th2));
                            }
                            xb.e("Failed to extract codecs from successfully downloaded file: " + url2 + ". " + a6222, null, 2, null);
                            throw new ChartboostError.Load.UnsupportedCodec("Failed to extract codecs from media file: " + url2 + ". " + a6222, new uj("Problem displaying MediaFile from URI " + url2, 405));
                        }
                    } else {
                        th2 = Result.m8026exceptionOrNullimpl(a2);
                        xb.e("Failed to download full file from " + url2 + ": " + th2, null, 2, null);
                    }
                    i2 = i4;
                    String a62222 = a();
                    c();
                    if (i2 != 0) {
                    }
                }
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.h;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.i;
        String str32 = X3.j.d;
        if (i != 0) {
        }
    }

    public static final Object c(URL url, Continuation continuation) {
        return b(url, continuation);
    }

    public static final void c() {
        try {
            Set b = b();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(b, 10));
            Iterator it = b.iterator();
            while (it.hasNext()) {
                arrayList.add(StringsKt.removePrefix((String) it.next(), "video/"));
            }
            xb.a("Device codec capabilities - Video: [" + CollectionsKt.joinToString$default(CollectionsKt.sorted(arrayList), ", ", null, null, 0, null, null, 62, null) + X3.j.e, (Throwable) null, 2, (Object) null);
        } catch (Exception e) {
            xb.e("Device codec capabilities - Unable to retrieve: " + e.getMessage(), null, 2, null);
        }
    }

    public static final Integer a(MediaFormat mediaFormat, String str) {
        try {
            if (mediaFormat.containsKey(str)) {
                return Integer.valueOf(mediaFormat.getInteger(str));
            }
            return null;
        } catch (Exception e) {
            xb.d("Failed to get integer value for key " + str, e);
            return null;
        }
    }

    public static final Long b(MediaFormat mediaFormat, String str) {
        try {
            if (mediaFormat.containsKey(str)) {
                return Long.valueOf(mediaFormat.getLong(str));
            }
            return null;
        } catch (Exception e) {
            xb.d("Failed to get long value for key " + str, e);
            return null;
        }
    }

    public static final Set b() {
        try {
            MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
            Intrinsics.checkNotNullExpressionValue(codecInfos, "getCodecInfos(...)");
            ArrayList arrayList = new ArrayList();
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                if (!mediaCodecInfo.isEncoder()) {
                    arrayList.add(mediaCodecInfo);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String[] supportedTypes = ((MediaCodecInfo) it.next()).getSupportedTypes();
                Intrinsics.checkNotNullExpressionValue(supportedTypes, "getSupportedTypes(...)");
                CollectionsKt.addAll(arrayList2, ArraysKt.toList(supportedTypes));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                String str = (String) obj;
                Intrinsics.checkNotNull(str);
                if (StringsKt.startsWith$default(str, "video/", false, 2, (Object) null)) {
                    arrayList3.add(obj);
                }
            }
            return CollectionsKt.toSet(arrayList3);
        } catch (Exception unused) {
            return SetsKt.emptySet();
        }
    }

    public static final uj a(URL url, Throwable th) {
        String str;
        int a2 = a(th);
        if (th == null || (str = th.getMessage()) == null) {
            str = "download failed";
        }
        return new uj("Unable to fetch MediaFile from URI " + url + " (" + str + ")", a2);
    }

    public static final String a() {
        return Build.MANUFACTURER + " " + Build.MODEL + ", API " + Build.VERSION.SDK_INT;
    }

    public static final List a(String str) {
        ChartboostError unsupportedCodec;
        try {
            File file = new File(str);
            if (!file.exists()) {
                xb.e("File does not exist: " + str, null, 2, null);
                return CollectionsKt.emptyList();
            }
            if (!file.canRead()) {
                xb.e("Cannot read file: " + str, null, 2, null);
                return CollectionsKt.emptyList();
            }
            xb.a("Attempting to extract codecs from: " + str + " (" + file.length() + " bytes)", (Throwable) null, 2, (Object) null);
            MediaExtractor mediaExtractor = new MediaExtractor();
            try {
                mediaExtractor.setDataSource(str);
                int trackCount = mediaExtractor.getTrackCount();
                xb.a("MediaExtractor found " + trackCount + " tracks", (Throwable) null, 2, (Object) null);
                if (trackCount == 0) {
                    xb.e("No tracks found in media file", null, 2, null);
                    return CollectionsKt.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < trackCount; i++) {
                    try {
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                        Intrinsics.checkNotNullExpressionValue(trackFormat, "getTrackFormat(...)");
                        String string = trackFormat.getString("mime");
                        if (string != null) {
                            arrayList.add(string);
                            xb.d("Track " + i + ": Found codec: " + string, null, 2, null);
                            xb.d("  Duration: " + b(trackFormat, "durationUs") + ", Bitrate: " + a(trackFormat, VastAttributes.BITRATE), null, 2, null);
                        } else {
                            xb.d("Track " + i + ": No MIME type found", null, 2, null);
                        }
                    } catch (Exception e) {
                        ChartboostError.Load.UnsupportedCodec unsupportedCodec2 = new ChartboostError.Load.UnsupportedCodec("Failed to extract codec info for track " + i + ": " + e.getMessage(), e);
                        xb.e(X3.j.d + unsupportedCodec2.getCode() + "] Failed to get format for track " + i, unsupportedCodec2);
                    }
                }
                return arrayList;
            } finally {
                mediaExtractor.release();
            }
        } catch (Exception e2) {
            if (e2 instanceof IOException) {
                unsupportedCodec = new ChartboostError.Load.AssetUnavailable(str, "Failed to read media file: " + e2.getMessage(), e2);
            } else if (e2 instanceof IllegalArgumentException) {
                unsupportedCodec = new ChartboostError.Load.InvalidAssetUrl(str, "Invalid media file path: " + e2.getMessage(), e2);
            } else {
                unsupportedCodec = new ChartboostError.Load.UnsupportedCodec("Failed to extract codecs from media file: " + e2.getMessage() + ". " + a(), e2);
            }
            xb.e(X3.j.d + unsupportedCodec.getCode() + "] Failed to extract codecs from " + str + ". " + a(), unsupportedCodec);
            c();
            return CollectionsKt.emptyList();
        }
    }

    public static final int a(Throwable th) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (th != null && linkedHashSet.add(th)) {
            if (th instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                int b = ((com.chartboost.sdk.internal.Networking.okhttp.a) th).b();
                return (b == 408 || b == 504) ? 402 : 401;
            }
            if ((th instanceof SocketTimeoutException) || (th instanceof InterruptedIOException)) {
                return 402;
            }
            if ((th instanceof UnknownHostException) || (th instanceof ConnectException) || (th instanceof NoRouteToHostException)) {
                return 400;
            }
            th = th.getCause();
        }
        return 400;
    }
}
