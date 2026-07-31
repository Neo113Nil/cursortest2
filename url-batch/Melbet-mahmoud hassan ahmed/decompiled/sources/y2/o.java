package y2;

import android.content.Context;
import com.google.android.gms.internal.ads.fb;
import com.google.android.gms.internal.ads.gb;
import com.google.android.gms.internal.ads.po0;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class o implements Callable<gb> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f23424a;

    o(s sVar) {
        this.f23424a = sVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ gb call() {
        po0 po0Var;
        Context context;
        po0Var = this.f23424a.f23432f;
        String str = po0Var.f10301f;
        context = this.f23424a.f23435i;
        return new gb(fb.v(str, context, false));
    }
}
