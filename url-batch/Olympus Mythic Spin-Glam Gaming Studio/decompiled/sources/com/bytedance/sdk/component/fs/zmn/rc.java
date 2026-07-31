package com.bytedance.sdk.component.fs.zmn;

import com.bytedance.sdk.component.nps.zmn;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public abstract class rc implements Cloneable {
    public TimeUnit btk;
    public long fb;
    public long fs;
    public long hhw;
    public TimeUnit nps;
    public final zmn.fs zg;
    public List<zg> zmn;
    public TimeUnit zn;

    public abstract fb fs();

    public abstract fs zmn(klz klzVar);

    public rc(zmn zmnVar) {
        this.fs = zmnVar.zn;
        this.fb = zmnVar.btk;
        this.hhw = zmnVar.nps;
        List<zg> list = zmnVar.zmn;
        this.zn = zmnVar.fb;
        this.btk = zmnVar.hhw;
        this.nps = zmnVar.zg;
        this.zmn = list;
        this.zg = zmnVar.fs;
    }

    public zmn.fs zmn() {
        return this.zg;
    }

    public static final class zmn {
        public long btk;
        public TimeUnit fb;
        zmn.fs fs;
        public TimeUnit hhw;
        public long nps;
        public TimeUnit zg;
        public final List<zg> zmn;
        public long zn;

        public zmn() {
            this.zmn = new ArrayList();
            this.zn = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.fb = timeUnit;
            this.btk = 10000L;
            this.hhw = timeUnit;
            this.nps = 10000L;
            this.zg = timeUnit;
        }

        public zmn(String str) {
            this.zmn = new ArrayList();
            this.zn = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.fb = timeUnit;
            this.btk = 10000L;
            this.hhw = timeUnit;
            this.nps = 10000L;
            this.zg = timeUnit;
        }

        public zmn(rc rcVar) {
            this.zmn = new ArrayList();
            this.zn = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.fb = timeUnit;
            this.btk = 10000L;
            this.hhw = timeUnit;
            this.nps = 10000L;
            this.zg = timeUnit;
            this.zn = rcVar.fs;
            this.fb = rcVar.zn;
            this.btk = rcVar.fb;
            this.hhw = rcVar.btk;
            this.nps = rcVar.hhw;
            this.zg = rcVar.nps;
        }

        public zmn zmn(long j, TimeUnit timeUnit) {
            this.zn = j;
            this.fb = timeUnit;
            return this;
        }

        public zmn fs(long j, TimeUnit timeUnit) {
            this.btk = j;
            this.hhw = timeUnit;
            return this;
        }

        public zmn zn(long j, TimeUnit timeUnit) {
            this.nps = j;
            this.zg = timeUnit;
            return this;
        }

        public zmn zmn(zg zgVar) {
            this.zmn.add(zgVar);
            return this;
        }

        public zmn zmn(zmn.fs fsVar) {
            this.fs = fsVar;
            return this;
        }

        public rc zmn() {
            return com.bytedance.sdk.component.fs.zmn.zmn.zmn.zmn(this);
        }
    }

    public zmn zn() {
        return new zmn(this);
    }
}
