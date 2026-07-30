package com.crrepa.band.my.health.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityCalendarHistoryBinding;
import com.crrepa.band.my.health.base.HistoryCalendarAdapter;
import com.crrepa.band.my.model.CalendarHistoryCompletionModel;
import com.moyoung.dafit.module.common.baseui.BaseActivity;
import com.moyoung.dafit.module.common.utils.k;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes2.dex */
public abstract class BaseCalendarHistoryActivity extends BaseActivity implements i, HistoryCalendarAdapter.b {
    private ActivityCalendarHistoryBinding binding;
    private HistoryCalendarAdapter historyCalendarAdapter;
    private h presenter = getPresenter();

    class a extends RecyclerView.OnScrollListener {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i8) {
            super.onScrollStateChanged(recyclerView, i8);
            BaseCalendarHistoryActivity.this.handleRecyclerScroll(recyclerView, i8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            super.onScrolled(recyclerView, i8, i9);
        }
    }

    public static Intent getCallingIntent(Context context, Class<? extends BaseCalendarHistoryActivity> cls, Date date) {
        Intent intent = new Intent(context, cls);
        intent.putExtra("statistics_date", date);
        return intent;
    }

    private Date getStatisticsDate() {
        return (Date) getIntent().getSerializableExtra("statistics_date");
    }

    private String getYear(Date date) {
        StringBuilder sb = new StringBuilder();
        Calendar calendar = k.getCalendar();
        calendar.setTime(date);
        sb.append(calendar.get(1));
        sb.append(getString(R.string.year_unit));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleRecyclerScroll(RecyclerView recyclerView, int i8) {
        if (i8 != 0) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            Date dateOfPosition = this.historyCalendarAdapter.getDateOfPosition(((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition());
            if (dateOfPosition != null) {
                setTitle(getYear(dateOfPosition));
            }
        }
    }

    private void initHistoryCalendar() {
        this.binding.rcvHistoryCalendar.setLayoutManager(new LinearLayoutManager(this));
        HistoryCalendarAdapter historyCalendarAdapter = new HistoryCalendarAdapter(this, getStatisticsDate());
        this.historyCalendarAdapter = historyCalendarAdapter;
        historyCalendarAdapter.setOnStatisticsDateListener(this);
        this.binding.rcvHistoryCalendar.setAdapter(this.historyCalendarAdapter);
        this.binding.rcvHistoryCalendar.addOnScrollListener(new a());
    }

    private void loadHistoryData() {
        this.presenter.getHistoryData();
    }

    private void setActionBar(int i8) {
        setSupportActionBar(this.binding.includeTitleBar.toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        this.binding.includeTitleBar.toolbar.setNavigationIcon(R.drawable.selector_title_close_w);
        this.binding.includeTitleBar.toolbar.setBackgroundResource(i8);
    }

    private void setTitle(String str) {
        this.binding.includeTitleBar.tvToolbarTitle.setText(str);
    }

    private void setWeeklyArrangement() {
        this.binding.includeWeeklyArrangement.llWeeklyArrangement.setBackgroundResource(getActionBarBackground());
    }

    protected abstract int getActionBarBackground();

    protected abstract h getPresenter();

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity
    protected int getStatusBarColor() {
        return ContextCompat.getColor(this, getActionBarBackground());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ActivityCalendarHistoryBinding inflate = ActivityCalendarHistoryBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        this.presenter.setView(this);
        setActionBar(getActionBarBackground());
        setTitle(getYear(getStatisticsDate()));
        setWeeklyArrangement();
        initHistoryCalendar();
        loadHistoryData();
    }

    protected abstract void onDateClicked(Date date);

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.destroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressedSupport();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.presenter.resume();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.presenter.resume();
    }

    @Override // com.crrepa.band.my.health.base.HistoryCalendarAdapter.b
    public void onStatisticsDate(Date date) {
        onDateClicked(date);
    }

    @Override // com.crrepa.band.my.health.base.i
    public void renderHistoryList(CalendarHistoryCompletionModel calendarHistoryCompletionModel) {
        this.historyCalendarAdapter.setHistoryData(calendarHistoryCompletionModel);
        this.binding.rcvHistoryCalendar.scrollToPosition(this.historyCalendarAdapter.getCurrentDatePosition());
    }
}
