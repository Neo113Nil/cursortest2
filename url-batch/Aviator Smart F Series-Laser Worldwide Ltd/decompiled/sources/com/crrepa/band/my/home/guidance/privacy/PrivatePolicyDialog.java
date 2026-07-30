package com.crrepa.band.my.home.guidance.privacy;

import android.content.Context;
import android.view.View;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.DialogPrivatePolicySelectBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBDialog;

/* loaded from: classes2.dex */
public class PrivatePolicyDialog extends BaseVBDialog<DialogPrivatePolicySelectBinding> {
    private final a onSelectedListener;
    private String selectedUrl;

    public interface a {
        void onSelected(String str);
    }

    public PrivatePolicyDialog(Context context, a aVar) {
        super(context);
        this.onSelectedListener = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        this.onSelectedListener.onSelected(this.selectedUrl);
        hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        ((DialogPrivatePolicySelectBinding) this.binding).ivSelectUs.setImageResource(R$drawable.ic_selected_h);
        ((DialogPrivatePolicySelectBinding) this.binding).ivSelectUk.setImageResource(R$drawable.ic_selected_n);
        ((DialogPrivatePolicySelectBinding) this.binding).ivSelectOther.setImageResource(R$drawable.ic_selected_n);
        ((DialogPrivatePolicySelectBinding) this.binding).ivSelectCn.setImageResource(R$drawable.ic_selected_n);
        this.selectedUrl = "http://cdn.moyoung.com/HTML/U.html";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$2(View view) {
        ((DialogPrivatePolicySelectBinding) this.binding).ivSelectUs.setImageResource(R$drawable.ic_selected_n);
        ((DialogPrivatePolicySelectBinding) this.binding).ivSelectUk.setImageResource(R$drawable.ic_selected_h);
        ((DialogPrivatePolicySelectBinding) this.binding).ivSelectOther.setImageResource(R$drawable.ic_selected_n);
        ((DialogPrivatePolicySelectBinding) this.binding).ivSelectCn.setImageResource(R$drawable.ic_selected_n);
        this.selectedUrl = "http://cdn.moyoung.com/HTML/EEA_UK_Switzerland.html";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$3(View view) {
        ((DialogPrivatePolicySelectBinding) this.binding).ivSelectUs.setImageResource(R$drawable.ic_selected_n);
        ((DialogPrivatePolicySelectBinding) this.binding).ivSelectUk.setImageResource(R$drawable.ic_selected_n);
        ((DialogPrivatePolicySelectBinding) this.binding).ivSelectOther.setImageResource(R$drawable.ic_selected_h);
        ((DialogPrivatePolicySelectBinding) this.binding).ivSelectCn.setImageResource(R$drawable.ic_selected_n);
        this.selectedUrl = "http://cdn.moyoung.com/HTML/Other_regions.html";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$4(View view) {
        ((DialogPrivatePolicySelectBinding) this.binding).ivSelectUs.setImageResource(R$drawable.ic_selected_n);
        ((DialogPrivatePolicySelectBinding) this.binding).ivSelectUk.setImageResource(R$drawable.ic_selected_n);
        ((DialogPrivatePolicySelectBinding) this.binding).ivSelectOther.setImageResource(R$drawable.ic_selected_n);
        ((DialogPrivatePolicySelectBinding) this.binding).ivSelectCn.setImageResource(R$drawable.ic_selected_h);
        this.selectedUrl = "http://cdn.moyoung.com/HTML/zh.html";
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBDialog
    protected void initBinding() {
        ((DialogPrivatePolicySelectBinding) this.binding).tvNext.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.privacy.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivatePolicyDialog.this.lambda$initBinding$0(view);
            }
        });
        ((DialogPrivatePolicySelectBinding) this.binding).llUs.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.privacy.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivatePolicyDialog.this.lambda$initBinding$1(view);
            }
        });
        ((DialogPrivatePolicySelectBinding) this.binding).llUk.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.privacy.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivatePolicyDialog.this.lambda$initBinding$2(view);
            }
        });
        ((DialogPrivatePolicySelectBinding) this.binding).llOther.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.privacy.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivatePolicyDialog.this.lambda$initBinding$3(view);
            }
        });
        ((DialogPrivatePolicySelectBinding) this.binding).llCn.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.privacy.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivatePolicyDialog.this.lambda$initBinding$4(view);
            }
        });
    }
}
