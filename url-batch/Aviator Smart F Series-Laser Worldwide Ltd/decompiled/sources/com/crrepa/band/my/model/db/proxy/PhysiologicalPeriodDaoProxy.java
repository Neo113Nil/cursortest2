package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.PhysiologicalPeriod;
import com.crrepa.band.my.model.db.greendao.PhysiologicalPeriodDao;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Date;
import java.util.List;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.query.k;

/* loaded from: classes2.dex */
public class PhysiologicalPeriodDaoProxy {
    private PhysiologicalPeriodDao dao = c.getInstance().getDaoSession().getPhysiologicalPeriodDao();

    private void delete(PhysiologicalPeriod physiologicalPeriod) {
        this.dao.delete(physiologicalPeriod);
    }

    private PhysiologicalPeriod getMaxIdPhysiologcalPeriod() {
        List<Object> list = this.dao.queryBuilder().orderDesc(PhysiologicalPeriodDao.Properties.Id).limit(1).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (PhysiologicalPeriod) list.get(0);
    }

    private long insertPhysiologcalPeriod(PhysiologicalPeriod physiologicalPeriod) {
        return this.dao.insertOrReplace(physiologicalPeriod);
    }

    private boolean isSameCycle(PhysiologicalPeriod physiologicalPeriod, PhysiologicalPeriod physiologicalPeriod2) {
        if (physiologicalPeriod == null || physiologicalPeriod2 == null) {
            return false;
        }
        return Math.abs(m.getDaySpace(physiologicalPeriod2.getLastMenstrualDate(), physiologicalPeriod.getLastMenstrualDate())) < physiologicalPeriod.getPhysiologicalPeriod().intValue();
    }

    public List<PhysiologicalPeriod> getAll() {
        return this.dao.queryBuilder().orderAsc(PhysiologicalPeriodDao.Properties.LastMenstrualDate).list();
    }

    public PhysiologicalPeriod getLastPhysiologcalPeriod() {
        PhysiologicalPeriod previousPhysiologcalPeriod = getPreviousPhysiologcalPeriod(new Date());
        return previousPhysiologcalPeriod == null ? getMaxIdPhysiologcalPeriod() : previousPhysiologcalPeriod;
    }

    public PhysiologicalPeriod getNextPhysiologcalPeriod(Date date) {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = PhysiologicalPeriodDao.Properties.LastMenstrualDate;
        List<Object> list = queryBuilder.where(fVar.ge(date), new org.greenrobot.greendao.query.m[0]).orderAsc(fVar).limit(1).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (PhysiologicalPeriod) list.get(0);
    }

    public PhysiologicalPeriod getPreviousPhysiologcalPeriod(Date date) {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = PhysiologicalPeriodDao.Properties.LastMenstrualDate;
        List<Object> list = queryBuilder.where(fVar.le(date), new org.greenrobot.greendao.query.m[0]).orderDesc(fVar).limit(1).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (PhysiologicalPeriod) list.get(0);
    }

    public long insert(PhysiologicalPeriod physiologicalPeriod) {
        if (isEmpty(physiologicalPeriod)) {
            return -1L;
        }
        Date lastMenstrualDate = physiologicalPeriod.getLastMenstrualDate();
        com.orhanobut.logger.f.d("lastMenstrualDate: " + lastMenstrualDate);
        PhysiologicalPeriod previousPhysiologcalPeriod = getPreviousPhysiologcalPeriod(lastMenstrualDate);
        if (previousPhysiologcalPeriod == null || !m.isSameDay(previousPhysiologcalPeriod.getLastMenstrualDate(), lastMenstrualDate)) {
            if (isSameCycle(physiologicalPeriod, previousPhysiologcalPeriod)) {
                com.orhanobut.logger.f.d("deleteAll previousPhysiologcalPeriod");
                delete(previousPhysiologcalPeriod);
            }
            PhysiologicalPeriod nextPhysiologcalPeriod = getNextPhysiologcalPeriod(lastMenstrualDate);
            if (isSameCycle(nextPhysiologcalPeriod, physiologicalPeriod)) {
                com.orhanobut.logger.f.d("deleteAll nextPhysiologcalPeriod");
                delete(nextPhysiologcalPeriod);
            }
        } else {
            com.orhanobut.logger.f.d("isSameDay : " + previousPhysiologcalPeriod.getId());
            physiologicalPeriod.setId(previousPhysiologcalPeriod.getId());
        }
        return insertPhysiologcalPeriod(physiologicalPeriod);
    }

    public boolean isEmpty(PhysiologicalPeriod physiologicalPeriod) {
        return physiologicalPeriod == null || physiologicalPeriod.getLastMenstrualDate() == null || physiologicalPeriod.getMenstrualPeriod() == null || physiologicalPeriod.getPhysiologicalPeriod() == null;
    }
}
