package com.baidu.platform.comapi.bmsdk;

import com.baidu.platform.comapi.util.j;

/* loaded from: classes2.dex */
public abstract class BmObject implements AutoCloseable {
    private static final boolean DEBUG = false;
    private boolean isRelease;
    private String mName;
    protected final int mObjType;
    private String mTag;
    protected final long nativeInstance;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f8909a;

        a(long j8) {
            this.f8909a = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            BmFinalizerObject.a(this.f8909a);
        }
    }

    private BmObject() {
        this.mName = "";
        this.mTag = "";
        this.isRelease = false;
        this.mObjType = 0;
        this.nativeInstance = 0L;
    }

    private synchronized void dispose() {
        long j8 = this.nativeInstance;
        if (j8 != 0 && !this.isRelease) {
            this.isRelease = true;
            j.c().submit(new a(j8));
        }
    }

    private static native void nativeFinalizer(long j8);

    private static native boolean nativeSetLayerTag(long j8, String str);

    private void printDebugFinalize() {
    }

    private void printDebugNew() {
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        try {
            dispose();
        } catch (Throwable unused) {
        }
    }

    public String getName() {
        return this.mName;
    }

    public long getNativeInstance() {
        if (this.isRelease) {
            return 0L;
        }
        return this.nativeInstance;
    }

    public int getObjType() {
        return this.mObjType;
    }

    public String getTag() {
        return this.mTag;
    }

    public boolean setLayerTag(String str) {
        return nativeSetLayerTag(this.nativeInstance, str);
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setTag(String str) {
        this.mTag = str;
    }

    public BmObject(int i8, long j8) {
        this.mName = "";
        this.mTag = "";
        this.isRelease = false;
        this.mObjType = i8;
        this.nativeInstance = j8;
    }
}
