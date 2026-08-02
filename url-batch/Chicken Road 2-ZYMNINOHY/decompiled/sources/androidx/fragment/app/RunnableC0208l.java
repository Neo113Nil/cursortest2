package androidx.fragment.app;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;

/* renamed from: androidx.fragment.app.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0208l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4907a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4908b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4909c;

    public /* synthetic */ RunnableC0208l(w0 w0Var, View view, Rect rect) {
        this.f4908b = view;
        this.f4909c = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4907a) {
            case 0:
                B0 operation = (B0) this.f4908b;
                C0209m this$0 = (C0209m) this.f4909c;
                kotlin.jvm.internal.i.e(operation, "$operation");
                kotlin.jvm.internal.i.e(this$0, "this$0");
                if (f0.J(2)) {
                    Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
                }
                operation.c(this$0);
                break;
            default:
                w0.g((View) this.f4908b, (Rect) this.f4909c);
                break;
        }
    }

    public /* synthetic */ RunnableC0208l(B0 b02, C0209m c0209m) {
        this.f4908b = b02;
        this.f4909c = c0209m;
    }
}
