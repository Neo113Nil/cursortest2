package org.commonmark.internal;

import java.io.Serializable;
import java.util.ArrayList;
import org.commonmark.node.Block;
import org.commonmark.node.Heading;
import org.commonmark.node.IndentedCodeBlock;
import org.commonmark.parser.block.AbstractBlockParser;

/* loaded from: classes10.dex */
public final class HeadingParser extends AbstractBlockParser {
    public final /* synthetic */ int $r8$classId;
    public final Block block;
    public final Serializable content;

    public final class Factory {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Factory(int i) {
            this.$r8$classId = i;
        }
    }

    public HeadingParser() {
        this.$r8$classId = 1;
        this.block = new IndentedCodeBlock();
        this.content = new ArrayList();
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser
    public void addLine(CharSequence charSequence) {
        switch (this.$r8$classId) {
            case 1:
                ((ArrayList) this.content).add(charSequence);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f A[LOOP:2: B:19:0x003b->B:21:0x003f, LOOP_END] */
    @Override // org.commonmark.parser.block.AbstractBlockParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void closeBlock() {
        int i;
        int i2;
        switch (this.$r8$classId) {
            case 1:
                ArrayList arrayList = (ArrayList) this.content;
                int size = arrayList.size();
                do {
                    size--;
                    if (size >= 0) {
                        CharSequence charSequence = (CharSequence) arrayList.get(size);
                        int length = charSequence.length();
                        i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                char charAt = charSequence.charAt(i2);
                                if (charAt != ' ') {
                                    switch (charAt) {
                                    }
                                }
                                i2++;
                            } else {
                                i2 = -1;
                            }
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    for (i = 0; i < size + 1; i++) {
                        sb.append((CharSequence) arrayList.get(i));
                        sb.append('\n');
                    }
                    ((IndentedCodeBlock) this.block).literal = sb.toString();
                    break;
                } while (i2 == -1);
                StringBuilder sb2 = new StringBuilder();
                while (i < size + 1) {
                }
                ((IndentedCodeBlock) this.block).literal = sb2.toString();
                break;
        }
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser
    public final Block getBlock() {
        int i = this.$r8$classId;
        Block block = this.block;
        switch (i) {
            case 0:
                return (Heading) block;
            default:
                return (IndentedCodeBlock) block;
        }
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser
    public void parseInlines(InlineParserImpl inlineParserImpl) {
        switch (this.$r8$classId) {
            case 0:
                inlineParserImpl.parse((String) this.content, (Heading) this.block);
                break;
        }
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser
    public final BlockContinueImpl tryContinue(DocumentParser documentParser) {
        switch (this.$r8$classId) {
            case 0:
                return null;
            default:
                if (documentParser.indent >= 4) {
                    return new BlockContinueImpl(-1, documentParser.column + 4, false);
                }
                if (documentParser.blank) {
                    return BlockContinueImpl.atIndex(documentParser.nextNonSpace);
                }
                return null;
        }
    }

    public HeadingParser(int i, String str) {
        this.$r8$classId = 0;
        Heading heading = new Heading();
        this.block = heading;
        heading.level = i;
        this.content = str;
    }
}
