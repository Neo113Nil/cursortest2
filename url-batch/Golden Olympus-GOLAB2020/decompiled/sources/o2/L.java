package o2;

import b2.AbstractC1372b;
import b2.InterfaceC1371a;
import kotlin.jvm.functions.Function2;
import u2.AbstractC3458a;
import u2.AbstractC3459b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class L {

    /* renamed from: b, reason: collision with root package name */
    public static final L f42009b = new L("DEFAULT", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final L f42010c = new L("LAZY", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final L f42011d = new L("ATOMIC", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final L f42012e = new L("UNDISPATCHED", 3);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ L[] f42013f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC1371a f42014g;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42015a;

        static {
            int[] iArr = new int[L.values().length];
            try {
                iArr[L.f42009b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[L.f42011d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[L.f42012e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[L.f42010c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f42015a = iArr;
        }
    }

    static {
        L[] c4 = c();
        f42013f = c4;
        f42014g = AbstractC1372b.a(c4);
    }

    private L(String str, int i4) {
    }

    private static final /* synthetic */ L[] c() {
        return new L[]{f42009b, f42010c, f42011d, f42012e};
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) f42013f.clone();
    }

    public final void d(Function2 function2, Object obj, kotlin.coroutines.d dVar) {
        int i4 = a.f42015a[ordinal()];
        if (i4 == 1) {
            AbstractC3458a.d(function2, obj, dVar, null, 4, null);
            return;
        }
        if (i4 == 2) {
            kotlin.coroutines.f.a(function2, obj, dVar);
        } else if (i4 == 3) {
            AbstractC3459b.a(function2, obj, dVar);
        } else if (i4 != 4) {
            throw new W1.m();
        }
    }

    public final boolean e() {
        return this == f42010c;
    }
}
