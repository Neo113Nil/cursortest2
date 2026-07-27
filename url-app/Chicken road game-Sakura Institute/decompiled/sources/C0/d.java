package C0;

import java.text.BreakIterator;
import u3.l;

/* loaded from: classes.dex */
public final class d extends l {

    /* renamed from: j, reason: collision with root package name */
    public final BreakIterator f1154j;

    public d(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f1154j = characterInstance;
    }

    @Override // u3.l
    public final int n0(int i2) {
        return this.f1154j.following(i2);
    }

    @Override // u3.l
    public final int r0(int i2) {
        return this.f1154j.preceding(i2);
    }
}
