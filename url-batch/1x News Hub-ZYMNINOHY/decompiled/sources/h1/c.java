package h1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f5056a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c[] f5057b;

    static {
        c cVar = new c("DEFAULT", 0);
        f5056a = cVar;
        f5057b = new c[]{cVar, new c("SIGNED", 1), new c("FIXED", 2)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f5057b.clone();
    }
}
