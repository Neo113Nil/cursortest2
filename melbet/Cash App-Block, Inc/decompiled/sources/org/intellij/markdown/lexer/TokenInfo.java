package org.intellij.markdown.lexer;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import org.intellij.markdown.MarkdownElementType;

/* loaded from: classes10.dex */
public final class TokenInfo {
    public final int normIndex;
    public final int rawIndex;
    public final int tokenEnd;
    public final int tokenStart;

    /* renamed from: type, reason: collision with root package name */
    public final MarkdownElementType f1632type;

    public TokenInfo(MarkdownElementType markdownElementType, int i, int i2, int i3, int i4) {
        this.f1632type = markdownElementType;
        this.tokenStart = i;
        this.tokenEnd = i2;
        this.rawIndex = i3;
        this.normIndex = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenInfo)) {
            return false;
        }
        TokenInfo tokenInfo = (TokenInfo) obj;
        return Intrinsics.areEqual(this.f1632type, tokenInfo.f1632type) && this.tokenStart == tokenInfo.tokenStart && this.tokenEnd == tokenInfo.tokenEnd && this.rawIndex == tokenInfo.rawIndex && this.normIndex == tokenInfo.normIndex;
    }

    public final int hashCode() {
        MarkdownElementType markdownElementType = this.f1632type;
        return Integer.hashCode(this.normIndex) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.rawIndex, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.tokenEnd, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.tokenStart, (markdownElementType == null ? 0 : markdownElementType.hashCode()) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenInfo(type=");
        sb.append(this.f1632type);
        sb.append(", tokenStart=");
        sb.append(this.tokenStart);
        sb.append(", tokenEnd=");
        sb.append(this.tokenEnd);
        sb.append(", rawIndex=");
        sb.append(this.rawIndex);
        sb.append(", normIndex=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.normIndex, ')');
    }
}
