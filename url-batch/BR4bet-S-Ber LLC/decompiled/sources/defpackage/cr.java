package defpackage;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class cr extends InputConnectionWrapper {
    public final /* synthetic */ c2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr(InputConnection inputConnection, c2 c2Var) {
        super(inputConnection, false);
        this.a = c2Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        fe feVar;
        rc0 rc0Var = inputContentInfo == null ? null : new rc0(27, new rc0(26, inputContentInfo));
        t4 t4Var = (t4) this.a.g;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((rc0) rc0Var.g).g).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((rc0) rc0Var.g).g;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((rc0) rc0Var.g).g;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            feVar = new rc0(clipData, 2);
        } else {
            ge geVar = new ge();
            geVar.g = clipData;
            geVar.h = 2;
            feVar = geVar;
        }
        feVar.t(inputContentInfo3.getLinkUri());
        feVar.setExtras(bundle2);
        if (ic0.i(t4Var, feVar.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
