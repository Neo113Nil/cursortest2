package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class vm1 extends CancellationException {
    public final /* synthetic */ int rtx2ld2ELZv4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vm1(String str, int i) {
        super(str);
        this.rtx2ld2ELZv4 = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                setStackTrace(hq0.cpQdD2nAriOS);
                break;
            case 1:
                setStackTrace(b51.dgRBjINgWbAK);
                break;
            default:
                setStackTrace(bs0.QrzZRwfaDlRX);
                break;
        }
        return this;
    }
}
