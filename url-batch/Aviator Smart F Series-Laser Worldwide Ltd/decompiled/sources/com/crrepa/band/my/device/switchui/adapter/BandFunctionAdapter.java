package com.crrepa.band.my.device.switchui.adapter;

import android.view.View;
import android.widget.CheckBox;
import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.module.BaseDraggableModule;
import com.chad.library.adapter.base.module.DraggableModule;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.BandFunctionModel;

/* loaded from: classes2.dex */
public class BandFunctionAdapter extends BaseQuickAdapter<BandFunctionModel, BaseViewHolder> implements DraggableModule {
    public BandFunctionAdapter() {
        super(R.layout.item_band_function, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$convert$0(BandFunctionModel bandFunctionModel, CheckBox checkBox, View view) {
        bandFunctionModel.setEnable(checkBox.isChecked());
    }

    @Override // com.chad.library.adapter.base.module.DraggableModule
    @NonNull
    public BaseDraggableModule addDraggableModule(@NonNull BaseQuickAdapter<?, ?> baseQuickAdapter) {
        return new BaseDraggableModule(baseQuickAdapter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, final BandFunctionModel bandFunctionModel) {
        baseViewHolder.setText(R.id.tv_function_name, bandFunctionModel.getName());
        final CheckBox checkBox = (CheckBox) baseViewHolder.getView(R.id.cb_function);
        checkBox.setChecked(bandFunctionModel.isEnable());
        checkBox.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.switchui.adapter.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandFunctionAdapter.lambda$convert$0(BandFunctionModel.this, checkBox, view);
            }
        });
    }
}
