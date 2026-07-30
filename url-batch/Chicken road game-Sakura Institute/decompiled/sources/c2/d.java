package c2;

import java.text.BreakIterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends a8.d {

    /* renamed from: j, reason: collision with root package name */
    public final BreakIterator f1633j;

    public d(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f1633j = characterInstance;
    }

    @Override // a8.d
    public final int N(int i7) {
        return this.f1633j.following(i7);
    }

    @Override // a8.d
    public final int Q(int i7) {
        return this.f1633j.preceding(i7);
    }
}
