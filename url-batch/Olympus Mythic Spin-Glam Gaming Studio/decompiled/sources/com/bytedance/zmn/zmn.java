package com.bytedance.zmn;

/* loaded from: classes9.dex */
public abstract class zmn<D> {
    private D btk;
    private int fb;
    private final String fs;
    private int hhw;
    private final long zmn = System.currentTimeMillis();
    private InterfaceC0212zmn<D> zn;

    /* renamed from: com.bytedance.zmn.zmn$zmn, reason: collision with other inner class name */
    public interface InterfaceC0212zmn<T> {
        T zmn();
    }

    public abstract byte[] fb();

    public abstract int nps();

    public zmn(String str, InterfaceC0212zmn<D> interfaceC0212zmn) {
        this.fs = str;
        this.zn = interfaceC0212zmn;
    }

    public zmn(String str, D d) {
        this.fs = str;
        this.btk = d;
    }

    public long zmn() {
        return this.zmn;
    }

    public int fs() {
        return this.fb;
    }

    public void zmn(int i) {
        this.fb = i;
    }

    public D zn() {
        InterfaceC0212zmn<D> interfaceC0212zmn;
        if (this.btk == null && (interfaceC0212zmn = this.zn) != null) {
            this.btk = interfaceC0212zmn.zmn();
        }
        return this.btk;
    }

    public int btk() {
        return this.hhw;
    }

    public void fs(int i) {
        this.hhw = i;
    }

    public String toString() {
        if (!com.bytedance.zmn.zmn.fb.zmn) {
            return super.toString();
        }
        return "AppEvent{, createTime=" + this.zmn + ", id=" + this.fs + ", uploadRetryCount=" + this.hhw + '}';
    }

    public String hhw() {
        return this.fs;
    }
}
