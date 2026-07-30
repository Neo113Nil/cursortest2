package com.crrepa.band.my.model.user.provider;

import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.db.UserInfo;
import com.crrepa.band.my.model.db.proxy.UserInfoDaoProxy;
import com.moyoung.dafit.module.common.utils.u0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class UserStepLengthProvider {
    private static final int DEFAULT_STEP_LENGTH_CM = 83;
    private static final int MAX_STEP_LENGTH_CM = 155;
    private static final int MAX_STEP_LENGTH_IN = 60;
    private static final int MIN_STEP_LENGTH_CM = 30;
    private static final int MIN_STEP_LENGTH_IN = 12;

    private UserStepLengthProvider() {
    }

    public static int getDefaultStepLength() {
        return getStepLength(UserHeightProvider.getUserDefaultHeight());
    }

    public static int getMaxStepLength() {
        if (BandUnitSystemProvider.getUnitSystem() == 0) {
            return MAX_STEP_LENGTH_CM;
        }
        return 60;
    }

    public static int getMinStepLength() {
        return BandUnitSystemProvider.getUnitSystem() == 0 ? 30 : 12;
    }

    public static int getStepLength(int i8) {
        return 83;
    }

    public static List getStepLengthList(int i8) {
        int i9;
        int i10;
        ArrayList arrayList = new ArrayList();
        if (i8 == 0) {
            i9 = 30;
            i10 = MAX_STEP_LENGTH_CM;
        } else {
            i9 = 12;
            i10 = 60;
        }
        while (i9 <= i10) {
            arrayList.add(Integer.valueOf(i9));
            i9++;
        }
        return arrayList;
    }

    public static int getStepLengthPosition(int i8) {
        int userStepLength = getUserStepLength(i8);
        return i8 == 0 ? userStepLength - 30 : userStepLength - 12;
    }

    public static int getUserStepLength() {
        return getUserStepLength(BandUnitSystemProvider.getUnitSystem());
    }

    public static int getUserStepLengthCm() {
        UserInfo userInfo = new UserInfoDaoProxy().get();
        if (!BandUnitSystemProvider.isImperialSystem()) {
            return userInfo.getStepLengthCm().intValue();
        }
        Integer stepLengthIn = userInfo.getStepLengthIn();
        return stepLengthIn == null ? getDefaultStepLength() : u0.inch2Cms(stepLengthIn.intValue());
    }

    public static void setUserStepLength(int i8, int i9) {
        UserInfoDaoProxy userInfoDaoProxy = new UserInfoDaoProxy();
        UserInfo userInfo = userInfoDaoProxy.get();
        if (i8 == 1) {
            userInfo.setStepLengthIn(Integer.valueOf(i9 + 12));
        } else {
            userInfo.setStepLengthCm(Integer.valueOf(i9 + 30));
        }
        userInfoDaoProxy.save(userInfo);
    }

    public static void updateUserStepLength(int i8, int i9) {
        UserInfoDaoProxy userInfoDaoProxy = new UserInfoDaoProxy();
        UserInfo userInfo = userInfoDaoProxy.get();
        int stepLength = getStepLength(i9);
        if (1 == i8) {
            userInfo.setStepLengthIn(Integer.valueOf(u0.cm2Inches(stepLength)));
        } else {
            userInfo.setStepLengthCm(Integer.valueOf(stepLength));
        }
        userInfoDaoProxy.save(userInfo);
    }

    private static int getUserStepLength(int i8) {
        UserInfo userInfo = new UserInfoDaoProxy().get();
        return i8 == 1 ? userInfo.getStepLengthIn().intValue() : userInfo.getStepLengthCm().intValue();
    }
}
