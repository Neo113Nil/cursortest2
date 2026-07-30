package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLNumber extends CLElement {
    float mValue;

    public CLNumber(char[] cArr) {
        super(cArr);
        this.mValue = Float.NaN;
    }

    public static CLElement allocate(char[] cArr) {
        return new CLNumber(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CLNumber)) {
            return false;
        }
        float f8 = getFloat();
        float f9 = ((CLNumber) obj).getFloat();
        return (Float.isNaN(f8) && Float.isNaN(f9)) || f8 == f9;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public float getFloat() {
        if (Float.isNaN(this.mValue) && hasContent()) {
            this.mValue = Float.parseFloat(content());
        }
        return this.mValue;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int getInt() {
        if (Float.isNaN(this.mValue) && hasContent()) {
            this.mValue = Integer.parseInt(content());
        }
        return (int) this.mValue;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        float f8 = this.mValue;
        return hashCode + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0);
    }

    public boolean isInt() {
        float f8 = getFloat();
        return ((float) ((int) f8)) == f8;
    }

    public void putValue(float f8) {
        this.mValue = f8;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toFormattedJSON(int i8, int i9) {
        StringBuilder sb = new StringBuilder();
        addIndent(sb, i8);
        float f8 = getFloat();
        int i10 = (int) f8;
        if (i10 == f8) {
            sb.append(i10);
        } else {
            sb.append(f8);
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toJSON() {
        float f8 = getFloat();
        int i8 = (int) f8;
        if (i8 == f8) {
            return "" + i8;
        }
        return "" + f8;
    }

    public CLNumber(float f8) {
        super(null);
        this.mValue = f8;
    }
}
