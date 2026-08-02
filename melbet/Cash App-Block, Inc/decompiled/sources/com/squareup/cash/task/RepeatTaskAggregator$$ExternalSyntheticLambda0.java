package com.squareup.cash.task;

import com.squareup.util.coroutines.Teardown;
import com.squareup.util.task.RepeatTask;
import com.squareup.util.task.RepeatTaskExecutor$repeatOn$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.StandaloneCoroutine;

/* loaded from: classes.dex */
public final /* synthetic */ class RepeatTaskAggregator$$ExternalSyntheticLambda0 implements Teardown {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ RepeatTaskAggregator$$ExternalSyntheticLambda0(RepeatTaskAggregator repeatTaskAggregator, ArrayList arrayList) {
        this.$r8$classId = 0;
        this.f$1 = arrayList;
    }

    @Override // com.squareup.util.coroutines.Teardown
    public final void teardown() {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        switch (i) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    StandaloneCoroutine standaloneCoroutine = ((RepeatTaskExecutor$repeatOn$1) ((RepeatTask) it.next())).job;
                    if (standaloneCoroutine != null) {
                        standaloneCoroutine.cancel(null);
                    }
                }
                break;
            case 1:
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    ((Teardown) it2.next()).teardown();
                }
                break;
            default:
                ((StandaloneCoroutine) obj).cancel(null);
                break;
        }
    }

    public /* synthetic */ RepeatTaskAggregator$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
    }
}
