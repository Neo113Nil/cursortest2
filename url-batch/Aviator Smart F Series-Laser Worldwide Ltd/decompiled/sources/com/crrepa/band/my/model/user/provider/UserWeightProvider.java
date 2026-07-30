package com.crrepa.band.my.model.user.provider;

import android.text.TextUtils;
import com.crrepa.band.my.health.water.util.a;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.db.UserInfo;
import com.crrepa.band.my.model.db.Weight;
import com.crrepa.band.my.model.db.proxy.UserInfoDaoProxy;
import com.crrepa.band.my.model.db.proxy.WeightDaoProxy;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.google.gson.Gson;
import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.n;
import com.moyoung.dafit.module.common.utils.s;
import com.moyoung.dafit.module.common.utils.u0;
import com.orhanobut.logger.f;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class UserWeightProvider {
    public static final int DEFAULT_FEMALE_WEIGHT = 50;
    public static final int DEFAULT_MALE_WEIGHT = 65;
    private static final int DEFAULT_WEIGHT_VALUE = -1;
    private static final int MAX_WEIGHT_KG = 220;
    private static final int MAX_WEIGHT_LB = 485;
    private static final int MIN_WEIGHT_KG = 10;
    private static final int MIN_WEIGHT_LB = 22;
    private static final int WEIGHT_RATIO = 10;

    public static int getCurrentMaxWeight() {
        return BandUnitSystemProvider.getUnitSystem() == 0 ? MAX_WEIGHT_KG : MAX_WEIGHT_LB;
    }

    public static int getCurrentMinWeight() {
        return BandUnitSystemProvider.getUnitSystem() == 0 ? 10 : 22;
    }

    public static float getCurrentWeight(Weight weight) {
        return getCurrentWeightByUnitSystem(BandUnitSystemProvider.getUnitSystem(), weight);
    }

    public static float getCurrentWeightByUnitSystem(int i8, Weight weight) {
        return i8 == 0 ? weight.getWeightKg().floatValue() : weight.getWeightLb().floatValue();
    }

    public static float getDefaultWeight() {
        int i8 = UserGenderProvider.getUsetGender() == 1 ? 65 : 50;
        return BandUnitSystemProvider.getUnitSystem() == 0 ? i8 : u0.kg2LbsFloat(i8);
    }

    public static float getLastSaveWeight() {
        float[] lastSaveWeightArray = getLastSaveWeightArray();
        return BandUnitSystemProvider.getUnitSystem() == 0 ? lastSaveWeightArray[0] : lastSaveWeightArray[1];
    }

    private static float[] getLastSaveWeightArray() {
        String string = g.getInstance().getString(BaseParamNames.LAST_SAVE_WEIGHT, null);
        if (!TextUtils.isEmpty(string)) {
            return (float[]) new Gson().fromJson(string, float[].class);
        }
        boolean z7 = BandUnitSystemProvider.getUnitSystem() == 0;
        float[] fArr = new float[2];
        float defaultWeight = getDefaultWeight();
        if (z7) {
            fArr[0] = defaultWeight;
            fArr[1] = u0.kg2LbsFloat(defaultWeight);
        } else {
            fArr[1] = defaultWeight;
            fArr[0] = u0.lb2KgsFloat(defaultWeight);
        }
        return fArr;
    }

    public static float getUserDefaultWeight() {
        return getDefaultWeight();
    }

    public static float getUserWeight() {
        return getUserWeight(BandUnitSystemProvider.getUnitSystem());
    }

    public static float getUserWeightByPosition(int i8, int i9) {
        return n.getDecimalFormat((i9 * 1.0f) / 10.0f, 1);
    }

    public static float getUserWeightKg() {
        int unitSystem = BandUnitSystemProvider.getUnitSystem();
        UserInfo userInfo = new UserInfoDaoProxy().get();
        if (unitSystem != 1) {
            return userInfo.getWeightKg().floatValue();
        }
        Float weightLbs = userInfo.getWeightLbs();
        return weightLbs == null ? getUserDefaultWeight() : u0.lb2KgsFloat(weightLbs.floatValue());
    }

    public static List getWeightList(int i8) {
        int i9;
        int i10;
        ArrayList arrayList = new ArrayList();
        if (i8 == 0) {
            i9 = 100;
            i10 = 2200;
        } else {
            i9 = MAX_WEIGHT_KG;
            i10 = 4850;
        }
        while (i9 <= i10) {
            arrayList.add(Float.valueOf((i9 * 1.0f) / 10.0f));
            i9++;
        }
        return arrayList;
    }

    public static int getWeightPosition(int i8) {
        float userWeight = getUserWeight(i8);
        return i8 == 0 ? Math.round(userWeight * 10.0f) - 100 : Math.round(userWeight * 10.0f) - 220;
    }

    public static void insertWeight(float f8) {
        f.d("weight ==> (user)add-weight : " + f8);
        Weight weight = new Weight();
        weight.setDate(new Date());
        weight.setShowWeight(true);
        new WeightDaoProxy().insert(weight);
        setCurrentWeight(weight, f8);
        saveLastSaveWeight(f8 + getCurrentMinWeight());
    }

    public static boolean isFirstAddWeight() {
        return g.getInstance().getBoolean(BaseParamNames.FIRST_ADD_WEIGHT, true);
    }

    public static void saveLastSaveWeight(float f8) {
        float[] lastSaveWeightArray = getLastSaveWeightArray();
        if (BandUnitSystemProvider.getUnitSystem() == 0) {
            lastSaveWeightArray[0] = f8;
            lastSaveWeightArray[1] = u0.kg2LbsFloat(f8);
        } else {
            lastSaveWeightArray[1] = f8;
            lastSaveWeightArray[0] = u0.lb2KgsFloat(f8);
        }
        g.getInstance().putString(BaseParamNames.LAST_SAVE_WEIGHT, s.bean2Json(lastSaveWeightArray));
    }

    public static void setCurrentWeight(Weight weight, float f8) {
        if (BandUnitSystemProvider.getUnitSystem() == 1) {
            float f9 = f8 + 22.0f;
            weight.setWeightLb(Float.valueOf(f9));
            weight.setWeightKg(Float.valueOf(u0.lb2KgsFloat(f9)));
        } else {
            float f10 = f8 + 10.0f;
            weight.setWeightKg(Float.valueOf(f10));
            weight.setWeightLb(Float.valueOf(u0.kg2LbsFloat(f10)));
        }
        new WeightDaoProxy().update(weight);
    }

    public static void setUserWeight(int i8, float f8) {
        UserInfoDaoProxy userInfoDaoProxy = new UserInfoDaoProxy();
        UserInfo userInfo = userInfoDaoProxy.get();
        if (i8 == 1) {
            float f9 = f8 + 22.0f;
            userInfo.setWeightLbs(Float.valueOf(f9));
            userInfo.setWeightKg(Float.valueOf(u0.lb2KgsFloat(f9)));
        } else {
            float f10 = f8 + 10.0f;
            userInfo.setWeightKg(Float.valueOf(f10));
            userInfo.setWeightLbs(Float.valueOf(u0.kg2LbsFloat(f10)));
        }
        userInfoDaoProxy.save(userInfo);
        a.getInstance().updateWeight(userInfo.getWeightKg().floatValue());
    }

    private static float getUserWeight(int i8) {
        UserInfo userInfo = new UserInfoDaoProxy().get();
        return i8 == 1 ? userInfo.getWeightLbs().floatValue() : userInfo.getWeightKg().floatValue();
    }
}
