package io.noties.markwon;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.commonmark.node.a0;
import org.commonmark.node.b0;
import org.commonmark.node.u;
import org.commonmark.node.v;
import org.commonmark.node.w;
import org.commonmark.node.x;
import org.commonmark.node.y;
import org.commonmark.node.z;

/* loaded from: classes4.dex */
public interface l extends b0 {

    public interface a {
        void blockEnd(@NonNull l lVar, @NonNull u uVar);

        void blockStart(@NonNull l lVar, @NonNull u uVar);
    }

    public interface b {
        @NonNull
        b blockHandler(@NonNull a aVar);

        @NonNull
        l build(@NonNull g gVar, @NonNull q qVar);

        @NonNull
        <N extends u> b on(@NonNull Class<N> cls, @Nullable c cVar);
    }

    public interface c {
        void visit(@NonNull l lVar, @NonNull u uVar);
    }

    void blockEnd(@NonNull u uVar);

    void blockStart(@NonNull u uVar);

    @NonNull
    t builder();

    void clear();

    @NonNull
    g configuration();

    void ensureNewLine();

    void forceNewLine();

    boolean hasNext(@NonNull u uVar);

    int length();

    @NonNull
    q renderProps();

    void setSpans(int i8, @Nullable Object obj);

    <N extends u> void setSpansForNode(@NonNull Class<N> cls, int i8);

    <N extends u> void setSpansForNode(@NonNull N n8, int i8);

    <N extends u> void setSpansForNodeOptional(@NonNull Class<N> cls, int i8);

    <N extends u> void setSpansForNodeOptional(@NonNull N n8, int i8);

    @Override // org.commonmark.node.b0
    /* synthetic */ void visit(a0 a0Var);

    @Override // org.commonmark.node.b0
    /* synthetic */ void visit(org.commonmark.node.b bVar);

    @Override // org.commonmark.node.b0
    /* synthetic */ void visit(org.commonmark.node.c cVar);

    @Override // org.commonmark.node.b0
    /* synthetic */ void visit(org.commonmark.node.d dVar);

    @Override // org.commonmark.node.b0
    /* synthetic */ void visit(org.commonmark.node.e eVar);

    @Override // org.commonmark.node.b0
    /* synthetic */ void visit(org.commonmark.node.f fVar);

    @Override // org.commonmark.node.b0
    /* synthetic */ void visit(org.commonmark.node.h hVar);

    @Override // org.commonmark.node.b0
    /* synthetic */ void visit(org.commonmark.node.i iVar);

    @Override // org.commonmark.node.b0
    /* synthetic */ void visit(org.commonmark.node.j jVar);

    @Override // org.commonmark.node.b0
    /* synthetic */ void visit(org.commonmark.node.k kVar);

    @Override // org.commonmark.node.b0
    /* synthetic */ void visit(org.commonmark.node.l lVar);

    @Override // org.commonmark.node.b0
    /* synthetic */ void visit(org.commonmark.node.m mVar);

    @Override // org.commonmark.node.b0
    /* synthetic */ void visit(org.commonmark.node.n nVar);

    @Override // org.commonmark.node.b0
    /* synthetic */ void visit(org.commonmark.node.o oVar);

    @Override // org.commonmark.node.b0
    /* synthetic */ void visit(org.commonmark.node.p pVar);

    @Override // org.commonmark.node.b0
    /* synthetic */ void visit(org.commonmark.node.q qVar);

    @Override // org.commonmark.node.b0
    /* synthetic */ void visit(org.commonmark.node.r rVar);

    @Override // org.commonmark.node.b0
    /* synthetic */ void visit(org.commonmark.node.t tVar);

    @Override // org.commonmark.node.b0
    /* synthetic */ void visit(v vVar);

    @Override // org.commonmark.node.b0
    /* synthetic */ void visit(w wVar);

    @Override // org.commonmark.node.b0
    /* synthetic */ void visit(x xVar);

    @Override // org.commonmark.node.b0
    /* synthetic */ void visit(y yVar);

    @Override // org.commonmark.node.b0
    /* synthetic */ void visit(z zVar);

    void visitChildren(@NonNull u uVar);
}
