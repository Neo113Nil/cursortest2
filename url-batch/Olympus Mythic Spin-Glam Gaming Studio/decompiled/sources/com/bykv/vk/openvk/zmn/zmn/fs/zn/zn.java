package com.bykv.vk.openvk.zmn.zmn.fs.zn;

import android.media.PlaybackParams;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.FileDescriptor;

/* loaded from: classes10.dex */
public interface zn {

    public interface btk {
        void fs(zn znVar);
    }

    public interface fb {
        boolean fs(zn znVar, int i, int i2);
    }

    public interface fs {
        void zmn(zn znVar);
    }

    public interface hhw {
        void zn(zn znVar);
    }

    public interface nps {
        void zmn(zn znVar, int i, int i2, int i3, int i4);
    }

    public interface zmn {
        void zmn(zn znVar, int i);
    }

    /* renamed from: com.bykv.vk.openvk.zmn.zmn.fs.zn.zn$zn, reason: collision with other inner class name */
    public interface InterfaceC0100zn {
        boolean zmn(zn znVar, int i, int i2);
    }

    PlaybackParams btk();

    void bvs();

    int cn();

    void fb(boolean z) throws Throwable;

    void fs(boolean z) throws Throwable;

    void hhw() throws Throwable;

    long iv() throws Throwable;

    void klz() throws Throwable;

    void mw() throws Throwable;

    void nps() throws Throwable;

    long rc() throws Throwable;

    int rt();

    void zg() throws Throwable;

    void zmn(long j, int i) throws Throwable;

    void zmn(Surface surface) throws Throwable;

    void zmn(SurfaceHolder surfaceHolder) throws Throwable;

    void zmn(btk btkVar);

    void zmn(fb fbVar);

    void zmn(fs fsVar);

    void zmn(hhw hhwVar);

    void zmn(nps npsVar);

    void zmn(zmn zmnVar);

    void zmn(InterfaceC0100zn interfaceC0100zn);

    void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.fs fsVar) throws Throwable;

    void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar);

    void zmn(FileDescriptor fileDescriptor) throws Throwable;

    void zmn(String str) throws Throwable;

    void zmn(boolean z);

    void zn(boolean z) throws Throwable;
}
