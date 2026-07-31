package com.yandex.div.core.expression.local;

import O1.Bc;
import O1.C1013qd;
import O1.H3;
import O1.Z;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.TabsStateCache;
import com.yandex.div.core.state.TemporaryDivStateCache;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.state.DivStateCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public class DivRuntimeVisitor {

    @NotNull
    private final DivStateCache divStateCache;

    @NotNull
    private final TabsStateCache tabsCache;

    @NotNull
    private final TemporaryDivStateCache temporaryStateCache;

    public DivRuntimeVisitor(@NotNull DivStateCache divStateCache, @NotNull TemporaryDivStateCache temporaryStateCache, @NotNull TabsStateCache tabsCache) {
        Intrinsics.checkNotNullParameter(divStateCache, "divStateCache");
        Intrinsics.checkNotNullParameter(temporaryStateCache, "temporaryStateCache");
        Intrinsics.checkNotNullParameter(tabsCache, "tabsCache");
        this.divStateCache = divStateCache;
        this.temporaryStateCache = temporaryStateCache;
        this.tabsCache = tabsCache;
    }

    private String appendChild(String str, Z z4, int i4) {
        return appendChild(str, BaseDivViewExtensionsKt.getChildPathUnit(z4.b(), i4));
    }

    private ExpressionsRuntime defaultVisit(Z z4, Div2View div2View, String str, ExpressionsRuntime expressionsRuntime) {
        ExpressionsRuntime orCreateRuntime$div_release = expressionsRuntime.getRuntimeStore().getOrCreateRuntime$div_release(str, z4, expressionsRuntime.getExpressionResolver());
        orCreateRuntime$div_release.onAttachedToWindow(div2View);
        return orCreateRuntime$div_release;
    }

    private String getActiveStateId(Bc bc, Div2View div2View, List<String> list, ExpressionResolverImpl expressionResolverImpl) {
        String joinToString$default = CollectionsKt.joinToString$default(list, "/", null, null, 0, null, null, 62, null);
        String id = div2View.getDivTag().getId();
        Intrinsics.checkNotNullExpressionValue(id, "divView.divTag.id");
        String state = this.temporaryStateCache.getState(id, joinToString$default);
        if (state != null) {
            return state;
        }
        String state2 = this.divStateCache.getState(id, joinToString$default);
        if (state2 == null) {
            String str = bc.f1528x;
            if (str != null) {
                Variable mutableVariable = expressionResolverImpl.getVariableController().getMutableVariable(str);
                state2 = String.valueOf(mutableVariable != null ? mutableVariable.getValue() : null);
            } else {
                state2 = null;
            }
            if (state2 == null) {
                Expression expression = bc.f1514j;
                state2 = expression != null ? (String) expression.evaluate(expressionResolverImpl) : null;
                if (state2 == null) {
                    Bc.c cVar = (Bc.c) CollectionsKt.firstOrNull(bc.f1529y);
                    if (cVar != null) {
                        return cVar.f1537d;
                    }
                    return null;
                }
            }
        }
        return state2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ArrayList<String> getStatesFlat(DivStatePath divStatePath) {
        ArrayList<String> arrayList = new ArrayList<>(divStatePath.getStates().size() * 4);
        arrayList.add(String.valueOf(divStatePath.getTopLevelStateId()));
        Iterator<T> it = divStatePath.getStates().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(pair.getFirst());
            arrayList.add(pair.getSecond());
        }
        return arrayList;
    }

    private void visit(Z z4, Div2View div2View, String str, List<String> list, ExpressionsRuntime expressionsRuntime) {
        if (z4 instanceof Z.c) {
            Z.c cVar = (Z.c) z4;
            visitContainer(z4, div2View, cVar.c().f4510A, cVar.c().f4563z, str, list, expressionsRuntime);
            return;
        }
        if (z4 instanceof Z.g) {
            visitContainer(z4, div2View, ((Z.g) z4).c().f2887y, null, str, list, expressionsRuntime);
            return;
        }
        if (z4 instanceof Z.e) {
            Z.e eVar = (Z.e) z4;
            visitContainer(z4, div2View, eVar.c().f7311u, eVar.c().f7309s, str, list, expressionsRuntime);
            return;
        }
        if (z4 instanceof Z.k) {
            Z.k kVar = (Z.k) z4;
            visitContainer(z4, div2View, kVar.c().f2594t, kVar.c().f2592r, str, list, expressionsRuntime);
            return;
        }
        if (z4 instanceof Z.o) {
            visitState((Z.o) z4, div2View, str, list, expressionsRuntime);
            return;
        }
        if (z4 instanceof Z.q) {
            visitTabs((Z.q) z4, div2View, str, list, expressionsRuntime);
            return;
        }
        if (z4 instanceof Z.d) {
            defaultVisit(z4, div2View, str, expressionsRuntime);
            return;
        }
        if (z4 instanceof Z.f) {
            defaultVisit(z4, div2View, str, expressionsRuntime);
            return;
        }
        if (z4 instanceof Z.h) {
            defaultVisit(z4, div2View, str, expressionsRuntime);
            return;
        }
        if (z4 instanceof Z.i) {
            defaultVisit(z4, div2View, str, expressionsRuntime);
            return;
        }
        if (z4 instanceof Z.j) {
            defaultVisit(z4, div2View, str, expressionsRuntime);
            return;
        }
        if (z4 instanceof Z.l) {
            defaultVisit(z4, div2View, str, expressionsRuntime);
            return;
        }
        if (z4 instanceof Z.m) {
            defaultVisit(z4, div2View, str, expressionsRuntime);
            return;
        }
        if (z4 instanceof Z.n) {
            defaultVisit(z4, div2View, str, expressionsRuntime);
            return;
        }
        if (z4 instanceof Z.r) {
            defaultVisit(z4, div2View, str, expressionsRuntime);
        } else if (z4 instanceof Z.s) {
            defaultVisit(z4, div2View, str, expressionsRuntime);
        } else if (z4 instanceof Z.p) {
            defaultVisit(z4, div2View, str, expressionsRuntime);
        }
    }

    private void visitChild(Z z4, Div2View div2View, String str, List<String> list, ExpressionsRuntime expressionsRuntime, boolean z5) {
        if (z5) {
            visit(z4, div2View, str, list, expressionsRuntime);
        } else {
            ExpressionsRuntime orCreateRuntime$div_release = expressionsRuntime.getRuntimeStore().getOrCreateRuntime$div_release(str, z4, expressionsRuntime.getExpressionResolver());
            orCreateRuntime$div_release.getRuntimeStore().getTree$div_release().invokeRecursively(orCreateRuntime$div_release, str, new DivRuntimeVisitor$visitChild$1(div2View));
        }
    }

    private void visitContainer(Z z4, Div2View div2View, List<? extends Z> list, H3 h32, String str, List<String> list2, ExpressionsRuntime expressionsRuntime) {
        ExpressionsRuntime defaultVisit = defaultVisit(z4, div2View, str, expressionsRuntime);
        if (h32 != null) {
            visit(h32, div2View, str, list2, defaultVisit);
            return;
        }
        DivRuntimeVisitor divRuntimeVisitor = this;
        if (list != null) {
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Z z5 = (Z) obj;
                divRuntimeVisitor.visit(z5, div2View, appendChild(str, z5, i4), list2, defaultVisit);
                divRuntimeVisitor = this;
                i4 = i5;
            }
        }
    }

    private void visitState(Z.o oVar, Div2View div2View, String str, List<String> list, ExpressionsRuntime expressionsRuntime) {
        visitStates(oVar.c(), div2View, str, list, defaultVisit(oVar, div2View, str, expressionsRuntime));
    }

    private void visitStates(Bc bc, Div2View div2View, String str, List<String> list, ExpressionsRuntime expressionsRuntime) {
        Div2View div2View2;
        List<String> list2;
        ExpressionsRuntime expressionsRuntime2;
        list.add(DivPathUtils.getId$div_release$default(DivPathUtils.INSTANCE, bc, null, 1, null));
        String activeStateId = getActiveStateId(bc, div2View, list, expressionsRuntime.getExpressionResolver());
        for (Bc.c cVar : bc.f1529y) {
            Z z4 = cVar.f1536c;
            if (z4 == null) {
                div2View2 = div2View;
                list2 = list;
                expressionsRuntime2 = expressionsRuntime;
            } else {
                div2View2 = div2View;
                list2 = list;
                expressionsRuntime2 = expressionsRuntime;
                visitChild(z4, div2View2, appendChild(str, cVar.f1537d), list2, expressionsRuntime2, Intrinsics.areEqual(cVar.f1537d, activeStateId));
            }
            div2View = div2View2;
            list = list2;
            expressionsRuntime = expressionsRuntime2;
        }
        CollectionsKt.removeLastOrNull(list);
    }

    private void visitTabs(Z.q qVar, Div2View div2View, String str, List<String> list, ExpressionsRuntime expressionsRuntime) {
        visitTabs(qVar.c(), div2View, str, list, defaultVisit(qVar, div2View, str, expressionsRuntime));
    }

    public void createAndAttachRuntimes(@NotNull Z rootDiv, @NotNull DivStatePath rootPath, @NotNull Div2View divView) {
        ExpressionsRuntime rootRuntime;
        Intrinsics.checkNotNullParameter(rootDiv, "rootDiv");
        Intrinsics.checkNotNullParameter(rootPath, "rootPath");
        Intrinsics.checkNotNullParameter(divView, "divView");
        RuntimeStore runtimeStore$div_release = divView.getRuntimeStore$div_release();
        if (runtimeStore$div_release == null || (rootRuntime = runtimeStore$div_release.getRootRuntime()) == null) {
            return;
        }
        rootRuntime.onAttachedToWindow(divView);
        visit(rootDiv, divView, rootPath.getFullPath$div_release(), getStatesFlat(rootPath), rootRuntime);
    }

    public void createAndAttachRuntimesToState(@NotNull Div2View divView, @NotNull Bc div, @NotNull DivStatePath path, @NotNull ExpressionResolver expressionResolver) {
        ExpressionsRuntime runtimeWithOrNull$div_release;
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        RuntimeStore runtimeStore$div_release = divView.getRuntimeStore$div_release();
        if (runtimeStore$div_release == null || (runtimeWithOrNull$div_release = runtimeStore$div_release.getRuntimeWithOrNull$div_release(expressionResolver)) == null) {
            return;
        }
        visitStates(div, divView, path.getFullPath$div_release(), getStatesFlat(path), runtimeWithOrNull$div_release);
    }

    public void createAndAttachRuntimesToTabs(@NotNull Div2View divView, @NotNull C1013qd div, @NotNull DivStatePath path, @NotNull ExpressionResolver expressionResolver) {
        ExpressionsRuntime runtimeWithOrNull$div_release;
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        RuntimeStore runtimeStore$div_release = divView.getRuntimeStore$div_release();
        if (runtimeStore$div_release == null || (runtimeWithOrNull$div_release = runtimeStore$div_release.getRuntimeWithOrNull$div_release(expressionResolver)) == null) {
            return;
        }
        visitTabs(div, divView, path.getFullPath$div_release(), getStatesFlat(path), runtimeWithOrNull$div_release);
    }

    private String appendChild(String str, String str2) {
        return str + '/' + str2;
    }

    private void visitTabs(C1013qd c1013qd, Div2View div2View, String str, List<String> list, ExpressionsRuntime expressionsRuntime) {
        int i4;
        TabsStateCache tabsStateCache = this.tabsCache;
        String id = div2View.getDataTag().getId();
        Intrinsics.checkNotNullExpressionValue(id, "divView.dataTag.id");
        Integer selectedTab = tabsStateCache.getSelectedTab(id, str);
        if (selectedTab != null) {
            i4 = selectedTab.intValue();
        } else {
            long longValue = ((Number) c1013qd.f7638y.evaluate(expressionsRuntime.getExpressionResolver())).longValue();
            long j4 = longValue >> 31;
            if (j4 == 0 || j4 == -1) {
                i4 = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i4 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        int i5 = i4;
        int i6 = 0;
        for (Object obj : c1013qd.f7630q) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Z z4 = ((C1013qd.c) obj).f7643a;
            visitChild(z4, div2View, appendChild(str, z4, i6), list, expressionsRuntime, i5 == i6);
            i6 = i7;
        }
    }

    private void visit(H3 h32, Div2View div2View, String str, List<String> list, ExpressionsRuntime expressionsRuntime) {
        int i4 = 0;
        for (Object obj : DivCollectionExtensionsKt.build(h32, div2View, expressionsRuntime.getExpressionResolver())) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
            String appendChild = appendChild(str, divItemBuilderResult.getDiv(), i4);
            Div2View div2View2 = div2View;
            ExpressionsRuntime resolveRuntimeWith$div_release = expressionsRuntime.getRuntimeStore().resolveRuntimeWith$div_release(div2View2, appendChild, divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver(), expressionsRuntime.getExpressionResolver());
            List<String> list2 = list;
            visit(divItemBuilderResult.getDiv(), div2View2, appendChild, list2, resolveRuntimeWith$div_release == null ? expressionsRuntime : resolveRuntimeWith$div_release);
            i4 = i5;
            div2View = div2View2;
            list = list2;
        }
    }
}
