package g2;

import a.y;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.emoji2.text.t;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.oriondriftchasers.arordrft.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.a0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class r extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public final g f1788f;

    /* renamed from: g, reason: collision with root package name */
    public final t1.b f1789g;

    /* renamed from: h, reason: collision with root package name */
    public final l f1790h;
    public j.h i;

    /* renamed from: j, reason: collision with root package name */
    public p f1791j;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    public r(Context context, AttributeSet attributeSet) {
        super(q2.a.a(context, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView), attributeSet, R.attr.bottomNavigationStyle);
        ?? r10;
        l lVar = new l();
        lVar.f1780g = false;
        this.f1790h = lVar;
        Context context2 = getContext();
        t g4 = e2.o.g(context2, attributeSet, n1.a.A, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, 17, 15);
        g gVar = new g(context2, getClass(), getMaxItemCount());
        this.f1788f = gVar;
        t1.b bVar = new t1.b(context2);
        this.f1789g = bVar;
        bVar.setMinimumHeight(getSuggestedMinimumHeight());
        bVar.setCollapsedMaxItemCount(getCollapsedMaxItemCount());
        lVar.f1779f = bVar;
        lVar.f1781h = 1;
        bVar.setPresenter(lVar);
        gVar.b(lVar, gVar.f2060a);
        lVar.g(getContext(), gVar);
        TypedArray typedArray = (TypedArray) g4.f356c;
        if (typedArray.hasValue(11)) {
            bVar.setIconTintList(g4.m(11));
        } else {
            bVar.setIconTintList(bVar.b());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(10, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(17)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(17, 0));
        }
        if (typedArray.hasValue(15)) {
            setItemTextAppearanceActive(typedArray.getResourceId(15, 0));
        }
        if (typedArray.hasValue(4)) {
            setHorizontalItemTextAppearanceInactive(typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(3)) {
            setHorizontalItemTextAppearanceActive(typedArray.getResourceId(3, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(16, true));
        if (typedArray.hasValue(18)) {
            setItemTextColor(g4.m(18));
        }
        Drawable background = getBackground();
        ColorStateList C = y.C(background);
        if (background == null || C != null) {
            l2.j jVar = new l2.j(l2.n.c(context2, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView).a());
            if (C != null) {
                jVar.q(C);
            }
            jVar.m(context2);
            setBackground(jVar);
        }
        if (typedArray.hasValue(13)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(13, 0));
        }
        if (typedArray.hasValue(12)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(12, 0));
        }
        if (typedArray.hasValue(0)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(0, 0));
        }
        if (typedArray.hasValue(5)) {
            setIconLabelHorizontalSpacing(typedArray.getDimensionPixelSize(5, 0));
        }
        if (typedArray.hasValue(2)) {
            setElevation(typedArray.getDimensionPixelSize(2, 0));
        }
        getBackground().mutate().setTintList(h.a.u(context2, g4, 1));
        setLabelVisibilityMode(typedArray.getInteger(21, -1));
        setItemIconGravity(typedArray.getInteger(9, 0));
        setItemGravity(typedArray.getInteger(8, 49));
        int resourceId = typedArray.getResourceId(7, 0);
        if (resourceId != 0) {
            bVar.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(h.a.u(context2, g4, 14));
        }
        setMeasureBottomPaddingFromLabelBaseline(typedArray.getBoolean(22, true));
        setLabelFontScalingEnabled(typedArray.getBoolean(19, false));
        setLabelMaxLines(typedArray.getInteger(20, 1));
        int resourceId2 = typedArray.getResourceId(6, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, n1.a.f2833z);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            setItemActiveIndicatorWidth(dimensionPixelSize);
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(10, 0);
            setItemActiveIndicatorMarginHorizontal(dimensionPixelOffset);
            String string = obtainStyledAttributes.getString(9);
            int i = -2;
            if (string != null) {
                if (String.valueOf(-1).equals(string)) {
                    i = -1;
                } else if (!String.valueOf(-2).equals(string)) {
                    i = obtainStyledAttributes.getDimensionPixelSize(9, -2);
                }
            }
            setItemActiveIndicatorExpandedWidth(i);
            setItemActiveIndicatorExpandedHeight(obtainStyledAttributes.getDimensionPixelSize(7, dimensionPixelSize));
            setItemActiveIndicatorExpandedMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(8, dimensionPixelOffset));
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.m3_navigation_item_leading_trailing_space);
            int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(5, dimensionPixelSize2);
            int dimensionPixelOffset3 = obtainStyledAttributes.getDimensionPixelOffset(4, dimensionPixelSize2);
            int i4 = getLayoutDirection() == 1 ? dimensionPixelOffset3 : dimensionPixelOffset2;
            int dimensionPixelOffset4 = obtainStyledAttributes.getDimensionPixelOffset(6, 0);
            dimensionPixelOffset2 = getLayoutDirection() != 1 ? dimensionPixelOffset3 : dimensionPixelOffset2;
            int dimensionPixelOffset5 = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            Rect rect = bVar.d0;
            rect.left = i4;
            rect.top = dimensionPixelOffset4;
            rect.right = dimensionPixelOffset2;
            rect.bottom = dimensionPixelOffset5;
            i[] iVarArr = bVar.f1762l;
            if (iVarArr != null) {
                for (i iVar : iVarArr) {
                    if (iVar instanceof f) {
                        ((f) iVar).setActiveIndicatorExpandedPadding(rect);
                    }
                }
            }
            setItemActiveIndicatorColor(h.a.t(context2, obtainStyledAttributes, 2));
            r10 = 0;
            setItemActiveIndicatorShapeAppearance(l2.n.a(context2, obtainStyledAttributes.getResourceId(11, 0), 0).a());
            obtainStyledAttributes.recycle();
        } else {
            r10 = 0;
        }
        if (typedArray.hasValue(23)) {
            int resourceId3 = typedArray.getResourceId(23, r10);
            l lVar2 = this.f1790h;
            lVar2.f1780g = true;
            getMenuInflater().inflate(resourceId3, this.f1788f);
            lVar2.f1780g = r10;
            lVar2.m(true);
        }
        g4.y();
        addView(this.f1789g);
        this.f1788f.f2063e = new n((BottomNavigationView) this);
    }

    private MenuInflater getMenuInflater() {
        if (this.i == null) {
            this.i = new j.h(getContext());
        }
        return this.i;
    }

    private void setMeasureBottomPaddingFromLabelBaseline(boolean z3) {
        this.f1789g.setMeasurePaddingFromLabelBaseline(z3);
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f1789g.getActiveIndicatorLabelPadding();
    }

    public int getCollapsedMaxItemCount() {
        return getMaxItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f1789g.getHorizontalItemTextAppearanceActive();
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f1789g.getHorizontalItemTextAppearanceInactive();
    }

    public int getIconLabelHorizontalSpacing() {
        return this.f1789g.getIconLabelHorizontalSpacing();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f1789g.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.f1789g.getItemActiveIndicatorExpandedHeight();
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.f1789g.getItemActiveIndicatorExpandedMarginHorizontal();
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.f1789g.getItemActiveIndicatorExpandedWidth();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f1789g.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f1789g.getItemActiveIndicatorMarginHorizontal();
    }

    public l2.n getItemActiveIndicatorShapeAppearance() {
        return this.f1789g.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f1789g.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f1789g.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f1789g.getItemBackgroundRes();
    }

    public int getItemGravity() {
        return this.f1789g.getItemGravity();
    }

    public int getItemIconGravity() {
        return this.f1789g.getItemIconGravity();
    }

    public int getItemIconSize() {
        return this.f1789g.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f1789g.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f1789g.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f1789g.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f1789g.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f1789g.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f1789g.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f1789g.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f1789g.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f1788f;
    }

    public a0 getMenuView() {
        return this.f1789g;
    }

    public ViewGroup getMenuViewGroup() {
        return this.f1789g;
    }

    public l getPresenter() {
        return this.f1790h;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f1789g.getScaleLabelTextWithFont();
    }

    public int getSelectedItemId() {
        return this.f1789g.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof l2.j) {
            h.a.k0(this, (l2.j) background);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof q)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        q qVar = (q) parcelable;
        super.onRestoreInstanceState(qVar.f3175f);
        Bundle bundle = qVar.f1787h;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1788f.f2078u;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            k.y yVar = (k.y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = yVar.getId();
                if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    yVar.j(parcelable2);
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable i;
        q qVar = new q(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        qVar.f1787h = bundle;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1788f.f2078u;
        if (copyOnWriteArrayList.isEmpty()) {
            return qVar;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            k.y yVar = (k.y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = yVar.getId();
                if (id > 0 && (i = yVar.i()) != null) {
                    sparseArray.put(id, i);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return qVar;
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.f1789g.setActiveIndicatorLabelPadding(i);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof l2.j) {
            ((l2.j) background).p(f2);
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i) {
        this.f1789g.setHorizontalItemTextAppearanceActive(i);
    }

    public void setHorizontalItemTextAppearanceInactive(int i) {
        this.f1789g.setHorizontalItemTextAppearanceInactive(i);
    }

    public void setIconLabelHorizontalSpacing(int i) {
        this.f1789g.setIconLabelHorizontalSpacing(i);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f1789g.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z3) {
        this.f1789g.setItemActiveIndicatorEnabled(z3);
    }

    public void setItemActiveIndicatorExpandedHeight(int i) {
        this.f1789g.setItemActiveIndicatorExpandedHeight(i);
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i) {
        this.f1789g.setItemActiveIndicatorExpandedMarginHorizontal(i);
    }

    public void setItemActiveIndicatorExpandedWidth(int i) {
        this.f1789g.setItemActiveIndicatorExpandedWidth(i);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f1789g.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f1789g.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(l2.n nVar) {
        this.f1789g.setItemActiveIndicatorShapeAppearance(nVar);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f1789g.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.f1789g.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.f1789g.setItemBackgroundRes(i);
    }

    public void setItemGravity(int i) {
        t1.b bVar = this.f1789g;
        if (bVar.getItemGravity() != i) {
            bVar.setItemGravity(i);
            this.f1790h.m(false);
        }
    }

    public void setItemIconGravity(int i) {
        t1.b bVar = this.f1789g;
        if (bVar.getItemIconGravity() != i) {
            bVar.setItemIconGravity(i);
            this.f1790h.m(false);
        }
    }

    public void setItemIconSize(int i) {
        this.f1789g.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f1789g.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.f1789g.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.f1789g.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f1789g.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.f1789g.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z3) {
        this.f1789g.setItemTextAppearanceActiveBoldEnabled(z3);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f1789g.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f1789g.setItemTextColor(colorStateList);
    }

    public void setLabelFontScalingEnabled(boolean z3) {
        this.f1789g.setLabelFontScalingEnabled(z3);
    }

    public void setLabelMaxLines(int i) {
        this.f1789g.setLabelMaxLines(i);
    }

    public void setLabelVisibilityMode(int i) {
        t1.b bVar = this.f1789g;
        if (bVar.getLabelVisibilityMode() != i) {
            bVar.setLabelVisibilityMode(i);
            this.f1790h.m(false);
        }
    }

    public void setOnItemSelectedListener(p pVar) {
        this.f1791j = pVar;
    }

    public void setSelectedItemId(int i) {
        g gVar = this.f1788f;
        MenuItem findItem = gVar.findItem(i);
        if (findItem != null) {
            boolean q3 = gVar.q(findItem, this.f1790h, 0);
            if (findItem.isCheckable()) {
                if (!q3 || findItem.isChecked()) {
                    this.f1789g.setCheckedItem(findItem);
                }
            }
        }
    }

    public void setOnItemReselectedListener(o oVar) {
    }
}
