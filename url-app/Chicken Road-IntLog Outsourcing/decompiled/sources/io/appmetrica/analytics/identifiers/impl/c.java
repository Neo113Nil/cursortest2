package io.appmetrica.analytics.identifiers.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final IdentifierStatus f6362a;

    /* renamed from: b, reason: collision with root package name */
    public final a f6363b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6364c;

    public c(IdentifierStatus identifierStatus, a aVar, String str) {
        this.f6362a = identifierStatus;
        this.f6363b = aVar;
        this.f6364c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f6362a == cVar.f6362a && kotlin.jvm.internal.i.a(this.f6363b, cVar.f6363b) && kotlin.jvm.internal.i.a(this.f6364c, cVar.f6364c);
    }

    public final int hashCode() {
        int hashCode = this.f6362a.hashCode() * 31;
        a aVar = this.f6363b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f6364c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdvIdResult(status=");
        sb.append(this.f6362a);
        sb.append(", advIdInfo=");
        sb.append(this.f6363b);
        sb.append(", errorExplanation=");
        return B0.o.l(sb, this.f6364c, ')');
    }

    public /* synthetic */ c(IdentifierStatus identifierStatus, a aVar, String str, int i2) {
        this(identifierStatus, (i2 & 2) != 0 ? null : aVar, (i2 & 4) != 0 ? null : str);
    }
}
