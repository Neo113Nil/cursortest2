package x1;

import android.content.ClipboardManager;
import android.content.Context;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final ClipboardManager f8422a;

    public h(Context context) {
        Object systemService = context.getSystemService("clipboard");
        q6.i.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f8422a = (ClipboardManager) systemService;
    }
}
