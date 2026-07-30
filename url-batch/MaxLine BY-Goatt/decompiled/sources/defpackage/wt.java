package defpackage;

import java.text.CharacterIterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wt implements CharacterIterator {
    public final CharSequence m;
    public final int n;
    public int o = 0;

    public wt(CharSequence charSequence, int i) {
        this.m = charSequence;
        this.n = i;
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
        int i = this.o;
        if (i == this.n) {
            return (char) 65535;
        }
        return this.m.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.o = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.n;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.o;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.n;
        if (i == 0) {
            this.o = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.o = i2;
        return this.m.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.o + 1;
        this.o = i;
        int i2 = this.n;
        if (i < i2) {
            return this.m.charAt(i);
        }
        this.o = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.o;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.o = i2;
        return this.m.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.n || i < 0) {
            lh.e("invalid position");
            return (char) 0;
        }
        this.o = i;
        return current();
    }
}
