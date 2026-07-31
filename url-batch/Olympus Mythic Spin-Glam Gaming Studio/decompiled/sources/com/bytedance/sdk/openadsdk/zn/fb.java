package com.bytedance.sdk.openadsdk.zn;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.utils.jy;
import java.util.List;
import org.chromium.net.NetError;

/* loaded from: classes11.dex */
public class fb extends TTDislikeDialogAbstract {
    private zmn fb;

    public interface zmn {
        void fs();

        void zmn();

        void zmn(int i, FilterWord filterWord);
    }

    public fb(Context context, String str, List<FilterWord> list) {
        super(context, doe.hhw(context, "tt_dislikeDialog"));
        this.zmn = str;
        this.fs = list;
    }

    public void zmn(zmn zmnVar) {
        this.fb = zmnVar;
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            setCanceledOnTouchOutside(true);
            setCancelable(true);
            zmn();
            fs();
            setMaterialMeta(this.zmn, this.fs);
        } catch (Throwable unused) {
            dismiss();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public View getLayoutView() {
        return new bvs(getContext(), this.zn, this.fs);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(jy.zn(getContext()) + NetError.ERR_SOCKS_CONNECTION_FAILED, -2);
    }

    @Override // com.bytedance.sdk.openadsdk.zn.iv.fs
    public void zmn(int i) {
        FilterWord fs;
        if (iv.zn == i) {
            dismiss();
            return;
        }
        if (iv.btk == i) {
            zmn zmnVar = this.fb;
            if (zmnVar != null) {
                zmnVar.zmn();
                return;
            }
            return;
        }
        if (iv.fs != i || (fs = this.zn.fs()) == null || iv.zmn.equals(fs)) {
            return;
        }
        zmn zmnVar2 = this.fb;
        if (zmnVar2 != null) {
            try {
                zmnVar2.zmn(0, fs);
            } catch (Throwable unused) {
            }
        }
        dismiss();
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    private void zmn() {
        Window window = getWindow();
        if (window == null || window.getAttributes() == null) {
            return;
        }
        window.getAttributes().windowAnimations = 0;
    }

    private void fs() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.bytedance.sdk.openadsdk.zn.fb.1
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                if (fb.this.fb != null) {
                    zmn unused = fb.this.fb;
                }
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.bytedance.sdk.openadsdk.zn.fb.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (fb.this.fb != null) {
                    fb.this.fb.fs();
                }
            }
        });
    }
}
