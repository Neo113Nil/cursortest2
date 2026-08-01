package io.ktor.utils.io.core;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.utils.io.bits.Memory;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.core.internal.UnsafeKt;
import java.nio.ByteBuffer;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InputArrays.kt */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0013\n\u0002\u0010\u0014\n\u0002\u0010\u0015\n\u0002\u0010\u0016\n\u0002\u0010\u0017\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\u0000\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\n\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u0001\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u000f2\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00102\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00112\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00132\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001\u001a/\u0010\u0014\u001a\u00020\u0015*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a/\u0010\u0014\u001a\u00020\u0015*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0018\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u0001\u001a&\u0010\u0014\u001a\u00020\u0015*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001\u001a&\u0010\u0014\u001a\u00020\u0015*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u000f2\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001\u001a&\u0010\u0014\u001a\u00020\u0015*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00102\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001\u001a&\u0010\u0014\u001a\u00020\u0015*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00112\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001\u001a&\u0010\u0014\u001a\u00020\u0015*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001\u001a&\u0010\u0014\u001a\u00020\u0015*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00132\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001\u001aj\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012K\u0010\u001b\u001aG\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00150\u001cH\u0082\b\u001a\u0082\u0001\u0010\u0019\u001a\u00020\t*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\t2`\u0010\u001b\u001a\\\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00150\"H\u0082\bø\u0001\u0001\u001ar\u0010$\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00012K\u0010\u001b\u001aG\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00150\u001cH\u0082\b\u001a\r\u0010&\u001a\u00020\u0015*\u00020\u0001H\u0082\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {"readAvailable", "", "Lio/ktor/utils/io/core/Input;", FirebaseAnalytics.Param.DESTINATION, "Lio/ktor/utils/io/bits/Memory;", "destinationOffset", "length", "readAvailable-UAd2zVI", "(Lio/ktor/utils/io/core/Input;Ljava/nio/ByteBuffer;II)I", "", "(Lio/ktor/utils/io/core/Input;Ljava/nio/ByteBuffer;JJ)J", "dst", "Lio/ktor/utils/io/core/Buffer;", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "", "", "", "", "readFully", "", "readFully-UAd2zVI", "(Lio/ktor/utils/io/core/Input;Ljava/nio/ByteBuffer;II)V", "(Lio/ktor/utils/io/core/Input;Ljava/nio/ByteBuffer;JJ)V", "readFullyBytesTemplate", "initialDstOffset", "readBlock", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "src", "dstOffset", "count", "Lkotlin/Function4;", "srcOffset", "readFullyTemplate", "componentSize", "requireNoRemaining", "ktor-io"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InputArraysKt {
    public static /* synthetic */ void readFully$default(Input input, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length - i;
        }
        readFully(input, bArr, i, i2);
    }

    public static /* synthetic */ void readFully$default(Input input, short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length - i;
        }
        readFully(input, sArr, i, i2);
    }

    public static /* synthetic */ void readFully$default(Input input, int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = iArr.length - i;
        }
        readFully(input, iArr, i, i2);
    }

    public static /* synthetic */ void readFully$default(Input input, long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length - i;
        }
        readFully(input, jArr, i, i2);
    }

    public static /* synthetic */ void readFully$default(Input input, float[] fArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length - i;
        }
        readFully(input, fArr, i, i2);
    }

    public static /* synthetic */ void readFully$default(Input input, double[] dArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length - i;
        }
        readFully(input, dArr, i, i2);
    }

    /* renamed from: readFully-UAd2zVI, reason: not valid java name */
    public static final void m504readFullyUAd2zVI(Input readFully, ByteBuffer destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(readFully, "$this$readFully");
        Intrinsics.checkNotNullParameter(destination, "destination");
        m505readFullyUAd2zVI(readFully, destination, i, i2);
    }

    /* renamed from: readFully-UAd2zVI, reason: not valid java name */
    public static final void m505readFullyUAd2zVI(Input readFully, ByteBuffer destination, long j, long j2) {
        Intrinsics.checkNotNullParameter(readFully, "$this$readFully");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (m503readAvailableUAd2zVI(readFully, destination, j, j2) == j2) {
            return;
        }
        StringsKt.prematureEndOfStream(j2);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ int readAvailable$default(Input input, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length - i;
        }
        return readAvailable(input, bArr, i, i2);
    }

    public static /* synthetic */ int readAvailable$default(Input input, short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length - i;
        }
        return readAvailable(input, sArr, i, i2);
    }

    public static /* synthetic */ int readAvailable$default(Input input, int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = iArr.length - i;
        }
        return readAvailable(input, iArr, i, i2);
    }

    public static /* synthetic */ int readAvailable$default(Input input, long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length - i;
        }
        return readAvailable(input, jArr, i, i2);
    }

    public static /* synthetic */ int readAvailable$default(Input input, float[] fArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length - i;
        }
        return readAvailable(input, fArr, i, i2);
    }

    public static /* synthetic */ int readAvailable$default(Input input, double[] dArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length - i;
        }
        return readAvailable(input, dArr, i, i2);
    }

    /* renamed from: readAvailable-UAd2zVI, reason: not valid java name */
    public static final int m502readAvailableUAd2zVI(Input readAvailable, ByteBuffer destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(readAvailable, "$this$readAvailable");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return (int) m503readAvailableUAd2zVI(readAvailable, destination, i, i2);
    }

    private static final void requireNoRemaining(int i) {
        if (i <= 0) {
            return;
        }
        StringsKt.prematureEndOfStream(i);
        throw new KotlinNothingValueException();
    }

    public static final void readFully(Input input, byte[] dst, int i, int i2) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        boolean z = true;
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (prepareReadFirstHead != null) {
            while (true) {
                try {
                    ChunkBuffer chunkBuffer = prepareReadFirstHead;
                    int min = Math.min(i2, chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition());
                    BufferPrimitivesKt.readFully((Buffer) chunkBuffer, dst, i, min);
                    i2 -= min;
                    i += min;
                    if (!(i2 > 0)) {
                        break;
                    }
                    try {
                        ChunkBuffer prepareReadNextHead = UnsafeKt.prepareReadNextHead(input, prepareReadFirstHead);
                        if (prepareReadNextHead == null) {
                            z = false;
                            break;
                        }
                        prepareReadFirstHead = prepareReadNextHead;
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        if (z) {
                            UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (z) {
                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
            }
        }
        if (i2 <= 0) {
            return;
        }
        StringsKt.prematureEndOfStream(i2);
        throw new KotlinNothingValueException();
    }

    public static final void readFully(Input input, short[] dst, int i, int i2) {
        ChunkBuffer chunkBuffer;
        ChunkBuffer prepareReadNextHead;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        boolean z = true;
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (prepareReadFirstHead != null) {
            int i3 = 1;
            while (true) {
                try {
                    int writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
                    if (writePosition >= i3) {
                        try {
                            ChunkBuffer chunkBuffer2 = prepareReadFirstHead;
                            int min = Math.min(i2, (chunkBuffer2.getWritePosition() - chunkBuffer2.getReadPosition()) / 2);
                            BufferPrimitivesKt.readFully((Buffer) chunkBuffer2, dst, i, min);
                            i2 -= min;
                            i += min;
                            i3 = i2 > 0 ? 2 : 0;
                            ChunkBuffer chunkBuffer3 = prepareReadFirstHead;
                            writePosition = chunkBuffer3.getWritePosition() - chunkBuffer3.getReadPosition();
                        } finally {
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            prepareReadNextHead = UnsafeKt.prepareReadNextHead(input, prepareReadFirstHead);
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (z) {
                                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else {
                        if (writePosition >= i3) {
                            ChunkBuffer chunkBuffer4 = prepareReadFirstHead;
                            if (chunkBuffer4.getCapacity() - chunkBuffer4.getLimit() >= 8) {
                                prepareReadNextHead = prepareReadFirstHead;
                            }
                        }
                        UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                        prepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i3);
                    }
                    if (prepareReadNextHead == null) {
                        z = false;
                        break;
                    } else {
                        prepareReadFirstHead = prepareReadNextHead;
                        if (i3 <= 0) {
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (z) {
                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
            }
        }
        if (i2 <= 0) {
            return;
        }
        StringsKt.prematureEndOfStream(i2);
        throw new KotlinNothingValueException();
    }

    public static final void readFully(Input input, int[] dst, int i, int i2) {
        ChunkBuffer chunkBuffer;
        ChunkBuffer prepareReadNextHead;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        boolean z = true;
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (prepareReadFirstHead != null) {
            int i3 = 1;
            while (true) {
                try {
                    int writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
                    if (writePosition >= i3) {
                        try {
                            ChunkBuffer chunkBuffer2 = prepareReadFirstHead;
                            int min = Math.min(i2, (chunkBuffer2.getWritePosition() - chunkBuffer2.getReadPosition()) / 4);
                            BufferPrimitivesKt.readFully((Buffer) chunkBuffer2, dst, i, min);
                            i2 -= min;
                            i += min;
                            i3 = i2 > 0 ? 4 : 0;
                            ChunkBuffer chunkBuffer3 = prepareReadFirstHead;
                            writePosition = chunkBuffer3.getWritePosition() - chunkBuffer3.getReadPosition();
                        } finally {
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            prepareReadNextHead = UnsafeKt.prepareReadNextHead(input, prepareReadFirstHead);
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (z) {
                                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else {
                        if (writePosition >= i3) {
                            ChunkBuffer chunkBuffer4 = prepareReadFirstHead;
                            if (chunkBuffer4.getCapacity() - chunkBuffer4.getLimit() >= 8) {
                                prepareReadNextHead = prepareReadFirstHead;
                            }
                        }
                        UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                        prepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i3);
                    }
                    if (prepareReadNextHead == null) {
                        z = false;
                        break;
                    } else {
                        prepareReadFirstHead = prepareReadNextHead;
                        if (i3 <= 0) {
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (z) {
                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
            }
        }
        if (i2 <= 0) {
            return;
        }
        StringsKt.prematureEndOfStream(i2);
        throw new KotlinNothingValueException();
    }

    public static final void readFully(Input input, long[] dst, int i, int i2) {
        ChunkBuffer chunkBuffer;
        ChunkBuffer prepareReadNextHead;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        boolean z = true;
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (prepareReadFirstHead != null) {
            int i3 = 1;
            while (true) {
                try {
                    int writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
                    if (writePosition >= i3) {
                        try {
                            ChunkBuffer chunkBuffer2 = prepareReadFirstHead;
                            int min = Math.min(i2, (chunkBuffer2.getWritePosition() - chunkBuffer2.getReadPosition()) / 8);
                            BufferPrimitivesKt.readFully((Buffer) chunkBuffer2, dst, i, min);
                            i2 -= min;
                            i += min;
                            i3 = i2 > 0 ? 8 : 0;
                            ChunkBuffer chunkBuffer3 = prepareReadFirstHead;
                            writePosition = chunkBuffer3.getWritePosition() - chunkBuffer3.getReadPosition();
                        } finally {
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            prepareReadNextHead = UnsafeKt.prepareReadNextHead(input, prepareReadFirstHead);
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (z) {
                                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else {
                        if (writePosition >= i3) {
                            ChunkBuffer chunkBuffer4 = prepareReadFirstHead;
                            if (chunkBuffer4.getCapacity() - chunkBuffer4.getLimit() >= 8) {
                                prepareReadNextHead = prepareReadFirstHead;
                            }
                        }
                        UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                        prepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i3);
                    }
                    if (prepareReadNextHead == null) {
                        z = false;
                        break;
                    } else {
                        prepareReadFirstHead = prepareReadNextHead;
                        if (i3 <= 0) {
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (z) {
                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
            }
        }
        if (i2 <= 0) {
            return;
        }
        StringsKt.prematureEndOfStream(i2);
        throw new KotlinNothingValueException();
    }

    public static final void readFully(Input input, float[] dst, int i, int i2) {
        ChunkBuffer chunkBuffer;
        ChunkBuffer prepareReadNextHead;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        boolean z = true;
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (prepareReadFirstHead != null) {
            int i3 = 1;
            while (true) {
                try {
                    int writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
                    if (writePosition >= i3) {
                        try {
                            ChunkBuffer chunkBuffer2 = prepareReadFirstHead;
                            int min = Math.min(i2, (chunkBuffer2.getWritePosition() - chunkBuffer2.getReadPosition()) / 4);
                            BufferPrimitivesKt.readFully((Buffer) chunkBuffer2, dst, i, min);
                            i2 -= min;
                            i += min;
                            i3 = i2 > 0 ? 4 : 0;
                            ChunkBuffer chunkBuffer3 = prepareReadFirstHead;
                            writePosition = chunkBuffer3.getWritePosition() - chunkBuffer3.getReadPosition();
                        } finally {
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            prepareReadNextHead = UnsafeKt.prepareReadNextHead(input, prepareReadFirstHead);
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (z) {
                                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else {
                        if (writePosition >= i3) {
                            ChunkBuffer chunkBuffer4 = prepareReadFirstHead;
                            if (chunkBuffer4.getCapacity() - chunkBuffer4.getLimit() >= 8) {
                                prepareReadNextHead = prepareReadFirstHead;
                            }
                        }
                        UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                        prepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i3);
                    }
                    if (prepareReadNextHead == null) {
                        z = false;
                        break;
                    } else {
                        prepareReadFirstHead = prepareReadNextHead;
                        if (i3 <= 0) {
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (z) {
                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
            }
        }
        if (i2 <= 0) {
            return;
        }
        StringsKt.prematureEndOfStream(i2);
        throw new KotlinNothingValueException();
    }

    public static final void readFully(Input input, double[] dst, int i, int i2) {
        ChunkBuffer chunkBuffer;
        ChunkBuffer prepareReadNextHead;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        boolean z = true;
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (prepareReadFirstHead != null) {
            int i3 = 1;
            while (true) {
                try {
                    int writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
                    if (writePosition >= i3) {
                        try {
                            ChunkBuffer chunkBuffer2 = prepareReadFirstHead;
                            int min = Math.min(i2, (chunkBuffer2.getWritePosition() - chunkBuffer2.getReadPosition()) / 8);
                            BufferPrimitivesKt.readFully(chunkBuffer2, dst, i, min);
                            i2 -= min;
                            i += min;
                            i3 = i2 > 0 ? 8 : 0;
                            ChunkBuffer chunkBuffer3 = prepareReadFirstHead;
                            writePosition = chunkBuffer3.getWritePosition() - chunkBuffer3.getReadPosition();
                        } finally {
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            prepareReadNextHead = UnsafeKt.prepareReadNextHead(input, prepareReadFirstHead);
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (z) {
                                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else {
                        if (writePosition >= i3) {
                            ChunkBuffer chunkBuffer4 = prepareReadFirstHead;
                            if (chunkBuffer4.getCapacity() - chunkBuffer4.getLimit() >= 8) {
                                prepareReadNextHead = prepareReadFirstHead;
                            }
                        }
                        UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                        prepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i3);
                    }
                    if (prepareReadNextHead == null) {
                        z = false;
                        break;
                    } else {
                        prepareReadFirstHead = prepareReadNextHead;
                        if (i3 <= 0) {
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (z) {
                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
            }
        }
        if (i2 <= 0) {
            return;
        }
        StringsKt.prematureEndOfStream(i2);
        throw new KotlinNothingValueException();
    }

    public static final void readFully(Input input, Buffer dst, int i) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        boolean z = true;
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (prepareReadFirstHead != null) {
            while (true) {
                try {
                    ChunkBuffer chunkBuffer = prepareReadFirstHead;
                    int min = Math.min(i, chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition());
                    BufferPrimitivesKt.readFully(chunkBuffer, dst, min);
                    i -= min;
                    if (!(i > 0)) {
                        break;
                    }
                    try {
                        ChunkBuffer prepareReadNextHead = UnsafeKt.prepareReadNextHead(input, prepareReadFirstHead);
                        if (prepareReadNextHead == null) {
                            z = false;
                            break;
                        }
                        prepareReadFirstHead = prepareReadNextHead;
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        if (z) {
                            UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (z) {
                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
            }
        }
        if (i <= 0) {
            return;
        }
        StringsKt.prematureEndOfStream(i);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void readFully$default(Input input, Buffer buffer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = buffer.getLimit() - buffer.getWritePosition();
        }
        readFully(input, buffer, i);
    }

    public static final int readAvailable(Input input, byte[] dst, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        boolean z = true;
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (prepareReadFirstHead == null) {
            i3 = i2;
        } else {
            i3 = i2;
            while (true) {
                try {
                    ChunkBuffer chunkBuffer = prepareReadFirstHead;
                    int min = Math.min(i3, chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition());
                    BufferPrimitivesKt.readFully((Buffer) chunkBuffer, dst, i, min);
                    i3 -= min;
                    i += min;
                    if (!(i3 > 0)) {
                        break;
                    }
                    try {
                        ChunkBuffer prepareReadNextHead = UnsafeKt.prepareReadNextHead(input, prepareReadFirstHead);
                        if (prepareReadNextHead == null) {
                            z = false;
                            break;
                        }
                        prepareReadFirstHead = prepareReadNextHead;
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        if (z) {
                            UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (z) {
                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
            }
        }
        return i2 - i3;
    }

    public static final int readAvailable(Input input, short[] dst, int i, int i2) {
        int i3;
        ChunkBuffer chunkBuffer;
        ChunkBuffer prepareReadNextHead;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        boolean z = true;
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (prepareReadFirstHead == null) {
            i3 = i2;
        } else {
            i3 = i2;
            int i4 = 1;
            while (true) {
                try {
                    int writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
                    if (writePosition >= i4) {
                        try {
                            ChunkBuffer chunkBuffer2 = prepareReadFirstHead;
                            int min = Math.min(i3, (chunkBuffer2.getWritePosition() - chunkBuffer2.getReadPosition()) / 2);
                            BufferPrimitivesKt.readFully((Buffer) chunkBuffer2, dst, i, min);
                            i3 -= min;
                            i += min;
                            i4 = i3 > 0 ? 2 : 0;
                            ChunkBuffer chunkBuffer3 = prepareReadFirstHead;
                            writePosition = chunkBuffer3.getWritePosition() - chunkBuffer3.getReadPosition();
                        } finally {
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            prepareReadNextHead = UnsafeKt.prepareReadNextHead(input, prepareReadFirstHead);
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (z) {
                                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else {
                        if (writePosition >= i4) {
                            ChunkBuffer chunkBuffer4 = prepareReadFirstHead;
                            if (chunkBuffer4.getCapacity() - chunkBuffer4.getLimit() >= 8) {
                                prepareReadNextHead = prepareReadFirstHead;
                            }
                        }
                        UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                        prepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i4);
                    }
                    if (prepareReadNextHead == null) {
                        z = false;
                        break;
                    }
                    prepareReadFirstHead = prepareReadNextHead;
                    if (i4 <= 0) {
                        break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (z) {
                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
            }
        }
        return i2 - i3;
    }

    public static final int readAvailable(Input input, int[] dst, int i, int i2) {
        int i3;
        ChunkBuffer chunkBuffer;
        ChunkBuffer prepareReadNextHead;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        boolean z = true;
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (prepareReadFirstHead == null) {
            i3 = i2;
        } else {
            i3 = i2;
            int i4 = 1;
            while (true) {
                try {
                    int writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
                    if (writePosition >= i4) {
                        try {
                            ChunkBuffer chunkBuffer2 = prepareReadFirstHead;
                            int min = Math.min(i3, (chunkBuffer2.getWritePosition() - chunkBuffer2.getReadPosition()) / 4);
                            BufferPrimitivesKt.readFully((Buffer) chunkBuffer2, dst, i, min);
                            i3 -= min;
                            i += min;
                            i4 = i3 > 0 ? 4 : 0;
                            ChunkBuffer chunkBuffer3 = prepareReadFirstHead;
                            writePosition = chunkBuffer3.getWritePosition() - chunkBuffer3.getReadPosition();
                        } finally {
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            prepareReadNextHead = UnsafeKt.prepareReadNextHead(input, prepareReadFirstHead);
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (z) {
                                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else {
                        if (writePosition >= i4) {
                            ChunkBuffer chunkBuffer4 = prepareReadFirstHead;
                            if (chunkBuffer4.getCapacity() - chunkBuffer4.getLimit() >= 8) {
                                prepareReadNextHead = prepareReadFirstHead;
                            }
                        }
                        UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                        prepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i4);
                    }
                    if (prepareReadNextHead == null) {
                        z = false;
                        break;
                    }
                    prepareReadFirstHead = prepareReadNextHead;
                    if (i4 <= 0) {
                        break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (z) {
                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
            }
        }
        return i2 - i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int readAvailable(Input input, long[] dst, int i, int i2) {
        int i3;
        ChunkBuffer chunkBuffer;
        ChunkBuffer prepareReadNextHead;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        boolean z = true;
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (prepareReadFirstHead == null) {
            i3 = i2;
        } else {
            i3 = i2;
            int i4 = 1;
            while (true) {
                try {
                    int writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
                    if (writePosition >= i4) {
                        try {
                            ChunkBuffer chunkBuffer2 = prepareReadFirstHead;
                            int min = Math.min(i3, (chunkBuffer2.getWritePosition() - chunkBuffer2.getReadPosition()) / 8);
                            BufferPrimitivesKt.readFully((Buffer) chunkBuffer2, dst, i, min);
                            i3 -= min;
                            i += min;
                            i4 = i3 > 0 ? 8 : 0;
                            ChunkBuffer chunkBuffer3 = prepareReadFirstHead;
                            writePosition = chunkBuffer3.getWritePosition() - chunkBuffer3.getReadPosition();
                        } finally {
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            prepareReadNextHead = UnsafeKt.prepareReadNextHead(input, prepareReadFirstHead);
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (z) {
                                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else {
                        if (writePosition >= i4) {
                            ChunkBuffer chunkBuffer4 = prepareReadFirstHead;
                            if (chunkBuffer4.getCapacity() - chunkBuffer4.getLimit() >= 8) {
                                prepareReadNextHead = prepareReadFirstHead;
                            }
                        }
                        UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                        prepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i4);
                    }
                    if (prepareReadNextHead == null) {
                        z = false;
                        break;
                    }
                    prepareReadFirstHead = prepareReadNextHead;
                    if (i4 <= 0) {
                        break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (z) {
                    }
                    throw th;
                }
            }
            if (z) {
                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
            }
        }
        return i2 - i3;
    }

    public static final int readAvailable(Input input, float[] dst, int i, int i2) {
        int i3;
        ChunkBuffer chunkBuffer;
        ChunkBuffer prepareReadNextHead;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        boolean z = true;
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (prepareReadFirstHead == null) {
            i3 = i2;
        } else {
            i3 = i2;
            int i4 = 1;
            while (true) {
                try {
                    int writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
                    if (writePosition >= i4) {
                        try {
                            ChunkBuffer chunkBuffer2 = prepareReadFirstHead;
                            int min = Math.min(i3, (chunkBuffer2.getWritePosition() - chunkBuffer2.getReadPosition()) / 4);
                            BufferPrimitivesKt.readFully((Buffer) chunkBuffer2, dst, i, min);
                            i3 -= min;
                            i += min;
                            i4 = i3 > 0 ? 4 : 0;
                            ChunkBuffer chunkBuffer3 = prepareReadFirstHead;
                            writePosition = chunkBuffer3.getWritePosition() - chunkBuffer3.getReadPosition();
                        } finally {
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            prepareReadNextHead = UnsafeKt.prepareReadNextHead(input, prepareReadFirstHead);
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (z) {
                                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else {
                        if (writePosition >= i4) {
                            ChunkBuffer chunkBuffer4 = prepareReadFirstHead;
                            if (chunkBuffer4.getCapacity() - chunkBuffer4.getLimit() >= 8) {
                                prepareReadNextHead = prepareReadFirstHead;
                            }
                        }
                        UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                        prepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i4);
                    }
                    if (prepareReadNextHead == null) {
                        z = false;
                        break;
                    }
                    prepareReadFirstHead = prepareReadNextHead;
                    if (i4 <= 0) {
                        break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (z) {
                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
            }
        }
        return i2 - i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int readAvailable(Input input, double[] dst, int i, int i2) {
        int i3;
        ChunkBuffer chunkBuffer;
        ChunkBuffer prepareReadNextHead;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        boolean z = true;
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (prepareReadFirstHead == null) {
            i3 = i2;
        } else {
            i3 = i2;
            int i4 = 1;
            while (true) {
                try {
                    int writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
                    if (writePosition >= i4) {
                        try {
                            ChunkBuffer chunkBuffer2 = prepareReadFirstHead;
                            int min = Math.min(i3, (chunkBuffer2.getWritePosition() - chunkBuffer2.getReadPosition()) / 8);
                            BufferPrimitivesKt.readFully(chunkBuffer2, dst, i, min);
                            i3 -= min;
                            i += min;
                            i4 = i3 > 0 ? 8 : 0;
                            ChunkBuffer chunkBuffer3 = prepareReadFirstHead;
                            writePosition = chunkBuffer3.getWritePosition() - chunkBuffer3.getReadPosition();
                        } finally {
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            prepareReadNextHead = UnsafeKt.prepareReadNextHead(input, prepareReadFirstHead);
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (z) {
                                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else {
                        if (writePosition >= i4) {
                            ChunkBuffer chunkBuffer4 = prepareReadFirstHead;
                            if (chunkBuffer4.getCapacity() - chunkBuffer4.getLimit() >= 8) {
                                prepareReadNextHead = prepareReadFirstHead;
                            }
                        }
                        UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                        prepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i4);
                    }
                    if (prepareReadNextHead == null) {
                        z = false;
                        break;
                    }
                    prepareReadFirstHead = prepareReadNextHead;
                    if (i4 <= 0) {
                        break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (z) {
                    }
                    throw th;
                }
            }
            if (z) {
                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
            }
        }
        return i2 - i3;
    }

    public static final int readAvailable(Input input, Buffer dst, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        boolean z = true;
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (prepareReadFirstHead == null) {
            i2 = i;
        } else {
            i2 = i;
            while (true) {
                try {
                    ChunkBuffer chunkBuffer = prepareReadFirstHead;
                    int min = Math.min(i2, chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition());
                    BufferPrimitivesKt.readFully(chunkBuffer, dst, min);
                    i2 -= min;
                    if (!(i2 > 0)) {
                        break;
                    }
                    try {
                        ChunkBuffer prepareReadNextHead = UnsafeKt.prepareReadNextHead(input, prepareReadFirstHead);
                        if (prepareReadNextHead == null) {
                            z = false;
                            break;
                        }
                        prepareReadFirstHead = prepareReadNextHead;
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        if (z) {
                            UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (z) {
                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
            }
        }
        return i - i2;
    }

    public static /* synthetic */ int readAvailable$default(Input input, Buffer buffer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = buffer.getLimit() - buffer.getWritePosition();
        }
        return readAvailable(input, buffer, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* renamed from: readAvailable-UAd2zVI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m503readAvailableUAd2zVI(Input readAvailable, ByteBuffer destination, long j, long j2) {
        long j3;
        ChunkBuffer chunkBuffer;
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(readAvailable, "$this$readAvailable");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(readAvailable, 1);
        if (prepareReadFirstHead == null) {
            j3 = j2;
        } else {
            long j4 = j;
            j3 = j2;
            ChunkBuffer chunkBuffer2 = prepareReadFirstHead;
            while (true) {
                try {
                    ChunkBuffer chunkBuffer3 = chunkBuffer2;
                    int min = (int) Math.min(j3, chunkBuffer3.getWritePosition() - chunkBuffer3.getReadPosition());
                    long j5 = min;
                    long j6 = j3;
                    chunkBuffer = chunkBuffer2;
                    try {
                        Memory.m318copyToJT6ljtQ(chunkBuffer3.getMemory(), destination, chunkBuffer3.getReadPosition(), j5, j4);
                        chunkBuffer3.discardExact(min);
                        j3 = j6 - j5;
                        j4 += j5;
                        if (!(j3 > 0)) {
                            z2 = true;
                            break;
                        }
                        try {
                            chunkBuffer2 = UnsafeKt.prepareReadNextHead(readAvailable, chunkBuffer);
                            if (chunkBuffer2 == null) {
                                z2 = false;
                                break;
                            }
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (z) {
                                UnsafeKt.completeReadHead(readAvailable, chunkBuffer);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z = true;
                        if (z) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    chunkBuffer = chunkBuffer2;
                }
            }
            if (z2) {
                UnsafeKt.completeReadHead(readAvailable, chunkBuffer);
            }
        }
        long j7 = j2 - j3;
        if (j7 == 0 && readAvailable.getEndOfInput()) {
            return -1L;
        }
        return j7;
    }

    private static final int readFullyBytesTemplate(Input input, int i, int i2, Function3<? super Buffer, ? super Integer, ? super Integer, Unit> function3) {
        boolean z;
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (prepareReadFirstHead != null) {
            while (true) {
                try {
                    ChunkBuffer chunkBuffer = prepareReadFirstHead;
                    int min = Math.min(i2, chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition());
                    function3.invoke(chunkBuffer, Integer.valueOf(i), Integer.valueOf(min));
                    i2 -= min;
                    i += min;
                    z = false;
                    if (!(i2 > 0)) {
                        z = true;
                        break;
                    }
                    try {
                        ChunkBuffer prepareReadNextHead = UnsafeKt.prepareReadNextHead(input, prepareReadFirstHead);
                        if (prepareReadNextHead == null) {
                            break;
                        }
                        prepareReadFirstHead = prepareReadNextHead;
                    } catch (Throwable th) {
                        th = th;
                        InlineMarker.finallyStart(1);
                        if (z) {
                            UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                        }
                        InlineMarker.finallyEnd(1);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = true;
                }
            }
            InlineMarker.finallyStart(1);
            if (z) {
                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
            }
            InlineMarker.finallyEnd(1);
        }
        return i2;
    }

    private static final long readFullyBytesTemplate(Input input, long j, long j2, Function4<? super Memory, ? super Long, ? super Long, ? super Integer, Unit> function4) {
        boolean z;
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (prepareReadFirstHead != null) {
            while (true) {
                try {
                    ChunkBuffer chunkBuffer = prepareReadFirstHead;
                    int min = (int) Math.min(j2, chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition());
                    function4.invoke(Memory.m315boximpl(chunkBuffer.getMemory()), Long.valueOf(chunkBuffer.getReadPosition()), Long.valueOf(j), Integer.valueOf(min));
                    chunkBuffer.discardExact(min);
                    long j3 = min;
                    j2 -= j3;
                    j += j3;
                    z = false;
                    if (!(j2 > 0)) {
                        z = true;
                        break;
                    }
                    try {
                        ChunkBuffer prepareReadNextHead = UnsafeKt.prepareReadNextHead(input, prepareReadFirstHead);
                        if (prepareReadNextHead == null) {
                            break;
                        }
                        prepareReadFirstHead = prepareReadNextHead;
                    } catch (Throwable th) {
                        th = th;
                        InlineMarker.finallyStart(1);
                        if (z) {
                            UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                        }
                        InlineMarker.finallyEnd(1);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = true;
                }
            }
            InlineMarker.finallyStart(1);
            if (z) {
                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
            }
            InlineMarker.finallyEnd(1);
        }
        return j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int readFullyTemplate(Input input, int i, int i2, int i3, Function3<? super Buffer, ? super Integer, ? super Integer, Unit> function3) {
        boolean z;
        ChunkBuffer prepareReadNextHead;
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (prepareReadFirstHead != null) {
            int i4 = 1;
            while (true) {
                try {
                    ChunkBuffer chunkBuffer = prepareReadFirstHead;
                    int writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
                    z = false;
                    if (writePosition >= i4) {
                        try {
                            ChunkBuffer chunkBuffer2 = prepareReadFirstHead;
                            int min = Math.min(i2, (chunkBuffer2.getWritePosition() - chunkBuffer2.getReadPosition()) / i3);
                            function3.invoke(chunkBuffer2, Integer.valueOf(i), Integer.valueOf(min));
                            i2 -= min;
                            i += min;
                            i4 = i2 > 0 ? i3 : 0;
                            InlineMarker.finallyStart(1);
                            ChunkBuffer chunkBuffer3 = prepareReadFirstHead;
                            writePosition = chunkBuffer3.getWritePosition() - chunkBuffer3.getReadPosition();
                            InlineMarker.finallyEnd(1);
                        } finally {
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            prepareReadNextHead = UnsafeKt.prepareReadNextHead(input, prepareReadFirstHead);
                        } catch (Throwable th) {
                            th = th;
                            InlineMarker.finallyStart(1);
                            if (z) {
                                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                            }
                            InlineMarker.finallyEnd(1);
                            throw th;
                        }
                    } else {
                        if (writePosition >= i4) {
                            ChunkBuffer chunkBuffer4 = prepareReadFirstHead;
                            if (chunkBuffer4.getCapacity() - chunkBuffer4.getLimit() >= 8) {
                                prepareReadNextHead = prepareReadFirstHead;
                            }
                        }
                        UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                        prepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i4);
                    }
                    if (prepareReadNextHead == null) {
                        break;
                    }
                    if (i4 <= 0) {
                        z = true;
                        prepareReadFirstHead = prepareReadNextHead;
                        break;
                    }
                    prepareReadFirstHead = prepareReadNextHead;
                } catch (Throwable th2) {
                    th = th2;
                    z = true;
                    InlineMarker.finallyStart(1);
                    if (z) {
                    }
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
            InlineMarker.finallyStart(1);
            if (z) {
                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
            }
            InlineMarker.finallyEnd(1);
        }
        return i2;
    }
}
