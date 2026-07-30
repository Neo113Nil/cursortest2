package com.crrepa.band.my.model.user.provider;

import com.crrepa.band.my.model.db.UserInfo;
import com.crrepa.band.my.model.db.proxy.UserInfoDaoProxy;
import com.moyoung.dafit.module.common.utils.u0;

/* loaded from: classes2.dex */
public class UserInfoHelper {
    public void setDefaultUserInfo() {
        UserInfoDaoProxy userInfoDaoProxy = new UserInfoDaoProxy();
        if (userInfoDaoProxy.get() != null) {
            return;
        }
        UserInfo userInfo = new UserInfo();
        userInfo.setGender(Integer.valueOf(UserGenderProvider.getUsetDefaultGender()));
        userInfo.setBirthYear(Integer.valueOf(UserAgeProvider.getUserDefaultBirthYear()));
        int userDefaultHeight = UserHeightProvider.getUserDefaultHeight();
        float userDefaultWeight = UserWeightProvider.getUserDefaultWeight();
        int defaultStepLength = UserStepLengthProvider.getDefaultStepLength();
        int cm2Inches = u0.cm2Inches(userDefaultHeight);
        float kg2LbsFloat = u0.kg2LbsFloat(userDefaultWeight);
        int cm2Inches2 = u0.cm2Inches(defaultStepLength);
        userInfo.setHeightIn(Integer.valueOf(cm2Inches));
        userInfo.setWeightLbs(Float.valueOf(kg2LbsFloat));
        userInfo.setStepLengthIn(Integer.valueOf(cm2Inches2));
        userInfo.setHeightCm(Integer.valueOf(userDefaultHeight));
        userInfo.setWeightKg(Float.valueOf(userDefaultWeight));
        userInfo.setStepLengthCm(Integer.valueOf(defaultStepLength));
        userInfoDaoProxy.save(userInfo);
    }
}
