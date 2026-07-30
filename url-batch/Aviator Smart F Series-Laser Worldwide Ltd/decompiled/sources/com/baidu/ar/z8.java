package com.baidu.ar;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class z8 {

    /* renamed from: d, reason: collision with root package name */
    public static final String f3809d = "z8";

    /* renamed from: a, reason: collision with root package name */
    public MediaMuxer f3810a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f3811b = false;

    /* renamed from: c, reason: collision with root package name */
    public d9 f3812c;

    public synchronized int a(MediaFormat mediaFormat) {
        try {
            int addTrack = this.f3810a.addTrack(mediaFormat);
            if (addTrack >= 0) {
                return addTrack;
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        h.b(f3809d, "addMuxerTrack error!!!");
        return -1;
    }

    public void b() {
        if (this.f3811b) {
            return;
        }
        this.f3810a.release();
        this.f3810a = null;
    }

    public synchronized void c() {
        boolean z7;
        try {
            this.f3810a.start();
            z7 = true;
            this.f3811b = true;
        } catch (Exception unused) {
            h.b(f3809d, "startMuxer error!!!");
            z7 = false;
        }
        d9 d9Var = this.f3812c;
        if (d9Var != null) {
            d9Var.a(z7);
        }
    }

    public synchronized void d() {
        boolean z7 = false;
        try {
            this.f3810a.stop();
            this.f3811b = false;
            z7 = true;
        } catch (Exception unused) {
            h.b(f3809d, "stopMuxer error!!!");
        }
        d9 d9Var = this.f3812c;
        if (d9Var != null) {
            d9Var.b(z7);
        }
    }

    public boolean a() {
        return this.f3811b;
    }

    public boolean a(int i8, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (i8 == -1) {
            return false;
        }
        try {
            this.f3810a.writeSampleData(i8, byteBuffer, bufferInfo);
            return true;
        } catch (Exception unused) {
            h.b(f3809d, "startMuxer error!!!");
            return false;
        }
    }

    public boolean a(String str, int i8, d9 d9Var) {
        if (!i4.a(str)) {
            i4.b(str);
        }
        try {
            this.f3810a = new MediaMuxer(str, i8);
            this.f3812c = d9Var;
            this.f3811b = false;
            return true;
        } catch (Exception e8) {
            h.b(f3809d, "initMovieMuxer init error!!!");
            e8.printStackTrace();
            return false;
        }
    }
}
