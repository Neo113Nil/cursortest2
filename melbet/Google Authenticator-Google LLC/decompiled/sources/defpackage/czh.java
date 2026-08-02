package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class czh extends cza {
    final /* synthetic */ Context a;
    final /* synthetic */ bst b;
    private final WeakReference c;

    public czh(Context context, bst bstVar) {
        this.a = context;
        this.b = bstVar;
        this.c = new WeakReference(context);
    }

    @Override // defpackage.cza
    public final void c(Status status, String str, cmn cmnVar) {
        if (status.c()) {
            Intent intent = new Intent(str).setPackage("com.google.android.gms");
            Bundle bundle = new Bundle();
            bundle.putString("ApplicationId", this.a.getPackageName());
            intent.putExtras(bundle);
            Context context = (Context) this.c.get();
            if (context != null) {
                context.startActivity(intent);
            }
            ox.s(status, null, this.b, cmnVar);
        }
    }
}
