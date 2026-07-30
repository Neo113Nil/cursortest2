package com.baidu.ar;

import android.text.TextUtils;
import com.baidu.ar.bean.ARCaseBundleInfo;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.callback.IError;
import com.baidu.ar.ihttp.Downloader;
import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.ihttp.IProgressCallback;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;

/* loaded from: classes.dex */
public class dc extends e0<String, Void> {

    /* renamed from: i, reason: collision with root package name */
    public ARCaseBundleInfo f2062i;

    /* renamed from: j, reason: collision with root package name */
    public String f2063j;

    /* renamed from: k, reason: collision with root package name */
    public m1 f2064k;

    /* renamed from: l, reason: collision with root package name */
    public IProgressCallback f2065l;

    public dc(ARCaseBundleInfo aRCaseBundleInfo, String str, m1 m1Var, IProgressCallback iProgressCallback) {
        this.f2062i = aRCaseBundleInfo;
        this.f2063j = str;
        this.f2064k = m1Var;
        this.f2065l = iProgressCallback;
    }

    public final String a(gc gcVar) {
        StringBuilder sb;
        String str;
        String parent = new File(this.f2062i.caseDir).getParent();
        if ("gzip".equalsIgnoreCase(gcVar.f2338c)) {
            str = String.format("/temp/%s.zip", gcVar.f2337b);
            sb = new StringBuilder();
            sb.append(parent);
        } else {
            if (!"identity".equalsIgnoreCase(gcVar.f2338c)) {
                return null;
            }
            sb = new StringBuilder();
            sb.append(parent);
            sb.append(File.separator);
            str = gcVar.f2336a;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // com.baidu.ar.e0
    public void b() {
    }

    @Override // com.baidu.ar.e0
    public void a(String str, ICallbackWith<Void> iCallbackWith, IError iError) {
        if (TextUtils.isEmpty(str)) {
            iError.onError(2, "res url is not exists", null);
            return;
        }
        if (ImagesContract.LOCAL.equals(str)) {
            iCallbackWith.run(null);
            return;
        }
        gc a8 = this.f2064k.a(this.f2063j);
        if (a8 == null) {
            iError.onError(2, "res is not exists", null);
            return;
        }
        String a9 = a(a8);
        if (a9 == null) {
            iError.onError(2, "未知的资源encoding", null);
            return;
        }
        Downloader downloader = new Downloader(str);
        try {
            int fileSize = downloader.getFileSize();
            if (!a(a9, a8, fileSize)) {
                try {
                    downloader.download(a9, this.f2065l);
                    if (!a(a9, a8, fileSize)) {
                        iError.onError(2, "download fail", null);
                        return;
                    }
                } catch (Exception e8) {
                    iError.onError(2, e8.getMessage(), e8);
                    return;
                }
            }
            iCallbackWith.run(null);
        } catch (HttpException e9) {
            iError.onError(2, e9.getMessage(), e9);
        }
    }

    public final boolean a(String str, gc gcVar, int i8) {
        File file = new File(str);
        if (!file.exists() || file.length() != i8) {
            return false;
        }
        if ("gzip".equalsIgnoreCase(gcVar.f2338c)) {
            return af.a(new File(str), new File(this.f2062i.caseDir).getParentFile());
        }
        return true;
    }
}
