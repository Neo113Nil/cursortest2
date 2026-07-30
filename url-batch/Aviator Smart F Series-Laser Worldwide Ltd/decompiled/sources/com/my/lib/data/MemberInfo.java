package com.my.lib.data;

/* loaded from: classes4.dex */
public final class MemberInfo {
    private final int availableNum;
    private final int freeDay;
    private final int level;

    public MemberInfo(int i8, int i9, int i10) {
        this.level = i8;
        this.availableNum = i9;
        this.freeDay = i10;
    }

    public static /* synthetic */ MemberInfo copy$default(MemberInfo memberInfo, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i8 = memberInfo.level;
        }
        if ((i11 & 2) != 0) {
            i9 = memberInfo.availableNum;
        }
        if ((i11 & 4) != 0) {
            i10 = memberInfo.freeDay;
        }
        return memberInfo.copy(i8, i9, i10);
    }

    public final int component1() {
        return this.level;
    }

    public final int component2() {
        return this.availableNum;
    }

    public final int component3() {
        return this.freeDay;
    }

    public final MemberInfo copy(int i8, int i9, int i10) {
        return new MemberInfo(i8, i9, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemberInfo)) {
            return false;
        }
        MemberInfo memberInfo = (MemberInfo) obj;
        return this.level == memberInfo.level && this.availableNum == memberInfo.availableNum && this.freeDay == memberInfo.freeDay;
    }

    public final int getAvailableNum() {
        return this.availableNum;
    }

    public final int getFreeDay() {
        return this.freeDay;
    }

    public final int getLevel() {
        return this.level;
    }

    public int hashCode() {
        return this.freeDay + ((this.availableNum + (this.level * 31)) * 31);
    }

    public String toString() {
        return "MemberInfo(level=" + this.level + ", availableNum=" + this.availableNum + ", freeDay=" + this.freeDay + ")";
    }
}
