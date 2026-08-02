package j$.sun.security.action;

import java.security.PrivilegedAction;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class a implements PrivilegedAction {
    public final /* synthetic */ int a;

    @Override // java.security.PrivilegedAction
    public final Object run() {
        switch (this.a) {
            case 0:
                String property = System.getProperty("file.encoding");
                if (property == null) {
                    return null;
                }
                return property;
            case 1:
                return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
            default:
                return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
        }
    }
}
