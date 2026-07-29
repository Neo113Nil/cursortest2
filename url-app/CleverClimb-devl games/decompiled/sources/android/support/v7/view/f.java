package android.support.v7.view;

import android.content.Context;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.util.SimpleArrayMap;
import android.support.v7.view.b;
import android.support.v7.view.menu.n;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

/* compiled from: SupportActionModeWrapper.java */
/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    final Context f1703a;

    /* renamed from: b, reason: collision with root package name */
    final b f1704b;

    public f(Context context, b bVar) {
        this.f1703a = context;
        this.f1704b = bVar;
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f1704b.j();
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f1704b.a(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f1704b.b(charSequence);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f1704b.a(charSequence);
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f1704b.d();
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f1704b.c();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return n.a(this.f1703a, (SupportMenu) this.f1704b.b());
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f1704b.f();
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f1704b.a(i);
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f1704b.g();
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f1704b.b(i);
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f1704b.i();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f1704b.a(view);
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f1704b.a();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f1704b.k();
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f1704b.a(z);
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f1704b.h();
    }

    /* compiled from: SupportActionModeWrapper.java */
    public static class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f1705a;

        /* renamed from: b, reason: collision with root package name */
        final Context f1706b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList<f> f1707c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        final SimpleArrayMap<Menu, Menu> f1708d = new SimpleArrayMap<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f1706b = context;
            this.f1705a = callback;
        }

        @Override // android.support.v7.view.b.a
        public boolean a(b bVar, Menu menu) {
            return this.f1705a.onCreateActionMode(b(bVar), a(menu));
        }

        @Override // android.support.v7.view.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f1705a.onPrepareActionMode(b(bVar), a(menu));
        }

        @Override // android.support.v7.view.b.a
        public boolean a(b bVar, MenuItem menuItem) {
            return this.f1705a.onActionItemClicked(b(bVar), n.a(this.f1706b, (SupportMenuItem) menuItem));
        }

        @Override // android.support.v7.view.b.a
        public void a(b bVar) {
            this.f1705a.onDestroyActionMode(b(bVar));
        }

        private Menu a(Menu menu) {
            Menu menu2 = this.f1708d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu a2 = n.a(this.f1706b, (SupportMenu) menu);
            this.f1708d.put(menu, a2);
            return a2;
        }

        public ActionMode b(b bVar) {
            int size = this.f1707c.size();
            for (int i = 0; i < size; i++) {
                f fVar = this.f1707c.get(i);
                if (fVar != null && fVar.f1704b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f1706b, bVar);
            this.f1707c.add(fVar2);
            return fVar2;
        }
    }
}
