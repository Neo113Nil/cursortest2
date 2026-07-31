package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.e;
import e.AbstractC2405a;

/* loaded from: classes.dex */
public class N {

    /* renamed from: a, reason: collision with root package name */
    private final Context f10706a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.appcompat.view.menu.e f10707b;

    /* renamed from: c, reason: collision with root package name */
    private final View f10708c;

    /* renamed from: d, reason: collision with root package name */
    final androidx.appcompat.view.menu.i f10709d;

    class a implements e.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            N.this.getClass();
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
        }
    }

    class b implements PopupWindow.OnDismissListener {
        b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            N.this.getClass();
        }
    }

    public N(Context context, View view, int i4) {
        this(context, view, i4, AbstractC2405a.f36177D, 0);
    }

    public Menu a() {
        return this.f10707b;
    }

    public void b() {
        this.f10709d.k();
    }

    public N(Context context, View view, int i4, int i5, int i6) {
        this.f10706a = context;
        this.f10708c = view;
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        this.f10707b = eVar;
        eVar.setCallback(new a());
        androidx.appcompat.view.menu.i iVar = new androidx.appcompat.view.menu.i(context, eVar, view, false, i5, i6);
        this.f10709d = iVar;
        iVar.h(i4);
        iVar.i(new b());
    }
}
