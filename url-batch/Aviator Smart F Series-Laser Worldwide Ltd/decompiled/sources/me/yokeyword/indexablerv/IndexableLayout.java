package me.yokeyword.indexablerv;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import me.yokeyword.indexablerecyclerview.R$color;
import me.yokeyword.indexablerecyclerview.R$dimen;
import me.yokeyword.indexablerecyclerview.R$drawable;
import me.yokeyword.indexablerecyclerview.R$styleable;

/* loaded from: classes5.dex */
public class IndexableLayout extends FrameLayout {
    static final String INDEX_SIGN = "#";
    public static final int MODE_ALL_LETTERS = 1;
    public static final int MODE_FAST = 0;
    public static final int MODE_NONE = 2;
    private static int PADDING_RIGHT_OVERLAY;
    private Drawable mBarBg;
    private int mBarFocusTextColor;
    private int mBarTextColor;
    private float mBarTextSize;
    private float mBarTextSpace;
    private float mBarWidth;
    private TextView mCenterOverlay;
    private Comparator mComparator;
    private int mCompareMode;
    private Context mContext;
    private n6.b mDataSetObserver;
    private ExecutorService mExecutorService;
    private Future mFuture;
    private Handler mHandler;
    private n6.d mHeaderFooterDataSetObserver;
    private me.yokeyword.indexablerv.c mIndexBar;
    private n6.f mIndexBarDataSetObserver;
    private me.yokeyword.indexablerv.d mIndexableAdapter;
    private View mLastInvisibleRecyclerViewItemView;
    private RecyclerView.LayoutManager mLayoutManager;
    private TextView mMDOverlay;
    private k mRealAdapter;
    private RecyclerView mRecy;
    private boolean mShowAllLetter;
    private String mStickyTitle;
    private RecyclerView.ViewHolder mStickyViewHolder;
    private boolean mSticyEnable;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(String str, String str2) {
            if (str.equals(IndexableLayout.INDEX_SIGN)) {
                return !str2.equals(IndexableLayout.INDEX_SIGN) ? 1 : 0;
            }
            if (str2.equals(IndexableLayout.INDEX_SIGN)) {
                return -1;
            }
            return str.compareTo(str2);
        }
    }

    class b extends n6.d {
        b() {
        }

        @Override // n6.d
        public void onChanged() {
            if (IndexableLayout.this.mRealAdapter == null) {
                return;
            }
            IndexableLayout.this.mRealAdapter.notifyDataSetChanged();
        }

        @Override // n6.d
        public void onAdd(boolean z7, me.yokeyword.indexablerv.b bVar, me.yokeyword.indexablerv.b bVar2) {
            if (IndexableLayout.this.mRealAdapter == null) {
                return;
            }
            IndexableLayout.this.mRealAdapter.addHeaderFooterData(z7, bVar, bVar2);
        }

        @Override // n6.d
        public void onRemove(boolean z7, me.yokeyword.indexablerv.b bVar) {
            if (IndexableLayout.this.mRealAdapter == null) {
                return;
            }
            IndexableLayout.this.mRealAdapter.removeHeaderFooterData(z7, bVar);
        }
    }

    class c extends n6.f {
        c() {
        }

        @Override // n6.f
        public void onChanged() {
            IndexableLayout.this.mIndexBar.setDatas(IndexableLayout.this.mShowAllLetter, IndexableLayout.this.mRealAdapter.getItems());
        }
    }

    class d extends n6.b {
        final /* synthetic */ me.yokeyword.indexablerv.d val$adapter;

        d(me.yokeyword.indexablerv.d dVar) {
            this.val$adapter = dVar;
        }

        @Override // n6.b
        public void onChanged() {
            if (IndexableLayout.this.mRealAdapter != null) {
                IndexableLayout.this.mRealAdapter.notifyDataSetChanged();
            }
        }

        @Override // n6.b
        public void onInited() {
            onSetListener(0);
            IndexableLayout.this.onDataChanged();
        }

        @Override // n6.b
        public void onSetListener(int i8) {
            if (i8 == 1 || i8 == 0) {
                this.val$adapter.getOnItemTitleClickListener();
            }
            if (i8 == 3 || i8 == 0) {
                this.val$adapter.getOnItemTitleLongClickListener();
            }
            if ((i8 == 2 || i8 == 0) && this.val$adapter.getOnItemContentClickListener() != null) {
                IndexableLayout.this.mRealAdapter.setOnItemContentClickListener(this.val$adapter.getOnItemContentClickListener());
            }
            if (i8 == 4 || i8 == 0) {
                this.val$adapter.getOnItemContentLongClickListener();
            }
        }
    }

    class e extends GridLayoutManager.SpanSizeLookup {
        final /* synthetic */ GridLayoutManager val$gridLayoutManager;

        e(GridLayoutManager gridLayoutManager) {
            this.val$gridLayoutManager = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i8) {
            return IndexableLayout.this.mRealAdapter.getItemViewType(i8) == 2147483646 ? this.val$gridLayoutManager.getSpanCount() : IndexableLayout.this.mRealAdapter.getItemViewType(i8) == Integer.MAX_VALUE ? 1 : 0;
        }
    }

    class f extends RecyclerView.OnScrollListener {
        f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            super.onScrolled(recyclerView, i8, i9);
            IndexableLayout.this.processScrollListener();
        }
    }

    class g implements View.OnTouchListener {
        g() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        
            if (r2 != 3) goto L28;
         */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int positionForPointY = IndexableLayout.this.mIndexBar.getPositionForPointY(motionEvent.getY());
            if (positionForPointY < 0 || !(IndexableLayout.this.mLayoutManager instanceof LinearLayoutManager)) {
                return true;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) IndexableLayout.this.mLayoutManager;
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                    }
                }
                if (IndexableLayout.this.mCenterOverlay != null) {
                    IndexableLayout.this.mCenterOverlay.setVisibility(8);
                }
                if (IndexableLayout.this.mMDOverlay != null) {
                    IndexableLayout.this.mMDOverlay.setVisibility(8);
                }
                return true;
            }
            IndexableLayout.this.showOverlayView(motionEvent.getY(), positionForPointY);
            if (positionForPointY != IndexableLayout.this.mIndexBar.getSelectionPosition()) {
                IndexableLayout.this.mIndexBar.setSelectionPosition(positionForPointY);
                if (positionForPointY == 0) {
                    linearLayoutManager.scrollToPositionWithOffset(0, 0);
                } else {
                    linearLayoutManager.scrollToPositionWithOffset(IndexableLayout.this.mIndexBar.getFirstRecyclerViewPositionBySelection(), 0);
                }
            }
            return true;
        }
    }

    class h implements View.OnClickListener {
        final /* synthetic */ me.yokeyword.indexablerv.d val$adapter;

        h(me.yokeyword.indexablerv.d dVar) {
            this.val$adapter = dVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.val$adapter.getOnItemTitleClickListener();
        }
    }

    class i implements View.OnLongClickListener {
        final /* synthetic */ me.yokeyword.indexablerv.d val$adapter;

        i(me.yokeyword.indexablerv.d dVar) {
            this.val$adapter = dVar;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.val$adapter.getOnItemTitleLongClickListener();
            return false;
        }
    }

    class j implements Runnable {

        class a implements Runnable {
            final /* synthetic */ ArrayList val$datas;

            a(ArrayList arrayList) {
                this.val$datas = arrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                IndexableLayout.this.mRealAdapter.setDatas(this.val$datas);
                IndexableLayout.this.mIndexBar.setDatas(IndexableLayout.this.mShowAllLetter, IndexableLayout.this.mRealAdapter.getItems());
                IndexableLayout.this.mIndexableAdapter.getIndexCallback();
                IndexableLayout.this.processScrollListener();
            }
        }

        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IndexableLayout indexableLayout = IndexableLayout.this;
            ArrayList transform = indexableLayout.transform(indexableLayout.mIndexableAdapter.getItems());
            if (transform == null) {
                return;
            }
            IndexableLayout.this.getSafeHandler().post(new a(transform));
        }
    }

    public IndexableLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Handler getSafeHandler() {
        if (this.mHandler == null) {
            this.mHandler = new Handler(Looper.getMainLooper());
        }
        return this.mHandler;
    }

    private void init(Context context, AttributeSet attributeSet) {
        this.mContext = context;
        this.mExecutorService = Executors.newSingleThreadExecutor();
        PADDING_RIGHT_OVERLAY = (int) TypedValue.applyDimension(1, 80.0f, getResources().getDisplayMetrics());
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.IndexableRecyclerView);
            this.mBarTextColor = obtainStyledAttributes.getColor(R$styleable.IndexableRecyclerView_indexBar_textColor, ContextCompat.getColor(context, R$color.default_indexBar_textColor));
            this.mBarTextSize = obtainStyledAttributes.getDimension(R$styleable.IndexableRecyclerView_indexBar_textSize, getResources().getDimension(R$dimen.default_indexBar_textSize));
            this.mBarFocusTextColor = obtainStyledAttributes.getColor(R$styleable.IndexableRecyclerView_indexBar_selectedTextColor, ContextCompat.getColor(context, R$color.default_indexBar_selectedTextColor));
            this.mBarTextSpace = obtainStyledAttributes.getDimension(R$styleable.IndexableRecyclerView_indexBar_textSpace, getResources().getDimension(R$dimen.default_indexBar_textSpace));
            this.mBarBg = obtainStyledAttributes.getDrawable(R$styleable.IndexableRecyclerView_indexBar_background);
            this.mBarWidth = obtainStyledAttributes.getDimension(R$styleable.IndexableRecyclerView_indexBar_layout_width, getResources().getDimension(R$dimen.default_indexBar_layout_width));
            obtainStyledAttributes.recycle();
        }
        Context context2 = this.mContext;
        if (context2 instanceof Activity) {
            ((Activity) context2).getWindow().setSoftInputMode(32);
        }
        RecyclerView recyclerView = new RecyclerView(context);
        this.mRecy = recyclerView;
        recyclerView.setVerticalScrollBarEnabled(false);
        this.mRecy.setOverScrollMode(2);
        addView(this.mRecy, new FrameLayout.LayoutParams(-1, -1));
        me.yokeyword.indexablerv.c cVar = new me.yokeyword.indexablerv.c(context);
        this.mIndexBar = cVar;
        cVar.init(this.mBarBg, this.mBarTextColor, this.mBarFocusTextColor, this.mBarTextSize, this.mBarTextSpace);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.mBarWidth, -2);
        layoutParams.gravity = 8388629;
        addView(this.mIndexBar, layoutParams);
        this.mRealAdapter = new k();
        this.mRecy.setHasFixedSize(true);
        this.mRecy.setAdapter(this.mRealAdapter);
        initListener();
    }

    private void initCenterOverlay() {
        TextView textView = new TextView(this.mContext);
        this.mCenterOverlay = textView;
        textView.setBackgroundResource(R$drawable.indexable_bg_center_overlay);
        this.mCenterOverlay.setTextColor(-1);
        this.mCenterOverlay.setTextSize(40.0f);
        this.mCenterOverlay.setGravity(17);
        int applyDimension = (int) TypedValue.applyDimension(1, 70.0f, getResources().getDisplayMetrics());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(applyDimension, applyDimension);
        layoutParams.gravity = 17;
        this.mCenterOverlay.setLayoutParams(layoutParams);
        this.mCenterOverlay.setVisibility(4);
        addView(this.mCenterOverlay);
    }

    private void initListener() {
        this.mRecy.addOnScrollListener(new f());
        this.mIndexBar.setOnTouchListener(new g());
    }

    private void initMDOverlay(int i8) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(this.mContext);
        this.mMDOverlay = appCompatTextView;
        appCompatTextView.setBackgroundResource(R$drawable.indexable_bg_md_overlay);
        ((AppCompatTextView) this.mMDOverlay).setSupportBackgroundTintList(ColorStateList.valueOf(i8));
        this.mMDOverlay.setSingleLine();
        this.mMDOverlay.setTextColor(-1);
        this.mMDOverlay.setTextSize(38.0f);
        this.mMDOverlay.setGravity(17);
        int applyDimension = (int) TypedValue.applyDimension(1, 72.0f, getResources().getDisplayMetrics());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(applyDimension, applyDimension);
        layoutParams.rightMargin = (int) TypedValue.applyDimension(1, 33.0f, getResources().getDisplayMetrics());
        layoutParams.gravity = GravityCompat.END;
        this.mMDOverlay.setLayoutParams(layoutParams);
        this.mMDOverlay.setVisibility(4);
        addView(this.mMDOverlay);
    }

    private <T extends me.yokeyword.indexablerv.e> void initStickyView(me.yokeyword.indexablerv.d dVar) {
        RecyclerView.ViewHolder onCreateTitleViewHolder = dVar.onCreateTitleViewHolder(this.mRecy);
        this.mStickyViewHolder = onCreateTitleViewHolder;
        onCreateTitleViewHolder.itemView.setOnClickListener(new h(dVar));
        this.mStickyViewHolder.itemView.setOnLongClickListener(new i(dVar));
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if (getChildAt(i8) == this.mRecy) {
                this.mStickyViewHolder.itemView.setVisibility(4);
                addView(this.mStickyViewHolder.itemView, i8 + 1);
                return;
            }
        }
    }

    private void processScroll(LinearLayoutManager linearLayoutManager, ArrayList<me.yokeyword.indexablerv.b> arrayList, int i8, String str) {
        me.yokeyword.indexablerv.b bVar = arrayList.get(i8);
        View findViewByPosition = linearLayoutManager.findViewByPosition(i8);
        if (findViewByPosition == null) {
            return;
        }
        if (bVar.getItemType() != 2147483646) {
            if (this.mStickyViewHolder.itemView.getTranslationY() != 0.0f) {
                this.mStickyViewHolder.itemView.setTranslationY(0.0f);
            }
        } else {
            if (findViewByPosition.getTop() <= this.mStickyViewHolder.itemView.getHeight() && str != null) {
                this.mStickyViewHolder.itemView.setTranslationY(findViewByPosition.getTop() - this.mStickyViewHolder.itemView.getHeight());
            }
            if (4 == findViewByPosition.getVisibility()) {
                findViewByPosition.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processScrollListener() {
        LinearLayoutManager linearLayoutManager;
        int findFirstVisibleItemPosition;
        RecyclerView.LayoutManager layoutManager = this.mLayoutManager;
        if ((layoutManager instanceof LinearLayoutManager) && (findFirstVisibleItemPosition = (linearLayoutManager = (LinearLayoutManager) layoutManager).findFirstVisibleItemPosition()) != -1) {
            this.mIndexBar.setSelection(findFirstVisibleItemPosition);
            if (this.mSticyEnable) {
                ArrayList<me.yokeyword.indexablerv.b> items = this.mRealAdapter.getItems();
                if (this.mStickyViewHolder == null || items.size() <= findFirstVisibleItemPosition) {
                    return;
                }
                me.yokeyword.indexablerv.b bVar = items.get(findFirstVisibleItemPosition);
                String indexTitle = bVar.getIndexTitle();
                if (2147483646 == bVar.getItemType()) {
                    View view = this.mLastInvisibleRecyclerViewItemView;
                    if (view != null && view.getVisibility() == 4) {
                        this.mLastInvisibleRecyclerViewItemView.setVisibility(0);
                        this.mLastInvisibleRecyclerViewItemView = null;
                    }
                    View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
                    this.mLastInvisibleRecyclerViewItemView = findViewByPosition;
                    if (findViewByPosition != null) {
                        findViewByPosition.setVisibility(4);
                    }
                }
                if (indexTitle == null && this.mStickyViewHolder.itemView.getVisibility() == 0) {
                    this.mStickyTitle = null;
                    this.mStickyViewHolder.itemView.setVisibility(4);
                } else {
                    stickyNewViewHolder(indexTitle);
                }
                RecyclerView.LayoutManager layoutManager2 = this.mLayoutManager;
                if (!(layoutManager2 instanceof GridLayoutManager)) {
                    int i8 = findFirstVisibleItemPosition + 1;
                    if (i8 < items.size()) {
                        processScroll(linearLayoutManager, items, i8, indexTitle);
                        return;
                    }
                    return;
                }
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager2;
                if (gridLayoutManager.getSpanCount() + findFirstVisibleItemPosition < items.size()) {
                    for (int i9 = findFirstVisibleItemPosition + 1; i9 <= gridLayoutManager.getSpanCount() + findFirstVisibleItemPosition; i9++) {
                        processScroll(linearLayoutManager, items, i9, indexTitle);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void showOverlayView(float f8, int i8) {
        int height;
        String str;
        if (this.mIndexBar.getIndexList().size() <= i8) {
            return;
        }
        TextView textView = this.mMDOverlay;
        if (textView != null) {
            if (textView.getVisibility() != 0) {
                this.mMDOverlay.setVisibility(0);
            }
            if (f8 >= PADDING_RIGHT_OVERLAY - this.mIndexBar.getTop() || f8 < 0.0f) {
                if (f8 < 0.0f) {
                    f8 = this.mIndexBar.getTop() > PADDING_RIGHT_OVERLAY ? 0.0f : r0 - this.mIndexBar.getTop();
                } else if (f8 > this.mIndexBar.getHeight()) {
                    height = this.mIndexBar.getHeight();
                }
                this.mMDOverlay.setY((this.mIndexBar.getTop() + f8) - PADDING_RIGHT_OVERLAY);
                str = this.mIndexBar.getIndexList().get(i8);
                if (!this.mMDOverlay.getText().equals(str)) {
                    if (str.length() > 1) {
                        this.mMDOverlay.setTextSize(30.0f);
                    }
                    this.mMDOverlay.setText(str);
                }
            } else {
                height = PADDING_RIGHT_OVERLAY - this.mIndexBar.getTop();
            }
            f8 = height;
            this.mMDOverlay.setY((this.mIndexBar.getTop() + f8) - PADDING_RIGHT_OVERLAY);
            str = this.mIndexBar.getIndexList().get(i8);
            if (!this.mMDOverlay.getText().equals(str)) {
            }
        }
        TextView textView2 = this.mCenterOverlay;
        if (textView2 != null) {
            if (textView2.getVisibility() != 0) {
                this.mCenterOverlay.setVisibility(0);
            }
            String str2 = this.mIndexBar.getIndexList().get(i8);
            if (this.mCenterOverlay.getText().equals(str2)) {
                return;
            }
            if (str2.length() > 1) {
                this.mCenterOverlay.setTextSize(32.0f);
            }
            this.mCenterOverlay.setText(str2);
        }
    }

    private void stickyNewViewHolder(String str) {
        if (str == null || str.equals(this.mStickyTitle)) {
            return;
        }
        if (this.mStickyViewHolder.itemView.getVisibility() != 0) {
            this.mStickyViewHolder.itemView.setVisibility(0);
        }
        this.mStickyTitle = str;
        this.mIndexableAdapter.onBindTitleViewHolder(this.mStickyViewHolder, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends me.yokeyword.indexablerv.e> ArrayList<me.yokeyword.indexablerv.b> transform(List<T> list) {
        List list2;
        try {
            TreeMap treeMap = new TreeMap(new a());
            for (int i8 = 0; i8 < list.size(); i8++) {
                me.yokeyword.indexablerv.b bVar = new me.yokeyword.indexablerv.b();
                T t7 = list.get(i8);
                String fieldIndexBy = t7.getFieldIndexBy();
                String pingYin = me.yokeyword.indexablerv.j.getPingYin(fieldIndexBy);
                bVar.setPinyin(pingYin);
                if (me.yokeyword.indexablerv.j.matchingLetter(pingYin)) {
                    bVar.setIndex(pingYin.substring(0, 1).toUpperCase());
                    bVar.setIndexByField(t7.getFieldIndexBy());
                } else if (me.yokeyword.indexablerv.j.matchingPolyphone(pingYin)) {
                    bVar.setIndex(me.yokeyword.indexablerv.j.gePolyphoneInitial(pingYin).toUpperCase());
                    bVar.setPinyin(me.yokeyword.indexablerv.j.getPolyphoneRealPinyin(pingYin));
                    String polyphoneRealHanzi = me.yokeyword.indexablerv.j.getPolyphoneRealHanzi(fieldIndexBy);
                    bVar.setIndexByField(polyphoneRealHanzi);
                    t7.setFieldIndexBy(polyphoneRealHanzi);
                } else {
                    bVar.setIndex(INDEX_SIGN);
                    bVar.setIndexByField(t7.getFieldIndexBy());
                }
                bVar.setIndexTitle(bVar.getIndex());
                bVar.setData(t7);
                bVar.setOriginalPosition(i8);
                t7.setFieldPinyinIndexBy(bVar.getPinyin());
                String index = bVar.getIndex();
                if (treeMap.containsKey(index)) {
                    list2 = (List) treeMap.get(index);
                } else {
                    list2 = new ArrayList();
                    list2.add(new me.yokeyword.indexablerv.b(bVar.getIndex(), 2147483646));
                    treeMap.put(index, list2);
                }
                list2.add(bVar);
            }
            ArrayList<me.yokeyword.indexablerv.b> arrayList = new ArrayList<>();
            for (List list3 : treeMap.values()) {
                Comparator comparator = this.mComparator;
                if (comparator != null) {
                    Collections.sort(list3, comparator);
                } else {
                    int i9 = this.mCompareMode;
                    if (i9 == 0) {
                        Collections.sort(list3, new me.yokeyword.indexablerv.h());
                    } else if (i9 == 1) {
                        Collections.sort(list3, new me.yokeyword.indexablerv.i());
                    }
                }
                arrayList.addAll(list3);
            }
            return arrayList;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public <T> void addFooterAdapter(me.yokeyword.indexablerv.f fVar) {
        fVar.registerDataSetObserver(this.mHeaderFooterDataSetObserver);
        fVar.registerIndexBarDataSetObserver(this.mIndexBarDataSetObserver);
        this.mRealAdapter.addIndexableFooterAdapter(fVar);
    }

    public <T> void addHeaderAdapter(me.yokeyword.indexablerv.g gVar) {
        gVar.registerDataSetObserver(this.mHeaderFooterDataSetObserver);
        gVar.registerIndexBarDataSetObserver(this.mIndexBarDataSetObserver);
        this.mRealAdapter.addIndexableHeaderAdapter(gVar);
    }

    public TextView getOverlayView() {
        TextView textView = this.mMDOverlay;
        return textView != null ? textView : this.mCenterOverlay;
    }

    public RecyclerView getRecyclerView() {
        return this.mRecy;
    }

    void onDataChanged() {
        Future future = this.mFuture;
        if (future != null) {
            future.cancel(true);
        }
        this.mFuture = this.mExecutorService.submit(new j());
    }

    public <T> void removeFooterAdapter(me.yokeyword.indexablerv.f fVar) {
        try {
            fVar.unregisterDataSetObserver(this.mHeaderFooterDataSetObserver);
            fVar.unregisterIndexBarDataSetObserver(this.mIndexBarDataSetObserver);
            this.mRealAdapter.removeIndexableFooterAdapter(fVar);
        } catch (Exception unused) {
        }
    }

    public <T> void removeHeaderAdapter(me.yokeyword.indexablerv.g gVar) {
        try {
            gVar.unregisterDataSetObserver(this.mHeaderFooterDataSetObserver);
            gVar.unregisterIndexBarDataSetObserver(this.mIndexBarDataSetObserver);
            this.mRealAdapter.removeIndexableHeaderAdapter(gVar);
        } catch (Exception unused) {
        }
    }

    public <T extends me.yokeyword.indexablerv.e> void setAdapter(me.yokeyword.indexablerv.d dVar) {
        if (this.mLayoutManager == null) {
            throw new NullPointerException("You must set the LayoutManager first");
        }
        this.mIndexableAdapter = dVar;
        n6.b bVar = this.mDataSetObserver;
        if (bVar != null) {
            dVar.unregisterDataSetObserver(bVar);
        }
        d dVar2 = new d(dVar);
        this.mDataSetObserver = dVar2;
        dVar.registerDataSetObserver(dVar2);
        this.mRealAdapter.setIndexableAdapter(dVar);
        if (this.mSticyEnable) {
            initStickyView(dVar);
        }
    }

    public <T extends me.yokeyword.indexablerv.e> void setComparator(Comparator<me.yokeyword.indexablerv.b> comparator) {
        this.mComparator = comparator;
    }

    public void setCompareMode(int i8) {
        this.mCompareMode = i8;
    }

    @Deprecated
    public void setFastCompare(boolean z7) {
        setCompareMode(!z7 ? 1 : 0);
    }

    public void setIndexBarVisibility(boolean z7) {
        this.mIndexBar.setVisibility(z7 ? 0 : 8);
    }

    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager == null) {
            throw new NullPointerException("LayoutManager == null");
        }
        this.mLayoutManager = layoutManager;
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new e(gridLayoutManager));
        }
        this.mRecy.setLayoutManager(this.mLayoutManager);
    }

    public void setOverlayStyle_Center() {
        if (this.mCenterOverlay == null) {
            initCenterOverlay();
        }
        this.mMDOverlay = null;
    }

    public void setOverlayStyle_MaterialDesign(int i8) {
        TextView textView = this.mMDOverlay;
        if (textView == null) {
            initMDOverlay(i8);
        } else {
            ViewCompat.setBackgroundTintList(textView, ColorStateList.valueOf(i8));
        }
        this.mCenterOverlay = null;
    }

    public void setStickyEnable(boolean z7) {
        this.mSticyEnable = z7;
    }

    public void showAllLetter(boolean z7) {
        this.mShowAllLetter = z7;
    }

    public IndexableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IndexableLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mShowAllLetter = true;
        this.mSticyEnable = true;
        this.mCompareMode = 0;
        this.mHeaderFooterDataSetObserver = new b();
        this.mIndexBarDataSetObserver = new c();
        init(context, attributeSet);
    }
}
