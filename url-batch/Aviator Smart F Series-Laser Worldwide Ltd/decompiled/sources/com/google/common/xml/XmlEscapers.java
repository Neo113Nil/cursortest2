package com.google.common.xml;

import cn.hutool.core.util.i1;
import com.google.common.annotations.GwtCompatible;
import com.google.common.escape.Escaper;
import com.google.common.escape.Escapers;
import okio.z0;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes4.dex */
public class XmlEscapers {
    private static final char MAX_ASCII_CONTROL_CHAR = 31;
    private static final char MIN_ASCII_CONTROL_CHAR = 0;
    private static final Escaper XML_ATTRIBUTE_ESCAPER;
    private static final Escaper XML_CONTENT_ESCAPER;
    private static final Escaper XML_ESCAPER;

    static {
        Escapers.Builder builder = Escapers.builder();
        builder.setSafeRange((char) 0, z0.REPLACEMENT_CHARACTER);
        builder.setUnsafeReplacement("�");
        for (char c8 = 0; c8 <= 31; c8 = (char) (c8 + 1)) {
            if (c8 != '\t' && c8 != '\n' && c8 != '\r') {
                builder.addEscape(c8, "�");
            }
        }
        builder.addEscape('&', i1.AMP);
        builder.addEscape('<', i1.LT);
        builder.addEscape('>', i1.GT);
        XML_CONTENT_ESCAPER = builder.build();
        builder.addEscape('\'', i1.APOS);
        builder.addEscape('\"', i1.QUOTE);
        XML_ESCAPER = builder.build();
        builder.addEscape('\t', "&#x9;");
        builder.addEscape('\n', "&#xA;");
        builder.addEscape('\r', "&#xD;");
        XML_ATTRIBUTE_ESCAPER = builder.build();
    }

    private XmlEscapers() {
    }

    public static Escaper xmlAttributeEscaper() {
        return XML_ATTRIBUTE_ESCAPER;
    }

    public static Escaper xmlContentEscaper() {
        return XML_CONTENT_ESCAPER;
    }
}
