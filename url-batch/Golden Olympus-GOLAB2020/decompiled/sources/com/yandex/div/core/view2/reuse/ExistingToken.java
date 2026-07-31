package com.yandex.div.core.view2.reuse;

import O1.C0970o6;
import O1.C1039s4;
import O1.E9;
import O1.G6;
import O1.R3;
import O1.Z;
import W1.m;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter;
import com.yandex.div.core.view2.divs.pager.DivPagerAdapter;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.reuse.RebindTask;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC3213c;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ExistingToken extends Token {

    @Nullable
    private final ExistingToken parentToken;

    @NotNull
    private final View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExistingToken(@NotNull DivItemBuilderResult item, int i4, @NotNull View view, @Nullable ExistingToken existingToken) {
        super(item, i4);
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.parentToken = existingToken;
    }

    public static /* synthetic */ List getChildrenTokens$default(ExistingToken existingToken, ExistingToken existingToken2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            existingToken2 = null;
        }
        return existingToken.getChildrenTokens(existingToken2);
    }

    private final List<ExistingToken> itemsToExistingTokenList(R3 r32, ExpressionResolver expressionResolver, ExistingToken existingToken) {
        return simpleItemsToExistingTokenList(DivCollectionExtensionsKt.buildItems(r32, (DivViewFacade) null, expressionResolver), existingToken);
    }

    private final List<ExistingToken> simpleItemsToExistingTokenList(List<DivItemBuilderResult> list, ExistingToken existingToken) {
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (Object obj : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
            View view = this.view;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            View childAt = viewGroup != null ? viewGroup.getChildAt(i4) : null;
            if (childAt == null) {
                return CollectionsKt.emptyList();
            }
            Intrinsics.checkNotNullExpressionValue(childAt, "(view as? ViewGroup)?.ge…ex) ?: return emptyList()");
            arrayList.add(new ExistingToken(divItemBuilderResult, i4, childAt, existingToken == null ? this : existingToken));
            i4 = i5;
        }
        return arrayList;
    }

    private final List<ExistingToken> stateToExistingTokenList(ExpressionResolver expressionResolver, ExistingToken existingToken) {
        Z activeStateDiv$div_release;
        View view = this.view;
        DivStateLayout divStateLayout = view instanceof DivStateLayout ? (DivStateLayout) view : null;
        return (divStateLayout == null || (activeStateDiv$div_release = divStateLayout.getActiveStateDiv$div_release()) == null) ? CollectionsKt.emptyList() : simpleItemsToExistingTokenList(DivCollectionExtensionsKt.toDivItemBuilderResult(CollectionsKt.listOf(activeStateDiv$div_release), expressionResolver), existingToken);
    }

    @NotNull
    public final List<ExistingToken> getChildrenTokens(@Nullable ExistingToken existingToken) {
        Z div = getDiv();
        if (div instanceof Z.r) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof Z.h) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof Z.f) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof Z.m) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof Z.i) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof Z.n) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof Z.j) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof Z.l) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof Z.s) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof Z.p) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof Z.c) {
            return itemsToExistingTokenList(((Z.c) getDiv()).c(), getItem().getExpressionResolver(), existingToken);
        }
        if (div instanceof Z.d) {
            return itemsToExistingTokenList(((Z.d) getDiv()).c(), getItem().getExpressionResolver(), existingToken);
        }
        if (div instanceof Z.g) {
            return itemsToExistingTokenList(((Z.g) getDiv()).c(), getItem().getExpressionResolver(), existingToken);
        }
        if (div instanceof Z.e) {
            return itemsToExistingTokenList(((Z.e) getDiv()).c(), getItem().getExpressionResolver(), existingToken);
        }
        if (div instanceof Z.k) {
            return itemsToExistingTokenList(((Z.k) getDiv()).c(), getItem().getExpressionResolver(), existingToken);
        }
        if (div instanceof Z.q) {
            throw new RebindTask.UnsupportedElementException(getDiv().getClass());
        }
        if (div instanceof Z.o) {
            return stateToExistingTokenList(getItem().getExpressionResolver(), existingToken);
        }
        throw new m();
    }

    @Nullable
    public final ExistingToken getParentToken() {
        return this.parentToken;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    private final List<ExistingToken> itemsToExistingTokenList(C1039s4 c1039s4, ExpressionResolver expressionResolver, ExistingToken existingToken) {
        ArrayList arrayList = new ArrayList();
        View view = this.view;
        DivCustomWrapper divCustomWrapper = view instanceof DivCustomWrapper ? (DivCustomWrapper) view : null;
        KeyEvent.Callback customView = divCustomWrapper != null ? divCustomWrapper.getCustomView() : null;
        ViewGroup viewGroup = customView instanceof ViewGroup ? (ViewGroup) customView : null;
        if (viewGroup == null) {
            return CollectionsKt.emptyList();
        }
        int i4 = 0;
        for (Object obj : DivCollectionExtensionsKt.getNonNullItems(c1039s4)) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DivItemBuilderResult itemBuilderResult = DivCollectionExtensionsKt.toItemBuilderResult((Z) obj, expressionResolver);
            View childAt = viewGroup.getChildAt(i4);
            if (childAt == null) {
                return CollectionsKt.emptyList();
            }
            Intrinsics.checkNotNullExpressionValue(childAt, "customView.getChildAt(index) ?: return emptyList()");
            arrayList.add(new ExistingToken(itemBuilderResult, i4, childAt, existingToken == null ? this : existingToken));
            i4 = i5;
        }
        return arrayList;
    }

    private final List<ExistingToken> itemsToExistingTokenList(G6 g6, ExpressionResolver expressionResolver, ExistingToken existingToken) {
        return simpleItemsToExistingTokenList(DivCollectionExtensionsKt.itemsToDivItemBuilderResult(g6, expressionResolver), existingToken);
    }

    private final List<ExistingToken> itemsToExistingTokenList(E9 e9, ExpressionResolver expressionResolver, ExistingToken existingToken) {
        ViewPager2 viewPager;
        ArrayList arrayList = new ArrayList();
        View view = this.view;
        DivPagerView divPagerView = view instanceof DivPagerView ? (DivPagerView) view : null;
        if (divPagerView != null && (viewPager = divPagerView.getViewPager()) != null) {
            RecyclerView.h adapter = viewPager.getAdapter();
            DivPagerAdapter divPagerAdapter = adapter instanceof DivPagerAdapter ? (DivPagerAdapter) adapter : null;
            if (divPagerAdapter == null) {
                return CollectionsKt.emptyList();
            }
            AbstractC3213c itemsToShow = divPagerAdapter.getItemsToShow();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(itemsToShow, 10));
            Iterator<E> it = itemsToShow.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((DivItemBuilderResult) it.next()).getDiv().hash()));
            }
            int i4 = 0;
            for (Object obj : DivCollectionExtensionsKt.buildItems(e9, (DivViewFacade) null, expressionResolver)) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
                if (arrayList2.contains(Integer.valueOf(divItemBuilderResult.getDiv().hash()))) {
                    View pageView = ((DivPagerView) this.view).getPageView(arrayList2.indexOf(Integer.valueOf(divItemBuilderResult.getDiv().hash())));
                    if (pageView != null) {
                        arrayList.add(new ExistingToken(divItemBuilderResult, i4, pageView, existingToken == null ? this : existingToken));
                    }
                }
                i4 = i5;
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    private final List<ExistingToken> itemsToExistingTokenList(C0970o6 c0970o6, ExpressionResolver expressionResolver, ExistingToken existingToken) {
        View itemView;
        ArrayList arrayList = new ArrayList();
        View view = this.view;
        DivRecyclerView divRecyclerView = view instanceof DivRecyclerView ? (DivRecyclerView) view : null;
        RecyclerView.h adapter = divRecyclerView != null ? divRecyclerView.getAdapter() : null;
        DivGalleryAdapter divGalleryAdapter = adapter instanceof DivGalleryAdapter ? (DivGalleryAdapter) adapter : null;
        if (divGalleryAdapter == null) {
            return CollectionsKt.emptyList();
        }
        List<DivItemBuilderResult> visibleItems = divGalleryAdapter.getVisibleItems();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(visibleItems, 10));
        Iterator<T> it = visibleItems.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((DivItemBuilderResult) it.next()).getDiv().hash()));
        }
        int i4 = 0;
        for (Object obj : DivCollectionExtensionsKt.buildItems(c0970o6, (DivViewFacade) null, expressionResolver)) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
            if (arrayList2.contains(Integer.valueOf(divItemBuilderResult.getDiv().hash())) && (itemView = ((DivRecyclerView) this.view).getItemView(i4)) != null) {
                arrayList.add(new ExistingToken(divItemBuilderResult, i4, itemView, existingToken == null ? this : existingToken));
            }
            i4 = i5;
        }
        return arrayList;
    }
}
