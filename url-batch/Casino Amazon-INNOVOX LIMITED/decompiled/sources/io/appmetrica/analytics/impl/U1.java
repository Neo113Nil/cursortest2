package io.appmetrica.analytics.impl;

import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class U1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f1068a;
    public final C0642y2 b;
    public final List c;

    public U1(List list, C0642y2 c0642y2, List list2) {
        this.f1068a = list;
        this.b = c0642y2;
        this.c = list2;
    }

    public final String toString() {
        return "AppPermissionsState{mPermissionStateList=" + this.f1068a + ", mBackgroundRestrictionsState=" + this.b + ", mAvailableProviders=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}
