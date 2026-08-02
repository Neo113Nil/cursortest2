package string;

/* loaded from: classes10.dex */
public final class TrimArguments {

    /* renamed from: char, reason: not valid java name */
    public final char f836char;
    public final TrimMode mode;
    public final String text;

    public TrimArguments(String str, char c, TrimMode trimMode) {
        this.text = str;
        this.f836char = c;
        this.mode = trimMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrimArguments)) {
            return false;
        }
        TrimArguments trimArguments = (TrimArguments) obj;
        return this.text.equals(trimArguments.text) && this.f836char == trimArguments.f836char && this.mode.equals(trimArguments.mode);
    }

    public final int hashCode() {
        return this.mode.hashCode() + ((Character.hashCode(this.f836char) + (this.text.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TrimArguments(text=" + this.text + ", char=" + this.f836char + ", mode=" + this.mode + ")";
    }
}
