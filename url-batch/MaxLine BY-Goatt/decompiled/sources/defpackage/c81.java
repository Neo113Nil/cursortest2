package defpackage;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class c81 extends ul1 implements b81 {
    public Function1 A;
    public Function1 B;

    @Override // defpackage.b81
    public final boolean V(KeyEvent keyEvent) {
        Function1 function1 = this.A;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new x71(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.b81
    public final boolean n(KeyEvent keyEvent) {
        Function1 function1 = this.B;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new x71(keyEvent))).booleanValue();
        }
        return false;
    }
}
