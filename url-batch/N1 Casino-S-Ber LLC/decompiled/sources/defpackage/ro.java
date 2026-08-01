package defpackage;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ro extends InputConnectionWrapper {
    public final /* synthetic */ l40 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro(InputConnection inputConnection, l40 l40Var) {
        super(inputConnection, false);
        this.a = l40Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        fd fdVar;
        k0 k0Var = inputContentInfo == null ? null : new k0(28, new k0(27, inputContentInfo));
        j4 j4Var = (j4) this.a.g;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((k0) k0Var.g).g).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((k0) k0Var.g).g;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((k0) k0Var.g).g;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            fdVar = new k0(clipData, 2);
        } else {
            gd gdVar = new gd();
            gdVar.g = clipData;
            gdVar.h = 2;
            fdVar = gdVar;
        }
        fdVar.u(inputContentInfo3.getLinkUri());
        fdVar.setExtras(bundle2);
        if (x80.i(j4Var, fdVar.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
