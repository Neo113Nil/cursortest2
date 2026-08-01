package defpackage;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class a00 {
    public OnBackInvokedCallback a;

    public OnBackInvokedCallback a(zz zzVar) {
        Objects.requireNonNull(zzVar);
        return new n4(1, zzVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        r3 = r3.findOnBackInvokedDispatcher();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(zz zzVar, View view, boolean z) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (this.a == null && findOnBackInvokedDispatcher != null) {
            OnBackInvokedCallback a = a(zzVar);
            this.a = a;
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(z ? 1000000 : 0, a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        r2 = r2.findOnBackInvokedDispatcher();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(View view) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (this.a == null || findOnBackInvokedDispatcher == null) {
            return;
        }
        findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.a);
        this.a = null;
    }
}
