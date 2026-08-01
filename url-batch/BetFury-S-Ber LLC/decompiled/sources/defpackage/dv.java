package defpackage;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class dv extends InputConnectionWrapper {
    public final /* synthetic */ cv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv(InputConnection inputConnection, cv cvVar) {
        super(inputConnection, false);
        this.a = cvVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        wf wfVar;
        o0 o0Var = inputContentInfo == null ? null : new o0(29, new o0(28, inputContentInfo));
        c5 c5Var = (c5) this.a.f;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((o0) o0Var.g).g).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((o0) o0Var.g).g;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((o0) o0Var.g).g;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            wfVar = new o0(clipData, 2);
        } else {
            xf xfVar = new xf();
            xfVar.g = clipData;
            xfVar.h = 2;
            wfVar = xfVar;
        }
        wfVar.q(inputContentInfo3.getLinkUri());
        wfVar.setExtras(bundle2);
        if (hm0.i(c5Var, wfVar.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
