package kotlin.reflect.jvm.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class SignatureKind {
    public static final /* synthetic */ SignatureKind[] $VALUES;
    public static final SignatureKind FIELD_IN_JAVA_CLASS;
    public static final SignatureKind FUNCTION;
    public static final SignatureKind PROPERTY;

    static {
        SignatureKind signatureKind = new SignatureKind("FUNCTION", 0);
        FUNCTION = signatureKind;
        SignatureKind signatureKind2 = new SignatureKind("PROPERTY", 1);
        PROPERTY = signatureKind2;
        SignatureKind signatureKind3 = new SignatureKind("FIELD_IN_JAVA_CLASS", 2);
        FIELD_IN_JAVA_CLASS = signatureKind3;
        $VALUES = new SignatureKind[]{signatureKind, signatureKind2, signatureKind3};
    }

    public static SignatureKind valueOf(String str) {
        return (SignatureKind) Enum.valueOf(SignatureKind.class, str);
    }

    public static SignatureKind[] values() {
        return (SignatureKind[]) $VALUES.clone();
    }
}
