package com.bytedance.adsdk.lottie.Jd;

import androidx.browser.trusted.sharing.ShareTarget;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: DefaultLottieNetworkFetcher.java */
/* loaded from: classes.dex */
public class icD implements sUS {
    @Override // com.bytedance.adsdk.lottie.Jd.sUS
    public Jd pvs(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
        httpURLConnection.connect();
        return new pvs(httpURLConnection);
    }
}
