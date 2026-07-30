package com.crrepa.band.my.home.guidance.permission.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import com.crrepa.band.my.databinding.DialogPermissionExplainBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBDialog;

/* loaded from: classes2.dex */
public class PermissionDescriptionDialog extends BaseVBDialog<DialogPermissionExplainBinding> {
    private b onClickListener;

    public static class a {
        private String content;
        private Drawable icon;
        private b onClickListener;

        /* renamed from: permissions, reason: collision with root package name */
        private String[] f12061permissions;
        private String tips;
        private String title;

        public PermissionDescriptionDialog build(Context context) {
            PermissionDescriptionDialog permissionDescriptionDialog = new PermissionDescriptionDialog(context);
            permissionDescriptionDialog.setIcon(this.icon);
            permissionDescriptionDialog.setTitle(this.title);
            try {
                permissionDescriptionDialog.setContent(String.format(this.content, e.getNeedPermissionString(context, this.f12061permissions)));
            } catch (Exception unused) {
                permissionDescriptionDialog.setContent(this.content);
            }
            permissionDescriptionDialog.setTips(this.tips);
            permissionDescriptionDialog.setOnClickListener(this.onClickListener);
            return permissionDescriptionDialog;
        }

        public a setContent(String str) {
            this.content = str;
            return this;
        }

        public a setIcon(Drawable drawable) {
            this.icon = drawable;
            return this;
        }

        public a setOnClickListener(b bVar) {
            this.onClickListener = bVar;
            return this;
        }

        public a setPermissions(String... strArr) {
            this.f12061permissions = strArr;
            return this;
        }

        public a setTips(String str) {
            this.tips = str;
            return this;
        }

        public a setTitle(String str) {
            this.title = str;
            return this;
        }

        public a setContent(@StringRes int i8) {
            this.content = com.moyoung.dafit.module.common.utils.d.get().getString(i8);
            return this;
        }

        public a setIcon(@DrawableRes int i8) {
            this.icon = ContextCompat.getDrawable(com.moyoung.dafit.module.common.utils.d.get(), i8);
            return this;
        }

        public a setTips(@StringRes int i8) {
            this.tips = com.moyoung.dafit.module.common.utils.d.get().getString(i8);
            return this;
        }

        public a setTitle(@StringRes int i8) {
            this.title = com.moyoung.dafit.module.common.utils.d.get().getString(i8);
            return this;
        }
    }

    public interface b {
        void onEnable();

        void onNotNow();
    }

    public static class c {
        private String content;
        private Drawable icon;
        private b onClickListener;
        private String tips;
        private String title;

        public PermissionDescriptionDialog build(Context context) {
            PermissionDescriptionDialog permissionDescriptionDialog = new PermissionDescriptionDialog(context);
            permissionDescriptionDialog.setIcon(this.icon);
            permissionDescriptionDialog.setTitle(this.title);
            permissionDescriptionDialog.setContent(this.content);
            permissionDescriptionDialog.setTips(this.tips);
            permissionDescriptionDialog.setOnClickListener(this.onClickListener);
            return permissionDescriptionDialog;
        }

        public c setContent(String str) {
            this.content = str;
            return this;
        }

        public c setIcon(Drawable drawable) {
            this.icon = drawable;
            return this;
        }

        public c setOnClickListener(b bVar) {
            this.onClickListener = bVar;
            return this;
        }

        public c setTips(String str) {
            this.tips = str;
            return this;
        }

        public c setTitle(String str) {
            this.title = str;
            return this;
        }

        public c setContent(@StringRes int i8) {
            this.content = com.moyoung.dafit.module.common.utils.d.get().getString(i8);
            return this;
        }

        public c setIcon(@DrawableRes int i8) {
            this.icon = ContextCompat.getDrawable(com.moyoung.dafit.module.common.utils.d.get(), i8);
            return this;
        }

        public c setTips(@StringRes int i8) {
            this.tips = com.moyoung.dafit.module.common.utils.d.get().getString(i8);
            return this;
        }

        public c setTitle(@StringRes int i8) {
            this.title = com.moyoung.dafit.module.common.utils.d.get().getString(i8);
            return this;
        }
    }

    public PermissionDescriptionDialog(Context context) {
        super(context);
    }

    public static a builderMultiplePermission() {
        return new a();
    }

    public static c builderSinglePermission() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        b bVar = this.onClickListener;
        if (bVar != null) {
            bVar.onEnable();
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        dismiss();
        b bVar = this.onClickListener;
        if (bVar != null) {
            bVar.onNotNow();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$2(DialogInterface dialogInterface) {
        b bVar = this.onClickListener;
        if (bVar != null) {
            bVar.onNotNow();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(String str) {
        ((DialogPermissionExplainBinding) this.binding).tvContent1.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(Drawable drawable) {
        ((DialogPermissionExplainBinding) this.binding).ivIcon.setImageDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTips(String str) {
        ((DialogPermissionExplainBinding) this.binding).tvTips.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        ((DialogPermissionExplainBinding) this.binding).tvTips.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        ((DialogPermissionExplainBinding) this.binding).tvTitle.setText(str);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBDialog
    protected void initBinding() {
        setShowBottomWithAnim();
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        ((DialogPermissionExplainBinding) this.binding).btnEnable.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.permission.dialog.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PermissionDescriptionDialog.this.lambda$initBinding$0(view);
            }
        });
        ((DialogPermissionExplainBinding) this.binding).btnNotNow.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.permission.dialog.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PermissionDescriptionDialog.this.lambda$initBinding$1(view);
            }
        });
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.crrepa.band.my.home.guidance.permission.dialog.c
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                PermissionDescriptionDialog.this.lambda$initBinding$2(dialogInterface);
            }
        });
    }

    public void setOnClickListener(b bVar) {
        this.onClickListener = bVar;
    }
}
