package com.crrepa.band.my.device.cricket;

import android.content.Context;
import android.view.View;
import com.crrepa.band.my.databinding.DialogCricketSettingBinding;
import com.crrepa.band.my.device.cricket.model.provider.CricketSettingProvider;
import com.moyoung.dafit.module.common.baseui.BaseVBDialog;
import java.util.List;

/* loaded from: classes2.dex */
public class CricketSettingDialog extends BaseVBDialog<DialogCricketSettingBinding> {
    private a onDoneClickListener;

    public interface a {
        void onDone(int i8, String str);
    }

    public CricketSettingDialog(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(List list, View view) {
        int currentItemPosition = ((DialogCricketSettingBinding) this.binding).wheelPicker.getCurrentItemPosition();
        a aVar = this.onDoneClickListener;
        if (aVar != null) {
            aVar.onDone(CricketSettingProvider.getReminderTime(currentItemPosition), (String) list.get(currentItemPosition));
        }
        dismiss();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBDialog
    protected void initBinding() {
        final List<String> defaultReminderTimeList = CricketSettingProvider.getDefaultReminderTimeList(getContext());
        ((DialogCricketSettingBinding) this.binding).wheelPicker.setData(defaultReminderTimeList);
        ((DialogCricketSettingBinding) this.binding).tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.cricket.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CricketSettingDialog.this.lambda$initBinding$0(view);
            }
        });
        ((DialogCricketSettingBinding) this.binding).tvDone.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.cricket.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CricketSettingDialog.this.lambda$initBinding$1(defaultReminderTimeList, view);
            }
        });
    }

    public void setOnDoneClickListener(a aVar) {
        this.onDoneClickListener = aVar;
    }

    public void setSelectedItemPosition(int i8) {
        ((DialogCricketSettingBinding) this.binding).wheelPicker.setSelectedItemPosition(i8);
    }
}
