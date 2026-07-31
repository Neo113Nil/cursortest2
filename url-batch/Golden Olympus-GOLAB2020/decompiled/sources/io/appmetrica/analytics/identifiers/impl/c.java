package io.appmetrica.analytics.identifiers.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final IdentifierStatus f37123a;

    /* renamed from: b, reason: collision with root package name */
    public final a f37124b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37125c;

    public c(IdentifierStatus identifierStatus, a aVar, String str) {
        this.f37123a = identifierStatus;
        this.f37124b = aVar;
        this.f37125c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f37123a == cVar.f37123a && Intrinsics.areEqual(this.f37124b, cVar.f37124b) && Intrinsics.areEqual(this.f37125c, cVar.f37125c);
    }

    public final int hashCode() {
        int hashCode = this.f37123a.hashCode() * 31;
        a aVar = this.f37124b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f37125c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdResult(status=" + this.f37123a + ", advIdInfo=" + this.f37124b + ", errorExplanation=" + this.f37125c + ')';
    }

    public /* synthetic */ c(IdentifierStatus identifierStatus, a aVar, String str, int i4) {
        this(identifierStatus, (i4 & 2) != 0 ? null : aVar, (i4 & 4) != 0 ? null : str);
    }
}
