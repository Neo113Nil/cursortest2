package com.crrepa.band.my.model.user.provider;

import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.db.UserInfo;
import com.crrepa.band.my.model.db.proxy.UserInfoDaoProxy;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.u0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class UserHeightProvider {
    private static final int DEFAULT_FEMALE_HEIGHT = 160;
    private static final int DEFAULT_HEIGHT_VALUE = -1;
    private static final int DEFAULT_MALE_HEIGHT = 175;
    private static final int MAX_HEIGHT_CM = 245;
    private static final int MAX_HEIGHT_IN = 96;
    private static final int MIN_HEIGHT_CM = 90;
    private static final int MIN_HEIGHT_IN = 36;

    public static List getHeightList(int i8) {
        int i9;
        int i10;
        ArrayList arrayList = new ArrayList();
        if (i8 == 0) {
            i9 = 90;
            i10 = MAX_HEIGHT_CM;
        } else {
            i9 = 36;
            i10 = 96;
        }
        while (i9 <= i10) {
            arrayList.add(Integer.valueOf(i9));
            i9++;
        }
        return arrayList;
    }

    public static int getHeightPosition(int i8) {
        int userHeight = getUserHeight(i8);
        return i8 == 0 ? userHeight - 90 : userHeight - 36;
    }

    public static int getMaxStepLength() {
        if (BandUnitSystemProvider.getUnitSystem() == 0) {
            return MAX_HEIGHT_CM;
        }
        return 96;
    }

    public static int getMinStepLength() {
        return BandUnitSystemProvider.getUnitSystem() == 0 ? 90 : 36;
    }

    static int getUserDefaultHeight() {
        int i8 = g.getInstance().getInt(BaseParamNames.USER_HEIGHT, -1);
        return i8 == -1 ? DEFAULT_MALE_HEIGHT : i8;
    }

    public static int getUserHeight() {
        return getUserHeight(BandUnitSystemProvider.getUnitSystem());
    }

    public static int getUserHeightCm() {
        int unitSystem = BandUnitSystemProvider.getUnitSystem();
        UserInfo userInfo = new UserInfoDaoProxy().get();
        if (unitSystem != 1) {
            return userInfo.getHeightCm().intValue();
        }
        Integer heightIn = userInfo.getHeightIn();
        return heightIn == null ? getUserDefaultHeight() : u0.inch2Cms(heightIn.intValue());
    }

    public static void setUserHeight(int i8, int i9) {
        UserInfoDaoProxy userInfoDaoProxy = new UserInfoDaoProxy();
        UserInfo userInfo = userInfoDaoProxy.get();
        if (i8 == 1) {
            userInfo.setHeightIn(Integer.valueOf(i9 + 36));
        } else {
            userInfo.setHeightCm(Integer.valueOf(i9 + 90));
        }
        userInfoDaoProxy.save(userInfo);
    }

    public static int getUserHeight(int i8) {
        UserInfo userInfo = new UserInfoDaoProxy().get();
        return i8 == 1 ? userInfo.getHeightIn().intValue() : userInfo.getHeightCm().intValue();
    }
}
