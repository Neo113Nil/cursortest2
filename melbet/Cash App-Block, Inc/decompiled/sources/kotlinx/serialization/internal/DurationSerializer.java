package kotlinx.serialization.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind$INT;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class DurationSerializer implements KSerializer {
    public static final DurationSerializer INSTANCE = new DurationSerializer();
    public static final PrimitiveSerialDescriptor descriptor = new PrimitiveSerialDescriptor("kotlin.time.Duration", PrimitiveKind$INT.INSTANCE$8);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Duration.Companion companion = Duration.Companion;
        String decodeString = decoder.decodeString();
        companion.getClass();
        decodeString.getClass();
        try {
            long parseDuration$default = DurationKt.parseDuration$default(decodeString);
            if (Duration.m4166equalsimpl0(parseDuration$default, Duration.INVALID)) {
                throw new IllegalStateException("invariant failed");
            }
            return new Duration(parseDuration$default);
        } catch (IllegalArgumentException e) {
            Handlers$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Invalid ISO duration string format: '", decodeString, "'."), e);
            return null;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long j = ((Duration) obj).rawValue;
        Duration.Companion companion = Duration.Companion;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long m4179unaryMinusUwyO8pc = j < 0 ? Duration.m4179unaryMinusUwyO8pc(j) : j;
        long m4176toLongimpl = Duration.m4176toLongimpl(m4179unaryMinusUwyO8pc, DurationUnit.HOURS);
        boolean z = false;
        int m4176toLongimpl2 = Duration.m4171isInfiniteimpl(m4179unaryMinusUwyO8pc) ? 0 : (int) (Duration.m4176toLongimpl(m4179unaryMinusUwyO8pc, DurationUnit.MINUTES) % 60);
        int m4176toLongimpl3 = Duration.m4171isInfiniteimpl(m4179unaryMinusUwyO8pc) ? 0 : (int) (Duration.m4176toLongimpl(m4179unaryMinusUwyO8pc, DurationUnit.SECONDS) % 60);
        int m4169getNanosecondsComponentimpl = Duration.m4169getNanosecondsComponentimpl(m4179unaryMinusUwyO8pc);
        if (Duration.m4171isInfiniteimpl(j)) {
            m4176toLongimpl = 9999999999999L;
        }
        boolean z2 = m4176toLongimpl != 0;
        boolean z3 = (m4176toLongimpl3 == 0 && m4169getNanosecondsComponentimpl == 0) ? false : true;
        if (m4176toLongimpl2 != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(m4176toLongimpl);
            sb.append('H');
        }
        if (z) {
            sb.append(m4176toLongimpl2);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            Duration.m4163appendFractionalimpl(sb, m4176toLongimpl3, m4169getNanosecondsComponentimpl, 9, "S", true);
        }
        encoder.encodeString(sb.toString());
    }
}
