package com.facebook.login;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.facebook.login.FBLoginSSONoAppDialog;
import defpackage.ta0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class FBLoginSSONoAppDialog extends ta0 {
    private static final String ARG_FB4A_OUTDATED = "fb4a_outdated";
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "FBLoginSSONoAppDialog";
    private boolean continueClicked;
    private Function0<Unit> onContinueListener;
    private Function0<Unit> onDismissListener;

    public static final FBLoginSSONoAppDialog newInstance(boolean z) {
        return Companion.newInstance(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$0(FBLoginSSONoAppDialog fBLoginSSONoAppDialog, View view) {
        fBLoginSSONoAppDialog.getClass();
        fBLoginSSONoAppDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$1(FBLoginSSONoAppDialog fBLoginSSONoAppDialog, View view) {
        fBLoginSSONoAppDialog.getClass();
        fBLoginSSONoAppDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$2(FBLoginSSONoAppDialog fBLoginSSONoAppDialog, View view) {
        fBLoginSSONoAppDialog.getClass();
        fBLoginSSONoAppDialog.continueClicked = true;
        Function0<Unit> function0 = fBLoginSSONoAppDialog.onContinueListener;
        if (function0 != null) {
            function0.invoke();
        }
        fBLoginSSONoAppDialog.dismiss();
    }

    public final Function0<Unit> getOnContinueListener() {
        return this.onContinueListener;
    }

    public final Function0<Unit> getOnDismissListener() {
        return this.onDismissListener;
    }

    @Override // defpackage.ta0, defpackage.fr0
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, com.facebook.common.R.style.com_facebook_sso_noapp_dialog);
    }

    @Override // defpackage.fr0
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        final int i = 0;
        View inflate = layoutInflater.inflate(com.facebook.common.R.layout.com_facebook_sso_noapp_dialog, viewGroup, false);
        Bundle arguments = getArguments();
        if (arguments != null ? arguments.getBoolean(ARG_FB4A_OUTDATED, false) : false) {
            ((TextView) inflate.findViewById(com.facebook.common.R.id.com_facebook_sso_noapp_title)).setText(com.facebook.common.R.string.com_facebook_sso_outdated_title);
            ((TextView) inflate.findViewById(com.facebook.common.R.id.com_facebook_sso_noapp_body)).setText(com.facebook.common.R.string.com_facebook_sso_outdated_body);
        }
        inflate.findViewById(com.facebook.common.R.id.com_facebook_sso_noapp_close).setOnClickListener(new View.OnClickListener(this) { // from class: zj0
            public final /* synthetic */ FBLoginSSONoAppDialog n;

            {
                this.n = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                FBLoginSSONoAppDialog fBLoginSSONoAppDialog = this.n;
                switch (i2) {
                    case 0:
                        FBLoginSSONoAppDialog.onCreateView$lambda$0(fBLoginSSONoAppDialog, view);
                        break;
                    case 1:
                        FBLoginSSONoAppDialog.onCreateView$lambda$1(fBLoginSSONoAppDialog, view);
                        break;
                    default:
                        FBLoginSSONoAppDialog.onCreateView$lambda$2(fBLoginSSONoAppDialog, view);
                        break;
                }
            }
        });
        final int i2 = 1;
        inflate.findViewById(com.facebook.common.R.id.com_facebook_sso_noapp_not_now).setOnClickListener(new View.OnClickListener(this) { // from class: zj0
            public final /* synthetic */ FBLoginSSONoAppDialog n;

            {
                this.n = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                FBLoginSSONoAppDialog fBLoginSSONoAppDialog = this.n;
                switch (i22) {
                    case 0:
                        FBLoginSSONoAppDialog.onCreateView$lambda$0(fBLoginSSONoAppDialog, view);
                        break;
                    case 1:
                        FBLoginSSONoAppDialog.onCreateView$lambda$1(fBLoginSSONoAppDialog, view);
                        break;
                    default:
                        FBLoginSSONoAppDialog.onCreateView$lambda$2(fBLoginSSONoAppDialog, view);
                        break;
                }
            }
        });
        final int i3 = 2;
        inflate.findViewById(com.facebook.common.R.id.com_facebook_sso_noapp_continue).setOnClickListener(new View.OnClickListener(this) { // from class: zj0
            public final /* synthetic */ FBLoginSSONoAppDialog n;

            {
                this.n = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i3;
                FBLoginSSONoAppDialog fBLoginSSONoAppDialog = this.n;
                switch (i22) {
                    case 0:
                        FBLoginSSONoAppDialog.onCreateView$lambda$0(fBLoginSSONoAppDialog, view);
                        break;
                    case 1:
                        FBLoginSSONoAppDialog.onCreateView$lambda$1(fBLoginSSONoAppDialog, view);
                        break;
                    default:
                        FBLoginSSONoAppDialog.onCreateView$lambda$2(fBLoginSSONoAppDialog, view);
                        break;
                }
            }
        });
        return inflate;
    }

    @Override // defpackage.ta0, defpackage.fr0
    public void onDestroyView() {
        super.onDestroyView();
        this.onContinueListener = null;
        this.onDismissListener = null;
    }

    @Override // defpackage.ta0, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        Function0<Unit> function0;
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        if (this.continueClicked || (function0 = this.onDismissListener) == null) {
            return;
        }
        function0.invoke();
    }

    @Override // defpackage.ta0, defpackage.fr0
    public void onStart() {
        Window window;
        super.onStart();
        boolean z = getResources().getConfiguration().orientation == 2;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawableResource(android.R.color.transparent);
        if (z) {
            window.setLayout((int) (getResources().getDisplayMetrics().widthPixels * 0.6d), -2);
            window.setGravity(17);
        } else {
            window.setLayout(-1, -2);
            window.setGravity(80);
        }
    }

    public final void setOnContinueListener(Function0<Unit> function0) {
        this.onContinueListener = function0;
    }

    public final void setOnDismissListener(Function0<Unit> function0) {
        this.onDismissListener = function0;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ FBLoginSSONoAppDialog newInstance$default(Companion companion, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.newInstance(z);
        }

        public final FBLoginSSONoAppDialog newInstance(boolean z) {
            FBLoginSSONoAppDialog fBLoginSSONoAppDialog = new FBLoginSSONoAppDialog();
            Bundle bundle = new Bundle();
            bundle.putBoolean(FBLoginSSONoAppDialog.ARG_FB4A_OUTDATED, z);
            fBLoginSSONoAppDialog.setArguments(bundle);
            return fBLoginSSONoAppDialog;
        }

        private Companion() {
        }
    }
}
