package defpackage;

import android.content.Intent;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class us1 extends vs1 {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ tg0 b;

    public us1(Intent intent, tg0 tg0Var) {
        this.a = intent;
        this.b = tg0Var;
    }

    @Override // defpackage.vs1
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.a(2, intent);
        }
    }
}
