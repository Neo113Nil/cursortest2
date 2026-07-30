package org.commonmark.internal;

import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class m implements org.commonmark.parser.b {
    private final List<l7.a> delimiterProcessors;
    private final Map<String, org.commonmark.node.r> linkReferenceDefinitions;

    public m(List<l7.a> list, Map<String, org.commonmark.node.r> map) {
        this.delimiterProcessors = list;
        this.linkReferenceDefinitions = map;
    }

    @Override // org.commonmark.parser.b
    public List<l7.a> getCustomDelimiterProcessors() {
        return this.delimiterProcessors;
    }

    @Override // org.commonmark.parser.b
    public org.commonmark.node.r getLinkReferenceDefinition(String str) {
        return this.linkReferenceDefinitions.get(str);
    }
}
