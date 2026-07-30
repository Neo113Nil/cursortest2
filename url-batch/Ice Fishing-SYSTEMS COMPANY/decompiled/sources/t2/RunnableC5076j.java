package t2;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import java.util.Objects;

/* renamed from: t2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5076j implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f40907n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f40908u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f40909v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f40910w;

    public RunnableC5076j(C5077k c5077k, Context context, String str, boolean z8, boolean z9) {
        this.f40907n = context;
        this.f40908u = str;
        this.f40909v = z8;
        this.f40910w = z9;
        Objects.requireNonNull(c5077k);
    }

    @Override // java.lang.Runnable
    public final void run() {
        G g9 = p2.j.f39798C.f39803c;
        Context context = this.f40907n;
        AlertDialog.Builder k6 = G.k(context);
        k6.setMessage(this.f40908u);
        if (this.f40909v) {
            k6.setTitle("Error");
        } else {
            k6.setTitle("Info");
        }
        if (this.f40910w) {
            k6.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            k6.setPositiveButton("Learn More", new com.icefishing.icefishingliveapp.D(this, context));
            k6.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        k6.create().show();
    }
}
