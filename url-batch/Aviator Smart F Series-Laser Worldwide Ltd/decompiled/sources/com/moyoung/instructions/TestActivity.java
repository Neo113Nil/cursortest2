package com.moyoung.instructions;

import android.os.Bundle;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.instructions.databinding.ActivityTestBinding;
import com.moyoung.instructions.utils.InstructionsType;

/* loaded from: classes4.dex */
public class TestActivity extends BaseVBActivity<ActivityTestBinding> {
    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity, com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(((ActivityTestBinding) this.binding).getRoot());
        c.hook(InstructionsType.NOTIFICATIONS, ((ActivityTestBinding) this.binding).btn1);
        c.hook(InstructionsType.BLOOD_OXYGEN, ((ActivityTestBinding) this.binding).btn2);
        c.hook(InstructionsType.HEART_RATE, ((ActivityTestBinding) this.binding).btn3);
        c.hook(InstructionsType.STRESS, ((ActivityTestBinding) this.binding).btn4);
        c.hook(InstructionsType.TRAINING, ((ActivityTestBinding) this.binding).btn5);
        c.hook(InstructionsType.SLEEP, ((ActivityTestBinding) this.binding).btn6);
        c.hook(InstructionsType.QUICK_REPLY, ((ActivityTestBinding) this.binding).btn7);
        c.hook(InstructionsType.PAIRING_FAILED, ((ActivityTestBinding) this.binding).btn8);
        c.hook(InstructionsType.TAKE_PHOTOS, ((ActivityTestBinding) this.binding).btn9);
    }
}
