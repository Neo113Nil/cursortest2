package com.crrepa.band.my.device.pillreminder;

import android.content.Context;
import android.content.Intent;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityAddNewPillBinding;
import com.crrepa.band.my.device.pillreminder.adapter.PillReminderSetTimeAdapter;
import com.crrepa.band.my.device.pillreminder.picker.MyWheelPicker;
import com.crrepa.band.my.model.PillReminderTimeModel;
import com.crrepa.band.my.model.db.PillReminder;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.s;
import com.moyoung.dafit.module.common.utils.s0;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* loaded from: classes2.dex */
public class AddNewPillActivity extends BaseVBActivity<ActivityAddNewPillBinding> implements l1.a {
    private static final int MAX_PILL_NAME_LENGTH = 31;
    private static final String PILL_ID = "PILL_ID";
    private k1.a presenter = new k1.a();
    private PillReminderSetTimeAdapter reminderTimeAdapter = new PillReminderSetTimeAdapter();

    class a implements MyWheelPicker.a {
        a() {
        }

        @Override // com.crrepa.band.my.device.pillreminder.picker.MyWheelPicker.a
        public void onItemSelected(MyWheelPicker myWheelPicker, Object obj, int i8) {
            int parseInt = Integer.parseInt(obj.toString());
            com.orhanobut.logger.f.d("value: " + parseInt);
            AddNewPillActivity.this.presenter.updateReminderTimes(parseInt);
        }
    }

    class b implements InputFilter {
        b() {
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i8, int i9, Spanned spanned, int i10, int i11) {
            if (31 < (spanned.toString() + ((Object) charSequence)).getBytes(StandardCharsets.UTF_8).length) {
                return "";
            }
            return null;
        }
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) AddNewPillActivity.class);
    }

    private long getPillReminderId() {
        return getIntent().getLongExtra(PILL_ID, -1L);
    }

    private void initReminderTimeList() {
        ((ActivityAddNewPillBinding) this.binding).rcvReminderTimeList.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityAddNewPillBinding) this.binding).rcvReminderTimeList.setAdapter(this.reminderTimeAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        onDeleteClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$1(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$2(View view) {
        onSaveClick();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        this.presenter.setView(this);
        initReminderTimeList();
        this.presenter.getPillReminder(getPillReminderId());
        ((ActivityAddNewPillBinding) this.binding).pillTimesPicker.setOnItemSelectedListener(new a());
        ((ActivityAddNewPillBinding) this.binding).etPillName.setFilters(new InputFilter[]{new b()});
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityAddNewPillBinding) this.binding).btnDeleteReminder.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.pillreminder.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddNewPillActivity.this.lambda$initOnClickListener$0(view);
            }
        });
        ((ActivityAddNewPillBinding) this.binding).tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.pillreminder.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddNewPillActivity.this.lambda$initOnClickListener$1(view);
            }
        });
        ((ActivityAddNewPillBinding) this.binding).tvSave.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.pillreminder.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddNewPillActivity.this.lambda$initOnClickListener$2(view);
            }
        });
    }

    public void onDeleteClick() {
        this.presenter.deleteReminder(getPillReminderId());
        setResult(-1);
        finish();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.destroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.presenter.resume();
        s0.logPage(getClass(), "吃药提醒_添加");
    }

    public void onSaveClick() {
        if (!com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            r0.showLong(this, getString(R.string.band_setting_send_fail));
            return;
        }
        String obj = ((ActivityAddNewPillBinding) this.binding).etPillName.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            r0.showLong(this, getString(R.string.pill_name_null));
            return;
        }
        int selectNumber = ((ActivityAddNewPillBinding) this.binding).pillRepeatPicker.getSelectNumber();
        int selectNumber2 = ((ActivityAddNewPillBinding) this.binding).pillTimesPicker.getSelectNumber();
        List<PillReminderTimeModel> data = this.reminderTimeAdapter.getData();
        com.orhanobut.logger.f.d("reminderTimeList: " + s.bean2Json(data));
        PillReminder pillReminder = new PillReminder();
        pillReminder.setName(obj);
        pillReminder.setRepeat(Integer.valueOf(selectNumber));
        pillReminder.setTimes(Integer.valueOf(selectNumber2));
        pillReminder.setReminderTime(s.bean2Json(data));
        this.presenter.saveReminder(pillReminder, getPillReminderId());
        setResult(-1);
        finish();
    }

    @Override // l1.a
    public void renderDeleteReminder() {
        ((ActivityAddNewPillBinding) this.binding).btnDeleteReminder.setVisibility(0);
    }

    @Override // l1.a
    public void renderPillName(String str) {
        ((ActivityAddNewPillBinding) this.binding).etPillName.setText(str);
    }

    @Override // l1.a
    public void renderReminderRepeat(int i8, int i9, int i10, int i11) {
        ((ActivityAddNewPillBinding) this.binding).pillRepeatPicker.setData(i8, i9, i10, i11);
    }

    @Override // l1.a
    public void renderReminderTime(List<PillReminderTimeModel> list) {
        this.reminderTimeAdapter.setNewData(list);
    }

    @Override // l1.a
    public void renderReminderTimes(int i8, int i9, int i10, int i11) {
        ((ActivityAddNewPillBinding) this.binding).pillTimesPicker.setData(i8, i9, i10, i11);
    }

    public static Intent getCallingIntent(Context context, long j8) {
        Intent intent = new Intent(context, (Class<?>) AddNewPillActivity.class);
        intent.putExtra(PILL_ID, j8);
        return intent;
    }
}
