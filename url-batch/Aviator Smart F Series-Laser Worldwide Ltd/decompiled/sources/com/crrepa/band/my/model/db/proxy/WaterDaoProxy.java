package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.Water;
import com.crrepa.band.my.model.db.greendao.WaterDao;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.query.k;

/* loaded from: classes2.dex */
public class WaterDaoProxy {
    private final WaterDao dao = c.getInstance().getDaoSession().getWaterDao();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getSortWaterRecordList$0(Water water, Water water2) {
        if (!i3.a.isSameMinute(water2.getDate(), water.getDate())) {
            return water2.getDate().compareTo(water.getDate());
        }
        if (water.getType() != water2.getType()) {
            return water.getType() - water2.getType();
        }
        if (water.getWaterId() != water2.getWaterId()) {
            return water2.getWaterId() - water.getWaterId();
        }
        return 1;
    }

    public Water createEmptyCalendarWater(Date date) {
        Water water = new Water();
        water.setDate(date);
        water.setIsGoal(true);
        water.setTotalIntakeOz(-1);
        water.setTotalIntakeOz(-1);
        Float valueOf = Float.valueOf(-1.0f);
        water.setSportTime(valueOf);
        water.setWeight(valueOf);
        water.setGoalMl(2000);
        water.setGoalOz(Integer.valueOf(u0.ml2Ozs(2000)));
        water.setPercentage(-1);
        water.setGrade(0);
        return water;
    }

    public void delete(Water water) {
        this.dao.delete(water);
    }

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public void deleteTodayWatchRecords() {
        Iterator<Water> it = getWaterRecordList(new Date(), 0).iterator();
        while (it.hasNext()) {
            delete(it.next());
        }
    }

    public Water getCalendarWater(Date date, boolean z7, int i8) {
        System.out.println("water ==> .... get CalendarWater : " + i8 + "; date : " + date);
        Date sameDayStartTime = m.getSameDayStartTime(date);
        Date sameDayEndTime = m.getSameDayEndTime(date);
        k queryBuilder = this.dao.queryBuilder();
        org.greenrobot.greendao.query.m eq = WaterDao.Properties.IsGoal.eq(Boolean.TRUE);
        f fVar = WaterDao.Properties.Date;
        List<Object> list = queryBuilder.where(eq, fVar.ge(sameDayStartTime), fVar.le(sameDayEndTime)).orderDesc(fVar).limit(1).list();
        if (list != null && list.size() > 0) {
            return (Water) list.get(0);
        }
        if (z7) {
            return com.crrepa.band.my.health.water.util.a.getInstance().createCalendarWater(new Water(), i8);
        }
        return null;
    }

    public List<Water> getCalendarWaterList() {
        List list = this.dao.queryBuilder().where(WaterDao.Properties.IsGoal.eq(Boolean.TRUE), new org.greenrobot.greendao.query.m[0]).orderAsc(WaterDao.Properties.Date).list();
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list;
    }

    public Water getChangeWater(int i8, int i9, int i10) {
        return (Water) this.dao.queryBuilder().where(WaterDao.Properties.WaterId.eq(Integer.valueOf(i8)), WaterDao.Properties.IsGoal.eq(Boolean.FALSE), WaterDao.Properties.Date.eq(i3.a.getTimeDate(i9, i10)), WaterDao.Properties.Type.eq(0)).unique();
    }

    public List<Water> getMonthCalendarWaterList(Date date, List<Water> list) {
        ArrayList arrayList = new ArrayList();
        int dayNumOfMonth = i3.a.getDayNumOfMonth(date);
        for (int i8 = 0; i8 < dayNumOfMonth; i8++) {
            arrayList.add(createEmptyCalendarWater(m.getDateOfOffsetDay(date, i8)));
        }
        if (list != null && list.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            Date endDateOfMonth = i3.a.getEndDateOfMonth(date);
            for (int i9 = 0; i9 < list.size(); i9++) {
                Water water = list.get(i9);
                if (!i3.a.isSameMonth(water.getDate(), date)) {
                    if (i3.a.isGreaterDay(water.getDate(), endDateOfMonth)) {
                        break;
                    }
                } else {
                    arrayList2.add(Integer.valueOf(i9));
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.set(i3.a.getDateDay(r1.getDate()) - 1, list.get(((Integer) it.next()).intValue()));
            }
        }
        return arrayList;
    }

    public List<Water> getSortWaterRecordList(Date date, int i8) {
        List<Water> waterRecordList = getWaterRecordList(date, i8);
        Collections.sort(waterRecordList, new Comparator() { // from class: com.crrepa.band.my.model.db.proxy.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$getSortWaterRecordList$0;
                lambda$getSortWaterRecordList$0 = WaterDaoProxy.lambda$getSortWaterRecordList$0((Water) obj, (Water) obj2);
                return lambda$getSortWaterRecordList$0;
            }
        });
        return waterRecordList;
    }

    public int[] getTotalIntake() {
        int i8;
        List<Water> waterRecordList = getWaterRecordList(new Date(), 2);
        int i9 = 0;
        if (waterRecordList == null || waterRecordList.size() <= 0) {
            i8 = 0;
        } else {
            i8 = 0;
            for (Water water : waterRecordList) {
                i9 += water.getIntakeMl().intValue();
                i8 += water.getIntakeOz().intValue();
            }
        }
        return new int[]{i9, i8};
    }

    public Water getWater(int i8, int i9) {
        if (i8 != 0) {
            return (Water) this.dao.queryBuilder().where(WaterDao.Properties.Id.eq(Integer.valueOf(i9)), WaterDao.Properties.Type.eq(1)).unique();
        }
        Date sameDayStartTime = m.getSameDayStartTime(new Date());
        Date sameDayEndTime = m.getSameDayEndTime(new Date());
        k queryBuilder = this.dao.queryBuilder();
        org.greenrobot.greendao.query.m eq = WaterDao.Properties.IsGoal.eq(Boolean.FALSE);
        f fVar = WaterDao.Properties.Date;
        return (Water) queryBuilder.where(eq, WaterDao.Properties.WaterId.eq(Integer.valueOf(i9)), WaterDao.Properties.Type.eq(0), fVar.ge(sameDayStartTime), fVar.le(sameDayEndTime)).unique();
    }

    public List<Water> getWaterRecordList(Date date, int i8) {
        Date sameDayStartTime = m.getSameDayStartTime(date);
        Date sameDayEndTime = m.getSameDayEndTime(date);
        if (i8 == 0) {
            k queryBuilder = this.dao.queryBuilder();
            f fVar = WaterDao.Properties.Date;
            return queryBuilder.where(fVar.ge(sameDayStartTime), fVar.le(sameDayEndTime), WaterDao.Properties.IsGoal.eq(Boolean.FALSE), WaterDao.Properties.Type.eq(Integer.valueOf(i8))).orderDesc(fVar).list();
        }
        if (i8 != 1) {
            k queryBuilder2 = this.dao.queryBuilder();
            f fVar2 = WaterDao.Properties.Date;
            return queryBuilder2.where(fVar2.ge(sameDayStartTime), fVar2.le(sameDayEndTime), WaterDao.Properties.IsGoal.eq(Boolean.FALSE)).orderDesc(fVar2).orderAsc(WaterDao.Properties.Type).orderDesc(WaterDao.Properties.WaterId).list();
        }
        k queryBuilder3 = this.dao.queryBuilder();
        f fVar3 = WaterDao.Properties.Date;
        return queryBuilder3.where(fVar3.ge(sameDayStartTime), fVar3.le(sameDayEndTime), WaterDao.Properties.IsGoal.eq(Boolean.FALSE), WaterDao.Properties.Type.eq(Integer.valueOf(i8))).orderDesc(fVar3).limit(32).list();
    }

    public void insert(Water water) {
        this.dao.insertOrReplace(water);
    }

    public boolean isCreatedCalendarWater(Date date) {
        Date sameDayStartTime = m.getSameDayStartTime(date);
        Date sameDayEndTime = m.getSameDayEndTime(date);
        k queryBuilder = this.dao.queryBuilder();
        org.greenrobot.greendao.query.m eq = WaterDao.Properties.IsGoal.eq(Boolean.TRUE);
        f fVar = WaterDao.Properties.Date;
        List<Object> list = queryBuilder.where(eq, fVar.ge(sameDayStartTime), fVar.le(sameDayEndTime)).orderDesc(fVar).limit(1).list();
        return list != null && list.size() > 0;
    }

    public void update(Water water) {
        this.dao.update(water);
    }
}
