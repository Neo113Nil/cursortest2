package okhttp3.internal.platform.android;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.franklin.api.UiAlias;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.internal.platform.Android10Platform;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;
import okio.internal.ResourceFileSystem;

/* loaded from: classes3.dex */
public class AndroidSocketAdapter implements SocketAdapter {
    public static final UiAlias.Type.Companion playProviderFactory = new UiAlias.Type.Companion();
    public final Method getAlpnSelectedProtocol;
    public final Method setAlpnProtocols;
    public final Method setUseSessionTickets;
    public final Class sslSocketClass;

    public AndroidSocketAdapter(Class cls) {
        this.sslSocketClass = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.setUseSessionTickets = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.getAlpnSelectedProtocol = cls.getMethod("getAlpnSelectedProtocol", null);
        this.setAlpnProtocols = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void configureTlsExtensions(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (this.sslSocketClass.isInstance(sSLSocket)) {
            try {
                this.setUseSessionTickets.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.setAlpnProtocols;
                Android10Platform android10Platform = Platform.platform;
                method.invoke(sSLSocket, ResourceFileSystem.Companion.concatLengthPrefixed(list));
            } catch (IllegalAccessException e) {
                a$$ExternalSyntheticBUOutline0.m$1(e);
            } catch (InvocationTargetException e2) {
                a$$ExternalSyntheticBUOutline0.m$1(e2);
            }
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        if (this.sslSocketClass.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.getAlpnSelectedProtocol.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, Charsets.UTF_8);
                }
            } catch (IllegalAccessException e) {
                a$$ExternalSyntheticBUOutline0.m$1(e);
                return null;
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof NullPointerException) || !Intrinsics.areEqual(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    a$$ExternalSyntheticBUOutline0.m$1(e2);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean isSupported() {
        int i = AndroidPlatform.$r8$clinit;
        AndroidPlatform.Companion.isSupported();
        return false;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean matchesSocket(SSLSocket sSLSocket) {
        return this.sslSocketClass.isInstance(sSLSocket);
    }
}
