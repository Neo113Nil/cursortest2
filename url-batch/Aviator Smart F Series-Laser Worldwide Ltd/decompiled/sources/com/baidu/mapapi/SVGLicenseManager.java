package com.baidu.mapapi;

import android.content.Context;
import com.baidu.platform.comapi.license.ILicenseAuthManager;
import com.baidu.platform.comapi.license.ILicenseAuthManagerListener;
import com.baidu.platform.comapi.license.LicenseAuthManagerProvider;
import java.util.Map;

/* loaded from: classes2.dex */
public class SVGLicenseManager {

    /* renamed from: a, reason: collision with root package name */
    private static SVGLicenseManager f5322a;

    /* renamed from: b, reason: collision with root package name */
    private ISVGLicenseListener f5323b;

    /* renamed from: c, reason: collision with root package name */
    private SVGLicenseOption f5324c;

    private static class a implements ILicenseAuthManagerListener {

        /* renamed from: a, reason: collision with root package name */
        private final ISVGLicenseListener f5325a;

        public a(ISVGLicenseListener iSVGLicenseListener) {
            this.f5325a = iSVGLicenseListener;
        }

        @Override // com.baidu.platform.comapi.license.ILicenseAuthManagerListener
        public void onError(String str, String str2, int i8, int i9, String str3) {
            ISVGLicenseListener iSVGLicenseListener = this.f5325a;
            if (iSVGLicenseListener == null) {
                return;
            }
            iSVGLicenseListener.auth(2, i9);
        }

        @Override // com.baidu.platform.comapi.license.ILicenseAuthManagerListener
        public void onSuccess(String str, String str2, int i8, Map<String, Integer> map) {
            Integer num;
            ISVGLicenseListener iSVGLicenseListener = this.f5325a;
            if (iSVGLicenseListener == null) {
                return;
            }
            iSVGLicenseListener.auth(2, (map == null || (num = map.get(str2)) == null || num.intValue() != 0) ? 201 : 0);
        }
    }

    private SVGLicenseManager() {
    }

    public static synchronized SVGLicenseManager getInstance() {
        SVGLicenseManager sVGLicenseManager;
        synchronized (SVGLicenseManager.class) {
            try {
                if (f5322a == null) {
                    f5322a = new SVGLicenseManager();
                }
                sVGLicenseManager = f5322a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVGLicenseManager;
    }

    public SVGLicenseOption getSVGLicenseOption() {
        return this.f5324c;
    }

    public void loadSVGLicense(Context context, SVGLicenseOption sVGLicenseOption) {
        this.f5324c = sVGLicenseOption;
        loadSVGLicense(context);
    }

    public void setSVGLicenseListener(ISVGLicenseListener iSVGLicenseListener) {
        this.f5323b = iSVGLicenseListener;
    }

    public void setSVGLicenseOption(SVGLicenseOption sVGLicenseOption) {
        this.f5324c = sVGLicenseOption;
    }

    public void loadSVGLicense(Context context) {
        ILicenseAuthManager rTOSSVGMapLicenseAuthManager;
        if (this.f5324c == null || (rTOSSVGMapLicenseAuthManager = LicenseAuthManagerProvider.getInstance().getRTOSSVGMapLicenseAuthManager(this.f5324c)) == null) {
            return;
        }
        rTOSSVGMapLicenseAuthManager.loadAuth(context, new a(this.f5323b));
    }
}
