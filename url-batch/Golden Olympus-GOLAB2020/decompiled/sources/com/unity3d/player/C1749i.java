package com.unity3d.player;

import android.content.Context;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackManagerFactory;
import java.util.HashSet;

/* renamed from: com.unity3d.player.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1749i {

    /* renamed from: e, reason: collision with root package name */
    public static C1749i f22182e;

    /* renamed from: a, reason: collision with root package name */
    public final UnityPlayer f22183a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetPackManager f22184b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f22185c;

    /* renamed from: d, reason: collision with root package name */
    public C1731c f22186d;

    public C1749i(UnityPlayer unityPlayer, Context context) {
        if (f22182e != null) {
            throw new RuntimeException("AssetPackManagerWrapper should be created only once. Use getInstance() instead.");
        }
        this.f22183a = unityPlayer;
        this.f22184b = AssetPackManagerFactory.getInstance(context);
        this.f22185c = new HashSet();
    }
}
