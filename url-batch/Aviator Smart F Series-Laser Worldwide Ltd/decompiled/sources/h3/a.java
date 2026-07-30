package h3;

import com.crrepa.band.my.health.weight.model.WeightChangeEvent;
import com.crrepa.band.my.model.db.Weight;
import com.crrepa.band.my.model.db.proxy.WeightDaoProxy;
import com.moyoung.dafit.module.common.baseui.f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class a implements f {
    private j3.a view;
    private final WeightDaoProxy weightDaoProxy = new WeightDaoProxy();
    private List<Weight> weightHistoryList = new ArrayList();

    public void deleteWeight(Weight weight) {
        this.weightDaoProxy.delete(weight);
        org.greenrobot.eventbus.c.getDefault().post(new WeightChangeEvent(false));
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
    }

    public void getAllWeightHistoryList() {
        List<Weight> allWeightList = this.weightDaoProxy.getAllWeightList();
        this.weightHistoryList = allWeightList;
        this.view.renderWeightRecords(allWeightList);
    }

    public int getHistoryListSize() {
        return this.weightHistoryList.size();
    }

    public Weight getWeightByPosition(int i8) {
        if (i8 < this.weightHistoryList.size()) {
            return this.weightHistoryList.get(i8);
        }
        return null;
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(j3.a aVar) {
        this.view = aVar;
    }
}
