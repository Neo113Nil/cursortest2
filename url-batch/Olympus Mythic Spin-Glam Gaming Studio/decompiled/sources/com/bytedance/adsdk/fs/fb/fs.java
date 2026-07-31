package com.bytedance.adsdk.fs.fb;

import com.ironsource.C4701ic;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes6.dex */
public class fs implements hhw {
    @Override // com.bytedance.adsdk.fs.fb.hhw
    public fb zmn(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(C4701ic.a);
        httpURLConnection.connect();
        return new zmn(httpURLConnection);
    }
}
