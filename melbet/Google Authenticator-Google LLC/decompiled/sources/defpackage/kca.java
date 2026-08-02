package defpackage;

import android.content.Intent;
import android.os.UserHandle;
import j$.util.Objects;
import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kca extends SocketAddress {
    private static final long serialVersionUID = 0;
    public final Intent a;
    private final UserHandle b;

    public kca(Intent intent, UserHandle userHandle) {
        boolean z = true;
        if (intent.getComponent() == null && intent.getPackage() == null) {
            z = false;
        }
        hoq.y(z, "'bindIntent' must be explicit. Specify either a package or ComponentName.");
        this.a = intent;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kca) {
            kca kcaVar = (kca) obj;
            if (this.a.filterEquals(kcaVar.a)) {
                UserHandle userHandle = kcaVar.b;
                if (Objects.equals(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.a;
        if (intent.getPackage() != null) {
            intent = intent.cloneFilter().setPackage(null);
        }
        return intent.filterHashCode();
    }

    public final String toString() {
        return "AndroidComponentAddress[" + this.a + "]";
    }
}
