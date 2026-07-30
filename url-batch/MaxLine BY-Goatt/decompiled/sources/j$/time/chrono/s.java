package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class s implements n {
    public static final s AH;
    public static final /* synthetic */ s[] a;

    static {
        s sVar = new s("AH", 0);
        AH = sVar;
        a = new s[]{sVar};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) a.clone();
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        return qVar == j$.time.temporal.a.ERA ? j$.time.temporal.u.f(1L, 1L) : super.k(qVar);
    }
}
