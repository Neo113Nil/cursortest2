package io.appmetrica.analytics.networkokhttp.impl;

import G3.y;
import G3.z;
import kotlin.jvm.internal.j;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class b extends j implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f13280a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(y yVar) {
        super(0);
        this.f13280a = yVar;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        z zVar = this.f13280a.f1039g;
        if (zVar != null) {
            return zVar.b().r();
        }
        return null;
    }
}
