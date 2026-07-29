package com.mopub.nativeads;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.aiming.mdt.nativead.AdIconView;
import com.aiming.mdt.nativead.MediaView;
import com.aiming.mdt.utils.AdLog;
import com.mopub.common.VisibleForTesting;

/* loaded from: classes2.dex */
public class AdtStaticNativeViewHolder {

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    @VisibleForTesting
    private static final AdtStaticNativeViewHolder f1284 = new AdtStaticNativeViewHolder();

    /* renamed from: ʻ, reason: contains not printable characters */
    TextView f1285;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    ImageView f1286;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    View f1287;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    ImageView f1288;

    /* renamed from: ʼ, reason: contains not printable characters */
    TextView f1289;

    /* renamed from: ʼʽ, reason: contains not printable characters */
    MediaView f1290;

    /* renamed from: ʼʾ, reason: contains not printable characters */
    ImageView f1291;

    /* renamed from: ʽ, reason: contains not printable characters */
    TextView f1292;

    /* renamed from: ʾ, reason: contains not printable characters */
    AdIconView f1293;

    private AdtStaticNativeViewHolder() {
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    static AdtStaticNativeViewHolder m1350(View view, AdtViewBinder adtViewBinder) {
        AdtStaticNativeViewHolder adtStaticNativeViewHolder = new AdtStaticNativeViewHolder();
        adtStaticNativeViewHolder.f1287 = view;
        try {
            adtStaticNativeViewHolder.f1292 = (TextView) view.findViewById(adtViewBinder.f1294);
            adtStaticNativeViewHolder.f1289 = (TextView) view.findViewById(adtViewBinder.f1295);
            adtStaticNativeViewHolder.f1285 = (TextView) view.findViewById(adtViewBinder.f1297);
            adtStaticNativeViewHolder.f1286 = (ImageView) view.findViewById(adtViewBinder.f1299);
            adtStaticNativeViewHolder.f1291 = (ImageView) view.findViewById(adtViewBinder.f1296);
            adtStaticNativeViewHolder.f1288 = (ImageView) view.findViewById(adtViewBinder.f1300);
            adtStaticNativeViewHolder.f1290 = (MediaView) view.findViewById(adtViewBinder.f1301);
            adtStaticNativeViewHolder.f1293 = (AdIconView) view.findViewById(adtViewBinder.f1303);
            return adtStaticNativeViewHolder;
        } catch (ClassCastException e) {
            AdLog.getSingleton().LogD("Could not cast from id in ViewBinder to expected View type", e);
            return f1284;
        }
    }
}
