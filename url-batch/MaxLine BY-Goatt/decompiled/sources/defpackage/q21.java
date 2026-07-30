package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class q21 extends InputConnectionWrapper {
    public final /* synthetic */ k4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q21(InputConnection inputConnection, k4 k4Var) {
        super(inputConnection, false);
        this.a = k4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Object[] objArr;
        ResultReceiver resultReceiver;
        k4 k4Var = this.a;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        if (bundle != null) {
            if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                objArr = false;
            } else if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                objArr = true;
            }
            try {
                resultReceiver = (ResultReceiver) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
            } catch (Throwable th) {
                th = th;
                resultReceiver = null;
            }
            try {
                Uri uri = (Uri) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                Uri uri2 = (Uri) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                int i = bundle.getInt(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                Bundle bundle2 = (Bundle) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                if (uri != null && clipDescription != null) {
                    at0 at0Var = new at0();
                    if (Build.VERSION.SDK_INT >= 25) {
                        at0Var.m = new r21(uri, clipDescription, uri2);
                    } else {
                        at0Var.m = new mh(uri, clipDescription, uri2, 12);
                    }
                    z = k4Var.e(at0Var, i, bundle2);
                }
                if (resultReceiver != null) {
                    resultReceiver.send(z ? 1 : 0, null);
                }
            } catch (Throwable th2) {
                th = th2;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        }
        if (z) {
            return true;
        }
        return super.performPrivateCommand(str, bundle);
    }
}
