package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes3.dex */
public final class Alignment {
    public static final /* synthetic */ Alignment[] $VALUES;
    public static final Lazy $cachedSerializer$delegate;
    public static final Alignment Center;
    public static final Companion Companion;

    /* JADX INFO: Fake field, exist only in values array */
    Alignment EF0;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Alignment$Companion", "", "Lkotlinx/serialization/KSerializer;", "LAlignment;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return (KSerializer) Alignment.$cachedSerializer$delegate.getValue();
        }
    }

    static {
        Alignment alignment = new Alignment("Left", 0);
        Alignment alignment2 = new Alignment("Center", 1);
        Center = alignment2;
        $VALUES = new Alignment[]{alignment, alignment2, new Alignment("Right", 2)};
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Size$$ExternalSyntheticLambda0(1));
    }

    public static Alignment valueOf(String str) {
        return (Alignment) Enum.valueOf(Alignment.class, str);
    }

    public static Alignment[] values() {
        return (Alignment[]) $VALUES.clone();
    }
}
