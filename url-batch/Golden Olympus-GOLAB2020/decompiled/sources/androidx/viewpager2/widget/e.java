package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* loaded from: classes.dex */
final class e extends RecyclerView.u {

    /* renamed from: a, reason: collision with root package name */
    private ViewPager2.i f13279a;

    /* renamed from: b, reason: collision with root package name */
    private final ViewPager2 f13280b;

    /* renamed from: c, reason: collision with root package name */
    private final RecyclerView f13281c;

    /* renamed from: d, reason: collision with root package name */
    private final LinearLayoutManager f13282d;

    /* renamed from: e, reason: collision with root package name */
    private int f13283e;

    /* renamed from: f, reason: collision with root package name */
    private int f13284f;

    /* renamed from: g, reason: collision with root package name */
    private a f13285g;

    /* renamed from: h, reason: collision with root package name */
    private int f13286h;

    /* renamed from: i, reason: collision with root package name */
    private int f13287i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13288j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13289k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f13290l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f13291m;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f13292a;

        /* renamed from: b, reason: collision with root package name */
        float f13293b;

        /* renamed from: c, reason: collision with root package name */
        int f13294c;

        a() {
        }

        void a() {
            this.f13292a = -1;
            this.f13293b = 0.0f;
            this.f13294c = 0;
        }
    }

    e(ViewPager2 viewPager2) {
        this.f13280b = viewPager2;
        RecyclerView recyclerView = viewPager2.f13238j;
        this.f13281c = recyclerView;
        this.f13282d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f13285g = new a();
        l();
    }

    private void a(int i4, float f4, int i5) {
        ViewPager2.i iVar = this.f13279a;
        if (iVar != null) {
            iVar.onPageScrolled(i4, f4, i5);
        }
    }

    private void b(int i4) {
        ViewPager2.i iVar = this.f13279a;
        if (iVar != null) {
            iVar.onPageSelected(i4);
        }
    }

    private void c(int i4) {
        if ((this.f13283e == 3 && this.f13284f == 0) || this.f13284f == i4) {
            return;
        }
        this.f13284f = i4;
        ViewPager2.i iVar = this.f13279a;
        if (iVar != null) {
            iVar.onPageScrollStateChanged(i4);
        }
    }

    private int d() {
        return this.f13282d.findFirstVisibleItemPosition();
    }

    private boolean i() {
        int i4 = this.f13283e;
        return i4 == 1 || i4 == 4;
    }

    private void l() {
        this.f13283e = 0;
        this.f13284f = 0;
        this.f13285g.a();
        this.f13286h = -1;
        this.f13287i = -1;
        this.f13288j = false;
        this.f13289k = false;
        this.f13291m = false;
        this.f13290l = false;
    }

    private void n(boolean z4) {
        this.f13291m = z4;
        this.f13283e = z4 ? 4 : 1;
        int i4 = this.f13287i;
        if (i4 != -1) {
            this.f13286h = i4;
            this.f13287i = -1;
        } else if (this.f13286h == -1) {
            this.f13286h = d();
        }
        c(1);
    }

    private void o() {
        int top;
        a aVar = this.f13285g;
        int findFirstVisibleItemPosition = this.f13282d.findFirstVisibleItemPosition();
        aVar.f13292a = findFirstVisibleItemPosition;
        if (findFirstVisibleItemPosition == -1) {
            aVar.a();
            return;
        }
        View findViewByPosition = this.f13282d.findViewByPosition(findFirstVisibleItemPosition);
        if (findViewByPosition == null) {
            aVar.a();
            return;
        }
        int leftDecorationWidth = this.f13282d.getLeftDecorationWidth(findViewByPosition);
        int rightDecorationWidth = this.f13282d.getRightDecorationWidth(findViewByPosition);
        int topDecorationHeight = this.f13282d.getTopDecorationHeight(findViewByPosition);
        int bottomDecorationHeight = this.f13282d.getBottomDecorationHeight(findViewByPosition);
        ViewGroup.LayoutParams layoutParams = findViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = findViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = findViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.f13282d.getOrientation() == 0) {
            top = (findViewByPosition.getLeft() - leftDecorationWidth) - this.f13281c.getPaddingLeft();
            if (this.f13280b.e()) {
                top = -top;
            }
            height = width;
        } else {
            top = (findViewByPosition.getTop() - topDecorationHeight) - this.f13281c.getPaddingTop();
        }
        int i4 = -top;
        aVar.f13294c = i4;
        if (i4 >= 0) {
            aVar.f13293b = height == 0 ? 0.0f : i4 / height;
        } else {
            if (!new androidx.viewpager2.widget.a(this.f13282d).d()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f13294c)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }

    double e() {
        o();
        a aVar = this.f13285g;
        return aVar.f13292a + aVar.f13293b;
    }

    int f() {
        return this.f13284f;
    }

    boolean g() {
        return this.f13291m;
    }

    boolean h() {
        return this.f13284f == 0;
    }

    void j() {
        this.f13290l = true;
    }

    void k(int i4, boolean z4) {
        this.f13283e = z4 ? 2 : 3;
        this.f13291m = false;
        boolean z5 = this.f13287i != i4;
        this.f13287i = i4;
        c(2);
        if (z5) {
            b(i4);
        }
    }

    void m(ViewPager2.i iVar) {
        this.f13279a = iVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
        if (!(this.f13283e == 1 && this.f13284f == 1) && i4 == 1) {
            n(false);
            return;
        }
        if (i() && i4 == 2) {
            if (this.f13289k) {
                c(2);
                this.f13288j = true;
                return;
            }
            return;
        }
        if (i() && i4 == 0) {
            o();
            if (this.f13289k) {
                a aVar = this.f13285g;
                if (aVar.f13294c == 0) {
                    int i5 = this.f13286h;
                    int i6 = aVar.f13292a;
                    if (i5 != i6) {
                        b(i6);
                    }
                }
            } else {
                int i7 = this.f13285g.f13292a;
                if (i7 != -1) {
                    a(i7, 0.0f, 0);
                }
            }
            c(0);
            l();
        }
        if (this.f13283e == 2 && i4 == 0 && this.f13290l) {
            o();
            a aVar2 = this.f13285g;
            if (aVar2.f13294c == 0) {
                int i8 = this.f13287i;
                int i9 = aVar2.f13292a;
                if (i8 != i9) {
                    if (i9 == -1) {
                        i9 = 0;
                    }
                    b(i9);
                }
                c(0);
                l();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if ((r5 < 0) == r3.f13280b.e()) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // androidx.recyclerview.widget.RecyclerView.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
        int i6;
        this.f13289k = true;
        o();
        if (this.f13288j) {
            this.f13288j = false;
            if (i5 <= 0) {
                if (i5 == 0) {
                }
                i6 = this.f13285g.f13292a;
                this.f13287i = i6;
                if (this.f13286h != i6) {
                    b(i6);
                }
            }
            a aVar = this.f13285g;
            if (aVar.f13294c != 0) {
                i6 = aVar.f13292a + 1;
                this.f13287i = i6;
                if (this.f13286h != i6) {
                }
            }
            i6 = this.f13285g.f13292a;
            this.f13287i = i6;
            if (this.f13286h != i6) {
            }
        } else if (this.f13283e == 0) {
            int i7 = this.f13285g.f13292a;
            if (i7 == -1) {
                i7 = 0;
            }
            b(i7);
        }
        a aVar2 = this.f13285g;
        int i8 = aVar2.f13292a;
        if (i8 == -1) {
            i8 = 0;
        }
        a(i8, aVar2.f13293b, aVar2.f13294c);
        a aVar3 = this.f13285g;
        int i9 = aVar3.f13292a;
        int i10 = this.f13287i;
        if ((i9 == i10 || i10 == -1) && aVar3.f13294c == 0 && this.f13284f != 1) {
            c(0);
            l();
        }
    }
}
