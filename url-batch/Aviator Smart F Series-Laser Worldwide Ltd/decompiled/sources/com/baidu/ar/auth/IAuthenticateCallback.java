package com.baidu.ar.auth;

import java.util.List;

/* loaded from: classes.dex */
public interface IAuthenticateCallback {
    void onAvailFeaturesChanged(List<Integer> list);

    void onFeatureRejected(int i8);

    void onResult(boolean z7, List<Integer> list);
}
