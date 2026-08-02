package org.intellij.markdown.parser.sequentialparsers;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.internal.BlockContent;

/* loaded from: classes10.dex */
public final class LocalParsingResult {
    public final BlockContent iteratorPosition;
    public final Collection parsedNodes;
    public final Collection rangesToProcessFurther;

    public LocalParsingResult(BlockContent blockContent, Collection collection, Collection collection2) {
        blockContent.getClass();
        collection.getClass();
        collection2.getClass();
        this.iteratorPosition = blockContent;
        this.parsedNodes = collection;
        this.rangesToProcessFurther = collection2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalParsingResult)) {
            return false;
        }
        LocalParsingResult localParsingResult = (LocalParsingResult) obj;
        return Intrinsics.areEqual(this.iteratorPosition, localParsingResult.iteratorPosition) && Intrinsics.areEqual(this.parsedNodes, localParsingResult.parsedNodes) && Intrinsics.areEqual(this.rangesToProcessFurther, localParsingResult.rangesToProcessFurther);
    }

    public final int hashCode() {
        return this.rangesToProcessFurther.hashCode() + ((this.parsedNodes.hashCode() + (this.iteratorPosition.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LocalParsingResult(iteratorPosition=" + this.iteratorPosition + ", parsedNodes=" + this.parsedNodes + ", rangesToProcessFurther=" + this.rangesToProcessFurther + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocalParsingResult(BlockContent blockContent, Collection collection, ArrayList arrayList) {
        this(blockContent, collection, CollectionsKt__CollectionsJVMKt.listOf(arrayList));
        collection.getClass();
    }
}
