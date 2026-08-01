package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1115bh<ModelType, StateType> {
    public final ModelType A02;
    public final StateType A03;
    public final String A04;
    public List<InterfaceC1117bj<ModelType, StateType>> A01 = null;
    public C1114bg A00 = C1114bg.A08;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bh != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public C1115bh(ModelType model, StateType state, String str) {
        this.A02 = model;
        this.A03 = state;
        this.A04 = str;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bh != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bj != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final C1115bh<ModelType, StateType> A05(InterfaceC1117bj<ModelType, StateType> interfaceC1117bj) {
        if (this.A01 == null) {
            this.A01 = new ArrayList();
        }
        this.A01.add(interfaceC1117bj);
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bh != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public final C1114bg<ModelType, StateType> A06() {
        return new C1114bg<>(this);
    }
}
