package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import e.AbstractC2405a;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class K implements j.e {
    private static Method sSetClipToWindowEnabledMethod;
    private static Method sSetEpicenterBoundsMethod;
    private ListAdapter mAdapter;
    private Context mContext;
    private boolean mDropDownAlwaysVisible;
    private View mDropDownAnchorView;
    private int mDropDownGravity;
    private int mDropDownHeight;
    private int mDropDownHorizontalOffset;
    G mDropDownList;
    private Drawable mDropDownListHighlight;
    private int mDropDownVerticalOffset;
    private boolean mDropDownVerticalOffsetSet;
    private int mDropDownWidth;
    private int mDropDownWindowLayoutType;
    private Rect mEpicenterBounds;
    private boolean mForceIgnoreOutsideTouch;
    final Handler mHandler;
    private final e mHideSelector;
    private AdapterView.OnItemClickListener mItemClickListener;
    private AdapterView.OnItemSelectedListener mItemSelectedListener;
    int mListItemExpandMaximum;
    private boolean mModal;
    private DataSetObserver mObserver;
    private boolean mOverlapAnchor;
    private boolean mOverlapAnchorSet;
    PopupWindow mPopup;
    private int mPromptPosition;
    private View mPromptView;
    final i mResizePopupRunnable;
    private final g mScrollListener;
    private Runnable mShowDropDownRunnable;
    private final Rect mTempRect;
    private final h mTouchInterceptor;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View anchorView = K.this.getAnchorView();
            if (anchorView == null || anchorView.getWindowToken() == null) {
                return;
            }
            K.this.show();
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i4, long j4) {
            G g4;
            if (i4 == -1 || (g4 = K.this.mDropDownList) == null) {
                return;
            }
            g4.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class c {
        static int a(PopupWindow popupWindow, View view, int i4, boolean z4) {
            return popupWindow.getMaxAvailableHeight(view, i4, z4);
        }
    }

    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z4) {
            popupWindow.setIsClippedToScreen(z4);
        }
    }

    private class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            K.this.clearListSelection();
        }
    }

    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (K.this.isShowing()) {
                K.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            K.this.dismiss();
        }
    }

    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i4) {
            if (i4 != 1 || K.this.isInputMethodNotNeeded() || K.this.mPopup.getContentView() == null) {
                return;
            }
            K k4 = K.this;
            k4.mHandler.removeCallbacks(k4.mResizePopupRunnable);
            K.this.mResizePopupRunnable.run();
        }
    }

    private class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x4 = (int) motionEvent.getX();
            int y4 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = K.this.mPopup) != null && popupWindow.isShowing() && x4 >= 0 && x4 < K.this.mPopup.getWidth() && y4 >= 0 && y4 < K.this.mPopup.getHeight()) {
                K k4 = K.this;
                k4.mHandler.postDelayed(k4.mResizePopupRunnable, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            K k5 = K.this;
            k5.mHandler.removeCallbacks(k5.mResizePopupRunnable);
            return false;
        }
    }

    private class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            G g4 = K.this.mDropDownList;
            if (g4 == null || !g4.isAttachedToWindow() || K.this.mDropDownList.getCount() <= K.this.mDropDownList.getChildCount()) {
                return;
            }
            int childCount = K.this.mDropDownList.getChildCount();
            K k4 = K.this;
            if (childCount <= k4.mListItemExpandMaximum) {
                k4.mPopup.setInputMethodMode(2);
                K.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                sSetClipToWindowEnabledMethod = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                sSetEpicenterBoundsMethod = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public K(Context context) {
        this(context, null, AbstractC2405a.f36175B);
    }

    private int g() {
        int i4;
        int i5;
        int makeMeasureSpec;
        int i6;
        if (this.mDropDownList == null) {
            Context context = this.mContext;
            this.mShowDropDownRunnable = new a();
            G createDropDownListView = createDropDownListView(context, !this.mModal);
            this.mDropDownList = createDropDownListView;
            Drawable drawable = this.mDropDownListHighlight;
            if (drawable != null) {
                createDropDownListView.setSelector(drawable);
            }
            this.mDropDownList.setAdapter(this.mAdapter);
            this.mDropDownList.setOnItemClickListener(this.mItemClickListener);
            this.mDropDownList.setFocusable(true);
            this.mDropDownList.setFocusableInTouchMode(true);
            this.mDropDownList.setOnItemSelectedListener(new b());
            this.mDropDownList.setOnScrollListener(this.mScrollListener);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.mItemSelectedListener;
            if (onItemSelectedListener != null) {
                this.mDropDownList.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.mDropDownList;
            View view2 = this.mPromptView;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i7 = this.mPromptPosition;
                if (i7 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i7 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.mPromptPosition);
                } else {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i8 = this.mDropDownWidth;
                if (i8 >= 0) {
                    i6 = Integer.MIN_VALUE;
                } else {
                    i8 = 0;
                    i6 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i8, i6), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i4 = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i4 = 0;
            }
            this.mPopup.setContentView(view);
        } else {
            View view3 = this.mPromptView;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i4 = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i4 = 0;
            }
        }
        Drawable background = this.mPopup.getBackground();
        if (background != null) {
            background.getPadding(this.mTempRect);
            Rect rect = this.mTempRect;
            int i9 = rect.top;
            i5 = rect.bottom + i9;
            if (!this.mDropDownVerticalOffsetSet) {
                this.mDropDownVerticalOffset = -i9;
            }
        } else {
            this.mTempRect.setEmpty();
            i5 = 0;
        }
        int h4 = h(getAnchorView(), this.mDropDownVerticalOffset, this.mPopup.getInputMethodMode() == 2);
        if (this.mDropDownAlwaysVisible || this.mDropDownHeight == -1) {
            return h4 + i5;
        }
        int i10 = this.mDropDownWidth;
        if (i10 == -2) {
            int i11 = this.mContext.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.mTempRect;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i10 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        } else {
            int i12 = this.mContext.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.mTempRect;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12 - (rect3.left + rect3.right), 1073741824);
        }
        int d4 = this.mDropDownList.d(makeMeasureSpec, 0, -1, h4 - i4, -1);
        if (d4 > 0) {
            i4 += i5 + this.mDropDownList.getPaddingTop() + this.mDropDownList.getPaddingBottom();
        }
        return d4 + i4;
    }

    private int h(View view, int i4, boolean z4) {
        return c.a(this.mPopup, view, i4, z4);
    }

    private void i() {
        View view = this.mPromptView;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.mPromptView);
            }
        }
    }

    private void j(boolean z4) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.mPopup, z4);
            return;
        }
        Method method = sSetClipToWindowEnabledMethod;
        if (method != null) {
            try {
                method.invoke(this.mPopup, Boolean.valueOf(z4));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    public void clearListSelection() {
        G g4 = this.mDropDownList;
        if (g4 != null) {
            g4.setListSelectionHidden(true);
            g4.requestLayout();
        }
    }

    G createDropDownListView(Context context, boolean z4) {
        return new G(context, z4);
    }

    @Override // j.e
    public void dismiss() {
        this.mPopup.dismiss();
        i();
        this.mPopup.setContentView(null);
        this.mDropDownList = null;
        this.mHandler.removeCallbacks(this.mResizePopupRunnable);
    }

    public View getAnchorView() {
        return this.mDropDownAnchorView;
    }

    public Drawable getBackground() {
        return this.mPopup.getBackground();
    }

    public int getHorizontalOffset() {
        return this.mDropDownHorizontalOffset;
    }

    @Override // j.e
    public ListView getListView() {
        return this.mDropDownList;
    }

    public Object getSelectedItem() {
        if (isShowing()) {
            return this.mDropDownList.getSelectedItem();
        }
        return null;
    }

    public long getSelectedItemId() {
        if (isShowing()) {
            return this.mDropDownList.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int getSelectedItemPosition() {
        if (isShowing()) {
            return this.mDropDownList.getSelectedItemPosition();
        }
        return -1;
    }

    public View getSelectedView() {
        if (isShowing()) {
            return this.mDropDownList.getSelectedView();
        }
        return null;
    }

    public int getVerticalOffset() {
        if (this.mDropDownVerticalOffsetSet) {
            return this.mDropDownVerticalOffset;
        }
        return 0;
    }

    public int getWidth() {
        return this.mDropDownWidth;
    }

    public boolean isInputMethodNotNeeded() {
        return this.mPopup.getInputMethodMode() == 2;
    }

    public boolean isModal() {
        return this.mModal;
    }

    @Override // j.e
    public boolean isShowing() {
        return this.mPopup.isShowing();
    }

    public void setAdapter(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.mObserver;
        if (dataSetObserver == null) {
            this.mObserver = new f();
        } else {
            ListAdapter listAdapter2 = this.mAdapter;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.mAdapter = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.mObserver);
        }
        G g4 = this.mDropDownList;
        if (g4 != null) {
            g4.setAdapter(this.mAdapter);
        }
    }

    public void setAnchorView(View view) {
        this.mDropDownAnchorView = view;
    }

    public void setAnimationStyle(int i4) {
        this.mPopup.setAnimationStyle(i4);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        this.mPopup.setBackgroundDrawable(drawable);
    }

    public void setContentWidth(int i4) {
        Drawable background = this.mPopup.getBackground();
        if (background == null) {
            setWidth(i4);
            return;
        }
        background.getPadding(this.mTempRect);
        Rect rect = this.mTempRect;
        this.mDropDownWidth = rect.left + rect.right + i4;
    }

    public void setDropDownGravity(int i4) {
        this.mDropDownGravity = i4;
    }

    public void setEpicenterBounds(Rect rect) {
        this.mEpicenterBounds = rect != null ? new Rect(rect) : null;
    }

    public void setHorizontalOffset(int i4) {
        this.mDropDownHorizontalOffset = i4;
    }

    public void setInputMethodMode(int i4) {
        this.mPopup.setInputMethodMode(i4);
    }

    public void setModal(boolean z4) {
        this.mModal = z4;
        this.mPopup.setFocusable(z4);
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.mPopup.setOnDismissListener(onDismissListener);
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.mItemClickListener = onItemClickListener;
    }

    public void setOverlapAnchor(boolean z4) {
        this.mOverlapAnchorSet = true;
        this.mOverlapAnchor = z4;
    }

    public void setPromptPosition(int i4) {
        this.mPromptPosition = i4;
    }

    public void setSelection(int i4) {
        G g4 = this.mDropDownList;
        if (!isShowing() || g4 == null) {
            return;
        }
        g4.setListSelectionHidden(false);
        g4.setSelection(i4);
        if (g4.getChoiceMode() != 0) {
            g4.setItemChecked(i4, true);
        }
    }

    public void setVerticalOffset(int i4) {
        this.mDropDownVerticalOffset = i4;
        this.mDropDownVerticalOffsetSet = true;
    }

    public void setWidth(int i4) {
        this.mDropDownWidth = i4;
    }

    @Override // j.e
    public void show() {
        int g4 = g();
        boolean isInputMethodNotNeeded = isInputMethodNotNeeded();
        androidx.core.widget.i.b(this.mPopup, this.mDropDownWindowLayoutType);
        if (this.mPopup.isShowing()) {
            if (getAnchorView().isAttachedToWindow()) {
                int i4 = this.mDropDownWidth;
                if (i4 == -1) {
                    i4 = -1;
                } else if (i4 == -2) {
                    i4 = getAnchorView().getWidth();
                }
                int i5 = this.mDropDownHeight;
                if (i5 == -1) {
                    if (!isInputMethodNotNeeded) {
                        g4 = -1;
                    }
                    if (isInputMethodNotNeeded) {
                        this.mPopup.setWidth(this.mDropDownWidth == -1 ? -1 : 0);
                        this.mPopup.setHeight(0);
                    } else {
                        this.mPopup.setWidth(this.mDropDownWidth == -1 ? -1 : 0);
                        this.mPopup.setHeight(-1);
                    }
                } else if (i5 != -2) {
                    g4 = i5;
                }
                this.mPopup.setOutsideTouchable((this.mForceIgnoreOutsideTouch || this.mDropDownAlwaysVisible) ? false : true);
                this.mPopup.update(getAnchorView(), this.mDropDownHorizontalOffset, this.mDropDownVerticalOffset, i4 < 0 ? -1 : i4, g4 < 0 ? -1 : g4);
                return;
            }
            return;
        }
        int i6 = this.mDropDownWidth;
        if (i6 == -1) {
            i6 = -1;
        } else if (i6 == -2) {
            i6 = getAnchorView().getWidth();
        }
        int i7 = this.mDropDownHeight;
        if (i7 == -1) {
            g4 = -1;
        } else if (i7 != -2) {
            g4 = i7;
        }
        this.mPopup.setWidth(i6);
        this.mPopup.setHeight(g4);
        j(true);
        this.mPopup.setOutsideTouchable((this.mForceIgnoreOutsideTouch || this.mDropDownAlwaysVisible) ? false : true);
        this.mPopup.setTouchInterceptor(this.mTouchInterceptor);
        if (this.mOverlapAnchorSet) {
            androidx.core.widget.i.a(this.mPopup, this.mOverlapAnchor);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = sSetEpicenterBoundsMethod;
            if (method != null) {
                try {
                    method.invoke(this.mPopup, this.mEpicenterBounds);
                } catch (Exception e4) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e4);
                }
            }
        } else {
            d.a(this.mPopup, this.mEpicenterBounds);
        }
        androidx.core.widget.i.c(this.mPopup, getAnchorView(), this.mDropDownHorizontalOffset, this.mDropDownVerticalOffset, this.mDropDownGravity);
        this.mDropDownList.setSelection(-1);
        if (!this.mModal || this.mDropDownList.isInTouchMode()) {
            clearListSelection();
        }
        if (this.mModal) {
            return;
        }
        this.mHandler.post(this.mHideSelector);
    }

    public K(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public K(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.mDropDownHeight = -2;
        this.mDropDownWidth = -2;
        this.mDropDownWindowLayoutType = 1002;
        this.mDropDownGravity = 0;
        this.mDropDownAlwaysVisible = false;
        this.mForceIgnoreOutsideTouch = false;
        this.mListItemExpandMaximum = Integer.MAX_VALUE;
        this.mPromptPosition = 0;
        this.mResizePopupRunnable = new i();
        this.mTouchInterceptor = new h();
        this.mScrollListener = new g();
        this.mHideSelector = new e();
        this.mTempRect = new Rect();
        this.mContext = context;
        this.mHandler = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f36527l1, i4, i5);
        this.mDropDownHorizontalOffset = obtainStyledAttributes.getDimensionPixelOffset(e.j.f36532m1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(e.j.f36537n1, 0);
        this.mDropDownVerticalOffset = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.mDropDownVerticalOffsetSet = true;
        }
        obtainStyledAttributes.recycle();
        C1266o c1266o = new C1266o(context, attributeSet, i4, i5);
        this.mPopup = c1266o;
        c1266o.setInputMethodMode(1);
    }
}
