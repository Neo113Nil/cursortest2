package com.baidu.platform.a.k;

import com.baidu.mapapi.JNIInitializer;
import com.baidu.mapapi.SVGLicenseManager;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.svg.OnGetSVGTileBatchSearchResultListener;
import com.baidu.mapapi.search.svg.OnGetSVGTileSearchResultListener;
import com.baidu.mapapi.search.svg.SVGTileResult;
import com.baidu.mapapi.search.svg.SVGTileSearchOption;
import com.baidu.platform.base.SearchType;
import com.baidu.platform.comapi.license.ILicenseAuthManager;
import com.baidu.platform.comapi.license.LicenseAuthManagerProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class d extends com.baidu.platform.base.a {

    /* renamed from: g, reason: collision with root package name */
    private static Set<String> f8633g = Collections.synchronizedSet(new HashSet());

    /* renamed from: h, reason: collision with root package name */
    private OnGetSVGTileSearchResultListener f8634h;

    /* renamed from: i, reason: collision with root package name */
    private OnGetSVGTileBatchSearchResultListener f8635i;

    class a implements OnGetSVGTileBatchSearchResultListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f8636a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f8637b;

        a(boolean z7, List list) {
            this.f8636a = z7;
            this.f8637b = list;
        }

        @Override // com.baidu.mapapi.search.svg.OnGetSVGTileBatchSearchResultListener
        public void onGetBatchSVGTilesResult(SVGTileResult sVGTileResult) {
            if (d.this.f8635i != null) {
                if (sVGTileResult.error == SearchResult.ERRORNO.NO_ERROR && this.f8636a) {
                    for (SVGTileSearchOption sVGTileSearchOption : this.f8637b) {
                        d.f8633g.add(sVGTileSearchOption.mX + "_" + sVGTileSearchOption.mY + "_" + sVGTileSearchOption.mZ);
                    }
                }
                d.this.f8635i.onGetBatchSVGTilesResult(sVGTileResult);
            }
        }
    }

    private List<SVGTileSearchOption> b(SVGTileSearchOption sVGTileSearchOption, int i8) {
        ArrayList arrayList = new ArrayList();
        int i9 = i8 / 2;
        int i10 = sVGTileSearchOption.mX;
        int i11 = sVGTileSearchOption.mY;
        int i12 = i11 - i9;
        int i13 = i10 + i9;
        int i14 = i11 + i9;
        for (int i15 = i10 - i9; i15 <= i13; i15++) {
            for (int i16 = i12; i16 <= i14; i16++) {
                SVGTileSearchOption sVGTileSearchOption2 = new SVGTileSearchOption(sVGTileSearchOption);
                sVGTileSearchOption2.mX = i15;
                sVGTileSearchOption2.mY = i16;
                arrayList.add(sVGTileSearchOption2);
            }
        }
        return arrayList;
    }

    private String c() {
        return JNIInitializer.getCachedContext().getFilesDir().getAbsolutePath() + File.separator + "baidu_svg";
    }

    public boolean a(SVGTileSearchOption sVGTileSearchOption) {
        ILicenseAuthManager rTOSSVGMapLicenseAuthManager = LicenseAuthManagerProvider.getInstance().getRTOSSVGMapLicenseAuthManager(SVGLicenseManager.getInstance().getSVGLicenseOption());
        if (rTOSSVGMapLicenseAuthManager == null) {
            a(false, SearchResult.ERRORNO.NO_ADVANCED_PERMISSION);
            return false;
        }
        if (!rTOSSVGMapLicenseAuthManager.isHaveAuthority()) {
            a(false, SearchResult.ERRORNO.NO_ADVANCED_PERMISSION);
            return false;
        }
        c cVar = new c();
        cVar.a(SearchType.SVG_TILE_SEARCH);
        return a(new e(sVGTileSearchOption), c(), sVGTileSearchOption.mX + "_" + sVGTileSearchOption.mY + "_" + sVGTileSearchOption.mZ, this.f8634h, cVar);
    }

    public void b() {
        this.f8674d.lock();
        this.f8634h = null;
        if (this.f8635i != null) {
            this.f8635i = null;
        }
        Set<String> set = f8633g;
        if (set != null) {
            set.clear();
        }
        this.f8674d.unlock();
    }

    public boolean a(SVGTileSearchOption sVGTileSearchOption, String str, String str2, int i8, boolean z7) {
        List<SVGTileSearchOption> b8;
        ILicenseAuthManager rTOSSVGMapLicenseAuthManager = LicenseAuthManagerProvider.getInstance().getRTOSSVGMapLicenseAuthManager(SVGLicenseManager.getInstance().getSVGLicenseOption());
        if (rTOSSVGMapLicenseAuthManager == null) {
            a(true, SearchResult.ERRORNO.NO_ADVANCED_PERMISSION);
            return false;
        }
        if (!rTOSSVGMapLicenseAuthManager.isHaveAuthority()) {
            a(true, SearchResult.ERRORNO.NO_ADVANCED_PERMISSION);
            return false;
        }
        if (z7) {
            b8 = a(sVGTileSearchOption, i8);
        } else {
            b8 = b(sVGTileSearchOption, i8);
        }
        if (b8.isEmpty()) {
            a("");
            return true;
        }
        c cVar = new c();
        cVar.a(SearchType.SVG_TILE_BATCH_SEARCH);
        return a(new b(b8), str, str2, new a(z7, b8), cVar);
    }

    public void a(OnGetSVGTileSearchResultListener onGetSVGTileSearchResultListener) {
        this.f8674d.lock();
        this.f8634h = onGetSVGTileSearchResultListener;
        this.f8674d.unlock();
    }

    public void a(OnGetSVGTileBatchSearchResultListener onGetSVGTileBatchSearchResultListener) {
        this.f8674d.lock();
        this.f8635i = onGetSVGTileBatchSearchResultListener;
        this.f8674d.unlock();
    }

    private List<SVGTileSearchOption> a(SVGTileSearchOption sVGTileSearchOption, int i8) {
        ArrayList arrayList = new ArrayList();
        int i9 = i8 / 2;
        int i10 = sVGTileSearchOption.mX;
        int i11 = sVGTileSearchOption.mY;
        int i12 = i11 - i9;
        int i13 = i10 + i9;
        int i14 = i11 + i9;
        for (int i15 = i10 - i9; i15 <= i13; i15++) {
            for (int i16 = i12; i16 <= i14; i16++) {
                SVGTileSearchOption sVGTileSearchOption2 = new SVGTileSearchOption(sVGTileSearchOption);
                sVGTileSearchOption2.mX = i15;
                sVGTileSearchOption2.mY = i16;
                if (!f8633g.contains(i15 + "_" + i16 + "_" + sVGTileSearchOption.mZ)) {
                    arrayList.add(sVGTileSearchOption2);
                }
            }
        }
        return arrayList;
    }

    private void a(String str) {
        if (this.f8635i != null) {
            SVGTileResult sVGTileResult = new SVGTileResult();
            sVGTileResult.error = SearchResult.ERRORNO.NO_ERROR;
            sVGTileResult.setTileZipPath(str);
            this.f8635i.onGetBatchSVGTilesResult(sVGTileResult);
        }
    }

    private void a(boolean z7, SearchResult.ERRORNO errorno) {
        if (z7) {
            if (this.f8635i != null) {
                SVGTileResult sVGTileResult = new SVGTileResult();
                sVGTileResult.error = errorno;
                this.f8635i.onGetBatchSVGTilesResult(sVGTileResult);
                return;
            }
            return;
        }
        if (this.f8634h != null) {
            SVGTileResult sVGTileResult2 = new SVGTileResult();
            sVGTileResult2.error = errorno;
            this.f8634h.onGetSVGTileResult(sVGTileResult2);
        }
    }
}
