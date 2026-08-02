package org.intellij.markdown.parser;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import io.noties.markwon.MarkwonImpl;
import java.util.List;
import org.intellij.markdown.MarkdownParsingException;

/* loaded from: classes10.dex */
public final class LookaheadText$Position {
    public final String currentLine;
    public final int globalPos;
    public final int lineN;
    public final int localPos;
    public final /* synthetic */ MarkwonImpl this$0;

    public LookaheadText$Position(MarkwonImpl markwonImpl, int i, int i2, int i3) {
        this.this$0 = markwonImpl;
        this.lineN = i;
        this.localPos = i2;
        this.globalPos = i3;
        String str = (String) ((List) markwonImpl.plugins).get(i);
        this.currentLine = str;
        if (i2 < -1 || i2 >= str.length()) {
            throw new MarkdownParsingException("");
        }
    }

    public final Integer charsToNonWhitespace() {
        int i = this.localPos;
        int max = Math.max(i, 0);
        while (true) {
            String str = this.currentLine;
            if (max >= str.length()) {
                return null;
            }
            char charAt = str.charAt(max);
            if (charAt != ' ' && charAt != '\t') {
                return Integer.valueOf(max - i);
            }
            max++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && obj.getClass() == LookaheadText$Position.class && this.globalPos == ((LookaheadText$Position) obj).globalPos;
    }

    public final Integer getNextLineOffset() {
        if (this.lineN + 1 < ((List) this.this$0.plugins).size()) {
            return Integer.valueOf((this.currentLine.length() - this.localPos) + this.globalPos);
        }
        return null;
    }

    public final int getNextLineOrEofOffset() {
        return (this.currentLine.length() - this.localPos) + this.globalPos;
    }

    public final int hashCode() {
        return this.globalPos;
    }

    public final LookaheadText$Position nextLinePosition() {
        Integer nextLineOffset = getNextLineOffset();
        if (nextLineOffset != null) {
            return nextPosition(nextLineOffset.intValue() - this.globalPos);
        }
        return null;
    }

    public final LookaheadText$Position nextPosition(int i) {
        LookaheadText$Position lookaheadText$Position = this;
        while (i != 0) {
            int i2 = lookaheadText$Position.localPos;
            int i3 = i2 + i;
            String str = lookaheadText$Position.currentLine;
            int length = str.length();
            MarkwonImpl markwonImpl = this.this$0;
            int i4 = lookaheadText$Position.globalPos;
            int i5 = lookaheadText$Position.lineN;
            if (i3 < length) {
                return new LookaheadText$Position(markwonImpl, i5, i3, i4 + i);
            }
            if (lookaheadText$Position.getNextLineOffset() == null) {
                return null;
            }
            int length2 = str.length() - i2;
            i -= length2;
            lookaheadText$Position = new LookaheadText$Position(markwonImpl, i5 + 1, -1, i4 + length2);
        }
        return lookaheadText$Position;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Position: '");
        int i = this.localPos;
        String str = this.currentLine;
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, i == -1 ? Recorder$$ExternalSyntheticOutline2.m("\\n", str) : str.substring(i), '\'');
    }
}
