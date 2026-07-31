package d0;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.Collections;
import java.util.List;

@SuppressLint({"AddedAbstractMethod"})
/* loaded from: classes.dex */
public abstract class t {
    protected t() {
    }

    public static t d(Context context) {
        return e0.i.k(context);
    }

    public static void e(Context context, androidx.work.a aVar) {
        e0.i.e(context, aVar);
    }

    public abstract m a(String str);

    public final m b(u uVar) {
        return c(Collections.singletonList(uVar));
    }

    public abstract m c(List<? extends u> list);
}
