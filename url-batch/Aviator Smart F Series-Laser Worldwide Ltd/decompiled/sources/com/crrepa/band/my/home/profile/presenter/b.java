package com.crrepa.band.my.home.profile.presenter;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.ble.band.model.LocaleChangedEvent;
import com.crrepa.band.my.device.ota.model.BandFirmwareVersionEvent;
import com.crrepa.band.my.model.ExtendMenuModel;
import com.crrepa.band.my.model.UserSettingModel;
import com.crrepa.band.my.model.band.provider.BandExtendProvider;
import com.crrepa.band.my.model.band.provider.BandInfoManager;
import com.crrepa.band.my.model.band.provider.BandLastBindBandProvider;
import com.crrepa.band.my.model.band.util.BandFirmwareUtils;
import com.crrepa.band.my.model.db.proxy.GoalsSettingDaoProxy;
import com.crrepa.band.my.model.net.CustomerServiceStateEntity;
import com.crrepa.band.my.profile.goalsetting.model.UserGoalStepsChengeEvent;
import com.moyoung.dafit.module.common.baseui.f;
import com.moyoung.dafit.module.common.utils.p;
import com.squareup.picasso.Picasso;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import l0.d;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class b implements f {
    private final CompositeDisposable disposables = new CompositeDisposable();
    private boolean isUnRequestingCustomerServiceMessage = true;
    private s3.a userSettingView;

    class a implements Observer {
        a() {
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            th.printStackTrace();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            b.this.disposables.add(disposable);
        }

        @Override // io.reactivex.Observer
        public void onNext(CustomerServiceStateEntity customerServiceStateEntity) {
            if (b.this.userSettingView == null || customerServiceStateEntity == null || customerServiceStateEntity.getStatus() != 0 || customerServiceStateEntity.getState() == null) {
                return;
            }
            b.this.userSettingView.updateUnreadNews(UserSettingModel.SettingType.HELP_AND_FEEDBACK, customerServiceStateEntity.getState().getNum());
        }
    }

    public b() {
        c.getDefault().register(this);
    }

    private UserSettingModel buildUserSettingItem(Context context, int i8, int i9, UserSettingModel.SettingType settingType) {
        UserSettingModel userSettingModel = new UserSettingModel();
        userSettingModel.setName(context.getString(i8));
        userSettingModel.setIcon(Picasso.get().load(i9));
        userSettingModel.setType(settingType);
        return userSettingModel;
    }

    private UserSettingModel.SettingType formatSettingType(int i8) {
        if (i8 == 1) {
            return UserSettingModel.SettingType.WEBSITE;
        }
        if (i8 == 2) {
            return UserSettingModel.SettingType.E_MAIL;
        }
        if (i8 != 3) {
            return null;
        }
        return UserSettingModel.SettingType.Tel;
    }

    private List<UserSettingModel> getExtendItemList() {
        List<ExtendMenuModel> extendList = BandExtendProvider.getExtendList();
        if (extendList == null || extendList.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ExtendMenuModel extendMenuModel : extendList) {
            UserSettingModel.SettingType formatSettingType = formatSettingType(extendMenuModel.getType());
            if (formatSettingType != null) {
                String icon = extendMenuModel.getIcon();
                String default_text = extendMenuModel.getDefault_text();
                String content = extendMenuModel.getContent();
                UserSettingModel userSettingModel = new UserSettingModel();
                userSettingModel.setIcon(BandExtendProvider.getExtendIcon(icon));
                userSettingModel.setName(default_text);
                userSettingModel.setType(formatSettingType);
                userSettingModel.setUrl(content);
                arrayList.add(userSettingModel);
            }
        }
        return arrayList;
    }

    @NonNull
    private List<UserSettingModel> getUserSetting(Context context) {
        ArrayList arrayList = new ArrayList();
        UserSettingModel buildUserSettingItem = buildUserSettingItem(context, R.string.goal_step_setting, R$drawable.ic_user_goal, UserSettingModel.SettingType.GOAL_STEPS);
        buildUserSettingItem.setHintText(context.getString(R.string.goal_step, Integer.valueOf(GoalsSettingDaoProxy.getInstance().getTodayGoalSteps())));
        arrayList.add(buildUserSettingItem);
        arrayList.add(buildUserSettingItem(context, R.string.info_setting, R$drawable.ic_user_profile, UserSettingModel.SettingType.USER_INFO));
        arrayList.add(buildBackgroundRunItem(context));
        List<UserSettingModel> extendItemList = getExtendItemList();
        if (extendItemList != null) {
            arrayList.addAll(extendItemList);
        }
        arrayList.add(buildUserSettingItem(context, R.string.about, R$drawable.ic_user_about, UserSettingModel.SettingType.ABOUT));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getUserSettingList$0(List list) {
        s3.a aVar;
        if (list == null || (aVar = this.userSettingView) == null) {
            return;
        }
        aVar.renderUserSettingList(list);
    }

    public UserSettingModel buildBackgroundRunItem(Context context) {
        UserSettingModel userSettingModel = new UserSettingModel();
        userSettingModel.setName(context.getString(R.string.background_run_guide));
        userSettingModel.setIcon(Picasso.get().load(R$drawable.ic_running_in_bg));
        userSettingModel.setType(UserSettingModel.SettingType.BACKGROUNB_RUN);
        userSettingModel.setContent(context.getString(R.string.background_run_hint));
        userSettingModel.setUrl(String.format("https://api.moyoung.com/instruction?app_name=%s&tag=img", context.getString(R.string.app_name)));
        return userSettingModel;
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.userSettingView = null;
        c.getDefault().unregister(this);
        this.disposables.clear();
    }

    public void getUserSettingList(Context context) {
        this.disposables.add(Observable.just(getUserSetting(context)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.home.profile.presenter.a
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                b.this.lambda$getUserSettingList$0((List) obj);
            }
        }));
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandBoundChangeEvent(d dVar) {
        getUserSettingList(com.moyoung.dafit.module.common.utils.d.get());
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandFirmwareVersionEvent(BandFirmwareVersionEvent bandFirmwareVersionEvent) {
        if (TextUtils.equals(BandLastBindBandProvider.getFirmwareType(), BandFirmwareUtils.getFirmwareType(bandFirmwareVersionEvent.getVersion()))) {
            return;
        }
        getUserSettingList(com.moyoung.dafit.module.common.utils.d.get());
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onLocaleChangeEvent(LocaleChangedEvent localeChangedEvent) {
        getUserSettingList(com.moyoung.dafit.module.common.utils.d.get());
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onUserGoalStepsChengeEvent(UserGoalStepsChengeEvent userGoalStepsChengeEvent) {
        if (this.userSettingView != null) {
            this.userSettingView.renderGoalStepsChange(userGoalStepsChengeEvent.getGoalSteps());
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(s3.a aVar) {
        this.userSettingView = aVar;
    }

    public void updateCustomerServiceMessage() {
        if (this.isUnRequestingCustomerServiceMessage) {
            this.isUnRequestingCustomerServiceMessage = false;
            String deviceId = p.getDeviceId(com.moyoung.dafit.module.common.utils.d.get());
            String string = com.moyoung.dafit.module.common.utils.d.get().getString(R.string.app_name);
            com.crrepa.band.my.profile.b.getInstance().getApiStores().getCustomServiceUnread(deviceId, BandInfoManager.getFirmwareVersion(), string).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
        }
    }
}
