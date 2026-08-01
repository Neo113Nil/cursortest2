package n2;

import java.text.CharacterIterator;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements CharacterIterator {

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f6989d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6990e;

    /* renamed from: i, reason: collision with root package name */
    public int f6991i = 0;

    public a(int i3, CharSequence charSequence) {
        this.f6989d = charSequence;
        this.f6990e = i3;
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
        int i3 = this.f6991i;
        if (i3 == this.f6990e) {
            return (char) 65535;
        }
        return this.f6989d.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f6991i = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f6990e;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f6991i;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i3 = this.f6990e;
        if (i3 == 0) {
            this.f6991i = i3;
            return (char) 65535;
        }
        int i10 = i3 - 1;
        this.f6991i = i10;
        return this.f6989d.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i3 = this.f6991i + 1;
        this.f6991i = i3;
        int i10 = this.f6990e;
        if (i3 < i10) {
            return this.f6989d.charAt(i3);
        }
        this.f6991i = i10;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i3 = this.f6991i;
        if (i3 <= 0) {
            return (char) 65535;
        }
        int i10 = i3 - 1;
        this.f6991i = i10;
        return this.f6989d.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i3) {
        if (i3 > this.f6990e || i3 < 0) {
            a1.e("invalid position");
            return (char) 0;
        }
        this.f6991i = i3;
        return current();
    }
}
