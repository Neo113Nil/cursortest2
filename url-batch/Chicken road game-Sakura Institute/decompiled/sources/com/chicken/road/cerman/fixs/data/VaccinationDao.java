package com.chicken.road.cerman.fixs.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: Daos.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH'J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/chicken/road/cerman/fixs/data/VaccinationDao;", "", "all", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/chicken/road/cerman/fixs/data/Vaccination;", "forChicken", "chickenId", "", "pending", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "v", "(Lcom/chicken/road/cerman/fixs/data/Vaccination;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "", "delete", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface VaccinationDao {
    Flow<List<Vaccination>> all();

    Object delete(Vaccination vaccination, Continuation<? super Unit> continuation);

    Flow<List<Vaccination>> forChicken(long chickenId);

    Object insert(Vaccination vaccination, Continuation<? super Long> continuation);

    Object pending(Continuation<? super List<Vaccination>> continuation);

    Object update(Vaccination vaccination, Continuation<? super Unit> continuation);
}
