package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AbstractC1250a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.AbstractC1317t;
import androidx.core.view.InterfaceC1323x;
import androidx.customview.view.AbsSavedState;
import com.ironsource.InterfaceC1490j3;
import e.AbstractC2405a;
import f.AbstractC2415a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC1323x {
    private j.a mActionMenuPresenterCallback;
    private OnBackInvokedCallback mBackInvokedCallback;
    private boolean mBackInvokedCallbackEnabled;
    private OnBackInvokedDispatcher mBackInvokedDispatcher;
    int mButtonGravity;
    ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private Q mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private f mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList<View> mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    e.a mMenuBuilderCallback;
    final androidx.core.view.A mMenuHostHelper;
    ActionMenuView mMenuView;
    private final ActionMenuView.e mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    h mOnMenuItemClickListener;
    private ActionMenuPresenter mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private ArrayList<MenuItem> mProvidedMenuItems;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private ColorStateList mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList<View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private ColorStateList mTitleTextColor;
    private TextView mTitleTextView;
    private d0 mWrapper;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.mMenuHostHelper.h(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.mOnMenuItemClickListener;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.showOverflowMenu();
        }
    }

    class c implements e.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e.a aVar = Toolbar.this.mMenuBuilderCallback;
            return aVar != null && aVar.a(eVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (!Toolbar.this.mMenuView.o()) {
                Toolbar.this.mMenuHostHelper.i(eVar);
            }
            e.a aVar = Toolbar.this.mMenuBuilderCallback;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.collapseActionView();
        }
    }

    static class e {
        static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.c0
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    private class f implements androidx.appcompat.view.menu.j {

        /* renamed from: a, reason: collision with root package name */
        androidx.appcompat.view.menu.e f10830a;

        /* renamed from: b, reason: collision with root package name */
        androidx.appcompat.view.menu.g f10831b;

        f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public void a(androidx.appcompat.view.menu.e eVar, boolean z4) {
        }

        @Override // androidx.appcompat.view.menu.j
        public void b(boolean z4) {
            if (this.f10831b != null) {
                androidx.appcompat.view.menu.e eVar = this.f10830a;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        if (this.f10830a.getItem(i4) == this.f10831b) {
                            return;
                        }
                    }
                }
                d(this.f10830a, this.f10831b);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean c() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean d(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.mExpandedActionView;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).c();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.mExpandedActionView);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.mCollapseButtonView);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.mExpandedActionView = null;
            toolbar3.addChildrenForExpandedActionView();
            this.f10831b = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            Toolbar.this.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean e(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.ensureCollapseButtonView();
            ViewParent parent = Toolbar.this.mCollapseButtonView.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.mCollapseButtonView);
            }
            Toolbar.this.mExpandedActionView = gVar.getActionView();
            this.f10831b = gVar;
            ViewParent parent2 = Toolbar.this.mExpandedActionView.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.mExpandedActionView);
                }
                g generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f10174a = (toolbar4.mButtonGravity & InterfaceC1490j3.d.b.f16818j) | 8388611;
                generateDefaultLayoutParams.f10833b = 2;
                toolbar4.mExpandedActionView.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.mExpandedActionView);
            }
            Toolbar.this.removeChildrenForExpandedActionView();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.mExpandedActionView;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).b();
            }
            Toolbar.this.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void g(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f10830a;
            if (eVar2 != null && (gVar = this.f10831b) != null) {
                eVar2.collapseItemActionView(gVar);
            }
            this.f10830a = eVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean h(androidx.appcompat.view.menu.m mVar) {
            return false;
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2405a.f36186M);
    }

    private void a(List list, int i4) {
        boolean z4 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int b4 = AbstractC1317t.b(i4, getLayoutDirection());
        list.clear();
        if (!z4) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f10833b == 0 && v(childAt) && h(gVar.f10174a) == b4) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i6 = childCount - 1; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f10833b == 0 && v(childAt2) && h(gVar2.f10174a) == b4) {
                list.add(childAt2);
            }
        }
    }

    private void b(View view, boolean z4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        generateDefaultLayoutParams.f10833b = 1;
        if (!z4 || this.mExpandedActionView == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.mHiddenViews.add(view);
        }
    }

    private void c() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new Q();
        }
    }

    private void d() {
        if (this.mLogoView == null) {
            this.mLogoView = new AppCompatImageView(getContext());
        }
    }

    private void e() {
        f();
        if (this.mMenuView.s() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.mMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new f();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            eVar.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
            updateBackInvokedCallbackState();
        }
    }

    private void f() {
        if (this.mMenuView == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.mMenuView = actionMenuView;
            actionMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            this.mMenuView.t(this.mActionMenuPresenterCallback, new c());
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f10174a = (this.mButtonGravity & InterfaceC1490j3.d.b.f16818j) | 8388613;
            this.mMenuView.setLayoutParams(generateDefaultLayoutParams);
            b(this.mMenuView, false);
        }
    }

    private void g() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new C1263l(getContext(), null, AbstractC2405a.f36185L);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f10174a = (this.mButtonGravity & InterfaceC1490j3.d.b.f16818j) | 8388611;
            this.mNavButtonView.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i4 = 0; i4 < menu.size(); i4++) {
            arrayList.add(menu.getItem(i4));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private int h(int i4) {
        int layoutDirection = getLayoutDirection();
        int b4 = AbstractC1317t.b(i4, layoutDirection) & 7;
        return (b4 == 1 || b4 == 3 || b4 == 5) ? b4 : layoutDirection == 1 ? 5 : 3;
    }

    private int i(View view, int i4) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i4 > 0 ? (measuredHeight - i4) / 2 : 0;
        int j4 = j(gVar.f10174a);
        if (j4 == 48) {
            return getPaddingTop() - i5;
        }
        if (j4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i5;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i6 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i7 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (i6 < i7) {
            i6 = i7;
        } else {
            int i8 = (((height - paddingBottom) - measuredHeight) - i6) - paddingTop;
            int i9 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i8 < i9) {
                i6 = Math.max(0, i6 - (i9 - i8));
            }
        }
        return paddingTop + i6;
    }

    private int j(int i4) {
        int i5 = i4 & InterfaceC1490j3.d.b.f16818j;
        return (i5 == 16 || i5 == 48 || i5 == 80) ? i5 : this.mGravity & InterfaceC1490j3.d.b.f16818j;
    }

    private int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int m(List list, int[] iArr) {
        int i4 = iArr[0];
        int i5 = iArr[1];
        int size = list.size();
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            View view = (View) list.get(i6);
            g gVar = (g) view.getLayoutParams();
            int i8 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i4;
            int i9 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i5;
            int max = Math.max(0, i8);
            int max2 = Math.max(0, i9);
            int max3 = Math.max(0, -i8);
            int max4 = Math.max(0, -i9);
            i7 += max + view.getMeasuredWidth() + max2;
            i6++;
            i5 = max4;
            i4 = max3;
        }
        return i7;
    }

    private boolean n(View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    private int o(View view, int i4, int[] iArr, int i5) {
        g gVar = (g) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int max = i4 + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        int i7 = i(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, i7, max + measuredWidth, view.getMeasuredHeight() + i7);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    private int p(View view, int i4, int[] iArr, int i5) {
        g gVar = (g) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int max = i4 - Math.max(0, i6);
        iArr[1] = Math.max(0, -i6);
        int i7 = i(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, i7, max, view.getMeasuredHeight() + i7);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int q(View view, int i4, int i5, int i6, int i7, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i8 = marginLayoutParams.leftMargin - iArr[0];
        int i9 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i8) + Math.max(0, i9);
        iArr[0] = Math.max(0, -i8);
        iArr[1] = Math.max(0, -i9);
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + max + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void r(View view, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i8 >= 0) {
            if (mode != 0) {
                i8 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i8);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void s() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.mMenuHostHelper.f(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.mProvidedMenuItems = currentMenuItems2;
    }

    private void t() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    private boolean u() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (v(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean v(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    void addChildrenForExpandedActionView() {
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            addView(this.mHiddenViews.get(size));
        }
        this.mHiddenViews.clear();
    }

    @Override // androidx.core.view.InterfaceC1323x
    public void addMenuProvider(androidx.core.view.C c4) {
        this.mMenuHostHelper.c(c4);
    }

    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.mMenuView) != null && actionMenuView.p();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public void collapseActionView() {
        f fVar = this.mExpandedMenuPresenter;
        androidx.appcompat.view.menu.g gVar = fVar == null ? null : fVar.f10831b;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void dismissPopupMenus() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.g();
        }
    }

    void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            C1263l c1263l = new C1263l(getContext(), null, AbstractC2405a.f36185L);
            this.mCollapseButtonView = c1263l;
            c1263l.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f10174a = (this.mButtonGravity & InterfaceC1490j3.d.b.f16818j) | 8388611;
            generateDefaultLayoutParams.f10833b = 2;
            this.mCollapseButtonView.setLayoutParams(generateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        Q q4 = this.mContentInsets;
        if (q4 != null) {
            return q4.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i4 = this.mContentInsetEndWithActions;
        return i4 != Integer.MIN_VALUE ? i4 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        Q q4 = this.mContentInsets;
        if (q4 != null) {
            return q4.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        Q q4 = this.mContentInsets;
        if (q4 != null) {
            return q4.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        Q q4 = this.mContentInsets;
        if (q4 != null) {
            return q4.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i4 = this.mContentInsetStartWithNavigation;
        return i4 != Integer.MIN_VALUE ? i4 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e s4;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (s4 = actionMenuView.s()) == null || !s4.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.mMenuView.getMenu();
    }

    View getNavButtonView() {
        return this.mNavButtonView;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.mMenuView.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.mPopupContext;
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    final TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    public A getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new d0(this, true);
        }
        return this.mWrapper;
    }

    public boolean hasExpandedActionView() {
        f fVar = this.mExpandedMenuPresenter;
        return (fVar == null || fVar.f10831b == null) ? false : true;
    }

    public boolean hideOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.m();
    }

    public void inflateMenu(int i4) {
        getMenuInflater().inflate(i4, getMenu());
    }

    public void invalidateMenu() {
        ArrayList<MenuItem> arrayList = this.mProvidedMenuItems;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            MenuItem menuItem = arrayList.get(i4);
            i4++;
            getMenu().removeItem(menuItem.getItemId());
        }
        s();
    }

    public boolean isOverflowMenuShowPending() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.n();
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.o();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateBackInvokedCallbackState();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
        updateBackInvokedCallbackState();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0298 A[LOOP:0: B:40:0x0296->B:41:0x0298, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b6 A[LOOP:1: B:44:0x02b4->B:45:0x02b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02ed A[LOOP:2: B:53:0x02eb->B:54:0x02ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int max;
        boolean v4;
        boolean v5;
        boolean z5;
        int i10;
        int i11;
        int paddingTop;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int size;
        int i17;
        int i18;
        int size2;
        int i19;
        int i20;
        int size3;
        boolean z6 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i21 = width - paddingRight;
        int[] iArr = this.mTempMargins;
        iArr[1] = 0;
        iArr[0] = 0;
        int D4 = AbstractC1281a0.D(this);
        int min = D4 >= 0 ? Math.min(D4, i7 - i5) : 0;
        if (!v(this.mNavButtonView)) {
            i8 = paddingLeft;
        } else {
            if (z6) {
                i9 = p(this.mNavButtonView, i21, iArr, min);
                i8 = paddingLeft;
                if (v(this.mCollapseButtonView)) {
                    if (z6) {
                        i9 = p(this.mCollapseButtonView, i9, iArr, min);
                    } else {
                        i8 = o(this.mCollapseButtonView, i8, iArr, min);
                    }
                }
                if (v(this.mMenuView)) {
                    if (z6) {
                        i8 = o(this.mMenuView, i8, iArr, min);
                    } else {
                        i9 = p(this.mMenuView, i9, iArr, min);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i8);
                iArr[1] = Math.max(0, currentContentInsetRight - (i21 - i9));
                max = Math.max(i8, currentContentInsetLeft);
                int min2 = Math.min(i9, i21 - currentContentInsetRight);
                if (v(this.mExpandedActionView)) {
                    if (z6) {
                        min2 = p(this.mExpandedActionView, min2, iArr, min);
                    } else {
                        max = o(this.mExpandedActionView, max, iArr, min);
                    }
                }
                if (v(this.mLogoView)) {
                    if (z6) {
                        min2 = p(this.mLogoView, min2, iArr, min);
                    } else {
                        max = o(this.mLogoView, max, iArr, min);
                    }
                }
                v4 = v(this.mTitleTextView);
                v5 = v(this.mSubtitleTextView);
                if (v4) {
                    z5 = z6;
                    i10 = 0;
                } else {
                    g gVar = (g) this.mTitleTextView.getLayoutParams();
                    z5 = z6;
                    i10 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.mTitleTextView.getMeasuredHeight();
                }
                if (!v5) {
                    g gVar2 = (g) this.mSubtitleTextView.getLayoutParams();
                    i10 += ((ViewGroup.MarginLayoutParams) gVar2).topMargin + this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin;
                }
                if (!v4 || v5) {
                    TextView textView = !v4 ? this.mTitleTextView : this.mSubtitleTextView;
                    TextView textView2 = !v5 ? this.mSubtitleTextView : this.mTitleTextView;
                    g gVar3 = (g) textView.getLayoutParams();
                    g gVar4 = (g) textView2.getLayoutParams();
                    int i22 = i10;
                    boolean z7 = (!v4 && this.mTitleTextView.getMeasuredWidth() > 0) || (v5 && this.mSubtitleTextView.getMeasuredWidth() > 0);
                    i11 = this.mGravity & InterfaceC1490j3.d.b.f16818j;
                    int i23 = max;
                    if (i11 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar3).topMargin + this.mTitleMarginTop;
                    } else if (i11 != 80) {
                        int i24 = (((height - paddingTop2) - paddingBottom) - i22) / 2;
                        int i25 = ((ViewGroup.MarginLayoutParams) gVar3).topMargin;
                        int i26 = this.mTitleMarginTop;
                        if (i24 < i25 + i26) {
                            i24 = i25 + i26;
                        } else {
                            int i27 = (((height - paddingBottom) - i22) - i24) - paddingTop2;
                            int i28 = ((ViewGroup.MarginLayoutParams) gVar3).bottomMargin;
                            int i29 = this.mTitleMarginBottom;
                            if (i27 < i28 + i29) {
                                i24 = Math.max(0, i24 - ((((ViewGroup.MarginLayoutParams) gVar4).bottomMargin + i29) - i27));
                            }
                        }
                        paddingTop = paddingTop2 + i24;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar4).bottomMargin) - this.mTitleMarginBottom) - i22;
                    }
                    if (z5) {
                        i12 = 0;
                        int i30 = (z7 ? this.mTitleMarginStart : 0) - iArr[0];
                        max = i23 + Math.max(0, i30);
                        iArr[0] = Math.max(0, -i30);
                        if (v4) {
                            g gVar5 = (g) this.mTitleTextView.getLayoutParams();
                            int measuredWidth = this.mTitleTextView.getMeasuredWidth() + max;
                            int measuredHeight = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                            this.mTitleTextView.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i13 = measuredWidth + this.mTitleMarginEnd;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin;
                        } else {
                            i13 = max;
                        }
                        if (v5) {
                            int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.mSubtitleTextView.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.mSubtitleTextView.getMeasuredWidth() + max;
                            this.mSubtitleTextView.layout(max, i31, measuredWidth2, this.mSubtitleTextView.getMeasuredHeight() + i31);
                            i14 = measuredWidth2 + this.mTitleMarginEnd;
                        } else {
                            i14 = max;
                        }
                        if (z7) {
                            max = Math.max(i13, i14);
                        }
                        a(this.mTempViews, 3);
                        size = this.mTempViews.size();
                        i17 = max;
                        for (i18 = i12; i18 < size; i18++) {
                            i17 = o(this.mTempViews.get(i18), i17, iArr, min);
                        }
                        a(this.mTempViews, 5);
                        size2 = this.mTempViews.size();
                        for (i19 = i12; i19 < size2; i19++) {
                            min2 = p(this.mTempViews.get(i19), min2, iArr, min);
                        }
                        a(this.mTempViews, 1);
                        int m4 = m(this.mTempViews, iArr);
                        i20 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (m4 / 2);
                        int i32 = m4 + i20;
                        if (i20 >= i17) {
                            i17 = i32 > min2 ? i20 - (i32 - min2) : i20;
                        }
                        size3 = this.mTempViews.size();
                        while (i12 < size3) {
                            i17 = o(this.mTempViews.get(i12), i17, iArr, min);
                            i12++;
                        }
                        this.mTempViews.clear();
                        return;
                    }
                    int i33 = (z7 ? this.mTitleMarginStart : 0) - iArr[1];
                    min2 -= Math.max(0, i33);
                    iArr[1] = Math.max(0, -i33);
                    if (v4) {
                        g gVar6 = (g) this.mTitleTextView.getLayoutParams();
                        int measuredWidth3 = min2 - this.mTitleTextView.getMeasuredWidth();
                        int measuredHeight2 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                        i15 = measuredWidth3 - this.mTitleMarginEnd;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) gVar6).bottomMargin;
                    } else {
                        i15 = min2;
                    }
                    if (v5) {
                        int i34 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.mSubtitleTextView.getLayoutParams())).topMargin;
                        this.mSubtitleTextView.layout(min2 - this.mSubtitleTextView.getMeasuredWidth(), i34, min2, this.mSubtitleTextView.getMeasuredHeight() + i34);
                        i16 = min2 - this.mTitleMarginEnd;
                    } else {
                        i16 = min2;
                    }
                    if (z7) {
                        min2 = Math.min(i15, i16);
                    }
                    max = i23;
                }
                i12 = 0;
                a(this.mTempViews, 3);
                size = this.mTempViews.size();
                i17 = max;
                while (i18 < size) {
                }
                a(this.mTempViews, 5);
                size2 = this.mTempViews.size();
                while (i19 < size2) {
                }
                a(this.mTempViews, 1);
                int m42 = m(this.mTempViews, iArr);
                i20 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (m42 / 2);
                int i322 = m42 + i20;
                if (i20 >= i17) {
                }
                size3 = this.mTempViews.size();
                while (i12 < size3) {
                }
                this.mTempViews.clear();
                return;
            }
            i8 = o(this.mNavButtonView, paddingLeft, iArr, min);
        }
        i9 = i21;
        if (v(this.mCollapseButtonView)) {
        }
        if (v(this.mMenuView)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i8);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i21 - i9));
        max = Math.max(i8, currentContentInsetLeft2);
        int min22 = Math.min(i9, i21 - currentContentInsetRight2);
        if (v(this.mExpandedActionView)) {
        }
        if (v(this.mLogoView)) {
        }
        v4 = v(this.mTitleTextView);
        v5 = v(this.mSubtitleTextView);
        if (v4) {
        }
        if (!v5) {
        }
        if (!v4) {
        }
        if (!v4) {
        }
        if (!v5) {
        }
        g gVar32 = (g) textView.getLayoutParams();
        g gVar42 = (g) textView2.getLayoutParams();
        int i222 = i10;
        if (v4) {
        }
        i11 = this.mGravity & InterfaceC1490j3.d.b.f16818j;
        int i232 = max;
        if (i11 != 48) {
        }
        if (z5) {
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        int i11;
        int i12;
        int[] iArr2 = this.mTempMargins;
        boolean b4 = k0.b(this);
        int i13 = !b4 ? 1 : 0;
        if (v(this.mNavButtonView)) {
            r(this.mNavButtonView, i4, 0, i5, 0, this.mMaxButtonHeight);
            i6 = this.mNavButtonView.getMeasuredWidth() + k(this.mNavButtonView);
            i7 = Math.max(0, this.mNavButtonView.getMeasuredHeight() + l(this.mNavButtonView));
            i8 = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (v(this.mCollapseButtonView)) {
            r(this.mCollapseButtonView, i4, 0, i5, 0, this.mMaxButtonHeight);
            i6 = this.mCollapseButtonView.getMeasuredWidth() + k(this.mCollapseButtonView);
            i7 = Math.max(i7, this.mCollapseButtonView.getMeasuredHeight() + l(this.mCollapseButtonView));
            i8 = View.combineMeasuredStates(i8, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i6);
        iArr2[b4 ? 1 : 0] = Math.max(0, currentContentInsetStart - i6);
        if (v(this.mMenuView)) {
            r(this.mMenuView, i4, max, i5, 0, this.mMaxButtonHeight);
            i9 = this.mMenuView.getMeasuredWidth() + k(this.mMenuView);
            i7 = Math.max(i7, this.mMenuView.getMeasuredHeight() + l(this.mMenuView));
            i8 = View.combineMeasuredStates(i8, this.mMenuView.getMeasuredState());
        } else {
            i9 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i9);
        iArr2[i13] = Math.max(0, currentContentInsetEnd - i9);
        if (v(this.mExpandedActionView)) {
            iArr = iArr2;
            max2 += q(this.mExpandedActionView, i4, max2, i5, 0, iArr);
            i7 = Math.max(i7, this.mExpandedActionView.getMeasuredHeight() + l(this.mExpandedActionView));
            i8 = View.combineMeasuredStates(i8, this.mExpandedActionView.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (v(this.mLogoView)) {
            max2 += q(this.mLogoView, i4, max2, i5, 0, iArr);
            i7 = Math.max(i7, this.mLogoView.getMeasuredHeight() + l(this.mLogoView));
            i8 = View.combineMeasuredStates(i8, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (((g) childAt.getLayoutParams()).f10833b == 0 && v(childAt)) {
                max2 += q(childAt, i4, max2, i5, 0, iArr);
                int max3 = Math.max(i7, childAt.getMeasuredHeight() + l(childAt));
                i8 = View.combineMeasuredStates(i8, childAt.getMeasuredState());
                i7 = max3;
            } else {
                max2 = max2;
            }
        }
        int i15 = max2;
        int i16 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i17 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (v(this.mTitleTextView)) {
            q(this.mTitleTextView, i4, i15 + i17, i5, i16, iArr);
            int measuredWidth = this.mTitleTextView.getMeasuredWidth() + k(this.mTitleTextView);
            int measuredHeight = this.mTitleTextView.getMeasuredHeight() + l(this.mTitleTextView);
            i10 = measuredWidth;
            i11 = View.combineMeasuredStates(i8, this.mTitleTextView.getMeasuredState());
            i12 = measuredHeight;
        } else {
            i10 = 0;
            i11 = i8;
            i12 = 0;
        }
        if (v(this.mSubtitleTextView)) {
            i10 = Math.max(i10, q(this.mSubtitleTextView, i4, i15 + i17, i5, i16 + i12, iArr));
            i12 += this.mSubtitleTextView.getMeasuredHeight() + l(this.mSubtitleTextView);
            i11 = View.combineMeasuredStates(i11, this.mSubtitleTextView.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i15 + i10 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i4, (-16777216) & i11), u() ? 0 : View.resolveSizeAndState(Math.max(Math.max(i7, i12) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i5, i11 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        ActionMenuView actionMenuView = this.mMenuView;
        androidx.appcompat.view.menu.e s4 = actionMenuView != null ? actionMenuView.s() : null;
        int i4 = savedState.f10824b;
        if (i4 != 0 && this.mExpandedMenuPresenter != null && s4 != null && (findItem = s4.findItem(i4)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f10825c) {
            t();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        c();
        this.mContentInsets.f(i4 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        f fVar = this.mExpandedMenuPresenter;
        if (fVar != null && (gVar = fVar.f10831b) != null) {
            savedState.f10824b = gVar.getItemId();
        }
        savedState.f10825c = isOverflowMenuShowing();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f10833b != 2 && childAt != this.mMenuView) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    @Override // androidx.core.view.InterfaceC1323x
    public void removeMenuProvider(androidx.core.view.C c4) {
        this.mMenuHostHelper.j(c4);
    }

    public void setBackInvokedCallbackEnabled(boolean z4) {
        if (this.mBackInvokedCallbackEnabled != z4) {
            this.mBackInvokedCallbackEnabled = z4;
            updateBackInvokedCallbackState();
        }
    }

    public void setCollapseContentDescription(int i4) {
        setCollapseContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setCollapseIcon(int i4) {
        setCollapseIcon(AbstractC2415a.b(getContext(), i4));
    }

    public void setCollapsible(boolean z4) {
        this.mCollapsible = z4;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsRelative(int i4, int i5) {
        c();
        this.mContentInsets.g(i4, i5);
    }

    public void setLogo(int i4) {
        setLogo(AbstractC2415a.b(getContext(), i4));
    }

    public void setLogoDescription(int i4) {
        setLogoDescription(getContext().getText(i4));
    }

    public void setMenu(androidx.appcompat.view.menu.e eVar, ActionMenuPresenter actionMenuPresenter) {
        if (eVar == null && this.mMenuView == null) {
            return;
        }
        f();
        androidx.appcompat.view.menu.e s4 = this.mMenuView.s();
        if (s4 == eVar) {
            return;
        }
        if (s4 != null) {
            s4.removeMenuPresenter(this.mOuterActionMenuPresenter);
            s4.removeMenuPresenter(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new f();
        }
        actionMenuPresenter.G(true);
        if (eVar != null) {
            eVar.addMenuPresenter(actionMenuPresenter, this.mPopupContext);
            eVar.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        } else {
            actionMenuPresenter.g(this.mPopupContext, null);
            this.mExpandedMenuPresenter.g(this.mPopupContext, null);
            actionMenuPresenter.b(true);
            this.mExpandedMenuPresenter.b(true);
        }
        this.mMenuView.setPopupTheme(this.mPopupTheme);
        this.mMenuView.setPresenter(actionMenuPresenter);
        this.mOuterActionMenuPresenter = actionMenuPresenter;
        updateBackInvokedCallbackState();
    }

    public void setMenuCallbacks(j.a aVar, e.a aVar2) {
        this.mActionMenuPresenterCallback = aVar;
        this.mMenuBuilderCallback = aVar2;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.t(aVar, aVar2);
        }
    }

    public void setNavigationContentDescription(int i4) {
        setNavigationContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setNavigationIcon(int i4) {
        setNavigationIcon(AbstractC2415a.b(getContext(), i4));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.mOnMenuItemClickListener = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i4) {
        if (this.mPopupTheme != i4) {
            this.mPopupTheme = i4;
            if (i4 == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setSubtitle(int i4) {
        setSubtitle(getContext().getText(i4));
    }

    public void setSubtitleTextAppearance(Context context, int i4) {
        this.mSubtitleTextAppearance = i4;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i4);
        }
    }

    public void setSubtitleTextColor(int i4) {
        setSubtitleTextColor(ColorStateList.valueOf(i4));
    }

    public void setTitle(int i4) {
        setTitle(getContext().getText(i4));
    }

    public void setTitleMarginBottom(int i4) {
        this.mTitleMarginBottom = i4;
        requestLayout();
    }

    public void setTitleMarginEnd(int i4) {
        this.mTitleMarginEnd = i4;
        requestLayout();
    }

    public void setTitleMarginStart(int i4) {
        this.mTitleMarginStart = i4;
        requestLayout();
    }

    public void setTitleMarginTop(int i4) {
        this.mTitleMarginTop = i4;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, int i4) {
        this.mTitleTextAppearance = i4;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i4);
        }
    }

    public void setTitleTextColor(int i4) {
        setTitleTextColor(ColorStateList.valueOf(i4));
    }

    public boolean showOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.u();
    }

    void updateBackInvokedCallbackState() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a4 = e.a(this);
            boolean z4 = hasExpandedActionView() && a4 != null && isAttachedToWindow() && this.mBackInvokedCallbackEnabled;
            if (z4 && this.mBackInvokedDispatcher == null) {
                if (this.mBackInvokedCallback == null) {
                    this.mBackInvokedCallback = e.b(new Runnable() { // from class: androidx.appcompat.widget.a0
                        @Override // java.lang.Runnable
                        public final void run() {
                            Toolbar.this.collapseActionView();
                        }
                    });
                }
                e.c(a4, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = a4;
                return;
            }
            if (z4 || (onBackInvokedDispatcher = this.mBackInvokedDispatcher) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.mBackInvokedCallback);
            this.mBackInvokedDispatcher = null;
        }
    }

    public static class g extends AbstractC1250a.C0077a {

        /* renamed from: b, reason: collision with root package name */
        int f10833b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10833b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i4, int i5) {
            super(i4, i5);
            this.f10833b = 0;
            this.f10174a = 8388627;
        }

        public g(g gVar) {
            super((AbstractC1250a.C0077a) gVar);
            this.f10833b = 0;
            this.f10833b = gVar.f10833b;
        }

        public g(AbstractC1250a.C0077a c0077a) {
            super(c0077a);
            this.f10833b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f10833b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10833b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList<>();
        this.mHiddenViews = new ArrayList<>();
        this.mTempMargins = new int[2];
        this.mMenuHostHelper = new androidx.core.view.A(new Runnable() { // from class: androidx.appcompat.widget.b0
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.invalidateMenu();
            }
        });
        this.mProvidedMenuItems = new ArrayList<>();
        this.mMenuViewItemClickListener = new a();
        this.mShowOverflowMenuRunnable = new b();
        Z v4 = Z.v(getContext(), attributeSet, e.j.f36489d3, i4, 0);
        AbstractC1281a0.m0(this, context, e.j.f36489d3, attributeSet, v4.r(), i4, 0);
        this.mTitleTextAppearance = v4.n(e.j.f36389F3, 0);
        this.mSubtitleTextAppearance = v4.n(e.j.f36584w3, 0);
        this.mGravity = v4.l(e.j.f36494e3, this.mGravity);
        this.mButtonGravity = v4.l(e.j.f36499f3, 48);
        int e4 = v4.e(e.j.f36599z3, 0);
        e4 = v4.s(e.j.f36384E3) ? v4.e(e.j.f36384E3, e4) : e4;
        this.mTitleMarginBottom = e4;
        this.mTitleMarginTop = e4;
        this.mTitleMarginEnd = e4;
        this.mTitleMarginStart = e4;
        int e5 = v4.e(e.j.f36374C3, -1);
        if (e5 >= 0) {
            this.mTitleMarginStart = e5;
        }
        int e6 = v4.e(e.j.f36369B3, -1);
        if (e6 >= 0) {
            this.mTitleMarginEnd = e6;
        }
        int e7 = v4.e(e.j.f36379D3, -1);
        if (e7 >= 0) {
            this.mTitleMarginTop = e7;
        }
        int e8 = v4.e(e.j.f36364A3, -1);
        if (e8 >= 0) {
            this.mTitleMarginBottom = e8;
        }
        this.mMaxButtonHeight = v4.f(e.j.f36554q3, -1);
        int e9 = v4.e(e.j.f36534m3, Integer.MIN_VALUE);
        int e10 = v4.e(e.j.f36514i3, Integer.MIN_VALUE);
        int f4 = v4.f(e.j.f36524k3, 0);
        int f5 = v4.f(e.j.f36529l3, 0);
        c();
        this.mContentInsets.e(f4, f5);
        if (e9 != Integer.MIN_VALUE || e10 != Integer.MIN_VALUE) {
            this.mContentInsets.g(e9, e10);
        }
        this.mContentInsetStartWithNavigation = v4.e(e.j.f36539n3, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = v4.e(e.j.f36519j3, Integer.MIN_VALUE);
        this.mCollapseIcon = v4.g(e.j.f36509h3);
        this.mCollapseDescription = v4.p(e.j.f36504g3);
        CharSequence p4 = v4.p(e.j.f36594y3);
        if (!TextUtils.isEmpty(p4)) {
            setTitle(p4);
        }
        CharSequence p5 = v4.p(e.j.f36579v3);
        if (!TextUtils.isEmpty(p5)) {
            setSubtitle(p5);
        }
        this.mPopupContext = getContext();
        setPopupTheme(v4.n(e.j.f36574u3, 0));
        Drawable g4 = v4.g(e.j.f36569t3);
        if (g4 != null) {
            setNavigationIcon(g4);
        }
        CharSequence p6 = v4.p(e.j.f36564s3);
        if (!TextUtils.isEmpty(p6)) {
            setNavigationContentDescription(p6);
        }
        Drawable g5 = v4.g(e.j.f36544o3);
        if (g5 != null) {
            setLogo(g5);
        }
        CharSequence p7 = v4.p(e.j.f36549p3);
        if (!TextUtils.isEmpty(p7)) {
            setLogoDescription(p7);
        }
        if (v4.s(e.j.G3)) {
            setTitleTextColor(v4.c(e.j.G3));
        }
        if (v4.s(e.j.f36589x3)) {
            setSubtitleTextColor(v4.c(e.j.f36589x3));
        }
        if (v4.s(e.j.f36559r3)) {
            inflateMenu(v4.n(e.j.f36559r3, 0));
        }
        v4.x();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureCollapseButtonView();
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            ensureCollapseButtonView();
            this.mCollapseButtonView.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.mCollapseButtonView;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.mCollapseIcon);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            d();
            if (!n(this.mLogoView)) {
                b(this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && n(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            d();
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            e0.a(this.mNavButtonView, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.mNavButtonView)) {
                b(this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && n(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.mSubtitleTextView;
            if (textView != null && n(textView)) {
                removeView(this.mSubtitleTextView);
                this.mHiddenViews.remove(this.mSubtitleTextView);
            }
        } else {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mSubtitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.mSubtitleTextAppearance;
                if (i4 != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.mSubtitleTextColor;
                if (colorStateList != null) {
                    this.mSubtitleTextView.setTextColor(colorStateList);
                }
            }
            if (!n(this.mSubtitleTextView)) {
                b(this.mSubtitleTextView, true);
            }
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.mSubtitleTextColor = colorStateList;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.mTitleTextView;
            if (textView != null && n(textView)) {
                removeView(this.mTitleTextView);
                this.mHiddenViews.remove(this.mTitleTextView);
            }
        } else {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mTitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.mTitleTextAppearance;
                if (i4 != 0) {
                    this.mTitleTextView.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.mTitleTextColor;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!n(this.mTitleTextView)) {
                b(this.mTitleTextView, true);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.mTitleTextColor = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        int f10824b;

        /* renamed from: c, reason: collision with root package name */
        boolean f10825c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10824b = parcel.readInt();
            this.f10825c = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f10824b);
            parcel.writeInt(this.f10825c ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.view.ViewGroup
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof AbstractC1250a.C0077a) {
            return new g((AbstractC1250a.C0077a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new g((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new g(layoutParams);
    }
}
