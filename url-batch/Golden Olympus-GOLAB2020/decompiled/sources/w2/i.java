package w2;

import b2.AbstractC1372b;
import b2.InterfaceC1371a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f46668b = new i("SUCCESSFUL", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final i f46669c = new i("REREGISTER", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final i f46670d = new i("CANCELLED", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final i f46671e = new i("ALREADY_SELECTED", 3);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ i[] f46672f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC1371a f46673g;

    static {
        i[] c4 = c();
        f46672f = c4;
        f46673g = AbstractC1372b.a(c4);
    }

    private i(String str, int i4) {
    }

    private static final /* synthetic */ i[] c() {
        return new i[]{f46668b, f46669c, f46670d, f46671e};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f46672f.clone();
    }
}
