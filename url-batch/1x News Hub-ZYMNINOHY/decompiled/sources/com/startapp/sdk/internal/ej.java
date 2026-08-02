package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.cache.CachedVideoAd;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ej implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ck f3763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ me f3764c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hj f3765d;

    public ej(hj hjVar, String str, ck ckVar, me meVar) {
        this.f3765d = hjVar;
        this.f3762a = str;
        this.f3763b = ckVar;
        this.f3764c = meVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hj hjVar = this.f3765d;
        Context context = hjVar.f3941b;
        String str = this.f3762a;
        ck ckVar = this.f3763b;
        me meVar = this.f3764c;
        if (hjVar.f3940a == null) {
            LinkedList linkedList = (LinkedList) e7.a(context, (String) null, "StartIoCachedAds");
            hjVar.f3940a = linkedList;
            if (linkedList == null) {
                hjVar.f3940a = new LinkedList();
            }
            if (hjVar.a(AdsCommonMetaData.k().F().c())) {
                e7.a(context, hjVar.f3940a);
            }
        }
        try {
            URL url = new URL(str);
            WeakHashMap weakHashMap = si.f4438a;
            String d3 = si.d(url.getHost() + url.getPath());
            new dk(context, url, d3, new fj(hjVar, ckVar, new CachedVideoAd(d3), context), new gj(meVar)).a();
        } catch (MalformedURLException e3) {
            if (ckVar != null) {
                ckVar.a(null);
            }
            d9.a(e3);
        }
    }
}
