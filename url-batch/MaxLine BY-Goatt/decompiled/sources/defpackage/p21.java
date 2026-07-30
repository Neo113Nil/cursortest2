package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class p21 extends InputConnectionWrapper {
    public final /* synthetic */ k4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p21(InputConnection inputConnection, k4 k4Var) {
        super(inputConnection, false);
        this.a = k4Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        at0 at0Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            at0Var = new at0(new r21(inputContentInfo));
        }
        if (this.a.e(at0Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
