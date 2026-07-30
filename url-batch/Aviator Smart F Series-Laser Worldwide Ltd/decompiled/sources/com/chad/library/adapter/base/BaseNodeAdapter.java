package com.chad.library.adapter.base;

import androidx.annotation.IntRange;
import androidx.recyclerview.widget.DiffUtil;
import com.chad.library.adapter.base.entity.node.BaseExpandNode;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.chad.library.adapter.base.entity.node.NodeFooterImp;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.provider.BaseNodeProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public abstract class BaseNodeAdapter extends BaseProviderMultiAdapter<BaseNode> {
    private final HashSet<Integer> fullSpanNodeTypeSet;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseNodeAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    static /* synthetic */ int collapse$default(BaseNodeAdapter baseNodeAdapter, int i8, boolean z7, boolean z8, boolean z9, Object obj, int i9, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collapse");
        }
        boolean z10 = (i9 & 2) != 0 ? false : z7;
        boolean z11 = (i9 & 4) != 0 ? true : z8;
        boolean z12 = (i9 & 8) != 0 ? true : z9;
        if ((i9 & 16) != 0) {
            obj = null;
        }
        return baseNodeAdapter.collapse(i8, z10, z11, z12, obj);
    }

    public static /* synthetic */ int collapseAndChild$default(BaseNodeAdapter baseNodeAdapter, int i8, boolean z7, boolean z8, Object obj, int i9, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collapseAndChild");
        }
        if ((i9 & 2) != 0) {
            z7 = true;
        }
        if ((i9 & 4) != 0) {
            z8 = true;
        }
        if ((i9 & 8) != 0) {
            obj = null;
        }
        return baseNodeAdapter.collapseAndChild(i8, z7, z8, obj);
    }

    static /* synthetic */ int expand$default(BaseNodeAdapter baseNodeAdapter, int i8, boolean z7, boolean z8, boolean z9, Object obj, int i9, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: expand");
        }
        boolean z10 = (i9 & 2) != 0 ? false : z7;
        boolean z11 = (i9 & 4) != 0 ? true : z8;
        boolean z12 = (i9 & 8) != 0 ? true : z9;
        if ((i9 & 16) != 0) {
            obj = null;
        }
        return baseNodeAdapter.expand(i8, z10, z11, z12, obj);
    }

    public static /* synthetic */ int expandAndChild$default(BaseNodeAdapter baseNodeAdapter, int i8, boolean z7, boolean z8, Object obj, int i9, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: expandAndChild");
        }
        if ((i9 & 2) != 0) {
            z7 = true;
        }
        if ((i9 & 4) != 0) {
            z8 = true;
        }
        if ((i9 & 8) != 0) {
            obj = null;
        }
        return baseNodeAdapter.expandAndChild(i8, z7, z8, obj);
    }

    public static /* synthetic */ void expandAndCollapseOther$default(BaseNodeAdapter baseNodeAdapter, int i8, boolean z7, boolean z8, boolean z9, boolean z10, Object obj, Object obj2, int i9, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: expandAndCollapseOther");
        }
        baseNodeAdapter.expandAndCollapseOther(i8, (i9 & 2) != 0 ? false : z7, (i9 & 4) != 0 ? true : z8, (i9 & 8) != 0 ? true : z9, (i9 & 16) == 0 ? z10 : true, (i9 & 32) != 0 ? null : obj, (i9 & 64) == 0 ? obj2 : null);
    }

    public static /* synthetic */ int expandOrCollapse$default(BaseNodeAdapter baseNodeAdapter, int i8, boolean z7, boolean z8, Object obj, int i9, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: expandOrCollapse");
        }
        if ((i9 & 2) != 0) {
            z7 = true;
        }
        if ((i9 & 4) != 0) {
            z8 = true;
        }
        if ((i9 & 8) != 0) {
            obj = null;
        }
        return baseNodeAdapter.expandOrCollapse(i8, z7, z8, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<BaseNode> flatData(Collection<? extends BaseNode> collection, Boolean bool) {
        BaseNode footerNode;
        List<BaseNode> childNode;
        ArrayList arrayList = new ArrayList();
        for (BaseNode baseNode : collection) {
            arrayList.add(baseNode);
            if (baseNode instanceof BaseExpandNode) {
                if ((s.areEqual(bool, Boolean.TRUE) || ((BaseExpandNode) baseNode).isExpanded()) && (childNode = baseNode.getChildNode()) != null && !childNode.isEmpty()) {
                    arrayList.addAll(flatData(childNode, bool));
                }
                if (bool != null) {
                    ((BaseExpandNode) baseNode).setExpanded(bool.booleanValue());
                }
            } else {
                List<BaseNode> childNode2 = baseNode.getChildNode();
                if (childNode2 != null && !childNode2.isEmpty()) {
                    arrayList.addAll(flatData(childNode2, bool));
                }
            }
            if ((baseNode instanceof NodeFooterImp) && (footerNode = ((NodeFooterImp) baseNode).getFooterNode()) != null) {
                arrayList.add(footerNode);
            }
        }
        return arrayList;
    }

    static /* synthetic */ List flatData$default(BaseNodeAdapter baseNodeAdapter, Collection collection, Boolean bool, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: flatData");
        }
        if ((i8 & 2) != 0) {
            bool = null;
        }
        return baseNodeAdapter.flatData(collection, bool);
    }

    private final int removeChildAt(int i8) {
        BaseNode baseNode;
        List<BaseNode> childNode;
        if (i8 >= getData().size() || (childNode = (baseNode = getData().get(i8)).getChildNode()) == null || childNode.isEmpty()) {
            return 0;
        }
        if (!(baseNode instanceof BaseExpandNode)) {
            List<BaseNode> childNode2 = baseNode.getChildNode();
            s.checkNotNull(childNode2);
            List flatData$default = flatData$default(this, childNode2, null, 2, null);
            getData().removeAll(flatData$default);
            return flatData$default.size();
        }
        if (!((BaseExpandNode) baseNode).isExpanded()) {
            return 0;
        }
        List<BaseNode> childNode3 = baseNode.getChildNode();
        s.checkNotNull(childNode3);
        List flatData$default2 = flatData$default(this, childNode3, null, 2, null);
        getData().removeAll(flatData$default2);
        return flatData$default2.size();
    }

    private final int removeNodesAt(int i8) {
        if (i8 >= getData().size()) {
            return 0;
        }
        int removeChildAt = removeChildAt(i8);
        getData().remove(i8);
        int i9 = removeChildAt + 1;
        Object obj = (BaseNode) getData().get(i8);
        if (!(obj instanceof NodeFooterImp) || ((NodeFooterImp) obj).getFooterNode() == null) {
            return i9;
        }
        getData().remove(i8);
        return removeChildAt + 2;
    }

    public final void addFooterNodeProvider(BaseNodeProvider provider) {
        s.checkNotNullParameter(provider, "provider");
        addFullSpanNodeProvider(provider);
    }

    public final void addFullSpanNodeProvider(BaseNodeProvider provider) {
        s.checkNotNullParameter(provider, "provider");
        this.fullSpanNodeTypeSet.add(Integer.valueOf(provider.getItemViewType()));
        addItemProvider(provider);
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    public void addItemProvider(BaseItemProvider<BaseNode> provider) {
        s.checkNotNullParameter(provider, "provider");
        if (!(provider instanceof BaseNodeProvider)) {
            throw new IllegalStateException("Please add BaseNodeProvider, no BaseItemProvider!");
        }
        super.addItemProvider(provider);
    }

    public final void addNodeProvider(BaseNodeProvider provider) {
        s.checkNotNullParameter(provider, "provider");
        addItemProvider(provider);
    }

    public final int collapse(@IntRange(from = 0) int i8) {
        return collapse$default(this, i8, false, false, null, 14, null);
    }

    public final int collapseAndChild(@IntRange(from = 0) int i8) {
        return collapseAndChild$default(this, i8, false, false, null, 14, null);
    }

    public final int expand(@IntRange(from = 0) int i8) {
        return expand$default(this, i8, false, false, null, 14, null);
    }

    public final int expandAndChild(@IntRange(from = 0) int i8) {
        return expandAndChild$default(this, i8, false, false, null, 14, null);
    }

    public final void expandAndCollapseOther(@IntRange(from = 0) int i8) {
        expandAndCollapseOther$default(this, i8, false, false, false, false, null, null, 126, null);
    }

    public final int expandOrCollapse(@IntRange(from = 0) int i8) {
        return expandOrCollapse$default(this, i8, false, false, null, 14, null);
    }

    public final int findParentNode(BaseNode node) {
        s.checkNotNullParameter(node, "node");
        int indexOf = getData().indexOf(node);
        if (indexOf != -1 && indexOf != 0) {
            for (int i8 = indexOf - 1; -1 < i8; i8--) {
                List<BaseNode> childNode = getData().get(i8).getChildNode();
                if (childNode != null && childNode.contains(node)) {
                    return i8;
                }
            }
        }
        return -1;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected boolean isFixedViewType(int i8) {
        return super.isFixedViewType(i8) || this.fullSpanNodeTypeSet.contains(Integer.valueOf(i8));
    }

    public final void nodeAddData(BaseNode parentNode, BaseNode data) {
        s.checkNotNullParameter(parentNode, "parentNode");
        s.checkNotNullParameter(data, "data");
        List<BaseNode> childNode = parentNode.getChildNode();
        if (childNode != null) {
            childNode.add(data);
            if (!(parentNode instanceof BaseExpandNode) || ((BaseExpandNode) parentNode).isExpanded()) {
                addData(getData().indexOf(parentNode) + childNode.size(), data);
            }
        }
    }

    public final void nodeRemoveData(BaseNode parentNode, int i8) {
        s.checkNotNullParameter(parentNode, "parentNode");
        List<BaseNode> childNode = parentNode.getChildNode();
        if (childNode == null || i8 >= childNode.size()) {
            return;
        }
        if ((parentNode instanceof BaseExpandNode) && !((BaseExpandNode) parentNode).isExpanded()) {
            childNode.remove(i8);
        } else {
            remove(getData().indexOf(parentNode) + 1 + i8);
            childNode.remove(i8);
        }
    }

    public final void nodeReplaceChildData(BaseNode parentNode, Collection<? extends BaseNode> newData) {
        s.checkNotNullParameter(parentNode, "parentNode");
        s.checkNotNullParameter(newData, "newData");
        List<BaseNode> childNode = parentNode.getChildNode();
        if (childNode != null) {
            if ((parentNode instanceof BaseExpandNode) && !((BaseExpandNode) parentNode).isExpanded()) {
                childNode.clear();
                childNode.addAll(newData);
                return;
            }
            int indexOf = getData().indexOf(parentNode);
            int removeChildAt = removeChildAt(indexOf);
            childNode.clear();
            childNode.addAll(newData);
            List flatData$default = flatData$default(this, newData, null, 2, null);
            int i8 = indexOf + 1;
            getData().addAll(i8, flatData$default);
            int headerLayoutCount = i8 + getHeaderLayoutCount();
            if (removeChildAt == flatData$default.size()) {
                notifyItemRangeChanged(headerLayoutCount, removeChildAt);
            } else {
                notifyItemRangeRemoved(headerLayoutCount, removeChildAt);
                notifyItemRangeInserted(headerLayoutCount, flatData$default.size());
            }
        }
    }

    public final void nodeSetData(BaseNode parentNode, int i8, BaseNode data) {
        s.checkNotNullParameter(parentNode, "parentNode");
        s.checkNotNullParameter(data, "data");
        List<BaseNode> childNode = parentNode.getChildNode();
        if (childNode == null || i8 >= childNode.size()) {
            return;
        }
        if ((parentNode instanceof BaseExpandNode) && !((BaseExpandNode) parentNode).isExpanded()) {
            childNode.set(i8, data);
        } else {
            setData(getData().indexOf(parentNode) + 1 + i8, data);
            childNode.set(i8, data);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void removeAt(int i8) {
        notifyItemRangeRemoved(i8 + getHeaderLayoutCount(), removeNodesAt(i8));
        compatibilityDataSizeChanged(0);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setDiffNewData(List<BaseNode> list, Runnable runnable) {
        if (hasEmptyView()) {
            setNewInstance(list);
        } else {
            super.setDiffNewData(flatData$default(this, list != null ? list : new ArrayList(), null, 2, null), runnable);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setList(Collection<? extends BaseNode> collection) {
        if (collection == null) {
            collection = new ArrayList<>();
        }
        super.setList(flatData$default(this, collection, null, 2, null));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setNewInstance(List<BaseNode> list) {
        super.setNewInstance(flatData$default(this, list != null ? list : new ArrayList(), null, 2, null));
    }

    public /* synthetic */ BaseNodeAdapter(List list, int i8, o oVar) {
        this((i8 & 1) != 0 ? null : list);
    }

    public static /* synthetic */ int collapse$default(BaseNodeAdapter baseNodeAdapter, int i8, boolean z7, boolean z8, Object obj, int i9, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collapse");
        }
        if ((i9 & 2) != 0) {
            z7 = true;
        }
        if ((i9 & 4) != 0) {
            z8 = true;
        }
        if ((i9 & 8) != 0) {
            obj = null;
        }
        return baseNodeAdapter.collapse(i8, z7, z8, obj);
    }

    public static /* synthetic */ int expand$default(BaseNodeAdapter baseNodeAdapter, int i8, boolean z7, boolean z8, Object obj, int i9, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: expand");
        }
        if ((i9 & 2) != 0) {
            z7 = true;
        }
        if ((i9 & 4) != 0) {
            z8 = true;
        }
        if ((i9 & 8) != 0) {
            obj = null;
        }
        return baseNodeAdapter.expand(i8, z7, z8, obj);
    }

    public final int collapse(@IntRange(from = 0) int i8, boolean z7) {
        return collapse$default(this, i8, z7, false, null, 12, null);
    }

    public final int collapseAndChild(@IntRange(from = 0) int i8, boolean z7) {
        return collapseAndChild$default(this, i8, z7, false, null, 12, null);
    }

    public final int expand(@IntRange(from = 0) int i8, boolean z7) {
        return expand$default(this, i8, z7, false, null, 12, null);
    }

    public final int expandAndChild(@IntRange(from = 0) int i8, boolean z7) {
        return expandAndChild$default(this, i8, z7, false, null, 12, null);
    }

    public final void expandAndCollapseOther(@IntRange(from = 0) int i8, boolean z7) {
        expandAndCollapseOther$default(this, i8, z7, false, false, false, null, null, 124, null);
    }

    public final int expandOrCollapse(@IntRange(from = 0) int i8, boolean z7) {
        return expandOrCollapse$default(this, i8, z7, false, null, 12, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setData(int i8, BaseNode data) {
        ArrayList arrayListOf;
        s.checkNotNullParameter(data, "data");
        int removeNodesAt = removeNodesAt(i8);
        arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(data);
        List flatData$default = flatData$default(this, arrayListOf, null, 2, null);
        getData().addAll(i8, flatData$default);
        if (removeNodesAt == flatData$default.size()) {
            notifyItemRangeChanged(i8 + getHeaderLayoutCount(), removeNodesAt);
        } else {
            notifyItemRangeRemoved(getHeaderLayoutCount() + i8, removeNodesAt);
            notifyItemRangeInserted(i8 + getHeaderLayoutCount(), flatData$default.size());
        }
    }

    public BaseNodeAdapter(List<BaseNode> list) {
        super(null);
        this.fullSpanNodeTypeSet = new HashSet<>();
        List<BaseNode> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        getData().addAll(flatData$default(this, list2, null, 2, null));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addData(int i8, BaseNode data) {
        ArrayList arrayListOf;
        s.checkNotNullParameter(data, "data");
        arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(data);
        addData(i8, (Collection<? extends BaseNode>) arrayListOf);
    }

    public final int collapse(@IntRange(from = 0) int i8, boolean z7, boolean z8) {
        return collapse$default(this, i8, z7, z8, null, 8, null);
    }

    public final int collapseAndChild(@IntRange(from = 0) int i8, boolean z7, boolean z8) {
        return collapseAndChild$default(this, i8, z7, z8, null, 8, null);
    }

    public final int expand(@IntRange(from = 0) int i8, boolean z7, boolean z8) {
        return expand$default(this, i8, z7, z8, null, 8, null);
    }

    public final int expandAndChild(@IntRange(from = 0) int i8, boolean z7, boolean z8) {
        return expandAndChild$default(this, i8, z7, z8, null, 8, null);
    }

    public final void expandAndCollapseOther(@IntRange(from = 0) int i8, boolean z7, boolean z8) {
        expandAndCollapseOther$default(this, i8, z7, z8, false, false, null, null, 120, null);
    }

    public final int expandOrCollapse(@IntRange(from = 0) int i8, boolean z7, boolean z8) {
        return expandOrCollapse$default(this, i8, z7, z8, null, 8, null);
    }

    private final int collapse(@IntRange(from = 0) int i8, boolean z7, boolean z8, boolean z9, Object obj) {
        BaseNode baseNode = getData().get(i8);
        if (baseNode instanceof BaseExpandNode) {
            BaseExpandNode baseExpandNode = (BaseExpandNode) baseNode;
            if (baseExpandNode.isExpanded()) {
                int headerLayoutCount = i8 + getHeaderLayoutCount();
                baseExpandNode.setExpanded(false);
                List<BaseNode> childNode = baseNode.getChildNode();
                if (childNode != null && !childNode.isEmpty()) {
                    List<BaseNode> childNode2 = baseNode.getChildNode();
                    s.checkNotNull(childNode2);
                    List<BaseNode> flatData = flatData(childNode2, z7 ? Boolean.FALSE : null);
                    int size = flatData.size();
                    getData().removeAll(flatData);
                    if (z9) {
                        if (z8) {
                            notifyItemChanged(headerLayoutCount, obj);
                            notifyItemRangeRemoved(headerLayoutCount + 1, size);
                        } else {
                            notifyDataSetChanged();
                        }
                    }
                    return size;
                }
                notifyItemChanged(headerLayoutCount, obj);
            }
        }
        return 0;
    }

    private final int expand(@IntRange(from = 0) int i8, boolean z7, boolean z8, boolean z9, Object obj) {
        BaseNode baseNode = getData().get(i8);
        if (baseNode instanceof BaseExpandNode) {
            BaseExpandNode baseExpandNode = (BaseExpandNode) baseNode;
            if (!baseExpandNode.isExpanded()) {
                int headerLayoutCount = getHeaderLayoutCount() + i8;
                baseExpandNode.setExpanded(true);
                List<BaseNode> childNode = baseNode.getChildNode();
                if (childNode != null && !childNode.isEmpty()) {
                    List<BaseNode> childNode2 = baseNode.getChildNode();
                    s.checkNotNull(childNode2);
                    List<BaseNode> flatData = flatData(childNode2, z7 ? Boolean.TRUE : null);
                    int size = flatData.size();
                    getData().addAll(i8 + 1, flatData);
                    if (z9) {
                        if (z8) {
                            notifyItemChanged(headerLayoutCount, obj);
                            notifyItemRangeInserted(headerLayoutCount + 1, size);
                        } else {
                            notifyDataSetChanged();
                        }
                    }
                    return size;
                }
                notifyItemChanged(headerLayoutCount, obj);
            }
        }
        return 0;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addData(BaseNode data) {
        ArrayList arrayListOf;
        s.checkNotNullParameter(data, "data");
        arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(data);
        addData((Collection<? extends BaseNode>) arrayListOf);
    }

    public final int collapseAndChild(@IntRange(from = 0) int i8, boolean z7, boolean z8, Object obj) {
        return collapse(i8, true, z7, z8, obj);
    }

    public final int expandAndChild(@IntRange(from = 0) int i8, boolean z7, boolean z8, Object obj) {
        return expand(i8, true, z7, z8, obj);
    }

    public final void expandAndCollapseOther(@IntRange(from = 0) int i8, boolean z7, boolean z8, boolean z9) {
        expandAndCollapseOther$default(this, i8, z7, z8, z9, false, null, null, 112, null);
    }

    public final int expandOrCollapse(@IntRange(from = 0) int i8, boolean z7, boolean z8, Object obj) {
        BaseNode baseNode = getData().get(i8);
        if (!(baseNode instanceof BaseExpandNode)) {
            return 0;
        }
        if (((BaseExpandNode) baseNode).isExpanded()) {
            return collapse(i8, false, z7, z8, obj);
        }
        return expand(i8, false, z7, z8, obj);
    }

    public final int findParentNode(@IntRange(from = 0) int i8) {
        if (i8 == 0) {
            return -1;
        }
        BaseNode baseNode = getData().get(i8);
        for (int i9 = i8 - 1; -1 < i9; i9--) {
            List<BaseNode> childNode = getData().get(i9).getChildNode();
            if (childNode != null && childNode.contains(baseNode)) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setDiffNewData(DiffUtil.DiffResult diffResult, List<BaseNode> list) {
        s.checkNotNullParameter(diffResult, "diffResult");
        s.checkNotNullParameter(list, "list");
        if (hasEmptyView()) {
            setNewInstance(list);
        } else {
            super.setDiffNewData(diffResult, flatData$default(this, list, null, 2, null));
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addData(int i8, Collection<? extends BaseNode> newData) {
        s.checkNotNullParameter(newData, "newData");
        super.addData(i8, (Collection) flatData$default(this, newData, null, 2, null));
    }

    public final void expandAndCollapseOther(@IntRange(from = 0) int i8, boolean z7, boolean z8, boolean z9, boolean z10) {
        expandAndCollapseOther$default(this, i8, z7, z8, z9, z10, null, null, 96, null);
    }

    public final void expandAndCollapseOther(@IntRange(from = 0) int i8, boolean z7, boolean z8, boolean z9, boolean z10, Object obj) {
        expandAndCollapseOther$default(this, i8, z7, z8, z9, z10, obj, null, 64, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addData(Collection<? extends BaseNode> newData) {
        s.checkNotNullParameter(newData, "newData");
        super.addData((Collection) flatData$default(this, newData, null, 2, null));
    }

    public final void expandAndCollapseOther(@IntRange(from = 0) int i8, boolean z7, boolean z8, boolean z9, boolean z10, Object obj, Object obj2) {
        int i9;
        int size;
        int expand = expand(i8, z7, z9, z10, obj);
        if (expand == 0) {
            return;
        }
        int findParentNode = findParentNode(i8);
        int i10 = findParentNode == -1 ? 0 : findParentNode + 1;
        if (i8 - i10 > 0) {
            int i11 = i10;
            i9 = i8;
            do {
                int collapse = collapse(i11, z8, z9, z10, obj2);
                i11++;
                i9 -= collapse;
            } while (i11 < i9);
        } else {
            i9 = i8;
        }
        if (findParentNode == -1) {
            size = getData().size() - 1;
        } else {
            List<BaseNode> childNode = getData().get(findParentNode).getChildNode();
            size = findParentNode + (childNode != null ? childNode.size() : 0) + expand;
        }
        int i12 = i9 + expand;
        if (i12 < size) {
            int i13 = i12 + 1;
            while (i13 <= size) {
                int collapse2 = collapse(i13, z8, z9, z10, obj2);
                i13++;
                size -= collapse2;
            }
        }
    }

    public final void nodeAddData(BaseNode parentNode, int i8, BaseNode data) {
        s.checkNotNullParameter(parentNode, "parentNode");
        s.checkNotNullParameter(data, "data");
        List<BaseNode> childNode = parentNode.getChildNode();
        if (childNode != null) {
            childNode.add(i8, data);
            if (!(parentNode instanceof BaseExpandNode) || ((BaseExpandNode) parentNode).isExpanded()) {
                addData(getData().indexOf(parentNode) + 1 + i8, data);
            }
        }
    }

    public final void nodeRemoveData(BaseNode parentNode, BaseNode childNode) {
        s.checkNotNullParameter(parentNode, "parentNode");
        s.checkNotNullParameter(childNode, "childNode");
        List<BaseNode> childNode2 = parentNode.getChildNode();
        if (childNode2 != null) {
            if ((parentNode instanceof BaseExpandNode) && !((BaseExpandNode) parentNode).isExpanded()) {
                childNode2.remove(childNode);
            } else {
                remove((BaseNodeAdapter) childNode);
                childNode2.remove(childNode);
            }
        }
    }

    public final void nodeAddData(BaseNode parentNode, int i8, Collection<? extends BaseNode> newData) {
        s.checkNotNullParameter(parentNode, "parentNode");
        s.checkNotNullParameter(newData, "newData");
        List<BaseNode> childNode = parentNode.getChildNode();
        if (childNode != null) {
            childNode.addAll(i8, newData);
            if (!(parentNode instanceof BaseExpandNode) || ((BaseExpandNode) parentNode).isExpanded()) {
                addData(getData().indexOf(parentNode) + 1 + i8, newData);
            }
        }
    }

    public final int collapse(@IntRange(from = 0) int i8, boolean z7, boolean z8, Object obj) {
        return collapse(i8, false, z7, z8, obj);
    }

    public final int expand(@IntRange(from = 0) int i8, boolean z7, boolean z8, Object obj) {
        return expand(i8, false, z7, z8, obj);
    }
}
