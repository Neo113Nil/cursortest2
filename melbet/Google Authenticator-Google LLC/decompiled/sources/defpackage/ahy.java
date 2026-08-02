package defpackage;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahy extends aid {
    final Set aj = new HashSet();
    boolean ak;
    CharSequence[] al;
    CharSequence[] am;

    private final MultiSelectListPreference aL() {
        return (MultiSelectListPreference) aK();
    }

    @Override // defpackage.aid
    public final void aG(boolean z) {
        if (z && this.ak) {
            MultiSelectListPreference aL = aL();
            Set set = this.aj;
            if (aL.L(set)) {
                aL.k(set);
            }
        }
        this.ak = false;
    }

    @Override // defpackage.aid
    protected final void bm(df dfVar) {
        int length = this.am.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.aj.contains(this.am[i].toString());
        }
        CharSequence[] charSequenceArr = this.al;
        ahx ahxVar = new ahx(this);
        db dbVar = dfVar.a;
        dbVar.q = charSequenceArr;
        dbVar.y = ahxVar;
        dbVar.u = zArr;
        dbVar.v = true;
    }

    @Override // defpackage.aid, defpackage.ar, defpackage.bd
    public final void f(Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.f(bundle);
        if (bundle != null) {
            Set set = this.aj;
            set.clear();
            set.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.ak = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.al = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.am = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference aL = aL();
        CharSequence[] charSequenceArr2 = aL.g;
        if (charSequenceArr2 == null || (charSequenceArr = aL.h) == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        Set set2 = this.aj;
        set2.clear();
        set2.addAll(aL.i);
        this.ak = false;
        this.al = charSequenceArr2;
        this.am = charSequenceArr;
    }

    @Override // defpackage.aid, defpackage.ar, defpackage.bd
    public final void i(Bundle bundle) {
        super.i(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.aj));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.ak);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.al);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.am);
    }
}
