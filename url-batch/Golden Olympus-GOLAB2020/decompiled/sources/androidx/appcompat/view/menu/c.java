package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    Context f10375a;

    /* renamed from: b, reason: collision with root package name */
    LayoutInflater f10376b;

    /* renamed from: c, reason: collision with root package name */
    e f10377c;

    /* renamed from: d, reason: collision with root package name */
    ExpandedMenuView f10378d;

    /* renamed from: e, reason: collision with root package name */
    int f10379e;

    /* renamed from: f, reason: collision with root package name */
    int f10380f;

    /* renamed from: g, reason: collision with root package name */
    int f10381g;

    /* renamed from: h, reason: collision with root package name */
    private j.a f10382h;

    /* renamed from: i, reason: collision with root package name */
    a f10383i;

    private class a extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        private int f10384a = -1;

        public a() {
            a();
        }

        void a() {
            g expandedItem = c.this.f10377c.getExpandedItem();
            if (expandedItem != null) {
                ArrayList<g> nonActionItems = c.this.f10377c.getNonActionItems();
                int size = nonActionItems.size();
                for (int i4 = 0; i4 < size; i4++) {
                    if (nonActionItems.get(i4) == expandedItem) {
                        this.f10384a = i4;
                        return;
                    }
                }
            }
            this.f10384a = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i4) {
            ArrayList<g> nonActionItems = c.this.f10377c.getNonActionItems();
            int i5 = i4 + c.this.f10379e;
            int i6 = this.f10384a;
            if (i6 >= 0 && i5 >= i6) {
                i5++;
            }
            return nonActionItems.get(i5);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f10377c.getNonActionItems().size() - c.this.f10379e;
            return this.f10384a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f10376b.inflate(cVar.f10381g, viewGroup, false);
            }
            ((k.a) view).initialize(getItem(i4), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i4) {
        this(i4, 0);
        this.f10375a = context;
        this.f10376b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z4) {
        j.a aVar = this.f10382h;
        if (aVar != null) {
            aVar.a(eVar, z4);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(boolean z4) {
        a aVar = this.f10383i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c() {
        return false;
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
        this.f10382h = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void g(Context context, e eVar) {
        if (this.f10380f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f10380f);
            this.f10375a = contextThemeWrapper;
            this.f10376b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f10375a != null) {
            this.f10375a = context;
            if (this.f10376b == null) {
                this.f10376b = LayoutInflater.from(context);
            }
        }
        this.f10377c = eVar;
        a aVar = this.f10383i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).d(null);
        j.a aVar = this.f10382h;
        if (aVar == null) {
            return true;
        }
        aVar.b(mVar);
        return true;
    }

    public ListAdapter i() {
        if (this.f10383i == null) {
            this.f10383i = new a();
        }
        return this.f10383i;
    }

    public k j(ViewGroup viewGroup) {
        if (this.f10378d == null) {
            this.f10378d = (ExpandedMenuView) this.f10376b.inflate(e.g.f36328g, viewGroup, false);
            if (this.f10383i == null) {
                this.f10383i = new a();
            }
            this.f10378d.setAdapter((ListAdapter) this.f10383i);
            this.f10378d.setOnItemClickListener(this);
        }
        return this.f10378d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        this.f10377c.performItemAction(this.f10383i.getItem(i4), this, 0);
    }

    public c(int i4, int i5) {
        this.f10381g = i4;
        this.f10380f = i5;
    }
}
