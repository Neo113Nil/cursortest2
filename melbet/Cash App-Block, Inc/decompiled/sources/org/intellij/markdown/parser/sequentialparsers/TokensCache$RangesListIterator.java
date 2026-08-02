package org.intellij.markdown.parser.sequentialparsers;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;
import net.idrnd.face.iad.capture.internal.p0;
import org.commonmark.internal.BlockContent;
import org.intellij.markdown.MarkdownElementType;

/* loaded from: classes10.dex */
public final class TokensCache$RangesListIterator extends BlockContent {
    public final int listIndex;
    public final List ranges;
    public final /* synthetic */ p0 this$0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TokensCache$RangesListIterator(p0 p0Var, List list) {
        this(p0Var, list, 0, r0 != null ? r0.first : -1);
        list.getClass();
        IntRange intRange = (IntRange) CollectionsKt.firstOrNull(list);
    }

    @Override // org.commonmark.internal.BlockContent
    public final TokensCache$RangesListIterator advance() {
        int i = this.lineCount;
        List list = this.ranges;
        int size = list.size();
        int i2 = this.listIndex;
        if (i2 >= size) {
            return this;
        }
        int i3 = ((IntRange) list.get(i2)).last;
        p0 p0Var = this.this$0;
        if (i != i3) {
            return new TokensCache$RangesListIterator(p0Var, list, i2, i + 1);
        }
        int i4 = i2 + 1;
        IntRange intRange = (IntRange) CollectionsKt.getOrNull(i4, list);
        return new TokensCache$RangesListIterator(p0Var, list, i4, intRange != null ? intRange.first : ((ArrayList) p0Var.b).size());
    }

    @Override // org.commonmark.internal.BlockContent
    public final MarkdownElementType rawLookup() {
        IntRange intRange = (IntRange) CollectionsKt.getOrNull(this.listIndex, this.ranges);
        if (intRange == null) {
            return null;
        }
        int i = intRange.first;
        int i2 = intRange.last;
        int i3 = this.lineCount + 1;
        if (i > i3 || i3 > i2) {
            return null;
        }
        return info(1).f1632type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokensCache$RangesListIterator(p0 p0Var, List list, int i, int i2) {
        super(p0Var, i2, 6);
        this.this$0 = p0Var;
        this.ranges = list;
        this.listIndex = i;
    }
}
