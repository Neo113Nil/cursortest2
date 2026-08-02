package androidx.preference;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import defpackage.aiu;
import defpackage.aja;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class TwoStatePreference extends Preference {
    protected boolean a;
    public boolean b;
    private CharSequence c;
    private CharSequence d;
    private boolean e;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
    }

    protected final void V(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            int i = 0;
            if (this.a && !TextUtils.isEmpty(this.c)) {
                textView.setText(this.c);
            } else if (this.a || TextUtils.isEmpty(this.d)) {
                CharSequence m = m();
                if (TextUtils.isEmpty(m)) {
                    i = 8;
                } else {
                    textView.setText(m);
                }
            } else {
                textView.setText(this.d);
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }

    protected final void W(aiu aiuVar) {
        V(aiuVar.C(R.id.summary));
    }

    @Override // androidx.preference.Preference
    protected final Parcelable bk() {
        Parcelable bk = super.bk();
        if (this.w) {
            return bk;
        }
        aja ajaVar = new aja(bk);
        ajaVar.a = this.a;
        return ajaVar;
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        boolean z = !this.a;
        if (L(Boolean.valueOf(z))) {
            k(z);
        }
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(aja.class)) {
            super.g(parcelable);
            return;
        }
        aja ajaVar = (aja) parcelable;
        super.g(ajaVar.getSuperState());
        k(ajaVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        if (obj == null) {
            obj = false;
        }
        k(M(((Boolean) obj).booleanValue()));
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        boolean z = this.b;
        boolean z2 = this.a;
        if (z) {
            if (z2) {
                return true;
            }
        } else if (!z2) {
            return true;
        }
        return super.j();
    }

    public final void k(boolean z) {
        boolean z2 = this.a != z;
        if (z2 || !this.e) {
            this.a = z;
            this.e = true;
            if (P() && z != M(!z)) {
                SharedPreferences.Editor b = this.k.b();
                b.putBoolean(this.s, z);
                super.J(b);
            }
            if (z2) {
                w(j());
                d();
            }
        }
    }

    public final void l(CharSequence charSequence) {
        this.d = charSequence;
        if (this.a) {
            return;
        }
        d();
    }

    public final void o(CharSequence charSequence) {
        this.c = charSequence;
        if (this.a) {
            d();
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }
}
