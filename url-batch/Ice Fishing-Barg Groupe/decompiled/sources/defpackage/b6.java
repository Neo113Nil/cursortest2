package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class b6 implements h82 {
    public static final a6 Companion = new a6();
    public static final jx1 e9gEMXR7LXtO = new jx1(18);
    public final Class PxuCJdSBwIXG;
    public final Method TSizfFm2Yiuu;
    public final Method Y1f8riQaR6yg;
    public final Method lS5Rgt96tfkO;

    public b6(Class cls) {
        this.PxuCJdSBwIXG = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.lS5Rgt96tfkO = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.TSizfFm2Yiuu = cls.getMethod("getAlpnSelectedProtocol", null);
        this.Y1f8riQaR6yg = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.h82
    public final String PxuCJdSBwIXG(SSLSocket sSLSocket) {
        if (this.PxuCJdSBwIXG.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.TSizfFm2Yiuu.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, pj.PxuCJdSBwIXG);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof NullPointerException) || !cs0.wdg6QnbFHrFF(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e2);
                }
            }
        }
        return null;
    }

    @Override // defpackage.h82
    public final boolean TSizfFm2Yiuu() {
        w4.Companion.getClass();
        return w4.e9gEMXR7LXtO;
    }

    @Override // defpackage.h82
    public final void Y1f8riQaR6yg(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (this.PxuCJdSBwIXG.isInstance(sSLSocket)) {
            try {
                this.lS5Rgt96tfkO.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.Y1f8riQaR6yg;
                km1.Companion.getClass();
                method.invoke(sSLSocket, jm1.lS5Rgt96tfkO(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // defpackage.h82
    public final boolean lS5Rgt96tfkO(SSLSocket sSLSocket) {
        return this.PxuCJdSBwIXG.isInstance(sSLSocket);
    }
}
