package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import java.util.ArrayList;
import x.InterfaceMenuC3510a;
import x.InterfaceMenuItemC3511b;

/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    final Context f10239a;

    /* renamed from: b, reason: collision with root package name */
    final b f10240b;

    public static class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f10241a;

        /* renamed from: b, reason: collision with root package name */
        final Context f10242b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList f10243c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        final androidx.collection.g f10244d = new androidx.collection.g();

        public a(Context context, ActionMode.Callback callback) {
            this.f10242b = context;
            this.f10241a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f10244d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            j.d dVar = new j.d(this.f10242b, (InterfaceMenuC3510a) menu);
            this.f10244d.put(menu, dVar);
            return dVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(b bVar) {
            this.f10241a.onDestroyActionMode(e(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f10241a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f10241a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(b bVar, MenuItem menuItem) {
            return this.f10241a.onActionItemClicked(e(bVar), new j.c(this.f10242b, (InterfaceMenuItemC3511b) menuItem));
        }

        public ActionMode e(b bVar) {
            int size = this.f10243c.size();
            for (int i4 = 0; i4 < size; i4++) {
                f fVar = (f) this.f10243c.get(i4);
                if (fVar != null && fVar.f10240b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f10242b, bVar);
            this.f10243c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f10239a = context;
        this.f10240b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f10240b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f10240b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new j.d(this.f10239a, (InterfaceMenuC3510a) this.f10240b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f10240b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f10240b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f10240b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f10240b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f10240b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f10240b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f10240b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f10240b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f10240b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f10240b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f10240b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z4) {
        this.f10240b.s(z4);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i4) {
        this.f10240b.n(i4);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i4) {
        this.f10240b.q(i4);
    }
}
