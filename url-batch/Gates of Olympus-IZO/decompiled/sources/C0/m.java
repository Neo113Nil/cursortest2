package C0;

import java.text.CharacterIterator;

/* loaded from: classes.dex */
public final class m implements CharacterIterator {

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f447d;

    /* renamed from: e, reason: collision with root package name */
    public final int f448e;

    /* renamed from: f, reason: collision with root package name */
    public int f449f = 0;

    public m(CharSequence charSequence, int i3) {
        this.f447d = charSequence;
        this.f448e = i3;
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
        int i3 = this.f449f;
        if (i3 == this.f448e) {
            return (char) 65535;
        }
        return this.f447d.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f449f = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f448e;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f449f;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i3 = this.f448e;
        if (i3 == 0) {
            this.f449f = i3;
            return (char) 65535;
        }
        int i4 = i3 - 1;
        this.f449f = i4;
        return this.f447d.charAt(i4);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i3 = this.f449f + 1;
        this.f449f = i3;
        int i4 = this.f448e;
        if (i3 < i4) {
            return this.f447d.charAt(i3);
        }
        this.f449f = i4;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i3 = this.f449f;
        if (i3 <= 0) {
            return (char) 65535;
        }
        int i4 = i3 - 1;
        this.f449f = i4;
        return this.f447d.charAt(i4);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i3) {
        if (i3 > this.f448e || i3 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f449f = i3;
        return current();
    }
}
