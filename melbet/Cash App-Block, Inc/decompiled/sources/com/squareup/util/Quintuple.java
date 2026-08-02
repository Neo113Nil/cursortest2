package com.squareup.util;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Quintuple {
    public final Object fifth;
    public final Object first;
    public final Object fourth;
    public final Object second;
    public final Object third;

    public Quintuple(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.first = obj;
        this.second = obj2;
        this.third = obj3;
        this.fourth = obj4;
        this.fifth = obj5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Quintuple)) {
            return false;
        }
        Quintuple quintuple = (Quintuple) obj;
        return Intrinsics.areEqual(this.first, quintuple.first) && Intrinsics.areEqual(this.second, quintuple.second) && Intrinsics.areEqual(this.third, quintuple.third) && Intrinsics.areEqual(this.fourth, quintuple.fourth) && Intrinsics.areEqual(this.fifth, quintuple.fifth);
    }

    public final int hashCode() {
        Object obj = this.first;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.second;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.third;
        int hashCode3 = (hashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.fourth;
        int hashCode4 = (hashCode3 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.fifth;
        return hashCode4 + (obj5 != null ? obj5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Quintuple(first=");
        sb.append(this.first);
        sb.append(", second=");
        sb.append(this.second);
        sb.append(", third=");
        sb.append(this.third);
        sb.append(", fourth=");
        sb.append(this.fourth);
        sb.append(", fifth=");
        return Recorder$$ExternalSyntheticOutline1.m(sb, this.fifth, ")");
    }
}
