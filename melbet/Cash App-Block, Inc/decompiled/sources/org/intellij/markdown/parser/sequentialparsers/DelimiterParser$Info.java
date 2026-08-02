package org.intellij.markdown.parser.sequentialparsers;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import org.intellij.markdown.MarkdownElementType;

/* loaded from: classes10.dex */
public final class DelimiterParser$Info {
    public boolean canClose;
    public boolean canOpen;
    public int closerIndex;
    public final int length;
    public final char marker;
    public final int position;
    public final MarkdownElementType tokenType;

    public DelimiterParser$Info(MarkdownElementType markdownElementType, int i, int i2, boolean z, boolean z2, char c) {
        markdownElementType.getClass();
        this.tokenType = markdownElementType;
        this.position = i;
        this.length = i2;
        this.canOpen = z;
        this.canClose = z2;
        this.marker = c;
        this.closerIndex = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DelimiterParser$Info)) {
            return false;
        }
        DelimiterParser$Info delimiterParser$Info = (DelimiterParser$Info) obj;
        return Intrinsics.areEqual(this.tokenType, delimiterParser$Info.tokenType) && this.position == delimiterParser$Info.position && this.length == delimiterParser$Info.length && this.canOpen == delimiterParser$Info.canOpen && this.canClose == delimiterParser$Info.canClose && this.marker == delimiterParser$Info.marker && this.closerIndex == delimiterParser$Info.closerIndex;
    }

    public final int hashCode() {
        return Integer.hashCode(this.closerIndex) + ((Character.hashCode(this.marker) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.length, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.position, this.tokenType.hashCode() * 31, 31), 31), 31, this.canOpen), 31, this.canClose)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Info(tokenType=");
        sb.append(this.tokenType);
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", length=");
        sb.append(this.length);
        sb.append(", canOpen=");
        sb.append(this.canOpen);
        sb.append(", canClose=");
        sb.append(this.canClose);
        sb.append(", marker=");
        sb.append(this.marker);
        sb.append(", closerIndex=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.closerIndex, ')');
    }
}
