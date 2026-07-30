package g;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class a {
    public static Executor a(Context context) {
        return context.getMainExecutor();
    }
}
