package defpackage;

import defpackage.k51;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class c62 {
    public static final a m = new a(null);
    public static final c62 n;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class a extends c62 implements Serializable {

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        /* renamed from: c62$a$a, reason: collision with other inner class name */
        public static final class C0000a implements Serializable {
            public static final C0000a m = new C0000a();
            private static final long serialVersionUID = 0;

            private final Object readResolve() {
                return c62.m;
            }
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        private final void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final Object writeReplace() {
            return C0000a.m;
        }

        @Override // defpackage.c62
        public final int a(int i) {
            return c62.n.a(i);
        }

        @Override // defpackage.c62
        public final double b() {
            return c62.n.b();
        }

        @Override // defpackage.c62
        public final int c() {
            return c62.n.c();
        }

        @Override // defpackage.c62
        public final int d(int i) {
            return c62.n.d(i);
        }

        @Override // defpackage.c62
        public final int e(int i) {
            return c62.n.e(i);
        }
    }

    static {
        k51 k51Var = s93.l;
        Integer num = k51.a.b;
        n = (num == null || num.intValue() >= 34) ? new k22() : new gk0();
    }

    public abstract int a(int i);

    public double b() {
        return ((a(26) << 27) + a(27)) / 9.007199254740992E15d;
    }

    public int c() {
        return a(32);
    }

    public int d(int i) {
        return e(i);
    }

    public int e(int i) {
        int c;
        int i2;
        if (i <= 0) {
            b71.s("Random range is empty: [", 0, ", ", Integer.valueOf(i), ").");
            return 0;
        }
        if (i > 0 || i == Integer.MIN_VALUE) {
            if (((-i) & i) == i) {
                return a(31 - Integer.numberOfLeadingZeros(i));
            }
            do {
                c = c() >>> 1;
                i2 = c % i;
            } while ((i - 1) + (c - i2) < 0);
            return i2;
        }
        while (true) {
            int c2 = c();
            if (c2 >= 0 && c2 < i) {
                return c2;
            }
        }
    }
}
