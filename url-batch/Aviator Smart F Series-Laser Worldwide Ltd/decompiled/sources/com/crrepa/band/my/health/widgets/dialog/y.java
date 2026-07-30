package com.crrepa.band.my.health.widgets.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.WebActivity;
import com.crrepa.band.my.databinding.DialogPrivacyBinding;

/* loaded from: classes2.dex */
public class y extends Dialog {
    private DialogPrivacyBinding binding;
    private c clickListener;

    class a extends ClickableSpan {
        a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            y.this.startPrivacyActivity(false);
        }
    }

    class b extends ClickableSpan {
        b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            y.this.startPrivacyActivity(true);
        }
    }

    public interface c {
        void onAgreeClicked(y yVar);

        void onDenyClicked(y yVar);
    }

    public y(@NonNull Context context) {
        super(context, R.style.UserInfoChooceDialog);
    }

    private void initLayout() {
        Window window = getWindow();
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = getContext().getResources().getDisplayMetrics().widthPixels;
        window.setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        c cVar = this.clickListener;
        if (cVar != null) {
            cVar.onDenyClicked(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(View view) {
        c cVar = this.clickListener;
        if (cVar != null) {
            cVar.onAgreeClicked(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startPrivacyActivity(boolean z7) {
        String string;
        String str;
        if (z7) {
            string = getContext().getString(R.string.privacy_policy);
            str = "DaFitPrivacy.html";
        } else {
            string = getContext().getString(R.string.software_license);
            str = "software_license.html";
        }
        getContext().startActivity(WebActivity.getCallingIntent(getContext(), string, "file:///android_asset/" + str));
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DialogPrivacyBinding inflate = DialogPrivacyBinding.inflate(LayoutInflater.from(getContext()));
        this.binding = inflate;
        setContentView(inflate.getRoot());
        initLayout();
        this.binding.tvStatementTermsContent.setText(com.moyoung.dafit.module.common.utils.h0.getBuilder(getContext().getString(R.string.statement_terms_top_content)).append(System.getProperty("line.separator")).append(getContext().getString(R.string.privacy_policy)).setClickSpan(new b()).append(getContext().getString(R.string.and)).append(getContext().getString(R.string.software_license)).setClickSpan(new a()).append(System.getProperty("line.separator")).append(getContext().getString(R.string.statement_terms_bottom_content)).create());
        this.binding.tvStatementTermsContent.setMovementMethod(q1.a.getInstance());
        this.binding.tvStatementTermsContent.setFocusable(false);
        this.binding.tvStatementTermsContent.setClickable(false);
        this.binding.tvStatementTermsContent.setLongClickable(false);
        this.binding.tvDisagree.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.widgets.dialog.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y.this.lambda$onCreate$0(view);
            }
        });
        this.binding.tvAgree.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.widgets.dialog.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y.this.lambda$onCreate$1(view);
            }
        });
    }

    public void setClickListener(c cVar) {
        this.clickListener = cVar;
    }
}
