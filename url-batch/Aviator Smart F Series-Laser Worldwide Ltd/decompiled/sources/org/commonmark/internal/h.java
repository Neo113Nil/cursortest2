package org.commonmark.internal;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.commonmark.internal.c;
import org.commonmark.internal.i;
import org.commonmark.internal.j;
import org.commonmark.internal.k;
import org.commonmark.internal.l;
import org.commonmark.internal.o;
import org.commonmark.internal.s;
import org.commonmark.node.a0;
import org.commonmark.node.w;

/* loaded from: classes5.dex */
public class h implements org.commonmark.parser.block.h {
    private static final Set<Class<? extends org.commonmark.node.a>> CORE_FACTORY_TYPES = new LinkedHashSet(Arrays.asList(org.commonmark.node.b.class, org.commonmark.node.l.class, org.commonmark.node.j.class, org.commonmark.node.m.class, a0.class, org.commonmark.node.s.class, org.commonmark.node.p.class));
    private static final Map<Class<? extends org.commonmark.node.a>, org.commonmark.parser.block.e> NODES_TO_CORE_FACTORIES;
    private boolean blank;
    private final List<org.commonmark.parser.block.e> blockParserFactories;
    private boolean columnIsInTab;
    private final List<l7.a> delimiterProcessors;
    private final g documentBlockParser;
    private final org.commonmark.parser.c inlineParserFactory;
    private CharSequence line;
    private int index = 0;
    private int column = 0;
    private int nextNonSpace = 0;
    private int nextNonSpaceColumn = 0;
    private int indent = 0;
    private final Map<String, org.commonmark.node.r> definitions = new LinkedHashMap();
    private List<org.commonmark.parser.block.d> activeBlockParsers = new ArrayList();
    private Set<org.commonmark.parser.block.d> allBlockParsers = new LinkedHashSet();

    private static class a implements org.commonmark.parser.block.g {
        private final org.commonmark.parser.block.d matchedBlockParser;

        public a(org.commonmark.parser.block.d dVar) {
            this.matchedBlockParser = dVar;
        }

        @Override // org.commonmark.parser.block.g
        public org.commonmark.parser.block.d getMatchedBlockParser() {
            return this.matchedBlockParser;
        }

        @Override // org.commonmark.parser.block.g
        public CharSequence getParagraphContent() {
            org.commonmark.parser.block.d dVar = this.matchedBlockParser;
            if (!(dVar instanceof q)) {
                return null;
            }
            CharSequence contentString = ((q) dVar).getContentString();
            if (contentString.length() == 0) {
                return null;
            }
            return contentString;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(org.commonmark.node.b.class, new c.a());
        hashMap.put(org.commonmark.node.l.class, new j.a());
        hashMap.put(org.commonmark.node.j.class, new i.a());
        hashMap.put(org.commonmark.node.m.class, new k.b());
        hashMap.put(a0.class, new s.a());
        hashMap.put(org.commonmark.node.s.class, new o.a());
        hashMap.put(org.commonmark.node.p.class, new l.a());
        NODES_TO_CORE_FACTORIES = Collections.unmodifiableMap(hashMap);
    }

    public h(List<org.commonmark.parser.block.e> list, org.commonmark.parser.c cVar, List<l7.a> list2) {
        this.blockParserFactories = list;
        this.inlineParserFactory = cVar;
        this.delimiterProcessors = list2;
        g gVar = new g();
        this.documentBlockParser = gVar;
        activateBlockParser(gVar);
    }

    private void activateBlockParser(org.commonmark.parser.block.d dVar) {
        this.activeBlockParsers.add(dVar);
        this.allBlockParsers.add(dVar);
    }

    private <T extends org.commonmark.parser.block.d> T addChild(T t7) {
        while (!getActiveBlockParser().canContain(t7.getBlock())) {
            finalize(getActiveBlockParser());
        }
        getActiveBlockParser().getBlock().appendChild(t7.getBlock());
        activateBlockParser(t7);
        return t7;
    }

    private void addDefinitionsFrom(q qVar) {
        for (org.commonmark.node.r rVar : qVar.getDefinitions()) {
            qVar.getBlock().insertBefore(rVar);
            String label = rVar.getLabel();
            if (!this.definitions.containsKey(label)) {
                this.definitions.put(label, rVar);
            }
        }
    }

    private void addLine() {
        CharSequence subSequence;
        if (this.columnIsInTab) {
            int i8 = this.index + 1;
            CharSequence charSequence = this.line;
            CharSequence subSequence2 = charSequence.subSequence(i8, charSequence.length());
            int columnsToNextTabStop = org.commonmark.internal.util.d.columnsToNextTabStop(this.column);
            StringBuilder sb = new StringBuilder(subSequence2.length() + columnsToNextTabStop);
            for (int i9 = 0; i9 < columnsToNextTabStop; i9++) {
                sb.append(' ');
            }
            sb.append(subSequence2);
            subSequence = sb.toString();
        } else {
            CharSequence charSequence2 = this.line;
            subSequence = charSequence2.subSequence(this.index, charSequence2.length());
        }
        getActiveBlockParser().addLine(subSequence);
    }

    private void advance() {
        if (this.line.charAt(this.index) != '\t') {
            this.index++;
            this.column++;
        } else {
            this.index++;
            int i8 = this.column;
            this.column = i8 + org.commonmark.internal.util.d.columnsToNextTabStop(i8);
        }
    }

    public static List<org.commonmark.parser.block.e> calculateBlockParserFactories(List<org.commonmark.parser.block.e> list, Set<Class<? extends org.commonmark.node.a>> set) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        Iterator<Class<? extends org.commonmark.node.a>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(NODES_TO_CORE_FACTORIES.get(it.next()));
        }
        return arrayList;
    }

    private void deactivateBlockParser() {
        this.activeBlockParsers.remove(r0.size() - 1);
    }

    private void finalize(org.commonmark.parser.block.d dVar) {
        if (getActiveBlockParser() == dVar) {
            deactivateBlockParser();
        }
        if (dVar instanceof q) {
            addDefinitionsFrom((q) dVar);
        }
        dVar.closeBlock();
    }

    private org.commonmark.node.h finalizeAndProcess() {
        finalizeBlocks(this.activeBlockParsers);
        processInlines();
        return this.documentBlockParser.getBlock();
    }

    private void finalizeBlocks(List<org.commonmark.parser.block.d> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            finalize(list.get(size));
        }
    }

    private d findBlockStart(org.commonmark.parser.block.d dVar) {
        a aVar = new a(dVar);
        Iterator<org.commonmark.parser.block.e> it = this.blockParserFactories.iterator();
        while (it.hasNext()) {
            org.commonmark.parser.block.f tryStart = it.next().tryStart(this, aVar);
            if (tryStart instanceof d) {
                return (d) tryStart;
            }
        }
        return null;
    }

    private void findNextNonSpace() {
        int i8 = this.index;
        int i9 = this.column;
        this.blank = true;
        int length = this.line.length();
        while (true) {
            if (i8 >= length) {
                break;
            }
            char charAt = this.line.charAt(i8);
            if (charAt == '\t') {
                i8++;
                i9 += 4 - (i9 % 4);
            } else if (charAt != ' ') {
                this.blank = false;
                break;
            } else {
                i8++;
                i9++;
            }
        }
        this.nextNonSpace = i8;
        this.nextNonSpaceColumn = i9;
        this.indent = i9 - this.column;
    }

    public static Set<Class<? extends org.commonmark.node.a>> getDefaultBlockParserTypes() {
        return CORE_FACTORY_TYPES;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f7, code lost:
    
        setNewIndex(r10.nextNonSpace);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void incorporateLine(CharSequence charSequence) {
        this.line = org.commonmark.internal.util.d.prepareLine(charSequence);
        this.index = 0;
        this.column = 0;
        this.columnIsInTab = false;
        List<org.commonmark.parser.block.d> list = this.activeBlockParsers;
        int i8 = 1;
        for (org.commonmark.parser.block.d dVar : list.subList(1, list.size())) {
            findNextNonSpace();
            org.commonmark.parser.block.c tryContinue = dVar.tryContinue(this);
            if (!(tryContinue instanceof b)) {
                break;
            }
            b bVar = (b) tryContinue;
            if (bVar.isFinalize()) {
                finalize(dVar);
                return;
            }
            if (bVar.getNewIndex() != -1) {
                setNewIndex(bVar.getNewIndex());
            } else if (bVar.getNewColumn() != -1) {
                setNewColumn(bVar.getNewColumn());
            }
            i8++;
        }
        List<org.commonmark.parser.block.d> list2 = this.activeBlockParsers;
        ArrayList arrayList = new ArrayList(list2.subList(i8, list2.size()));
        org.commonmark.parser.block.d dVar2 = this.activeBlockParsers.get(i8 - 1);
        boolean isEmpty = arrayList.isEmpty();
        boolean z7 = (dVar2.getBlock() instanceof w) || dVar2.isContainer();
        while (true) {
            if (!z7) {
                break;
            }
            findNextNonSpace();
            if (isBlank() || (this.indent < org.commonmark.internal.util.d.CODE_BLOCK_INDENT && org.commonmark.internal.util.d.isLetter(this.line, this.nextNonSpace))) {
                break;
            }
            d findBlockStart = findBlockStart(dVar2);
            if (findBlockStart == null) {
                setNewIndex(this.nextNonSpace);
                break;
            }
            if (!isEmpty) {
                finalizeBlocks(arrayList);
                isEmpty = true;
            }
            if (findBlockStart.getNewIndex() != -1) {
                setNewIndex(findBlockStart.getNewIndex());
            } else if (findBlockStart.getNewColumn() != -1) {
                setNewColumn(findBlockStart.getNewColumn());
            }
            if (findBlockStart.isReplaceActiveBlockParser()) {
                prepareActiveBlockParserForReplacement();
            }
            org.commonmark.parser.block.d[] blockParsers = findBlockStart.getBlockParsers();
            int length = blockParsers.length;
            int i9 = 0;
            while (i9 < length) {
                org.commonmark.parser.block.d dVar3 = blockParsers[i9];
                org.commonmark.parser.block.d addChild = addChild(dVar3);
                i9++;
                z7 = dVar3.isContainer();
                dVar2 = addChild;
            }
        }
        if (!isEmpty && !isBlank() && getActiveBlockParser().canHaveLazyContinuationLines()) {
            addLine();
            return;
        }
        if (!isEmpty) {
            finalizeBlocks(arrayList);
        }
        if (!dVar2.isContainer()) {
            addLine();
        } else {
            if (isBlank()) {
                return;
            }
            addChild(new q());
            addLine();
        }
    }

    private void prepareActiveBlockParserForReplacement() {
        org.commonmark.parser.block.d activeBlockParser = getActiveBlockParser();
        deactivateBlockParser();
        this.allBlockParsers.remove(activeBlockParser);
        if (activeBlockParser instanceof q) {
            addDefinitionsFrom((q) activeBlockParser);
        }
        activeBlockParser.getBlock().unlink();
    }

    private void processInlines() {
        org.commonmark.parser.a create = this.inlineParserFactory.create(new m(this.delimiterProcessors, this.definitions));
        Iterator<org.commonmark.parser.block.d> it = this.allBlockParsers.iterator();
        while (it.hasNext()) {
            it.next().parseInlines(create);
        }
    }

    private void setNewColumn(int i8) {
        int i9;
        int i10 = this.nextNonSpaceColumn;
        if (i8 >= i10) {
            this.index = this.nextNonSpace;
            this.column = i10;
        }
        int length = this.line.length();
        while (true) {
            i9 = this.column;
            if (i9 >= i8 || this.index == length) {
                break;
            } else {
                advance();
            }
        }
        if (i9 <= i8) {
            this.columnIsInTab = false;
            return;
        }
        this.index--;
        this.column = i8;
        this.columnIsInTab = true;
    }

    private void setNewIndex(int i8) {
        int i9 = this.nextNonSpace;
        if (i8 >= i9) {
            this.index = i9;
            this.column = this.nextNonSpaceColumn;
        }
        int length = this.line.length();
        while (true) {
            int i10 = this.index;
            if (i10 >= i8 || i10 == length) {
                break;
            } else {
                advance();
            }
        }
        this.columnIsInTab = false;
    }

    @Override // org.commonmark.parser.block.h
    public org.commonmark.parser.block.d getActiveBlockParser() {
        return this.activeBlockParsers.get(r0.size() - 1);
    }

    @Override // org.commonmark.parser.block.h
    public int getColumn() {
        return this.column;
    }

    @Override // org.commonmark.parser.block.h
    public int getIndent() {
        return this.indent;
    }

    @Override // org.commonmark.parser.block.h
    public int getIndex() {
        return this.index;
    }

    @Override // org.commonmark.parser.block.h
    public CharSequence getLine() {
        return this.line;
    }

    @Override // org.commonmark.parser.block.h
    public int getNextNonSpaceIndex() {
        return this.nextNonSpace;
    }

    @Override // org.commonmark.parser.block.h
    public boolean isBlank() {
        return this.blank;
    }

    public org.commonmark.node.h parse(String str) {
        int i8 = 0;
        while (true) {
            int findLineBreak = org.commonmark.internal.util.d.findLineBreak(str, i8);
            if (findLineBreak == -1) {
                break;
            }
            incorporateLine(str.substring(i8, findLineBreak));
            i8 = findLineBreak + 1;
            if (i8 < str.length() && str.charAt(findLineBreak) == '\r' && str.charAt(i8) == '\n') {
                i8 = findLineBreak + 2;
            }
        }
        if (str.length() > 0 && (i8 == 0 || i8 < str.length())) {
            incorporateLine(str.substring(i8));
        }
        return finalizeAndProcess();
    }

    public org.commonmark.node.h parse(Reader reader) {
        BufferedReader bufferedReader;
        if (reader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) reader;
        } else {
            bufferedReader = new BufferedReader(reader);
        }
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                incorporateLine(readLine);
            } else {
                return finalizeAndProcess();
            }
        }
    }
}
