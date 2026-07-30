package defpackage;

import android.app.Activity;
import android.content.Intent;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class qs1 extends vs1 {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ int c;

    public qs1(Activity activity, Intent intent, int i) {
        this.a = intent;
        this.b = activity;
        this.c = i;
    }

    @Override // defpackage.vs1
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.c);
        }
    }
}
