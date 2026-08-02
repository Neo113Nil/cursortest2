package net.idrnd.misnap.iad;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class PayloadSize {
    public static final /* synthetic */ PayloadSize[] a = {new PayloadSize("Normal", 0), new PayloadSize("Small", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    PayloadSize EF5;

    public static PayloadSize valueOf(String str) {
        return (PayloadSize) Enum.valueOf(PayloadSize.class, str);
    }

    public static PayloadSize[] values() {
        return (PayloadSize[]) a.clone();
    }
}
