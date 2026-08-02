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
    public final /* synthetic */ String f6877a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ck f6878b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ me f6879c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hj f6880d;

    public ej(hj hjVar, String str, ck ckVar, me meVar) {
        this.f6880d = hjVar;
        this.f6877a = str;
        this.f6878b = ckVar;
        this.f6879c = meVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hj hjVar = this.f6880d;
        Context context = hjVar.f7066b;
        String str = this.f6877a;
        ck ckVar = this.f6878b;
        me meVar = this.f6879c;
        if (hjVar.f7065a == null) {
            LinkedList linkedList = (LinkedList) e7.a(context, (String) null, "StartIoCachedAds");
            hjVar.f7065a = linkedList;
            if (linkedList == null) {
                hjVar.f7065a = new LinkedList();
            }
            if (hjVar.a(AdsCommonMetaData.k().F().c())) {
                e7.a(context, hjVar.f7065a);
            }
        }
        try {
            URL url = new URL(str);
            WeakHashMap weakHashMap = si.f7575a;
            String d4 = si.d(url.getHost() + url.getPath());
            new dk(context, url, d4, new fj(hjVar, ckVar, new CachedVideoAd(d4), context), new gj(meVar)).a();
        } catch (MalformedURLException e4) {
            if (ckVar != null) {
                ckVar.a(null);
            }
            d9.a(e4);
        }
    }
}
