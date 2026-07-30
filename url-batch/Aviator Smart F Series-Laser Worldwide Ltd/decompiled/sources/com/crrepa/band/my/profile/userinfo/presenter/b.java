package com.crrepa.band.my.profile.userinfo.presenter;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.arthenica.ffmpegkit.x;
import com.baidu.ar.constants.HttpConstants;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.health.weight.model.WeightChangeEvent;
import com.crrepa.band.my.model.UserInfoModel;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.user.provider.UserAgeProvider;
import com.crrepa.band.my.model.user.provider.UserGenderProvider;
import com.crrepa.band.my.model.user.provider.UserHeightProvider;
import com.crrepa.band.my.model.user.provider.UserStepLengthProvider;
import com.crrepa.band.my.model.user.provider.UserWeightProvider;
import com.crrepa.band.my.profile.userinfo.model.UserAgeChangeEvent;
import com.crrepa.band.my.profile.userinfo.model.UserGenderChangeEvent;
import com.crrepa.band.my.profile.userinfo.model.UserWeightChangeEvent;
import com.moyoung.dafit.module.common.baseui.f;
import com.moyoung.dafit.module.common.utils.d;
import com.moyoung.dafit.module.common.utils.i0;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.s0;
import java.util.ArrayList;
import java.util.Date;
import l0.g;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class b implements f {
    private w3.b userInfoView;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$band$my$model$UserInfoModel$InfoType;

        static {
            int[] iArr = new int[UserInfoModel.InfoType.values().length];
            $SwitchMap$com$crrepa$band$my$model$UserInfoModel$InfoType = iArr;
            try {
                iArr[UserInfoModel.InfoType.GENDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$UserInfoModel$InfoType[UserInfoModel.InfoType.HEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$UserInfoModel$InfoType[UserInfoModel.InfoType.WEIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$UserInfoModel$InfoType[UserInfoModel.InfoType.STEP_LENGTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public b() {
        c.getDefault().register(this);
    }

    private String formatLength(Context context, int i8, int i9) {
        return i9 == 0 ? String.format(context.getString(R.string.height_cm_format), Integer.valueOf(i8)) : String.format(context.getString(R.string.height_inch_format), Integer.valueOf(i8 / 12), Integer.valueOf(i8 % 12));
    }

    private String formatWeight(Context context, float f8, int i8) {
        return String.format(i8 == 0 ? context.getString(R.string.weight_kg_format) : context.getString(R.string.weight_lb_format), Float.valueOf(f8));
    }

    @NonNull
    private UserInfoModel getUserBirthYear(Context context) {
        UserInfoModel userInfoModel = new UserInfoModel();
        userInfoModel.setType(UserInfoModel.InfoType.BIRTHDAY);
        userInfoModel.setName(R.string.birthday);
        userInfoModel.setContent(m.format(UserAgeProvider.getBirthday(), context.getString(R.string.year_month_day_format)));
        return userInfoModel;
    }

    @NonNull
    private UserInfoModel getUserGender(Context context) {
        UserInfoModel userInfoModel = new UserInfoModel();
        userInfoModel.setType(UserInfoModel.InfoType.GENDER);
        userInfoModel.setName(R.string.gender);
        userInfoModel.setContent(UserGenderProvider.getUsetGender() == 1 ? context.getString(R.string.gender_male) : context.getString(R.string.gender_female));
        return userInfoModel;
    }

    @NonNull
    private UserInfoModel getUserHeight(Context context, int i8) {
        UserInfoModel userInfoModel = new UserInfoModel();
        userInfoModel.setType(UserInfoModel.InfoType.HEIGHT);
        userInfoModel.setName(R.string.height);
        userInfoModel.setContent(formatLength(context, UserHeightProvider.getUserHeight(), i8));
        return userInfoModel;
    }

    @NonNull
    private UserInfoModel getUserStepLength(Context context, int i8) {
        UserInfoModel userInfoModel = new UserInfoModel();
        userInfoModel.setType(UserInfoModel.InfoType.STEP_LENGTH);
        userInfoModel.setName(R.string.step_length);
        userInfoModel.setContent(formatLength(context, UserStepLengthProvider.getUserStepLength(), i8));
        return userInfoModel;
    }

    @NonNull
    private UserInfoModel getUserWeight(Context context, int i8) {
        UserInfoModel userInfoModel = new UserInfoModel();
        userInfoModel.setType(UserInfoModel.InfoType.WEIGHT);
        userInfoModel.setName(R.string.weight);
        userInfoModel.setContent(formatWeight(context, UserWeightProvider.getUserWeight(), i8));
        return userInfoModel;
    }

    private static void logSpeechEngineInfoEvent() {
        Bundle bundle = new Bundle();
        bundle.putString(HttpConstants.HTTP_MANUFACTURER, com.moyoung.dafit.module.common.utils.b.getManufacturer());
        bundle.putString("system_model", com.moyoung.dafit.module.common.utils.b.getSystemModel());
        bundle.putString(HttpConstants.HTTP_SYSTEM_VERSION, com.moyoung.dafit.module.common.utils.b.getSystemVersion());
        try {
            if (i0.createSpeechRecognizer(d.get()) != null) {
                bundle.putString("asr_engine_name", i0.asr_engine_name);
                bundle.putString("asr_engine_service_name", i0.asr_engine_service_name);
            } else {
                bundle.putString("asr_engine_name", "未知");
                bundle.putString("asr_engine_service_name", "未知");
            }
        } catch (Exception unused) {
            bundle.putString("asr_engine_name", "获取speechRecognizer报错");
        }
        s0.logEvent("event_speech_msg", bundle);
    }

    public static void logUserInfoEvent() {
        int age = m.getAge(UserAgeProvider.getBirthday());
        String str = UserGenderProvider.getUsetGender() == 1 ? "男" : "女";
        int userHeightCm = UserHeightProvider.getUserHeightCm();
        float userWeightKg = UserWeightProvider.getUserWeightKg();
        int userStepLengthCm = UserStepLengthProvider.getUserStepLengthCm();
        String firmwareVersion = com.crrepa.band.my.ble.band.utils.a.getInstance().getFirmwareVersion();
        s0.logUserId();
        s0.logUserProperty("age", String.valueOf(age));
        s0.logUserProperty("sex", str);
        s0.logUserProperty(x.KEY_HEIGHT, String.valueOf(userHeightCm));
        s0.logUserProperty("weight", String.valueOf(userWeightKg));
        s0.logUserProperty("step_length", String.valueOf(userStepLengthCm));
        if (firmwareVersion == null) {
            firmwareVersion = "-";
        }
        s0.logUserProperty("watch_model", firmwareVersion);
        logSpeechEngineInfoEvent();
    }

    private void updateStepLength(int i8) {
        UserStepLengthProvider.updateUserStepLength(i8, UserHeightProvider.getUserHeightCm());
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.userInfoView = null;
        c.getDefault().unregister(this);
        i4.getInstance().sendUserInfo();
        i4.getInstance().sendStepLength();
    }

    public void getUserInfo(Context context) {
        int unitSystem = BandUnitSystemProvider.getUnitSystem();
        ArrayList arrayList = new ArrayList();
        arrayList.add(getUserGender(context));
        arrayList.add(getUserBirthYear(context));
        arrayList.add(getUserHeight(context, unitSystem));
        arrayList.add(getUserWeight(context, unitSystem));
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand == null || connectBand.hasUnitSystem()) {
            arrayList.add(getUserStepLength(context, unitSystem));
        }
        this.userInfoView.renderUserList(arrayList);
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandMeasurementSystemChangeEvent(g gVar) {
        getUserInfo(d.get());
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void saveUserBirthday(Date date) {
        UserAgeProvider.saveBirthday(date);
        c.getDefault().post(new UserAgeChangeEvent(UserAgeProvider.getUserAge()));
        logUserInfoEvent();
    }

    public void saveUserInfo(UserInfoModel.InfoType infoType, int i8, int i9) {
        int i10 = a.$SwitchMap$com$crrepa$band$my$model$UserInfoModel$InfoType[infoType.ordinal()];
        if (i10 == 1) {
            UserGenderProvider.setUserGender(i8);
            c.getDefault().post(new UserGenderChangeEvent());
        } else if (i10 == 2) {
            UserHeightProvider.setUserHeight(i9, i8);
            updateStepLength(i9);
            c.getDefault().post(new WeightChangeEvent());
        } else if (i10 == 3) {
            float userWeightByPosition = UserWeightProvider.getUserWeightByPosition(i9, i8);
            UserWeightProvider.setUserWeight(i9, userWeightByPosition);
            c.getDefault().post(new UserWeightChangeEvent());
            UserWeightProvider.insertWeight(userWeightByPosition);
            c.getDefault().post(new WeightChangeEvent());
        } else if (i10 == 4) {
            UserStepLengthProvider.setUserStepLength(i9, i8);
        }
        logUserInfoEvent();
    }

    public void setView(w3.b bVar) {
        this.userInfoView = bVar;
    }
}
