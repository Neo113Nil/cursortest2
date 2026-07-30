package io.noties.markwon.core;

import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import cn.hutool.core.convert.impl.s;
import io.noties.markwon.core.CoreProps;
import io.noties.markwon.j;
import io.noties.markwon.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.commonmark.node.a0;
import org.commonmark.node.q;
import org.commonmark.node.t;
import org.commonmark.node.u;
import org.commonmark.node.v;
import org.commonmark.node.w;
import org.commonmark.node.x;
import org.commonmark.node.y;
import org.commonmark.node.z;

/* loaded from: classes4.dex */
public class a extends io.noties.markwon.a {
    private boolean hasExplicitMovementMethod;
    private final List<p> onTextAddedListeners = new ArrayList(0);

    /* renamed from: io.noties.markwon.core.a$a, reason: collision with other inner class name */
    class C0354a implements l.c {
        C0354a() {
        }

        @Override // io.noties.markwon.l.c
        public void visit(@NonNull io.noties.markwon.l lVar, @NonNull a0 a0Var) {
            lVar.blockStart(a0Var);
            int length = lVar.length();
            lVar.builder().append((char) 160);
            lVar.setSpansForNodeOptional((io.noties.markwon.l) a0Var, length);
            lVar.blockEnd(a0Var);
        }
    }

    class b implements l.c {
        b() {
        }

        @Override // io.noties.markwon.l.c
        public void visit(@NonNull io.noties.markwon.l lVar, @NonNull org.commonmark.node.l lVar2) {
            lVar.blockStart(lVar2);
            int length = lVar.length();
            lVar.visitChildren(lVar2);
            CoreProps.HEADING_LEVEL.set(lVar.renderProps(), Integer.valueOf(lVar2.getLevel()));
            lVar.setSpansForNodeOptional((io.noties.markwon.l) lVar2, length);
            lVar.blockEnd(lVar2);
        }
    }

    class c implements l.c {
        c() {
        }

        @Override // io.noties.markwon.l.c
        public void visit(@NonNull io.noties.markwon.l lVar, @NonNull x xVar) {
            lVar.builder().append(' ');
        }
    }

    class d implements l.c {
        d() {
        }

        @Override // io.noties.markwon.l.c
        public void visit(@NonNull io.noties.markwon.l lVar, @NonNull org.commonmark.node.k kVar) {
            lVar.ensureNewLine();
        }
    }

    class e implements l.c {
        e() {
        }

        @Override // io.noties.markwon.l.c
        public void visit(@NonNull io.noties.markwon.l lVar, @NonNull w wVar) {
            boolean isInTightList = a.isInTightList(wVar);
            if (!isInTightList) {
                lVar.blockStart(wVar);
            }
            int length = lVar.length();
            lVar.visitChildren(wVar);
            CoreProps.PARAGRAPH_IS_IN_TIGHT_LIST.set(lVar.renderProps(), Boolean.valueOf(isInTightList));
            lVar.setSpansForNodeOptional((io.noties.markwon.l) wVar, length);
            if (isInTightList) {
                return;
            }
            lVar.blockEnd(wVar);
        }
    }

    class f implements l.c {
        f() {
        }

        @Override // io.noties.markwon.l.c
        public void visit(@NonNull io.noties.markwon.l lVar, @NonNull q qVar) {
            int length = lVar.length();
            lVar.visitChildren(qVar);
            CoreProps.LINK_DESTINATION.set(lVar.renderProps(), qVar.getDestination());
            lVar.setSpansForNodeOptional((io.noties.markwon.l) qVar, length);
        }
    }

    class g implements l.c {
        g() {
        }

        @Override // io.noties.markwon.l.c
        public void visit(@NonNull io.noties.markwon.l lVar, @NonNull z zVar) {
            String literal = zVar.getLiteral();
            lVar.builder().append(literal);
            if (a.this.onTextAddedListeners.isEmpty()) {
                return;
            }
            lVar.length();
            literal.length();
            Iterator it = a.this.onTextAddedListeners.iterator();
            if (it.hasNext()) {
                s.a(it.next());
                throw null;
            }
        }
    }

    class h implements l.c {
        h() {
        }

        @Override // io.noties.markwon.l.c
        public void visit(@NonNull io.noties.markwon.l lVar, @NonNull y yVar) {
            int length = lVar.length();
            lVar.visitChildren(yVar);
            lVar.setSpansForNodeOptional((io.noties.markwon.l) yVar, length);
        }
    }

    class i implements l.c {
        i() {
        }

        @Override // io.noties.markwon.l.c
        public void visit(@NonNull io.noties.markwon.l lVar, @NonNull org.commonmark.node.i iVar) {
            int length = lVar.length();
            lVar.visitChildren(iVar);
            lVar.setSpansForNodeOptional((io.noties.markwon.l) iVar, length);
        }
    }

    class j implements l.c {
        j() {
        }

        @Override // io.noties.markwon.l.c
        public void visit(@NonNull io.noties.markwon.l lVar, @NonNull org.commonmark.node.b bVar) {
            lVar.blockStart(bVar);
            int length = lVar.length();
            lVar.visitChildren(bVar);
            lVar.setSpansForNodeOptional((io.noties.markwon.l) bVar, length);
            lVar.blockEnd(bVar);
        }
    }

    class k implements l.c {
        k() {
        }

        @Override // io.noties.markwon.l.c
        public void visit(@NonNull io.noties.markwon.l lVar, @NonNull org.commonmark.node.d dVar) {
            int length = lVar.length();
            lVar.builder().append((char) 160).append(dVar.getLiteral()).append((char) 160);
            lVar.setSpansForNodeOptional((io.noties.markwon.l) dVar, length);
        }
    }

    class l implements l.c {
        l() {
        }

        @Override // io.noties.markwon.l.c
        public void visit(@NonNull io.noties.markwon.l lVar, @NonNull org.commonmark.node.j jVar) {
            a.visitCodeBlock(lVar, jVar.getInfo(), jVar.getLiteral(), jVar);
        }
    }

    class m implements l.c {
        m() {
        }

        @Override // io.noties.markwon.l.c
        public void visit(@NonNull io.noties.markwon.l lVar, @NonNull org.commonmark.node.p pVar) {
            a.visitCodeBlock(lVar, null, pVar.getLiteral(), pVar);
        }
    }

    class n implements l.c {
        n() {
        }

        @Override // io.noties.markwon.l.c
        public void visit(@NonNull io.noties.markwon.l lVar, @NonNull org.commonmark.node.o oVar) {
            io.noties.markwon.s sVar = lVar.configuration().spansFactory().get(org.commonmark.node.o.class);
            if (sVar == null) {
                lVar.visitChildren(oVar);
                return;
            }
            int length = lVar.length();
            lVar.visitChildren(oVar);
            if (length == lVar.length()) {
                lVar.builder().append((char) 65532);
            }
            io.noties.markwon.g configuration = lVar.configuration();
            boolean z7 = oVar.getParent() instanceof q;
            String process = configuration.imageDestinationProcessor().process(oVar.getDestination());
            io.noties.markwon.q renderProps = lVar.renderProps();
            io.noties.markwon.image.e.DESTINATION.set(renderProps, process);
            io.noties.markwon.image.e.REPLACEMENT_TEXT_IS_LINK.set(renderProps, Boolean.valueOf(z7));
            io.noties.markwon.image.e.IMAGE_SIZE.set(renderProps, null);
            lVar.setSpans(length, sVar.getSpans(configuration, renderProps));
        }
    }

    class o implements l.c {
        o() {
        }

        @Override // io.noties.markwon.l.c
        public void visit(@NonNull io.noties.markwon.l lVar, @NonNull t tVar) {
            int length = lVar.length();
            lVar.visitChildren(tVar);
            org.commonmark.node.a parent = tVar.getParent();
            if (parent instanceof v) {
                v vVar = (v) parent;
                int startNumber = vVar.getStartNumber();
                CoreProps.LIST_ITEM_TYPE.set(lVar.renderProps(), CoreProps.ListItemType.ORDERED);
                CoreProps.ORDERED_LIST_ITEM_NUMBER.set(lVar.renderProps(), Integer.valueOf(startNumber));
                vVar.setStartNumber(vVar.getStartNumber() + 1);
            } else {
                CoreProps.LIST_ITEM_TYPE.set(lVar.renderProps(), CoreProps.ListItemType.BULLET);
                CoreProps.BULLET_LIST_ITEM_LEVEL.set(lVar.renderProps(), Integer.valueOf(a.listLevel(tVar)));
            }
            lVar.setSpansForNodeOptional((io.noties.markwon.l) tVar, length);
            if (lVar.hasNext(tVar)) {
                lVar.ensureNewLine();
            }
        }
    }

    public interface p {
    }

    protected a() {
    }

    private static void blockQuote(@NonNull l.b bVar) {
        bVar.on(org.commonmark.node.b.class, new j());
    }

    private static void bulletList(@NonNull l.b bVar) {
        bVar.on(org.commonmark.node.c.class, new io.noties.markwon.core.c());
    }

    private static void code(@NonNull l.b bVar) {
        bVar.on(org.commonmark.node.d.class, new k());
    }

    @NonNull
    public static a create() {
        return new a();
    }

    private static void emphasis(@NonNull l.b bVar) {
        bVar.on(org.commonmark.node.i.class, new i());
    }

    @NonNull
    public static Set<Class<? extends org.commonmark.node.a>> enabledBlockTypes() {
        return new HashSet(Arrays.asList(org.commonmark.node.b.class, org.commonmark.node.l.class, org.commonmark.node.j.class, org.commonmark.node.m.class, a0.class, org.commonmark.node.s.class, org.commonmark.node.p.class));
    }

    private static void fencedCodeBlock(@NonNull l.b bVar) {
        bVar.on(org.commonmark.node.j.class, new l());
    }

    private static void hardLineBreak(@NonNull l.b bVar) {
        bVar.on(org.commonmark.node.k.class, new d());
    }

    private static void heading(@NonNull l.b bVar) {
        bVar.on(org.commonmark.node.l.class, new b());
    }

    private static void image(l.b bVar) {
        bVar.on(org.commonmark.node.o.class, new n());
    }

    private static void indentedCodeBlock(@NonNull l.b bVar) {
        bVar.on(org.commonmark.node.p.class, new m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isInTightList(@NonNull w wVar) {
        org.commonmark.node.a parent = wVar.getParent();
        if (parent == null) {
            return false;
        }
        u parent2 = parent.getParent();
        if (parent2 instanceof org.commonmark.node.s) {
            return ((org.commonmark.node.s) parent2).isTight();
        }
        return false;
    }

    private static void link(@NonNull l.b bVar) {
        bVar.on(q.class, new f());
    }

    private static void listItem(@NonNull l.b bVar) {
        bVar.on(t.class, new o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int listLevel(@NonNull u uVar) {
        int i8 = 0;
        for (u parent = uVar.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof t) {
                i8++;
            }
        }
        return i8;
    }

    private static void orderedList(@NonNull l.b bVar) {
        bVar.on(v.class, new io.noties.markwon.core.c());
    }

    private static void paragraph(@NonNull l.b bVar) {
        bVar.on(w.class, new e());
    }

    private static void softLineBreak(@NonNull l.b bVar) {
        bVar.on(x.class, new c());
    }

    private static void strongEmphasis(@NonNull l.b bVar) {
        bVar.on(y.class, new h());
    }

    private void text(@NonNull l.b bVar) {
        bVar.on(z.class, new g());
    }

    private static void thematicBreak(@NonNull l.b bVar) {
        bVar.on(a0.class, new C0354a());
    }

    @VisibleForTesting
    static void visitCodeBlock(@NonNull io.noties.markwon.l lVar, @Nullable String str, @NonNull String str2, @NonNull u uVar) {
        lVar.blockStart(uVar);
        int length = lVar.length();
        lVar.builder().append((char) 160).append('\n').append(lVar.configuration().syntaxHighlight().highlight(str, str2));
        lVar.ensureNewLine();
        lVar.builder().append((char) 160);
        CoreProps.CODE_BLOCK_INFO.set(lVar.renderProps(), str);
        lVar.setSpansForNodeOptional((io.noties.markwon.l) uVar, length);
        lVar.blockEnd(uVar);
    }

    @NonNull
    public a addOnTextAddedListener(@NonNull p pVar) {
        this.onTextAddedListeners.add(pVar);
        return this;
    }

    @Override // io.noties.markwon.a, io.noties.markwon.i
    public void afterSetText(@NonNull TextView textView) {
        if (this.hasExplicitMovementMethod || textView.getMovementMethod() != null) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // io.noties.markwon.a, io.noties.markwon.i
    public void beforeSetText(@NonNull TextView textView, @NonNull Spanned spanned) {
        io.noties.markwon.core.spans.h.measure(textView, spanned);
        if (spanned instanceof Spannable) {
            io.noties.markwon.core.spans.j.applyTo((Spannable) spanned, textView);
        }
    }

    @Override // io.noties.markwon.a, io.noties.markwon.i
    public void configureSpansFactory(@NonNull j.a aVar) {
        v5.b bVar = new v5.b();
        aVar.setFactory(y.class, new v5.h()).setFactory(org.commonmark.node.i.class, new v5.d()).setFactory(org.commonmark.node.b.class, new v5.a()).setFactory(org.commonmark.node.d.class, new v5.c()).setFactory(org.commonmark.node.j.class, bVar).setFactory(org.commonmark.node.p.class, bVar).setFactory(t.class, new v5.g()).setFactory(org.commonmark.node.l.class, new v5.e()).setFactory(q.class, new v5.f()).setFactory(a0.class, new v5.i());
    }

    @Override // io.noties.markwon.a, io.noties.markwon.i
    public void configureVisitor(@NonNull l.b bVar) {
        text(bVar);
        strongEmphasis(bVar);
        emphasis(bVar);
        blockQuote(bVar);
        code(bVar);
        fencedCodeBlock(bVar);
        indentedCodeBlock(bVar);
        image(bVar);
        bulletList(bVar);
        orderedList(bVar);
        listItem(bVar);
        thematicBreak(bVar);
        heading(bVar);
        softLineBreak(bVar);
        hardLineBreak(bVar);
        paragraph(bVar);
        link(bVar);
    }

    @NonNull
    public a hasExplicitMovementMethod(boolean z7) {
        this.hasExplicitMovementMethod = z7;
        return this;
    }
}
