package com.squareup.cash.work.data.api;

import com.squareup.cash.work.tinygraph.models.Job;
import com.squareup.cash.work.tinygraph.models.MembershipWage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AssignedJob {
    public final Job job;
    public final MembershipWage wage;

    public AssignedJob(Job job, MembershipWage membershipWage) {
        this.job = job;
        this.wage = membershipWage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AssignedJob) {
            AssignedJob assignedJob = (AssignedJob) obj;
            if (this.job == assignedJob.job && Intrinsics.areEqual(this.wage, assignedJob.wage)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.job.hashCode() * 31;
        MembershipWage membershipWage = this.wage;
        return hashCode + (membershipWage == null ? 0 : membershipWage.hashCode());
    }

    public final String toString() {
        return "AssignedJob(job=" + this.job + ", wage=" + this.wage + ")";
    }
}
