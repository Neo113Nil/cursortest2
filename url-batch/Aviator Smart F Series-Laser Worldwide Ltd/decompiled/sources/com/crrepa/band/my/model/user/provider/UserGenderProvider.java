package com.crrepa.band.my.model.user.provider;

import android.content.Context;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.water.util.a;
import com.crrepa.band.my.model.db.UserInfo;
import com.crrepa.band.my.model.db.proxy.UserInfoDaoProxy;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class UserGenderProvider {
    public static final int DEFAULT_GENDER = 1;
    public static final int GENDER_FEMALE = 0;
    public static final int GENDER_MALE = 1;

    public static List<String> getGenderList(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(context.getString(R.string.gender_female));
        arrayList.add(context.getString(R.string.gender_male));
        return arrayList;
    }

    public static int getGenderPosition() {
        return getUsetGender();
    }

    public static int getUsetDefaultGender() {
        return g.getInstance().getInt(BaseParamNames.USER_GENDER, 1);
    }

    public static int getUsetGender() {
        Integer gender;
        UserInfo userInfo = new UserInfoDaoProxy().get();
        if (userInfo == null || (gender = userInfo.getGender()) == null) {
            return 1;
        }
        return gender.intValue();
    }

    public static boolean isFemale() {
        return getUsetGender() == 0;
    }

    public static void setUserGender(int i8) {
        UserInfoDaoProxy userInfoDaoProxy = new UserInfoDaoProxy();
        UserInfo userInfo = userInfoDaoProxy.get();
        userInfo.setGender(Integer.valueOf(i8));
        userInfoDaoProxy.save(userInfo);
        a.getInstance().updateAutoGoal();
    }
}
