package defpackage;

import android.os.Bundle;
import androidx.preference.ListPreference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahv extends aid {
    int aj;
    private CharSequence[] ak;
    private CharSequence[] al;

    private final ListPreference aL() {
        return (ListPreference) aK();
    }

    @Override // defpackage.aid
    public final void aG(boolean z) {
        int i;
        if (!z || (i = this.aj) < 0) {
            return;
        }
        String charSequence = this.al[i].toString();
        ListPreference aL = aL();
        if (aL.L(charSequence)) {
            aL.o(charSequence);
        }
    }

    @Override // defpackage.aid
    protected final void bm(df dfVar) {
        CharSequence[] charSequenceArr = this.ak;
        int i = this.aj;
        ahu ahuVar = new ahu((ar) this, 0);
        db dbVar = dfVar.a;
        dbVar.q = charSequenceArr;
        dbVar.s = ahuVar;
        dbVar.x = i;
        dbVar.w = true;
        dfVar.f(null, null);
    }

    @Override // defpackage.aid, defpackage.ar, defpackage.bd
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.aj = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.ak = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.al = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference aL = aL();
        if (aL.g == null || aL.h == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.aj = aL.k(aL.i);
        this.ak = aL.g;
        this.al = aL.h;
    }

    @Override // defpackage.aid, defpackage.ar, defpackage.bd
    public final void i(Bundle bundle) {
        super.i(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.aj);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.ak);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.al);
    }
}
