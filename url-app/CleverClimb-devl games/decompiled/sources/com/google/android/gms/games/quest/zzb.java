package com.google.android.gms.games.quest;

import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.zzh;

/* loaded from: classes.dex */
public final class zzb extends DataBufferRef implements Milestone {
    zzb(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(Object obj) {
        return MilestoneEntity.zza(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ Milestone freeze() {
        return new MilestoneEntity(this);
    }

    @Override // com.google.android.gms.games.quest.Milestone
    public final byte[] getCompletionRewardData() {
        return getByteArray("completion_reward_data");
    }

    @Override // com.google.android.gms.games.quest.Milestone
    public final long getCurrentProgress() {
        long j;
        long j2 = 0;
        switch (getState()) {
            case 1:
            default:
                j = 0;
                break;
            case 2:
                j = getLong("current_value");
                if (getLong("quest_state") != 6) {
                    j -= getLong("initial_value");
                    break;
                }
                break;
            case 3:
            case 4:
                j = getTargetProgress();
                break;
        }
        if (j < 0) {
            zzh.e("MilestoneRef", "Current progress should never be negative");
        } else {
            j2 = j;
        }
        if (j2 <= getTargetProgress()) {
            return j2;
        }
        zzh.e("MilestoneRef", "Current progress should never exceed target progress");
        return getTargetProgress();
    }

    @Override // com.google.android.gms.games.quest.Milestone
    public final String getEventId() {
        return getString("external_event_id");
    }

    @Override // com.google.android.gms.games.quest.Milestone
    public final String getMilestoneId() {
        return getString("external_milestone_id");
    }

    @Override // com.google.android.gms.games.quest.Milestone
    public final int getState() {
        return getInteger("milestone_state");
    }

    @Override // com.google.android.gms.games.quest.Milestone
    public final long getTargetProgress() {
        return getLong("target_value");
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return MilestoneEntity.zza(this);
    }

    public final String toString() {
        return MilestoneEntity.zzb(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ((MilestoneEntity) ((Milestone) freeze())).writeToParcel(parcel, i);
    }
}
