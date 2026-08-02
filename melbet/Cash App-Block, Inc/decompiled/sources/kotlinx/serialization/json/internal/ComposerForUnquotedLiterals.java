package kotlinx.serialization.json.internal;

import androidx.media3.common.FlagSet;
import org.commonmark.internal.BlockContent;

/* loaded from: classes9.dex */
public final class ComposerForUnquotedLiterals extends FlagSet.Builder {
    public final boolean forceQuoting;

    public ComposerForUnquotedLiterals(BlockContent blockContent, boolean z) {
        super(blockContent);
        this.forceQuoting = z;
    }

    @Override // androidx.media3.common.FlagSet.Builder
    public final void printQuoted(String str) {
        str.getClass();
        if (this.forceQuoting) {
            super.printQuoted(str);
        } else {
            ((BlockContent) this.flags).write(str);
        }
    }
}
