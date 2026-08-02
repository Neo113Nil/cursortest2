package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class Modality {
    public static final /* synthetic */ Modality[] $VALUES;
    public static final Modality ABSTRACT;
    public static final Companion Companion;
    public static final Modality FINAL;
    public static final Modality OPEN;
    public static final Modality SEALED;

    /* loaded from: classes9.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final Modality convertFromFlags(boolean z, boolean z2, boolean z3) {
            return z ? Modality.SEALED : z2 ? Modality.ABSTRACT : z3 ? Modality.OPEN : Modality.FINAL;
        }
    }

    static {
        Modality modality = new Modality("FINAL", 0);
        FINAL = modality;
        Modality modality2 = new Modality("SEALED", 1);
        SEALED = modality2;
        Modality modality3 = new Modality("OPEN", 2);
        OPEN = modality3;
        Modality modality4 = new Modality("ABSTRACT", 3);
        ABSTRACT = modality4;
        $VALUES = new Modality[]{modality, modality2, modality3, modality4};
        Companion = new Companion(null);
    }

    public static Modality valueOf(String str) {
        return (Modality) Enum.valueOf(Modality.class, str);
    }

    public static Modality[] values() {
        return (Modality[]) $VALUES.clone();
    }
}
