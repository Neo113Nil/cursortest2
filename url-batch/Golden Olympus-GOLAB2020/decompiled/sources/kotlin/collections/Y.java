package kotlin.collections;

import b2.AbstractC1372b;
import b2.InterfaceC1371a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class Y {

    /* renamed from: b, reason: collision with root package name */
    public static final Y f41075b = new Y("Ready", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final Y f41076c = new Y("NotReady", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final Y f41077d = new Y("Done", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final Y f41078e = new Y("Failed", 3);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ Y[] f41079f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC1371a f41080g;

    static {
        Y[] c4 = c();
        f41079f = c4;
        f41080g = AbstractC1372b.a(c4);
    }

    private Y(String str, int i4) {
    }

    private static final /* synthetic */ Y[] c() {
        return new Y[]{f41075b, f41076c, f41077d, f41078e};
    }

    public static Y valueOf(String str) {
        return (Y) Enum.valueOf(Y.class, str);
    }

    public static Y[] values() {
        return (Y[]) f41079f.clone();
    }
}
