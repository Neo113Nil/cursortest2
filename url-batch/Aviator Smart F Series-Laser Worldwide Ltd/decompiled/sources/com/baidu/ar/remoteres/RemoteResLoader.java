package com.baidu.ar.remoteres;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.ar.ARType;
import com.baidu.ar.DuMixController;
import com.baidu.ar.DuMixErrorType;
import com.baidu.ar.callback.ICallback;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.callback.ICancellable;
import com.baidu.ar.content.IARCaseInfo;
import com.baidu.ar.content.IRequestCallback;
import com.baidu.ar.gd;
import com.baidu.ar.h;
import com.baidu.ar.libloader.ILibLoader;
import com.baidu.ar.libloader.ILibLoaderPlugin;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class RemoteResLoader implements ILibLoader {

    /* renamed from: a, reason: collision with root package name */
    public DuMixResManager f3154a;

    /* renamed from: b, reason: collision with root package name */
    public DuMixController f3155b;

    /* renamed from: c, reason: collision with root package name */
    public String f3156c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, Integer> f3157d;

    /* renamed from: e, reason: collision with root package name */
    public com.baidu.ar.libloader.d f3158e;

    /* renamed from: f, reason: collision with root package name */
    public ILibLoaderPlugin f3159f;

    /* renamed from: g, reason: collision with root package name */
    public ICancellable f3160g;

    public class a implements ICallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f3161a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ILibLoader.b f3162b;

        public a(Context context, ILibLoader.b bVar) {
            this.f3161a = context;
            this.f3162b = bVar;
        }

        @Override // com.baidu.ar.callback.ICallback
        public void run() {
            RemoteResLoader.this.a(this.f3161a, this.f3162b);
        }
    }

    public class b implements ICallbackWith<IDuMixResLoadTask> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f3164a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ILibLoader.b f3165b;

        public class a implements ICallback {
            public a() {
            }

            @Override // com.baidu.ar.callback.ICallback
            public void run() {
                if (RemoteResLoader.this.f3154a != null) {
                    b bVar = b.this;
                    RemoteResLoader.this.a(bVar.f3164a, bVar.f3165b);
                }
            }
        }

        public b(Context context, ILibLoader.b bVar) {
            this.f3164a = context;
            this.f3165b = bVar;
        }

        @Override // com.baidu.ar.callback.ICallbackWith
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void run(IDuMixResLoadTask iDuMixResLoadTask) {
            ILibLoader.b bVar;
            if ((RemoteResLoader.this.f3159f == null || !RemoteResLoader.this.f3159f.processLoadError(new a())) && (bVar = this.f3165b) != null) {
                bVar.a(DuMixErrorType.LibraryError, new Exception(iDuMixResLoadTask.getError()));
            }
        }
    }

    public class c implements ICallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ILibLoader.b f3168a;

        public c(ILibLoader.b bVar) {
            this.f3168a = bVar;
        }

        @Override // com.baidu.ar.callback.ICallback
        public void run() {
            RemoteResLoader.this.a(this.f3168a);
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f3170a;

        public d(String str) {
            this.f3170a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RemoteResLoader.this.f3158e.a(this.f3170a);
            RemoteResLoader.this.f3158e.b(this.f3170a);
        }
    }

    public class e implements ICallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ILibLoader.a f3172a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ARType f3173b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f3174c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f3175d;

        public e(RemoteResLoader remoteResLoader, ILibLoader.a aVar, ARType aRType, String str, String str2) {
            this.f3172a = aVar;
            this.f3173b = aRType;
            this.f3174c = str;
            this.f3175d = str2;
        }

        @Override // com.baidu.ar.callback.ICallback
        public void run() {
            ILibLoader.a aVar = this.f3172a;
            if (aVar != null) {
                aVar.a(this.f3173b, this.f3174c, this.f3175d);
            }
        }
    }

    public class f implements IRequestCallback<IARCaseInfo> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int[] f3176a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String[] f3177b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ILibLoader.a f3178c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ARType f3179d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f3180e;

        public f(int[] iArr, String[] strArr, ILibLoader.a aVar, ARType aRType, String str) {
            this.f3176a = iArr;
            this.f3177b = strArr;
            this.f3178c = aVar;
            this.f3179d = aRType;
            this.f3180e = str;
        }

        @Override // com.baidu.ar.content.IRequestCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(IARCaseInfo iARCaseInfo) {
            ILibLoader.a aVar;
            RemoteResLoader.this.f3160g = null;
            if (iARCaseInfo == null || iARCaseInfo.getCaseBundleInfo() == null) {
                return;
            }
            int[] iArr = this.f3176a;
            iArr[1] = iArr[1] + 1;
            this.f3177b[0] = new File(iARCaseInfo.getCaseBundleInfo().caseDir).getParent();
            int[] iArr2 = this.f3176a;
            if (iArr2[1] < iArr2[0] || (aVar = this.f3178c) == null) {
                return;
            }
            aVar.a(this.f3179d, this.f3177b[0], this.f3180e);
        }

        @Override // com.baidu.ar.content.IRequestCallback
        public void onFail(int i8, String str) {
            RemoteResLoader.this.f3160g = null;
            ILibLoader.a aVar = this.f3178c;
            if (aVar != null) {
                aVar.a(DuMixErrorType.LoadCaseError, str);
            }
        }
    }

    public class g implements ICallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int[] f3182a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ILibLoader.a f3183b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ARType f3184c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String[] f3185d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f3186e;

        public g(RemoteResLoader remoteResLoader, int[] iArr, ILibLoader.a aVar, ARType aRType, String[] strArr, String str) {
            this.f3182a = iArr;
            this.f3183b = aVar;
            this.f3184c = aRType;
            this.f3185d = strArr;
            this.f3186e = str;
        }

        @Override // com.baidu.ar.callback.ICallback
        public void run() {
            ILibLoader.a aVar;
            int[] iArr = this.f3182a;
            int i8 = iArr[1] + 1;
            iArr[1] = i8;
            if (i8 < iArr[0] || (aVar = this.f3183b) == null) {
                return;
            }
            aVar.a(this.f3184c, this.f3185d[0], this.f3186e);
        }
    }

    public RemoteResLoader(DuMixController duMixController, String str) {
        HashMap hashMap = new HashMap();
        this.f3157d = hashMap;
        this.f3156c = str;
        hashMap.clear();
        this.f3158e = new com.baidu.ar.libloader.d();
        this.f3155b = duMixController;
    }

    @Override // com.baidu.ar.libloader.ILibLoader
    public void load(Context context, ILibLoader.b bVar) {
        ILibLoaderPlugin iLibLoaderPlugin = this.f3159f;
        if (iLibLoaderPlugin != null) {
            iLibLoaderPlugin.onBeforeLoad(new a(context, bVar));
        } else {
            a(context, bVar);
        }
    }

    public void loadCaseAndRes(ARType aRType, String str, ILibLoader.a aVar) {
        DuMixController duMixController = this.f3155b;
        if (duMixController == null || duMixController.getContentPlatform() == null) {
            aVar.a(aRType, null, str);
            return;
        }
        ICancellable iCancellable = this.f3160g;
        if (iCancellable != null) {
            iCancellable.cancel();
        }
        int[] iArr = {2, 0};
        String[] strArr = new String[1];
        this.f3160g = this.f3155b.getContentPlatform().downloadCase(str, new f(iArr, strArr, aVar, aRType, str), null);
        this.f3154a.loadARRes(aRType, this.f3155b, new g(this, iArr, aVar, aRType, strArr, str));
    }

    @Override // com.baidu.ar.libloader.ILibLoader
    public void prepareCaseRes(ARType aRType, String str, String str2, ILibLoader.a aVar) {
        if (this.f3155b == null) {
            return;
        }
        if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || aRType == ARType.CLOUD_IR || aRType == ARType.ON_DEVICE_IR) {
            this.f3154a.loadARRes(aRType, this.f3155b, new e(this, aVar, aRType, str, str2));
        } else {
            loadCaseAndRes(aRType, str2, aVar);
        }
    }

    @Override // com.baidu.ar.libloader.ILibLoader
    public void release() {
        this.f3159f = null;
        this.f3160g = null;
        this.f3155b = null;
        DuMixResManager duMixResManager = this.f3154a;
        if (duMixResManager != null) {
            duMixResManager.release();
            this.f3154a = null;
        }
        this.f3157d.clear();
        com.baidu.ar.libloader.d dVar = this.f3158e;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // com.baidu.ar.libloader.ILibLoader
    public void require(String str) {
        h.c("RemoteResLoader", "require libName = " + str);
        if (this.f3157d.containsKey(str) && this.f3157d.get(str).intValue() == 1) {
            return;
        }
        this.f3157d.put(str, 0);
        if (TextUtils.isEmpty(this.f3156c)) {
            return;
        }
        File file = new File(this.f3156c, "lib" + str + ".so");
        if (file.exists()) {
            try {
                System.load(file.getAbsolutePath());
                this.f3157d.put(str, 1);
                a(str);
            } catch (Throwable th) {
                h.a(th.getMessage());
            }
        }
    }

    @Override // com.baidu.ar.libloader.ILibLoader
    public void setLibLoadPlugin(ILibLoaderPlugin iLibLoaderPlugin) {
        this.f3159f = iLibLoaderPlugin;
    }

    @Override // com.baidu.ar.libloader.ILibLoader
    public void setLibReadyListener(String str, ILibLoader.c cVar) {
        if (cVar != null) {
            this.f3158e.a(str, cVar);
            if (this.f3157d.containsKey(str) && this.f3157d.get(str).intValue() == 1) {
                a(str);
            } else {
                cVar.onError();
            }
        }
    }

    public final void a(Context context, ILibLoader.b bVar) {
        if (this.f3154a == null) {
            this.f3154a = new DuMixResManager(context);
        }
        this.f3154a.setErrorCallback(new b(context, bVar));
        this.f3154a.loadMainLib(new c(bVar));
    }

    public final void a(ILibLoader.b bVar) {
        DuMixResManager duMixResManager = this.f3154a;
        if (duMixResManager == null) {
            return;
        }
        duMixResManager.setErrorCallback(null);
        try {
            require("dumixar");
            DuMixController duMixController = this.f3155b;
            if (duMixController != null) {
                this.f3154a.prepareMainRes(duMixController);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            if (bVar != null) {
                bVar.a(DuMixErrorType.LibraryError, new Exception(th.getMessage()));
            }
        }
    }

    public final void a(String str) {
        gd.a(new d(str));
    }
}
