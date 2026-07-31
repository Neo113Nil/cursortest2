package a3;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* loaded from: classes.dex */
final class a0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Context f35f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f36g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f37h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f38i;

    a0(c0 c0Var, Context context, String str, boolean z6, boolean z7) {
        this.f35f = context;
        this.f36g = str;
        this.f37h = z6;
        this.f38i = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f35f);
        builder.setMessage(this.f36g);
        builder.setTitle(this.f37h ? "Error" : "Info");
        if (this.f38i) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new z(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
