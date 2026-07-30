package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ch2 implements dh2 {
    public final /* synthetic */ int m;

    public /* synthetic */ ch2(int i) {
        this.m = i;
    }

    public static /* synthetic */ void b(int i, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "serialized size must be non-negative, was ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void d(int i, int i2, Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(i);
        sb.append((Object) " parameters found ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void e(int i, int i2, Object obj, String str) {
        throw new IndexOutOfBoundsException(str + i + obj + i2 + ((Object) ")."));
    }

    public static /* synthetic */ void f(int i, String str) {
        throw new InvalidObjectException(str + i + '.');
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void h(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void i(String str, long j, Object obj) {
        throw new IllegalArgumentException((str + j + obj).toString());
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void k(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void l(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void m(String str) {
        throw new un3(str);
    }

    @Override // defpackage.dh2
    public bh2 c(kl3 kl3Var) {
        ah2 i;
        ah2 ah2Var;
        ah2 ah2Var2;
        switch (this.m) {
            case 0:
                return ll3.d(kl3Var, by1.t);
            case 1:
                return ll3.d(kl3Var, by1.s);
            default:
                bh2 bh2Var = (bh2) kl3Var.c;
                gn gnVar = (gn) kl3Var.d;
                if (bh2Var == null) {
                    return ll3.d(kl3Var, by1.t);
                }
                ah2 ah2Var3 = bh2Var.b;
                ah2 ah2Var4 = bh2Var.a;
                if (kl3Var.b) {
                    i = ll3.i(kl3Var, gnVar, ah2Var4);
                    ah2Var2 = ah2Var3;
                    ah2Var3 = ah2Var4;
                    ah2Var = i;
                } else {
                    i = ll3.i(kl3Var, gnVar, ah2Var3);
                    ah2Var = ah2Var4;
                    ah2Var2 = i;
                }
                if (Intrinsics.b(i, ah2Var3)) {
                    return bh2Var;
                }
                boolean z = true;
                if (kl3Var.b() != 1 && (kl3Var.b() != 3 || ah2Var.b <= ah2Var2.b)) {
                    z = false;
                }
                return ll3.B(new bh2(ah2Var, ah2Var2, z), kl3Var);
        }
    }
}
