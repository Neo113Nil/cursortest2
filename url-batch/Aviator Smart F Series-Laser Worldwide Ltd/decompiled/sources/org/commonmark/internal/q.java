package org.commonmark.internal;

import java.util.List;
import org.commonmark.node.w;

/* loaded from: classes5.dex */
public class q extends org.commonmark.parser.block.a {
    private final w block = new w();
    private LinkReferenceDefinitionParser linkReferenceDefinitionParser = new LinkReferenceDefinitionParser();

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public void addLine(CharSequence charSequence) {
        this.linkReferenceDefinitionParser.parse(charSequence);
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public boolean canHaveLazyContinuationLines() {
        return true;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public void closeBlock() {
        if (this.linkReferenceDefinitionParser.getParagraphContent().length() == 0) {
            this.block.unlink();
        }
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public org.commonmark.node.a getBlock() {
        return this.block;
    }

    public CharSequence getContentString() {
        return this.linkReferenceDefinitionParser.getParagraphContent();
    }

    public List<org.commonmark.node.r> getDefinitions() {
        return this.linkReferenceDefinitionParser.getDefinitions();
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public void parseInlines(org.commonmark.parser.a aVar) {
        CharSequence paragraphContent = this.linkReferenceDefinitionParser.getParagraphContent();
        if (paragraphContent.length() > 0) {
            aVar.parse(paragraphContent.toString(), this.block);
        }
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public org.commonmark.parser.block.c tryContinue(org.commonmark.parser.block.h hVar) {
        return !hVar.isBlank() ? org.commonmark.parser.block.c.atIndex(hVar.getIndex()) : org.commonmark.parser.block.c.none();
    }
}
