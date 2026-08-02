package defpackage;

import android.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class faj extends SSLServerSocketFactory {
    public static fah a;
    private static final String b = "fak";

    private static final SSLServerSocketFactory a() {
        try {
            return SSLContext.getInstance("Default").getServerSocketFactory();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static final SSLServerSocketFactory b() {
        bsh bshVar = bsh.c;
        int i = bshVar.a;
        a.a(bshVar);
        SSLServerSocketFactory a2 = a();
        if (!(a2 instanceof faj)) {
            return a2;
        }
        String str = "[";
        for (Provider provider : Security.getProviders()) {
            str = str.concat(String.valueOf(provider.toString())).concat(provider.stringPropertyNames().contains("SSLContext.Default") ? "(true), " : "(false), ");
        }
        Log.e(b, str.concat("]"));
        throw new RuntimeException("Unable to find a default SSL provider.");
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i) {
        return b().createServerSocket(i);
    }

    @Override // javax.net.ssl.SSLServerSocketFactory
    public final String[] getDefaultCipherSuites() {
        try {
            return b().getDefaultCipherSuites();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // javax.net.ssl.SSLServerSocketFactory
    public final String[] getSupportedCipherSuites() {
        try {
            return b().getSupportedCipherSuites();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i, int i2) {
        return b().createServerSocket(i, i2);
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i, int i2, InetAddress inetAddress) {
        return b().createServerSocket(i, i2, inetAddress);
    }
}
