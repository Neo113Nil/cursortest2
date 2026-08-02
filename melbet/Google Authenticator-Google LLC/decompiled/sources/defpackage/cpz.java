package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cpz extends cqa {
    final /* synthetic */ Intent a;
    final /* synthetic */ com b;

    public cpz(Intent intent, com comVar) {
        this.a = intent;
        this.b = comVar;
    }

    @Override // defpackage.cqa
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
