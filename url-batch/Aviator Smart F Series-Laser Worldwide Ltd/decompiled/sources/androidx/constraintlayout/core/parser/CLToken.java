package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLToken extends CLElement {
    int mIndex;
    char[] mTokenFalse;
    char[] mTokenNull;
    char[] mTokenTrue;
    Type mType;

    enum Type {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public CLToken(char[] cArr) {
        super(cArr);
        this.mIndex = 0;
        this.mType = Type.UNKNOWN;
        this.mTokenTrue = "true".toCharArray();
        this.mTokenFalse = "false".toCharArray();
        this.mTokenNull = "null".toCharArray();
    }

    public static CLElement allocate(char[] cArr) {
        return new CLToken(cArr);
    }

    public boolean getBoolean() {
        Type type = this.mType;
        if (type == Type.TRUE) {
            return true;
        }
        if (type == Type.FALSE) {
            return false;
        }
        throw new CLParsingException("this token is not a boolean: <" + content() + ">", this);
    }

    public Type getType() {
        return this.mType;
    }

    public boolean isNull() {
        if (this.mType == Type.NULL) {
            return true;
        }
        throw new CLParsingException("this token is not a null: <" + content() + ">", this);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toFormattedJSON(int i8, int i9) {
        StringBuilder sb = new StringBuilder();
        addIndent(sb, i8);
        sb.append(content());
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toJSON() {
        if (!CLParser.sDebug) {
            return content();
        }
        return "<" + content() + ">";
    }

    public boolean validate(char c8, long j8) {
        int ordinal = this.mType.ordinal();
        if (ordinal == 0) {
            char[] cArr = this.mTokenTrue;
            int i8 = this.mIndex;
            if (cArr[i8] == c8) {
                this.mType = Type.TRUE;
            } else if (this.mTokenFalse[i8] == c8) {
                this.mType = Type.FALSE;
            } else if (this.mTokenNull[i8] == c8) {
                this.mType = Type.NULL;
            }
            r2 = true;
        } else if (ordinal == 1) {
            char[] cArr2 = this.mTokenTrue;
            int i9 = this.mIndex;
            r2 = cArr2[i9] == c8;
            if (r2 && i9 + 1 == cArr2.length) {
                setEnd(j8);
            }
        } else if (ordinal == 2) {
            char[] cArr3 = this.mTokenFalse;
            int i10 = this.mIndex;
            r2 = cArr3[i10] == c8;
            if (r2 && i10 + 1 == cArr3.length) {
                setEnd(j8);
            }
        } else if (ordinal == 3) {
            char[] cArr4 = this.mTokenNull;
            int i11 = this.mIndex;
            r2 = cArr4[i11] == c8;
            if (r2 && i11 + 1 == cArr4.length) {
                setEnd(j8);
            }
        }
        this.mIndex++;
        return r2;
    }
}
