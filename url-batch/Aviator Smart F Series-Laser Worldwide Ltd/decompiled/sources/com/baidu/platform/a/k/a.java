package com.baidu.platform.a.k;

import com.baidu.mapapi.JNIInitializer;
import com.baidu.mapapi.SVGLicenseManager;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.svg.OnGetSVGTileBatchSearchResultListener;
import com.baidu.mapapi.search.svg.SVGTileResult;
import com.baidu.mapapi.search.svg.SVGTileSearchOption;
import com.baidu.platform.comapi.license.ILicenseAuthManager;
import com.baidu.platform.comapi.license.LicenseAuthManagerProvider;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private OnGetSVGTileBatchSearchResultListener f8629b;

    /* renamed from: a, reason: collision with root package name */
    protected final Lock f8628a = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    private ExecutorService f8630c = Executors.newCachedThreadPool();

    /* renamed from: d, reason: collision with root package name */
    private d f8631d = new d();

    private String b() {
        return JNIInitializer.getCachedContext().getFilesDir().getAbsolutePath() + File.separator + "baidu_svg";
    }

    public boolean a(SVGTileSearchOption sVGTileSearchOption, int i8, boolean z7) {
        ILicenseAuthManager rTOSSVGMapLicenseAuthManager = LicenseAuthManagerProvider.getInstance().getRTOSSVGMapLicenseAuthManager(SVGLicenseManager.getInstance().getSVGLicenseOption());
        if (rTOSSVGMapLicenseAuthManager == null) {
            a(SearchResult.ERRORNO.NO_ADVANCED_PERMISSION);
            return false;
        }
        if (!rTOSSVGMapLicenseAuthManager.isHaveAuthority()) {
            a(SearchResult.ERRORNO.NO_ADVANCED_PERMISSION);
            return false;
        }
        String b8 = b();
        File file = new File(b8);
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f8631d.a(sVGTileSearchOption, b8, sVGTileSearchOption.mX + "_" + sVGTileSearchOption.mY + "_" + sVGTileSearchOption.mZ, i8, z7);
        return true;
    }

    public void a(OnGetSVGTileBatchSearchResultListener onGetSVGTileBatchSearchResultListener) {
        this.f8628a.lock();
        this.f8629b = onGetSVGTileBatchSearchResultListener;
        d dVar = this.f8631d;
        if (dVar != null) {
            dVar.a(onGetSVGTileBatchSearchResultListener);
        }
        this.f8628a.unlock();
    }

    public void a() {
        this.f8628a.lock();
        this.f8629b = null;
        this.f8630c.shutdown();
        this.f8628a.unlock();
    }

    private void a(SearchResult.ERRORNO errorno) {
        if (this.f8629b != null) {
            SVGTileResult sVGTileResult = new SVGTileResult();
            sVGTileResult.error = errorno;
            this.f8629b.onGetBatchSVGTilesResult(sVGTileResult);
        }
    }
}
