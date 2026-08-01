package io.ktor.utils.io.core.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.ktor.http.ContentDisposition;
import io.ktor.utils.io.charsets.TooLongLineException;
import io.ktor.utils.io.core.Buffer;
import io.ktor.utils.io.core.Input;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import org.objectweb.asm.Opcodes;

/* compiled from: UTF8.kt */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0014\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u0011\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0082\b\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0000\u001a_\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\u0013\u001a\u00020\u00012$\u0010\u0014\u001a \b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001b0\u001aH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a\u0010\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001H\u0001\u001a\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0001H\u0001\u001a\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0001H\u0001\u001a\u0010\u0010!\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001H\u0001\u001a\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0001H\u0001\u001a\u0010\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\u0001H\u0001\u001a\u0010\u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020\u0001H\u0002\u001a$\u0010)\u001a\u00020\u000f*\u00020*2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u001aH\u0080\bø\u0001\u0001\u001a$\u0010,\u001a\u00020\u0001*\u00020*2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u001aH\u0080\bø\u0001\u0001\u001aA\u0010-\u001a\u00020.*\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u00020\u0001H\u0000ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001aQ\u00108\u001a\u00020.*\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u00012\u0006\u0010<\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u0001H\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001aQ\u0010?\u001a\u00020.*\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u00012\u0006\u0010<\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u0001H\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b@\u0010>\u001a*\u0010A\u001a\u00020\u0001*\u00020/2\u0006\u0010B\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0080\bø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\bC\u0010D\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001¨\u0006E"}, d2 = {"HighSurrogateMagic", "", "MaxCodePoint", "MinHighSurrogate", "MinLowSurrogate", "MinSupplementary", "byteCountUtf8", "firstByte", "charactersSize", "v", "codePoint", "high", "", "low", "decodeUTF8LineLoopSuspend", "", "out", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "limit", "nextChunk", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lio/ktor/utils/io/core/Input;", "", "afterRead", "Lkotlin/Function1;", "", "(Ljava/lang/Appendable;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "highSurrogate", "cp", "isBmpCodePoint", "isValidCodePoint", "lowSurrogate", "malformedByteCount", "", "byteCount", "malformedCodePoint", "value", "prematureEndOfStreamUtf", ContentDisposition.Parameters.Size, "decodeASCII", "Lio/ktor/utils/io/core/Buffer;", "consumer", "decodeUTF8", "encodeUTF8", "Lio/ktor/utils/io/core/internal/EncodeResult;", "Lio/ktor/utils/io/bits/Memory;", "text", "", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "dstOffset", "dstLimit", "encodeUTF8-lBXzO7A", "(Ljava/nio/ByteBuffer;Ljava/lang/CharSequence;IIII)I", "encodeUTF8Stage1", "index1", "lastCharIndex", "resultPosition1", "resultLimit", "encodeUTF8Stage1-Vm9B2pQ", "(Ljava/nio/ByteBuffer;Ljava/lang/CharSequence;IIIIII)I", "encodeUTF8Stage2", "encodeUTF8Stage2-Vm9B2pQ", "putUtf8Char", TypedValues.CycleType.S_WAVE_OFFSET, "putUtf8Char-62zg_DM", "(Ljava/nio/ByteBuffer;II)I", "ktor-io"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UTF8Kt {
    private static final int HighSurrogateMagic = 55232;
    private static final int MaxCodePoint = 1114111;
    private static final int MinHighSurrogate = 55296;
    private static final int MinLowSurrogate = 56320;
    private static final int MinSupplementary = 65536;

    public static final int byteCountUtf8(int i) {
        int i2 = 0;
        int i3 = 128;
        for (int i4 = 1; i4 < 7 && (i & i3) != 0; i4++) {
            i &= ~i3;
            i3 >>= 1;
            i2++;
        }
        return i2;
    }

    public static final int codePoint(char c, char c2) {
        return ((c - HighSurrogateMagic) << 10) | (c2 - MinLowSurrogate);
    }

    public static final int highSurrogate(int i) {
        return (i >>> 10) + HighSurrogateMagic;
    }

    public static final boolean isBmpCodePoint(int i) {
        return (i >>> 16) == 0;
    }

    public static final boolean isValidCodePoint(int i) {
        return i <= MaxCodePoint;
    }

    public static final int lowSurrogate(int i) {
        return (i & 1023) + MinLowSurrogate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0224, code lost:
    
        r0.discardExact(((r15 - r17) - r7.element) + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x016d, code lost:
    
        r10 = r22;
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02e5, code lost:
    
        r13 = 0;
        r0.discardExact(((r15 - r17) - r7.element) + 1);
        r10 = r22;
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0168, code lost:
    
        r0.discardExact(r15 - r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01cc, code lost:
    
        r0.discardExact(r15 - r17);
        r2 = r7.element;
        r10 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0171, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0345 A[Catch: all -> 0x036a, TryCatch #1 {all -> 0x036a, blocks: (B:193:0x0133, B:195:0x0137, B:197:0x013a, B:199:0x013e, B:203:0x0168, B:99:0x033f, B:101:0x0345, B:102:0x034a, B:105:0x0357, B:111:0x0350, B:95:0x031c, B:204:0x0143, B:207:0x014c, B:208:0x0151, B:210:0x0155, B:211:0x0158, B:213:0x015c, B:215:0x0174, B:216:0x018e, B:218:0x018f, B:219:0x0199, B:82:0x019a, B:84:0x019e, B:87:0x01a6, B:89:0x01ab, B:91:0x01bc, B:97:0x01cc, B:113:0x01d6, B:115:0x01e9, B:117:0x01f1, B:119:0x01f6, B:121:0x01fa, B:128:0x0224, B:125:0x02c7, B:130:0x01ff, B:133:0x0208, B:134:0x020d, B:136:0x0211, B:137:0x0214, B:139:0x0218, B:141:0x0233, B:142:0x024d, B:143:0x024e, B:145:0x0256, B:147:0x025f, B:149:0x0263, B:152:0x028d, B:154:0x0298, B:156:0x029c, B:162:0x02a1, B:165:0x02aa, B:166:0x02af, B:168:0x02b3, B:169:0x02b6, B:171:0x02ba, B:173:0x02ca, B:174:0x02e4, B:161:0x02e5, B:176:0x0268, B:179:0x0271, B:180:0x0276, B:182:0x027a, B:183:0x027d, B:185:0x0281, B:187:0x02f5, B:188:0x030f, B:190:0x0310, B:191:0x031a, B:229:0x032e), top: B:192:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0350 A[Catch: all -> 0x036a, TryCatch #1 {all -> 0x036a, blocks: (B:193:0x0133, B:195:0x0137, B:197:0x013a, B:199:0x013e, B:203:0x0168, B:99:0x033f, B:101:0x0345, B:102:0x034a, B:105:0x0357, B:111:0x0350, B:95:0x031c, B:204:0x0143, B:207:0x014c, B:208:0x0151, B:210:0x0155, B:211:0x0158, B:213:0x015c, B:215:0x0174, B:216:0x018e, B:218:0x018f, B:219:0x0199, B:82:0x019a, B:84:0x019e, B:87:0x01a6, B:89:0x01ab, B:91:0x01bc, B:97:0x01cc, B:113:0x01d6, B:115:0x01e9, B:117:0x01f1, B:119:0x01f6, B:121:0x01fa, B:128:0x0224, B:125:0x02c7, B:130:0x01ff, B:133:0x0208, B:134:0x020d, B:136:0x0211, B:137:0x0214, B:139:0x0218, B:141:0x0233, B:142:0x024d, B:143:0x024e, B:145:0x0256, B:147:0x025f, B:149:0x0263, B:152:0x028d, B:154:0x0298, B:156:0x029c, B:162:0x02a1, B:165:0x02aa, B:166:0x02af, B:168:0x02b3, B:169:0x02b6, B:171:0x02ba, B:173:0x02ca, B:174:0x02e4, B:161:0x02e5, B:176:0x0268, B:179:0x0271, B:180:0x0276, B:182:0x027a, B:183:0x027d, B:185:0x0281, B:187:0x02f5, B:188:0x030f, B:190:0x0310, B:191:0x031a, B:229:0x032e), top: B:192:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0224 A[EDGE_INSN: B:127:0x0224->B:128:0x0224 BREAK  A[LOOP:1: B:76:0x0115->B:95:0x031c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x028d A[Catch: all -> 0x036a, TryCatch #1 {all -> 0x036a, blocks: (B:193:0x0133, B:195:0x0137, B:197:0x013a, B:199:0x013e, B:203:0x0168, B:99:0x033f, B:101:0x0345, B:102:0x034a, B:105:0x0357, B:111:0x0350, B:95:0x031c, B:204:0x0143, B:207:0x014c, B:208:0x0151, B:210:0x0155, B:211:0x0158, B:213:0x015c, B:215:0x0174, B:216:0x018e, B:218:0x018f, B:219:0x0199, B:82:0x019a, B:84:0x019e, B:87:0x01a6, B:89:0x01ab, B:91:0x01bc, B:97:0x01cc, B:113:0x01d6, B:115:0x01e9, B:117:0x01f1, B:119:0x01f6, B:121:0x01fa, B:128:0x0224, B:125:0x02c7, B:130:0x01ff, B:133:0x0208, B:134:0x020d, B:136:0x0211, B:137:0x0214, B:139:0x0218, B:141:0x0233, B:142:0x024d, B:143:0x024e, B:145:0x0256, B:147:0x025f, B:149:0x0263, B:152:0x028d, B:154:0x0298, B:156:0x029c, B:162:0x02a1, B:165:0x02aa, B:166:0x02af, B:168:0x02b3, B:169:0x02b6, B:171:0x02ba, B:173:0x02ca, B:174:0x02e4, B:161:0x02e5, B:176:0x0268, B:179:0x0271, B:180:0x0276, B:182:0x027a, B:183:0x027d, B:185:0x0281, B:187:0x02f5, B:188:0x030f, B:190:0x0310, B:191:0x031a, B:229:0x032e), top: B:192:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c6 A[EDGE_INSN: B:159:0x02c6->B:160:0x02c6 BREAK  A[LOOP:1: B:76:0x0115->B:95:0x031c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02e5 A[EDGE_INSN: B:175:0x02e5->B:161:0x02e5 BREAK  A[LOOP:1: B:76:0x0115->B:95:0x031c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0168 A[EDGE_INSN: B:202:0x0168->B:203:0x0168 BREAK  A[LOOP:1: B:76:0x0115->B:95:0x031c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00af -> B:10:0x00b4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object decodeUTF8LineLoopSuspend(Appendable appendable, int i, Function2<? super Integer, ? super Continuation<? super Input>, ? extends Object> function2, Function1<? super Integer, Unit> function1, Continuation<? super Boolean> continuation) {
        UTF8Kt$decodeUTF8LineLoopSuspend$1 uTF8Kt$decodeUTF8LineLoopSuspend$1;
        int i2;
        Ref.IntRef intRef;
        Ref.IntRef intRef2;
        Ref.BooleanRef booleanRef;
        Ref.BooleanRef booleanRef2;
        Appendable appendable2;
        Function1<? super Integer, Unit> function12;
        UTF8Kt$decodeUTF8LineLoopSuspend$1 uTF8Kt$decodeUTF8LineLoopSuspend$12;
        Object obj;
        int i3;
        Function2<? super Integer, ? super Continuation<? super Input>, ? extends Object> function22;
        Object invoke;
        ChunkBuffer chunkBuffer;
        Input input;
        int i4;
        ChunkBuffer chunkBuffer2;
        Input input2;
        Function2<? super Integer, ? super Continuation<? super Input>, ? extends Object> function23;
        UTF8Kt$decodeUTF8LineLoopSuspend$1 uTF8Kt$decodeUTF8LineLoopSuspend$13;
        Object obj2;
        Function1<? super Integer, Unit> function13;
        long j;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i6;
        if (continuation instanceof UTF8Kt$decodeUTF8LineLoopSuspend$1) {
            uTF8Kt$decodeUTF8LineLoopSuspend$1 = (UTF8Kt$decodeUTF8LineLoopSuspend$1) continuation;
            if ((uTF8Kt$decodeUTF8LineLoopSuspend$1.label & Integer.MIN_VALUE) != 0) {
                uTF8Kt$decodeUTF8LineLoopSuspend$1.label -= Integer.MIN_VALUE;
                Object obj3 = uTF8Kt$decodeUTF8LineLoopSuspend$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = uTF8Kt$decodeUTF8LineLoopSuspend$1.label;
                int i7 = 1;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i8 = uTF8Kt$decodeUTF8LineLoopSuspend$1.I$0;
                    Ref.BooleanRef booleanRef3 = (Ref.BooleanRef) uTF8Kt$decodeUTF8LineLoopSuspend$1.L$6;
                    Ref.BooleanRef booleanRef4 = (Ref.BooleanRef) uTF8Kt$decodeUTF8LineLoopSuspend$1.L$5;
                    Ref.IntRef intRef3 = (Ref.IntRef) uTF8Kt$decodeUTF8LineLoopSuspend$1.L$4;
                    Ref.IntRef intRef4 = (Ref.IntRef) uTF8Kt$decodeUTF8LineLoopSuspend$1.L$3;
                    Function1<? super Integer, Unit> function14 = (Function1) uTF8Kt$decodeUTF8LineLoopSuspend$1.L$2;
                    Function2<? super Integer, ? super Continuation<? super Input>, ? extends Object> function24 = (Function2) uTF8Kt$decodeUTF8LineLoopSuspend$1.L$1;
                    Appendable appendable3 = (Appendable) uTF8Kt$decodeUTF8LineLoopSuspend$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    uTF8Kt$decodeUTF8LineLoopSuspend$12 = uTF8Kt$decodeUTF8LineLoopSuspend$1;
                    i3 = i8;
                    function12 = function14;
                    intRef2 = intRef3;
                    booleanRef2 = booleanRef3;
                    obj = coroutine_suspended;
                    function22 = function24;
                    intRef = intRef4;
                    booleanRef = booleanRef4;
                    Input input3 = (Input) obj3;
                    if (input3 != null) {
                        long remaining = input3.getRemaining();
                        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input3, i7);
                        if (prepareReadFirstHead == null) {
                            function23 = function22;
                            function13 = function12;
                            uTF8Kt$decodeUTF8LineLoopSuspend$13 = uTF8Kt$decodeUTF8LineLoopSuspend$12;
                            obj2 = obj;
                            input = input3;
                            j = remaining;
                        } else {
                            ChunkBuffer chunkBuffer3 = prepareReadFirstHead;
                            int i9 = i7;
                            while (true) {
                                try {
                                    ChunkBuffer chunkBuffer4 = chunkBuffer3;
                                    int writePosition = chunkBuffer4.getWritePosition() - chunkBuffer4.getReadPosition();
                                    if (writePosition >= i9) {
                                        try {
                                            try {
                                                ChunkBuffer chunkBuffer5 = chunkBuffer3;
                                                Ref.IntRef intRef5 = new Ref.IntRef();
                                                function23 = function22;
                                                Ref.IntRef intRef6 = new Ref.IntRef();
                                                uTF8Kt$decodeUTF8LineLoopSuspend$13 = uTF8Kt$decodeUTF8LineLoopSuspend$12;
                                                Ref.IntRef intRef7 = new Ref.IntRef();
                                                obj2 = obj;
                                                Ref.IntRef intRef8 = new Ref.IntRef();
                                                function13 = function12;
                                                ByteBuffer memory = chunkBuffer5.getMemory();
                                                int readPosition = chunkBuffer5.getReadPosition();
                                                j = remaining;
                                                int writePosition2 = chunkBuffer5.getWritePosition();
                                                int i10 = readPosition;
                                                while (i10 < writePosition2) {
                                                    input2 = input3;
                                                    try {
                                                        int i11 = memory.get(i10) & 255;
                                                        ByteBuffer byteBuffer = memory;
                                                        chunkBuffer2 = chunkBuffer3;
                                                        Ref.IntRef intRef9 = intRef2;
                                                        int i12 = writePosition2;
                                                        if ((i11 & 128) != 0) {
                                                            if (intRef6.element == 0) {
                                                                intRef7.element = i11;
                                                                int i13 = 128;
                                                                for (int i14 = 1; i14 < 7 && (intRef7.element & i13) != 0; i14++) {
                                                                    intRef7.element &= ~i13;
                                                                    i13 >>= 1;
                                                                    intRef6.element++;
                                                                }
                                                                intRef8.element = intRef6.element;
                                                                intRef6.element--;
                                                                if (intRef8.element > i12 - i10) {
                                                                    break;
                                                                }
                                                            } else {
                                                                intRef7.element = (intRef7.element << 6) | (i11 & 127);
                                                                intRef6.element--;
                                                                if (intRef6.element == 0) {
                                                                    if (isBmpCodePoint(intRef7.element)) {
                                                                        char c = (char) intRef7.element;
                                                                        if (c != '\r') {
                                                                            if (c != '\n') {
                                                                                if (!booleanRef.element) {
                                                                                    if (intRef.element == i3) {
                                                                                        throw new TooLongLineException("Too many characters in line: limit " + i3 + " exceeded");
                                                                                    }
                                                                                    intRef.element++;
                                                                                    appendable3.append(c);
                                                                                    z4 = true;
                                                                                    if (!z4) {
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    booleanRef2.element = true;
                                                                                }
                                                                            } else {
                                                                                booleanRef2.element = true;
                                                                                intRef5.element = 1;
                                                                            }
                                                                            z4 = false;
                                                                            if (!z4) {
                                                                            }
                                                                        } else if (booleanRef.element) {
                                                                            booleanRef2.element = true;
                                                                            z4 = false;
                                                                            if (!z4) {
                                                                            }
                                                                        } else {
                                                                            z4 = true;
                                                                            booleanRef.element = true;
                                                                            if (!z4) {
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if (!isValidCodePoint(intRef7.element)) {
                                                                            malformedCodePoint(intRef7.element);
                                                                            throw new KotlinNothingValueException();
                                                                        }
                                                                        char highSurrogate = (char) highSurrogate(intRef7.element);
                                                                        if (highSurrogate != '\r') {
                                                                            if (highSurrogate == '\n') {
                                                                                booleanRef2.element = true;
                                                                                intRef5.element = 1;
                                                                            } else if (booleanRef.element) {
                                                                                booleanRef2.element = true;
                                                                            } else {
                                                                                if (intRef.element == i3) {
                                                                                    throw new TooLongLineException("Too many characters in line: limit " + i3 + " exceeded");
                                                                                }
                                                                                intRef.element++;
                                                                                appendable3.append(highSurrogate);
                                                                                z2 = true;
                                                                                if (!z2) {
                                                                                    break;
                                                                                }
                                                                                char lowSurrogate = (char) lowSurrogate(intRef7.element);
                                                                                if (lowSurrogate != '\r') {
                                                                                    if (lowSurrogate != '\n') {
                                                                                        if (!booleanRef.element) {
                                                                                            if (intRef.element == i3) {
                                                                                                throw new TooLongLineException("Too many characters in line: limit " + i3 + " exceeded");
                                                                                            }
                                                                                            intRef.element++;
                                                                                            appendable3.append(lowSurrogate);
                                                                                            z3 = true;
                                                                                            if (!z3) {
                                                                                                break;
                                                                                            }
                                                                                        } else {
                                                                                            booleanRef2.element = true;
                                                                                        }
                                                                                    } else {
                                                                                        booleanRef2.element = true;
                                                                                        intRef5.element = 1;
                                                                                    }
                                                                                    z3 = false;
                                                                                    if (!z3) {
                                                                                    }
                                                                                } else if (booleanRef.element) {
                                                                                    booleanRef2.element = true;
                                                                                    z3 = false;
                                                                                    if (!z3) {
                                                                                    }
                                                                                } else {
                                                                                    z3 = true;
                                                                                    booleanRef.element = true;
                                                                                    if (!z3) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            z2 = false;
                                                                            if (!z2) {
                                                                            }
                                                                        } else if (booleanRef.element) {
                                                                            booleanRef2.element = true;
                                                                            z2 = false;
                                                                            if (!z2) {
                                                                            }
                                                                        } else {
                                                                            z2 = true;
                                                                            booleanRef.element = true;
                                                                            if (!z2) {
                                                                            }
                                                                        }
                                                                    }
                                                                    intRef7.element = 0;
                                                                    i10++;
                                                                    input3 = input2;
                                                                    memory = byteBuffer;
                                                                    chunkBuffer3 = chunkBuffer2;
                                                                    intRef2 = intRef9;
                                                                    writePosition2 = i12;
                                                                }
                                                            }
                                                            i10++;
                                                            input3 = input2;
                                                            memory = byteBuffer;
                                                            chunkBuffer3 = chunkBuffer2;
                                                            intRef2 = intRef9;
                                                            writePosition2 = i12;
                                                        } else {
                                                            try {
                                                                if (intRef6.element != 0) {
                                                                    malformedByteCount(intRef6.element);
                                                                    throw new KotlinNothingValueException();
                                                                }
                                                                char c2 = (char) i11;
                                                                if (c2 != '\r') {
                                                                    if (c2 == '\n') {
                                                                        booleanRef2.element = true;
                                                                        intRef5.element = 1;
                                                                    } else if (booleanRef.element) {
                                                                        booleanRef2.element = true;
                                                                    } else {
                                                                        if (intRef.element == i3) {
                                                                            throw new TooLongLineException("Too many characters in line: limit " + i3 + " exceeded");
                                                                        }
                                                                        intRef.element++;
                                                                        appendable3.append(c2);
                                                                        z = true;
                                                                        if (!z) {
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        input3 = input2;
                                                                        memory = byteBuffer;
                                                                        chunkBuffer3 = chunkBuffer2;
                                                                        intRef2 = intRef9;
                                                                        writePosition2 = i12;
                                                                    }
                                                                    z = false;
                                                                    if (!z) {
                                                                    }
                                                                    i10++;
                                                                    input3 = input2;
                                                                    memory = byteBuffer;
                                                                    chunkBuffer3 = chunkBuffer2;
                                                                    intRef2 = intRef9;
                                                                    writePosition2 = i12;
                                                                } else if (booleanRef.element) {
                                                                    booleanRef2.element = true;
                                                                    z = false;
                                                                    if (!z) {
                                                                    }
                                                                    i10++;
                                                                    input3 = input2;
                                                                    memory = byteBuffer;
                                                                    chunkBuffer3 = chunkBuffer2;
                                                                    intRef2 = intRef9;
                                                                    writePosition2 = i12;
                                                                } else {
                                                                    z = true;
                                                                    booleanRef.element = true;
                                                                    if (!z) {
                                                                    }
                                                                    i10++;
                                                                    input3 = input2;
                                                                    memory = byteBuffer;
                                                                    chunkBuffer3 = chunkBuffer2;
                                                                    intRef2 = intRef9;
                                                                    writePosition2 = i12;
                                                                }
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                ChunkBuffer chunkBuffer6 = chunkBuffer2;
                                                                chunkBuffer6.getWritePosition();
                                                                chunkBuffer6.getReadPosition();
                                                                throw th;
                                                            }
                                                        }
                                                        intRef2.element = r2;
                                                        if (intRef5.element > 0) {
                                                            chunkBuffer5.discardExact(intRef5.element);
                                                        }
                                                        intRef2.element = !booleanRef2.element ? i5 : RangesKt.coerceAtLeast(intRef2.element, 1);
                                                        i9 = intRef2.element;
                                                        ChunkBuffer chunkBuffer7 = chunkBuffer2;
                                                        writePosition = chunkBuffer7.getWritePosition() - chunkBuffer7.getReadPosition();
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        chunkBuffer2 = chunkBuffer3;
                                                    }
                                                }
                                                chunkBuffer2 = chunkBuffer3;
                                                input2 = input3;
                                                i5 = 0;
                                                chunkBuffer5.discardExact(writePosition2 - readPosition);
                                                int i15 = 0;
                                                intRef2 = intRef2;
                                                intRef2.element = i15;
                                                if (intRef5.element > 0) {
                                                }
                                                ChunkBuffer chunkBuffer72 = chunkBuffer2;
                                                writePosition = chunkBuffer72.getWritePosition() - chunkBuffer72.getReadPosition();
                                            } catch (Throwable th3) {
                                                th = th3;
                                                input = input2;
                                                chunkBuffer = chunkBuffer2;
                                                i4 = 1;
                                                if (i4 != 0) {
                                                    UnsafeKt.completeReadHead(input, chunkBuffer);
                                                }
                                                throw th;
                                            }
                                            intRef2.element = !booleanRef2.element ? i5 : RangesKt.coerceAtLeast(intRef2.element, 1);
                                            i9 = intRef2.element;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            chunkBuffer2 = chunkBuffer3;
                                            input2 = input3;
                                        }
                                    } else {
                                        function23 = function22;
                                        function13 = function12;
                                        chunkBuffer2 = chunkBuffer3;
                                        uTF8Kt$decodeUTF8LineLoopSuspend$13 = uTF8Kt$decodeUTF8LineLoopSuspend$12;
                                        obj2 = obj;
                                        input2 = input3;
                                        j = remaining;
                                        i5 = 0;
                                    }
                                    if (writePosition == 0) {
                                        input = input2;
                                        chunkBuffer = chunkBuffer2;
                                        try {
                                            chunkBuffer3 = UnsafeKt.prepareReadNextHead(input, chunkBuffer);
                                        } catch (Throwable th5) {
                                            th = th5;
                                            i4 = i5;
                                            if (i4 != 0) {
                                            }
                                            throw th;
                                        }
                                    } else {
                                        input = input2;
                                        chunkBuffer = chunkBuffer2;
                                        if (writePosition >= i9) {
                                            ChunkBuffer chunkBuffer8 = chunkBuffer;
                                            if (chunkBuffer8.getCapacity() - chunkBuffer8.getLimit() >= 8) {
                                                chunkBuffer3 = chunkBuffer;
                                            }
                                        }
                                        UnsafeKt.completeReadHead(input, chunkBuffer);
                                        chunkBuffer3 = UnsafeKt.prepareReadFirstHead(input, i9);
                                    }
                                    if (chunkBuffer3 == null) {
                                        chunkBuffer3 = chunkBuffer;
                                        i6 = i5;
                                        break;
                                    }
                                    if (i9 <= 0) {
                                        i6 = 1;
                                        break;
                                    }
                                    uTF8Kt$decodeUTF8LineLoopSuspend$12 = uTF8Kt$decodeUTF8LineLoopSuspend$13;
                                    obj = obj2;
                                    input3 = input;
                                    function12 = function13;
                                    remaining = j;
                                    function22 = function23;
                                } catch (Throwable th6) {
                                    th = th6;
                                    chunkBuffer = chunkBuffer3;
                                    input = input3;
                                }
                            }
                            if (i6 != 0) {
                                UnsafeKt.completeReadHead(input, chunkBuffer3);
                            }
                        }
                        Function1<? super Integer, Unit> function15 = function13;
                        function15.invoke(Boxing.boxInt((int) (j - input.getRemaining())));
                        function22 = function23;
                        uTF8Kt$decodeUTF8LineLoopSuspend$12 = uTF8Kt$decodeUTF8LineLoopSuspend$13;
                        obj = obj2;
                        function12 = function15;
                        appendable2 = appendable3;
                        i7 = 1;
                        if (!booleanRef2.element && intRef2.element != 0) {
                            Integer boxInt = Boxing.boxInt(intRef2.element);
                            uTF8Kt$decodeUTF8LineLoopSuspend$12.L$0 = appendable2;
                            uTF8Kt$decodeUTF8LineLoopSuspend$12.L$1 = function22;
                            uTF8Kt$decodeUTF8LineLoopSuspend$12.L$2 = function12;
                            uTF8Kt$decodeUTF8LineLoopSuspend$12.L$3 = intRef;
                            uTF8Kt$decodeUTF8LineLoopSuspend$12.L$4 = intRef2;
                            uTF8Kt$decodeUTF8LineLoopSuspend$12.L$5 = booleanRef;
                            uTF8Kt$decodeUTF8LineLoopSuspend$12.L$6 = booleanRef2;
                            uTF8Kt$decodeUTF8LineLoopSuspend$12.I$0 = i3;
                            uTF8Kt$decodeUTF8LineLoopSuspend$12.label = i7;
                            invoke = function22.invoke(boxInt, uTF8Kt$decodeUTF8LineLoopSuspend$12);
                            if (invoke != obj) {
                                return obj;
                            }
                            appendable3 = appendable2;
                            obj3 = invoke;
                            Input input32 = (Input) obj3;
                            if (input32 != null) {
                            }
                        }
                    }
                    if (intRef2.element <= 1) {
                        prematureEndOfStreamUtf(intRef2.element);
                        throw new KotlinNothingValueException();
                    }
                    if (booleanRef.element) {
                        booleanRef2.element = true;
                    }
                    return Boxing.boxBoolean(intRef.element > 0 || booleanRef2.element);
                }
                ResultKt.throwOnFailure(obj3);
                Ref.IntRef intRef10 = new Ref.IntRef();
                Ref.IntRef intRef11 = new Ref.IntRef();
                intRef11.element = 1;
                intRef = intRef10;
                intRef2 = intRef11;
                booleanRef = new Ref.BooleanRef();
                booleanRef2 = new Ref.BooleanRef();
                appendable2 = appendable;
                function12 = function1;
                uTF8Kt$decodeUTF8LineLoopSuspend$12 = uTF8Kt$decodeUTF8LineLoopSuspend$1;
                obj = coroutine_suspended;
                i3 = i;
                function22 = function2;
                if (!booleanRef2.element) {
                    Integer boxInt2 = Boxing.boxInt(intRef2.element);
                    uTF8Kt$decodeUTF8LineLoopSuspend$12.L$0 = appendable2;
                    uTF8Kt$decodeUTF8LineLoopSuspend$12.L$1 = function22;
                    uTF8Kt$decodeUTF8LineLoopSuspend$12.L$2 = function12;
                    uTF8Kt$decodeUTF8LineLoopSuspend$12.L$3 = intRef;
                    uTF8Kt$decodeUTF8LineLoopSuspend$12.L$4 = intRef2;
                    uTF8Kt$decodeUTF8LineLoopSuspend$12.L$5 = booleanRef;
                    uTF8Kt$decodeUTF8LineLoopSuspend$12.L$6 = booleanRef2;
                    uTF8Kt$decodeUTF8LineLoopSuspend$12.I$0 = i3;
                    uTF8Kt$decodeUTF8LineLoopSuspend$12.label = i7;
                    invoke = function22.invoke(boxInt2, uTF8Kt$decodeUTF8LineLoopSuspend$12);
                    if (invoke != obj) {
                    }
                }
                if (intRef2.element <= 1) {
                }
            }
        }
        uTF8Kt$decodeUTF8LineLoopSuspend$1 = new UTF8Kt$decodeUTF8LineLoopSuspend$1(continuation);
        Object obj32 = uTF8Kt$decodeUTF8LineLoopSuspend$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = uTF8Kt$decodeUTF8LineLoopSuspend$1.label;
        int i72 = 1;
        if (i2 == 0) {
        }
    }

    private static final Void prematureEndOfStreamUtf(int i) {
        throw new EOFException("Premature end of stream: expected " + i + " bytes to decode UTF-8 char");
    }

    /* renamed from: encodeUTF8-lBXzO7A, reason: not valid java name */
    public static final int m578encodeUTF8lBXzO7A(ByteBuffer encodeUTF8, CharSequence text, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(encodeUTF8, "$this$encodeUTF8");
        Intrinsics.checkNotNullParameter(text, "text");
        int min = Math.min(i2, i + 65535);
        int coerceAtMost = RangesKt.coerceAtMost(i4, 65535);
        int i5 = i;
        int i6 = i3;
        while (i6 < coerceAtMost && i5 < min) {
            int i7 = i5 + 1;
            int charAt = text.charAt(i5) & CharCompanionObject.MAX_VALUE;
            if ((65408 & charAt) != 0) {
                return m579encodeUTF8Stage1Vm9B2pQ(encodeUTF8, text, i7 - 1, min, i, i6, coerceAtMost, i3);
            }
            encodeUTF8.put(i6, (byte) charAt);
            i5 = i7;
            i6++;
        }
        return EncodeResult.m570constructorimpl(UShort.m874constructorimpl((short) (i5 - i)), UShort.m874constructorimpl((short) (i6 - i3)));
    }

    /* renamed from: encodeUTF8Stage1-Vm9B2pQ, reason: not valid java name */
    private static final int m579encodeUTF8Stage1Vm9B2pQ(ByteBuffer byteBuffer, CharSequence charSequence, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i5 - 3;
        int i8 = i;
        int i9 = i4;
        while (i7 - i9 > 0 && i8 < i2) {
            int i10 = i8 + 1;
            char charAt = charSequence.charAt(i8);
            boolean isHighSurrogate = Character.isHighSurrogate(charAt);
            int i11 = charAt;
            if (isHighSurrogate) {
                if (i10 == i2 || !Character.isLowSurrogate(charSequence.charAt(i10))) {
                    i11 = 63;
                } else {
                    int codePoint = codePoint(charAt, charSequence.charAt(i10));
                    i10++;
                    i11 = codePoint;
                }
            }
            boolean z = false;
            int i12 = 1;
            if (i11 >= 0 && i11 < 128) {
                byteBuffer.put(i9, (byte) i11);
            } else {
                if (128 <= i11 && i11 < 2048) {
                    byteBuffer.put(i9, (byte) (((i11 >> 6) & 31) | Opcodes.CHECKCAST));
                    byteBuffer.put(i9 + 1, (byte) ((i11 & 63) | 128));
                    i12 = 2;
                } else {
                    if (2048 <= i11 && i11 < 65536) {
                        byteBuffer.put(i9, (byte) (((i11 >> 12) & 15) | 224));
                        byteBuffer.put(i9 + 1, (byte) ((63 & (i11 >> 6)) | 128));
                        byteBuffer.put(i9 + 2, (byte) ((i11 & 63) | 128));
                        i12 = 3;
                    } else {
                        if (65536 <= i11 && i11 < 1114112) {
                            z = true;
                        }
                        if (!z) {
                            malformedCodePoint(i11);
                            throw new KotlinNothingValueException();
                        }
                        byteBuffer.put(i9, (byte) (((i11 >> 18) & 7) | 240));
                        byteBuffer.put(i9 + 1, (byte) (((i11 >> 12) & 63) | 128));
                        byteBuffer.put(i9 + 2, (byte) ((63 & (i11 >> 6)) | 128));
                        byteBuffer.put(i9 + 3, (byte) ((i11 & 63) | 128));
                        i12 = 4;
                    }
                }
            }
            i9 += i12;
            i8 = i10;
        }
        if (i9 == i7) {
            return m580encodeUTF8Stage2Vm9B2pQ(byteBuffer, charSequence, i8, i2, i3, i9, i5, i6);
        }
        return EncodeResult.m570constructorimpl(UShort.m874constructorimpl((short) (i8 - i3)), UShort.m874constructorimpl((short) (i9 - i6)));
    }

    /* renamed from: encodeUTF8Stage2-Vm9B2pQ, reason: not valid java name */
    private static final int m580encodeUTF8Stage2Vm9B2pQ(ByteBuffer byteBuffer, CharSequence charSequence, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8 = i;
        int i9 = i4;
        while (true) {
            int i10 = i5 - i9;
            if (i10 <= 0 || i8 >= i2) {
                break;
            }
            int i11 = i8 + 1;
            char charAt = charSequence.charAt(i8);
            boolean isHighSurrogate = Character.isHighSurrogate(charAt);
            int i12 = charAt;
            if (isHighSurrogate) {
                if (i11 == i2 || !Character.isLowSurrogate(charSequence.charAt(i11))) {
                    i12 = 63;
                } else {
                    int codePoint = codePoint(charAt, charSequence.charAt(i11));
                    i11++;
                    i12 = codePoint;
                }
            }
            int i13 = 1;
            if (1 <= i12 && i12 < 128) {
                i7 = 1;
            } else {
                if (128 <= i12 && i12 < 2048) {
                    i7 = 2;
                } else {
                    if (2048 <= i12 && i12 < 65536) {
                        i7 = 3;
                    } else {
                        if (!(65536 <= i12 && i12 < 1114112)) {
                            malformedCodePoint(i12);
                            throw new KotlinNothingValueException();
                        }
                        i7 = 4;
                    }
                }
            }
            if (i7 > i10) {
                i8 = i11 - 1;
                break;
            }
            if (i12 >= 0 && i12 < 128) {
                byteBuffer.put(i9, (byte) i12);
            } else {
                if (128 <= i12 && i12 < 2048) {
                    byteBuffer.put(i9, (byte) (((i12 >> 6) & 31) | Opcodes.CHECKCAST));
                    byteBuffer.put(i9 + 1, (byte) ((i12 & 63) | 128));
                    i13 = 2;
                } else {
                    if (2048 <= i12 && i12 < 65536) {
                        byteBuffer.put(i9, (byte) (((i12 >> 12) & 15) | 224));
                        byteBuffer.put(i9 + 1, (byte) ((63 & (i12 >> 6)) | 128));
                        byteBuffer.put(i9 + 2, (byte) ((i12 & 63) | 128));
                        i13 = 3;
                    } else {
                        if (!(65536 <= i12 && i12 < 1114112)) {
                            malformedCodePoint(i12);
                            throw new KotlinNothingValueException();
                        }
                        byteBuffer.put(i9, (byte) (((i12 >> 18) & 7) | 240));
                        byteBuffer.put(i9 + 1, (byte) (((i12 >> 12) & 63) | 128));
                        byteBuffer.put(i9 + 2, (byte) ((63 & (i12 >> 6)) | 128));
                        byteBuffer.put(i9 + 3, (byte) ((i12 & 63) | 128));
                        i13 = 4;
                    }
                }
            }
            i9 += i13;
            i8 = i11;
        }
        return EncodeResult.m570constructorimpl(UShort.m874constructorimpl((short) (i8 - i3)), UShort.m874constructorimpl((short) (i9 - i6)));
    }

    private static final int charactersSize(int i) {
        boolean z = false;
        if (1 <= i && i < 128) {
            return 1;
        }
        if (128 <= i && i < 2048) {
            return 2;
        }
        if (2048 <= i && i < 65536) {
            return 3;
        }
        if (65536 <= i && i < 1114112) {
            z = true;
        }
        if (z) {
            return 4;
        }
        malformedCodePoint(i);
        throw new KotlinNothingValueException();
    }

    public static final Void malformedByteCount(int i) {
        throw new MalformedUTF8InputException("Expected " + i + " more character bytes");
    }

    public static final Void malformedCodePoint(int i) {
        throw new IllegalArgumentException("Malformed code-point " + i + " found");
    }

    public static final boolean decodeASCII(Buffer buffer, Function1<? super Character, Boolean> consumer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        int writePosition = buffer.getWritePosition();
        for (int i = readPosition; i < writePosition; i++) {
            int i2 = memory.get(i) & 255;
            if ((i2 & 128) == 128 || !consumer.invoke(Character.valueOf((char) i2)).booleanValue()) {
                buffer.discardExact(i - readPosition);
                return false;
            }
        }
        buffer.discardExact(writePosition - readPosition);
        return true;
    }

    public static final int decodeUTF8(Buffer buffer, Function1<? super Character, Boolean> consumer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        int writePosition = buffer.getWritePosition();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = readPosition; i4 < writePosition; i4++) {
            int i5 = memory.get(i4) & 255;
            if ((i5 & 128) != 0) {
                if (i == 0) {
                    int i6 = 128;
                    i2 = i5;
                    for (int i7 = 1; i7 < 7 && (i2 & i6) != 0; i7++) {
                        i2 &= ~i6;
                        i6 >>= 1;
                        i++;
                    }
                    int i8 = i - 1;
                    if (i > writePosition - i4) {
                        buffer.discardExact(i4 - readPosition);
                        return i;
                    }
                    i3 = i;
                    i = i8;
                } else {
                    i2 = (i2 << 6) | (i5 & 127);
                    i--;
                    if (i != 0) {
                        continue;
                    } else {
                        if (isBmpCodePoint(i2)) {
                            if (!consumer.invoke(Character.valueOf((char) i2)).booleanValue()) {
                                buffer.discardExact(((i4 - readPosition) - i3) + 1);
                                return -1;
                            }
                        } else {
                            if (!isValidCodePoint(i2)) {
                                malformedCodePoint(i2);
                                throw new KotlinNothingValueException();
                            }
                            if (!consumer.invoke(Character.valueOf((char) highSurrogate(i2))).booleanValue() || !consumer.invoke(Character.valueOf((char) lowSurrogate(i2))).booleanValue()) {
                                buffer.discardExact(((i4 - readPosition) - i3) + 1);
                                return -1;
                            }
                        }
                        i2 = 0;
                    }
                }
            } else {
                if (i != 0) {
                    malformedByteCount(i);
                    throw new KotlinNothingValueException();
                }
                if (!consumer.invoke(Character.valueOf((char) i5)).booleanValue()) {
                    buffer.discardExact(i4 - readPosition);
                    return -1;
                }
            }
        }
        buffer.discardExact(writePosition - readPosition);
        return 0;
    }

    /* renamed from: putUtf8Char-62zg_DM, reason: not valid java name */
    public static final int m581putUtf8Char62zg_DM(ByteBuffer putUtf8Char, int i, int i2) {
        Intrinsics.checkNotNullParameter(putUtf8Char, "$this$putUtf8Char");
        if (i2 >= 0 && i2 < 128) {
            putUtf8Char.put(i, (byte) i2);
            return 1;
        }
        if (128 <= i2 && i2 < 2048) {
            putUtf8Char.put(i, (byte) (((i2 >> 6) & 31) | Opcodes.CHECKCAST));
            putUtf8Char.put(i + 1, (byte) ((i2 & 63) | 128));
            return 2;
        }
        if (2048 <= i2 && i2 < 65536) {
            putUtf8Char.put(i, (byte) (((i2 >> 12) & 15) | 224));
            putUtf8Char.put(i + 1, (byte) (((i2 >> 6) & 63) | 128));
            putUtf8Char.put(i + 2, (byte) ((i2 & 63) | 128));
            return 3;
        }
        if (!(65536 <= i2 && i2 < 1114112)) {
            malformedCodePoint(i2);
            throw new KotlinNothingValueException();
        }
        putUtf8Char.put(i, (byte) (((i2 >> 18) & 7) | 240));
        putUtf8Char.put(i + 1, (byte) (((i2 >> 12) & 63) | 128));
        putUtf8Char.put(i + 2, (byte) (((i2 >> 6) & 63) | 128));
        putUtf8Char.put(i + 3, (byte) ((i2 & 63) | 128));
        return 4;
    }
}
