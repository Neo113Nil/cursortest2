package x;

import java.security.Security;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* loaded from: classes.dex */
public class f {
    static {
        Security.addProvider(new BouncyCastleProvider());
    }
}
