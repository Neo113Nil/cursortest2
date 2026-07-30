package io.noties.markwon;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.noties.markwon.l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.commonmark.node.a0;
import org.commonmark.node.u;
import org.commonmark.node.v;
import org.commonmark.node.w;
import org.commonmark.node.x;
import org.commonmark.node.y;
import org.commonmark.node.z;

/* loaded from: classes4.dex */
class n implements l {
    private final l.a blockHandler;
    private final t builder;
    private final g configuration;
    private final Map<Class<? extends u>, l.c> nodes;
    private final q renderProps;

    static class a implements l.b {
        private l.a blockHandler;
        private final Map<Class<? extends u>, l.c> nodes = new HashMap();

        a() {
        }

        @Override // io.noties.markwon.l.b
        @NonNull
        public l.b blockHandler(@NonNull l.a aVar) {
            this.blockHandler = aVar;
            return this;
        }

        @Override // io.noties.markwon.l.b
        @NonNull
        public l build(@NonNull g gVar, @NonNull q qVar) {
            l.a aVar = this.blockHandler;
            if (aVar == null) {
                aVar = new b();
            }
            return new n(gVar, qVar, new t(), Collections.unmodifiableMap(this.nodes), aVar);
        }

        @Override // io.noties.markwon.l.b
        @NonNull
        public <N extends u> l.b on(@NonNull Class<N> cls, @Nullable l.c cVar) {
            if (cVar == null) {
                this.nodes.remove(cls);
            } else {
                this.nodes.put(cls, cVar);
            }
            return this;
        }
    }

    n(@NonNull g gVar, @NonNull q qVar, @NonNull t tVar, @NonNull Map<Class<? extends u>, l.c> map, @NonNull l.a aVar) {
        this.configuration = gVar;
        this.renderProps = qVar;
        this.builder = tVar;
        this.nodes = map;
        this.blockHandler = aVar;
    }

    @Override // io.noties.markwon.l
    public void blockEnd(@NonNull u uVar) {
        this.blockHandler.blockEnd(this, uVar);
    }

    @Override // io.noties.markwon.l
    public void blockStart(@NonNull u uVar) {
        this.blockHandler.blockStart(this, uVar);
    }

    @Override // io.noties.markwon.l
    @NonNull
    public t builder() {
        return this.builder;
    }

    @Override // io.noties.markwon.l
    public void clear() {
        this.renderProps.clearAll();
        this.builder.clear();
    }

    @Override // io.noties.markwon.l
    @NonNull
    public g configuration() {
        return this.configuration;
    }

    @Override // io.noties.markwon.l
    public void ensureNewLine() {
        if (this.builder.length() <= 0 || '\n' == this.builder.lastChar()) {
            return;
        }
        this.builder.append('\n');
    }

    @Override // io.noties.markwon.l
    public void forceNewLine() {
        this.builder.append('\n');
    }

    @Override // io.noties.markwon.l
    public boolean hasNext(@NonNull u uVar) {
        return uVar.getNext() != null;
    }

    @Override // io.noties.markwon.l
    public int length() {
        return this.builder.length();
    }

    @Override // io.noties.markwon.l
    @NonNull
    public q renderProps() {
        return this.renderProps;
    }

    @Override // io.noties.markwon.l
    public void setSpans(int i8, @Nullable Object obj) {
        t tVar = this.builder;
        t.setSpans(tVar, obj, i8, tVar.length());
    }

    @Override // io.noties.markwon.l
    public <N extends u> void setSpansForNode(@NonNull N n8, int i8) {
        setSpansForNode(n8.getClass(), i8);
    }

    @Override // io.noties.markwon.l
    public <N extends u> void setSpansForNodeOptional(@NonNull N n8, int i8) {
        setSpansForNodeOptional(n8.getClass(), i8);
    }

    @Override // io.noties.markwon.l, org.commonmark.node.b0
    public void visit(org.commonmark.node.b bVar) {
        visit((u) bVar);
    }

    @Override // io.noties.markwon.l
    public void visitChildren(@NonNull u uVar) {
        u firstChild = uVar.getFirstChild();
        while (firstChild != null) {
            u next = firstChild.getNext();
            firstChild.accept(this);
            firstChild = next;
        }
    }

    @Override // io.noties.markwon.l
    public <N extends u> void setSpansForNode(@NonNull Class<N> cls, int i8) {
        setSpans(i8, this.configuration.spansFactory().require(cls).getSpans(this.configuration, this.renderProps));
    }

    @Override // io.noties.markwon.l
    public <N extends u> void setSpansForNodeOptional(@NonNull Class<N> cls, int i8) {
        s sVar = this.configuration.spansFactory().get(cls);
        if (sVar != null) {
            setSpans(i8, sVar.getSpans(this.configuration, this.renderProps));
        }
    }

    @Override // io.noties.markwon.l, org.commonmark.node.b0
    public void visit(org.commonmark.node.c cVar) {
        visit((u) cVar);
    }

    @Override // io.noties.markwon.l, org.commonmark.node.b0
    public void visit(org.commonmark.node.d dVar) {
        visit((u) dVar);
    }

    @Override // io.noties.markwon.l, org.commonmark.node.b0
    public void visit(org.commonmark.node.h hVar) {
        visit((u) hVar);
    }

    @Override // io.noties.markwon.l, org.commonmark.node.b0
    public void visit(org.commonmark.node.i iVar) {
        visit((u) iVar);
    }

    @Override // io.noties.markwon.l, org.commonmark.node.b0
    public void visit(org.commonmark.node.j jVar) {
        visit((u) jVar);
    }

    @Override // io.noties.markwon.l, org.commonmark.node.b0
    public void visit(org.commonmark.node.k kVar) {
        visit((u) kVar);
    }

    @Override // io.noties.markwon.l, org.commonmark.node.b0
    public void visit(org.commonmark.node.l lVar) {
        visit((u) lVar);
    }

    @Override // io.noties.markwon.l, org.commonmark.node.b0
    public void visit(a0 a0Var) {
        visit((u) a0Var);
    }

    @Override // io.noties.markwon.l, org.commonmark.node.b0
    public void visit(org.commonmark.node.n nVar) {
        visit((u) nVar);
    }

    @Override // io.noties.markwon.l, org.commonmark.node.b0
    public void visit(org.commonmark.node.m mVar) {
        visit((u) mVar);
    }

    @Override // io.noties.markwon.l, org.commonmark.node.b0
    public void visit(org.commonmark.node.o oVar) {
        visit((u) oVar);
    }

    @Override // io.noties.markwon.l, org.commonmark.node.b0
    public void visit(org.commonmark.node.p pVar) {
        visit((u) pVar);
    }

    @Override // io.noties.markwon.l, org.commonmark.node.b0
    public void visit(org.commonmark.node.q qVar) {
        visit((u) qVar);
    }

    @Override // io.noties.markwon.l, org.commonmark.node.b0
    public void visit(org.commonmark.node.t tVar) {
        visit((u) tVar);
    }

    @Override // io.noties.markwon.l, org.commonmark.node.b0
    public void visit(v vVar) {
        visit((u) vVar);
    }

    @Override // io.noties.markwon.l, org.commonmark.node.b0
    public void visit(w wVar) {
        visit((u) wVar);
    }

    @Override // io.noties.markwon.l, org.commonmark.node.b0
    public void visit(x xVar) {
        visit((u) xVar);
    }

    @Override // io.noties.markwon.l, org.commonmark.node.b0
    public void visit(y yVar) {
        visit((u) yVar);
    }

    @Override // io.noties.markwon.l, org.commonmark.node.b0
    public void visit(z zVar) {
        visit((u) zVar);
    }

    @Override // io.noties.markwon.l, org.commonmark.node.b0
    public void visit(org.commonmark.node.r rVar) {
        visit((u) rVar);
    }

    @Override // io.noties.markwon.l, org.commonmark.node.b0
    public void visit(org.commonmark.node.e eVar) {
        visit((u) eVar);
    }

    @Override // io.noties.markwon.l, org.commonmark.node.b0
    public void visit(org.commonmark.node.f fVar) {
        visit((u) fVar);
    }

    private void visit(@NonNull u uVar) {
        l.c cVar = this.nodes.get(uVar.getClass());
        if (cVar != null) {
            cVar.visit(this, uVar);
        } else {
            visitChildren(uVar);
        }
    }
}
