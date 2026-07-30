package com.chad.library.adapter.base;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.chad.library.adapter.base.animation.AlphaInAnimation;
import com.chad.library.adapter.base.animation.BaseAnimation;
import com.chad.library.adapter.base.animation.ScaleInAnimation;
import com.chad.library.adapter.base.animation.SlideInBottomAnimation;
import com.chad.library.adapter.base.animation.SlideInLeftAnimation;
import com.chad.library.adapter.base.animation.SlideInRightAnimation;
import com.chad.library.adapter.base.diff.BrvahAsyncDiffer;
import com.chad.library.adapter.base.diff.BrvahAsyncDifferConfig;
import com.chad.library.adapter.base.diff.BrvahListUpdateCallback;
import com.chad.library.adapter.base.listener.GridSpanSizeLookup;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemChildLongClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.listener.OnItemLongClickListener;
import com.chad.library.adapter.base.module.BaseDraggableModule;
import com.chad.library.adapter.base.module.BaseLoadMoreModule;
import com.chad.library.adapter.base.module.BaseUpFetchModule;
import com.chad.library.adapter.base.module.DraggableModule;
import com.chad.library.adapter.base.module.LoadMoreModule;
import com.chad.library.adapter.base.module.UpFetchModule;
import com.chad.library.adapter.base.util.AdapterUtilsKt;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public abstract class BaseQuickAdapter<T, VH extends BaseViewHolder> extends RecyclerView.Adapter<VH> {
    public static final Companion Companion = new Companion(null);
    public static final int EMPTY_VIEW = 268436821;
    public static final int FOOTER_VIEW = 268436275;
    public static final int HEADER_VIEW = 268435729;
    public static final int LOAD_MORE_VIEW = 268436002;
    private BaseAnimation adapterAnimation;
    private boolean animationEnable;
    private final LinkedHashSet<Integer> childClickViewIds;
    private final LinkedHashSet<Integer> childLongClickViewIds;
    private List<T> data;
    private boolean footerViewAsFlow;
    private boolean footerWithEmptyEnable;
    private boolean headerViewAsFlow;
    private boolean headerWithEmptyEnable;
    private boolean isAnimationFirstOnly;
    private boolean isUseEmpty;
    private final int layoutResId;
    private BrvahAsyncDiffer<T> mDiffHelper;
    private BaseDraggableModule mDraggableModule;
    private FrameLayout mEmptyLayout;
    private LinearLayout mFooterLayout;
    private LinearLayout mHeaderLayout;
    private int mLastPosition;
    private BaseLoadMoreModule mLoadMoreModule;
    private OnItemChildClickListener mOnItemChildClickListener;
    private OnItemChildLongClickListener mOnItemChildLongClickListener;
    private OnItemClickListener mOnItemClickListener;
    private OnItemLongClickListener mOnItemLongClickListener;
    private GridSpanSizeLookup mSpanSizeLookup;
    private BaseUpFetchModule mUpFetchModule;
    private RecyclerView recyclerViewOrNull;

    public enum AnimationType {
        AlphaIn,
        ScaleIn,
        SlideInBottom,
        SlideInLeft,
        SlideInRight
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnimationType.values().length];
            iArr[AnimationType.AlphaIn.ordinal()] = 1;
            iArr[AnimationType.ScaleIn.ordinal()] = 2;
            iArr[AnimationType.SlideInBottom.ordinal()] = 3;
            iArr[AnimationType.SlideInLeft.ordinal()] = 4;
            iArr[AnimationType.SlideInRight.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseQuickAdapter(@LayoutRes int i8) {
        this(i8, null, 2, 0 == true ? 1 : 0);
    }

    private final void addAnimation(RecyclerView.ViewHolder viewHolder) {
        if (this.animationEnable) {
            if (!this.isAnimationFirstOnly || viewHolder.getLayoutPosition() > this.mLastPosition) {
                BaseAnimation baseAnimation = this.adapterAnimation;
                if (baseAnimation == null) {
                    baseAnimation = new AlphaInAnimation(0.0f, 1, null);
                }
                View view = viewHolder.itemView;
                s.checkNotNullExpressionValue(view, "holder.itemView");
                for (Animator animator : baseAnimation.animators(view)) {
                    startAnim(animator, viewHolder.getLayoutPosition());
                }
                this.mLastPosition = viewHolder.getLayoutPosition();
            }
        }
    }

    public static /* synthetic */ int addFooterView$default(BaseQuickAdapter baseQuickAdapter, View view, int i8, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFooterView");
        }
        if ((i10 & 2) != 0) {
            i8 = -1;
        }
        if ((i10 & 4) != 0) {
            i9 = 1;
        }
        return baseQuickAdapter.addFooterView(view, i8, i9);
    }

    public static /* synthetic */ int addHeaderView$default(BaseQuickAdapter baseQuickAdapter, View view, int i8, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addHeaderView");
        }
        if ((i10 & 2) != 0) {
            i8 = -1;
        }
        if ((i10 & 4) != 0) {
            i9 = 1;
        }
        return baseQuickAdapter.addHeaderView(view, i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindViewClickListener$lambda-12$lambda-11$lambda-10, reason: not valid java name */
    public static final void m133bindViewClickListener$lambda12$lambda11$lambda10(BaseViewHolder viewHolder, BaseQuickAdapter this$0, View v7) {
        s.checkNotNullParameter(viewHolder, "$viewHolder");
        s.checkNotNullParameter(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
        s.checkNotNullExpressionValue(v7, "v");
        this$0.setOnItemChildClick(v7, headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindViewClickListener$lambda-15$lambda-14$lambda-13, reason: not valid java name */
    public static final boolean m134bindViewClickListener$lambda15$lambda14$lambda13(BaseViewHolder viewHolder, BaseQuickAdapter this$0, View v7) {
        s.checkNotNullParameter(viewHolder, "$viewHolder");
        s.checkNotNullParameter(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
        s.checkNotNullExpressionValue(v7, "v");
        return this$0.setOnItemChildLongClick(v7, headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindViewClickListener$lambda-7$lambda-6, reason: not valid java name */
    public static final void m135bindViewClickListener$lambda7$lambda6(BaseViewHolder viewHolder, BaseQuickAdapter this$0, View v7) {
        s.checkNotNullParameter(viewHolder, "$viewHolder");
        s.checkNotNullParameter(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
        s.checkNotNullExpressionValue(v7, "v");
        this$0.setOnItemClick(v7, headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindViewClickListener$lambda-9$lambda-8, reason: not valid java name */
    public static final boolean m136bindViewClickListener$lambda9$lambda8(BaseViewHolder viewHolder, BaseQuickAdapter this$0, View v7) {
        s.checkNotNullParameter(viewHolder, "$viewHolder");
        s.checkNotNullParameter(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
        s.checkNotNullExpressionValue(v7, "v");
        return this$0.setOnItemLongClick(v7, headerLayoutCount);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkModule() {
        if (this instanceof LoadMoreModule) {
            this.mLoadMoreModule = ((LoadMoreModule) this).addLoadMoreModule(this);
        }
        if (this instanceof UpFetchModule) {
            this.mUpFetchModule = ((UpFetchModule) this).addUpFetchModule(this);
        }
        if (this instanceof DraggableModule) {
            this.mDraggableModule = ((DraggableModule) this).addDraggableModule(this);
        }
    }

    private final VH createBaseGenericKInstance(Class<?> cls, View view) {
        try {
            if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
                Constructor<?> declaredConstructor = cls.getDeclaredConstructor(View.class);
                s.checkNotNullExpressionValue(declaredConstructor, "z.getDeclaredConstructor(View::class.java)");
                declaredConstructor.setAccessible(true);
                Object newInstance = declaredConstructor.newInstance(view);
                if (newInstance != null) {
                    return (VH) newInstance;
                }
                throw new NullPointerException("null cannot be cast to non-null type VH of com.chad.library.adapter.base.BaseQuickAdapter");
            }
            Constructor<?> declaredConstructor2 = cls.getDeclaredConstructor(getClass(), View.class);
            s.checkNotNullExpressionValue(declaredConstructor2, "z.getDeclaredConstructor…aClass, View::class.java)");
            declaredConstructor2.setAccessible(true);
            Object newInstance2 = declaredConstructor2.newInstance(this, view);
            if (newInstance2 != null) {
                return (VH) newInstance2;
            }
            throw new NullPointerException("null cannot be cast to non-null type VH of com.chad.library.adapter.base.BaseQuickAdapter");
        } catch (IllegalAccessException e8) {
            e8.printStackTrace();
            return null;
        } catch (InstantiationException e9) {
            e9.printStackTrace();
            return null;
        } catch (NoSuchMethodException e10) {
            e10.printStackTrace();
            return null;
        } catch (InvocationTargetException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    private final Class<?> getInstancedGenericKClass(Class<?> cls) {
        try {
            Type genericSuperclass = cls.getGenericSuperclass();
            if (!(genericSuperclass instanceof ParameterizedType)) {
                return null;
            }
            Type[] types = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
            s.checkNotNullExpressionValue(types, "types");
            for (Type type : types) {
                if (type instanceof Class) {
                    if (BaseViewHolder.class.isAssignableFrom((Class) type)) {
                        return (Class) type;
                    }
                } else if (type instanceof ParameterizedType) {
                    Type rawType = ((ParameterizedType) type).getRawType();
                    if ((rawType instanceof Class) && BaseViewHolder.class.isAssignableFrom((Class) rawType)) {
                        return (Class) rawType;
                    }
                } else {
                    continue;
                }
            }
            return null;
        } catch (TypeNotPresentException e8) {
            e8.printStackTrace();
            return null;
        } catch (GenericSignatureFormatError e9) {
            e9.printStackTrace();
            return null;
        } catch (MalformedParameterizedTypeException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static /* synthetic */ void setDiffNewData$default(BaseQuickAdapter baseQuickAdapter, List list, Runnable runnable, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDiffNewData");
        }
        if ((i8 & 2) != 0) {
            runnable = null;
        }
        baseQuickAdapter.setDiffNewData(list, runnable);
    }

    public static /* synthetic */ int setFooterView$default(BaseQuickAdapter baseQuickAdapter, View view, int i8, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFooterView");
        }
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = 1;
        }
        return baseQuickAdapter.setFooterView(view, i8, i9);
    }

    public static /* synthetic */ int setHeaderView$default(BaseQuickAdapter baseQuickAdapter, View view, int i8, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setHeaderView");
        }
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = 1;
        }
        return baseQuickAdapter.setHeaderView(view, i8, i9);
    }

    public final void addChildClickViewIds(@IdRes int... viewIds) {
        s.checkNotNullParameter(viewIds, "viewIds");
        for (int i8 : viewIds) {
            this.childClickViewIds.add(Integer.valueOf(i8));
        }
    }

    public final void addChildLongClickViewIds(@IdRes int... viewIds) {
        s.checkNotNullParameter(viewIds, "viewIds");
        for (int i8 : viewIds) {
            this.childLongClickViewIds.add(Integer.valueOf(i8));
        }
    }

    public void addData(@IntRange(from = 0) int i8, T t7) {
        this.data.add(i8, t7);
        notifyItemInserted(i8 + getHeaderLayoutCount());
        compatibilityDataSizeChanged(1);
    }

    public final int addFooterView(View view) {
        s.checkNotNullParameter(view, "view");
        return addFooterView$default(this, view, 0, 0, 6, null);
    }

    public final int addHeaderView(View view) {
        s.checkNotNullParameter(view, "view");
        return addHeaderView$default(this, view, 0, 0, 6, null);
    }

    protected void bindViewClickListener(final VH viewHolder, int i8) {
        s.checkNotNullParameter(viewHolder, "viewHolder");
        if (this.mOnItemClickListener != null) {
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.chad.library.adapter.base.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseQuickAdapter.m135bindViewClickListener$lambda7$lambda6(BaseViewHolder.this, this, view);
                }
            });
        }
        if (this.mOnItemLongClickListener != null) {
            viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.chad.library.adapter.base.j
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean m136bindViewClickListener$lambda9$lambda8;
                    m136bindViewClickListener$lambda9$lambda8 = BaseQuickAdapter.m136bindViewClickListener$lambda9$lambda8(BaseViewHolder.this, this, view);
                    return m136bindViewClickListener$lambda9$lambda8;
                }
            });
        }
        if (this.mOnItemChildClickListener != null) {
            Iterator<Integer> it = getChildClickViewIds().iterator();
            while (it.hasNext()) {
                Integer id = it.next();
                View view = viewHolder.itemView;
                s.checkNotNullExpressionValue(id, "id");
                View findViewById = view.findViewById(id.intValue());
                if (findViewById != null) {
                    s.checkNotNullExpressionValue(findViewById, "findViewById<View>(id)");
                    if (!findViewById.isClickable()) {
                        findViewById.setClickable(true);
                    }
                    findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.chad.library.adapter.base.k
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            BaseQuickAdapter.m133bindViewClickListener$lambda12$lambda11$lambda10(BaseViewHolder.this, this, view2);
                        }
                    });
                }
            }
        }
        if (this.mOnItemChildLongClickListener != null) {
            Iterator<Integer> it2 = getChildLongClickViewIds().iterator();
            while (it2.hasNext()) {
                Integer id2 = it2.next();
                View view2 = viewHolder.itemView;
                s.checkNotNullExpressionValue(id2, "id");
                View findViewById2 = view2.findViewById(id2.intValue());
                if (findViewById2 != null) {
                    s.checkNotNullExpressionValue(findViewById2, "findViewById<View>(id)");
                    if (!findViewById2.isLongClickable()) {
                        findViewById2.setLongClickable(true);
                    }
                    findViewById2.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.chad.library.adapter.base.l
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view3) {
                            boolean m134bindViewClickListener$lambda15$lambda14$lambda13;
                            m134bindViewClickListener$lambda15$lambda14$lambda13 = BaseQuickAdapter.m134bindViewClickListener$lambda15$lambda14$lambda13(BaseViewHolder.this, this, view3);
                            return m134bindViewClickListener$lambda15$lambda14$lambda13;
                        }
                    });
                }
            }
        }
    }

    protected final void compatibilityDataSizeChanged(int i8) {
        if (this.data.size() == i8) {
            notifyDataSetChanged();
        }
    }

    protected abstract void convert(VH vh, T t7);

    protected void convert(VH holder, T t7, List<? extends Object> payloads) {
        s.checkNotNullParameter(holder, "holder");
        s.checkNotNullParameter(payloads, "payloads");
    }

    protected VH createBaseViewHolder(ViewGroup parent, @LayoutRes int i8) {
        s.checkNotNullParameter(parent, "parent");
        return createBaseViewHolder(AdapterUtilsKt.getItemView(parent, i8));
    }

    public final BaseAnimation getAdapterAnimation() {
        return this.adapterAnimation;
    }

    public final boolean getAnimationEnable() {
        return this.animationEnable;
    }

    public final LinkedHashSet<Integer> getChildClickViewIds() {
        return this.childClickViewIds;
    }

    public final LinkedHashSet<Integer> getChildLongClickViewIds() {
        return this.childLongClickViewIds;
    }

    public final Context getContext() {
        Context context = getRecyclerView().getContext();
        s.checkNotNullExpressionValue(context, "recyclerView.context");
        return context;
    }

    public final List<T> getData() {
        return this.data;
    }

    protected int getDefItemCount() {
        return this.data.size();
    }

    protected int getDefItemViewType(int i8) {
        return super.getItemViewType(i8);
    }

    public final BrvahAsyncDiffer<T> getDiffHelper() {
        return getDiffer();
    }

    public final BrvahAsyncDiffer<T> getDiffer() {
        BrvahAsyncDiffer<T> brvahAsyncDiffer = this.mDiffHelper;
        if (brvahAsyncDiffer == null) {
            throw new IllegalStateException("Please use setDiffCallback() or setDiffConfig() first!".toString());
        }
        s.checkNotNull(brvahAsyncDiffer);
        return brvahAsyncDiffer;
    }

    public final BaseDraggableModule getDraggableModule() {
        BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        if (baseDraggableModule == null) {
            throw new IllegalStateException("Please first implements DraggableModule".toString());
        }
        s.checkNotNull(baseDraggableModule);
        return baseDraggableModule;
    }

    public final FrameLayout getEmptyLayout() {
        FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout != null) {
            if (frameLayout != null) {
                return frameLayout;
            }
            s.throwUninitializedPropertyAccessException("mEmptyLayout");
        }
        return null;
    }

    public final LinearLayout getFooterLayout() {
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout != null) {
            if (linearLayout != null) {
                return linearLayout;
            }
            s.throwUninitializedPropertyAccessException("mFooterLayout");
        }
        return null;
    }

    public final int getFooterLayoutCount() {
        return hasFooterLayout() ? 1 : 0;
    }

    public final boolean getFooterViewAsFlow() {
        return this.footerViewAsFlow;
    }

    public final int getFooterViewPosition() {
        if (!hasEmptyView()) {
            return getHeaderLayoutCount() + this.data.size();
        }
        int i8 = (this.headerWithEmptyEnable && hasHeaderLayout()) ? 2 : 1;
        if (this.footerWithEmptyEnable) {
            return i8;
        }
        return -1;
    }

    public final boolean getFooterWithEmptyEnable() {
        return this.footerWithEmptyEnable;
    }

    public final LinearLayout getHeaderLayout() {
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout != null) {
            if (linearLayout != null) {
                return linearLayout;
            }
            s.throwUninitializedPropertyAccessException("mHeaderLayout");
        }
        return null;
    }

    public final int getHeaderLayoutCount() {
        return hasHeaderLayout() ? 1 : 0;
    }

    public final boolean getHeaderViewAsFlow() {
        return this.headerViewAsFlow;
    }

    public final int getHeaderViewPosition() {
        return (!hasEmptyView() || this.headerWithEmptyEnable) ? 0 : -1;
    }

    public final boolean getHeaderWithEmptyEnable() {
        return this.headerWithEmptyEnable;
    }

    public T getItem(@IntRange(from = 0) int i8) {
        return this.data.get(i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (!hasEmptyView()) {
            BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
            return getHeaderLayoutCount() + getDefItemCount() + getFooterLayoutCount() + ((baseLoadMoreModule == null || !baseLoadMoreModule.hasLoadMoreView()) ? 0 : 1);
        }
        if (this.headerWithEmptyEnable && hasHeaderLayout()) {
            r1 = 2;
        }
        return (this.footerWithEmptyEnable && hasFooterLayout()) ? r1 + 1 : r1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i8) {
        return i8;
    }

    public T getItemOrNull(@IntRange(from = 0) int i8) {
        return (T) CollectionsKt___CollectionsKt.getOrNull(this.data, i8);
    }

    public int getItemPosition(T t7) {
        if (t7 == null || !(!this.data.isEmpty())) {
            return -1;
        }
        return this.data.indexOf(t7);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        if (hasEmptyView()) {
            boolean z7 = this.headerWithEmptyEnable && hasHeaderLayout();
            if (i8 != 0) {
                return i8 != 1 ? FOOTER_VIEW : FOOTER_VIEW;
            }
            if (z7) {
                return HEADER_VIEW;
            }
            return EMPTY_VIEW;
        }
        boolean hasHeaderLayout = hasHeaderLayout();
        if (hasHeaderLayout && i8 == 0) {
            return HEADER_VIEW;
        }
        if (hasHeaderLayout) {
            i8--;
        }
        int size = this.data.size();
        return i8 < size ? getDefItemViewType(i8) : i8 - size < hasFooterLayout() ? FOOTER_VIEW : LOAD_MORE_VIEW;
    }

    public final BaseLoadMoreModule getLoadMoreModule() {
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule == null) {
            throw new IllegalStateException("Please first implements LoadMoreModule".toString());
        }
        s.checkNotNull(baseLoadMoreModule);
        return baseLoadMoreModule;
    }

    public final BaseLoadMoreModule getMLoadMoreModule$com_github_CymChad_brvah() {
        return this.mLoadMoreModule;
    }

    public final OnItemChildClickListener getOnItemChildClickListener() {
        return this.mOnItemChildClickListener;
    }

    public final OnItemChildLongClickListener getOnItemChildLongClickListener() {
        return this.mOnItemChildLongClickListener;
    }

    public final OnItemClickListener getOnItemClickListener() {
        return this.mOnItemClickListener;
    }

    public final OnItemLongClickListener getOnItemLongClickListener() {
        return this.mOnItemLongClickListener;
    }

    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.recyclerViewOrNull;
        if (recyclerView == null) {
            throw new IllegalStateException("Please get it after onAttachedToRecyclerView()".toString());
        }
        s.checkNotNull(recyclerView);
        return recyclerView;
    }

    public final RecyclerView getRecyclerViewOrNull() {
        return this.recyclerViewOrNull;
    }

    public final BaseUpFetchModule getUpFetchModule() {
        BaseUpFetchModule baseUpFetchModule = this.mUpFetchModule;
        if (baseUpFetchModule == null) {
            throw new IllegalStateException("Please first implements UpFetchModule".toString());
        }
        s.checkNotNull(baseUpFetchModule);
        return baseUpFetchModule;
    }

    public final View getViewByPosition(int i8, @IdRes int i9) {
        BaseViewHolder baseViewHolder;
        RecyclerView recyclerView = this.recyclerViewOrNull;
        if (recyclerView == null || (baseViewHolder = (BaseViewHolder) recyclerView.findViewHolderForLayoutPosition(i8)) == null) {
            return null;
        }
        return baseViewHolder.getViewOrNull(i9);
    }

    public final boolean hasEmptyView() {
        FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout != null) {
            if (frameLayout == null) {
                s.throwUninitializedPropertyAccessException("mEmptyLayout");
                frameLayout = null;
            }
            if (frameLayout.getChildCount() != 0 && this.isUseEmpty) {
                return this.data.isEmpty();
            }
            return false;
        }
        return false;
    }

    public final boolean hasFooterLayout() {
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout == null) {
            return false;
        }
        if (linearLayout == null) {
            s.throwUninitializedPropertyAccessException("mFooterLayout");
            linearLayout = null;
        }
        return linearLayout.getChildCount() > 0;
    }

    public final boolean hasHeaderLayout() {
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout == null) {
            return false;
        }
        if (linearLayout == null) {
            s.throwUninitializedPropertyAccessException("mHeaderLayout");
            linearLayout = null;
        }
        return linearLayout.getChildCount() > 0;
    }

    public final boolean isAnimationFirstOnly() {
        return this.isAnimationFirstOnly;
    }

    protected boolean isFixedViewType(int i8) {
        return i8 == 268436821 || i8 == 268435729 || i8 == 268436275 || i8 == 268436002;
    }

    public final boolean isUseEmpty() {
        return this.isUseEmpty;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        s.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.recyclerViewOrNull = recyclerView;
        BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        if (baseDraggableModule != null) {
            baseDraggableModule.attachToRecyclerView(recyclerView);
        }
        final RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            final GridLayoutManager.SpanSizeLookup spanSizeLookup = gridLayoutManager.getSpanSizeLookup();
            gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup(this) { // from class: com.chad.library.adapter.base.BaseQuickAdapter$onAttachedToRecyclerView$1
                final /* synthetic */ BaseQuickAdapter<T, VH> this$0;

                {
                    this.this$0 = this;
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                public int getSpanSize(int i8) {
                    GridSpanSizeLookup gridSpanSizeLookup;
                    GridSpanSizeLookup gridSpanSizeLookup2;
                    int itemViewType = this.this$0.getItemViewType(i8);
                    if (itemViewType == 268435729 && this.this$0.getHeaderViewAsFlow()) {
                        return 1;
                    }
                    if (itemViewType == 268436275 && this.this$0.getFooterViewAsFlow()) {
                        return 1;
                    }
                    gridSpanSizeLookup = ((BaseQuickAdapter) this.this$0).mSpanSizeLookup;
                    if (gridSpanSizeLookup == null) {
                        return this.this$0.isFixedViewType(itemViewType) ? ((GridLayoutManager) layoutManager).getSpanCount() : spanSizeLookup.getSpanSize(i8);
                    }
                    if (this.this$0.isFixedViewType(itemViewType)) {
                        return ((GridLayoutManager) layoutManager).getSpanCount();
                    }
                    gridSpanSizeLookup2 = ((BaseQuickAdapter) this.this$0).mSpanSizeLookup;
                    s.checkNotNull(gridSpanSizeLookup2);
                    return gridSpanSizeLookup2.getSpanSize((GridLayoutManager) layoutManager, itemViewType, i8 - this.this$0.getHeaderLayoutCount());
                }
            });
        }
    }

    protected VH onCreateDefViewHolder(ViewGroup parent, int i8) {
        s.checkNotNullParameter(parent, "parent");
        return createBaseViewHolder(parent, this.layoutResId);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        s.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.recyclerViewOrNull = null;
    }

    protected void onItemViewHolderCreated(VH viewHolder, int i8) {
        s.checkNotNullParameter(viewHolder, "viewHolder");
    }

    public void remove(@IntRange(from = 0) int i8) {
        removeAt(i8);
    }

    public final void removeAllFooterView() {
        if (hasFooterLayout()) {
            LinearLayout linearLayout = this.mFooterLayout;
            if (linearLayout == null) {
                s.throwUninitializedPropertyAccessException("mFooterLayout");
                linearLayout = null;
            }
            linearLayout.removeAllViews();
            int footerViewPosition = getFooterViewPosition();
            if (footerViewPosition != -1) {
                notifyItemRemoved(footerViewPosition);
            }
        }
    }

    public final void removeAllHeaderView() {
        if (hasHeaderLayout()) {
            LinearLayout linearLayout = this.mHeaderLayout;
            if (linearLayout == null) {
                s.throwUninitializedPropertyAccessException("mHeaderLayout");
                linearLayout = null;
            }
            linearLayout.removeAllViews();
            int headerViewPosition = getHeaderViewPosition();
            if (headerViewPosition != -1) {
                notifyItemRemoved(headerViewPosition);
            }
        }
    }

    public void removeAt(@IntRange(from = 0) int i8) {
        if (i8 >= this.data.size()) {
            return;
        }
        this.data.remove(i8);
        int headerLayoutCount = i8 + getHeaderLayoutCount();
        notifyItemRemoved(headerLayoutCount);
        compatibilityDataSizeChanged(0);
        notifyItemRangeChanged(headerLayoutCount, this.data.size() - headerLayoutCount);
    }

    public final void removeEmptyView() {
        FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout != null) {
            if (frameLayout == null) {
                s.throwUninitializedPropertyAccessException("mEmptyLayout");
                frameLayout = null;
            }
            frameLayout.removeAllViews();
        }
    }

    public final void removeFooterView(View footer) {
        int footerViewPosition;
        s.checkNotNullParameter(footer, "footer");
        if (hasFooterLayout()) {
            LinearLayout linearLayout = this.mFooterLayout;
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                s.throwUninitializedPropertyAccessException("mFooterLayout");
                linearLayout = null;
            }
            linearLayout.removeView(footer);
            LinearLayout linearLayout3 = this.mFooterLayout;
            if (linearLayout3 == null) {
                s.throwUninitializedPropertyAccessException("mFooterLayout");
            } else {
                linearLayout2 = linearLayout3;
            }
            if (linearLayout2.getChildCount() != 0 || (footerViewPosition = getFooterViewPosition()) == -1) {
                return;
            }
            notifyItemRemoved(footerViewPosition);
        }
    }

    public final void removeHeaderView(View header) {
        int headerViewPosition;
        s.checkNotNullParameter(header, "header");
        if (hasHeaderLayout()) {
            LinearLayout linearLayout = this.mHeaderLayout;
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                s.throwUninitializedPropertyAccessException("mHeaderLayout");
                linearLayout = null;
            }
            linearLayout.removeView(header);
            LinearLayout linearLayout3 = this.mHeaderLayout;
            if (linearLayout3 == null) {
                s.throwUninitializedPropertyAccessException("mHeaderLayout");
            } else {
                linearLayout2 = linearLayout3;
            }
            if (linearLayout2.getChildCount() != 0 || (headerViewPosition = getHeaderViewPosition()) == -1) {
                return;
            }
            notifyItemRemoved(headerViewPosition);
        }
    }

    public void replaceData(Collection<? extends T> newData) {
        s.checkNotNullParameter(newData, "newData");
        setList(newData);
    }

    public final void setAdapterAnimation(BaseAnimation baseAnimation) {
        this.animationEnable = true;
        this.adapterAnimation = baseAnimation;
    }

    public final void setAnimationEnable(boolean z7) {
        this.animationEnable = z7;
    }

    public final void setAnimationFirstOnly(boolean z7) {
        this.isAnimationFirstOnly = z7;
    }

    public final void setAnimationWithDefault(AnimationType animationType) {
        BaseAnimation alphaInAnimation;
        s.checkNotNullParameter(animationType, "animationType");
        int i8 = WhenMappings.$EnumSwitchMapping$0[animationType.ordinal()];
        if (i8 == 1) {
            alphaInAnimation = new AlphaInAnimation(0.0f, 1, null);
        } else if (i8 == 2) {
            alphaInAnimation = new ScaleInAnimation(0.0f, 1, null);
        } else if (i8 == 3) {
            alphaInAnimation = new SlideInBottomAnimation();
        } else if (i8 == 4) {
            alphaInAnimation = new SlideInLeftAnimation();
        } else {
            if (i8 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            alphaInAnimation = new SlideInRightAnimation();
        }
        setAdapterAnimation(alphaInAnimation);
    }

    public void setData(@IntRange(from = 0) int i8, T t7) {
        if (i8 >= this.data.size()) {
            return;
        }
        this.data.set(i8, t7);
        notifyItemChanged(i8 + getHeaderLayoutCount());
    }

    public final void setData$com_github_CymChad_brvah(List<T> list) {
        s.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public final void setDiffCallback(DiffUtil.ItemCallback<T> diffCallback) {
        s.checkNotNullParameter(diffCallback, "diffCallback");
        setDiffConfig(new BrvahAsyncDifferConfig.Builder(diffCallback).build());
    }

    public final void setDiffConfig(BrvahAsyncDifferConfig<T> config) {
        s.checkNotNullParameter(config, "config");
        this.mDiffHelper = new BrvahAsyncDiffer<>(this, config);
    }

    public final void setDiffNewData(List<T> list) {
        setDiffNewData$default(this, list, null, 2, null);
    }

    public final void setEmptyView(View emptyView) {
        boolean z7;
        s.checkNotNullParameter(emptyView, "emptyView");
        int itemCount = getItemCount();
        FrameLayout frameLayout = null;
        if (this.mEmptyLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(emptyView.getContext());
            this.mEmptyLayout = frameLayout2;
            ViewGroup.LayoutParams layoutParams = emptyView.getLayoutParams();
            frameLayout2.setLayoutParams(layoutParams != null ? new ViewGroup.LayoutParams(layoutParams.width, layoutParams.height) : new ViewGroup.LayoutParams(-1, -1));
            z7 = true;
        } else {
            ViewGroup.LayoutParams layoutParams2 = emptyView.getLayoutParams();
            if (layoutParams2 != null) {
                FrameLayout frameLayout3 = this.mEmptyLayout;
                if (frameLayout3 == null) {
                    s.throwUninitializedPropertyAccessException("mEmptyLayout");
                    frameLayout3 = null;
                }
                ViewGroup.LayoutParams layoutParams3 = frameLayout3.getLayoutParams();
                layoutParams3.width = layoutParams2.width;
                layoutParams3.height = layoutParams2.height;
                FrameLayout frameLayout4 = this.mEmptyLayout;
                if (frameLayout4 == null) {
                    s.throwUninitializedPropertyAccessException("mEmptyLayout");
                    frameLayout4 = null;
                }
                frameLayout4.setLayoutParams(layoutParams3);
            }
            z7 = false;
        }
        FrameLayout frameLayout5 = this.mEmptyLayout;
        if (frameLayout5 == null) {
            s.throwUninitializedPropertyAccessException("mEmptyLayout");
            frameLayout5 = null;
        }
        frameLayout5.removeAllViews();
        FrameLayout frameLayout6 = this.mEmptyLayout;
        if (frameLayout6 == null) {
            s.throwUninitializedPropertyAccessException("mEmptyLayout");
        } else {
            frameLayout = frameLayout6;
        }
        frameLayout.addView(emptyView);
        this.isUseEmpty = true;
        if (z7 && hasEmptyView()) {
            int i8 = (this.headerWithEmptyEnable && hasHeaderLayout()) ? 1 : 0;
            if (getItemCount() > itemCount) {
                notifyItemInserted(i8);
            } else {
                notifyDataSetChanged();
            }
        }
    }

    public final int setFooterView(View view) {
        s.checkNotNullParameter(view, "view");
        return setFooterView$default(this, view, 0, 0, 6, null);
    }

    public final void setFooterViewAsFlow(boolean z7) {
        this.footerViewAsFlow = z7;
    }

    public final void setFooterWithEmptyEnable(boolean z7) {
        this.footerWithEmptyEnable = z7;
    }

    protected void setFullSpan(RecyclerView.ViewHolder holder) {
        s.checkNotNullParameter(holder, "holder");
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        }
    }

    public final void setGridSpanSizeLookup(GridSpanSizeLookup gridSpanSizeLookup) {
        this.mSpanSizeLookup = gridSpanSizeLookup;
    }

    public final int setHeaderView(View view) {
        s.checkNotNullParameter(view, "view");
        return setHeaderView$default(this, view, 0, 0, 6, null);
    }

    public final void setHeaderViewAsFlow(boolean z7) {
        this.headerViewAsFlow = z7;
    }

    public final void setHeaderWithEmptyEnable(boolean z7) {
        this.headerWithEmptyEnable = z7;
    }

    public void setList(Collection<? extends T> collection) {
        List<T> list = this.data;
        if (collection != list) {
            list.clear();
            if (collection != null && !collection.isEmpty()) {
                this.data.addAll(collection);
            }
        } else if (collection == null || collection.isEmpty()) {
            this.data.clear();
        } else {
            ArrayList arrayList = new ArrayList(collection);
            this.data.clear();
            this.data.addAll(arrayList);
        }
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule != null) {
            baseLoadMoreModule.reset$com_github_CymChad_brvah();
        }
        this.mLastPosition = -1;
        notifyDataSetChanged();
        BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
        if (baseLoadMoreModule2 != null) {
            baseLoadMoreModule2.checkDisableLoadMoreIfNotFullPage();
        }
    }

    public final void setMLoadMoreModule$com_github_CymChad_brvah(BaseLoadMoreModule baseLoadMoreModule) {
        this.mLoadMoreModule = baseLoadMoreModule;
    }

    public void setNewData(List<T> list) {
        setNewInstance(list);
    }

    public void setNewInstance(List<T> list) {
        if (list == this.data) {
            return;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        this.data = list;
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule != null) {
            baseLoadMoreModule.reset$com_github_CymChad_brvah();
        }
        this.mLastPosition = -1;
        notifyDataSetChanged();
        BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
        if (baseLoadMoreModule2 != null) {
            baseLoadMoreModule2.checkDisableLoadMoreIfNotFullPage();
        }
    }

    protected void setOnItemChildClick(View v7, int i8) {
        s.checkNotNullParameter(v7, "v");
        OnItemChildClickListener onItemChildClickListener = this.mOnItemChildClickListener;
        if (onItemChildClickListener != null) {
            onItemChildClickListener.onItemChildClick(this, v7, i8);
        }
    }

    public final void setOnItemChildClickListener(OnItemChildClickListener onItemChildClickListener) {
        this.mOnItemChildClickListener = onItemChildClickListener;
    }

    protected boolean setOnItemChildLongClick(View v7, int i8) {
        s.checkNotNullParameter(v7, "v");
        OnItemChildLongClickListener onItemChildLongClickListener = this.mOnItemChildLongClickListener;
        if (onItemChildLongClickListener != null) {
            return onItemChildLongClickListener.onItemChildLongClick(this, v7, i8);
        }
        return false;
    }

    public final void setOnItemChildLongClickListener(OnItemChildLongClickListener onItemChildLongClickListener) {
        this.mOnItemChildLongClickListener = onItemChildLongClickListener;
    }

    protected void setOnItemClick(View v7, int i8) {
        s.checkNotNullParameter(v7, "v");
        OnItemClickListener onItemClickListener = this.mOnItemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(this, v7, i8);
        }
    }

    public final void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    protected boolean setOnItemLongClick(View v7, int i8) {
        s.checkNotNullParameter(v7, "v");
        OnItemLongClickListener onItemLongClickListener = this.mOnItemLongClickListener;
        if (onItemLongClickListener != null) {
            return onItemLongClickListener.onItemLongClick(this, v7, i8);
        }
        return false;
    }

    public final void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener) {
        this.mOnItemLongClickListener = onItemLongClickListener;
    }

    public final void setUseEmpty(boolean z7) {
        this.isUseEmpty = z7;
    }

    protected void startAnim(Animator anim, int i8) {
        s.checkNotNullParameter(anim, "anim");
        anim.start();
    }

    public /* synthetic */ BaseQuickAdapter(int i8, List list, int i9, o oVar) {
        this(i8, (i9 & 2) != 0 ? null : list);
    }

    public final int addFooterView(View view, int i8) {
        s.checkNotNullParameter(view, "view");
        return addFooterView$default(this, view, i8, 0, 4, null);
    }

    public final int addHeaderView(View view, int i8) {
        s.checkNotNullParameter(view, "view");
        return addHeaderView$default(this, view, i8, 0, 4, null);
    }

    protected VH createBaseViewHolder(View view) {
        s.checkNotNullParameter(view, "view");
        Class<?> cls = null;
        for (Class<?> cls2 = getClass(); cls == null && cls2 != null; cls2 = cls2.getSuperclass()) {
            cls = getInstancedGenericKClass(cls2);
        }
        VH createBaseGenericKInstance = cls == null ? (VH) new BaseViewHolder(view) : createBaseGenericKInstance(cls, view);
        return createBaseGenericKInstance == null ? (VH) new BaseViewHolder(view) : createBaseGenericKInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8, List list) {
        onBindViewHolder((BaseQuickAdapter<T, VH>) viewHolder, i8, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public VH onCreateViewHolder(ViewGroup parent, int i8) {
        s.checkNotNullParameter(parent, "parent");
        View view = null;
        switch (i8) {
            case HEADER_VIEW /* 268435729 */:
                LinearLayout linearLayout = this.mHeaderLayout;
                if (linearLayout == null) {
                    s.throwUninitializedPropertyAccessException("mHeaderLayout");
                    linearLayout = null;
                }
                ViewParent parent2 = linearLayout.getParent();
                if (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    LinearLayout linearLayout2 = this.mHeaderLayout;
                    if (linearLayout2 == null) {
                        s.throwUninitializedPropertyAccessException("mHeaderLayout");
                        linearLayout2 = null;
                    }
                    viewGroup.removeView(linearLayout2);
                }
                LinearLayout linearLayout3 = this.mHeaderLayout;
                if (linearLayout3 == null) {
                    s.throwUninitializedPropertyAccessException("mHeaderLayout");
                } else {
                    view = linearLayout3;
                }
                return createBaseViewHolder(view);
            case LOAD_MORE_VIEW /* 268436002 */:
                BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
                s.checkNotNull(baseLoadMoreModule);
                VH createBaseViewHolder = createBaseViewHolder(baseLoadMoreModule.getLoadMoreView().getRootView(parent));
                BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
                s.checkNotNull(baseLoadMoreModule2);
                baseLoadMoreModule2.setupViewHolder$com_github_CymChad_brvah(createBaseViewHolder);
                return createBaseViewHolder;
            case FOOTER_VIEW /* 268436275 */:
                LinearLayout linearLayout4 = this.mFooterLayout;
                if (linearLayout4 == null) {
                    s.throwUninitializedPropertyAccessException("mFooterLayout");
                    linearLayout4 = null;
                }
                ViewParent parent3 = linearLayout4.getParent();
                if (parent3 instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) parent3;
                    LinearLayout linearLayout5 = this.mFooterLayout;
                    if (linearLayout5 == null) {
                        s.throwUninitializedPropertyAccessException("mFooterLayout");
                        linearLayout5 = null;
                    }
                    viewGroup2.removeView(linearLayout5);
                }
                LinearLayout linearLayout6 = this.mFooterLayout;
                if (linearLayout6 == null) {
                    s.throwUninitializedPropertyAccessException("mFooterLayout");
                } else {
                    view = linearLayout6;
                }
                return createBaseViewHolder(view);
            case EMPTY_VIEW /* 268436821 */:
                FrameLayout frameLayout = this.mEmptyLayout;
                if (frameLayout == null) {
                    s.throwUninitializedPropertyAccessException("mEmptyLayout");
                    frameLayout = null;
                }
                ViewParent parent4 = frameLayout.getParent();
                if (parent4 instanceof ViewGroup) {
                    ViewGroup viewGroup3 = (ViewGroup) parent4;
                    FrameLayout frameLayout2 = this.mEmptyLayout;
                    if (frameLayout2 == null) {
                        s.throwUninitializedPropertyAccessException("mEmptyLayout");
                        frameLayout2 = null;
                    }
                    viewGroup3.removeView(frameLayout2);
                }
                FrameLayout frameLayout3 = this.mEmptyLayout;
                if (frameLayout3 == null) {
                    s.throwUninitializedPropertyAccessException("mEmptyLayout");
                } else {
                    view = frameLayout3;
                }
                return createBaseViewHolder(view);
            default:
                VH onCreateDefViewHolder = onCreateDefViewHolder(parent, i8);
                bindViewClickListener(onCreateDefViewHolder, i8);
                BaseDraggableModule baseDraggableModule = this.mDraggableModule;
                if (baseDraggableModule != null) {
                    baseDraggableModule.initView$com_github_CymChad_brvah(onCreateDefViewHolder);
                }
                onItemViewHolderCreated(onCreateDefViewHolder, i8);
                return onCreateDefViewHolder;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(VH holder) {
        s.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow((BaseQuickAdapter<T, VH>) holder);
        if (isFixedViewType(holder.getItemViewType())) {
            setFullSpan(holder);
        } else {
            addAnimation(holder);
        }
    }

    public void remove(T t7) {
        int indexOf = this.data.indexOf(t7);
        if (indexOf == -1) {
            return;
        }
        removeAt(indexOf);
    }

    public void setDiffNewData(List<T> list, Runnable runnable) {
        if (hasEmptyView()) {
            setNewInstance(list);
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        BrvahAsyncDiffer<T> brvahAsyncDiffer = this.mDiffHelper;
        if (brvahAsyncDiffer != null) {
            brvahAsyncDiffer.submitList(list, runnable);
        }
    }

    public final int setFooterView(View view, int i8) {
        s.checkNotNullParameter(view, "view");
        return setFooterView$default(this, view, i8, 0, 4, null);
    }

    public final int setHeaderView(View view, int i8) {
        s.checkNotNullParameter(view, "view");
        return setHeaderView$default(this, view, i8, 0, 4, null);
    }

    public BaseQuickAdapter(@LayoutRes int i8, List<T> list) {
        this.layoutResId = i8;
        this.data = list == null ? new ArrayList<>() : list;
        this.isUseEmpty = true;
        this.isAnimationFirstOnly = true;
        this.mLastPosition = -1;
        checkModule();
        this.childClickViewIds = new LinkedHashSet<>();
        this.childLongClickViewIds = new LinkedHashSet<>();
    }

    public final int addFooterView(View view, int i8, int i9) {
        int footerViewPosition;
        RecyclerView.LayoutParams layoutParams;
        s.checkNotNullParameter(view, "view");
        LinearLayout linearLayout = null;
        if (this.mFooterLayout == null) {
            LinearLayout linearLayout2 = new LinearLayout(view.getContext());
            this.mFooterLayout = linearLayout2;
            linearLayout2.setOrientation(i9);
            LinearLayout linearLayout3 = this.mFooterLayout;
            if (linearLayout3 == null) {
                s.throwUninitializedPropertyAccessException("mFooterLayout");
                linearLayout3 = null;
            }
            if (i9 == 1) {
                layoutParams = new RecyclerView.LayoutParams(-1, -2);
            } else {
                layoutParams = new RecyclerView.LayoutParams(-2, -1);
            }
            linearLayout3.setLayoutParams(layoutParams);
        }
        LinearLayout linearLayout4 = this.mFooterLayout;
        if (linearLayout4 == null) {
            s.throwUninitializedPropertyAccessException("mFooterLayout");
            linearLayout4 = null;
        }
        int childCount = linearLayout4.getChildCount();
        if (i8 < 0 || i8 > childCount) {
            i8 = childCount;
        }
        LinearLayout linearLayout5 = this.mFooterLayout;
        if (linearLayout5 == null) {
            s.throwUninitializedPropertyAccessException("mFooterLayout");
            linearLayout5 = null;
        }
        linearLayout5.addView(view, i8);
        LinearLayout linearLayout6 = this.mFooterLayout;
        if (linearLayout6 == null) {
            s.throwUninitializedPropertyAccessException("mFooterLayout");
        } else {
            linearLayout = linearLayout6;
        }
        if (linearLayout.getChildCount() == 1 && (footerViewPosition = getFooterViewPosition()) != -1) {
            notifyItemInserted(footerViewPosition);
        }
        return i8;
    }

    public final int addHeaderView(View view, int i8, int i9) {
        int headerViewPosition;
        RecyclerView.LayoutParams layoutParams;
        s.checkNotNullParameter(view, "view");
        LinearLayout linearLayout = null;
        if (this.mHeaderLayout == null) {
            LinearLayout linearLayout2 = new LinearLayout(view.getContext());
            this.mHeaderLayout = linearLayout2;
            linearLayout2.setOrientation(i9);
            LinearLayout linearLayout3 = this.mHeaderLayout;
            if (linearLayout3 == null) {
                s.throwUninitializedPropertyAccessException("mHeaderLayout");
                linearLayout3 = null;
            }
            if (i9 == 1) {
                layoutParams = new RecyclerView.LayoutParams(-1, -2);
            } else {
                layoutParams = new RecyclerView.LayoutParams(-2, -1);
            }
            linearLayout3.setLayoutParams(layoutParams);
        }
        LinearLayout linearLayout4 = this.mHeaderLayout;
        if (linearLayout4 == null) {
            s.throwUninitializedPropertyAccessException("mHeaderLayout");
            linearLayout4 = null;
        }
        int childCount = linearLayout4.getChildCount();
        if (i8 < 0 || i8 > childCount) {
            i8 = childCount;
        }
        LinearLayout linearLayout5 = this.mHeaderLayout;
        if (linearLayout5 == null) {
            s.throwUninitializedPropertyAccessException("mHeaderLayout");
            linearLayout5 = null;
        }
        linearLayout5.addView(view, i8);
        LinearLayout linearLayout6 = this.mHeaderLayout;
        if (linearLayout6 == null) {
            s.throwUninitializedPropertyAccessException("mHeaderLayout");
        } else {
            linearLayout = linearLayout6;
        }
        if (linearLayout.getChildCount() == 1 && (headerViewPosition = getHeaderViewPosition()) != -1) {
            notifyItemInserted(headerViewPosition);
        }
        return i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(VH holder, int i8) {
        s.checkNotNullParameter(holder, "holder");
        BaseUpFetchModule baseUpFetchModule = this.mUpFetchModule;
        if (baseUpFetchModule != null) {
            baseUpFetchModule.autoUpFetch$com_github_CymChad_brvah(i8);
        }
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule != null) {
            baseLoadMoreModule.autoLoadMore$com_github_CymChad_brvah(i8);
        }
        switch (holder.getItemViewType()) {
            case HEADER_VIEW /* 268435729 */:
            case FOOTER_VIEW /* 268436275 */:
            case EMPTY_VIEW /* 268436821 */:
                break;
            case LOAD_MORE_VIEW /* 268436002 */:
                BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
                if (baseLoadMoreModule2 != null) {
                    baseLoadMoreModule2.getLoadMoreView().convert(holder, i8, baseLoadMoreModule2.getLoadMoreStatus());
                    break;
                }
                break;
            default:
                convert(holder, getItem(i8 - getHeaderLayoutCount()));
                break;
        }
    }

    public final int setFooterView(View view, int i8, int i9) {
        s.checkNotNullParameter(view, "view");
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout != null) {
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                s.throwUninitializedPropertyAccessException("mFooterLayout");
                linearLayout = null;
            }
            if (linearLayout.getChildCount() > i8) {
                LinearLayout linearLayout3 = this.mFooterLayout;
                if (linearLayout3 == null) {
                    s.throwUninitializedPropertyAccessException("mFooterLayout");
                    linearLayout3 = null;
                }
                linearLayout3.removeViewAt(i8);
                LinearLayout linearLayout4 = this.mFooterLayout;
                if (linearLayout4 == null) {
                    s.throwUninitializedPropertyAccessException("mFooterLayout");
                } else {
                    linearLayout2 = linearLayout4;
                }
                linearLayout2.addView(view, i8);
                return i8;
            }
        }
        return addFooterView(view, i8, i9);
    }

    public final int setHeaderView(View view, int i8, int i9) {
        s.checkNotNullParameter(view, "view");
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout != null) {
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                s.throwUninitializedPropertyAccessException("mHeaderLayout");
                linearLayout = null;
            }
            if (linearLayout.getChildCount() > i8) {
                LinearLayout linearLayout3 = this.mHeaderLayout;
                if (linearLayout3 == null) {
                    s.throwUninitializedPropertyAccessException("mHeaderLayout");
                    linearLayout3 = null;
                }
                linearLayout3.removeViewAt(i8);
                LinearLayout linearLayout4 = this.mHeaderLayout;
                if (linearLayout4 == null) {
                    s.throwUninitializedPropertyAccessException("mHeaderLayout");
                } else {
                    linearLayout2 = linearLayout4;
                }
                linearLayout2.addView(view, i8);
                return i8;
            }
        }
        return addHeaderView(view, i8, i9);
    }

    public void addData(@NonNull T t7) {
        this.data.add(t7);
        notifyItemInserted(this.data.size() + getHeaderLayoutCount());
        compatibilityDataSizeChanged(1);
    }

    public void setDiffNewData(@NonNull DiffUtil.DiffResult diffResult, List<T> list) {
        s.checkNotNullParameter(diffResult, "diffResult");
        s.checkNotNullParameter(list, "list");
        if (hasEmptyView()) {
            setNewInstance(list);
        } else {
            diffResult.dispatchUpdatesTo(new BrvahListUpdateCallback(this));
            this.data = list;
        }
    }

    public void addData(@IntRange(from = 0) int i8, Collection<? extends T> newData) {
        s.checkNotNullParameter(newData, "newData");
        this.data.addAll(i8, newData);
        notifyItemRangeInserted(i8 + getHeaderLayoutCount(), newData.size());
        compatibilityDataSizeChanged(newData.size());
    }

    public void onBindViewHolder(VH holder, int i8, List<Object> payloads) {
        s.checkNotNullParameter(holder, "holder");
        s.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder((BaseQuickAdapter<T, VH>) holder, i8);
        }
        BaseUpFetchModule baseUpFetchModule = this.mUpFetchModule;
        if (baseUpFetchModule != null) {
            baseUpFetchModule.autoUpFetch$com_github_CymChad_brvah(i8);
        }
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule != null) {
            baseLoadMoreModule.autoLoadMore$com_github_CymChad_brvah(i8);
        }
        switch (holder.getItemViewType()) {
            case HEADER_VIEW /* 268435729 */:
            case FOOTER_VIEW /* 268436275 */:
            case EMPTY_VIEW /* 268436821 */:
                break;
            case LOAD_MORE_VIEW /* 268436002 */:
                BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
                if (baseLoadMoreModule2 != null) {
                    baseLoadMoreModule2.getLoadMoreView().convert(holder, i8, baseLoadMoreModule2.getLoadMoreStatus());
                    break;
                }
                break;
            default:
                convert(holder, getItem(i8 - getHeaderLayoutCount()), payloads);
                break;
        }
    }

    public void addData(@NonNull Collection<? extends T> newData) {
        s.checkNotNullParameter(newData, "newData");
        this.data.addAll(newData);
        notifyItemRangeInserted((this.data.size() - newData.size()) + getHeaderLayoutCount(), newData.size());
        compatibilityDataSizeChanged(newData.size());
    }

    public final void setEmptyView(int i8) {
        RecyclerView recyclerView = this.recyclerViewOrNull;
        if (recyclerView != null) {
            View view = LayoutInflater.from(recyclerView.getContext()).inflate(i8, (ViewGroup) recyclerView, false);
            s.checkNotNullExpressionValue(view, "view");
            setEmptyView(view);
        }
    }
}
