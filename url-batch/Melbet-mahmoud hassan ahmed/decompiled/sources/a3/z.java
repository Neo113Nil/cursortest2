package a3;

import android.content.DialogInterface;
import android.net.Uri;

/* loaded from: classes.dex */
final class z implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a0 f205a;

    z(a0 a0Var) {
        this.f205a = a0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        y2.t.q();
        g2.y(this.f205a.f35f, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
