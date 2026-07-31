package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class m7 {
    public final qh a;
    public final List b;
    public final String c;
    public final Mediation d;

    public m7(qh eventData, List pendingTrackers, String str, Mediation mediation) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        Intrinsics.checkNotNullParameter(pendingTrackers, "pendingTrackers");
        this.a = eventData;
        this.b = pendingTrackers;
        this.c = str;
        this.d = mediation;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7)) {
            return false;
        }
        m7 m7Var = (m7) obj;
        return Intrinsics.areEqual(this.a, m7Var.a) && Intrinsics.areEqual(this.b, m7Var.b) && Intrinsics.areEqual(this.c, m7Var.c) && Intrinsics.areEqual(this.d, m7Var.d);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Mediation mediation = this.d;
        return hashCode2 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        return "EventProcessingRequest(eventData=" + this.a + ", pendingTrackers=" + this.b + ", eventTypeName=" + this.c + ", mediation=" + this.d + ")";
    }

    public final qh a() {
        return this.a;
    }

    public final List d() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final Mediation c() {
        return this.d;
    }
}
