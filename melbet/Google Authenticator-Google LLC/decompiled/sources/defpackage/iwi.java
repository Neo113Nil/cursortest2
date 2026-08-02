package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iwi {
    public static void a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static void b(Object obj) {
        obj.getClass();
    }
}
