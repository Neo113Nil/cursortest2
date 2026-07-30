package org.commonmark.internal;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class LinkReferenceDefinitionParser {
    private String destination;
    private StringBuilder label;
    private String normalizedLabel;
    private StringBuilder title;
    private char titleDelimiter;
    private State state = State.START_DEFINITION;
    private final StringBuilder paragraph = new StringBuilder();
    private final List<org.commonmark.node.r> definitions = new ArrayList();
    private boolean referenceValid = false;

    enum State {
        START_DEFINITION,
        LABEL,
        DESTINATION,
        START_TITLE,
        TITLE,
        PARAGRAPH
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$org$commonmark$internal$LinkReferenceDefinitionParser$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$org$commonmark$internal$LinkReferenceDefinitionParser$State = iArr;
            try {
                iArr[State.PARAGRAPH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$commonmark$internal$LinkReferenceDefinitionParser$State[State.START_DEFINITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$commonmark$internal$LinkReferenceDefinitionParser$State[State.LABEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$commonmark$internal$LinkReferenceDefinitionParser$State[State.DESTINATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$commonmark$internal$LinkReferenceDefinitionParser$State[State.START_TITLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$commonmark$internal$LinkReferenceDefinitionParser$State[State.TITLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private int destination(CharSequence charSequence, int i8) {
        int skipSpaceTab = org.commonmark.internal.util.d.skipSpaceTab(charSequence, i8, charSequence.length());
        int scanLinkDestination = org.commonmark.internal.util.c.scanLinkDestination(charSequence, skipSpaceTab);
        if (scanLinkDestination == -1) {
            return -1;
        }
        this.destination = charSequence.charAt(skipSpaceTab) == '<' ? charSequence.subSequence(skipSpaceTab + 1, scanLinkDestination - 1).toString() : charSequence.subSequence(skipSpaceTab, scanLinkDestination).toString();
        int skipSpaceTab2 = org.commonmark.internal.util.d.skipSpaceTab(charSequence, scanLinkDestination, charSequence.length());
        if (skipSpaceTab2 >= charSequence.length()) {
            this.referenceValid = true;
            this.paragraph.setLength(0);
        } else if (skipSpaceTab2 == scanLinkDestination) {
            return -1;
        }
        this.state = State.START_TITLE;
        return skipSpaceTab2;
    }

    private void finishReference() {
        if (this.referenceValid) {
            String unescapeString = org.commonmark.internal.util.a.unescapeString(this.destination);
            StringBuilder sb = this.title;
            this.definitions.add(new org.commonmark.node.r(this.normalizedLabel, unescapeString, sb != null ? org.commonmark.internal.util.a.unescapeString(sb.toString()) : null));
            this.label = null;
            this.referenceValid = false;
            this.normalizedLabel = null;
            this.destination = null;
            this.title = null;
        }
    }

    private int label(CharSequence charSequence, int i8) {
        int i9;
        int scanLinkLabelContent = org.commonmark.internal.util.c.scanLinkLabelContent(charSequence, i8);
        if (scanLinkLabelContent == -1) {
            return -1;
        }
        this.label.append(charSequence, i8, scanLinkLabelContent);
        if (scanLinkLabelContent >= charSequence.length()) {
            this.label.append('\n');
            return scanLinkLabelContent;
        }
        if (charSequence.charAt(scanLinkLabelContent) != ']' || (i9 = scanLinkLabelContent + 1) >= charSequence.length() || charSequence.charAt(i9) != ':' || this.label.length() > 999) {
            return -1;
        }
        String normalizeLabelContent = org.commonmark.internal.util.a.normalizeLabelContent(this.label.toString());
        if (normalizeLabelContent.isEmpty()) {
            return -1;
        }
        this.normalizedLabel = normalizeLabelContent;
        this.state = State.DESTINATION;
        return org.commonmark.internal.util.d.skipSpaceTab(charSequence, scanLinkLabelContent + 2, charSequence.length());
    }

    private int startDefinition(CharSequence charSequence, int i8) {
        int skipSpaceTab = org.commonmark.internal.util.d.skipSpaceTab(charSequence, i8, charSequence.length());
        if (skipSpaceTab >= charSequence.length() || charSequence.charAt(skipSpaceTab) != '[') {
            return -1;
        }
        this.state = State.LABEL;
        this.label = new StringBuilder();
        int i9 = skipSpaceTab + 1;
        if (i9 >= charSequence.length()) {
            this.label.append('\n');
        }
        return i9;
    }

    private int startTitle(CharSequence charSequence, int i8) {
        int skipSpaceTab = org.commonmark.internal.util.d.skipSpaceTab(charSequence, i8, charSequence.length());
        if (skipSpaceTab >= charSequence.length()) {
            this.state = State.START_DEFINITION;
            return skipSpaceTab;
        }
        this.titleDelimiter = (char) 0;
        char charAt = charSequence.charAt(skipSpaceTab);
        if (charAt == '\"' || charAt == '\'') {
            this.titleDelimiter = charAt;
        } else if (charAt == '(') {
            this.titleDelimiter = ')';
        }
        if (this.titleDelimiter != 0) {
            this.state = State.TITLE;
            this.title = new StringBuilder();
            skipSpaceTab++;
            if (skipSpaceTab == charSequence.length()) {
                this.title.append('\n');
            }
        } else {
            finishReference();
            this.state = State.START_DEFINITION;
        }
        return skipSpaceTab;
    }

    private int title(CharSequence charSequence, int i8) {
        int scanLinkTitleContent = org.commonmark.internal.util.c.scanLinkTitleContent(charSequence, i8, this.titleDelimiter);
        if (scanLinkTitleContent == -1) {
            return -1;
        }
        this.title.append(charSequence.subSequence(i8, scanLinkTitleContent));
        if (scanLinkTitleContent >= charSequence.length()) {
            this.title.append('\n');
            return scanLinkTitleContent;
        }
        int skipSpaceTab = org.commonmark.internal.util.d.skipSpaceTab(charSequence, scanLinkTitleContent + 1, charSequence.length());
        if (skipSpaceTab != charSequence.length()) {
            return -1;
        }
        this.referenceValid = true;
        finishReference();
        this.paragraph.setLength(0);
        this.state = State.START_DEFINITION;
        return skipSpaceTab;
    }

    List<org.commonmark.node.r> getDefinitions() {
        finishReference();
        return this.definitions;
    }

    CharSequence getParagraphContent() {
        return this.paragraph;
    }

    State getState() {
        return this.state;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[LOOP:0: B:5:0x0015->B:20:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void parse(CharSequence charSequence) {
        if (this.paragraph.length() != 0) {
            this.paragraph.append('\n');
        }
        this.paragraph.append(charSequence);
        int i8 = 0;
        while (i8 < charSequence.length()) {
            switch (a.$SwitchMap$org$commonmark$internal$LinkReferenceDefinitionParser$State[this.state.ordinal()]) {
                case 1:
                    return;
                case 2:
                    i8 = startDefinition(charSequence, i8);
                    if (i8 != -1) {
                        this.state = State.PARAGRAPH;
                        return;
                    }
                case 3:
                    i8 = label(charSequence, i8);
                    if (i8 != -1) {
                    }
                    break;
                case 4:
                    i8 = destination(charSequence, i8);
                    if (i8 != -1) {
                    }
                    break;
                case 5:
                    i8 = startTitle(charSequence, i8);
                    if (i8 != -1) {
                    }
                    break;
                case 6:
                    i8 = title(charSequence, i8);
                    if (i8 != -1) {
                    }
                    break;
                default:
                    if (i8 != -1) {
                    }
                    break;
            }
        }
    }
}
