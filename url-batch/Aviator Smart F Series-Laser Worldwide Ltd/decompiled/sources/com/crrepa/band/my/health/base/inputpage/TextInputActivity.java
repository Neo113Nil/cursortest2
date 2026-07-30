package com.crrepa.band.my.health.base.inputpage;

import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityTextInputBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;

/* loaded from: classes2.dex */
public class TextInputActivity extends BaseVBActivity<ActivityTextInputBinding> {

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputActivity.this.showInputTextSize(editable.length());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    public static Intent getCallingIntent(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) TextInputActivity.class);
        intent.putExtra("input_default_text", str);
        intent.putExtra("input_title", str2);
        return intent;
    }

    private void initListener() {
        ((ActivityTextInputBinding) this.binding).tvTextInputCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.base.inputpage.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextInputActivity.this.lambda$initListener$0(view);
            }
        });
        ((ActivityTextInputBinding) this.binding).tvTextInputSave.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.base.inputpage.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextInputActivity.this.lambda$initListener$1(view);
            }
        });
        ((ActivityTextInputBinding) this.binding).etTextInput.addTextChangedListener(new a());
    }

    private void initView() {
        String stringExtra = getIntent().getStringExtra("input_default_text");
        ((ActivityTextInputBinding) this.binding).tvTextInputTitle.setText(getIntent().getStringExtra("input_title"));
        ((ActivityTextInputBinding) this.binding).etTextInput.setText(stringExtra);
        showInputTextSize(((ActivityTextInputBinding) this.binding).etTextInput.getText().length());
        getWindow().setSoftInputMode(5);
        ((ActivityTextInputBinding) this.binding).etTextInput.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$0(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$1(View view) {
        Intent intent = new Intent();
        String obj = ((ActivityTextInputBinding) this.binding).etTextInput.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            obj = getString(R.string.water_reminder_tip);
        }
        intent.putExtra("input_type_water_prompt", obj);
        setResult(-1, intent);
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showInputTextSize(int i8) {
        ((ActivityTextInputBinding) this.binding).tvTextInputSize.setText(i8 + " / 50");
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setLightMode(this);
        k0.setColorNoTranslucent(this, ContextCompat.getColor(this, R.color.assist_3_f7));
        initView();
        initListener();
    }
}
