package I0;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;
import z.InputConnectionC1234B;

/* loaded from: classes.dex */
public class q extends p {
    @Override // I0.p, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        if (inputConnectionC1234B != null) {
            return inputConnectionC1234B.commitContent(inputContentInfo, i3, bundle);
        }
        return false;
    }
}
