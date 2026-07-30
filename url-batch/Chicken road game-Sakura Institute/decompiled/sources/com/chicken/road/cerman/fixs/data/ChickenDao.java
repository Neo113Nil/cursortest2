package com.chicken.road.cerman.fixs.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: Daos.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0006\u0010\u0007\u001a\u00020\bH'J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H'¨\u0006\u0011"}, d2 = {"Lcom/chicken/road/cerman/fixs/data/ChickenDao;", "", "all", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/chicken/road/cerman/fixs/data/Chicken;", "byId", "id", "", "insert", "c", "(Lcom/chicken/road/cerman/fixs/data/Chicken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "", "delete", "activeCount", "", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ChickenDao {
    Flow<Integer> activeCount();

    Flow<List<Chicken>> all();

    Flow<Chicken> byId(long id);

    Object delete(Chicken chicken, Continuation<? super Unit> continuation);

    Object insert(Chicken chicken, Continuation<? super Long> continuation);

    Object update(Chicken chicken, Continuation<? super Unit> continuation);
}
