package defpackage;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class gp extends InputConnectionWrapper {
    public final /* synthetic */ u40 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp(InputConnection inputConnection, u40 u40Var) {
        super(inputConnection, false);
        this.a = u40Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        jd jdVar;
        j1 j1Var = inputContentInfo == null ? null : new j1(24, new j1(23, inputContentInfo));
        a5 a5Var = (a5) this.a.g;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((j1) j1Var.g).g).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((j1) j1Var.g).g;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((j1) j1Var.g).g;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            jdVar = new j1(clipData, 2);
        } else {
            kd kdVar = new kd();
            kdVar.g = clipData;
            kdVar.h = 2;
            jdVar = kdVar;
        }
        jdVar.p(inputContentInfo3.getLinkUri());
        jdVar.setExtras(bundle2);
        if (e90.i(a5Var, jdVar.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
