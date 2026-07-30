package com.realsil.sdk.dfu.batch;

import android.content.Context;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.RtkDfu;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.DfuProgressInfo;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class BatchDfuManager {

    /* renamed from: f, reason: collision with root package name */
    public static volatile BatchDfuManager f15699f;

    /* renamed from: a, reason: collision with root package name */
    public boolean f15700a = RtkDfu.DEBUG_ENABLE;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15701b = RtkDfu.VDBG;

    /* renamed from: c, reason: collision with root package name */
    public final Context f15702c;

    /* renamed from: d, reason: collision with root package name */
    public BatchDfuCallback f15703d;

    /* renamed from: e, reason: collision with root package name */
    public List f15704e;

    public class a extends DfuThreadCallback {

        /* renamed from: a, reason: collision with root package name */
        public String f15705a;

        public a(String str) {
            this.f15705a = str;
        }

        @Override // com.realsil.sdk.dfu.internal.base.DfuThreadCallback
        public void onError(int i8) {
            super.onError(i8);
            if (BatchDfuManager.this.f15703d != null) {
                BatchDfuManager.this.f15703d.onError(this.f15705a, i8);
            }
        }

        @Override // com.realsil.sdk.dfu.internal.base.DfuThreadCallback
        public void onProgressChanged(DfuProgressInfo dfuProgressInfo) {
            super.onProgressChanged(dfuProgressInfo);
            if (BatchDfuManager.this.f15703d != null) {
                BatchDfuManager.this.f15703d.onProgressChanged(this.f15705a, dfuProgressInfo);
            }
        }

        @Override // com.realsil.sdk.dfu.internal.base.DfuThreadCallback
        public void onStateChanged(int i8) {
            super.onStateChanged(i8);
            if (BatchDfuManager.this.f15703d != null) {
                BatchDfuManager.this.f15703d.onStateChanged(this.f15705a, i8);
            }
        }
    }

    public BatchDfuManager(Context context) {
        this.f15702c = context;
    }

    public static BatchDfuManager getInstance(Context context) {
        if (f15699f == null) {
            synchronized (BatchDfuManager.class) {
                try {
                    if (f15699f == null) {
                        f15699f = new BatchDfuManager(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f15699f;
    }

    public boolean abort() {
        List list = this.f15704e;
        if (list == null || list.size() <= 0) {
            return false;
        }
        Iterator it = this.f15704e.iterator();
        while (it.hasNext()) {
            ((com.realsil.sdk.dfu.b.a) it.next()).a();
        }
        return true;
    }

    public void checkVersion() {
        List list = this.f15704e;
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator it = this.f15704e.iterator();
        while (it.hasNext()) {
            ((com.realsil.sdk.dfu.b.a) it.next()).b();
        }
    }

    public boolean destroy() {
        List list = this.f15704e;
        if (list == null || list.size() <= 0) {
            return false;
        }
        for (com.realsil.sdk.dfu.b.a aVar : this.f15704e) {
            aVar.a();
            aVar.c();
        }
        return true;
    }

    public boolean init(List<DfuConfig> list, BatchDfuCallback batchDfuCallback) {
        if (list == null || list.size() <= 0) {
            ZLogger.w("dfuConfigs cannot be null or empty");
            return false;
        }
        this.f15703d = batchDfuCallback;
        List list2 = this.f15704e;
        if (list2 == null) {
            this.f15704e = new CopyOnWriteArrayList();
        } else {
            list2.clear();
        }
        for (DfuConfig dfuConfig : list) {
            this.f15704e.add(new com.realsil.sdk.dfu.b.a(this.f15702c, dfuConfig, new a(dfuConfig.getAddress())));
        }
        return true;
    }

    public boolean start() {
        List list = this.f15704e;
        if (list == null || list.size() <= 0) {
            return false;
        }
        Iterator it = this.f15704e.iterator();
        while (it.hasNext()) {
            ((com.realsil.sdk.dfu.b.a) it.next()).d();
        }
        return true;
    }
}
