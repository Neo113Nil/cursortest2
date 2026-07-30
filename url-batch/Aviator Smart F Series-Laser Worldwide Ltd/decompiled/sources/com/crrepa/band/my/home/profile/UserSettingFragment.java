package com.crrepa.band.my.home.profile;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.WebActivity;
import com.crrepa.band.my.databinding.FragmentUserSettingBinding;
import com.crrepa.band.my.home.profile.adapter.UserSettingAdapter;
import com.crrepa.band.my.home.profile.presenter.b;
import com.crrepa.band.my.model.UserSettingModel;
import com.crrepa.band.my.model.user.provider.UserGoalsSettingProvider;
import com.crrepa.band.my.profile.about.AboutUsActivity;
import com.crrepa.band.my.profile.feedback.HelpAndFeedbackWebActivity;
import com.crrepa.band.my.profile.goalsetting.GoalStepsActivity;
import com.crrepa.band.my.profile.goalsetting.GoalsSettingActivity;
import com.crrepa.band.my.profile.googlefit.GoogleFitActivity;
import com.crrepa.band.my.profile.strava.StravaMainActivity;
import com.crrepa.band.my.profile.userinfo.UserInfoActivity;
import com.crrepa.band.my.profile.wechatsport.WechatSportActivity;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;
import java.util.List;

/* loaded from: classes2.dex */
public class UserSettingFragment extends BaseVBFragment<FragmentUserSettingBinding> implements s3.a, OnItemClickListener {
    private final b userSettingPresenter = new b();
    private UserSettingAdapter settingAdapter = new UserSettingAdapter();

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$band$my$model$UserSettingModel$SettingType;

        static {
            int[] iArr = new int[UserSettingModel.SettingType.values().length];
            $SwitchMap$com$crrepa$band$my$model$UserSettingModel$SettingType = iArr;
            try {
                iArr[UserSettingModel.SettingType.USER_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$UserSettingModel$SettingType[UserSettingModel.SettingType.GOAL_STEPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$UserSettingModel$SettingType[UserSettingModel.SettingType.WECHAT_SPORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$UserSettingModel$SettingType[UserSettingModel.SettingType.ABOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$UserSettingModel$SettingType[UserSettingModel.SettingType.Tel.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$UserSettingModel$SettingType[UserSettingModel.SettingType.E_MAIL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$UserSettingModel$SettingType[UserSettingModel.SettingType.WEBSITE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$UserSettingModel$SettingType[UserSettingModel.SettingType.BACKGROUNB_RUN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$UserSettingModel$SettingType[UserSettingModel.SettingType.GOOGLE_FIT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$UserSettingModel$SettingType[UserSettingModel.SettingType.STRAVA.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$UserSettingModel$SettingType[UserSettingModel.SettingType.HELP_AND_FEEDBACK.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static UserSettingFragment getInstance() {
        return new UserSettingFragment();
    }

    private void initList() {
        ((FragmentUserSettingBinding) this.binding).rcvUserSetting.setLayoutManager(new LinearLayoutManager(getContext()));
        this.settingAdapter.setOnItemClickListener(this);
        ((FragmentUserSettingBinding) this.binding).rcvUserSetting.setAdapter(this.settingAdapter);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    public void initBinding() {
        super.initBinding();
        this.userSettingPresenter.setView(this);
        initList();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.userSettingPresenter.destroy();
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        Intent callingIntent;
        UserSettingModel userSettingModel = (UserSettingModel) baseQuickAdapter.getData().get(i8);
        switch (a.$SwitchMap$com$crrepa$band$my$model$UserSettingModel$SettingType[userSettingModel.getType().ordinal()]) {
            case 1:
                callingIntent = UserInfoActivity.getCallingIntent(getContext(), false);
                break;
            case 2:
                if (!UserGoalsSettingProvider.isNewGoalsSetting()) {
                    callingIntent = GoalStepsActivity.getCallingIntent(getContext());
                    break;
                } else {
                    callingIntent = GoalsSettingActivity.getCallingIntent(getContext());
                    break;
                }
            case 3:
                callingIntent = WechatSportActivity.getCallingIntent(getContext());
                break;
            case 4:
                callingIntent = AboutUsActivity.getCallingIntent(getContext());
                break;
            case 5:
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + userSettingModel.getUrl()));
                intent.setFlags(268435456);
                callingIntent = intent;
                break;
            case 6:
                callingIntent = r3.a.sendFeedback(getContext(), userSettingModel.getUrl());
                break;
            case 7:
                callingIntent = WebActivity.getCallingIntent(getContext(), userSettingModel.getName(), userSettingModel.getUrl());
                break;
            case 8:
                callingIntent = WebActivity.getCallingIntent(getContext(), userSettingModel.getName(), userSettingModel.getUrl());
                break;
            case 9:
                callingIntent = GoogleFitActivity.getCallingIntent(getContext());
                break;
            case 10:
                callingIntent = new Intent(getContext(), (Class<?>) StravaMainActivity.class);
                break;
            case 11:
                callingIntent = HelpAndFeedbackWebActivity.getCallingIntent(getContext());
                updateUnreadNews(UserSettingModel.SettingType.HELP_AND_FEEDBACK, 0);
                break;
            default:
                callingIntent = null;
                break;
        }
        if (callingIntent != null) {
            requireContext().startActivity(callingIntent);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        this.userSettingPresenter.getUserSettingList(getContext());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.userSettingPresenter.pause();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment, com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.userSettingPresenter.resume();
    }

    @Override // s3.a
    public void renderGoalStepsChange(int i8) {
        for (UserSettingModel userSettingModel : this.settingAdapter.getData()) {
            if (userSettingModel.getType() == UserSettingModel.SettingType.GOAL_STEPS) {
                userSettingModel.setHintText(getString(R.string.goal_step, Integer.valueOf(i8)));
            }
        }
        this.settingAdapter.notifyDataSetChanged();
    }

    @Override // s3.a
    public void renderUserSettingList(List<UserSettingModel> list) {
        this.settingAdapter.setNewData(list);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment, com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z7) {
        super.setUserVisibleHint(z7);
        if (z7) {
            this.userSettingPresenter.updateCustomerServiceMessage();
        }
    }

    @Override // s3.a
    public void updateUnreadNews(UserSettingModel.SettingType settingType, int i8) {
        List<UserSettingModel> data = this.settingAdapter.getData();
        for (int i9 = 0; i9 < data.size(); i9++) {
            UserSettingModel userSettingModel = data.get(i9);
            if (userSettingModel.getType() == settingType) {
                userSettingModel.setUnreadNews(i8);
            }
        }
        this.settingAdapter.setNewData(data);
    }
}
