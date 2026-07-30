package com.baidu.platform.comapi.longlink;

import com.baidu.platform.comapi.exception.ComInitException;
import com.baidu.platform.comapi.exception.InvalidComException;
import com.baidu.platform.comjni.base.longlink.NALongLink;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class LongLinkClient {

    /* renamed from: a, reason: collision with root package name */
    private int f9359a;

    /* renamed from: b, reason: collision with root package name */
    private long f9360b;

    /* renamed from: c, reason: collision with root package name */
    private int f9361c;

    private LongLinkClient(long j8, int i8) {
        this.f9360b = j8;
        this.f9359a = i8;
    }

    public static LongLinkClient create() {
        long create = NALongLink.create();
        if (create != 0) {
            return new LongLinkClient(create);
        }
        throw new ComInitException("LongLink Component created failed!");
    }

    public synchronized int getRequestId() {
        return this.f9361c;
    }

    public boolean init(String str, String str2) {
        if (isValid()) {
            return NALongLink.init(this.f9360b, str, str2);
        }
        throw new InvalidComException();
    }

    public boolean isValid() {
        return this.f9360b != 0;
    }

    public synchronized boolean register(LongLinkDataCallback longLinkDataCallback) {
        if (!isValid()) {
            throw new InvalidComException();
        }
        return NALongLink.register(this.f9360b, this.f9359a, longLinkDataCallback);
    }

    public int release() {
        if (!isValid() || NALongLink.release(this.f9360b) > 0) {
            return -1;
        }
        this.f9360b = 0L;
        return -1;
    }

    public synchronized ELongLinkStatus sendData(byte[] bArr) {
        ELongLinkStatus eLongLinkStatus;
        if (!isValid()) {
            throw new InvalidComException();
        }
        this.f9361c++;
        eLongLinkStatus = ELongLinkStatus.values()[NALongLink.sendData(this.f9360b, this.f9359a, this.f9361c, bArr)];
        eLongLinkStatus.setRequestId(this.f9361c);
        return eLongLinkStatus;
    }

    public synchronized ELongLinkStatus sendFileData(String str, ArrayList<LongLinkFileData> arrayList) {
        ELongLinkStatus eLongLinkStatus;
        if (!isValid()) {
            throw new InvalidComException();
        }
        this.f9361c++;
        eLongLinkStatus = ELongLinkStatus.values()[NALongLink.sendFileData(this.f9360b, this.f9359a, this.f9361c, str, arrayList)];
        eLongLinkStatus.setRequestId(this.f9361c);
        return eLongLinkStatus;
    }

    public void setModuleId(int i8) {
        this.f9359a = i8;
    }

    public boolean start() {
        if (isValid()) {
            return NALongLink.start(this.f9360b);
        }
        throw new InvalidComException();
    }

    public void stop() {
        if (!isValid()) {
            throw new InvalidComException();
        }
        NALongLink.stop(this.f9360b);
    }

    public synchronized boolean unRegister(LongLinkDataCallback longLinkDataCallback) {
        if (!isValid()) {
            throw new InvalidComException();
        }
        return NALongLink.unRegister(this.f9360b, this.f9359a, longLinkDataCallback);
    }

    private LongLinkClient(long j8) {
        this.f9360b = j8;
    }

    public static LongLinkClient create(int i8) {
        long create = NALongLink.create();
        if (create != 0) {
            return new LongLinkClient(create, i8);
        }
        throw new ComInitException("LongLink Component created failed!");
    }
}
