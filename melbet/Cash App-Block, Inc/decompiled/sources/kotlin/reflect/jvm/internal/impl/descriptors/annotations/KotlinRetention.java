package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class KotlinRetention {
    public static final /* synthetic */ KotlinRetention[] $VALUES;
    public static final KotlinRetention BINARY;
    public static final KotlinRetention RUNTIME;
    public static final KotlinRetention SOURCE;

    static {
        KotlinRetention kotlinRetention = new KotlinRetention("RUNTIME", 0);
        RUNTIME = kotlinRetention;
        KotlinRetention kotlinRetention2 = new KotlinRetention("BINARY", 1);
        BINARY = kotlinRetention2;
        KotlinRetention kotlinRetention3 = new KotlinRetention("SOURCE", 2);
        SOURCE = kotlinRetention3;
        $VALUES = new KotlinRetention[]{kotlinRetention, kotlinRetention2, kotlinRetention3};
    }

    public static KotlinRetention valueOf(String str) {
        return (KotlinRetention) Enum.valueOf(KotlinRetention.class, str);
    }

    public static KotlinRetention[] values() {
        return (KotlinRetention[]) $VALUES.clone();
    }
}
