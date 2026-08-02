package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.apps.authenticator2.R;
import defpackage.ahw;
import defpackage.aiv;
import defpackage.pi;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MultiSelectListPreference extends DialogPreference {
    public final CharSequence[] g;
    public final CharSequence[] h;
    public final Set i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int x = pi.x(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle);
        this.i = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aiv.f, x, 0);
        this.g = pi.F(obtainStyledAttributes, 2, 0);
        this.h = pi.F(obtainStyledAttributes, 3, 1);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected final Parcelable bk() {
        Parcelable bk = super.bk();
        if (this.w) {
            return bk;
        }
        ahw ahwVar = new ahw(bk);
        ahwVar.a = this.i;
        return ahwVar;
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(ahw.class)) {
            super.g(parcelable);
            return;
        }
        ahw ahwVar = (ahw) parcelable;
        super.g(ahwVar.getSuperState());
        k(ahwVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        k(t((Set) obj));
    }

    public final void k(Set set) {
        Set set2 = this.i;
        set2.clear();
        set2.addAll(set);
        if (P() && !set.equals(t(null))) {
            SharedPreferences.Editor b = this.k.b();
            b.putStringSet(this.s, set);
            super.J(b);
        }
        d();
    }
}
