package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class kt1 extends jt1 {
    @Override // defpackage.jt1, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        u72 u72Var = this.b;
        if (u72Var != null) {
            return u72Var.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }
}
