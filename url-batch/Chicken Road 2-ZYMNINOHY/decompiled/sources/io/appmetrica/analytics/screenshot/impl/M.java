package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes.dex */
public final class M implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Y f13423a;

    /* JADX WARN: Multi-variable type inference failed */
    public M() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S fromModel(J j4) {
        S s4 = new S();
        s4.f13438a = j4.f13418a;
        W w4 = j4.f13419b;
        s4.f13439b = w4 != null ? this.f13423a.fromModel(w4) : null;
        return s4;
    }

    public M(Y y4) {
        this.f13423a = y4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ M(Y y4, int i4, kotlin.jvm.internal.e eVar) {
        this(y4);
        if ((i4 & 1) != 0) {
            y4 = new Y(null, null, null, 7, null);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J toModel(S s4) {
        return new J(s4.f13438a, this.f13423a.toModel(s4.f13439b));
    }
}
