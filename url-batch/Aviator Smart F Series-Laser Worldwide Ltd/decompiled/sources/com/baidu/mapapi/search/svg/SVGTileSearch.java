package com.baidu.mapapi.search.svg;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.search.core.a;
import com.baidu.platform.a.k.d;

/* loaded from: classes2.dex */
public class SVGTileSearch extends a {

    /* renamed from: c, reason: collision with root package name */
    private boolean f7452c = false;

    /* renamed from: a, reason: collision with root package name */
    private final d f7450a = new d();

    /* renamed from: b, reason: collision with root package name */
    private final com.baidu.platform.a.k.a f7451b = new com.baidu.platform.a.k.a();

    private SVGTileSearch() {
    }

    public static SVGTileSearch newInstance() {
        BMapManager.init();
        return new SVGTileSearch();
    }

    public void destroy() {
        if (this.f7452c) {
            return;
        }
        this.f7452c = true;
        this.f7450a.b();
        this.f7451b.a();
        BMapManager.destroy();
    }

    public boolean requestSVGTile(SVGTileSearchOption sVGTileSearchOption) {
        d dVar = this.f7450a;
        if (dVar == null) {
            throw new IllegalStateException("BDMapSDKException: SVGTileSearch is null, please call newInstance() first.");
        }
        if (sVGTileSearchOption == null || sVGTileSearchOption.mCoordCipher == null || sVGTileSearchOption.mAkCipher == null || sVGTileSearchOption.mDeviceIDCipher == null || sVGTileSearchOption.mTime == null || sVGTileSearchOption.mSign == null) {
            throw new IllegalStateException("BDMapSDKException: option or parameter can not be null");
        }
        return dVar.a(sVGTileSearchOption);
    }

    public boolean searchBatchSVGTiles(SVGTileSearchOption sVGTileSearchOption, int i8, boolean z7) {
        com.baidu.platform.a.k.a aVar = this.f7451b;
        if (aVar == null) {
            throw new IllegalStateException("BDMapSDKException: SVGTileSearch is null, please call newInstance() first.");
        }
        if (sVGTileSearchOption == null || sVGTileSearchOption.mCoordCipher == null || sVGTileSearchOption.mAkCipher == null || sVGTileSearchOption.mDeviceIDCipher == null || sVGTileSearchOption.mTime == null || sVGTileSearchOption.mSign == null || i8 <= 0) {
            throw new IllegalStateException("BDMapSDKException: option or parameter can not be null");
        }
        return aVar.a(sVGTileSearchOption, i8, z7);
    }

    public void setOnGetSVGTileBatchSearchResultListener(OnGetSVGTileBatchSearchResultListener onGetSVGTileBatchSearchResultListener) {
        com.baidu.platform.a.k.a aVar = this.f7451b;
        if (aVar == null) {
            throw new IllegalStateException("BDMapSDKException: SVGTileSearch is null, please call newInstance first.");
        }
        if (onGetSVGTileBatchSearchResultListener == null) {
            throw new IllegalArgumentException("BDMapSDKException: listener can not be null");
        }
        aVar.a(onGetSVGTileBatchSearchResultListener);
    }

    public void setOnGetSVGTileSearchResultListener(OnGetSVGTileSearchResultListener onGetSVGTileSearchResultListener) {
        d dVar = this.f7450a;
        if (dVar == null) {
            throw new IllegalStateException("BDMapSDKException: SVGTileSearch is null, please call newInstance first.");
        }
        if (onGetSVGTileSearchResultListener == null) {
            throw new IllegalArgumentException("BDMapSDKException: listener can not be null");
        }
        dVar.a(onGetSVGTileSearchResultListener);
    }
}
