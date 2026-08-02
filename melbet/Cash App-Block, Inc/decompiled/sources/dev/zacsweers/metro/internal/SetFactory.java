package dev.zacsweers.metro.internal;

import com.squareup.cash.work.tinygraph.job.JobDao;
import com.squareup.cash.work.tinygraph.real.RealMerchantRepository;
import com.squareup.cash.work.tinygraph.real.RealPersonRepository;
import com.squareup.cash.work.tinygraph.real.RealSettingRepository;
import com.squareup.cash.work.tinygraph.setting.SettingDao;
import dev.chrisbanes.haze.Pool;
import dev.zacsweers.metro.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.builders.SetBuilder;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class SetFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Object collectionProviders;
    public final Object individualProviders;

    public /* synthetic */ SetFactory(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.individualProviders = obj;
        this.collectionProviders = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.collectionProviders;
        Object obj2 = this.individualProviders;
        switch (i) {
            case 0:
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    CollectionsKt__MutableCollectionsKt.addAll((Iterable) ((Provider) it.next()).invoke(), arrayList);
                }
                SetBuilder setBuilder = new SetBuilder(arrayList.size() + list.size());
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    setBuilder.add(((Provider) it2.next()).invoke());
                }
                setBuilder.addAll(arrayList);
                return SetsKt__SetsJVMKt.build(setBuilder);
            case 1:
                Pool pool = (Pool) ((JobDao.MetroFactory) obj2).invoke();
                Flow flow = (Flow) ((Provider) obj).invoke();
                flow.getClass();
                return new RealMerchantRepository(pool, flow);
            case 2:
                JobDao jobDao = (JobDao) ((JobDao.MetroFactory) obj2).invoke();
                Flow flow2 = (Flow) ((Provider) obj).invoke();
                flow2.getClass();
                return new RealPersonRepository(jobDao, flow2);
            default:
                SettingDao settingDao = (SettingDao) ((JobDao.MetroFactory) obj2).invoke();
                Flow flow3 = (Flow) ((Provider) obj).invoke();
                flow3.getClass();
                return new RealSettingRepository(settingDao, flow3);
        }
    }
}
