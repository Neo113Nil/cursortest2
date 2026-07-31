package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.AbstractC1282b;
import e.AbstractC2405a;
import java.util.ArrayList;

/* loaded from: classes.dex */
class ActionMenuPresenter extends androidx.appcompat.view.menu.a implements AbstractC1282b.a {

    /* renamed from: A, reason: collision with root package name */
    c f10527A;

    /* renamed from: B, reason: collision with root package name */
    private b f10528B;

    /* renamed from: C, reason: collision with root package name */
    final f f10529C;

    /* renamed from: D, reason: collision with root package name */
    int f10530D;

    /* renamed from: k, reason: collision with root package name */
    d f10531k;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f10532l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f10533m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f10534n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f10535o;

    /* renamed from: p, reason: collision with root package name */
    private int f10536p;

    /* renamed from: q, reason: collision with root package name */
    private int f10537q;

    /* renamed from: r, reason: collision with root package name */
    private int f10538r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f10539s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f10540t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f10541u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f10542v;

    /* renamed from: w, reason: collision with root package name */
    private int f10543w;

    /* renamed from: x, reason: collision with root package name */
    private final SparseBooleanArray f10544x;

    /* renamed from: y, reason: collision with root package name */
    e f10545y;

    /* renamed from: z, reason: collision with root package name */
    a f10546z;

    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public int f10547b;

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

        SavedState(Parcel parcel) {
            this.f10547b = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f10547b);
        }
    }

    private class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, AbstractC2405a.f36195i);
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = ActionMenuPresenter.this.f10531k;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f10336i : view2);
            }
            j(ActionMenuPresenter.this.f10529C);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f10546z = null;
            actionMenuPresenter.f10530D = 0;
            super.e();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public j.e a() {
            a aVar = ActionMenuPresenter.this.f10546z;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    private class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private e f10550b;

        public c(e eVar) {
            this.f10550b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f10330c != null) {
                ((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f10330c.changeMenuMode();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f10336i;
            if (view != null && view.getWindowToken() != null && this.f10550b.m()) {
                ActionMenuPresenter.this.f10545y = this.f10550b;
            }
            ActionMenuPresenter.this.f10527A = null;
        }
    }

    private class d extends AppCompatImageView implements ActionMenuView.a {

        class a extends I {

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ ActionMenuPresenter f10553j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f10553j = actionMenuPresenter;
            }

            @Override // androidx.appcompat.widget.I
            public j.e b() {
                e eVar = ActionMenuPresenter.this.f10545y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.I
            public boolean c() {
                ActionMenuPresenter.this.K();
                return true;
            }

            @Override // androidx.appcompat.widget.I
            public boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f10527A != null) {
                    return false;
                }
                actionMenuPresenter.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, AbstractC2405a.f36194h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            e0.a(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i4, int i5, int i6, int i7) {
            boolean frame = super.setFrame(i4, i5, i6, i7);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    private class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z4) {
            super(context, eVar, view, z4, AbstractC2405a.f36195i);
            h(8388613);
            j(ActionMenuPresenter.this.f10529C);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            if (((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f10330c != null) {
                ((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f10330c.close();
            }
            ActionMenuPresenter.this.f10545y = null;
            super.e();
        }
    }

    private class f implements j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z4) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.getRootMenu().close(false);
            }
            j.a m4 = ActionMenuPresenter.this.m();
            if (m4 != null) {
                m4.a(eVar, z4);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f10330c) {
                return false;
            }
            ActionMenuPresenter.this.f10530D = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            j.a m4 = ActionMenuPresenter.this.m();
            if (m4 != null) {
                return m4.b(eVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, e.g.f36324c, e.g.f36323b);
        this.f10544x = new SparseBooleanArray();
        this.f10529C = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f10336i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.f10531k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f10533m) {
            return this.f10532l;
        }
        return null;
    }

    public boolean B() {
        Object obj;
        c cVar = this.f10527A;
        if (cVar != null && (obj = this.f10336i) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f10527A = null;
            return true;
        }
        e eVar = this.f10545y;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        a aVar = this.f10546z;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.f10527A != null || E();
    }

    public boolean E() {
        e eVar = this.f10545y;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.f10539s) {
            this.f10538r = androidx.appcompat.view.a.b(this.f10329b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f10330c;
        if (eVar != null) {
            eVar.onItemsChanged(true);
        }
    }

    public void G(boolean z4) {
        this.f10542v = z4;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f10336i = actionMenuView;
        actionMenuView.initialize(this.f10330c);
    }

    public void I(Drawable drawable) {
        d dVar = this.f10531k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f10533m = true;
            this.f10532l = drawable;
        }
    }

    public void J(boolean z4) {
        this.f10534n = z4;
        this.f10535o = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f10534n || E() || (eVar = this.f10330c) == null || this.f10336i == null || this.f10527A != null || eVar.getNonActionItems().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f10329b, this.f10330c, this.f10531k, true));
        this.f10527A = cVar;
        ((View) this.f10336i).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void a(androidx.appcompat.view.menu.e eVar, boolean z4) {
        y();
        super.a(eVar, z4);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void b(boolean z4) {
        super.b(z4);
        ((View) this.f10336i).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f10330c;
        boolean z5 = false;
        if (eVar != null) {
            ArrayList<androidx.appcompat.view.menu.g> actionItems = eVar.getActionItems();
            int size = actionItems.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractC1282b b4 = actionItems.get(i4).b();
                if (b4 != null) {
                    b4.h(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f10330c;
        ArrayList<androidx.appcompat.view.menu.g> nonActionItems = eVar2 != null ? eVar2.getNonActionItems() : null;
        if (this.f10534n && nonActionItems != null) {
            int size2 = nonActionItems.size();
            if (size2 == 1) {
                z5 = !nonActionItems.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z5 = true;
            }
        }
        if (z5) {
            if (this.f10531k == null) {
                this.f10531k = new d(this.f10328a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f10531k.getParent();
            if (viewGroup != this.f10336i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f10531k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f10336i;
                actionMenuView.addView(this.f10531k, actionMenuView.k());
            }
        } else {
            d dVar = this.f10531k;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f10336i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f10531k);
                }
            }
        }
        ((ActionMenuView) this.f10336i).setOverflowReserved(this.f10534n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.j
    public boolean c() {
        ArrayList<androidx.appcompat.view.menu.g> arrayList;
        int i4;
        int i5;
        int i6;
        boolean z4;
        int i7;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.e eVar = actionMenuPresenter.f10330c;
        View view = null;
        ?? r32 = 0;
        if (eVar != null) {
            arrayList = eVar.getVisibleItems();
            i4 = arrayList.size();
        } else {
            arrayList = null;
            i4 = 0;
        }
        int i8 = actionMenuPresenter.f10538r;
        int i9 = actionMenuPresenter.f10537q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f10336i;
        boolean z5 = false;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i4; i12++) {
            androidx.appcompat.view.menu.g gVar = arrayList.get(i12);
            if (gVar.o()) {
                i10++;
            } else if (gVar.n()) {
                i11++;
            } else {
                z5 = true;
            }
            if (actionMenuPresenter.f10542v && gVar.isActionViewExpanded()) {
                i8 = 0;
            }
        }
        if (actionMenuPresenter.f10534n && (z5 || i11 + i10 > i8)) {
            i8--;
        }
        int i13 = i8 - i10;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f10544x;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f10540t) {
            int i14 = actionMenuPresenter.f10543w;
            i6 = i9 / i14;
            i5 = i14 + ((i9 % i14) / i6);
        } else {
            i5 = 0;
            i6 = 0;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < i4) {
            androidx.appcompat.view.menu.g gVar2 = arrayList.get(i15);
            if (gVar2.o()) {
                View n4 = actionMenuPresenter.n(gVar2, view, viewGroup);
                if (actionMenuPresenter.f10540t) {
                    i6 -= ActionMenuView.q(n4, i5, i6, makeMeasureSpec, r32);
                } else {
                    n4.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n4.getMeasuredWidth();
                i9 -= measuredWidth;
                if (i16 == 0) {
                    i16 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                z4 = r32;
                i7 = i4;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z6 = sparseBooleanArray.get(groupId2);
                boolean z7 = (i13 > 0 || z6) && i9 > 0 && (!actionMenuPresenter.f10540t || i6 > 0);
                boolean z8 = z7;
                i7 = i4;
                if (z7) {
                    View n5 = actionMenuPresenter.n(gVar2, null, viewGroup);
                    if (actionMenuPresenter.f10540t) {
                        int q4 = ActionMenuView.q(n5, i5, i6, makeMeasureSpec, 0);
                        i6 -= q4;
                        if (q4 == 0) {
                            z8 = false;
                        }
                    } else {
                        n5.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z9 = z8;
                    int measuredWidth2 = n5.getMeasuredWidth();
                    i9 -= measuredWidth2;
                    if (i16 == 0) {
                        i16 = measuredWidth2;
                    }
                    z7 = z9 & (!actionMenuPresenter.f10540t ? i9 + i16 <= 0 : i9 < 0);
                }
                if (z7 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z6) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i17 = 0; i17 < i15; i17++) {
                        androidx.appcompat.view.menu.g gVar3 = arrayList.get(i17);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i13++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z7) {
                    i13--;
                }
                gVar2.u(z7);
                z4 = false;
            } else {
                z4 = r32;
                i7 = i4;
                gVar2.u(z4);
            }
            i15++;
            r32 = z4;
            i4 = i7;
            view = null;
            actionMenuPresenter = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void g(Context context, androidx.appcompat.view.menu.e eVar) {
        super.g(context, eVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a b4 = androidx.appcompat.view.a.b(context);
        if (!this.f10535o) {
            this.f10534n = b4.f();
        }
        if (!this.f10541u) {
            this.f10536p = b4.c();
        }
        if (!this.f10539s) {
            this.f10538r = b4.d();
        }
        int i4 = this.f10536p;
        if (this.f10534n) {
            if (this.f10531k == null) {
                d dVar = new d(this.f10328a);
                this.f10531k = dVar;
                if (this.f10533m) {
                    dVar.setImageDrawable(this.f10532l);
                    this.f10532l = null;
                    this.f10533m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f10531k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.f10531k.getMeasuredWidth();
        } else {
            this.f10531k = null;
        }
        this.f10537q = i4;
        this.f10543w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean h(androidx.appcompat.view.menu.m mVar) {
        boolean z4 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.m mVar2 = mVar;
        while (mVar2.getParentMenu() != this.f10330c) {
            mVar2 = (androidx.appcompat.view.menu.m) mVar2.getParentMenu();
        }
        View z5 = z(mVar2.getItem());
        if (z5 == null) {
            return false;
        }
        this.f10530D = mVar.getItem().getItemId();
        int size = mVar.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            MenuItem item = mVar.getItem(i4);
            if (item.isVisible() && item.getIcon() != null) {
                z4 = true;
                break;
            }
            i4++;
        }
        a aVar = new a(this.f10329b, mVar, z5);
        this.f10546z = aVar;
        aVar.g(z4);
        this.f10546z.k();
        super.h(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public void j(androidx.appcompat.view.menu.g gVar, k.a aVar) {
        aVar.initialize(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f10336i);
        if (this.f10528B == null) {
            this.f10528B = new b();
        }
        actionMenuItemView.setPopupCallback(this.f10528B);
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i4) {
        if (viewGroup.getChildAt(i4) == this.f10531k) {
            return false;
        }
        return super.l(viewGroup, i4);
    }

    @Override // androidx.appcompat.view.menu.a
    public View n(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.f10336i;
        androidx.appcompat.view.menu.k o4 = super.o(viewGroup);
        if (kVar != o4) {
            ((ActionMenuView) o4).setPresenter(this);
        }
        return o4;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean q(int i4, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}
