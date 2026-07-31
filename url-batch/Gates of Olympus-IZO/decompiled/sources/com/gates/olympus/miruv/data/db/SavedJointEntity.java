package com.gates.olympus.miruv.data.db;

import Z1.i;

/* loaded from: classes.dex */
public final class SavedJointEntity {
    public static final int $stable = 0;
    private final String jointId;
    private final long savedAt;

    public SavedJointEntity(String str, long j3) {
        i.f(str, "jointId");
        this.jointId = str;
        this.savedAt = j3;
    }

    public static /* synthetic */ SavedJointEntity copy$default(SavedJointEntity savedJointEntity, String str, long j3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = savedJointEntity.jointId;
        }
        if ((i3 & 2) != 0) {
            j3 = savedJointEntity.savedAt;
        }
        return savedJointEntity.copy(str, j3);
    }

    public final String component1() {
        return this.jointId;
    }

    public final long component2() {
        return this.savedAt;
    }

    public final SavedJointEntity copy(String str, long j3) {
        i.f(str, "jointId");
        return new SavedJointEntity(str, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedJointEntity)) {
            return false;
        }
        SavedJointEntity savedJointEntity = (SavedJointEntity) obj;
        return i.a(this.jointId, savedJointEntity.jointId) && this.savedAt == savedJointEntity.savedAt;
    }

    public final String getJointId() {
        return this.jointId;
    }

    public final long getSavedAt() {
        return this.savedAt;
    }

    public int hashCode() {
        return Long.hashCode(this.savedAt) + (this.jointId.hashCode() * 31);
    }

    public String toString() {
        return "SavedJointEntity(jointId=" + this.jointId + ", savedAt=" + this.savedAt + ")";
    }
}
