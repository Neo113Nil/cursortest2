package com.chicken.road.cerman.fixs.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Repository.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001EB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00072\u0006\u0010\u001f\u001a\u00020 J\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b0\u00072\u0006\u0010\u001f\u001a\u00020 J\u001a\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\b0\u00072\u0006\u0010\u001f\u001a\u00020 J\u001a\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\b0\u00072\u0006\u0010\u001f\u001a\u00020 J\u001a\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\b0\u00072\u0006\u0010\u001f\u001a\u00020 J\u001a\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0\u00072\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010(J\u0016\u0010)\u001a\u00020*2\u0006\u0010'\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010(J\u0016\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010-J\u0016\u0010.\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010-J\u0016\u0010/\u001a\u00020 2\u0006\u00100\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u00101J\u0016\u00102\u001a\u00020*2\u0006\u00100\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u00101J\u0016\u00103\u001a\u00020 2\u0006\u00104\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u00105J\u0016\u00106\u001a\u00020*2\u0006\u00104\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u00105J\u0016\u00107\u001a\u00020 2\u0006\u00108\u001a\u00020\u001cH\u0086@¢\u0006\u0002\u00109J\u0016\u0010:\u001a\u00020*2\u0006\u00108\u001a\u00020\u001cH\u0086@¢\u0006\u0002\u00109J\u0016\u0010;\u001a\u00020 2\u0006\u0010<\u001a\u00020\u0019H\u0086@¢\u0006\u0002\u0010=J\u0016\u0010>\u001a\u00020*2\u0006\u0010<\u001a\u00020\u0019H\u0086@¢\u0006\u0002\u0010=J\u0016\u0010?\u001a\u00020*2\u0006\u0010<\u001a\u00020\u0019H\u0086@¢\u0006\u0002\u0010=J\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00190\bH\u0086@¢\u0006\u0002\u0010AR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000bR\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000bR\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000bR\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u0007¢\u0006\b\n\u0000\u001a\u0004\bD\u0010\u000b¨\u0006F"}, d2 = {"Lcom/chicken/road/cerman/fixs/data/Repository;", "", "db", "Lcom/chicken/road/cerman/fixs/data/AppDatabase;", "<init>", "(Lcom/chicken/road/cerman/fixs/data/AppDatabase;)V", "chickens", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/chicken/road/cerman/fixs/data/Chicken;", "getChickens", "()Lkotlinx/coroutines/flow/Flow;", "activeCount", "", "getActiveCount", "allFeed", "Lcom/chicken/road/cerman/fixs/data/FeedEntry;", "getAllFeed", "allEggs", "Lcom/chicken/road/cerman/fixs/data/EggLog;", "getAllEggs", "allSales", "Lcom/chicken/road/cerman/fixs/data/Sale;", "getAllSales", "allVaccinations", "Lcom/chicken/road/cerman/fixs/data/Vaccination;", "getAllVaccinations", "allWeights", "Lcom/chicken/road/cerman/fixs/data/WeightEntry;", "getAllWeights", "chicken", "id", "", "feedFor", "eggsFor", "salesFor", "weightFor", "vaccinationsFor", "upsertChicken", "c", "(Lcom/chicken/road/cerman/fixs/data/Chicken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteChicken", "", "addFeed", "f", "(Lcom/chicken/road/cerman/fixs/data/FeedEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFeed", "addEgg", "e", "(Lcom/chicken/road/cerman/fixs/data/EggLog;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteEgg", "addSale", "s", "(Lcom/chicken/road/cerman/fixs/data/Sale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSale", "addWeight", "w", "(Lcom/chicken/road/cerman/fixs/data/WeightEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteWeight", "addVaccination", "v", "(Lcom/chicken/road/cerman/fixs/data/Vaccination;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateVaccination", "deleteVaccination", "pendingVaccinations", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "farmSummary", "Lcom/chicken/road/cerman/fixs/data/Repository$FarmSummary;", "getFarmSummary", "FarmSummary", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Repository {
    public static final int $stable = 8;
    private final Flow<Integer> activeCount;
    private final Flow<List<EggLog>> allEggs;
    private final Flow<List<FeedEntry>> allFeed;
    private final Flow<List<Sale>> allSales;
    private final Flow<List<Vaccination>> allVaccinations;
    private final Flow<List<WeightEntry>> allWeights;
    private final Flow<List<Chicken>> chickens;
    private final AppDatabase db;
    private final Flow<FarmSummary> farmSummary;

    public Repository(AppDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        this.db = db;
        this.chickens = db.chickenDao().all();
        this.activeCount = db.chickenDao().activeCount();
        Flow<List<FeedEntry>> all = db.feedDao().all();
        this.allFeed = all;
        Flow<List<EggLog>> all2 = db.eggDao().all();
        this.allEggs = all2;
        Flow<List<Sale>> all3 = db.saleDao().all();
        this.allSales = all3;
        this.allVaccinations = db.vaccinationDao().all();
        this.allWeights = db.weightDao().all();
        this.farmSummary = FlowKt.combine(db.chickenDao().activeCount(), all2, all3, all, new Repository$farmSummary$1(null));
    }

    public final Flow<List<Chicken>> getChickens() {
        return this.chickens;
    }

    public final Flow<Integer> getActiveCount() {
        return this.activeCount;
    }

    public final Flow<List<FeedEntry>> getAllFeed() {
        return this.allFeed;
    }

    public final Flow<List<EggLog>> getAllEggs() {
        return this.allEggs;
    }

    public final Flow<List<Sale>> getAllSales() {
        return this.allSales;
    }

    public final Flow<List<Vaccination>> getAllVaccinations() {
        return this.allVaccinations;
    }

    public final Flow<List<WeightEntry>> getAllWeights() {
        return this.allWeights;
    }

    public final Flow<Chicken> chicken(long id) {
        return this.db.chickenDao().byId(id);
    }

    public final Flow<List<FeedEntry>> feedFor(long id) {
        return this.db.feedDao().forChicken(id);
    }

    public final Flow<List<EggLog>> eggsFor(long id) {
        return this.db.eggDao().forChicken(id);
    }

    public final Flow<List<Sale>> salesFor(long id) {
        return this.db.saleDao().forChicken(id);
    }

    public final Flow<List<WeightEntry>> weightFor(long id) {
        return this.db.weightDao().forChicken(id);
    }

    public final Flow<List<Vaccination>> vaccinationsFor(long id) {
        return this.db.vaccinationDao().forChicken(id);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object upsertChicken(Chicken chicken, Continuation<? super Long> continuation) {
        Repository$upsertChicken$1 repository$upsertChicken$1;
        int i;
        if (continuation instanceof Repository$upsertChicken$1) {
            repository$upsertChicken$1 = (Repository$upsertChicken$1) continuation;
            if ((repository$upsertChicken$1.label & Integer.MIN_VALUE) != 0) {
                repository$upsertChicken$1.label -= Integer.MIN_VALUE;
                Object obj = repository$upsertChicken$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = repository$upsertChicken$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    chicken = (Chicken) repository$upsertChicken$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxLong(chicken.getId());
                }
                ResultKt.throwOnFailure(obj);
                if (chicken.getId() == 0) {
                    ChickenDao chickenDao = this.db.chickenDao();
                    repository$upsertChicken$1.label = 1;
                    obj = chickenDao.insert(chicken, repository$upsertChicken$1);
                    return obj == coroutine_suspended ? coroutine_suspended : obj;
                }
                ChickenDao chickenDao2 = this.db.chickenDao();
                repository$upsertChicken$1.L$0 = chicken;
                repository$upsertChicken$1.label = 2;
                if (chickenDao2.update(chicken, repository$upsertChicken$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Boxing.boxLong(chicken.getId());
            }
        }
        repository$upsertChicken$1 = new Repository$upsertChicken$1(this, continuation);
        Object obj2 = repository$upsertChicken$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = repository$upsertChicken$1.label;
        if (i == 0) {
        }
    }

    public final Object deleteChicken(Chicken chicken, Continuation<? super Unit> continuation) {
        Object delete = this.db.chickenDao().delete(chicken, continuation);
        return delete == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? delete : Unit.INSTANCE;
    }

    public final Object addFeed(FeedEntry feedEntry, Continuation<? super Long> continuation) {
        return this.db.feedDao().insert(feedEntry, continuation);
    }

    public final Object deleteFeed(FeedEntry feedEntry, Continuation<? super Unit> continuation) {
        Object delete = this.db.feedDao().delete(feedEntry, continuation);
        return delete == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? delete : Unit.INSTANCE;
    }

    public final Object addEgg(EggLog eggLog, Continuation<? super Long> continuation) {
        return this.db.eggDao().insert(eggLog, continuation);
    }

    public final Object deleteEgg(EggLog eggLog, Continuation<? super Unit> continuation) {
        Object delete = this.db.eggDao().delete(eggLog, continuation);
        return delete == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? delete : Unit.INSTANCE;
    }

    public final Object addSale(Sale sale, Continuation<? super Long> continuation) {
        return this.db.saleDao().insert(sale, continuation);
    }

    public final Object deleteSale(Sale sale, Continuation<? super Unit> continuation) {
        Object delete = this.db.saleDao().delete(sale, continuation);
        return delete == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? delete : Unit.INSTANCE;
    }

    public final Object addWeight(WeightEntry weightEntry, Continuation<? super Long> continuation) {
        return this.db.weightDao().insert(weightEntry, continuation);
    }

    public final Object deleteWeight(WeightEntry weightEntry, Continuation<? super Unit> continuation) {
        Object delete = this.db.weightDao().delete(weightEntry, continuation);
        return delete == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? delete : Unit.INSTANCE;
    }

    public final Object addVaccination(Vaccination vaccination, Continuation<? super Long> continuation) {
        return this.db.vaccinationDao().insert(vaccination, continuation);
    }

    public final Object updateVaccination(Vaccination vaccination, Continuation<? super Unit> continuation) {
        Object update = this.db.vaccinationDao().update(vaccination, continuation);
        return update == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? update : Unit.INSTANCE;
    }

    public final Object deleteVaccination(Vaccination vaccination, Continuation<? super Unit> continuation) {
        Object delete = this.db.vaccinationDao().delete(vaccination, continuation);
        return delete == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? delete : Unit.INSTANCE;
    }

    public final Object pendingVaccinations(Continuation<? super List<Vaccination>> continuation) {
        return this.db.vaccinationDao().pending(continuation);
    }

    /* compiled from: Repository.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/chicken/road/cerman/fixs/data/Repository$FarmSummary;", "", "activeChickens", "", "eggsToday", "monthRevenue", "", "monthFeedCost", "totalProfit", "<init>", "(IIDDD)V", "getActiveChickens", "()I", "getEggsToday", "getMonthRevenue", "()D", "getMonthFeedCost", "getTotalProfit", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FarmSummary {
        public static final int $stable = 0;
        private final int activeChickens;
        private final int eggsToday;
        private final double monthFeedCost;
        private final double monthRevenue;
        private final double totalProfit;

        /* renamed from: component1, reason: from getter */
        public final int getActiveChickens() {
            return this.activeChickens;
        }

        /* renamed from: component2, reason: from getter */
        public final int getEggsToday() {
            return this.eggsToday;
        }

        /* renamed from: component3, reason: from getter */
        public final double getMonthRevenue() {
            return this.monthRevenue;
        }

        /* renamed from: component4, reason: from getter */
        public final double getMonthFeedCost() {
            return this.monthFeedCost;
        }

        /* renamed from: component5, reason: from getter */
        public final double getTotalProfit() {
            return this.totalProfit;
        }

        public final FarmSummary copy(int activeChickens, int eggsToday, double monthRevenue, double monthFeedCost, double totalProfit) {
            return new FarmSummary(activeChickens, eggsToday, monthRevenue, monthFeedCost, totalProfit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FarmSummary)) {
                return false;
            }
            FarmSummary farmSummary = (FarmSummary) other;
            return this.activeChickens == farmSummary.activeChickens && this.eggsToday == farmSummary.eggsToday && Double.compare(this.monthRevenue, farmSummary.monthRevenue) == 0 && Double.compare(this.monthFeedCost, farmSummary.monthFeedCost) == 0 && Double.compare(this.totalProfit, farmSummary.totalProfit) == 0;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.activeChickens) * 31) + Integer.hashCode(this.eggsToday)) * 31) + Double.hashCode(this.monthRevenue)) * 31) + Double.hashCode(this.monthFeedCost)) * 31) + Double.hashCode(this.totalProfit);
        }

        public String toString() {
            return "FarmSummary(activeChickens=" + this.activeChickens + ", eggsToday=" + this.eggsToday + ", monthRevenue=" + this.monthRevenue + ", monthFeedCost=" + this.monthFeedCost + ", totalProfit=" + this.totalProfit + ")";
        }

        public FarmSummary(int i, int i2, double d, double d2, double d3) {
            this.activeChickens = i;
            this.eggsToday = i2;
            this.monthRevenue = d;
            this.monthFeedCost = d2;
            this.totalProfit = d3;
        }

        public final int getActiveChickens() {
            return this.activeChickens;
        }

        public final int getEggsToday() {
            return this.eggsToday;
        }

        public final double getMonthRevenue() {
            return this.monthRevenue;
        }

        public final double getMonthFeedCost() {
            return this.monthFeedCost;
        }

        public final double getTotalProfit() {
            return this.totalProfit;
        }
    }

    public final Flow<FarmSummary> getFarmSummary() {
        return this.farmSummary;
    }
}
