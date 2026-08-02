package kotlin.text;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;

/* loaded from: classes3.dex */
public final class StringsKt__StringsKt$lineSequence$$inlined$Sequence$1 implements Sequence {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $this_lineSequence$inlined;

    public /* synthetic */ StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(Object obj, int i) {
        this.$r8$classId = i;
        this.$this_lineSequence$inlined = obj;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        int i = this.$r8$classId;
        Object obj = this.$this_lineSequence$inlined;
        switch (i) {
            case 0:
                return new LinesIterator((CharSequence) obj);
            case 1:
                return ((Iterable) obj).iterator();
            default:
                return SequencesKt__SequenceBuilderKt.iterator((Function2) obj);
        }
    }
}
