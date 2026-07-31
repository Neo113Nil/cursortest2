package E0;

import O2.l;
import java.text.BreakIterator;

/* loaded from: classes.dex */
public final class d extends l {

    /* renamed from: g, reason: collision with root package name */
    public final BreakIterator f1026g;

    public d(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f1026g = characterInstance;
    }

    @Override // O2.l
    public final int n0(int i3) {
        return this.f1026g.following(i3);
    }

    @Override // O2.l
    public final int s0(int i3) {
        return this.f1026g.preceding(i3);
    }
}
