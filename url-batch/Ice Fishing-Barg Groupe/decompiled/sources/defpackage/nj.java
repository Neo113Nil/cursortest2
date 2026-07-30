package defpackage;

import java.text.CharacterIterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class nj implements CharacterIterator {
    public final int OPXfSBeufaJ8;
    public final CharSequence rtx2ld2ELZv4;
    public int wdg6QnbFHrFF = 0;

    public nj(CharSequence charSequence, int i) {
        this.rtx2ld2ELZv4 = charSequence;
        this.OPXfSBeufaJ8 = i;
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
        int i = this.wdg6QnbFHrFF;
        if (i == this.OPXfSBeufaJ8) {
            return (char) 65535;
        }
        return this.rtx2ld2ELZv4.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.wdg6QnbFHrFF = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.OPXfSBeufaJ8;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.wdg6QnbFHrFF;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.OPXfSBeufaJ8;
        if (i == 0) {
            this.wdg6QnbFHrFF = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.wdg6QnbFHrFF = i2;
        return this.rtx2ld2ELZv4.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.wdg6QnbFHrFF + 1;
        this.wdg6QnbFHrFF = i;
        int i2 = this.OPXfSBeufaJ8;
        if (i < i2) {
            return this.rtx2ld2ELZv4.charAt(i);
        }
        this.wdg6QnbFHrFF = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.wdg6QnbFHrFF;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.wdg6QnbFHrFF = i2;
        return this.rtx2ld2ELZv4.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.OPXfSBeufaJ8 || i < 0) {
            u9.XL4ISE6Oc65B("invalid position");
            return (char) 0;
        }
        this.wdg6QnbFHrFF = i;
        return current();
    }
}
