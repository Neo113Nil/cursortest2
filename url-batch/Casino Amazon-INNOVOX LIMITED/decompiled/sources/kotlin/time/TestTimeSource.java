package kotlin.time;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;

/* compiled from: TimeSources.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "<init>", "()V", "reading", "", "read", "plusAssign", "", "duration", "Lkotlin/time/Duration;", "plusAssign-LRDsOJo", "(J)V", ViewProps.OVERFLOW, "overflow-LRDsOJo", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TestTimeSource extends AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
        markNow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.time.AbstractLongTimeSource
    /* renamed from: read, reason: from getter */
    public long getReading() {
        return this.reading;
    }

    /* renamed from: plusAssign-LRDsOJo, reason: not valid java name */
    public final void m5444plusAssignLRDsOJo(long duration) {
        long m5371toLongimpl = Duration.m5371toLongimpl(duration, getUnit());
        if (((m5371toLongimpl - 1) | 1) != Long.MAX_VALUE) {
            long j = this.reading;
            long j2 = j + m5371toLongimpl;
            if ((m5371toLongimpl ^ j) >= 0 && (j ^ j2) < 0) {
                m5443overflowLRDsOJo(duration);
            }
            this.reading = j2;
            return;
        }
        long m5335divUwyO8pc = Duration.m5335divUwyO8pc(duration, 2);
        if ((1 | (Duration.m5371toLongimpl(m5335divUwyO8pc, getUnit()) - 1)) != Long.MAX_VALUE) {
            long j3 = this.reading;
            try {
                m5444plusAssignLRDsOJo(m5335divUwyO8pc);
                m5444plusAssignLRDsOJo(Duration.m5360minusLRDsOJo(duration, m5335divUwyO8pc));
                return;
            } catch (IllegalStateException e) {
                this.reading = j3;
                throw e;
            }
        }
        m5443overflowLRDsOJo(duration);
    }

    /* renamed from: overflow-LRDsOJo, reason: not valid java name */
    private final void m5443overflowLRDsOJo(long duration) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.reading + DurationUnitKt.shortName(getUnit()) + " is advanced by " + ((Object) Duration.m5372toStringimpl(duration)) + '.');
    }
}
