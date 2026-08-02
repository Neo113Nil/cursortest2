package defpackage;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fkf {
    private OnBackInvokedCallback a;

    public OnBackInvokedCallback a(fke fkeVar) {
        return new me(fkeVar, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        r3 = r3.findOnBackInvokedDispatcher();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(fke fkeVar, View view, boolean z) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (this.a == null && findOnBackInvokedDispatcher != null) {
            OnBackInvokedCallback a = a(fkeVar);
            this.a = a;
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(true != z ? 0 : 1000000, a);
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

    final boolean d() {
        return this.a != null;
    }
}
