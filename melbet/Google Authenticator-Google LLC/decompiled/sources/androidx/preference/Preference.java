package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import defpackage.ahz;
import defpackage.aia;
import defpackage.aib;
import defpackage.aic;
import defpackage.aim;
import defpackage.aiq;
import defpackage.air;
import defpackage.aiu;
import defpackage.aiv;
import defpackage.awc;
import defpackage.cx;
import defpackage.e;
import defpackage.pi;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class Preference implements Comparable {
    public int A;
    public PreferenceGroup B;
    public aic C;
    public aim D;
    public awc E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private List K;
    private boolean L;
    private aib M;
    private final View.OnClickListener N;
    private CharSequence a;
    private Bundle b;
    private boolean c;
    private boolean d;
    private String e;
    private Object f;
    private boolean g;
    private boolean h;
    private boolean i;
    public final Context j;
    public air k;
    public long l;
    public boolean m;
    public aia n;
    public int o;
    public CharSequence p;
    public int q;
    public Drawable r;
    public String s;
    public Intent t;
    public String u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.o = Integer.MAX_VALUE;
        this.c = true;
        this.v = true;
        this.w = true;
        this.g = true;
        this.h = true;
        this.x = true;
        this.i = true;
        this.F = true;
        this.H = true;
        this.J = true;
        this.z = R.layout.preference;
        this.N = new cx(this, 4);
        this.j = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aiv.g, i, i2);
        this.q = pi.z(obtainStyledAttributes, 23, 0, 0);
        this.s = pi.C(obtainStyledAttributes, 26, 6);
        this.p = pi.B(obtainStyledAttributes, 34, 4);
        this.a = pi.B(obtainStyledAttributes, 33, 7);
        this.o = pi.G(obtainStyledAttributes, 28, 8);
        this.u = pi.C(obtainStyledAttributes, 22, 13);
        this.z = pi.z(obtainStyledAttributes, 27, 3, R.layout.preference);
        this.A = pi.z(obtainStyledAttributes, 35, 9, 0);
        this.c = pi.D(obtainStyledAttributes, 21, 2, true);
        this.v = pi.D(obtainStyledAttributes, 30, 5, true);
        this.w = pi.D(obtainStyledAttributes, 29, 1, true);
        this.e = pi.C(obtainStyledAttributes, 19, 10);
        this.i = pi.D(obtainStyledAttributes, 16, 16, this.v);
        this.F = pi.D(obtainStyledAttributes, 17, 17, this.v);
        if (obtainStyledAttributes.hasValue(18)) {
            this.f = f(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f = f(obtainStyledAttributes, 11);
        }
        this.J = pi.D(obtainStyledAttributes, 31, 12, true);
        boolean hasValue = obtainStyledAttributes.hasValue(32);
        this.G = hasValue;
        if (hasValue) {
            this.H = pi.D(obtainStyledAttributes, 32, 14, true);
        }
        this.I = pi.D(obtainStyledAttributes, 24, 15, false);
        this.x = pi.D(obtainStyledAttributes, 25, 25, true);
        this.y = pi.D(obtainStyledAttributes, 20, 20, false);
        obtainStyledAttributes.recycle();
    }

    private final void k(View view, boolean z) {
        view.setEnabled(z);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                k(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public void A() {
        K();
    }

    public final void B() {
        Intent intent;
        aiq aiqVar;
        if (O() && this.v) {
            c();
            awc awcVar = this.E;
            if (awcVar != null) {
                ((PreferenceGroup) awcVar.b).V(Integer.MAX_VALUE);
                ((aim) awcVar.a).v();
                return;
            }
            air airVar = this.k;
            if ((airVar == null || (aiqVar = airVar.d) == null || !aiqVar.q(this)) && (intent = this.t) != null) {
                this.j.startActivity(intent);
            }
        }
    }

    public final void C() {
        if (TextUtils.isEmpty(this.e)) {
            return;
        }
        Preference r = r(this.e);
        if (r != null) {
            if (r.K == null) {
                r.K = new ArrayList();
            }
            r.K.add(this);
            Q(r.j());
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.e + "\" not found for preference \"" + this.s + "\" (title: \"" + ((Object) this.p) + "\"");
    }

    public final void D(boolean z) {
        if (this.c != z) {
            this.c = z;
            w(j());
            d();
        }
    }

    public final void E(String str) {
        this.s = str;
        if (!this.d || N()) {
            return;
        }
        if (TextUtils.isEmpty(this.s)) {
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
        this.d = true;
    }

    public final void F(int i) {
        if (i != this.o) {
            this.o = i;
            x();
        }
    }

    public final void G(aic aicVar) {
        this.C = aicVar;
        d();
    }

    public final void H(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.p)) {
            return;
        }
        this.p = charSequence;
        d();
    }

    public final void I(boolean z) {
        if (this.x != z) {
            this.x = z;
            aim aimVar = this.D;
            if (aimVar != null) {
                aimVar.v();
            }
        }
    }

    public final void J(SharedPreferences.Editor editor) {
        if (this.k.b) {
            return;
        }
        editor.apply();
    }

    public final void K() {
        Preference r;
        List list;
        String str = this.e;
        if (str == null || (r = r(str)) == null || (list = r.K) == null) {
            return;
        }
        list.remove(this);
    }

    public final boolean L(Object obj) {
        aia aiaVar = this.n;
        return aiaVar == null || aiaVar.a(this, obj);
    }

    protected final boolean M(boolean z) {
        return !P() ? z : this.k.c().getBoolean(this.s, z);
    }

    public final boolean N() {
        return !TextUtils.isEmpty(this.s);
    }

    public boolean O() {
        return this.c && this.g && this.h;
    }

    protected final boolean P() {
        return this.k != null && this.w && N();
    }

    public final void Q(boolean z) {
        if (this.g == z) {
            this.g = !z;
            w(j());
            d();
        }
    }

    public final void R(boolean z) {
        if (this.h == z) {
            this.h = !z;
            w(j());
            d();
        }
    }

    protected final void S(String str) {
        if (P() && !TextUtils.equals(str, s(null))) {
            SharedPreferences.Editor b = this.k.b();
            b.putString(this.s, str);
            J(b);
        }
    }

    public final void T() {
        if (this.I) {
            this.I = false;
            d();
        }
    }

    public final void U() {
        this.w = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(aiu aiuVar) {
        Integer num;
        TextView textView;
        ImageView imageView;
        View C;
        boolean z;
        View view = aiuVar.a;
        view.setOnClickListener(this.N);
        view.setId(0);
        TextView textView2 = (TextView) aiuVar.C(android.R.id.summary);
        if (textView2 != null) {
            CharSequence m = m();
            if (!TextUtils.isEmpty(m)) {
                textView2.setText(m);
                textView2.setVisibility(0);
                num = Integer.valueOf(textView2.getCurrentTextColor());
                textView = (TextView) aiuVar.C(android.R.id.title);
                if (textView != null) {
                    CharSequence charSequence = this.p;
                    if (TextUtils.isEmpty(charSequence)) {
                        textView.setVisibility(8);
                    } else {
                        textView.setText(charSequence);
                        textView.setVisibility(0);
                        if (this.G) {
                            textView.setSingleLine(this.H);
                        }
                        if (!this.v && O() && num != null) {
                            textView.setTextColor(num.intValue());
                        }
                    }
                }
                imageView = (ImageView) aiuVar.C(android.R.id.icon);
                if (imageView != null) {
                    int i = this.q;
                    if (i == 0) {
                        if (this.r != null) {
                            i = 0;
                        }
                        if (this.r == null) {
                            imageView.setVisibility(0);
                        } else {
                            imageView.setVisibility(true != this.I ? 8 : 4);
                        }
                    }
                    Drawable drawable = this.r;
                    if (drawable == null) {
                        drawable = e.f(this.j, i);
                        this.r = drawable;
                    }
                    if (drawable != null) {
                        imageView.setImageDrawable(drawable);
                    }
                    if (this.r == null) {
                    }
                }
                C = aiuVar.C(R.id.icon_frame);
                if (C == null) {
                    C = aiuVar.C(android.R.id.icon_frame);
                }
                if (C != null) {
                    if (this.r != null) {
                        C.setVisibility(0);
                    } else {
                        C.setVisibility(true == this.I ? 4 : 8);
                    }
                }
                if (this.J) {
                    k(view, true);
                } else {
                    k(view, O());
                }
                boolean z2 = this.v;
                view.setFocusable(z2);
                view.setClickable(z2);
                aiuVar.v = this.i;
                aiuVar.w = this.F;
                z = this.y;
                if (z && this.M == null) {
                    this.M = new aib(this);
                }
                view.setOnCreateContextMenuListener(!z ? this.M : null);
                view.setLongClickable(z);
                if (z || z2) {
                }
                view.setBackground(null);
                return;
            }
            textView2.setVisibility(8);
        }
        num = null;
        textView = (TextView) aiuVar.C(android.R.id.title);
        if (textView != null) {
        }
        imageView = (ImageView) aiuVar.C(android.R.id.icon);
        if (imageView != null) {
        }
        C = aiuVar.C(R.id.icon_frame);
        if (C == null) {
        }
        if (C != null) {
        }
        if (this.J) {
        }
        boolean z22 = this.v;
        view.setFocusable(z22);
        view.setClickable(z22);
        aiuVar.v = this.i;
        aiuVar.w = this.F;
        z = this.y;
        if (z) {
            this.M = new aib(this);
        }
        view.setOnCreateContextMenuListener(!z ? this.M : null);
        view.setLongClickable(z);
        if (z) {
        }
    }

    public void b(View view) {
        B();
    }

    protected Parcelable bk() {
        this.L = true;
        return ahz.EMPTY_STATE;
    }

    public long bl() {
        return this.l;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = this.o;
        int i2 = preference.o;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.p;
        CharSequence charSequence2 = preference.p;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.p.toString());
    }

    public void d() {
        int indexOf;
        aim aimVar = this.D;
        if (aimVar == null || (indexOf = aimVar.a.indexOf(this)) == -1) {
            return;
        }
        aimVar.b.c(indexOf, 1, this);
    }

    protected Object f(TypedArray typedArray, int i) {
        return null;
    }

    protected void g(Parcelable parcelable) {
        this.L = true;
        if (parcelable != ahz.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public boolean j() {
        return !O();
    }

    public CharSequence m() {
        aic aicVar = this.C;
        return aicVar != null ? aicVar.b(this) : this.a;
    }

    public void n(CharSequence charSequence) {
        if (this.C != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.a, charSequence)) {
            return;
        }
        this.a = charSequence;
        d();
    }

    protected final int p(int i) {
        return !P() ? i : this.k.c().getInt(this.s, i);
    }

    public final Bundle q() {
        Bundle bundle = this.b;
        if (bundle != null) {
            return bundle;
        }
        Bundle bundle2 = new Bundle();
        this.b = bundle2;
        return bundle2;
    }

    protected final Preference r(String str) {
        air airVar = this.k;
        if (airVar == null) {
            return null;
        }
        return airVar.d(str);
    }

    protected final String s(String str) {
        return !P() ? str : this.k.c().getString(this.s, str);
    }

    public final Set t(Set set) {
        return !P() ? set : this.k.c().getStringSet(this.s, set);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.p;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence m = m();
        if (!TextUtils.isEmpty(m)) {
            sb.append(m);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public void u(Bundle bundle) {
        Parcelable parcelable;
        if (!N() || (parcelable = bundle.getParcelable(this.s)) == null) {
            return;
        }
        this.L = false;
        g(parcelable);
        if (!this.L) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void v(Bundle bundle) {
        if (N()) {
            this.L = false;
            Parcelable bk = bk();
            if (!this.L) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (bk != null) {
                bundle.putParcelable(this.s, bk);
            }
        }
    }

    public void w(boolean z) {
        List list = this.K;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).Q(z);
        }
    }

    protected final void x() {
        aim aimVar = this.D;
        if (aimVar != null) {
            aimVar.v();
        }
    }

    public void y() {
        C();
    }

    public final void z(air airVar) {
        this.k = airVar;
        if (!this.m) {
            this.l = airVar.a();
        }
        if (P()) {
            air airVar2 = this.k;
            if ((airVar2 != null ? airVar2.c() : null).contains(this.s)) {
                h(null);
                return;
            }
        }
        Object obj = this.f;
        if (obj != null) {
            h(obj);
        }
    }

    protected void c() {
    }

    protected void h(Object obj) {
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pi.x(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context) {
        this(context, null);
    }
}
