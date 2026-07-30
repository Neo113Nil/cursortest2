package com.crrepa.band.my.model.user.provider;

import com.crrepa.band.my.health.water.util.a;
import com.crrepa.band.my.model.db.UserInfo;
import com.crrepa.band.my.model.db.proxy.UserInfoDaoProxy;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.m;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class UserAgeProvider {
    private static final int BIRTH_YEAR_RANGE_LENGTH = 100;
    private static final int DEFAULT_AGE = 25;

    public static List getBirthYearList() {
        ArrayList arrayList = new ArrayList();
        int yearOfDate = m.getYearOfDate(new Date());
        for (int i8 = 0; i8 <= 100; i8++) {
            arrayList.add(Integer.valueOf((yearOfDate - 100) + i8));
        }
        return arrayList;
    }

    public static int getBirthYearPosition() {
        return 100 - getUserAge();
    }

    public static Date getBirthday() {
        int userDefaultBirthYear;
        UserInfo userInfo = new UserInfoDaoProxy().get();
        Calendar calendar = Calendar.getInstance();
        if (userInfo == null || userInfo.getBirthYear() == null) {
            userDefaultBirthYear = getUserDefaultBirthYear();
        } else if (userInfo.getBirthday() != null) {
            calendar.setTime(userInfo.getBirthday());
            userDefaultBirthYear = 0;
        } else {
            userDefaultBirthYear = userInfo.getBirthYear().intValue();
        }
        if (userDefaultBirthYear > 0) {
            calendar.set(1, userDefaultBirthYear);
            calendar.set(2, 0);
            calendar.set(5, 1);
        }
        return calendar.getTime();
    }

    public static int getUserAge() {
        return m.getAge(getBirthday());
    }

    public static int getUserBirthYear() {
        UserInfo userInfo = new UserInfoDaoProxy().get();
        return (userInfo == null || userInfo.getBirthYear() == null) ? getUserDefaultBirthYear() : userInfo.getBirthday() != null ? m.getYearOfDate(userInfo.getBirthday()) : userInfo.getBirthYear().intValue();
    }

    static int getUserDefaultBirthYear() {
        return g.getInstance().getInt(BaseParamNames.USER_BIRTH_YEAR, m.getYearOfDate(new Date()) - 25);
    }

    public static void saveBirthday(Date date) {
        UserInfoDaoProxy userInfoDaoProxy = new UserInfoDaoProxy();
        UserInfo userInfo = userInfoDaoProxy.get();
        if (userInfo == null) {
            userInfo = new UserInfo();
        }
        userInfo.setBirthday(date);
        userInfoDaoProxy.save(userInfo);
        a.getInstance().updateAutoGoal();
    }

    public static void setUserBirthYear(int i8) {
        int intValue = ((Integer) getBirthYearList().get(i8)).intValue();
        UserInfoDaoProxy userInfoDaoProxy = new UserInfoDaoProxy();
        UserInfo userInfo = userInfoDaoProxy.get();
        if (userInfo == null) {
            userInfo = new UserInfo();
        }
        userInfo.setBirthYear(Integer.valueOf(intValue));
        userInfoDaoProxy.save(userInfo);
    }
}
