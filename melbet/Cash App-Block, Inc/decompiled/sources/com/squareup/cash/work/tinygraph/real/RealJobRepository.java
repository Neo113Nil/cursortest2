package com.squareup.cash.work.tinygraph.real;

import androidx.credentials.Credential;
import com.squareup.cash.work.tinygraph.job.JobDao;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final class RealJobRepository extends Credential {
    public final JobDao dao;

    public RealJobRepository(JobDao jobDao, Flow flow) {
        super(flow);
        this.dao = jobDao;
    }
}
