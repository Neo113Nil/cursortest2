package B0;

import java.text.CharacterIterator;

/* loaded from: classes.dex */
public final class o implements CharacterIterator {

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f926d;

    /* renamed from: e, reason: collision with root package name */
    public final int f927e;

    /* renamed from: i, reason: collision with root package name */
    public int f928i = 0;

    public o(CharSequence charSequence, int i2) {
        this.f926d = charSequence;
        this.f927e = i2;
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
        int i2 = this.f928i;
        if (i2 == this.f927e) {
            return (char) 65535;
        }
        return this.f926d.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f928i = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f927e;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f928i;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i2 = this.f927e;
        if (i2 == 0) {
            this.f928i = i2;
            return (char) 65535;
        }
        int i4 = i2 - 1;
        this.f928i = i4;
        return this.f926d.charAt(i4);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i2 = this.f928i + 1;
        this.f928i = i2;
        int i4 = this.f927e;
        if (i2 < i4) {
            return this.f926d.charAt(i2);
        }
        this.f928i = i4;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i2 = this.f928i;
        if (i2 <= 0) {
            return (char) 65535;
        }
        int i4 = i2 - 1;
        this.f928i = i4;
        return this.f926d.charAt(i4);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i2) {
        if (i2 > this.f927e || i2 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f928i = i2;
        return current();
    }
}
