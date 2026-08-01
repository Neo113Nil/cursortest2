package defpackage;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class vu {
    public OnBackInvokedCallback a;

    public OnBackInvokedCallback a(uu uuVar) {
        Objects.requireNonNull(uuVar);
        return new f4(1, uuVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        r3 = r3.findOnBackInvokedDispatcher();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(uu uuVar, View view, boolean z) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (this.a == null && findOnBackInvokedDispatcher != null) {
            OnBackInvokedCallback a = a(uuVar);
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
