package com.crrepa.band.my.profile.userinfo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.MainActivity;
import com.crrepa.band.my.databinding.ActivityUserInfoBinding;
import com.crrepa.band.my.health.widgets.dialog.f;
import com.crrepa.band.my.health.widgets.dialog.o0;
import com.crrepa.band.my.health.widgets.dialog.y;
import com.crrepa.band.my.model.UserInfoModel;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.crrepa.band.my.model.user.provider.PrivacyPolicyProvider;
import com.crrepa.band.my.model.user.provider.UserAgeProvider;
import com.crrepa.band.my.model.user.provider.UserWeightProvider;
import com.crrepa.band.my.profile.userinfo.h;
import com.crrepa.band.my.profile.userinfo.model.UserWeightChangeEvent;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.utils.u;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class UserInfoActivity extends BaseVBActivity<ActivityUserInfoBinding> implements w3.b, OnItemClickListener {
    private static final String FIRST_ENABLE = "first_enable";
    private final com.crrepa.band.my.profile.userinfo.presenter.b userInfoPresenter = new com.crrepa.band.my.profile.userinfo.presenter.b();
    private final UserInfoAdapter userInfoAdapter = new UserInfoAdapter();

    class a implements y.c {
        a() {
        }

        @Override // com.crrepa.band.my.health.widgets.dialog.y.c
        public void onAgreeClicked(y yVar) {
            yVar.dismiss();
            PrivacyPolicyProvider.agreePrivacyPolicy();
            com.moyoung.dafit.module.common.network.provider.g.getInstance().putBoolean(BaseParamNames.FIRST_OPEN_APP, false);
        }

        @Override // com.crrepa.band.my.health.widgets.dialog.y.c
        public void onDenyClicked(y yVar) {
            yVar.dismiss();
            UserInfoActivity.this.finish();
        }
    }

    public static Intent getCallingIntent(Context context, boolean z7) {
        Intent intent = new Intent(context, (Class<?>) UserInfoActivity.class);
        intent.putExtra(FIRST_ENABLE, z7);
        return intent;
    }

    private void getUserInfo() {
        this.userInfoPresenter.getUserInfo(this);
    }

    private void initUserList() {
        ((ActivityUserInfoBinding) this.binding).rcvUserInfo.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityUserInfoBinding) this.binding).rcvUserInfo.setHasFixedSize(true);
        ((ActivityUserInfoBinding) this.binding).rcvUserInfo.setAdapter(this.userInfoAdapter);
        this.userInfoAdapter.setOnItemClickListener(this);
        View inflate = LayoutInflater.from(this).inflate(R.layout.header_hint_text, (ViewGroup) ((ActivityUserInfoBinding) this.binding).rcvUserInfo, false);
        ((TextView) inflate.findViewById(R.id.tv_hint)).setText(R.string.guide_fill_in_user_info);
        this.userInfoAdapter.addHeaderView(inflate);
    }

    private void initView() {
        setActionBar();
        setTitle();
        ((ActivityUserInfoBinding) this.binding).appbar.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.userinfo.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserInfoActivity.this.lambda$initView$0(view);
            }
        });
        ((ActivityUserInfoBinding) this.binding).tvDone.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.userinfo.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserInfoActivity.this.lambda$initView$1(view);
            }
        });
        if (!getIntent().getBooleanExtra(FIRST_ENABLE, false)) {
            ((ActivityUserInfoBinding) this.binding).appbar.ivTitleBack.setImageResource(R.drawable.selector_title_back);
            return;
        }
        ((ActivityUserInfoBinding) this.binding).tvDone.setVisibility(0);
        ((ActivityUserInfoBinding) this.binding).appbar.ivTitleBack.setVisibility(4);
        s0.logEvent("用户首次进入_首页");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        UserWeightProvider.insertWeight(UserWeightProvider.getUserWeight() - UserWeightProvider.getCurrentMinWeight());
        com.crrepa.band.my.profile.userinfo.presenter.b.logUserInfoEvent();
        startActivity(MainActivity.getCallingIntent(this));
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putBoolean(BaseParamNames.FIRST_OPEN_APP, false);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveUserBirthday(Date date) {
        this.userInfoPresenter.saveUserBirthday(date);
        getUserInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveUserInfo(UserInfoModel.InfoType infoType, int i8, int i9) {
        this.userInfoPresenter.saveUserInfo(infoType, i8, i9);
        getUserInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveWeight(float f8) {
        UserWeightProvider.setUserWeight(BandUnitSystemProvider.getUnitSystem(), f8);
        org.greenrobot.eventbus.c.getDefault().post(new UserWeightChangeEvent());
        com.crrepa.band.my.profile.userinfo.presenter.b.logUserInfoEvent();
        getUserInfo();
    }

    private void setActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityUserInfoBinding) this.binding).appbar.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityUserInfoBinding) vb).appbar.tvTitle, ((ActivityUserInfoBinding) vb).appbar.tvExpandedTitle);
        setSupportActionBar(((ActivityUserInfoBinding) this.binding).appbar.toolbar);
    }

    private void setTitle() {
        ((ActivityUserInfoBinding) this.binding).appbar.tvTitle.setText(R.string.info_setting);
        ((ActivityUserInfoBinding) this.binding).appbar.tvExpandedTitle.setText(R.string.info_setting);
    }

    private void showBirthdaySelectDialog() {
        new com.crrepa.band.my.health.widgets.dialog.f(this).setSelectedDate(UserAgeProvider.getBirthday()).setOnDoneClickListener(new f.b() { // from class: com.crrepa.band.my.profile.userinfo.a
            @Override // com.crrepa.band.my.health.widgets.dialog.f.b
            public final void onDoneClick(Date date) {
                UserInfoActivity.this.saveUserBirthday(date);
            }
        }).show();
    }

    private void showPrivacyPolicyDialog() {
        if (!u.isSimplified()) {
            com.moyoung.dafit.module.common.network.provider.g.getInstance().putBoolean(BaseParamNames.FIRST_OPEN_APP, false);
            return;
        }
        if (PrivacyPolicyProvider.isAgreePrivacyPolicy()) {
            return;
        }
        y yVar = new y(this);
        yVar.setClickListener(new a());
        yVar.setCancelable(false);
        yVar.setCanceledOnTouchOutside(false);
        yVar.show();
    }

    private void showUserInfoSelectDialog(UserInfoModel.InfoType infoType) {
        new h(this, infoType).setOnDoneClickListener(new h.a() { // from class: com.crrepa.band.my.profile.userinfo.e
            @Override // com.crrepa.band.my.profile.userinfo.h.a
            public final void onDone(UserInfoModel.InfoType infoType2, int i8, int i9) {
                UserInfoActivity.this.saveUserInfo(infoType2, i8, i9);
            }
        }).show();
    }

    private void showWeightSelectDialog() {
        new o0(this).setDefaultNum(UserWeightProvider.getUserWeight()).setOnSaveClickListener(new o0.a() { // from class: com.crrepa.band.my.profile.userinfo.d
            @Override // com.crrepa.band.my.health.widgets.dialog.o0.a
            public final void onSave(float f8) {
                UserInfoActivity.this.saveWeight(f8);
            }
        }).show();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        this.userInfoPresenter.setView(this);
        initView();
        initUserList();
        getUserInfo();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getIntent().getBooleanExtra(FIRST_ENABLE, false)) {
            return;
        }
        startActivity(MainActivity.getCallingIntent(this));
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putBoolean(BaseParamNames.FIRST_OPEN_APP, false);
        super.onBackPressed();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.userInfoPresenter.destroy();
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        UserInfoModel.InfoType type = ((UserInfoModel) baseQuickAdapter.getData().get(i8)).getType();
        if (type == UserInfoModel.InfoType.BIRTHDAY) {
            showBirthdaySelectDialog();
        } else {
            showUserInfoSelectDialog(type);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.userInfoPresenter.pause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.userInfoPresenter.resume();
        if (getIntent().getBooleanExtra(FIRST_ENABLE, false)) {
            s0.logPage(getClass(), "用户首次启动信息设置界面");
        } else {
            s0.logPage(getClass(), "信息设置");
        }
    }

    @Override // w3.b
    public void renderUserList(List<UserInfoModel> list) {
        this.userInfoAdapter.setNewData(list);
    }
}
