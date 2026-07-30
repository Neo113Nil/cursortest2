package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class ke1 extends je1 {
    @Override // defpackage.je1, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            return lt1Var.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }
}
