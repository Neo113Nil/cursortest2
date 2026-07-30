package b2;

import java.text.CharacterIterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n implements CharacterIterator {

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f1286f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1287g;

    /* renamed from: h, reason: collision with root package name */
    public int f1288h = 0;

    public n(CharSequence charSequence, int i7) {
        this.f1286f = charSequence;
        this.f1287g = i7;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i7 = this.f1288h;
        if (i7 == this.f1287g) {
            return (char) 65535;
        }
        return this.f1286f.charAt(i7);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f1288h = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f1287g;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f1288h;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i7 = this.f1287g;
        if (i7 == 0) {
            this.f1288h = i7;
            return (char) 65535;
        }
        int i8 = i7 - 1;
        this.f1288h = i8;
        return this.f1286f.charAt(i8);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i7 = this.f1288h + 1;
        this.f1288h = i7;
        int i8 = this.f1287g;
        if (i7 < i8) {
            return this.f1286f.charAt(i7);
        }
        this.f1288h = i8;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i7 = this.f1288h;
        if (i7 <= 0) {
            return (char) 65535;
        }
        int i8 = i7 - 1;
        this.f1288h = i8;
        return this.f1286f.charAt(i8);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i7) {
        if (i7 > this.f1287g || i7 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f1288h = i7;
        return current();
    }
}
