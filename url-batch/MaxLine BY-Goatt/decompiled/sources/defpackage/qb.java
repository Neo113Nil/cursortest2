package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class qb implements in2 {
    public static final by1 f = new by1(25);
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final Method e;

    public qb(Class cls) {
        this.a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.b = declaredMethod;
        this.c = cls.getMethod("setHostname", String.class);
        this.d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.in2
    public final String a(SSLSocket sSLSocket) {
        if (this.a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, yt.b);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof NullPointerException) || !Intrinsics.b(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e2);
                }
            }
        }
        return null;
    }

    @Override // defpackage.in2
    public final boolean b() {
        boolean z = sa.e;
        return sa.e;
    }

    @Override // defpackage.in2
    public final boolean c(SSLSocket sSLSocket) {
        return this.a.isInstance(sSLSocket);
    }

    @Override // defpackage.in2
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (this.a.isInstance(sSLSocket)) {
            try {
                this.b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.c.invoke(sSLSocket, str);
                }
                Method method = this.e;
                r12 r12Var = r12.a;
                method.invoke(sSLSocket, nm1.m(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
