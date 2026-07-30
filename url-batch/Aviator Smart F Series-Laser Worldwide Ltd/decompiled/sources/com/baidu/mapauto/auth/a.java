package com.baidu.mapauto.auth;

import com.baidu.mapauto.auth.AuthCore;
import com.baidu.mapauto.auth.base.BaseLicenseAuthDataStandardProcess;
import com.baidu.mapauto.auth.util.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ILicenseAuthListener f7723b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AuthCore.AuthParam f7724c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AuthCore f7725d;

    /* renamed from: com.baidu.mapauto.auth.a$a, reason: collision with other inner class name */
    public class RunnableC0066a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f7726a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BaseLicenseAuthDataStandardProcess f7727b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f7728c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f7729d;

        public RunnableC0066a(HashMap hashMap, BaseLicenseAuthDataStandardProcess baseLicenseAuthDataStandardProcess, AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.f7726a = hashMap;
            this.f7727b = baseLicenseAuthDataStandardProcess;
            this.f7728c = atomicReference;
            this.f7729d = countDownLatch;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                try {
                    this.f7726a.putAll(this.f7727b.a(a.this.f7724c.a()));
                } catch (BaseLicenseAuthDataStandardProcess.ProcessException e8) {
                    this.f7728c.set(e8);
                }
            } finally {
                this.f7729d.countDown();
            }
        }
    }

    public a(AuthCore authCore, int i8, AuthCore.b bVar, AuthCore.AuthParam authParam) {
        this.f7725d = authCore;
        this.f7722a = i8;
        this.f7723b = bVar;
        this.f7724c = authParam;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (AuthCore.class) {
            try {
                ArrayList arrayList = new ArrayList(2);
                if ((this.f7722a & 1) == 1) {
                    arrayList.add(this.f7725d.f7707e);
                    LogUtil.getInstance().i(AuthCore.TAG, "添加 license file 授权流程");
                }
                if ((this.f7722a & 2) == 2) {
                    arrayList.add(this.f7725d.f7708f);
                    LogUtil.getInstance().i(AuthCore.TAG, "添加 license function 授权流程");
                }
                if (arrayList.isEmpty()) {
                    this.f7723b.onSuccess(new HashMap(0));
                    return;
                }
                HashMap hashMap = new HashMap();
                CountDownLatch countDownLatch = new CountDownLatch(arrayList.size());
                AtomicReference atomicReference = new AtomicReference();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.f7725d.f7706d.submit(new RunnableC0066a(hashMap, (BaseLicenseAuthDataStandardProcess) it.next(), atomicReference, countDownLatch));
                }
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                    atomicReference.set(new BaseLicenseAuthDataStandardProcess.ProcessException(-1001, "获取数据取消异常"));
                }
                BaseLicenseAuthDataStandardProcess.ProcessException processException = (BaseLicenseAuthDataStandardProcess.ProcessException) atomicReference.get();
                if (processException != null) {
                    this.f7723b.onError(processException.getCode(), processException.getMessage(), processException);
                } else {
                    this.f7723b.onSuccess(hashMap);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
