package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class M implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Y f1710a;

    /* JADX WARN: Multi-variable type inference failed */
    public M() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S fromModel(J j) {
        S s = new S();
        s.f1715a = j.f1707a;
        W w = j.b;
        s.b = w != null ? this.f1710a.fromModel(w) : null;
        return s;
    }

    public M(Y y) {
        this.f1710a = y;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ M(Y y, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(y);
        if ((i & 1) != 0) {
            y = new Y(null, null, null, 7, null);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J toModel(S s) {
        return new J(s.f1715a, this.f1710a.toModel(s.b));
    }
}
