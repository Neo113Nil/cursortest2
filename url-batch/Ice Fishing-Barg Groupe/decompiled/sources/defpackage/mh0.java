package defpackage;

import java.text.BreakIterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class mh0 extends jh0 {
    public final BreakIterator OPXfSBeufaJ8;

    public mh0(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.OPXfSBeufaJ8 = characterInstance;
    }

    @Override // defpackage.jh0
    public final int aF05bpZJlKEP(int i) {
        return this.OPXfSBeufaJ8.preceding(i);
    }

    @Override // defpackage.jh0
    public final int e6tOsSdd2EFb(int i) {
        return this.OPXfSBeufaJ8.following(i);
    }
}
