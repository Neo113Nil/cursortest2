package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ih2 implements ij2<jh2> {

    /* renamed from: a, reason: collision with root package name */
    private final dc3 f6651a;

    /* renamed from: b, reason: collision with root package name */
    private final ks2 f6652b;

    /* renamed from: c, reason: collision with root package name */
    private final PackageInfo f6653c;

    /* renamed from: d, reason: collision with root package name */
    private final a3.t1 f6654d;

    public ih2(dc3 dc3Var, ks2 ks2Var, PackageInfo packageInfo, a3.t1 t1Var) {
        this.f6651a = dc3Var;
        this.f6652b = ks2Var;
        this.f6653c = packageInfo;
        this.f6654d = t1Var;
    }

    public static /* synthetic */ jh2 b(final ih2 ih2Var) {
        final ArrayList<String> arrayList = ih2Var.f6652b.f7621g;
        return arrayList == null ? new jh2() { // from class: com.google.android.gms.internal.ads.fh2
            @Override // com.google.android.gms.internal.ads.hj2
            public final void c(Bundle bundle) {
            }
        } : arrayList.isEmpty() ? new jh2() { // from class: com.google.android.gms.internal.ads.gh2
            @Override // com.google.android.gms.internal.ads.hj2
            public final void c(Bundle bundle) {
                bundle.putInt("native_version", 0);
            }
        } : new jh2() { // from class: com.google.android.gms.internal.ads.eh2
            @Override // com.google.android.gms.internal.ads.hj2
            public final void c(Bundle bundle) {
                ih2.this.c(arrayList, bundle);
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<jh2> a() {
        return this.f6651a.E(new Callable() { // from class: com.google.android.gms.internal.ads.hh2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ih2.b(ih2.this);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e2, code lost:
    
        if (r9 == 3) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ void c(ArrayList arrayList, Bundle bundle) {
        JSONArray optJSONArray;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", this.f6652b.f7622h);
        String str = "landscape";
        if (this.f6652b.f7623i.f3202f > 3) {
            bundle.putBoolean("enable_native_media_orientation", true);
            int i7 = this.f6652b.f7623i.f3209m;
            String str2 = i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "unknown" : "square" : "portrait" : "landscape" : "any";
            if (!"unknown".equals(str2)) {
                bundle.putString("native_media_orientation", str2);
            }
        }
        int i8 = this.f6652b.f7623i.f3204h;
        if (i8 == 0) {
            str = "any";
        } else if (i8 == 1) {
            str = "portrait";
        } else if (i8 != 2) {
            str = "unknown";
        }
        if (!"unknown".equals(str)) {
            bundle.putString("native_image_orientation", str);
        }
        bundle.putBoolean("native_multiple_images", this.f6652b.f7623i.f3205i);
        bundle.putBoolean("use_custom_mute", this.f6652b.f7623i.f3208l);
        PackageInfo packageInfo = this.f6653c;
        int i9 = packageInfo == null ? 0 : packageInfo.versionCode;
        if (i9 > this.f6654d.zza()) {
            this.f6654d.r();
            this.f6654d.b0(i9);
        }
        JSONObject m7 = this.f6654d.m();
        String str3 = null;
        if (m7 != null && (optJSONArray = m7.optJSONArray(this.f6652b.f7620f)) != null) {
            str3 = optJSONArray.toString();
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString("native_advanced_settings", str3);
        }
        int i10 = this.f6652b.f7625k;
        if (i10 > 1) {
            bundle.putInt("max_num_ads", i10);
        }
        r90 r90Var = this.f6652b.f7616b;
        if (r90Var != null) {
            if (TextUtils.isEmpty(r90Var.f11070h)) {
                String str4 = "p";
                if (r90Var.f11068f >= 2) {
                    int i11 = r90Var.f11071i;
                    if (i11 != 2) {
                    }
                    str4 = "l";
                    bundle.putString("ia_var", str4);
                } else {
                    int i12 = r90Var.f11069g;
                    if (i12 != 1) {
                        if (i12 != 2) {
                            StringBuilder sb = new StringBuilder(52);
                            sb.append("Instream ad video aspect ratio ");
                            sb.append(i12);
                            sb.append(" is wrong.");
                            io0.d(sb.toString());
                        }
                        bundle.putString("ia_var", str4);
                    }
                    str4 = "l";
                    bundle.putString("ia_var", str4);
                }
            } else {
                bundle.putString("ad_tag", r90Var.f11070h);
            }
            bundle.putBoolean("instr", true);
        }
        if (this.f6652b.a() != null) {
            bundle.putBoolean("has_delayed_banner_listener", true);
        }
    }
}
