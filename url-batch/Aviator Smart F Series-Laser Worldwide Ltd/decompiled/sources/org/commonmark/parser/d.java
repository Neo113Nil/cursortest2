package org.commonmark.parser;

import cn.hutool.core.convert.impl.s;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.commonmark.internal.h;
import org.commonmark.internal.m;
import org.commonmark.internal.n;
import org.commonmark.node.u;

/* loaded from: classes5.dex */
public class d {
    private final List<org.commonmark.parser.block.e> blockParserFactories;
    private final List<l7.a> delimiterProcessors;
    private final c inlineParserFactory;
    private final List<e> postProcessors;

    public static class b {
        private c inlineParserFactory;
        private final List<org.commonmark.parser.block.e> blockParserFactories = new ArrayList();
        private final List<l7.a> delimiterProcessors = new ArrayList();
        private final List<e> postProcessors = new ArrayList();
        private Set<Class<? extends org.commonmark.node.a>> enabledBlockTypes = h.getDefaultBlockParserTypes();

        class a implements c {
            a() {
            }

            @Override // org.commonmark.parser.c
            public org.commonmark.parser.a create(org.commonmark.parser.b bVar) {
                return new n(bVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c getInlineParserFactory() {
            c cVar = this.inlineParserFactory;
            return cVar != null ? cVar : new a();
        }

        public d build() {
            return new d(this);
        }

        public b customBlockParserFactory(org.commonmark.parser.block.e eVar) {
            if (eVar == null) {
                throw new NullPointerException("blockParserFactory must not be null");
            }
            this.blockParserFactories.add(eVar);
            return this;
        }

        public b customDelimiterProcessor(l7.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("delimiterProcessor must not be null");
            }
            this.delimiterProcessors.add(aVar);
            return this;
        }

        public b enabledBlockTypes(Set<Class<? extends org.commonmark.node.a>> set) {
            if (set == null) {
                throw new NullPointerException("enabledBlockTypes must not be null");
            }
            this.enabledBlockTypes = set;
            return this;
        }

        public b extensions(Iterable<Object> iterable) {
            if (iterable == null) {
                throw new NullPointerException("extensions must not be null");
            }
            Iterator<Object> it = iterable.iterator();
            while (it.hasNext()) {
                s.a(it.next());
            }
            return this;
        }

        public b inlineParserFactory(c cVar) {
            this.inlineParserFactory = cVar;
            return this;
        }

        public b postProcessor(e eVar) {
            if (eVar == null) {
                throw new NullPointerException("postProcessor must not be null");
            }
            this.postProcessors.add(eVar);
            return this;
        }
    }

    public static b builder() {
        return new b();
    }

    private h createDocumentParser() {
        return new h(this.blockParserFactories, this.inlineParserFactory, this.delimiterProcessors);
    }

    private u postProcess(u uVar) {
        Iterator<e> it = this.postProcessors.iterator();
        if (!it.hasNext()) {
            return uVar;
        }
        s.a(it.next());
        throw null;
    }

    public u parse(String str) {
        if (str != null) {
            return postProcess(createDocumentParser().parse(str));
        }
        throw new NullPointerException("input must not be null");
    }

    public u parseReader(Reader reader) {
        if (reader != null) {
            return postProcess(createDocumentParser().parse(reader));
        }
        throw new NullPointerException("input must not be null");
    }

    private d(b bVar) {
        this.blockParserFactories = h.calculateBlockParserFactories(bVar.blockParserFactories, bVar.enabledBlockTypes);
        c inlineParserFactory = bVar.getInlineParserFactory();
        this.inlineParserFactory = inlineParserFactory;
        this.postProcessors = bVar.postProcessors;
        List<l7.a> list = bVar.delimiterProcessors;
        this.delimiterProcessors = list;
        inlineParserFactory.create(new m(list, Collections.emptyMap()));
    }
}
