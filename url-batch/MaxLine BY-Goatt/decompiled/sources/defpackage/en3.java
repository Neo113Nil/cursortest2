package defpackage;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class en3 implements Cloneable {
    public final in3 m;
    public in3 n;

    public en3(in3 in3Var) {
        this.m = in3Var;
        if (in3Var.e()) {
            lh.e("Default instance must be immutable.");
            throw null;
        }
        this.n = (in3) in3Var.o(4);
    }

    public static void a(int i, List list) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String sb2 = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(sb2);
            }
            list.remove(size2);
        }
    }

    public final void b() {
        if (this.n.e()) {
            return;
        }
        in3 in3Var = (in3) this.m.o(4);
        uo3.c.a(in3Var.getClass()).e(in3Var, this.n);
        this.n = in3Var;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final en3 clone() {
        en3 en3Var = (en3) this.m.o(5);
        boolean e = this.n.e();
        in3 in3Var = this.n;
        if (e) {
            in3Var.g();
            in3Var = this.n;
        }
        en3Var.n = in3Var;
        return en3Var;
    }

    public final in3 d() {
        boolean e = this.n.e();
        in3 in3Var = this.n;
        if (e) {
            in3Var.g();
            in3Var = this.n;
        }
        in3Var.getClass();
        boolean z = true;
        byte byteValue = ((Byte) in3Var.o(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z = false;
            } else {
                z = uo3.c.a(in3Var.getClass()).g(in3Var);
                in3Var.o(2);
            }
        }
        if (z) {
            return in3Var;
        }
        throw new hx("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final void e(in3 in3Var) {
        in3 in3Var2 = this.m;
        if (in3Var2.equals(in3Var)) {
            return;
        }
        if (!this.n.e()) {
            in3 in3Var3 = (in3) in3Var2.o(4);
            uo3.c.a(in3Var3.getClass()).e(in3Var3, this.n);
            this.n = in3Var3;
        }
        in3 in3Var4 = this.n;
        uo3.c.a(in3Var4.getClass()).e(in3Var4, in3Var);
    }

    public final void f(byte[] bArr, int i, rm3 rm3Var) {
        if (!this.n.e()) {
            in3 in3Var = (in3) this.m.o(4);
            uo3.c.a(in3Var.getClass()).e(in3Var, this.n);
            this.n = in3Var;
        }
        try {
            yo3 a = uo3.c.a(this.n.getClass());
            in3 in3Var2 = this.n;
            tn0 tn0Var = new tn0();
            rm3Var.getClass();
            a.h(in3Var2, bArr, 0, i, tn0Var);
        } catch (IndexOutOfBoundsException unused) {
            ch2.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (un3 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }
}
