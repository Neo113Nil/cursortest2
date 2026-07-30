package com.chicken.road.cerman.fixs.data;

import androidx.compose.material3.internal.CalendarModelKt;
import com.chicken.road.cerman.fixs.Routes;
import com.chicken.road.cerman.fixs.data.Repository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;

/* compiled from: Repository.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\n"}, d2 = {"<anonymous>", "Lcom/chicken/road/cerman/fixs/data/Repository$FarmSummary;", "active", "", Routes.EGGS, "", "Lcom/chicken/road/cerman/fixs/data/EggLog;", "sales", "Lcom/chicken/road/cerman/fixs/data/Sale;", Routes.FEED, "Lcom/chicken/road/cerman/fixs/data/FeedEntry;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.chicken.road.cerman.fixs.data.Repository$farmSummary$1", f = "Repository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class Repository$farmSummary$1 extends SuspendLambda implements Function5<Integer, List<? extends EggLog>, List<? extends Sale>, List<? extends FeedEntry>, Continuation<? super Repository.FarmSummary>, Object> {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    Repository$farmSummary$1(Continuation<? super Repository$farmSummary$1> continuation) {
        super(5, continuation);
    }

    public final Object invoke(int i, List<EggLog> list, List<Sale> list2, List<FeedEntry> list3, Continuation<? super Repository.FarmSummary> continuation) {
        Repository$farmSummary$1 repository$farmSummary$1 = new Repository$farmSummary$1(continuation);
        repository$farmSummary$1.I$0 = i;
        repository$farmSummary$1.L$0 = list;
        repository$farmSummary$1.L$1 = list2;
        repository$farmSummary$1.L$2 = list3;
        return repository$farmSummary$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Object invoke(Integer num, List<? extends EggLog> list, List<? extends Sale> list2, List<? extends FeedEntry> list3, Continuation<? super Repository.FarmSummary> continuation) {
        return invoke(num.intValue(), (List<EggLog>) list, (List<Sale>) list2, (List<FeedEntry>) list3, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i = this.I$0;
        List list = (List) this.L$0;
        List list2 = (List) this.L$1;
        List list3 = (List) this.L$2;
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - (currentTimeMillis % CalendarModelKt.MillisecondsIn24Hours);
        long j2 = currentTimeMillis - 2592000000L;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((EggLog) obj2).getDate() >= j) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((EggLog) it.next()).getCount();
        }
        List list4 = list2;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list4) {
            if (((Sale) obj3).getDate() >= j2) {
                arrayList2.add(obj3);
            }
        }
        Iterator it2 = arrayList2.iterator();
        double d = 0.0d;
        while (it2.hasNext()) {
            d += ((Sale) it2.next()).getTotal();
        }
        List list5 = list3;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : list5) {
            if (((FeedEntry) obj4).getDate() >= j2) {
                arrayList3.add(obj4);
            }
        }
        Iterator it3 = arrayList3.iterator();
        double d2 = 0.0d;
        while (it3.hasNext()) {
            d2 += ((FeedEntry) it3.next()).getCost();
        }
        Iterator it4 = list4.iterator();
        double d3 = 0.0d;
        while (it4.hasNext()) {
            d3 += ((Sale) it4.next()).getTotal();
        }
        Iterator it5 = list5.iterator();
        double d4 = 0.0d;
        while (it5.hasNext()) {
            d4 += ((FeedEntry) it5.next()).getCost();
        }
        return new Repository.FarmSummary(i, i2, d, d2, d3 - (d4 + 0.0d));
    }
}
