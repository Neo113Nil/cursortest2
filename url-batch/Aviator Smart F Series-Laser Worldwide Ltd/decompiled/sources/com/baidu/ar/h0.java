package com.baidu.ar;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.ar.callback.ICallback;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.ihttp.IProgressCallback;
import com.baidu.ar.remoteres.IDuMixResLoadTask;
import com.baidu.ar.remoteres.IDuMixResProcessor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class h0 {
    private static final String TAG = "AbstractResManager";
    public Context mContext;
    public hb mDownloader;
    public ICallbackWith<IDuMixResLoadTask> mErrorCallback;
    public jb mResVersion;
    public boolean mIsChecked = false;
    public List<Runnable> mReadyTasks = new ArrayList();
    public Map<String, String> mBusinessResUrls = new HashMap();

    public class a implements ICallbackWith<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f2346a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ICallback f2347b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ IProgressCallback f2348c;

        /* renamed from: com.baidu.ar.h0$a$a, reason: collision with other inner class name */
        public class C0036a implements IDuMixResLoadTask {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f2350a;

            public C0036a(String str) {
                this.f2350a = str;
            }

            @Override // com.baidu.ar.remoteres.IDuMixResLoadTask
            public boolean canRetry() {
                return true;
            }

            @Override // com.baidu.ar.remoteres.IDuMixResLoadTask
            public String getError() {
                return this.f2350a;
            }

            @Override // com.baidu.ar.remoteres.IDuMixResLoadTask
            public void retry() {
                a aVar = a.this;
                h0.this.doDownloadRes(aVar.f2346a, aVar.f2347b, aVar.f2348c);
            }
        }

        public a(String str, ICallback iCallback, IProgressCallback iProgressCallback) {
            this.f2346a = str;
            this.f2347b = iCallback;
            this.f2348c = iProgressCallback;
        }

        @Override // com.baidu.ar.callback.ICallbackWith
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void run(String str) {
            ICallbackWith<IDuMixResLoadTask> iCallbackWith = h0.this.mErrorCallback;
            if (iCallbackWith != null) {
                iCallbackWith.run(new C0036a(str));
            }
        }
    }

    public class b implements IDuMixResLoadTask {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f2352a;

        public b(h0 h0Var, String str) {
            this.f2352a = str;
        }

        @Override // com.baidu.ar.remoteres.IDuMixResLoadTask
        public boolean canRetry() {
            return false;
        }

        @Override // com.baidu.ar.remoteres.IDuMixResLoadTask
        public String getError() {
            return this.f2352a;
        }

        @Override // com.baidu.ar.remoteres.IDuMixResLoadTask
        public void retry() {
        }
    }

    public void doDownloadRes(String str, ICallback iCallback, IProgressCallback iProgressCallback) {
        if (this.mContext == null || !this.mBusinessResUrls.containsKey(str)) {
            return;
        }
        this.mDownloader.a();
        this.mDownloader.a(new a(str, iCallback, iProgressCallback));
        this.mDownloader.b(this.mBusinessResUrls.get(str), iCallback, iProgressCallback);
    }

    public void executeReadyTask() {
        if (this.mReadyTasks.isEmpty()) {
            return;
        }
        int size = this.mReadyTasks.size();
        Runnable[] runnableArr = new Runnable[size];
        this.mReadyTasks.toArray(runnableArr);
        this.mReadyTasks.clear();
        for (int i8 = 0; i8 < size; i8++) {
            Runnable runnable = runnableArr[i8];
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public boolean isModHasNewVersion(String str) {
        Map<String, String> map = this.mBusinessResUrls;
        if (map == null || this.mResVersion == null) {
            return false;
        }
        String str2 = map.get(str);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        h.a(TAG, "check so new version: business:" + str + " currentVersion:" + k8.b(str2).toLowerCase() + " oldVersion:" + this.mResVersion.a(str));
        return !r0.equals(r1);
    }

    public IDuMixResLoadTask makeErrorObj(String str) {
        return new b(this, str);
    }

    public void onReady(Runnable runnable) {
        if (this.mIsChecked) {
            runnable.run();
        } else {
            this.mReadyTasks.add(runnable);
        }
    }

    public void onRelease() {
        this.mErrorCallback = null;
        this.mContext = null;
        this.mBusinessResUrls.clear();
        this.mReadyTasks.clear();
        hb hbVar = this.mDownloader;
        if (hbVar != null) {
            hbVar.b();
        }
    }

    public void updateModResVersion(IDuMixResProcessor iDuMixResProcessor) {
        if (this.mContext != null) {
            String lowerCase = k8.b(this.mBusinessResUrls.get(iDuMixResProcessor.getBusinessTag())).toLowerCase();
            h.a(TAG, "update so complete: business:" + iDuMixResProcessor.getBusinessTag() + " newVersion:" + lowerCase);
            this.mResVersion.a(iDuMixResProcessor.getBusinessTag(), lowerCase);
            jb.a(this.mContext, this.mResVersion);
        }
    }
}
