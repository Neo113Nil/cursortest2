package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.Objects;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzcda extends SSLSocketFactory {
    final SSLSocketFactory zza;
    final /* synthetic */ zzcdb zzb;

    zzcda(zzcdb zzcdbVar) {
        Objects.requireNonNull(zzcdbVar);
        this.zzb = zzcdbVar;
        this.zza = (SSLSocketFactory) SSLSocketFactory.getDefault();
    }

    private final Socket zza(Socket socket) throws SocketException {
        zzcdb zzcdbVar = this.zzb;
        if (zzcdbVar.zzm() > 0) {
            socket.setReceiveBufferSize(zzcdbVar.zzm());
        }
        zzcdbVar.zzl(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        Socket createSocket = this.zza.createSocket(str, i);
        zza(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.zza.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.zza.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket createSocket = this.zza.createSocket(str, i, inetAddress, i2);
        zza(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket createSocket = this.zza.createSocket(inetAddress, i);
        zza(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket createSocket = this.zza.createSocket(inetAddress, i, inetAddress2, i2);
        zza(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket createSocket = this.zza.createSocket(socket, str, i, z);
        zza(createSocket);
        return createSocket;
    }
}
