package I0;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public OnBackInvokedCallback f587a;

    public OnBackInvokedCallback a(b bVar) {
        Objects.requireNonNull(bVar);
        return new d(0, bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:
    
        r3 = r3.findOnBackInvokedDispatcher();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(b bVar, View view, boolean z2) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (this.f587a == null && findOnBackInvokedDispatcher != null) {
            OnBackInvokedCallback a2 = a(bVar);
            this.f587a = a2;
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(z2 ? 1000000 : 0, a2);
        }
    }

    public void c(View view) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
        if (findOnBackInvokedDispatcher == null) {
            return;
        }
        findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f587a);
        this.f587a = null;
    }
}
