package com.yandex.div.core.state;

import O1.Bc;
import O1.C1165z4;
import O1.Z;
import W1.m;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1293g0;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivPathUtils {

    @NotNull
    public static final DivPathUtils INSTANCE = new DivPathUtils();

    private DivPathUtils() {
    }

    private final Z findByPath(Z z4, String str, ExpressionResolver expressionResolver) {
        if (z4 instanceof Z.o) {
            Z.o oVar = (Z.o) z4;
            if (!Intrinsics.areEqual(getId$div_release$default(INSTANCE, oVar.c(), null, 1, null), str)) {
                z4 = null;
            }
            Z.o oVar2 = (Z.o) z4;
            return oVar2 != null ? oVar2 : findRecursively(oVar.c().f1529y, str, expressionResolver, DivPathUtils$findByPath$2.INSTANCE);
        }
        if (z4 instanceof Z.q) {
            return findRecursively(((Z.q) z4).c().f7630q, str, expressionResolver, DivPathUtils$findByPath$3.INSTANCE);
        }
        if (z4 instanceof Z.c) {
            return findRecursively(DivCollectionExtensionsKt.buildItems(((Z.c) z4).c(), (DivViewFacade) null, expressionResolver), str);
        }
        if (z4 instanceof Z.g) {
            return findRecursively$default(this, DivCollectionExtensionsKt.getNonNullItems(((Z.g) z4).c()), str, expressionResolver, null, 4, null);
        }
        if (z4 instanceof Z.e) {
            return findRecursively(DivCollectionExtensionsKt.buildItems(((Z.e) z4).c(), (DivViewFacade) null, expressionResolver), str);
        }
        if (z4 instanceof Z.k) {
            return findRecursively(DivCollectionExtensionsKt.buildItems(((Z.k) z4).c(), (DivViewFacade) null, expressionResolver), str);
        }
        if (z4 instanceof Z.d) {
            List list = ((Z.d) z4).c().f7841q;
            if (list != null) {
                return findRecursively$default(this, list, str, expressionResolver, null, 4, null);
            }
            return null;
        }
        if ((z4 instanceof Z.r) || (z4 instanceof Z.h) || (z4 instanceof Z.n) || (z4 instanceof Z.j) || (z4 instanceof Z.f) || (z4 instanceof Z.i) || (z4 instanceof Z.m) || (z4 instanceof Z.l) || (z4 instanceof Z.s) || (z4 instanceof Z.p)) {
            return null;
        }
        throw new m();
    }

    private final <T> Z findRecursively(Iterable<? extends T> iterable, String str, ExpressionResolver expressionResolver, Function1<? super T, ? extends Z> function1) {
        Z z4;
        Iterator<? extends T> it = iterable.iterator();
        do {
            z4 = null;
            if (!it.hasNext()) {
                break;
            }
            Z z5 = (Z) function1.invoke(it.next());
            if (z5 != null) {
                z4 = INSTANCE.findByPath(z5, str, expressionResolver);
            }
        } while (z4 == null);
        return z4;
    }

    static /* synthetic */ Z findRecursively$default(DivPathUtils divPathUtils, Iterable iterable, String str, ExpressionResolver expressionResolver, Function1 function1, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            function1 = DivPathUtils$findRecursively$1.INSTANCE;
        }
        return divPathUtils.findRecursively(iterable, str, expressionResolver, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String getId$div_release$default(DivPathUtils divPathUtils, Bc bc, Function0 function0, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            function0 = null;
        }
        return divPathUtils.getId$div_release(bc, function0);
    }

    @NotNull
    public final List<DivStatePath> compactPathList$div_release(@NotNull List<DivStatePath> paths) {
        List list;
        Intrinsics.checkNotNullParameter(paths, "paths");
        if (paths.isEmpty()) {
            return paths;
        }
        List sortedWith = CollectionsKt.sortedWith(paths, DivStatePath.Companion.alphabeticalComparator$div_release());
        List<DivStatePath> list2 = sortedWith;
        Object first = CollectionsKt.first((List<? extends Object>) sortedWith);
        int collectionSizeOrDefault = CollectionsKt.collectionSizeOrDefault(list2, 9);
        if (collectionSizeOrDefault == 0) {
            list = CollectionsKt.listOf(first);
        } else {
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault + 1);
            arrayList.add(first);
            Object obj = first;
            for (DivStatePath divStatePath : list2) {
                DivStatePath divStatePath2 = (DivStatePath) obj;
                if (!divStatePath2.isAncestorOf(divStatePath)) {
                    divStatePath2 = divStatePath;
                }
                arrayList.add(divStatePath2);
                obj = divStatePath2;
            }
            list = arrayList;
        }
        return CollectionsKt.distinct(list);
    }

    @Nullable
    public final Z findDivState$div_release(@NotNull Z z4, @NotNull DivStatePath path, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(z4, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        List<Pair<String, String>> states = path.getStates();
        if (states.isEmpty()) {
            return null;
        }
        Iterator<T> it = states.iterator();
        while (it.hasNext()) {
            String str = (String) ((Pair) it.next()).component1();
            if (z4 == null || (z4 = INSTANCE.findByPath(z4, str, resolver)) == null) {
                return null;
            }
        }
        return z4;
    }

    @Nullable
    public final DivStateLayout findStateLayout$div_release(@NotNull View view, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof DivStateLayout) {
            DivStateLayout divStateLayout = (DivStateLayout) view;
            DivStatePath path2 = divStateLayout.getPath();
            if (Intrinsics.areEqual(path2 != null ? path2.getPathToLastState() : null, path.getPathToLastState())) {
                return divStateLayout;
            }
        }
        Iterator it = AbstractC1293g0.b((ViewGroup) view).iterator();
        DivStateLayout divStateLayout2 = null;
        while (it.hasNext()) {
            DivStateLayout findStateLayout$div_release = findStateLayout$div_release((View) it.next(), path);
            if (findStateLayout$div_release != null) {
                if (Intrinsics.areEqual(String.valueOf(divStateLayout2 != null ? divStateLayout2.getPath() : null), String.valueOf(findStateLayout$div_release.getPath()))) {
                    throw new StateConflictException("Error resolving state for '" + path + "'. Found multiple elements that respond to path '" + findStateLayout$div_release.getPath() + "'!", null, 2, null);
                }
                divStateLayout2 = findStateLayout$div_release;
            }
        }
        return divStateLayout2;
    }

    @NotNull
    public final String getId$div_release(@NotNull Bc bc, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(bc, "<this>");
        String str = bc.f1516l;
        if (str != null) {
            return str;
        }
        String id = bc.getId();
        if (id != null) {
            return id;
        }
        if (function0 != null) {
            function0.invoke();
        }
        return "";
    }

    @Nullable
    public final Pair<DivStateLayout, Z.o> tryFindStateDivAndLayout$div_release(@NotNull View view, @NotNull C1165z4.c state, @NotNull DivStatePath path, @NotNull ExpressionResolver resolver) {
        Z.o oVar;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        DivStateLayout findStateLayout$div_release = findStateLayout$div_release(view, path);
        if (findStateLayout$div_release == null) {
            DivStatePath parentState = path.parentState();
            if ((parentState.isRootPath() && state.f8722b == path.getTopLevelStateId()) || findStateLayout$div_release(view, parentState) == null) {
                return null;
            }
        }
        if (findStateLayout$div_release == null || (oVar = findStateLayout$div_release.getDiv()) == null) {
            Z findDivState$div_release = findDivState$div_release(state.f8721a, path, resolver);
            oVar = findDivState$div_release instanceof Z.o ? (Z.o) findDivState$div_release : null;
            if (oVar == null) {
                return null;
            }
        }
        return new Pair<>(findStateLayout$div_release, oVar);
    }

    private final Z findRecursively(Iterable<DivItemBuilderResult> iterable, String str) {
        for (DivItemBuilderResult divItemBuilderResult : iterable) {
            Z findByPath = INSTANCE.findByPath(divItemBuilderResult.component1(), str, divItemBuilderResult.component2());
            if (findByPath != null) {
                return findByPath;
            }
        }
        return null;
    }
}
