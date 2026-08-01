package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Composers.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000bH\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\fH\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/serialization/json/internal/ComposerForUnsignedNumbers;", "Lkotlinx/serialization/json/internal/Composer;", "writer", "Lkotlinx/serialization/json/internal/JsonWriter;", "forceQuoting", "", "(Lkotlinx/serialization/json/internal/JsonWriter;Z)V", "print", "", "v", "", "", "", "", "kotlinx-serialization-json"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposerForUnsignedNumbers extends Composer {
    private final boolean forceQuoting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerForUnsignedNumbers(JsonWriter writer, boolean z) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.forceQuoting = z;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(int v) {
        String m661m;
        String m661m2;
        boolean z = this.forceQuoting;
        int m688constructorimpl = UInt.m688constructorimpl(v);
        if (z) {
            m661m2 = UByte$$ExternalSyntheticBackport0.m661m(m688constructorimpl, 10);
            printQuoted(m661m2);
        } else {
            m661m = UByte$$ExternalSyntheticBackport0.m661m(m688constructorimpl, 10);
            print(m661m);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(long v) {
        String m$2;
        String m$22;
        boolean z = this.forceQuoting;
        long m767constructorimpl = ULong.m767constructorimpl(v);
        if (z) {
            m$22 = UByte$$ExternalSyntheticBackport0.m$2(m767constructorimpl, 10);
            printQuoted(m$22);
        } else {
            m$2 = UByte$$ExternalSyntheticBackport0.m$2(m767constructorimpl, 10);
            print(m$2);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(byte v) {
        boolean z = this.forceQuoting;
        String m653toStringimpl = UByte.m653toStringimpl(UByte.m609constructorimpl(v));
        if (z) {
            printQuoted(m653toStringimpl);
        } else {
            print(m653toStringimpl);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(short v) {
        boolean z = this.forceQuoting;
        String m918toStringimpl = UShort.m918toStringimpl(UShort.m874constructorimpl(v));
        if (z) {
            printQuoted(m918toStringimpl);
        } else {
            print(m918toStringimpl);
        }
    }
}
