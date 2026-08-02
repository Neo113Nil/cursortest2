package defpackage;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aij extends bd implements aiq, aio, aip, ahn {
    public air a;
    public RecyclerView b;
    private boolean d;
    private boolean e;
    private final aif c = new aif(this);
    private int f = R.layout.preference_list_fragment;
    private final Handler aj = new aie(this, Looper.getMainLooper());
    private final Runnable ak = new nc(this, 16, null);

    @Override // defpackage.bd
    public View I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        TypedArray obtainStyledAttributes = y().obtainStyledAttributes(null, aiv.h, R.attr.preferenceFragmentCompatStyle, 0);
        this.f = obtainStyledAttributes.getResourceId(0, this.f);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(y());
        View inflate = cloneInContext.inflate(this.f, viewGroup, false);
        View findViewById = inflate.findViewById(android.R.id.list_container);
        if (!(findViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        if (!y().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) cloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
            y();
            recyclerView.Y(new LinearLayoutManager(1));
            recyclerView.W(new ait(recyclerView));
        }
        if (recyclerView == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.b = recyclerView;
        aif aifVar = this.c;
        recyclerView.av(aifVar);
        if (drawable != null) {
            aifVar.b = drawable.getIntrinsicHeight();
        } else {
            aifVar.b = 0;
        }
        aifVar.a = drawable;
        aij aijVar = aifVar.d;
        aijVar.b.K();
        if (dimensionPixelSize != -1) {
            aifVar.b = dimensionPixelSize;
            aijVar.b.K();
        }
        aifVar.c = z;
        if (this.b.getParent() == null) {
            viewGroup2.addView(this.b);
        }
        this.aj.post(this.ak);
        return inflate;
    }

    @Override // defpackage.ahn
    public final Preference a(CharSequence charSequence) {
        air airVar = this.a;
        if (airVar == null) {
            return null;
        }
        return airVar.d(charSequence);
    }

    @Override // defpackage.aip
    public final void aF() {
        boolean z = false;
        for (bd bdVar = this; !z && bdVar != null; bdVar = bdVar.F) {
            if (bdVar instanceof aii) {
                z = ((aii) bdVar).a();
            }
        }
        if (!z && (x() instanceof aii)) {
            z = ((aii) x()).a();
        }
        if (z || !(D() instanceof aii)) {
            return;
        }
        ((aii) D()).a();
    }

    @Override // defpackage.bd
    public void ad(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen d;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (d = d()) != null) {
            d.u(bundle2);
        }
        if (this.d) {
            n();
        }
        this.e = true;
    }

    public final PreferenceScreen d() {
        air airVar = this.a;
        if (airVar == null) {
            return null;
        }
        return airVar.c;
    }

    @Override // defpackage.bd
    public void f(Bundle bundle) {
        super.f(bundle);
        TypedValue typedValue = new TypedValue();
        y().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        y().getTheme().applyStyle(i, false);
        air airVar = new air(y());
        this.a = airVar;
        airVar.f = this;
        Bundle bundle2 = this.n;
        r(bundle2 != null ? bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // defpackage.bd
    public void g() {
        Handler handler = this.aj;
        handler.removeCallbacks(this.ak);
        handler.removeMessages(1);
        if (this.d) {
            this.b.X(null);
            PreferenceScreen d = d();
            if (d != null) {
                d.A();
            }
        }
        this.b = null;
        super.g();
    }

    @Override // defpackage.bd
    public void i(Bundle bundle) {
        PreferenceScreen d = d();
        if (d != null) {
            Bundle bundle2 = new Bundle();
            d.v(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // defpackage.bd
    public void j() {
        super.j();
        air airVar = this.a;
        airVar.d = this;
        airVar.e = this;
    }

    @Override // defpackage.bd
    public void k() {
        super.k();
        air airVar = this.a;
        airVar.d = null;
        airVar.e = null;
    }

    final void n() {
        PreferenceScreen d = d();
        if (d != null) {
            this.b.X(new aim(d));
            d.y();
        }
    }

    @Override // defpackage.aio
    public final void o(Preference preference) {
        ar ahyVar;
        boolean z = false;
        for (bd bdVar = this; !z && bdVar != null; bdVar = bdVar.F) {
            if (bdVar instanceof aig) {
                z = ((aig) bdVar).a();
            }
        }
        if (!z && (x() instanceof aig)) {
            z = ((aig) x()).a();
        }
        if (z) {
            return;
        }
        if (!((D() instanceof aig) && ((aig) D()).a()) && G().d("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                String str = preference.s;
                ahyVar = new ahq();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                ahyVar.ah(bundle);
            } else if (preference instanceof ListPreference) {
                String str2 = preference.s;
                ahyVar = new ahv();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                ahyVar.ah(bundle2);
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                String str3 = preference.s;
                ahyVar = new ahy();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                ahyVar.ah(bundle3);
            }
            ahyVar.ax(this);
            ahyVar.o(G(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    public final void p(PreferenceScreen preferenceScreen) {
        air airVar;
        PreferenceScreen preferenceScreen2;
        if (preferenceScreen == null || preferenceScreen == (preferenceScreen2 = (airVar = this.a).c)) {
            return;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.A();
        }
        airVar.c = preferenceScreen;
        this.d = true;
        if (this.e) {
            Handler handler = this.aj;
            if (handler.hasMessages(1)) {
                return;
            }
            handler.obtainMessage(1).sendToTarget();
        }
    }

    @Override // defpackage.aiq
    public final boolean q(Preference preference) {
        if (preference.u == null) {
            return false;
        }
        boolean z = false;
        for (bd bdVar = this; !z && bdVar != null; bdVar = bdVar.F) {
            if (bdVar instanceof aih) {
                z = ((aih) bdVar).a();
            }
        }
        if (!z && (x() instanceof aih)) {
            z = ((aih) x()).a();
        }
        if (!z && (!(D() instanceof aih) || !((aih) D()).a())) {
            Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            by G = G();
            Bundle q = preference.q();
            bk g = G.g();
            E().getClassLoader();
            bd b = g.b(preference.u);
            b.ah(q);
            b.ax(this);
            ae aeVar = new ae(G);
            aeVar.m(((View) J().getParent()).getId(), b, null);
            if (!aeVar.k) {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            aeVar.j = true;
            aeVar.l = null;
            aeVar.h(false, true);
        }
        return true;
    }

    public abstract void r(String str);
}
