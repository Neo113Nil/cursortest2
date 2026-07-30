package com.chad.library.adapter.base;

import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public abstract class BaseMultiItemQuickAdapter<T extends MultiItemEntity, VH extends BaseViewHolder> extends BaseQuickAdapter<T, VH> {
    private final y5.f layouts$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseMultiItemQuickAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final SparseIntArray getLayouts() {
        return (SparseIntArray) this.layouts$delegate.getValue();
    }

    protected final void addItemType(int i8, @LayoutRes int i9) {
        getLayouts().put(i8, i9);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected int getDefItemViewType(int i8) {
        return ((MultiItemEntity) getData().get(i8)).getItemType();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected VH onCreateDefViewHolder(ViewGroup parent, int i8) {
        s.checkNotNullParameter(parent, "parent");
        int i9 = getLayouts().get(i8);
        if (i9 != 0) {
            return createBaseViewHolder(parent, i9);
        }
        throw new IllegalArgumentException(("ViewType: " + i8 + " found layoutResId，please use addItemType() first!").toString());
    }

    public /* synthetic */ BaseMultiItemQuickAdapter(List list, int i8, o oVar) {
        this((i8 & 1) != 0 ? null : list);
    }

    public BaseMultiItemQuickAdapter(List<T> list) {
        super(0, list);
        y5.f lazy;
        lazy = kotlin.b.lazy(LazyThreadSafetyMode.NONE, (f6.a) new f6.a() { // from class: com.chad.library.adapter.base.BaseMultiItemQuickAdapter$layouts$2
            @Override // f6.a
            public final SparseIntArray invoke() {
                return new SparseIntArray();
            }
        });
        this.layouts$delegate = lazy;
    }
}
