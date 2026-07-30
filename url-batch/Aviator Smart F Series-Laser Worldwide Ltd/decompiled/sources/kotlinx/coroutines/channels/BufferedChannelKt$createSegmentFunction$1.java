package kotlinx.coroutines.channels;

import f6.p;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
/* synthetic */ class BufferedChannelKt$createSegmentFunction$1 extends FunctionReferenceImpl implements p {
    public static final BufferedChannelKt$createSegmentFunction$1 INSTANCE = new BufferedChannelKt$createSegmentFunction$1();

    BufferedChannelKt$createSegmentFunction$1() {
        super(2, BufferedChannelKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    @Override // f6.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).longValue(), (f) obj2);
    }

    public final f invoke(long j8, f fVar) {
        f createSegment;
        createSegment = BufferedChannelKt.createSegment(j8, fVar);
        return createSegment;
    }
}
