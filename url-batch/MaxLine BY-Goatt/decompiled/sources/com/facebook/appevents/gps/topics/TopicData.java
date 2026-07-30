package com.facebook.appevents.gps.topics;

import defpackage.in1;
import defpackage.q40;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class TopicData {
    private final long modelVersion;
    private final long taxonomyVersion;
    private final int topicId;

    public TopicData(long j, long j2, int i) {
        this.taxonomyVersion = j;
        this.modelVersion = j2;
        this.topicId = i;
    }

    public static /* synthetic */ TopicData copy$default(TopicData topicData, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = topicData.taxonomyVersion;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = topicData.modelVersion;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = topicData.topicId;
        }
        return topicData.copy(j3, j4, i);
    }

    public final long component1() {
        return this.taxonomyVersion;
    }

    public final long component2() {
        return this.modelVersion;
    }

    public final int component3() {
        return this.topicId;
    }

    public final TopicData copy(long j, long j2, int i) {
        return new TopicData(j, j2, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopicData)) {
            return false;
        }
        TopicData topicData = (TopicData) obj;
        return this.taxonomyVersion == topicData.taxonomyVersion && this.modelVersion == topicData.modelVersion && this.topicId == topicData.topicId;
    }

    public final long getModelVersion() {
        return this.modelVersion;
    }

    public final long getTaxonomyVersion() {
        return this.taxonomyVersion;
    }

    public final int getTopicId() {
        return this.topicId;
    }

    public int hashCode() {
        return Integer.hashCode(this.topicId) + in1.h(Long.hashCode(this.taxonomyVersion) * 31, 31, this.modelVersion);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TopicData(taxonomyVersion=");
        sb.append(this.taxonomyVersion);
        sb.append(", modelVersion=");
        sb.append(this.modelVersion);
        sb.append(", topicId=");
        return q40.o(sb, this.topicId, ')');
    }
}
