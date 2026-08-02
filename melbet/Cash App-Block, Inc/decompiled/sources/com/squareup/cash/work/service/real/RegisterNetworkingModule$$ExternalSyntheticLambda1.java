package com.squareup.cash.work.service.real;

import kotlin.Lazy;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* loaded from: classes4.dex */
public final /* synthetic */ class RegisterNetworkingModule$$ExternalSyntheticLambda1 implements Call.Factory {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Lazy f$0;

    public /* synthetic */ RegisterNetworkingModule$$ExternalSyntheticLambda1(Lazy lazy, int i) {
        this.$r8$classId = i;
        this.f$0 = lazy;
    }

    @Override // okhttp3.Call.Factory
    public final Call newCall(Request request) {
        int i = this.$r8$classId;
        Lazy lazy = this.f$0;
        switch (i) {
            case 0:
                request.getClass();
                break;
            default:
                request.getClass();
                break;
        }
        return ((OkHttpClient) lazy.getValue()).newCall(request);
    }
}
