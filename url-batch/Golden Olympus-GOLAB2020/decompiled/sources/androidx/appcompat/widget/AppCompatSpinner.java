package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.c;
import e.AbstractC2405a;
import f.AbstractC2415a;

/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f10585i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    private final AppCompatBackgroundHelper f10586a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f10587b;

    /* renamed from: c, reason: collision with root package name */
    private I f10588c;

    /* renamed from: d, reason: collision with root package name */
    private SpinnerAdapter f10589d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f10590e;

    /* renamed from: f, reason: collision with root package name */
    private g f10591f;

    /* renamed from: g, reason: collision with root package name */
    int f10592g;

    /* renamed from: h, reason: collision with root package name */
    final Rect f10593h;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        boolean f10594b;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeByte(this.f10594b ? (byte) 1 : (byte) 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f10594b = parcel.readByte() != 0;
        }
    }

    class a extends I {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ f f10595j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, f fVar) {
            super(view);
            this.f10595j = fVar;
        }

        @Override // androidx.appcompat.widget.I
        public j.e b() {
            return this.f10595j;
        }

        @Override // androidx.appcompat.widget.I
        public boolean c() {
            if (AppCompatSpinner.this.getInternalPopup().isShowing()) {
                return true;
            }
            AppCompatSpinner.this.b();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().isShowing()) {
                AppCompatSpinner.this.b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    private static final class c {
        static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (A.c.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    class d implements g, DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        androidx.appcompat.app.c f10598a;

        /* renamed from: b, reason: collision with root package name */
        private ListAdapter f10599b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f10600c;

        d() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public CharSequence b() {
            return this.f10600c;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void d(CharSequence charSequence) {
            this.f10600c = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void dismiss() {
            androidx.appcompat.app.c cVar = this.f10598a;
            if (cVar != null) {
                cVar.dismiss();
                this.f10598a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void e(int i4) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void f(int i4, int i5) {
            if (this.f10599b == null) {
                return;
            }
            c.a aVar = new c.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f10600c;
            if (charSequence != null) {
                aVar.l(charSequence);
            }
            androidx.appcompat.app.c a4 = aVar.k(this.f10599b, AppCompatSpinner.this.getSelectedItemPosition(), this).a();
            this.f10598a = a4;
            ListView e4 = a4.e();
            e4.setTextDirection(i4);
            e4.setTextAlignment(i5);
            this.f10598a.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public Drawable getBackground() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public int getHorizontalOffset() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public int getVerticalOffset() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public boolean isShowing() {
            androidx.appcompat.app.c cVar = this.f10598a;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            AppCompatSpinner.this.setSelection(i4);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i4, this.f10599b.getItemId(i4));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void setAdapter(ListAdapter listAdapter) {
            this.f10599b = listAdapter;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void setBackgroundDrawable(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void setHorizontalOffset(int i4) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void setVerticalOffset(int i4) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }
    }

    private static class e implements ListAdapter, SpinnerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private SpinnerAdapter f10602a;

        /* renamed from: b, reason: collision with root package name */
        private ListAdapter f10603b;

        public e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f10602a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f10603b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || !(spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                return;
            }
            c.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f10603b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f10602a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f10602a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i4, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            SpinnerAdapter spinnerAdapter = this.f10602a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            SpinnerAdapter spinnerAdapter = this.f10602a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i4);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i4) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            return getDropDownView(i4, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f10602a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i4) {
            ListAdapter listAdapter = this.f10603b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i4);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f10602a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f10602a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class f extends K implements g {

        /* renamed from: a, reason: collision with root package name */
        private CharSequence f10604a;

        /* renamed from: b, reason: collision with root package name */
        ListAdapter f10605b;

        /* renamed from: c, reason: collision with root package name */
        private final Rect f10606c;

        /* renamed from: d, reason: collision with root package name */
        private int f10607d;

        class a implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppCompatSpinner f10609a;

            a(AppCompatSpinner appCompatSpinner) {
                this.f10609a = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
                AppCompatSpinner.this.setSelection(i4);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    f fVar = f.this;
                    AppCompatSpinner.this.performItemClick(view, i4, fVar.f10605b.getItemId(i4));
                }
                f.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                f fVar = f.this;
                if (!fVar.n(AppCompatSpinner.this)) {
                    f.this.dismiss();
                } else {
                    f.this.l();
                    f.super.show();
                }
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f10612a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f10612a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f10612a);
                }
            }
        }

        public f(Context context, AttributeSet attributeSet, int i4) {
            super(context, attributeSet, i4);
            this.f10606c = new Rect();
            setAnchorView(AppCompatSpinner.this);
            setModal(true);
            setPromptPosition(0);
            setOnItemClickListener(new a(AppCompatSpinner.this));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public CharSequence b() {
            return this.f10604a;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void d(CharSequence charSequence) {
            this.f10604a = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void e(int i4) {
            this.f10607d = i4;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void f(int i4, int i5) {
            ViewTreeObserver viewTreeObserver;
            boolean isShowing = isShowing();
            l();
            setInputMethodMode(2);
            super.show();
            ListView listView = getListView();
            listView.setChoiceMode(1);
            listView.setTextDirection(i4);
            listView.setTextAlignment(i5);
            setSelection(AppCompatSpinner.this.getSelectedItemPosition());
            if (isShowing || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            setOnDismissListener(new c(bVar));
        }

        void l() {
            int i4;
            Drawable background = getBackground();
            if (background != null) {
                background.getPadding(AppCompatSpinner.this.f10593h);
                i4 = k0.b(AppCompatSpinner.this) ? AppCompatSpinner.this.f10593h.right : -AppCompatSpinner.this.f10593h.left;
            } else {
                Rect rect = AppCompatSpinner.this.f10593h;
                rect.right = 0;
                rect.left = 0;
                i4 = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i5 = appCompatSpinner.f10592g;
            if (i5 == -2) {
                int a4 = appCompatSpinner.a((SpinnerAdapter) this.f10605b, getBackground());
                int i6 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f10593h;
                int i7 = (i6 - rect2.left) - rect2.right;
                if (a4 > i7) {
                    a4 = i7;
                }
                setContentWidth(Math.max(a4, (width - paddingLeft) - paddingRight));
            } else if (i5 == -1) {
                setContentWidth((width - paddingLeft) - paddingRight);
            } else {
                setContentWidth(i5);
            }
            setHorizontalOffset(k0.b(AppCompatSpinner.this) ? i4 + (((width - paddingRight) - getWidth()) - m()) : i4 + paddingLeft + m());
        }

        public int m() {
            return this.f10607d;
        }

        boolean n(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.f10606c);
        }

        @Override // androidx.appcompat.widget.K, androidx.appcompat.widget.AppCompatSpinner.g
        public void setAdapter(ListAdapter listAdapter) {
            super.setAdapter(listAdapter);
            this.f10605b = listAdapter;
        }
    }

    interface g {
        CharSequence b();

        void d(CharSequence charSequence);

        void dismiss();

        void e(int i4);

        void f(int i4, int i5);

        Drawable getBackground();

        int getHorizontalOffset();

        int getVerticalOffset();

        boolean isShowing();

        void setAdapter(ListAdapter listAdapter);

        void setBackgroundDrawable(Drawable drawable);

        void setHorizontalOffset(int i4);

        void setVerticalOffset(int i4);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2405a.f36182I);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i4 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i5 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i5 = Math.max(i5, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i5;
        }
        drawable.getPadding(this.f10593h);
        Rect rect = this.f10593h;
        return i5 + rect.left + rect.right;
    }

    void b() {
        this.f10591f.f(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f10586a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.f10591f;
        return gVar != null ? gVar.getHorizontalOffset() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.f10591f;
        return gVar != null ? gVar.getVerticalOffset() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f10591f != null ? this.f10592g : super.getDropDownWidth();
    }

    final g getInternalPopup() {
        return this.f10591f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.f10591f;
        return gVar != null ? gVar.getBackground() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f10587b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.f10591f;
        return gVar != null ? gVar.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f10586a;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f10586a;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f10591f;
        if (gVar == null || !gVar.isShowing()) {
            return;
        }
        this.f10591f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f10591f == null || View.MeasureSpec.getMode(i4) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i4)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f10594b || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        g gVar = this.f10591f;
        savedState.f10594b = gVar != null && gVar.isShowing();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        I i4 = this.f10588c;
        if (i4 == null || !i4.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        g gVar = this.f10591f;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.isShowing()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f10586a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f10586a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.g(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i4) {
        g gVar = this.f10591f;
        if (gVar == null) {
            super.setDropDownHorizontalOffset(i4);
        } else {
            gVar.e(i4);
            this.f10591f.setHorizontalOffset(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i4) {
        g gVar = this.f10591f;
        if (gVar != null) {
            gVar.setVerticalOffset(i4);
        } else {
            super.setDropDownVerticalOffset(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i4) {
        if (this.f10591f != null) {
            this.f10592g = i4;
        } else {
            super.setDropDownWidth(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f10591f;
        if (gVar != null) {
            gVar.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i4) {
        setPopupBackgroundDrawable(AbstractC2415a.b(getPopupContext(), i4));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f10591f;
        if (gVar != null) {
            gVar.d(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f10586a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f10586a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.j(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f10590e) {
            this.f10589d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f10591f != null) {
            Context context = this.f10587b;
            if (context == null) {
                context = getContext();
            }
            this.f10591f.setAdapter(new e(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i4, int i5) {
        this(context, attributeSet, i4, i5, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        if (r11 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.AppCompatSpinner] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i4, int i5, Resources.Theme theme) {
        super(context, attributeSet, i4);
        TypedArray typedArray;
        this.f10593h = new Rect();
        V.a(this, getContext());
        Z v4 = Z.v(context, attributeSet, e.j.f36588x2, i4, 0);
        this.f10586a = new AppCompatBackgroundHelper(this);
        if (theme != null) {
            this.f10587b = new androidx.appcompat.view.d(context, theme);
        } else {
            int n4 = v4.n(e.j.f36373C2, 0);
            if (n4 != 0) {
                this.f10587b = new androidx.appcompat.view.d(context, n4);
            } else {
                this.f10587b = context;
            }
        }
        ?? r11 = -1;
        TypedArray typedArray2 = null;
        try {
            if (i5 == -1) {
                try {
                    typedArray = context.obtainStyledAttributes(attributeSet, f10585i, i4, 0);
                    try {
                        boolean hasValue = typedArray.hasValue(0);
                        r11 = typedArray;
                        if (hasValue) {
                            i5 = typedArray.getInt(0, 0);
                            r11 = typedArray;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                        r11 = typedArray;
                    }
                } catch (Exception e5) {
                    e = e5;
                    typedArray = null;
                } catch (Throwable th) {
                    th = th;
                    if (typedArray2 != null) {
                        typedArray2.recycle();
                    }
                    throw th;
                }
                r11.recycle();
            }
            if (i5 == 0) {
                d dVar = new d();
                this.f10591f = dVar;
                dVar.d(v4.o(e.j.f36363A2));
            } else if (i5 == 1) {
                f fVar = new f(this.f10587b, attributeSet, i4);
                Z v5 = Z.v(this.f10587b, attributeSet, e.j.f36588x2, i4, 0);
                this.f10592g = v5.m(e.j.f36368B2, -2);
                fVar.setBackgroundDrawable(v5.g(e.j.f36598z2));
                fVar.d(v4.o(e.j.f36363A2));
                v5.x();
                this.f10591f = fVar;
                this.f10588c = new a(this, fVar);
            }
            CharSequence[] q4 = v4.q(e.j.f36593y2);
            if (q4 != null) {
                ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, q4);
                arrayAdapter.setDropDownViewResource(e.g.f36341t);
                setAdapter(arrayAdapter);
            }
            v4.x();
            this.f10590e = true;
            SpinnerAdapter spinnerAdapter = this.f10589d;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.f10589d = null;
            }
            this.f10586a.e(attributeSet, i4);
        } catch (Throwable th2) {
            th = th2;
            typedArray2 = r11;
        }
    }
}
