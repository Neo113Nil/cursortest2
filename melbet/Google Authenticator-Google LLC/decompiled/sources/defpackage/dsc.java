package defpackage;

import android.content.Intent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dsc implements dry {
    @Override // defpackage.dry, defpackage.dou
    public final void a(View view, Object obj) {
        Intent intent = new Intent("android.settings.SYNC_SETTINGS");
        intent.addFlags(32768);
        intent.addFlags(524288);
        view.getContext().startActivity(intent);
    }
}
