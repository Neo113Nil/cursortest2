package io.appmetrica.analytics.identifiers.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final IdentifierStatus f5595a;

    /* renamed from: b, reason: collision with root package name */
    public final a f5596b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5597c;

    public c(IdentifierStatus identifierStatus, a aVar, String str) {
        this.f5595a = identifierStatus;
        this.f5596b = aVar;
        this.f5597c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f5595a == cVar.f5595a && kotlin.jvm.internal.j.a(this.f5596b, cVar.f5596b) && kotlin.jvm.internal.j.a(this.f5597c, cVar.f5597c);
    }

    public final int hashCode() {
        int hashCode = this.f5595a.hashCode() * 31;
        a aVar = this.f5596b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f5597c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdResult(status=" + this.f5595a + ", advIdInfo=" + this.f5596b + ", errorExplanation=" + this.f5597c + ')';
    }

    public /* synthetic */ c(IdentifierStatus identifierStatus, a aVar, String str, int i3) {
        this(identifierStatus, (i3 & 2) != 0 ? null : aVar, (i3 & 4) != 0 ? null : str);
    }
}
