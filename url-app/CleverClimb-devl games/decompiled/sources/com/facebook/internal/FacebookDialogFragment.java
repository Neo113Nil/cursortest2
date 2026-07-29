package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import com.facebook.internal.ad;

/* loaded from: classes.dex */
public class FacebookDialogFragment extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    private Dialog f6043a;

    public void a(Dialog dialog) {
        this.f6043a = dialog;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        ad adVar;
        super.onCreate(bundle);
        if (this.f6043a == null) {
            FragmentActivity activity = getActivity();
            Bundle d2 = w.d(activity.getIntent());
            if (!d2.getBoolean("is_fallback", false)) {
                String string = d2.getString("action");
                Bundle bundle2 = d2.getBundle("params");
                if (ab.a(string)) {
                    ab.a("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
                    activity.finish();
                    return;
                }
                adVar = new ad.a(activity, string, bundle2).a(new ad.c() { // from class: com.facebook.internal.FacebookDialogFragment.1
                    @Override // com.facebook.internal.ad.c
                    public void a(Bundle bundle3, com.facebook.j jVar) {
                        FacebookDialogFragment.this.a(bundle3, jVar);
                    }
                }).a();
            } else {
                String string2 = d2.getString("url");
                if (ab.a(string2)) {
                    ab.a("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    activity.finish();
                    return;
                } else {
                    k kVar = new k(activity, string2, String.format("fb%s://bridge/", com.facebook.l.i()));
                    kVar.a(new ad.c() { // from class: com.facebook.internal.FacebookDialogFragment.2
                        @Override // com.facebook.internal.ad.c
                        public void a(Bundle bundle3, com.facebook.j jVar) {
                            FacebookDialogFragment.this.a(bundle3);
                        }
                    });
                    adVar = kVar;
                }
            }
            this.f6043a = adVar;
        }
    }

    @Override // android.support.v4.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f6043a == null) {
            a((Bundle) null, (com.facebook.j) null);
            setShowsDialog(false);
        }
        return this.f6043a;
    }

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f6043a instanceof ad) {
            ((ad) this.f6043a).d();
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bundle bundle, com.facebook.j jVar) {
        FragmentActivity activity = getActivity();
        activity.setResult(jVar == null ? -1 : 0, w.a(activity.getIntent(), bundle, jVar));
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bundle bundle) {
        FragmentActivity activity = getActivity();
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        activity.setResult(-1, intent);
        activity.finish();
    }
}
