package s7;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g4 implements o4, x0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j4 f8711d;

    public /* synthetic */ g4(j4 j4Var) {
        this.f8711d = j4Var;
    }

    @Override // s7.o4
    public void a(String str, String str2, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        j4 j4Var = this.f8711d;
        if (!isEmpty) {
            j4Var.d().B(new d6.t(this, str, str2, bundle, 11));
            return;
        }
        q1 q1Var = j4Var.f8771z;
        if (q1Var != null) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9050t.b(str2, "AppId not known when logging event");
        }
    }

    @Override // s7.x0
    public /* synthetic */ void b(String str, int i3, Throwable th, byte[] bArr, Map map) {
        this.f8711d.B(str, i3, th, bArr, map);
    }
}
