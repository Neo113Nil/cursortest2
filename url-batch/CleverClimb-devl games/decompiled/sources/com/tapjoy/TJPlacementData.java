package com.tapjoy;

import com.tapjoy.internal.jr;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class TJPlacementData implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f7716a;

    /* renamed from: b, reason: collision with root package name */
    private String f7717b;

    /* renamed from: c, reason: collision with root package name */
    private String f7718c;

    /* renamed from: d, reason: collision with root package name */
    private String f7719d;
    private String e;
    private String f;
    private int g;
    private String h;
    private String i;
    private int j;
    private boolean k;
    private String l;
    private boolean m;
    private String n;
    private String o;
    private boolean p;
    private boolean q;

    public TJPlacementData(String str, String str2) {
        this.p = true;
        this.q = false;
        setKey(str);
        updateUrl(str2);
        setPlacementType(TapjoyConstants.TJC_APP_PLACEMENT);
    }

    public TJPlacementData(String str, String str2, String str3) {
        this.p = true;
        this.q = false;
        setBaseURL(str);
        setHttpResponse(str2);
        this.n = str3;
        this.p = false;
        setPlacementType(TapjoyConstants.TJC_APP_PLACEMENT);
    }

    public void resetPlacementRequestData() {
        setHttpResponse(null);
        setHttpStatusCode(0);
        setRedirectURL(null);
        setHasProgressSpinner(false);
        setPrerenderingRequested(false);
        setPreloadDisabled(false);
        setContentViewId(null);
    }

    public String getCallbackID() {
        return this.n;
    }

    public boolean isBaseActivity() {
        return this.p;
    }

    public void setKey(String str) {
        this.f7716a = str;
    }

    public void setBaseURL(String str) {
        this.f7718c = str;
    }

    public void setMediationURL(String str) {
        this.f7719d = str;
    }

    public void setAuctionMediationURL(String str) {
        this.e = str;
    }

    public void setHttpResponse(String str) {
        this.f = str;
    }

    public void setHttpStatusCode(int i) {
        this.g = i;
    }

    public void setPlacementName(String str) {
        this.h = str;
    }

    public void setPlacementType(String str) {
        this.i = str;
    }

    public void setViewType(int i) {
        this.j = i;
    }

    public void setRedirectURL(String str) {
        this.l = str;
    }

    public void setHasProgressSpinner(boolean z) {
        this.k = z;
    }

    public void setContentViewId(String str) {
        this.o = str;
    }

    public String getUrl() {
        return this.f7717b;
    }

    public String getKey() {
        return this.f7716a;
    }

    public String getBaseURL() {
        return this.f7718c;
    }

    public String getMediationURL() {
        return this.f7719d;
    }

    public String getAuctionMediationURL() {
        return this.e;
    }

    public String getHttpResponse() {
        return this.f;
    }

    public int getHttpStatusCode() {
        return this.g;
    }

    public String getPlacementName() {
        return this.h;
    }

    public String getPlacementType() {
        return this.i;
    }

    public int getViewType() {
        return this.j;
    }

    public String getRedirectURL() {
        return this.l;
    }

    public String getContentViewId() {
        return this.o;
    }

    public boolean hasProgressSpinner() {
        return this.k;
    }

    public void setPreloadDisabled(boolean z) {
        this.q = z;
    }

    public boolean isPreloadDisabled() {
        return this.q;
    }

    public boolean isPrerenderingRequested() {
        return this.m;
    }

    public void setPrerenderingRequested(boolean z) {
        this.m = z;
    }

    public void updateUrl(String str) {
        this.f7717b = str;
        if (jr.c(str)) {
            return;
        }
        setBaseURL(str.substring(0, str.indexOf(47, str.indexOf("//") + 3)));
    }
}
