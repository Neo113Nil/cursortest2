package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.db.Weight;
import com.crrepa.band.my.model.db.greendao.WeightDao;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.crrepa.band.my.model.user.provider.UserWeightProvider;
import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.n;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.query.k;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class WeightDaoProxy {
    public static final int DAY = 0;
    public static final int MONTH = 2;
    public static final int WEEK = 1;
    public static final int YEAR = 3;
    private final WeightDao dao = c.getInstance().getDaoSession().getWeightDao();

    public void delete(Weight weight) {
        this.dao.delete(weight);
    }

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public List<Weight> getAllWeightList() {
        List<Object> list = this.dao.queryBuilder().orderDesc(WeightDao.Properties.Date).list();
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            Date date = ((Weight) list.get(0)).getDate();
            Weight weight = new Weight();
            weight.setDate(date);
            weight.setShowWeight(false);
            arrayList.add(weight);
            arrayList.add((Weight) list.get(0));
            for (int i8 = 1; i8 < list.size(); i8++) {
                Weight weight2 = (Weight) list.get(i8);
                if (i3.a.isSameDay(weight2.getDate(), date)) {
                    arrayList.add(weight2);
                } else {
                    date = weight2.getDate();
                    Weight weight3 = new Weight();
                    weight3.setDate(date);
                    weight3.setShowWeight(false);
                    arrayList.add(weight3);
                    arrayList.add(weight2);
                }
            }
        }
        return arrayList;
    }

    public float getAverageWeightNum(Date date, int i8) {
        int size;
        List<Weight> weightList = getWeightList(date, i8);
        float f8 = 0.0f;
        if (weightList == null || (size = weightList.size()) <= 0) {
            return 0.0f;
        }
        Iterator<Weight> it = weightList.iterator();
        while (it.hasNext()) {
            f8 += UserWeightProvider.getCurrentWeight(it.next());
        }
        return f8 / size;
    }

    public Weight getLastestWeight(Date date) {
        List<Weight> limitWeightList = getLimitWeightList(1, date);
        if (limitWeightList != null) {
            return limitWeightList.get(0);
        }
        return null;
    }

    public List<Weight> getLimitWeightList(int i8, Date date) {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = WeightDao.Properties.Date;
        List list = queryBuilder.where(fVar.le(date), new m[0]).orderDesc(fVar).limit(i8).list();
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list;
    }

    public float[] getMaxMinWeightNum(List<Weight> list) {
        if (list == null || list.size() == 0) {
            return new float[]{UserWeightProvider.getCurrentMaxWeight(), UserWeightProvider.getCurrentMinWeight()};
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Weight> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(UserWeightProvider.getCurrentWeight(it.next())));
        }
        float floatValue = ((Float) arrayList.get(0)).floatValue();
        float floatValue2 = ((Float) arrayList.get(0)).floatValue();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            float floatValue3 = ((Float) it2.next()).floatValue();
            if (floatValue3 > floatValue) {
                floatValue = floatValue3;
            }
            if (floatValue3 < floatValue2) {
                floatValue2 = floatValue3;
            }
        }
        return new float[]{floatValue + (UserWeightProvider.getCurrentMinWeight() * 2), floatValue2 - UserWeightProvider.getCurrentMinWeight()};
    }

    public float getMaxWeight() {
        boolean z7 = BandUnitSystemProvider.getUnitSystem() == 0;
        k queryBuilder = this.dao.queryBuilder();
        f[] fVarArr = new f[1];
        fVarArr[0] = z7 ? WeightDao.Properties.WeightKg : WeightDao.Properties.WeightLb;
        List<Object> list = queryBuilder.orderDesc(fVarArr).limit(1).list();
        if (list == null || list.size() <= 0) {
            return UserWeightProvider.getCurrentMaxWeight();
        }
        return (z7 ? ((Weight) list.get(0)).getWeightKg() : ((Weight) list.get(0)).getWeightLb()).floatValue() + UserWeightProvider.getCurrentMinWeight();
    }

    public float getMinWeight() {
        boolean z7 = BandUnitSystemProvider.getUnitSystem() == 0;
        k queryBuilder = this.dao.queryBuilder();
        f[] fVarArr = new f[1];
        fVarArr[0] = z7 ? WeightDao.Properties.WeightKg : WeightDao.Properties.WeightLb;
        List<Object> list = queryBuilder.orderAsc(fVarArr).limit(1).list();
        if (list == null || list.size() <= 0) {
            return UserWeightProvider.getCurrentMinWeight();
        }
        return (z7 ? ((Weight) list.get(0)).getWeightKg() : ((Weight) list.get(0)).getWeightLb()).floatValue() - UserWeightProvider.getCurrentMinWeight();
    }

    public float getTotalAverageNum(List<Float> list) {
        Iterator<Float> it = list.iterator();
        int i8 = 0;
        float f8 = 0.0f;
        while (it.hasNext()) {
            float floatValue = it.next().floatValue();
            if (floatValue > 0.0f) {
                i8++;
                f8 += floatValue;
            }
        }
        if (f8 == 0.0f) {
            return 0.0f;
        }
        return n.getDecimalFormat(f8 / i8, 2);
    }

    public List<Date> getWeightDateList(List<Weight> list) {
        ArrayList arrayList = new ArrayList();
        int size = list == null ? 0 : list.size();
        for (int i8 = size; i8 < 7; i8++) {
            arrayList.add(null);
        }
        for (int i9 = size - 1; i9 >= 0; i9--) {
            arrayList.add(list.get(i9).getDate());
        }
        return arrayList;
    }

    public List<Weight> getWeightList(Date date, int i8) {
        Date sameDayStartTime;
        Date sameDayEndTime;
        if (i8 == 0) {
            sameDayStartTime = com.moyoung.dafit.module.common.utils.m.getSameDayStartTime(date);
            sameDayEndTime = com.moyoung.dafit.module.common.utils.m.getSameDayEndTime(date);
        } else if (i8 == 1) {
            Calendar startCalendarOfWeek = com.moyoung.dafit.module.common.utils.m.getStartCalendarOfWeek(com.moyoung.dafit.module.common.utils.m.getSameDayStartTime(date));
            sameDayStartTime = startCalendarOfWeek.getTime();
            startCalendarOfWeek.add(4, 1);
            sameDayEndTime = startCalendarOfWeek.getTime();
        } else if (i8 == 2) {
            Calendar startCalendarOfMonth = com.moyoung.dafit.module.common.utils.m.getStartCalendarOfMonth(com.moyoung.dafit.module.common.utils.m.getSameDayStartTime(date));
            sameDayStartTime = startCalendarOfMonth.getTime();
            startCalendarOfMonth.add(2, 1);
            sameDayEndTime = startCalendarOfMonth.getTime();
        } else if (i8 != 3) {
            sameDayEndTime = null;
            sameDayStartTime = null;
        } else {
            Calendar startCalendarOfYear = com.moyoung.dafit.module.common.utils.m.getStartCalendarOfYear(com.moyoung.dafit.module.common.utils.m.getSameDayStartTime(date));
            sameDayStartTime = startCalendarOfYear.getTime();
            startCalendarOfYear.add(1, 1);
            sameDayEndTime = startCalendarOfYear.getTime();
        }
        if (sameDayStartTime != null) {
            k queryBuilder = this.dao.queryBuilder();
            f fVar = WeightDao.Properties.Date;
            List list = queryBuilder.where(fVar.ge(sameDayStartTime), fVar.le(sameDayEndTime)).orderAsc(fVar).list();
            if (list != null && list.size() > 0) {
                return list;
            }
        }
        return null;
    }

    public List<Float> getWeightNumList(List<Weight> list, boolean z7) {
        ArrayList arrayList = new ArrayList();
        int size = list == null ? 0 : list.size();
        if (z7) {
            for (int i8 = size; i8 < 7; i8++) {
                arrayList.add(Float.valueOf(0.0f));
            }
        }
        for (int i9 = size - 1; i9 >= 0; i9--) {
            arrayList.add(Float.valueOf(UserWeightProvider.getCurrentWeight(list.get(i9))));
        }
        return arrayList;
    }

    public void insert(Weight weight) {
        this.dao.insertOrReplace(weight);
        g.getInstance().putBoolean(BaseParamNames.FIRST_ADD_WEIGHT, false);
    }

    public boolean isChangedUserWeight() {
        Weight lastestWeight = getLastestWeight(new Date());
        return (lastestWeight == null || UserWeightProvider.getCurrentWeight(lastestWeight) == UserWeightProvider.getUserWeight()) ? false : true;
    }

    public void update(Weight weight) {
        this.dao.update(weight);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x000a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float getAverageWeightNum(List<Weight> list, Date date, int i8) {
        if (list == null) {
            return 0.0f;
        }
        int i9 = 0;
        boolean z7 = false;
        float f8 = 0.0f;
        for (Weight weight : list) {
            if (i8 == 0) {
                if (i3.a.isSameDay(weight.getDate(), date)) {
                    i9++;
                    f8 += UserWeightProvider.getCurrentWeight(weight);
                    z7 = true;
                } else if (!z7) {
                    return n.getDecimalFormat(f8 / i9, 2);
                }
            } else if (i3.a.isSameMonth(weight.getDate(), date)) {
                i9++;
                f8 += UserWeightProvider.getCurrentWeight(weight);
                z7 = true;
            } else if (!z7) {
            }
        }
        if (f8 == 0.0f) {
            return 0.0f;
        }
        return n.getDecimalFormat(f8 / i9, 2);
    }
}
