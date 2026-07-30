package org.commonmark.internal;

import java.util.regex.Pattern;
import org.commonmark.node.w;

/* loaded from: classes5.dex */
public class k extends org.commonmark.parser.block.a {
    private static final Pattern[][] BLOCK_PATTERNS = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    private final org.commonmark.node.m block;
    private final Pattern closingPattern;
    private org.commonmark.internal.a content;
    private boolean finished;

    public static class b extends org.commonmark.parser.block.b {
        @Override // org.commonmark.parser.block.b, org.commonmark.parser.block.e
        public org.commonmark.parser.block.f tryStart(org.commonmark.parser.block.h hVar, org.commonmark.parser.block.g gVar) {
            int nextNonSpaceIndex = hVar.getNextNonSpaceIndex();
            CharSequence line = hVar.getLine();
            if (hVar.getIndent() < 4 && line.charAt(nextNonSpaceIndex) == '<') {
                for (int i8 = 1; i8 <= 7; i8++) {
                    if (i8 != 7 || !(gVar.getMatchedBlockParser().getBlock() instanceof w)) {
                        Pattern pattern = k.BLOCK_PATTERNS[i8][0];
                        Pattern pattern2 = k.BLOCK_PATTERNS[i8][1];
                        if (pattern.matcher(line.subSequence(nextNonSpaceIndex, line.length())).find()) {
                            return org.commonmark.parser.block.f.of(new k(pattern2)).atIndex(hVar.getIndex());
                        }
                    }
                }
            }
            return org.commonmark.parser.block.f.none();
        }
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public void addLine(CharSequence charSequence) {
        this.content.add(charSequence);
        Pattern pattern = this.closingPattern;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.finished = true;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public void closeBlock() {
        this.block.setLiteral(this.content.getString());
        this.content = null;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public org.commonmark.node.a getBlock() {
        return this.block;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public org.commonmark.parser.block.c tryContinue(org.commonmark.parser.block.h hVar) {
        return this.finished ? org.commonmark.parser.block.c.none() : (hVar.isBlank() && this.closingPattern == null) ? org.commonmark.parser.block.c.none() : org.commonmark.parser.block.c.atIndex(hVar.getIndex());
    }

    private k(Pattern pattern) {
        this.block = new org.commonmark.node.m();
        this.finished = false;
        this.content = new org.commonmark.internal.a();
        this.closingPattern = pattern;
    }
}
