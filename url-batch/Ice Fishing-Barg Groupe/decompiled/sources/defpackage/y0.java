package defpackage;

import android.content.ClipboardManager;
import android.content.Context;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class y0 implements rk {
    public final Context PxuCJdSBwIXG;
    public ClipboardManager lS5Rgt96tfkO;

    public y0(Context context) {
        this.PxuCJdSBwIXG = context;
    }

    public final ClipboardManager PxuCJdSBwIXG() {
        ClipboardManager clipboardManager = this.lS5Rgt96tfkO;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = this.PxuCJdSBwIXG.getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.lS5Rgt96tfkO = clipboardManager2;
        return clipboardManager2;
    }
}
