package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdxi {
    public static final zzguf zza;
    public static final zzguf zzb;
    private final String zzc;
    private final zzdxh zzd;
    private final zzdxh zze;

    static {
        zzdxh zzdxhVar = zzdxh.PUBLIC_API_CALL;
        zzdxh zzdxhVar2 = zzdxh.PUBLIC_API_CALLBACK;
        zzdxi zzdxiVar = new zzdxi("tqgt", zzdxhVar, zzdxhVar2);
        zzdxh zzdxhVar3 = zzdxh.DYNAMITE_ENTER;
        zzdxi zzdxiVar2 = new zzdxi("l.dl", zzdxhVar, zzdxhVar3);
        zzdxh zzdxhVar4 = zzdxh.READ_FROM_DISK_START;
        zzdxi zzdxiVar3 = new zzdxi("l.rccde", zzdxhVar3, zzdxhVar4);
        zzdxi zzdxiVar4 = new zzdxi("l.rfd", zzdxhVar4, zzdxh.READ_FROM_DISK_END);
        zzdxh zzdxhVar5 = zzdxh.CLIENT_SIGNALS_START;
        zzdxi zzdxiVar5 = new zzdxi("l.rcc", zzdxhVar3, zzdxhVar5);
        zzdxh zzdxhVar6 = zzdxh.CLIENT_SIGNALS_END;
        zzdxi zzdxiVar6 = new zzdxi("l.cs", zzdxhVar5, zzdxhVar6);
        zzdxi zzdxiVar7 = new zzdxi("l.cts", zzdxhVar6, zzdxh.SERVICE_CONNECTED);
        zzdxh zzdxhVar7 = zzdxh.GMS_SIGNALS_START;
        zzdxh zzdxhVar8 = zzdxh.GMS_SIGNALS_END;
        zzdxi zzdxiVar8 = new zzdxi("l.gs", zzdxhVar7, zzdxhVar8);
        zzdxh zzdxhVar9 = zzdxh.GET_SIGNALS_SDKCORE_START;
        zzdxi zzdxiVar9 = new zzdxi("l.jse", zzdxhVar8, zzdxhVar9);
        zzdxh zzdxhVar10 = zzdxh.GET_SIGNALS_SDKCORE_END;
        zzdxi zzdxiVar10 = new zzdxi("l.gs-sdkcore", zzdxhVar9, zzdxhVar10);
        zzdxi zzdxiVar11 = new zzdxi("l.gs-pp", zzdxhVar10, zzdxhVar2);
        zzdxh zzdxhVar11 = zzdxh.RENDERING_START;
        zzdxi zzdxiVar12 = new zzdxi("l.render", zzdxhVar11, zzdxhVar2);
        zzdxh zzdxhVar12 = zzdxh.RENDERING_WEBVIEW_CREATION_START;
        zzdxi zzdxiVar13 = new zzdxi("l.render.pre", zzdxhVar11, zzdxhVar12);
        zzdxh zzdxhVar13 = zzdxh.RENDERING_WEBVIEW_CREATION_END;
        zzdxi zzdxiVar14 = new zzdxi("l.render.wvc", zzdxhVar12, zzdxhVar13);
        zzdxi zzdxiVar15 = new zzdxi("l.render.acc", zzdxhVar13, zzdxh.RENDERING_AD_COMPONENT_CREATION_END);
        zzdxi zzdxiVar16 = new zzdxi("l.render.cfg-wv", zzdxh.RENDERING_CONFIGURE_WEBVIEW_START, zzdxh.RENDERING_CONFIGURE_WEBVIEW_END);
        zzdxh zzdxhVar14 = zzdxh.RENDERING_WEBVIEW_LOAD_HTML_START;
        zzdxh zzdxhVar15 = zzdxh.RENDERING_WEBVIEW_LOAD_HTML_END;
        zza = zzguf.zzo(zzdxiVar, zzdxiVar2, zzdxiVar3, zzdxiVar4, zzdxiVar5, zzdxiVar6, zzdxiVar7, zzdxiVar8, zzdxiVar9, zzdxiVar10, zzdxiVar11, zzdxiVar12, zzdxiVar13, zzdxiVar14, zzdxiVar15, zzdxiVar16, new zzdxi("l.render.wvlh", zzdxhVar14, zzdxhVar15), new zzdxi("l.render.post", zzdxhVar15, zzdxhVar2), new zzdxi("l.sodv", zzdxh.SIGNAL_ON_DISK_VALIDATION_START, zzdxh.SIGNAL_ON_DISK_VALIDATION_END), new zzdxi("l.sodck", zzdxh.SIGNAL_ON_DISK_CACHE_KEY_START, zzdxh.SIGNAL_ON_DISK_CACHE_KEY_END), new zzdxi("l.sodrar", zzdxh.SIGNAL_ON_DISK_READ_AND_REMOVE_START, zzdxh.SIGNAL_ON_DISK_READ_AND_REMOVE_END), new zzdxi("l.soddc", zzdxh.SIGNAL_ON_DISK_DECODE_START, zzdxh.SIGNAL_ON_DISK_DECODE_END));
        zzdxh zzdxhVar16 = zzdxh.PUBLIC_API_CALL;
        zzdxh zzdxhVar17 = zzdxh.PUBLIC_API_CALLBACK;
        zzdxi zzdxiVar17 = new zzdxi("l.al", zzdxhVar16, zzdxhVar17);
        zzdxh zzdxhVar18 = zzdxh.DYNAMITE_ENTER;
        zzdxi zzdxiVar18 = new zzdxi("l.al2", zzdxhVar18, zzdxhVar17);
        zzdxi zzdxiVar19 = new zzdxi("l.dl", zzdxhVar16, zzdxhVar18);
        zzdxh zzdxhVar19 = zzdxh.CLIENT_SIGNALS_START;
        zzdxi zzdxiVar20 = new zzdxi("l.rcc", zzdxhVar18, zzdxhVar19);
        zzdxh zzdxhVar20 = zzdxh.CLIENT_SIGNALS_END;
        zzdxi zzdxiVar21 = new zzdxi("l.cs", zzdxhVar19, zzdxhVar20);
        zzdxi zzdxiVar22 = new zzdxi("l.cts", zzdxhVar20, zzdxh.SERVICE_CONNECTED);
        zzdxh zzdxhVar21 = zzdxh.GMS_SIGNALS_START;
        zzdxh zzdxhVar22 = zzdxh.GMS_SIGNALS_END;
        zzdxi zzdxiVar23 = new zzdxi("l.gs", zzdxhVar21, zzdxhVar22);
        zzdxh zzdxhVar23 = zzdxh.GET_AD_DICTIONARY_SDKCORE_START;
        zzdxi zzdxiVar24 = new zzdxi("l.jse", zzdxhVar22, zzdxhVar23);
        zzdxh zzdxhVar24 = zzdxh.GET_AD_DICTIONARY_SDKCORE_END;
        zzdxi zzdxiVar25 = new zzdxi("l.gad-js", zzdxhVar23, zzdxhVar24);
        zzdxh zzdxhVar25 = zzdxh.HTTP_RESPONSE_READY;
        zzdxi zzdxiVar26 = new zzdxi("l.http", zzdxhVar24, zzdxhVar25);
        zzdxh zzdxhVar26 = zzdxh.SCAR_PRELOADER_READY;
        zzdxi zzdxiVar27 = new zzdxi("l.slas.pre", zzdxhVar16, zzdxhVar26);
        zzdxh zzdxhVar27 = zzdxh.SCAR_PRELOADER_PROCESSING_DONE;
        zzdxi zzdxiVar28 = new zzdxi("l.slas.prel.p", zzdxhVar26, zzdxhVar27);
        zzdxh zzdxhVar28 = zzdxh.NORMALIZATION_AD_RESPONSE_START;
        zzdxi zzdxiVar29 = new zzdxi("l.jse-nml", zzdxhVar25, zzdxhVar28);
        zzdxi zzdxiVar30 = new zzdxi("l.jse-nml", zzdxhVar27, zzdxhVar28);
        zzdxh zzdxhVar29 = zzdxh.NORMALIZATION_AD_RESPONSE_END;
        zzdxi zzdxiVar31 = new zzdxi("l.nml-js", zzdxhVar28, zzdxhVar29);
        zzdxh zzdxhVar30 = zzdxh.BINDER_CALL_START;
        zzdxi zzdxiVar32 = new zzdxi("l.nml-gmsg", zzdxhVar29, zzdxhVar30);
        zzdxh zzdxhVar31 = zzdxh.SERVER_RESPONSE_PARSE_START;
        zzdxi zzdxiVar33 = new zzdxi("l.nml-gmsg.s2s", zzdxhVar29, zzdxhVar31);
        zzdxi zzdxiVar34 = new zzdxi("l.binder", zzdxhVar30, zzdxhVar31);
        zzdxh zzdxhVar32 = zzdxh.RENDERING_START;
        zzdxi zzdxiVar35 = new zzdxi("l.sr", zzdxhVar31, zzdxhVar32);
        zzdxi zzdxiVar36 = new zzdxi("l.render", zzdxhVar32, zzdxhVar17);
        zzdxi zzdxiVar37 = new zzdxi("l.t2", zzdxh.RENDERING_ADSTRING_TYPE2_FETCH_START, zzdxh.RENDERING_ADSTRING_TYPE2_FETCH_END);
        zzdxh zzdxhVar33 = zzdxh.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START;
        zzdxh zzdxhVar34 = zzdxh.RENDERING_NATIVE_ADS_PREPROCESS_START;
        zzdxi zzdxiVar38 = new zzdxi("l.render.na.js", zzdxhVar33, zzdxhVar34);
        zzdxi zzdxiVar39 = new zzdxi("l.render.na.prep", zzdxhVar34, zzdxh.RENDERING_NATIVE_ADS_PREPROCESS_END);
        zzdxi zzdxiVar40 = new zzdxi("l.render.na.lna", zzdxh.RENDERING_NATIVE_ASSETS_LOADING_START, zzdxh.RENDERING_NATIVE_ASSETS_LOADING_END);
        zzdxh zzdxhVar35 = zzdxh.RENDERING_WEBVIEW_CREATION_START;
        zzdxh zzdxhVar36 = zzdxh.RENDERING_WEBVIEW_CREATION_END;
        zzdxi zzdxiVar41 = new zzdxi("l.render.wvc", zzdxhVar35, zzdxhVar36);
        zzdxi zzdxiVar42 = new zzdxi("l.render.acc", zzdxhVar36, zzdxh.RENDERING_AD_COMPONENT_CREATION_END);
        zzdxh zzdxhVar37 = zzdxh.RENDERING_CONFIGURE_WEBVIEW_START;
        zzdxh zzdxhVar38 = zzdxh.RENDERING_CONFIGURE_WEBVIEW_END;
        zzdxi zzdxiVar43 = new zzdxi("l.render.cfg-wv", zzdxhVar37, zzdxhVar38);
        zzdxi zzdxiVar44 = new zzdxi("l.render.pre", zzdxhVar32, zzdxhVar35);
        zzdxh zzdxhVar39 = zzdxh.RENDERING_WEBVIEW_LOAD_HTML_END;
        zzdxi zzdxiVar45 = new zzdxi("l.render.post", zzdxhVar39, zzdxhVar17);
        zzdxi zzdxiVar46 = new zzdxi("l.render.na.post", zzdxhVar38, zzdxhVar17);
        zzdxi zzdxiVar47 = new zzdxi("l.render.wvlh", zzdxh.RENDERING_WEBVIEW_LOAD_HTML_START, zzdxhVar39);
        zzdxi zzdxiVar48 = new zzdxi("l.na.b", zzdxh.NATIVE_ASSETS_LOADING_BASIC_START, zzdxh.NATIVE_ASSETS_LOADING_BASIC_END);
        zzdxi zzdxiVar49 = new zzdxi("l.na.im", zzdxh.NATIVE_ASSETS_LOADING_IMAGE_START, zzdxh.NATIVE_ASSETS_LOADING_IMAGE_END);
        zzdxi zzdxiVar50 = new zzdxi("l.na.imc", zzdxh.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START, zzdxh.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        zzdxi zzdxiVar51 = new zzdxi("l.na.l", zzdxh.NATIVE_ASSETS_LOADING_LOGO_START, zzdxh.NATIVE_ASSETS_LOADING_LOGO_END);
        zzdxi zzdxiVar52 = new zzdxi("l.na.ic", zzdxh.NATIVE_ASSETS_LOADING_ICON_START, zzdxh.NATIVE_ASSETS_LOADING_ICON_END);
        zzdxi zzdxiVar53 = new zzdxi("l.na.a", zzdxh.NATIVE_ASSETS_LOADING_ATTRIBUTION_START, zzdxh.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        zzdxh zzdxhVar40 = zzdxh.NATIVE_ASSETS_LOADING_VIDEO_START;
        zzdxh zzdxhVar41 = zzdxh.NATIVE_ASSETS_LOADING_VIDEO_END;
        zzb = zzguf.zzo(zzdxiVar17, zzdxiVar18, zzdxiVar19, zzdxiVar20, zzdxiVar21, zzdxiVar22, zzdxiVar23, zzdxiVar24, zzdxiVar25, zzdxiVar26, zzdxiVar27, zzdxiVar28, zzdxiVar29, zzdxiVar30, zzdxiVar31, zzdxiVar32, zzdxiVar33, zzdxiVar34, zzdxiVar35, zzdxiVar36, zzdxiVar37, zzdxiVar38, zzdxiVar39, zzdxiVar40, zzdxiVar41, zzdxiVar42, zzdxiVar43, zzdxiVar44, zzdxiVar45, zzdxiVar46, zzdxiVar47, zzdxiVar48, zzdxiVar49, zzdxiVar50, zzdxiVar51, zzdxiVar52, zzdxiVar53, new zzdxi("l.na.v", zzdxhVar40, zzdxhVar41), new zzdxi("l.na.vc", zzdxh.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START, zzdxhVar41), new zzdxi("l.na.m", zzdxh.NATIVE_ASSETS_LOADING_MEDIA_START, zzdxh.NATIVE_ASSETS_LOADING_MEDIA_END), new zzdxi("l.na.c", zzdxh.NATIVE_ASSETS_LOADING_CUSTOM_START, zzdxh.NATIVE_ASSETS_LOADING_CUSTOM_END), new zzdxi("l.na.o", zzdxh.NATIVE_ASSETS_LOADING_OMID_START, zzdxh.NATIVE_ASSETS_LOADING_OMID_END));
    }

    public zzdxi(String str, zzdxh zzdxhVar, zzdxh zzdxhVar2) {
        this.zzc = str;
        this.zzd = zzdxhVar;
        this.zze = zzdxhVar2;
    }

    public final String zza() {
        return this.zzc;
    }

    public final zzdxh zzb() {
        return this.zzd;
    }

    public final zzdxh zzc() {
        return this.zze;
    }
}
