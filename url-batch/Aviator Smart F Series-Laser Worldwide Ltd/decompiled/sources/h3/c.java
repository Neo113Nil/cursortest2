package h3;

import com.crrepa.band.my.health.weight.WeightHomeFragment;
import com.crrepa.band.my.health.weight.model.WeightChangeEvent;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.db.Weight;
import com.crrepa.band.my.model.db.proxy.WeightDaoProxy;
import com.crrepa.band.my.model.user.provider.UserHeightProvider;
import com.crrepa.band.my.model.user.provider.UserWeightProvider;
import com.crrepa.band.my.profile.userinfo.model.UserWeightChangeEvent;
import com.moyoung.dafit.module.common.baseui.f;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class c implements f {
    private Date currentDate;
    private j3.c view;
    private final WeightDaoProxy weightDaoProxy = new WeightDaoProxy();
    private List<Weight> weightList;

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
    }

    public void getChartData() {
        List<Weight> limitWeightList = this.weightDaoProxy.getLimitWeightList(7, this.currentDate);
        this.weightList = limitWeightList;
        List<Float> weightNumList = this.weightDaoProxy.getWeightNumList(limitWeightList, true);
        float[] maxMinWeightNum = this.weightDaoProxy.getMaxMinWeightNum(this.weightList);
        this.view.renderWeightChart(weightNumList, maxMinWeightNum[0], maxMinWeightNum[1]);
    }

    public void getTabLayout() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(WeightHomeFragment.newInstance(1, this.currentDate));
        arrayList.add(WeightHomeFragment.newInstance(2, this.currentDate));
        arrayList.add(WeightHomeFragment.newInstance(3, this.currentDate));
        this.view.showTabLayout(arrayList);
    }

    public void getWeightData() {
        Weight lastestWeight = this.weightDaoProxy.getLastestWeight(this.currentDate);
        if (lastestWeight == null) {
            this.view.showBmiData(0.0f);
            this.view.showWeightData(0.0f, this.currentDate);
        } else {
            this.view.showBmiData((float) (lastestWeight.getWeightKg().floatValue() / Math.pow((UserHeightProvider.getUserHeight(0) * 1.0f) / 100.0f, 2.0d)));
            this.view.showWeightData(UserWeightProvider.getCurrentWeight(lastestWeight), lastestWeight.getDate());
        }
    }

    public Date[] getWeightDateArray() {
        List<Date> weightDateList = this.weightDaoProxy.getWeightDateList(this.weightList);
        Date[] dateArr = new Date[weightDateList.size()];
        for (int i8 = 0; i8 < weightDateList.size(); i8++) {
            dateArr[i8] = weightDateList.get(i8);
        }
        return dateArr;
    }

    public void insertWeight(float f8) {
        com.orhanobut.logger.f.d("weight ==> add-weight : " + f8);
        Weight weight = new Weight();
        weight.setDate(new Date());
        weight.setShowWeight(true);
        this.weightDaoProxy.insert(weight);
        UserWeightProvider.setCurrentWeight(weight, f8);
        UserWeightProvider.saveLastSaveWeight(f8 + UserWeightProvider.getCurrentMinWeight());
        this.currentDate = weight.getDate();
        org.greenrobot.eventbus.c.getDefault().post(new WeightChangeEvent());
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setCurrentDate(Date date) {
        com.orhanobut.logger.f.d("weight ==> current-Date : " + date);
        this.currentDate = date;
    }

    public void setView(j3.c cVar) {
        this.view = cVar;
    }

    public void updateUserWeightInfo() {
        Weight lastestWeight;
        if (!this.weightDaoProxy.isChangedUserWeight() || (lastestWeight = this.weightDaoProxy.getLastestWeight(new Date())) == null) {
            return;
        }
        UserWeightProvider.setUserWeight(BandUnitSystemProvider.getUnitSystem(), UserWeightProvider.getCurrentWeight(lastestWeight) - UserWeightProvider.getCurrentMinWeight());
        org.greenrobot.eventbus.c.getDefault().post(new UserWeightChangeEvent());
    }
}
