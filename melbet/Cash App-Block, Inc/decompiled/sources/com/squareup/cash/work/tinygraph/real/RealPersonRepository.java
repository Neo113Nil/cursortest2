package com.squareup.cash.work.tinygraph.real;

import androidx.credentials.Credential;
import androidx.glance.session.SessionWorker$doWork$2$1;
import com.squareup.cash.work.tinygraph.BaseRepositoryKt;
import com.squareup.cash.work.tinygraph.job.JobDao;
import com.squareup.cash.work.tinygraph.models.Person;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import xyz.block.genie.state.StateBindingsKt$$ExternalSyntheticLambda0;

/* loaded from: classes7.dex */
public final class RealPersonRepository extends Credential {
    public final JobDao dao;

    public RealPersonRepository(JobDao jobDao, Flow flow) {
        super(flow);
        this.dao = jobDao;
    }

    public final Flow getById(String str) {
        str.getClass();
        Continuation continuation = null;
        int i = 10;
        SessionWorker$doWork$2$1 sessionWorker$doWork$2$1 = new SessionWorker$doWork$2$1(this, str, continuation, i);
        return new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new WorkerWorkflow$render$1(sessionWorker$doWork$2$1, continuation, 11), new RealJobRepository$getById$$inlined$getEntity$1(BaseRepositoryKt.events((Flow) this.data, new StateBindingsKt$$ExternalSyntheticLambda0(str, i), Reflection.factory.getOrCreateKotlinClass(Person.class)), 4));
    }
}
