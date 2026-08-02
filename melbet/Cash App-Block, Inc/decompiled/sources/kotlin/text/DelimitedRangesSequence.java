package kotlin.text;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* loaded from: classes9.dex */
public final class DelimitedRangesSequence implements Sequence {
    public final Function2 getNextMatch;
    public final CharSequence input;
    public final int limit;

    public DelimitedRangesSequence(CharSequence charSequence, int i, Function2 function2) {
        charSequence.getClass();
        this.input = charSequence;
        this.limit = i;
        this.getNextMatch = function2;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new DelimitedRangesSequence$iterator$1(this);
    }
}
