package com.chartboost.sdk.impl;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public class ao {
    HttpURLConnection a(ad<?> adVar) throws IOException {
        return (HttpURLConnection) new URL(adVar.f3700c).openConnection();
    }
}
