package com.crrepa.band.my.device.pillreminder;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityPillReminderBinding;
import com.crrepa.band.my.device.pillreminder.adapter.PillReminderAdapter;
import com.crrepa.band.my.model.db.PillReminder;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.s0;
import java.util.List;

/* loaded from: classes2.dex */
public class PillReminderActivity extends BaseVBActivity<ActivityPillReminderBinding> implements l1.b {
    private static final int NEW_PILL_REQUEST_CODE = 16;
    private final k1.c presenter = new k1.c();
    private PillReminderAdapter pillReminderAdapter = new PillReminderAdapter();

    class a implements OnItemClickListener {
        a() {
        }

        @Override // com.chad.library.adapter.base.listener.OnItemClickListener
        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
            PillReminder pillReminder = (PillReminder) baseQuickAdapter.getData().get(i8);
            PillReminderActivity pillReminderActivity = PillReminderActivity.this;
            pillReminderActivity.startActivityForResult(AddNewPillActivity.getCallingIntent(pillReminderActivity, pillReminder.getId().longValue()), 16);
        }
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) PillReminderActivity.class);
    }

    private void initPillReminderList() {
        ((ActivityPillReminderBinding) this.binding).rcvPillsList.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityPillReminderBinding) this.binding).rcvPillsList.setAdapter(this.pillReminderAdapter);
        this.pillReminderAdapter.setOnItemClickListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        onBackPressedSupport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$1(View view) {
        onAddPillsClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$2(View view) {
        onAddPillsClicked();
    }

    private void setActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityPillReminderBinding) this.binding).includeTitle.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityPillReminderBinding) vb).includeTitle.tvTitle, ((ActivityPillReminderBinding) vb).includeTitle.tvExpandedTitle);
        setSupportActionBar(((ActivityPillReminderBinding) this.binding).includeTitle.toolbar);
    }

    private void setTitle() {
        ((ActivityPillReminderBinding) this.binding).includeTitle.tvTitle.setText(R.string.pill_reminder);
        ((ActivityPillReminderBinding) this.binding).includeTitle.tvExpandedTitle.setText(R.string.pill_reminder);
        ((ActivityPillReminderBinding) this.binding).includeTitle.ivTitleBack.setImageResource(R.drawable.selector_title_back);
        ((ActivityPillReminderBinding) this.binding).includeTitle.tvEdit.setVisibility(0);
        ((ActivityPillReminderBinding) this.binding).includeTitle.tvEdit.setText(R.string.add_pills);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        this.presenter.setView(this);
        setActionBar();
        setTitle();
        initPillReminderList();
        this.presenter.getPillReminderList();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityPillReminderBinding) this.binding).includeTitle.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.pillreminder.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PillReminderActivity.this.lambda$initOnClickListener$0(view);
            }
        });
        ((ActivityPillReminderBinding) this.binding).btnAddPills.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.pillreminder.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PillReminderActivity.this.lambda$initOnClickListener$1(view);
            }
        });
        ((ActivityPillReminderBinding) this.binding).includeTitle.tvEdit.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.pillreminder.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PillReminderActivity.this.lambda$initOnClickListener$2(view);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, @Nullable Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i8 == 16 && i9 == -1) {
            this.presenter.getPillReminderList();
        }
    }

    public void onAddPillsClicked() {
        startActivityForResult(AddNewPillActivity.getCallingIntent(this), 16);
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
        s0.logPage(getClass(), "吃药提醒");
    }

    @Override // l1.b
    public void renderEmptyReminder() {
        ((ActivityPillReminderBinding) this.binding).llEmptyPills.setVisibility(0);
        ((ActivityPillReminderBinding) this.binding).rcvPillsList.setVisibility(8);
    }

    @Override // l1.b
    public void renderReminderList(List<PillReminder> list) {
        ((ActivityPillReminderBinding) this.binding).llEmptyPills.setVisibility(8);
        ((ActivityPillReminderBinding) this.binding).rcvPillsList.setVisibility(0);
        this.pillReminderAdapter.setNewData(list);
    }
}
