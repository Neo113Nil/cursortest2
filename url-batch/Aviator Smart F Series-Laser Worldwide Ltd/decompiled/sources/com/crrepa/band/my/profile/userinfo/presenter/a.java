package com.crrepa.band.my.profile.userinfo.presenter;

import android.content.Context;
import androidx.annotation.NonNull;
import com.crrepa.band.my.ble.band.utils.g;
import com.crrepa.band.my.model.UserInfoModel;
import com.crrepa.band.my.model.user.provider.LengthUnitProvider;
import com.crrepa.band.my.model.user.provider.UserAgeProvider;
import com.crrepa.band.my.model.user.provider.UserGenderProvider;
import com.crrepa.band.my.model.user.provider.UserHeightProvider;
import com.crrepa.band.my.model.user.provider.UserStepLengthProvider;
import com.crrepa.band.my.model.user.provider.UserWeightProvider;
import com.crrepa.band.my.model.user.provider.WeightUnitProvider;
import java.util.List;

/* loaded from: classes2.dex */
public class a {
    private w3.a userInfoView;

    /* renamed from: com.crrepa.band.my.profile.userinfo.presenter.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0209a {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$band$my$model$UserInfoModel$InfoType;

        static {
            int[] iArr = new int[UserInfoModel.InfoType.values().length];
            $SwitchMap$com$crrepa$band$my$model$UserInfoModel$InfoType = iArr;
            try {
                iArr[UserInfoModel.InfoType.STEP_LENGTH.ordinal()] = 1;
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
                $SwitchMap$com$crrepa$band$my$model$UserInfoModel$InfoType[UserInfoModel.InfoType.BIRTHDAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$UserInfoModel$InfoType[UserInfoModel.InfoType.GENDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @NonNull
    private List<String> getUnitList(Context context, UserInfoModel.InfoType infoType) {
        int i8 = C0209a.$SwitchMap$com$crrepa$band$my$model$UserInfoModel$InfoType[infoType.ordinal()];
        if (i8 == 1 || i8 == 2) {
            return LengthUnitProvider.getLengthUnitList(context);
        }
        if (i8 != 3) {
            return null;
        }
        return WeightUnitProvider.getWeightUnitList(context);
    }

    private boolean getUserInfoUnitVisibility(UserInfoModel.InfoType infoType) {
        if (!g.hasUnitSystem()) {
            return false;
        }
        int i8 = C0209a.$SwitchMap$com$crrepa$band$my$model$UserInfoModel$InfoType[infoType.ordinal()];
        return i8 == 1 || i8 == 2 || i8 == 3;
    }

    public void getUserInfoList(Context context, UserInfoModel.InfoType infoType, int i8) {
        List<String> stepLengthList;
        int stepLengthPosition;
        int i9 = C0209a.$SwitchMap$com$crrepa$band$my$model$UserInfoModel$InfoType[infoType.ordinal()];
        if (i9 == 1) {
            stepLengthList = UserStepLengthProvider.getStepLengthList(i8);
            stepLengthPosition = UserStepLengthProvider.getStepLengthPosition(i8);
        } else if (i9 == 2) {
            stepLengthList = UserHeightProvider.getHeightList(i8);
            stepLengthPosition = UserHeightProvider.getHeightPosition(i8);
        } else if (i9 == 3) {
            stepLengthList = UserWeightProvider.getWeightList(i8);
            stepLengthPosition = UserWeightProvider.getWeightPosition(i8);
        } else if (i9 == 4) {
            stepLengthList = UserAgeProvider.getBirthYearList();
            stepLengthPosition = UserAgeProvider.getBirthYearPosition();
        } else if (i9 != 5) {
            stepLengthList = null;
            stepLengthPosition = 0;
        } else {
            stepLengthList = UserGenderProvider.getGenderList(context);
            stepLengthPosition = UserGenderProvider.getGenderPosition();
        }
        if (stepLengthList != null) {
            this.userInfoView.renderUserInfoList(stepLengthList);
            this.userInfoView.renderUserInfo(stepLengthPosition);
        }
    }

    public void getUserInfoUnitList(Context context, UserInfoModel.InfoType infoType, int i8) {
        if (getUserInfoUnitVisibility(infoType)) {
            this.userInfoView.renderUserInfoUnitList(getUnitList(context, infoType).subList(i8, i8 + 1));
        }
    }

    public void setView(w3.a aVar) {
        this.userInfoView = aVar;
    }
}
