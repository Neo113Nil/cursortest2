package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.zn.iv;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class TTDislikeDialogAbstract extends Dialog implements iv.fs {
    private View fb;
    protected List<FilterWord> fs;
    protected String zmn;
    protected final iv zn;

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract View getLayoutView();

    public TTDislikeDialogAbstract(@NonNull Context context) {
        super(context);
        iv ivVar = new iv();
        this.zn = ivVar;
        ivVar.zmn(this);
    }

    public TTDislikeDialogAbstract(@NonNull Context context, int i) {
        super(context, i);
        iv ivVar = new iv();
        this.zn = ivVar;
        ivVar.zmn(this);
    }

    public iv getDislikeManager() {
        return this.zn;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.fb = getLayoutView();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        View view = this.fb;
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        setContentView(view, layoutParams);
    }

    public void setMaterialMeta(String str, List<FilterWord> list) {
        this.zmn = str;
        this.fs = list;
        this.zn.zmn(str);
        this.zn.zmn(this.fs);
    }

    public void onSuggestionSubmit(String str) {
        iv ivVar = this.zn;
        if (ivVar != null) {
            ivVar.zn(str);
        }
    }

    public void destroy() {
        iv ivVar = this.zn;
        if (ivVar != null) {
            ivVar.zmn();
        }
    }
}
