package com.drake.net.interfaces;

import android.app.Dialog;
import android.app.ProgressDialog;
import androidx.fragment.app.FragmentActivity;
import com.drake.net.R$string;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public interface a {
    public static final C0259a DEFAULT = C0259a.$$INSTANCE;

    /* renamed from: com.drake.net.interfaces.a$a, reason: collision with other inner class name */
    public static final class C0259a implements a {
        static final /* synthetic */ C0259a $$INSTANCE = new C0259a();

        private C0259a() {
        }

        @Override // com.drake.net.interfaces.a
        public Dialog onCreate(FragmentActivity activity) {
            s.checkNotNullParameter(activity, "activity");
            ProgressDialog progressDialog = new ProgressDialog(activity);
            progressDialog.setMessage(activity.getString(R$string.net_dialog_msg));
            return progressDialog;
        }
    }

    Dialog onCreate(FragmentActivity fragmentActivity);
}
