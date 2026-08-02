package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.apps.authenticator2.R;
import defpackage.ahp;
import defpackage.aht;
import defpackage.aiv;
import defpackage.pi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class EditTextPreference extends DialogPreference {
    public String g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int x = pi.x(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aiv.d, x, 0);
        if (pi.D(obtainStyledAttributes, 0, 0, false)) {
            if (aht.a == null) {
                aht.a = new aht(1);
            }
            G(aht.a);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected final Parcelable bk() {
        Parcelable bk = super.bk();
        if (this.w) {
            return bk;
        }
        ahp ahpVar = new ahp(bk);
        ahpVar.a = this.g;
        return ahpVar;
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(ahp.class)) {
            super.g(parcelable);
            return;
        }
        ahp ahpVar = (ahp) parcelable;
        super.g(ahpVar.getSuperState());
        i(ahpVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        i(s((String) obj));
    }

    public final void i(String str) {
        boolean j = j();
        this.g = str;
        S(str);
        boolean j2 = j();
        if (j2 != j) {
            w(j2);
        }
        d();
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return TextUtils.isEmpty(this.g) || super.j();
    }
}
