package j0;

import M2.p;
import S.n;
import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class e extends n implements d {

    /* renamed from: t, reason: collision with root package name */
    public Function1 f7141t;

    /* renamed from: u, reason: collision with root package name */
    public p f7142u;

    /* JADX WARN: Type inference failed for: r0v0, types: [M2.p, kotlin.jvm.functions.Function1] */
    @Override // j0.d
    public final boolean n(KeyEvent keyEvent) {
        ?? r02 = this.f7142u;
        if (r02 != 0) {
            return ((Boolean) r02.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // j0.d
    public final boolean r(KeyEvent keyEvent) {
        Function1 function1 = this.f7141t;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }
}
