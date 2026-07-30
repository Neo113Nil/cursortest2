package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class uk0 extends tk0 {
    public boolean cpQdD2nAriOS;
    public final /* synthetic */ yk0 r3s1LDPKFs1S;
    public long x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk0(yk0 yk0Var, gm0 gm0Var) {
        super(yk0Var, gm0Var);
        gm0Var.getClass();
        this.r3s1LDPKFs1S = yk0Var;
        this.x50lh2ztY7Y5 = -1L;
        this.cpQdD2nAriOS = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bc, code lost:
    
        if (r16.cpQdD2nAriOS == false) goto L46;
     */
    @Override // defpackage.tk0, defpackage.o82
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long RAsUl2FVSrh6(long j, yf yfVar) {
        byte cpQdD2nAriOS;
        yk0 yk0Var = this.r3s1LDPKFs1S;
        m9 m9Var = yk0Var.TSizfFm2Yiuu;
        if (this.wdg6QnbFHrFF) {
            u9.rtx2ld2ELZv4("closed");
            return 0L;
        }
        if (this.cpQdD2nAriOS) {
            long j2 = this.x50lh2ztY7Y5;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    ((es1) m9Var.wdg6QnbFHrFF).e6tOsSdd2EFb(Long.MAX_VALUE);
                }
                try {
                    es1 es1Var = (es1) m9Var.wdg6QnbFHrFF;
                    yf yfVar2 = es1Var.OPXfSBeufaJ8;
                    es1Var.J54yh1s3n4Aq(1L);
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        if (!es1Var.r3s1LDPKFs1S(i2)) {
                            break;
                        }
                        cpQdD2nAriOS = yfVar2.cpQdD2nAriOS(i);
                        if ((cpQdD2nAriOS < 48 || cpQdD2nAriOS > 57) && ((cpQdD2nAriOS < 97 || cpQdD2nAriOS > 102) && (cpQdD2nAriOS < 65 || cpQdD2nAriOS > 70))) {
                            break;
                        }
                        i = i2;
                    }
                    if (i == 0) {
                        ov2.RfyTYNmI9Srp(16);
                        String num = Integer.toString(cpQdD2nAriOS, 16);
                        num.getClass();
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(num));
                    }
                    this.x50lh2ztY7Y5 = yfVar2.S2OOm9zPNm0h();
                    String obj = ia2.GlTbNTgfSMqy(((es1) m9Var.wdg6QnbFHrFF).e6tOsSdd2EFb(Long.MAX_VALUE)).toString();
                    if (this.x50lh2ztY7Y5 < 0 || (obj.length() > 0 && !pa2.yQRudnv4La6p(obj, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.x50lh2ztY7Y5 + obj + '\"');
                    }
                    if (this.x50lh2ztY7Y5 == 0) {
                        this.cpQdD2nAriOS = false;
                        lS5Rgt96tfkO(yk0Var.e9gEMXR7LXtO.Y1f8riQaR6yg());
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long RAsUl2FVSrh6 = super.RAsUl2FVSrh6(Math.min(8192L, this.x50lh2ztY7Y5), yfVar);
            if (RAsUl2FVSrh6 != -1) {
                this.x50lh2ztY7Y5 -= RAsUl2FVSrh6;
                return RAsUl2FVSrh6;
            }
            yk0Var.lS5Rgt96tfkO.rtx2ld2ELZv4();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            lS5Rgt96tfkO(yk0.a92UlCVFR9N8);
            throw protocolException;
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.wdg6QnbFHrFF) {
            return;
        }
        if (this.cpQdD2nAriOS) {
            TimeZone timeZone = mv2.PxuCJdSBwIXG;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = mv2.a92UlCVFR9N8(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.r3s1LDPKFs1S.lS5Rgt96tfkO.rtx2ld2ELZv4();
                lS5Rgt96tfkO(yk0.a92UlCVFR9N8);
            }
        }
        this.wdg6QnbFHrFF = true;
    }
}
