package org.commonmark.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import kotlin.collections.ArrayDeque;
import kotlin.ranges.IntRange;
import kotlinx.serialization.json.internal.ArrayPoolsKt;
import kotlinx.serialization.json.internal.CharArrayPool;
import net.idrnd.face.iad.capture.internal.p0;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.lexer.TokenInfo;

/* loaded from: classes10.dex */
public class BlockContent {
    public final /* synthetic */ int $r8$classId;
    public int lineCount;
    public Object sb;

    public BlockContent(int i) {
        char[] cArr;
        this.$r8$classId = i;
        switch (i) {
            case 3:
                CharArrayPool charArrayPool = CharArrayPool.INSTANCE;
                synchronized (charArrayPool) {
                    ArrayDeque arrayDeque = charArrayPool.arrays;
                    cArr = null;
                    char[] cArr2 = (char[]) (arrayDeque.isEmpty() ? null : arrayDeque.removeLast());
                    if (cArr2 != null) {
                        charArrayPool.charsTotal -= cArr2.length;
                        cArr = cArr2;
                    }
                }
                this.sb = cArr == null ? new char[128] : cArr;
                return;
            case 4:
            default:
                this.lineCount = 0;
                this.sb = new StringBuilder();
                return;
            case 5:
                this.sb = new ArrayList();
                return;
        }
    }

    public void addProduction(Collection collection) {
        collection.getClass();
        ((ArrayList) this.sb).addAll(collection);
    }

    public BlockContent advance() {
        return new BlockContent((p0) this.sb, this.lineCount + 1, 6);
    }

    public char charLookup(int i) {
        p0 p0Var = (p0) this.sb;
        if (i == 0) {
            return p0Var.getRawCharAt(info(0).tokenStart);
        }
        if (i == -1) {
            return p0Var.getRawCharAt(info(0).tokenStart - 1);
        }
        if (i != 1) {
            return p0Var.getRawCharAt(i > 0 ? info(i).tokenStart : info(i + 1).tokenStart - 1);
        }
        return p0Var.getRawCharAt(info(0).tokenEnd);
    }

    public void ensureTotalCapacity(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.sb;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.sb = Arrays.copyOf(cArr, i3);
        }
    }

    public int getLength() {
        return info(0).tokenEnd - info(0).tokenStart;
    }

    public MarkdownElementType getType() {
        return info(0).f1632type;
    }

    public TokenInfo info(int i) {
        int i2 = this.lineCount;
        p0 p0Var = (p0) this.sb;
        if (i2 < 0) {
            int i3 = ((IntRange) p0Var.d).first;
            return new TokenInfo(null, i3, i3, 0, 0);
        }
        ArrayList arrayList = (ArrayList) p0Var.b;
        ArrayList arrayList2 = (ArrayList) p0Var.b;
        ArrayList arrayList3 = (ArrayList) p0Var.a;
        IntRange intRange = (IntRange) p0Var.d;
        if (i2 > arrayList.size()) {
            int i4 = intRange.last + 1;
            return new TokenInfo(null, i4, i4, 0, 0);
        }
        int size = (i2 < arrayList2.size() ? ((TokenInfo) arrayList2.get(i2)).rawIndex : arrayList3.size()) + i;
        if (size < 0) {
            int i5 = intRange.first;
            return new TokenInfo(null, i5, i5, 0, 0);
        }
        if (size < arrayList3.size()) {
            return (TokenInfo) arrayList3.get(size);
        }
        int i6 = intRange.last + 1;
        return new TokenInfo(null, i6, i6, 0, 0);
    }

    public MarkdownElementType rawLookup() {
        return info(1).f1632type;
    }

    public void release() {
        CharArrayPool charArrayPool = CharArrayPool.INSTANCE;
        char[] cArr = (char[]) this.sb;
        charArrayPool.getClass();
        cArr.getClass();
        synchronized (charArrayPool) {
            int i = charArrayPool.charsTotal;
            if (cArr.length + i < ArrayPoolsKt.MAX_CHARS_IN_POOL) {
                charArrayPool.charsTotal = i + cArr.length;
                charArrayPool.arrays.addLast(cArr);
            }
        }
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 3:
                return new String((char[]) this.sb, 0, this.lineCount);
            case 6:
                return "Iterator: " + this.lineCount + ": " + getType();
            default:
                return super.toString();
        }
    }

    public void write(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        ensureTotalCapacity(this.lineCount, length);
        str.getChars(0, str.length(), (char[]) this.sb, this.lineCount);
        this.lineCount += length;
    }

    public /* synthetic */ BlockContent(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.sb = obj;
        this.lineCount = i;
    }

    public BlockContent(BlockContent blockContent) {
        this.$r8$classId = 4;
        this.sb = blockContent;
        this.lineCount = blockContent.lineCount;
    }
}
