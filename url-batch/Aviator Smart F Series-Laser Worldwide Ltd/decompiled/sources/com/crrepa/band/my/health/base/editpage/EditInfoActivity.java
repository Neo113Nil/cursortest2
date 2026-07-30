package com.crrepa.band.my.health.base.editpage;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.baidu.ar.constants.HttpConstants;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityEditInfoBinding;
import com.crrepa.band.my.health.water.model.WaterRecordDeleteEvent;
import com.crrepa.band.my.health.water.util.WaterProvider;
import com.crrepa.band.my.health.widgets.dialog.TimeSelectDialog;
import com.crrepa.band.my.health.widgets.dialog.f;
import com.crrepa.band.my.health.widgets.dialog.o0;
import com.crrepa.band.my.health.widgets.dialog.s;
import com.crrepa.band.my.model.band.provider.BandTimeSystemProvider;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.db.Water;
import com.crrepa.band.my.model.db.Weight;
import com.crrepa.band.my.model.user.provider.UserWeightProvider;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.u0;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class EditInfoActivity extends BaseVBActivity<ActivityEditInfoBinding> {
    private ArrayList<String> editDataList;
    private int functionType;
    private final EditInfoAdapter editInfoAdapter = new EditInfoAdapter();
    private final h editInfoManager = h.getInstance();
    private Weight currentWeight = null;
    private Water currentWater = null;
    private Water oldWater = null;

    private void clickItem(i iVar) {
        int editType = iVar.getEditType();
        int i8 = this.functionType;
        if (i8 != 0) {
            if (i8 == 1) {
                if (editType == 0) {
                    showWaterTimeSelectDialog();
                    return;
                } else {
                    if (editType == 1) {
                        showWaterIntakeSelectDialog();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (editType == 0) {
            showWeightDateSelectDialog();
        } else if (editType == 1) {
            showWeightTimeSelectDialog();
        } else {
            if (editType != 2) {
                return;
            }
            showWeightNumSelectDialog();
        }
    }

    private void editDone() {
        int i8 = this.functionType;
        if (i8 == 0) {
            this.editInfoManager.updateWeight(this.currentWeight);
        } else if (i8 == 1) {
            this.editInfoManager.updateWater(this.oldWater, this.currentWater);
        }
        onBackPressed();
    }

    public static Intent getCallingIntent(Context context, int i8, ArrayList<String> arrayList) {
        Intent intent = new Intent(context, (Class<?>) EditInfoActivity.class);
        intent.putExtra(HttpConstants.FUNCTION_TYPE, i8);
        intent.putStringArrayListExtra("edit_data_list", arrayList);
        return intent;
    }

    private List<i> getEditInfoModelList() {
        ArrayList arrayList = new ArrayList();
        String[] editTitleArray = this.editInfoManager.getEditTitleArray(this, this.functionType);
        if (editTitleArray == null) {
            return null;
        }
        ArrayList<String> arrayList2 = this.editDataList;
        if (arrayList2 == null) {
            this.editDataList = new ArrayList<>();
        } else if (arrayList2.size() < editTitleArray.length) {
            for (int size = this.editDataList.size(); size < editTitleArray.length; size++) {
                this.editDataList.add("");
            }
        }
        for (int i8 = 0; i8 < editTitleArray.length; i8++) {
            i iVar = new i();
            iVar.setEditType(this.editInfoManager.getEditType(i8, this.functionType));
            iVar.setTitle(editTitleArray[i8]);
            iVar.setDataText(this.editDataList.get(i8));
            iVar.setDataColor(this.editInfoManager.getDataColor(this, this.functionType));
            arrayList.add(iVar);
        }
        return arrayList;
    }

    private void initBaseData() {
        this.functionType = getIntent().getIntExtra(HttpConstants.FUNCTION_TYPE, 0);
        this.editDataList = getIntent().getStringArrayListExtra("edit_data_list");
        Object editObject = this.editInfoManager.getEditObject(this.functionType);
        if (editObject != null) {
            int i8 = this.functionType;
            if (i8 == 0) {
                this.currentWeight = (Weight) editObject;
                return;
            }
            if (i8 == 1) {
                this.currentWater = (Water) editObject;
                Water water = new Water();
                this.oldWater = water;
                water.setIntakeMl(this.currentWater.getIntakeMl());
                this.oldWater.setIntakeOz(this.currentWater.getIntakeOz());
            }
        }
    }

    private void initListener() {
        this.editInfoAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.crrepa.band.my.health.base.editpage.f
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                EditInfoActivity.this.lambda$initListener$0(baseQuickAdapter, view, i8);
            }
        });
        ((ActivityEditInfoBinding) this.binding).btnEditInfoDone.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.base.editpage.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditInfoActivity.this.lambda$initListener$1(view);
            }
        });
    }

    private void initRecycleView() {
        ((ActivityEditInfoBinding) this.binding).rcvEditInfo.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityEditInfoBinding) this.binding).rcvEditInfo.setAdapter(this.editInfoAdapter);
        this.editInfoAdapter.setNewData(getEditInfoModelList());
    }

    private void initView() {
        setActionBar();
        initRecycleView();
        ((ActivityEditInfoBinding) this.binding).btnEditInfoDone.setBackground(this.editInfoManager.getDoneBtnBackground(this, this.functionType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$0(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        i item = this.editInfoAdapter.getItem(i8);
        if (item != null) {
            clickItem(item);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$1(View view) {
        editDone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showWaterIntakeSelectDialog$6(int i8) {
        int intervalIntake = (i8 * WaterProvider.getIntervalIntake()) + WaterProvider.getMinIntake();
        if (BandUnitSystemProvider.getUnitSystem() == 0) {
            this.currentWater.setIntakeMl(Integer.valueOf(intervalIntake));
            this.currentWater.setIntakeOz(Integer.valueOf(u0.ml2Ozs(intervalIntake)));
        } else {
            this.currentWater.setIntakeOz(Integer.valueOf(intervalIntake));
            this.currentWater.setIntakeMl(Integer.valueOf(u0.oz2Mls(intervalIntake)));
        }
        this.editDataList.set(1, this.editInfoManager.formatWaterDate(this, 1, this.currentWater));
        this.editInfoAdapter.setNewData(getEditInfoModelList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showWaterTimeSelectDialog$5(int i8, int i9) {
        this.currentWater.setDate(i3.a.updateDateByHourMinute(this.currentWater.getDate(), i8, i9));
        this.editDataList.set(0, this.editInfoManager.formatWaterDate(this, 0, this.currentWater));
        this.editInfoAdapter.setNewData(getEditInfoModelList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showWeightDateSelectDialog$2(Date date) {
        this.currentWeight.setDate(i3.a.updateDateByYearMonthDay(this.currentWeight.getDate(), date));
        this.editDataList.set(0, this.editInfoManager.formatWeightDate(this, 0, this.currentWeight));
        this.editInfoAdapter.setNewData(getEditInfoModelList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showWeightNumSelectDialog$4(float f8) {
        float currentMinWeight = f8 + UserWeightProvider.getCurrentMinWeight();
        if (BandUnitSystemProvider.getUnitSystem() == 0) {
            this.currentWeight.setWeightKg(Float.valueOf(currentMinWeight));
            this.currentWeight.setWeightLb(Float.valueOf(u0.kg2LbsFloat(currentMinWeight)));
        } else {
            this.currentWeight.setWeightLb(Float.valueOf(currentMinWeight));
            this.currentWeight.setWeightKg(Float.valueOf(u0.lb2KgsFloat(currentMinWeight)));
        }
        this.editDataList.set(2, this.editInfoManager.formatWeightDate(this, 2, this.currentWeight));
        this.editInfoAdapter.setNewData(getEditInfoModelList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showWeightTimeSelectDialog$3(int i8, int i9) {
        this.currentWeight.setDate(i3.a.updateDateByHourMinute(this.currentWeight.getDate(), i8, i9));
        this.editDataList.set(1, this.editInfoManager.formatWeightDate(this, 1, this.currentWeight));
        this.editInfoAdapter.setNewData(getEditInfoModelList());
    }

    private void setActionBar() {
        setSupportActionBar(((ActivityEditInfoBinding) this.binding).editInfoBar.toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
        ((ActivityEditInfoBinding) this.binding).editInfoBar.toolbar.setNavigationIcon(R.drawable.ic_back_n);
        ((ActivityEditInfoBinding) this.binding).editInfoBar.toolbar.setBackgroundResource(R.color.white);
        ((ActivityEditInfoBinding) this.binding).editInfoBar.tvToolbarTitle.setTextColor(ContextCompat.getColor(this, R.color.black));
        ((ActivityEditInfoBinding) this.binding).editInfoBar.tvToolbarTitle.setText(this.editInfoManager.getToolBarTitleName(this, this.functionType));
    }

    private void showWaterIntakeSelectDialog() {
        if (this.currentWater != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(WaterProvider.getWaterUnit(this));
            new s(this).setSelectedPosition(WaterProvider.getWaterPosition(this.currentWater)).setList(WaterProvider.getWaterList(), arrayList).setOnDoneClickListener(new s.a() { // from class: com.crrepa.band.my.health.base.editpage.d
                @Override // com.crrepa.band.my.health.widgets.dialog.s.a
                public final void onDone(int i8) {
                    EditInfoActivity.this.lambda$showWaterIntakeSelectDialog$6(i8);
                }
            }).show();
        }
    }

    private void showWaterTimeSelectDialog() {
        Water water = this.currentWater;
        if (water != null) {
            int dateHour = i3.a.getDateHour(water.getDate());
            new TimeSelectDialog(this).setSelectedTimePosition(dateHour, i3.a.getDateMinute(this.currentWater.getDate())).is12HourTime(BandTimeSystemProvider.is12HourTime()).setSelectedTypePosition(dateHour < 12 ? 0 : 1).isToday(i3.a.isSameDay(this.currentWater.getDate(), new Date())).setOnDoneClickListener(new TimeSelectDialog.a() { // from class: com.crrepa.band.my.health.base.editpage.e
                @Override // com.crrepa.band.my.health.widgets.dialog.TimeSelectDialog.a
                public final void onClick(int i8, int i9) {
                    EditInfoActivity.this.lambda$showWaterTimeSelectDialog$5(i8, i9);
                }
            }).show();
        }
    }

    private void showWeightDateSelectDialog() {
        if (this.currentWeight != null) {
            new com.crrepa.band.my.health.widgets.dialog.f(this).setSelectedDate(this.currentWeight.getDate()).setOnDoneClickListener(new f.b() { // from class: com.crrepa.band.my.health.base.editpage.c
                @Override // com.crrepa.band.my.health.widgets.dialog.f.b
                public final void onDoneClick(Date date) {
                    EditInfoActivity.this.lambda$showWeightDateSelectDialog$2(date);
                }
            }).show();
        }
    }

    private void showWeightNumSelectDialog() {
        Weight weight = this.currentWeight;
        if (weight != null) {
            new o0(this).setDefaultNum(UserWeightProvider.getCurrentWeight(weight)).setOnSaveClickListener(new o0.a() { // from class: com.crrepa.band.my.health.base.editpage.b
                @Override // com.crrepa.band.my.health.widgets.dialog.o0.a
                public final void onSave(float f8) {
                    EditInfoActivity.this.lambda$showWeightNumSelectDialog$4(f8);
                }
            }).show();
        }
    }

    private void showWeightTimeSelectDialog() {
        Weight weight = this.currentWeight;
        if (weight != null) {
            int dateHour = i3.a.getDateHour(weight.getDate());
            new TimeSelectDialog(this).setSelectedTimePosition(dateHour, i3.a.getDateMinute(this.currentWeight.getDate())).is12HourTime(BandTimeSystemProvider.is12HourTime()).setSelectedTypePosition(dateHour < 12 ? 0 : 1).isToday(i3.a.isSameDay(this.currentWeight.getDate(), new Date())).setOnDoneClickListener(new TimeSelectDialog.a() { // from class: com.crrepa.band.my.health.base.editpage.a
                @Override // com.crrepa.band.my.health.widgets.dialog.TimeSelectDialog.a
                public final void onClick(int i8, int i9) {
                    EditInfoActivity.this.lambda$showWeightTimeSelectDialog$3(i8, i9);
                }
            }).show();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        org.greenrobot.eventbus.c.getDefault().register(this);
        initBaseData();
        initView();
        initListener();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onWaterRecordDeleteEvent(WaterRecordDeleteEvent waterRecordDeleteEvent) {
        Water water = this.currentWater;
        if (water == null || water.getId().longValue() != waterRecordDeleteEvent.getId()) {
            return;
        }
        onBackPressed();
    }
}
