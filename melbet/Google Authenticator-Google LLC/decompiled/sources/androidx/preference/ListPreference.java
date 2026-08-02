package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.apps.authenticator2.R;
import defpackage.ahs;
import defpackage.aht;
import defpackage.aic;
import defpackage.aiv;
import defpackage.pi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ListPreference extends DialogPreference {
    private String F;
    private boolean G;
    public CharSequence[] g;
    public CharSequence[] h;
    public String i;

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aiv.e, i, 0);
        this.g = pi.F(obtainStyledAttributes, 2, 0);
        this.h = pi.F(obtainStyledAttributes, 3, 1);
        if (pi.D(obtainStyledAttributes, 4, 4, false)) {
            G(aht.a());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, aiv.g, i, 0);
        this.F = pi.C(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    protected final Parcelable bk() {
        Parcelable bk = super.bk();
        if (this.w) {
            return bk;
        }
        ahs ahsVar = new ahs(bk);
        ahsVar.a = this.i;
        return ahsVar;
    }

    public void e(int i) {
        CharSequence[] charSequenceArr = this.h;
        if (charSequenceArr != null) {
            o(charSequenceArr[i].toString());
        }
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(ahs.class)) {
            super.g(parcelable);
            return;
        }
        ahs ahsVar = (ahs) parcelable;
        super.g(ahsVar.getSuperState());
        o(ahsVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        o(s((String) obj));
    }

    public final int k(String str) {
        CharSequence[] charSequenceArr;
        if (str != null && (charSequenceArr = this.h) != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (TextUtils.equals(this.h[length].toString(), str)) {
                    return length;
                }
            }
        }
        return -1;
    }

    public final CharSequence l() {
        CharSequence[] charSequenceArr;
        int k = k(this.i);
        if (k < 0 || (charSequenceArr = this.g) == null) {
            return null;
        }
        return charSequenceArr[k];
    }

    @Override // androidx.preference.Preference
    public final CharSequence m() {
        aic aicVar = this.C;
        if (aicVar != null) {
            return aicVar.b(this);
        }
        CharSequence l = l();
        CharSequence m = super.m();
        String str = this.F;
        if (str != null) {
            if (l == null) {
                l = "";
            }
            String format = String.format(str, l);
            if (!TextUtils.equals(format, m)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return m;
    }

    @Override // androidx.preference.Preference
    public final void n(CharSequence charSequence) {
        super.n(charSequence);
        if (charSequence == null) {
            this.F = null;
        } else {
            this.F = charSequence.toString();
        }
    }

    public final void o(String str) {
        boolean equals = TextUtils.equals(this.i, str);
        if (equals && this.G) {
            return;
        }
        this.i = str;
        this.G = true;
        S(str);
        if (equals) {
            return;
        }
        d();
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pi.x(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
