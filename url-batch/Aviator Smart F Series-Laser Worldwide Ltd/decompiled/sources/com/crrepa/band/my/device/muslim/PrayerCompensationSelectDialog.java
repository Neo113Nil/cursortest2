package com.crrepa.band.my.device.muslim;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.DialogPrayerCompensationSelectBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class PrayerCompensationSelectDialog extends BaseVBDialog<DialogPrayerCompensationSelectBinding> {
    private a onDoneClickListener;
    private List<String> strList;
    private List<Integer> valueList;

    public interface a {
        void onDone(int i8);
    }

    public PrayerCompensationSelectDialog(Context context) {
        super(context, R.style.UserInfoChooceDialog);
    }

    private void initLayout() {
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        attributes.height = (int) (displayMetrics.heightPixels * 0.4d);
        attributes.width = displayMetrics.widthPixels;
        window.setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        int currentItemPosition = ((DialogPrayerCompensationSelectBinding) this.binding).wpValue.getCurrentItemPosition();
        a aVar = this.onDoneClickListener;
        if (aVar != null) {
            aVar.onDone(this.valueList.get(currentItemPosition).intValue());
        }
        hide();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBDialog
    protected void initBinding() {
        initLayout();
        initList();
        ((DialogPrayerCompensationSelectBinding) this.binding).wpValue.setData(this.strList);
        ((DialogPrayerCompensationSelectBinding) this.binding).tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.muslim.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrayerCompensationSelectDialog.this.lambda$initBinding$0(view);
            }
        });
        ((DialogPrayerCompensationSelectBinding) this.binding).tvDone.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.muslim.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrayerCompensationSelectDialog.this.lambda$initBinding$1(view);
            }
        });
        setCanceledOnTouchOutside(true);
    }

    public void initList() {
        this.valueList = new ArrayList();
        for (int i8 = i1.b.COMPENSATION_MIN_VALUE; i8 <= 120; i8++) {
            this.valueList.add(Integer.valueOf(i8));
        }
        this.strList = new ArrayList();
        Iterator<Integer> it = this.valueList.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (Math.abs(intValue) == 1) {
                this.strList.add(intValue + cn.hutool.core.text.l.SPACE + getContext().getString(R.string.muslim_prayer_compensation_minute));
            } else {
                this.strList.add(intValue + cn.hutool.core.text.l.SPACE + getContext().getString(R.string.muslim_prayer_compensation_minutes));
            }
        }
    }

    public void setOnDoneClickListener(a aVar) {
        this.onDoneClickListener = aVar;
    }

    public void setSelectedValue(int i8) {
        ((DialogPrayerCompensationSelectBinding) this.binding).wpValue.setSelectedItemPosition(this.valueList.indexOf(Integer.valueOf(i8)));
    }
}
