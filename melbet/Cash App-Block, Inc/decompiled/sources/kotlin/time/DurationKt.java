package kotlin.time;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.os.SystemClock;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.AbstractList;
import kotlin.collections.AbstractMutableList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.ScopeCoroutine;
import okhttp3.MediaType;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okio.Buffer;
import okio.Okio;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.internal._ZlibJvmKt;
import papa.AppTask;

/* loaded from: classes3.dex */
public abstract class DurationKt {
    public static final String access$subarrayContentToString(Object[] objArr, int i, int i2, AbstractMutableList abstractMutableList) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == abstractMutableList) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final long addMillisWithoutOverflow(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : RangesKt___RangesKt.coerceIn(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public static final boolean arrayRangeEquals(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        bArr.getClass();
        bArr2.getClass();
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(j, "size=", " offset=");
            m1149m.append(j2);
            m1149m.append(" byteCount=");
            m1149m.append(j3);
            throw new ArrayIndexOutOfBoundsException(m1149m.toString());
        }
    }

    public static ResponseBody$Companion$asResponseBody$1 create(String str, MediaType mediaType) {
        str.getClass();
        Pair chooseCharset = Okio.chooseCharset(mediaType);
        Charset charset = (Charset) chooseCharset.first;
        MediaType mediaType2 = (MediaType) chooseCharset.second;
        Buffer buffer = new Buffer();
        charset.getClass();
        int length = str.length();
        str.getClass();
        charset.getClass();
        if (length < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m("endIndex < beginIndex: ", length, 0, " < "));
        } else if (length > str.length()) {
            Path$$ExternalSyntheticBUOutline0.m$1(str.length(), JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(length, "endIndex > string.length: ", " > "));
        } else if (charset.equals(Charsets.UTF_8)) {
            buffer.m4338writeUtf8(0, length, str);
        } else {
            byte[] bytes = str.substring(0, length).getBytes(charset);
            bytes.getClass();
            buffer.write(bytes, 0, bytes.length);
        }
        return new ResponseBody$Companion$asResponseBody$1(mediaType2, buffer.size, buffer);
    }

    public static final long durationOfMillis(long j) {
        long j2 = (j << 1) + 1;
        Duration.Companion.getClass();
        ThreadLocal[] threadLocalArr = DurationJvmKt.precisionFormats;
        return j2;
    }

    public static final long durationOfMillisNormalized(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? durationOfMillis(RangesKt___RangesKt.coerceIn(j, -4611686018427387903L, 4611686018427387903L)) : durationOfNanos(j * 1000000);
    }

    public static final long durationOfNanos(long j) {
        long j2 = j << 1;
        Duration.Companion.getClass();
        ThreadLocal[] threadLocalArr = DurationJvmKt.precisionFormats;
        return j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d6, code lost:
    
        if (r5 == r27.length()) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01de, code lost:
    
        if (r27.charAt(r5) != 'S') goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e0, code lost:
    
        r2 = (r14 * 1000000000) + r15;
        r14 = r9;
        r4 = kotlin.time.DurationUnit.SECONDS;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f0, code lost:
    
        switch(r4.ordinal()) {
            case 0: goto L135;
            case 1: goto L134;
            case 2: goto L133;
            case 3: goto L132;
            case 4: goto L131;
            case 5: goto L130;
            case 6: goto L129;
            default: goto L128;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f3, code lost:
    
        okio.Path$$ExternalSyntheticBUOutline0.m$1(r4, "Unknown unit: ");
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x022a, code lost:
    
        r14 = r2 * r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01fb, code lost:
    
        r21 = 0.0864d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0224, code lost:
    
        r2 = kotlin.math.MathKt__MathJVMKt.roundToLong(r2 * r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0201, code lost:
    
        r21 = 0.0036d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0207, code lost:
    
        r21 = 6.0E-5d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x020d, code lost:
    
        r21 = 1.0E-6d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0213, code lost:
    
        r21 = 1.0E-9d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0219, code lost:
    
        r21 = 1.0E-12d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x021f, code lost:
    
        r21 = 1.0E-15d;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017a A[LOOP:5: B:78:0x0178->B:79:0x017a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b3 A[LOOP:7: B:90:0x01b1->B:91:0x01b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long parseDuration$default(String str) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        DurationUnit durationUnit;
        int i7;
        int min;
        int i8;
        char charAt;
        long j;
        char charAt2;
        long j2;
        int i9;
        long j3;
        if (str.length() == 0) {
            a$$ExternalSyntheticBUOutline0.m$3("The string is empty");
            return 0L;
        }
        char charAt3 = str.charAt(0);
        int i10 = 1;
        char c = '-';
        char c2 = '+';
        if (charAt3 != '+') {
            i2 = charAt3 != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        if (str.length() <= i2) {
            a$$ExternalSyntheticBUOutline0.m$3("No components");
            return 0L;
        }
        if (str.charAt(i2) != 'P') {
            a$$ExternalSyntheticBUOutline0.m$3("");
            return 0L;
        }
        int i11 = i2 + 1;
        if (i11 == str.length()) {
            a$$ExternalSyntheticBUOutline0.m$3("");
            return 0L;
        }
        int i12 = 0;
        DurationUnit durationUnit2 = null;
        long j4 = 0;
        long j5 = 0;
        while (i11 < str.length()) {
            char charAt4 = str.charAt(i11);
            if (charAt4 != 'T') {
                LongParser longParser = LongParser.iso;
                InstantKt.getIso();
                LongParser longParser2 = LongParser.iso;
                z = longParser2.allowSign;
                if (z) {
                    i3 = i10;
                    char charAt5 = str.charAt(i11);
                    if (charAt5 == c2) {
                        i4 = i11 + 1;
                        i5 = i3;
                        while (i4 < str.length()) {
                            i4++;
                        }
                        long j6 = 0;
                        while (i4 < str.length()) {
                        }
                        int i13 = i11;
                        i6 = i;
                        if (i4 != str.length()) {
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("");
                        return 0L;
                    }
                    if (charAt5 == c) {
                        i4 = i11 + 1;
                        i5 = -1;
                        while (i4 < str.length() && str.charAt(i4) == '0') {
                            i4++;
                        }
                        long j62 = 0;
                        while (i4 < str.length()) {
                            char charAt6 = str.charAt(i4);
                            LongParser longParser3 = longParser2;
                            if ('0' <= charAt6 && charAt6 < ':') {
                                int i14 = charAt6 - '0';
                                j = longParser3.overflowThreshold;
                                if (j62 <= j) {
                                    j2 = longParser3.overflowThreshold;
                                    if (j62 == j2) {
                                        i9 = i;
                                        long j7 = i14;
                                        j3 = longParser3.lastDigitMax;
                                        if (j7 > j3) {
                                            i6 = i9;
                                        }
                                    } else {
                                        i9 = i;
                                    }
                                    int i15 = i9;
                                    j62 = (j62 << 3) + (j62 << i3) + i14;
                                    i4++;
                                    longParser2 = longParser3;
                                    i11 = i11;
                                    i = i15;
                                } else {
                                    i6 = i;
                                }
                                int i16 = i11;
                                while (i4 < str.length() && '0' <= (charAt2 = str.charAt(i4)) && charAt2 < ':') {
                                    i4++;
                                }
                                if (i4 != str.length()) {
                                    if (i4 != i16 + ((charAt4 == '+' || charAt4 == '-') ? i3 : 0)) {
                                        LongParser longParser4 = LongParser.iso;
                                        j62 = 4611686018427387903L;
                                        long j8 = j62;
                                        if (str.charAt(i4) == '.') {
                                            int i17 = i4 + 1;
                                            int min2 = Math.min(i4 + 7, str.length());
                                            int i18 = 0;
                                            for (int i19 = i17; i19 < min2; i19++) {
                                                char charAt7 = str.charAt(i19);
                                                if ('0' <= charAt7 && charAt7 < ':') {
                                                    i18 = (charAt7 - '0') + (i18 << 3) + (i18 << 1);
                                                }
                                                for (i7 = 0; i7 < 6 - (i19 - i17); i7++) {
                                                    i18 = (i18 << 1) + (i18 << 3);
                                                }
                                                min = Math.min(i19 + 9, str.length());
                                                i4 = i19;
                                                int i20 = 0;
                                                while (i4 < min) {
                                                    char charAt8 = str.charAt(i4);
                                                    int i21 = min;
                                                    if ('0' <= charAt8 && charAt8 < ':') {
                                                        i20 = (charAt8 - '0') + (i20 << 3) + (i20 << 1);
                                                        i4++;
                                                        min = i21;
                                                    }
                                                    for (i8 = 0; i8 < 9 - (i4 - i19); i8++) {
                                                        i20 = (i20 << 1) + (i20 << 3);
                                                    }
                                                    while (i4 < str.length() && '0' <= (charAt = str.charAt(i4)) && charAt < ':') {
                                                        i4++;
                                                    }
                                                    a$$ExternalSyntheticBUOutline0.m$3("");
                                                    return 0L;
                                                }
                                                while (i8 < 9 - (i4 - i19)) {
                                                }
                                                while (i4 < str.length()) {
                                                    i4++;
                                                }
                                                a$$ExternalSyntheticBUOutline0.m$3("");
                                                return 0L;
                                            }
                                            while (i7 < 6 - (i19 - i17)) {
                                            }
                                            min = Math.min(i19 + 9, str.length());
                                            i4 = i19;
                                            int i202 = 0;
                                            while (i4 < min) {
                                            }
                                            while (i8 < 9 - (i4 - i19)) {
                                            }
                                            while (i4 < str.length()) {
                                            }
                                            a$$ExternalSyntheticBUOutline0.m$3("");
                                            return 0L;
                                        }
                                        char charAt9 = str.charAt(i4);
                                        durationUnit = charAt9 == 'D' ? charAt9 != 'H' ? charAt9 != 'M' ? charAt9 != 'S' ? null : DurationUnit.SECONDS : DurationUnit.MINUTES : DurationUnit.HOURS : DurationUnit.DAYS;
                                        if (durationUnit != null) {
                                            throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i4));
                                        }
                                        if (durationUnit2 != null && durationUnit2.compareTo(durationUnit) <= 0) {
                                            a$$ExternalSyntheticBUOutline0.m$3("Unexpected order of duration components");
                                            return 0L;
                                        }
                                        if (durationUnit == DurationUnit.DAYS) {
                                            if (i12 != 0) {
                                                a$$ExternalSyntheticBUOutline0.m$3("");
                                                return 0L;
                                            }
                                            j4 = DurationUnitKt__DurationUnitKt.convertDurationUnitToMilliseconds(j8, durationUnit) * i5;
                                        } else {
                                            if (i12 == 0) {
                                                a$$ExternalSyntheticBUOutline0.m$3("");
                                                return 0L;
                                            }
                                            long addMillisWithoutOverflow = addMillisWithoutOverflow(j4, DurationUnitKt__DurationUnitKt.convertDurationUnitToMilliseconds(j8, durationUnit) * i5);
                                            if (addMillisWithoutOverflow == 9223372036854759646L) {
                                                a$$ExternalSyntheticBUOutline0.m$3("");
                                                return 0L;
                                            }
                                            j4 = addMillisWithoutOverflow;
                                        }
                                        i11 = i4 + 1;
                                        durationUnit2 = durationUnit;
                                        i10 = i3;
                                        i = i6;
                                        c = '-';
                                        c2 = '+';
                                    }
                                }
                                a$$ExternalSyntheticBUOutline0.m$3("");
                                return 0L;
                            }
                            int i132 = i11;
                            i6 = i;
                            if (i4 != str.length()) {
                                if (i4 == i132 + ((charAt4 == '+' || charAt4 == '-') ? i3 : 0)) {
                                }
                                long j82 = j62;
                                if (str.charAt(i4) == '.') {
                                }
                                char charAt92 = str.charAt(i4);
                                if (charAt92 == 'D') {
                                }
                                if (durationUnit != null) {
                                }
                            }
                            a$$ExternalSyntheticBUOutline0.m$3("");
                            return 0L;
                        }
                        int i1322 = i11;
                        i6 = i;
                        if (i4 != str.length()) {
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("");
                        return 0L;
                    }
                } else {
                    i3 = i10;
                }
                i4 = i11;
                i5 = i3;
                while (i4 < str.length()) {
                }
                long j622 = 0;
                while (i4 < str.length()) {
                }
                int i13222 = i11;
                i6 = i;
                if (i4 != str.length()) {
                }
                a$$ExternalSyntheticBUOutline0.m$3("");
                return 0L;
            }
            if (i12 != 0 || (i11 = i11 + 1) == str.length()) {
                a$$ExternalSyntheticBUOutline0.m$3("");
                return 0L;
            }
            i12 = i10;
        }
        int i22 = i;
        long m4173plusLRDsOJo = Duration.m4173plusLRDsOJo(toDuration(j4, DurationUnit.MILLISECONDS), toDuration(j5, DurationUnit.NANOSECONDS));
        if (i22 == 0) {
            return m4173plusLRDsOJo;
        }
        Duration.Companion.getClass();
        return !Duration.m4166equalsimpl0(m4173plusLRDsOJo, Duration.INVALID) ? Duration.m4179unaryMinusUwyO8pc(m4173plusLRDsOJo) : m4173plusLRDsOJo;
    }

    public static final void resetRange(int i, int i2, Object[] objArr) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final long reverseBytes(long j) {
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    public static final Object startUndispatched(ScopeCoroutine scopeCoroutine, boolean z, ScopeCoroutine scopeCoroutine2, Function2 function2) {
        Object completedExceptionally;
        Object makeCompletingOnce$kotlinx_coroutines_core;
        try {
            if (function2 instanceof BaseContinuationImpl) {
                TypeIntrinsics.beforeCheckcastToFunctionOfArity(2, function2);
                completedExceptionally = function2.invoke(scopeCoroutine2, scopeCoroutine);
            } else {
                completedExceptionally = IntrinsicsKt__IntrinsicsJvmKt.wrapWithContinuationImpl(function2, scopeCoroutine2, scopeCoroutine);
            }
        } catch (DispatchException e) {
            Throwable th = e.cause;
            scopeCoroutine.makeCompleting$kotlinx_coroutines_core(new CompletedExceptionally(th, false));
            throw th;
        } catch (Throwable th2) {
            completedExceptionally = new CompletedExceptionally(th2, false);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (completedExceptionally == coroutineSingletons || (makeCompletingOnce$kotlinx_coroutines_core = scopeCoroutine.makeCompletingOnce$kotlinx_coroutines_core(completedExceptionally)) == JobKt.COMPLETING_WAITING_CHILDREN) {
            return coroutineSingletons;
        }
        scopeCoroutine.afterCompletionUndispatched();
        if (!(makeCompletingOnce$kotlinx_coroutines_core instanceof CompletedExceptionally)) {
            return JobKt.unboxState(makeCompletingOnce$kotlinx_coroutines_core);
        }
        if (!z) {
            Throwable th3 = ((CompletedExceptionally) makeCompletingOnce$kotlinx_coroutines_core).cause;
            if ((th3 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th3).coroutine == scopeCoroutine) {
                if (completedExceptionally instanceof CompletedExceptionally) {
                    throw ((CompletedExceptionally) completedExceptionally).cause;
                }
                return completedExceptionally;
            }
        }
        throw ((CompletedExceptionally) makeCompletingOnce$kotlinx_coroutines_core).cause;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [papa.AppTask] */
    public static ArrayList toAppTasks(List list) {
        long j;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ActivityManager.RecentTaskInfo taskInfo = ((ActivityManager.AppTask) it.next()).getTaskInfo();
                try {
                    String obj = taskInfo.toString();
                    obj.getClass();
                    j = SystemClock.elapsedRealtime() - Long.parseLong(StringsKt.substringBefore(StringsKt.substringAfter(obj, "lastActiveTime=", ""), " ", ""));
                } catch (NumberFormatException unused) {
                    j = 0;
                }
                ComponentName componentName = taskInfo.topActivity;
                r3 = new AppTask(componentName != null ? componentName.toShortString() : null, Long.valueOf(j), Integer.valueOf(taskInfo.numActivities), taskInfo.baseIntent.toString());
            } catch (IllegalArgumentException unused2) {
            }
            if (r3 != null) {
                arrayList.add(r3);
            }
        }
        return arrayList;
    }

    public static final long toDuration(long j, DurationUnit durationUnit) {
        DurationUnit durationUnit2 = DurationUnit.NANOSECONDS;
        TimeUnit timeUnit = durationUnit.timeUnit;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-convert) <= j && j <= convert) {
            return durationOfNanos(timeUnit2.convert(j, timeUnit));
        }
        if (durationUnit.compareTo(DurationUnit.MILLISECONDS) < 0) {
            return durationOfMillis(RangesKt___RangesKt.coerceIn(TimeUnit.MILLISECONDS.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long signum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return durationOfMillis(DurationUnitKt__DurationUnitKt.convertDurationUnitToMilliseconds(Math.abs(j), durationUnit) * signum);
    }

    public static final String toHexString(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = _ZlibJvmKt.HEX_DIGIT_CHARS;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        AbstractList.Companion.getClass();
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i2, 8, 8);
        return new String(cArr2, i2, 8 - i2);
    }

    public static final int reverseBytes(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final long toDuration(int i, DurationUnit durationUnit) {
        if (durationUnit.compareTo(DurationUnit.SECONDS) <= 0) {
            long j = i;
            DurationUnit durationUnit2 = DurationUnit.NANOSECONDS;
            return durationOfNanos(TimeUnit.NANOSECONDS.convert(j, durationUnit.timeUnit));
        }
        return toDuration(i, durationUnit);
    }

    public static final long toDuration(double d, DurationUnit durationUnit) {
        durationUnit.getClass();
        double convertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d, durationUnit, DurationUnit.NANOSECONDS);
        if (!Double.isNaN(convertDurationUnit)) {
            long roundToLong = MathKt__MathJVMKt.roundToLong(convertDurationUnit);
            if (-4611686018426999999L <= roundToLong && roundToLong < 4611686018427000000L) {
                return durationOfNanos(roundToLong);
            }
            return durationOfMillisNormalized(MathKt__MathJVMKt.roundToLong(DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d, durationUnit, DurationUnit.MILLISECONDS)));
        }
        a$$ExternalSyntheticBUOutline0.m$3("Duration value cannot be NaN.");
        return 0L;
    }

    public static final String toHexString(byte b) {
        char[] cArr = _ZlibJvmKt.HEX_DIGIT_CHARS;
        return new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]});
    }
}
