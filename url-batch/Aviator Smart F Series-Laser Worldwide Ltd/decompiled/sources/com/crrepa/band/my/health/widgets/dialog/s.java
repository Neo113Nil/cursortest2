package com.crrepa.band.my.health.widgets.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.core.text.TextUtilsCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.DialogNumSelectBinding;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public class s extends Dialog {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private DialogNumSelectBinding binding;
    private List numList;
    private a onDoneClickListener;
    private int selectedPosition;
    private List<String> unitList;

    public interface a {
        void onDone(int i8);
    }

    public s(@NonNull Context context) {
        super(context, R.style.UserInfoChooceDialog);
    }

    private void initLayout() {
        Window window = getWindow();
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        attributes.height = (int) (displayMetrics.heightPixels * 0.4d);
        attributes.width = displayMetrics.widthPixels;
        window.setAttributes(attributes);
        setCanceledOnTouchOutside(true);
    }

    private void initListener() {
        this.binding.tvDone.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.widgets.dialog.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s.this.lambda$initListener$0(view);
            }
        });
        this.binding.tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.widgets.dialog.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s.this.lambda$initListener$1(view);
            }
        });
    }

    private void initView() {
        DialogNumSelectBinding inflate = DialogNumSelectBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        initLayout();
        initWheelPicker();
    }

    private void initWheelPicker() {
        this.binding.wpFunctionNum.setData(this.numList);
        this.binding.wpFunctionNum.setSelectedItemPosition(this.selectedPosition);
        this.binding.wpFunctionUnit.setData(this.unitList);
        if (TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            this.binding.wpFunctionNum.setItemAlign(1);
            this.binding.wpFunctionUnit.setItemAlign(2);
        } else {
            this.binding.wpFunctionNum.setItemAlign(2);
            this.binding.wpFunctionUnit.setItemAlign(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$0(View view) {
        if (this.onDoneClickListener != null) {
            this.onDoneClickListener.onDone(this.binding.wpFunctionNum.getCurrentItemPosition());
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$1(View view) {
        dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        initListener();
    }

    public s setList(List list, List<String> list2) {
        this.numList = list;
        this.unitList = list2;
        return this;
    }

    public s setOnDoneClickListener(a aVar) {
        this.onDoneClickListener = aVar;
        return this;
    }

    public s setSelectedPosition(int i8) {
        this.selectedPosition = i8;
        return this;
    }
}
