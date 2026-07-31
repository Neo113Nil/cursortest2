package gbcorp.c312.gtsly;

import android.content.Context;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* compiled from: NativeLib.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086 ¨\u0006\t"}, d2 = {"Lgbcorp/c312/gtsly/NativeLib;", "", "<init>", "()V", "loadDynamicScreen", "Ljava/lang/reflect/Method;", "context", "Landroid/content/Context;", "Companion", "gtsly_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NativeLib {
    public final native Method loadDynamicScreen(Context context);

    static {
        System.loadLibrary("gtsly");
    }
}
