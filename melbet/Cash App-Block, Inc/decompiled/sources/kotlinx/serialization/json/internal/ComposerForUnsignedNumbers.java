package kotlinx.serialization.json.internal;

import androidx.media3.common.FlagSet;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import org.bouncycastle.crypto.hpke.HPKE;
import org.commonmark.internal.BlockContent;

/* loaded from: classes9.dex */
public final class ComposerForUnsignedNumbers extends FlagSet.Builder {
    public final boolean forceQuoting;

    public ComposerForUnsignedNumbers(BlockContent blockContent, boolean z) {
        super(blockContent);
        this.forceQuoting = z;
    }

    @Override // androidx.media3.common.FlagSet.Builder
    public final void print(short s) {
        if (this.forceQuoting) {
            UShort.Companion companion = UShort.Companion;
            printQuoted(String.valueOf(s & HPKE.aead_EXPORT_ONLY));
        } else {
            UShort.Companion companion2 = UShort.Companion;
            print(String.valueOf(s & HPKE.aead_EXPORT_ONLY));
        }
    }

    @Override // androidx.media3.common.FlagSet.Builder
    public final void print(long j) {
        if (this.forceQuoting) {
            ULong.Companion companion = ULong.Companion;
            printQuoted(Long.toUnsignedString(j));
        } else {
            ULong.Companion companion2 = ULong.Companion;
            print(Long.toUnsignedString(j));
        }
    }

    @Override // androidx.media3.common.FlagSet.Builder
    public final void print(byte b) {
        if (this.forceQuoting) {
            UByte.Companion companion = UByte.Companion;
            printQuoted(String.valueOf(b & 255));
        } else {
            UByte.Companion companion2 = UByte.Companion;
            print(String.valueOf(b & 255));
        }
    }

    @Override // androidx.media3.common.FlagSet.Builder
    public final void print(int i) {
        if (this.forceQuoting) {
            UInt.Companion companion = UInt.Companion;
            printQuoted(Integer.toUnsignedString(i));
        } else {
            UInt.Companion companion2 = UInt.Companion;
            print(Integer.toUnsignedString(i));
        }
    }
}
