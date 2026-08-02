package org.intellij.markdown.parser;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.intellij.markdown.parser.constraints.CommonMarkdownConstraints;

/* loaded from: classes10.dex */
public final class MarkerProcessor$StateInfo {
    public final CommonMarkdownConstraints currentConstraints;
    public final List markersStack;
    public final CommonMarkdownConstraints nextConstraints;

    public MarkerProcessor$StateInfo(CommonMarkdownConstraints commonMarkdownConstraints, CommonMarkdownConstraints commonMarkdownConstraints2, List list) {
        commonMarkdownConstraints.getClass();
        commonMarkdownConstraints2.getClass();
        list.getClass();
        this.currentConstraints = commonMarkdownConstraints;
        this.nextConstraints = commonMarkdownConstraints2;
        this.markersStack = list;
    }

    public final boolean equals(Object obj) {
        MarkerProcessor$StateInfo markerProcessor$StateInfo = obj instanceof MarkerProcessor$StateInfo ? (MarkerProcessor$StateInfo) obj : null;
        return markerProcessor$StateInfo != null && Intrinsics.areEqual(this.currentConstraints, markerProcessor$StateInfo.currentConstraints) && Intrinsics.areEqual(this.nextConstraints, markerProcessor$StateInfo.nextConstraints) && Intrinsics.areEqual(this.markersStack, markerProcessor$StateInfo.markersStack);
    }

    public final int hashCode() {
        return this.markersStack.hashCode() + ((this.nextConstraints.hashCode() + (this.currentConstraints.hashCode() * 37)) * 37);
    }
}
