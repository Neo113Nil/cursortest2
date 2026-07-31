package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Composers.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000bH\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\fH\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/serialization/json/internal/ComposerForUnsignedNumbers;", "Lkotlinx/serialization/json/internal/Composer;", "writer", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "forceQuoting", "", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Z)V", "print", "", "v", "", "", "", "", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposerForUnsignedNumbers extends Composer {
    private final boolean forceQuoting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerForUnsignedNumbers(InternalJsonWriter writer, boolean z) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.forceQuoting = z;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(int v) {
        String m4054m;
        String m4054m2;
        boolean z = this.forceQuoting;
        int m4082constructorimpl = UInt.m4082constructorimpl(v);
        if (z) {
            m4054m2 = UByte$$ExternalSyntheticBackport0.m4054m(m4082constructorimpl, 10);
            printQuoted(m4054m2);
        } else {
            m4054m = UByte$$ExternalSyntheticBackport0.m4054m(m4082constructorimpl, 10);
            print(m4054m);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(long v) {
        String m;
        String m2;
        boolean z = this.forceQuoting;
        long m4161constructorimpl = ULong.m4161constructorimpl(v);
        if (z) {
            m2 = UByte$$ExternalSyntheticBackport0.m(m4161constructorimpl, 10);
            printQuoted(m2);
        } else {
            m = UByte$$ExternalSyntheticBackport0.m(m4161constructorimpl, 10);
            print(m);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(byte v) {
        boolean z = this.forceQuoting;
        String m4046toStringimpl = UByte.m4046toStringimpl(UByte.m4002constructorimpl(v));
        if (z) {
            printQuoted(m4046toStringimpl);
        } else {
            print(m4046toStringimpl);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(short v) {
        boolean z = this.forceQuoting;
        String m4312toStringimpl = UShort.m4312toStringimpl(UShort.m4268constructorimpl(v));
        if (z) {
            printQuoted(m4312toStringimpl);
        } else {
            print(m4312toStringimpl);
        }
    }
}
