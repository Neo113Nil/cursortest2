package defpackage;

import java.text.BreakIterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bw0 extends yk3 {
    public final BreakIterator v;

    public bw0(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.v = characterInstance;
    }

    @Override // defpackage.yk3
    public final int M(int i) {
        return this.v.following(i);
    }

    @Override // defpackage.yk3
    public final int N(int i) {
        return this.v.preceding(i);
    }
}
