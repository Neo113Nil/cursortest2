package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcvr extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcvr(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcvr zza(Context context, View view, zzfir zzfirVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcvr zzcvrVar = new zzcvr(context);
        List list = zzfirVar.zzu;
        if (!list.isEmpty() && (resources = zzcvrVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzfis zzfisVar = (zzfis) list.get(0);
            zzcvrVar.setLayoutParams(new FrameLayout.LayoutParams((int) (zzfisVar.zza * displayMetrics.density), (int) (zzfisVar.zzb * displayMetrics.density)));
        }
        zzcvrVar.zzb = view;
        zzcvrVar.addView(view);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcev.zzb(zzcvrVar, zzcvrVar);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcev.zza(zzcvrVar, zzcvrVar);
        JSONObject jSONObject = zzfirVar.zzah;
        RelativeLayout relativeLayout = new RelativeLayout(zzcvrVar.zza);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzcvrVar.zzb(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcvrVar.zzb(optJSONObject2, relativeLayout, 12);
        }
        zzcvrVar.addView(relativeLayout);
        return zzcvrVar;
    }

    private final void zzb(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int zzc = zzc(jSONObject.optDouble("padding", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        textView.setPadding(0, zzc, 0, zzc);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzc(jSONObject.optDouble(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    private final int zzc(double d) {
        com.google.android.gms.ads.internal.client.zzbb.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzC(this.zza, (int) d);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }
}
