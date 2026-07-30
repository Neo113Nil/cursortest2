package com.baidu.mapapi.search.batch.geocode;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ReverseGeoCodeResponse extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "status")
    private Integer f6690a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(name = NotificationCompat.CATEGORY_MESSAGE)
    private String f6691b;

    /* renamed from: c, reason: collision with root package name */
    @Properties(name = "error message")
    private String f6692c;

    /* renamed from: d, reason: collision with root package name */
    @Properties(name = "result")
    private ReverseGeoCodeResult f6693d;

    public String getMessage() {
        return TextUtils.isEmpty(this.f6692c) ? this.f6691b : this.f6692c;
    }

    public ReverseGeoCodeResult getResult() {
        return this.f6693d;
    }

    public int getStatus() {
        return this.f6690a.intValue();
    }

    public void setMessage(String str) {
        this.f6691b = str;
    }

    public void setResult(ReverseGeoCodeResult reverseGeoCodeResult) {
        this.f6693d = reverseGeoCodeResult;
    }

    public void setStatus(Integer num) {
        this.f6690a = num;
    }
}
