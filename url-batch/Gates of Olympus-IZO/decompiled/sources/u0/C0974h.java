package u0;

import android.content.ClipboardManager;
import android.content.Context;

/* renamed from: u0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0974h implements Y {

    /* renamed from: a, reason: collision with root package name */
    public final ClipboardManager f8329a;

    public C0974h(Context context) {
        Object systemService = context.getSystemService("clipboard");
        Z1.i.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f8329a = (ClipboardManager) systemService;
    }
}
