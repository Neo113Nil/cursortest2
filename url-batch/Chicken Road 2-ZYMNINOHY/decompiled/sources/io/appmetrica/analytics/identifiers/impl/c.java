package io.appmetrica.analytics.identifiers.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final IdentifierStatus f9855a;

    /* renamed from: b, reason: collision with root package name */
    public final a f9856b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9857c;

    public c(IdentifierStatus identifierStatus, a aVar, String str) {
        this.f9855a = identifierStatus;
        this.f9856b = aVar;
        this.f9857c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f9855a == cVar.f9855a && kotlin.jvm.internal.i.a(this.f9856b, cVar.f9856b) && kotlin.jvm.internal.i.a(this.f9857c, cVar.f9857c);
    }

    public final int hashCode() {
        int hashCode = this.f9855a.hashCode() * 31;
        a aVar = this.f9856b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f9857c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdResult(status=" + this.f9855a + ", advIdInfo=" + this.f9856b + ", errorExplanation=" + this.f9857c + ')';
    }

    public /* synthetic */ c(IdentifierStatus identifierStatus, a aVar, String str, int i4) {
        this(identifierStatus, (i4 & 2) != 0 ? null : aVar, (i4 & 4) != 0 ? null : str);
    }
}
