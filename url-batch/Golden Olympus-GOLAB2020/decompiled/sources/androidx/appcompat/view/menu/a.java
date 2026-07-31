package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a implements j {

    /* renamed from: a, reason: collision with root package name */
    protected Context f10328a;

    /* renamed from: b, reason: collision with root package name */
    protected Context f10329b;

    /* renamed from: c, reason: collision with root package name */
    protected e f10330c;

    /* renamed from: d, reason: collision with root package name */
    protected LayoutInflater f10331d;

    /* renamed from: e, reason: collision with root package name */
    protected LayoutInflater f10332e;

    /* renamed from: f, reason: collision with root package name */
    private j.a f10333f;

    /* renamed from: g, reason: collision with root package name */
    private int f10334g;

    /* renamed from: h, reason: collision with root package name */
    private int f10335h;

    /* renamed from: i, reason: collision with root package name */
    protected k f10336i;

    /* renamed from: j, reason: collision with root package name */
    private int f10337j;

    public a(Context context, int i4, int i5) {
        this.f10328a = context;
        this.f10331d = LayoutInflater.from(context);
        this.f10334g = i4;
        this.f10335h = i5;
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z4) {
        j.a aVar = this.f10333f;
        if (aVar != null) {
            aVar.a(eVar, z4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public void b(boolean z4) {
        ViewGroup viewGroup = (ViewGroup) this.f10336i;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f10330c;
        int i4 = 0;
        if (eVar != null) {
            eVar.flagActionItems();
            ArrayList<g> visibleItems = this.f10330c.getVisibleItems();
            int size = visibleItems.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                g gVar = visibleItems.get(i6);
                if (q(i5, gVar)) {
                    View childAt = viewGroup.getChildAt(i5);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View n4 = n(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        n4.setPressed(false);
                        n4.jumpDrawablesToCurrentState();
                    }
                    if (n4 != childAt) {
                        i(n4, i5);
                    }
                    i5++;
                }
            }
            i4 = i5;
        }
        while (i4 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i4)) {
                i4++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean d(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(j.a aVar) {
        this.f10333f = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void g(Context context, e eVar) {
        this.f10329b = context;
        this.f10332e = LayoutInflater.from(context);
        this.f10330c = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.j
    public boolean h(m mVar) {
        j.a aVar = this.f10333f;
        m mVar2 = mVar;
        if (aVar == null) {
            return false;
        }
        if (mVar == null) {
            mVar2 = this.f10330c;
        }
        return aVar.b(mVar2);
    }

    protected void i(View view, int i4) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f10336i).addView(view, i4);
    }

    public abstract void j(g gVar, k.a aVar);

    public k.a k(ViewGroup viewGroup) {
        return (k.a) this.f10331d.inflate(this.f10335h, viewGroup, false);
    }

    protected boolean l(ViewGroup viewGroup, int i4) {
        viewGroup.removeViewAt(i4);
        return true;
    }

    public j.a m() {
        return this.f10333f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(g gVar, View view, ViewGroup viewGroup) {
        k.a k4 = view instanceof k.a ? (k.a) view : k(viewGroup);
        j(gVar, k4);
        return (View) k4;
    }

    public k o(ViewGroup viewGroup) {
        if (this.f10336i == null) {
            k kVar = (k) this.f10331d.inflate(this.f10334g, viewGroup, false);
            this.f10336i = kVar;
            kVar.initialize(this.f10330c);
            b(true);
        }
        return this.f10336i;
    }

    public void p(int i4) {
        this.f10337j = i4;
    }

    public abstract boolean q(int i4, g gVar);
}
