package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class m61 implements tx {
    public boolean BRwzKIf41E4i;
    public i1 EcgxDIVH5in8;
    public at OPXfSBeufaJ8;
    public pd1 QrzZRwfaDlRX;
    public boolean RfyTYNmI9Srp;
    public boolean S9EYkSpbGuxq;
    public boolean XL4ISE6Oc65B;
    public m61 cpQdD2nAriOS;
    public boolean gPXPFXrUH4XX;
    public ye1 r3s1LDPKFs1S;
    public int wdg6QnbFHrFF;
    public m61 x50lh2ztY7Y5;
    public m61 rtx2ld2ELZv4 = this;
    public int dgRBjINgWbAK = -1;

    public void EP3hG58ROvHh(pd1 pd1Var) {
        this.QrzZRwfaDlRX = pd1Var;
    }

    public final ru GlTbNTgfSMqy() {
        at atVar = this.OPXfSBeufaJ8;
        if (atVar != null) {
            return atVar;
        }
        at Y1f8riQaR6yg = cs0.Y1f8riQaR6yg(((r1) zv.wLFCmsViZrNT(this)).getCoroutineContext().RfyTYNmI9Srp(new zs0((xs0) ((r1) zv.wLFCmsViZrNT(this)).getCoroutineContext().S2OOm9zPNm0h(ih0.BRwzKIf41E4i))));
        this.OPXfSBeufaJ8 = Y1f8riQaR6yg;
        return Y1f8riQaR6yg;
    }

    public void HqMwxkFaipxD() {
        if (this.S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("node attached multiple times");
        }
        if (this.QrzZRwfaDlRX == null) {
            ep0.lS5Rgt96tfkO("attach invoked on a node without a coordinator");
        }
        this.S9EYkSpbGuxq = true;
        this.XL4ISE6Oc65B = true;
    }

    public void KZw9XyiywG4x() {
        if (!this.S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.XL4ISE6Oc65B) {
            ep0.lS5Rgt96tfkO("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.XL4ISE6Oc65B = false;
        OYiFbU3x63rc();
        this.RfyTYNmI9Srp = true;
    }

    public void MBpAROcyNHKN(m61 m61Var) {
        this.rtx2ld2ELZv4 = m61Var;
    }

    public void Y2PHjkwWz56c() {
        if (!this.S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("node detached multiple times");
        }
        if (this.QrzZRwfaDlRX == null) {
            ep0.lS5Rgt96tfkO("detach invoked on a node without a coordinator");
        }
        if (!this.RfyTYNmI9Srp) {
            ep0.lS5Rgt96tfkO("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.RfyTYNmI9Srp = false;
        i1 i1Var = this.EcgxDIVH5in8;
        if (i1Var != null) {
            i1Var.PxuCJdSBwIXG();
        }
        IxJ9cAW40yOk();
    }

    public boolean mFd1aGiJX24N() {
        return !(this instanceof lc);
    }

    public void twy4zb2fCtqq() {
        if (!this.S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("Cannot detach a node that is not attached");
        }
        if (this.XL4ISE6Oc65B) {
            ep0.lS5Rgt96tfkO("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.RfyTYNmI9Srp) {
            ep0.lS5Rgt96tfkO("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.S9EYkSpbGuxq = false;
        at atVar = this.OPXfSBeufaJ8;
        if (atVar != null) {
            cs0.x50lh2ztY7Y5(atVar, new q61("The Modifier.Node was detached", 2));
            this.OPXfSBeufaJ8 = null;
        }
    }

    public void wnqUPcAvl7HT() {
        if (!this.S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("reset() called on an unattached node");
        }
        HGgCfDnf0ga9();
    }

    public void HGgCfDnf0ga9() {
    }

    public void IxJ9cAW40yOk() {
    }

    public void OYiFbU3x63rc() {
    }
}
