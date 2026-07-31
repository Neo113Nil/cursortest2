package h2;

import java.text.CharacterIterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b implements CharacterIterator {

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f3085d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3086e;

    /* renamed from: f, reason: collision with root package name */
    public int f3087f = 0;

    public b(int i, CharSequence charSequence) {
        this.f3085d = charSequence;
        this.f3086e = i;
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
        int i = this.f3087f;
        if (i == this.f3086e) {
            return (char) 65535;
        }
        return this.f3085d.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f3087f = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f3086e;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f3087f;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.f3086e;
        if (i == 0) {
            this.f3087f = i;
            return (char) 65535;
        }
        int i8 = i - 1;
        this.f3087f = i8;
        return this.f3085d.charAt(i8);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.f3087f + 1;
        this.f3087f = i;
        int i8 = this.f3086e;
        if (i < i8) {
            return this.f3085d.charAt(i);
        }
        this.f3087f = i8;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.f3087f;
        if (i <= 0) {
            return (char) 65535;
        }
        int i8 = i - 1;
        this.f3087f = i8;
        return this.f3085d.charAt(i8);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.f3086e || i < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f3087f = i;
        return current();
    }
}
