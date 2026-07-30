package com.baidu.platform.a.b.a;

import com.baidu.ar.constants.HttpConstants;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.crrepa.band.my.model.storage.BaseParamNames;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class a extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = BaseParamNames.TOKEN)
    private String f8587a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(name = HttpConstants.SIGN)
    private String f8588b;

    public void setSign(String str) {
        this.f8588b = str;
    }

    public void setToken(String str) {
        this.f8587a = str;
    }
}
