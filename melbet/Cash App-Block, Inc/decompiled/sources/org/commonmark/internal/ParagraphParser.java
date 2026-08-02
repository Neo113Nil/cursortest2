package org.commonmark.internal;

import androidx.camera.core.AspectRatio;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import java.util.Locale;
import java.util.regex.Pattern;
import org.commonmark.internal.util.Escaping;
import org.commonmark.internal.util.LinkScanner;
import org.commonmark.node.Block;
import org.commonmark.node.Paragraph;
import org.commonmark.parser.block.AbstractBlockParser;

/* loaded from: classes10.dex */
public final class ParagraphParser extends AbstractBlockParser {
    public final Paragraph block = new Paragraph();
    public final LinkReferenceDefinitionParser linkReferenceDefinitionParser = new LinkReferenceDefinitionParser();

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0105, code lost:
    
        if (r3 == r4) goto L21;
     */
    @Override // org.commonmark.parser.block.AbstractBlockParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void addLine(CharSequence charSequence) {
        int scanLinkLabelContent;
        int i;
        LinkReferenceDefinitionParser linkReferenceDefinitionParser = this.linkReferenceDefinitionParser;
        StringBuilder sb = linkReferenceDefinitionParser.paragraph;
        if (sb.length() != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        int i2 = 0;
        while (i2 < charSequence.length()) {
            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(linkReferenceDefinitionParser.state);
            if (ordinal == 0) {
                int skipSpaceTab = AspectRatio.skipSpaceTab(i2, charSequence.length(), charSequence);
                if (skipSpaceTab < charSequence.length() && charSequence.charAt(skipSpaceTab) == '[') {
                    linkReferenceDefinitionParser.state = 2;
                    linkReferenceDefinitionParser.label = new StringBuilder();
                    i2 = skipSpaceTab + 1;
                    if (i2 >= charSequence.length()) {
                        linkReferenceDefinitionParser.label.append('\n');
                    }
                }
                i2 = -1;
            } else if (ordinal == 1) {
                scanLinkLabelContent = LinkScanner.scanLinkLabelContent(i2, charSequence);
                if (scanLinkLabelContent != -1) {
                    linkReferenceDefinitionParser.label.append(charSequence, i2, scanLinkLabelContent);
                    if (scanLinkLabelContent >= charSequence.length()) {
                        linkReferenceDefinitionParser.label.append('\n');
                        i2 = scanLinkLabelContent;
                    } else if (charSequence.charAt(scanLinkLabelContent) == ']' && (i = scanLinkLabelContent + 1) < charSequence.length() && charSequence.charAt(i) == ':' && linkReferenceDefinitionParser.label.length() <= 999) {
                        String sb2 = linkReferenceDefinitionParser.label.toString();
                        Pattern pattern = Escaping.BACKSLASH_OR_AMP;
                        String replaceAll = Escaping.WHITESPACE.matcher(sb2.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        if (!replaceAll.isEmpty()) {
                            linkReferenceDefinitionParser.normalizedLabel = replaceAll;
                            linkReferenceDefinitionParser.state = 3;
                            i2 = AspectRatio.skipSpaceTab(scanLinkLabelContent + 2, charSequence.length(), charSequence);
                        }
                    }
                }
                i2 = -1;
            } else if (ordinal == 2) {
                int skipSpaceTab2 = AspectRatio.skipSpaceTab(i2, charSequence.length(), charSequence);
                int scanLinkDestination = LinkScanner.scanLinkDestination(skipSpaceTab2, charSequence);
                if (scanLinkDestination != -1) {
                    linkReferenceDefinitionParser.destination = charSequence.charAt(skipSpaceTab2) == '<' ? charSequence.subSequence(skipSpaceTab2 + 1, scanLinkDestination - 1).toString() : charSequence.subSequence(skipSpaceTab2, scanLinkDestination).toString();
                    i2 = AspectRatio.skipSpaceTab(scanLinkDestination, charSequence.length(), charSequence);
                    if (i2 >= charSequence.length()) {
                        linkReferenceDefinitionParser.referenceValid = true;
                        sb.setLength(0);
                    }
                    linkReferenceDefinitionParser.state = 4;
                }
                i2 = -1;
            } else if (ordinal == 3) {
                i2 = AspectRatio.skipSpaceTab(i2, charSequence.length(), charSequence);
                if (i2 >= charSequence.length()) {
                    linkReferenceDefinitionParser.state = 1;
                } else {
                    linkReferenceDefinitionParser.titleDelimiter = (char) 0;
                    char charAt = charSequence.charAt(i2);
                    if (charAt == '\"' || charAt == '\'') {
                        linkReferenceDefinitionParser.titleDelimiter = charAt;
                    } else if (charAt == '(') {
                        linkReferenceDefinitionParser.titleDelimiter = ')';
                    }
                    if (linkReferenceDefinitionParser.titleDelimiter != 0) {
                        linkReferenceDefinitionParser.state = 5;
                        linkReferenceDefinitionParser.title = new StringBuilder();
                        i2++;
                        if (i2 == charSequence.length()) {
                            linkReferenceDefinitionParser.title.append('\n');
                        }
                    } else {
                        linkReferenceDefinitionParser.finishReference();
                        linkReferenceDefinitionParser.state = 1;
                    }
                }
            } else if (ordinal == 4) {
                scanLinkLabelContent = LinkScanner.scanLinkTitleContent(charSequence, i2, linkReferenceDefinitionParser.titleDelimiter);
                if (scanLinkLabelContent != -1) {
                    linkReferenceDefinitionParser.title.append(charSequence.subSequence(i2, scanLinkLabelContent));
                    if (scanLinkLabelContent >= charSequence.length()) {
                        linkReferenceDefinitionParser.title.append('\n');
                        i2 = scanLinkLabelContent;
                    } else {
                        i2 = AspectRatio.skipSpaceTab(scanLinkLabelContent + 1, charSequence.length(), charSequence);
                        if (i2 == charSequence.length()) {
                            linkReferenceDefinitionParser.referenceValid = true;
                            linkReferenceDefinitionParser.finishReference();
                            sb.setLength(0);
                            linkReferenceDefinitionParser.state = 1;
                        }
                    }
                }
                i2 = -1;
            } else if (ordinal == 5) {
                return;
            }
            if (i2 == -1) {
                linkReferenceDefinitionParser.state = 6;
                return;
            }
        }
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser
    public final void closeBlock() {
        if (this.linkReferenceDefinitionParser.paragraph.length() == 0) {
            this.block.unlink();
        }
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser
    public final Block getBlock() {
        return this.block;
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser
    public final void parseInlines(InlineParserImpl inlineParserImpl) {
        StringBuilder sb = this.linkReferenceDefinitionParser.paragraph;
        if (sb.length() > 0) {
            inlineParserImpl.parse(sb.toString(), this.block);
        }
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser
    public final BlockContinueImpl tryContinue(DocumentParser documentParser) {
        if (documentParser.blank) {
            return null;
        }
        return BlockContinueImpl.atIndex(documentParser.index);
    }
}
